package com.sdds.plugin.themebuilder

import com.android.build.gradle.BaseExtension
import com.google.gson.Gson
import com.sdds.plugin.themebuilder.DsBuilderExtension.Companion.dsBuilderExt
import com.sdds.plugin.themebuilder.documentation.DocumentationAggregateTask
import com.sdds.plugin.themebuilder.documentation.ExtractCodeSnippetsTask
import com.sdds.plugin.themebuilder.sandbox.Config
import com.sdds.plugin.themebuilder.sandbox.GenerateSandboxAdaptersTask
import com.sdds.plugin.themebuilder.sandbox.SandboxTarget
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.attributes.Attribute
import org.gradle.api.attributes.Category
import org.gradle.api.attributes.Usage
import org.gradle.api.file.Directory
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.register
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

/**
 * Entry point for theme, component, documentation and sandbox generation.
 *
 * Capabilities are enabled independently by configuring their corresponding
 * blocks in the [DsBuilderExtension].
 */
class DsBuilderPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val extension = project.dsBuilderExt()
        ThemeBuilderPlugin().configure(
            project = project,
            themeExtension = {
                extension.theme
                    .takeIf { it.enabled.get() }
                    ?.toLegacyExtension(extension)
            },
            componentsExtension = {
                extension.components
                    .takeIf { it.enabled.get() }
                    ?.toLegacyExtension()
            },
        )
        project.configureDocumentation(extension)
        project.configureSandbox(extension)
    }
}

private fun Project.configureSandbox(extension: DsBuilderExtension) {
    afterEvaluate {
        val sandbox = extension.sandbox.takeIf { it.enabled.get() } ?: return@afterEvaluate
        sandbox.compose?.let { platform ->
            configureSandboxConventions(extension, platform)
            val output = sandboxOutputDirectory(sandbox.outputLocation.get(), platform.multiplatform.get())
            val task = registerSandboxTask(
                name = "generateComposeSandbox",
                platform = platform,
                target = SandboxTarget.COMPOSE,
                output = output,
                multiplatform = platform.multiplatform.get(),
            )
            attachToPreBuild(task, sandbox.autoGenerate.get())
            if (platform.multiplatform.get()) {
                extensions.findByType<KotlinMultiplatformExtension>()
                    ?.sourceSets
                    ?.findByName("commonMain")
                    ?.kotlin
                    ?.srcDir(task.flatMap { it.outputDirectory })
            }
        }
        sandbox.view?.let { platform ->
            configureSandboxConventions(extension, platform)
            val output = sandboxOutputDirectory(sandbox.outputLocation.get(), multiplatform = false)
            val task = registerSandboxTask(
                name = "generateViewSandbox",
                platform = platform,
                target = SandboxTarget.XML,
                output = output,
                multiplatform = false,
            )
            attachToPreBuild(task, sandbox.autoGenerate.get())
        }
    }
}

private fun Project.sandboxOutputDirectory(
    outputLocation: OutputLocation,
    multiplatform: Boolean,
): Provider<Directory> = when (outputLocation) {
    OutputLocation.BUILD -> layout.buildDirectory.dir("generated/sdds/sandbox")
    OutputLocation.SRC -> layout.dir(
        providers.provider {
            layout.projectDirectory.dir(
                if (multiplatform) "src/commonMain/kotlin" else "src/main/kotlin",
            ).asFile
        },
    )
}

private fun Project.configureSandboxConventions(
    extension: DsBuilderExtension,
    platform: SandboxPlatform,
) {
    platform.generatedPackageName.convention(
        providers.provider {
            extensions.findByType<BaseExtension>()?.namespace?.takeIf(String::isNotBlank)
                ?: Gson().fromJson(
                    platform.componentsInfoFile.get().asFile.readText(),
                    Config::class.java,
                ).packageName + ".sandbox"
        },
    )
    platform.themeAlias.convention(
        providers.provider {
            val sdds = extension.sddsDirectory.get().asFile
            SddsThemeSourceReader(sdds.parentFile, sdds).read().baseAlias
        },
    )
}

private fun Project.registerSandboxTask(
    name: String,
    platform: SandboxPlatform,
    target: SandboxTarget,
    output: org.gradle.api.provider.Provider<org.gradle.api.file.Directory>,
    multiplatform: Boolean,
) = tasks.register<GenerateSandboxAdaptersTask>(name) {
    configInputFile.set(platform.componentsInfoFile)
    packageName.set(platform.generatedPackageName)
    themeAlias.set(platform.themeAlias)
    scheme.set(platform.scheme)
    this.target.set(target)
    this.multiplatform.set(multiplatform)
    outputDirectory.set(output)
}.also { task ->
    if (!multiplatform) {
        extensions.findByType<BaseExtension>()
            ?.sourceSets
            ?.maybeCreate("main")
            ?.java
            ?.srcDir(task.flatMap { it.outputDirectory })
    }
}

private fun Project.configureDocumentation(extension: DsBuilderExtension) {
    val coreSnippets = configurations.create("sddsCoreDocumentation") {
        isCanBeConsumed = false
        isCanBeResolved = true
        description = "Versioned Core documentation artifacts used by DS Builder"
        attributes {
            attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, Usage.JAVA_RUNTIME))
            attribute(
                Category.CATEGORY_ATTRIBUTE,
                objects.named(Category::class.java, Category.DOCUMENTATION),
            )
            attribute(Attribute.of("com.sdds.docs.variant", String::class.java), "templates")
        }
    }
    val compiler = configurations.create("sddsDocumentationKotlinCompiler") {
        isCanBeConsumed = false
        isCanBeResolved = true
        description = "Isolated Kotlin compiler used to extract documentation examples"
    }
    dependencies.add(
        compiler.name,
        dependencies.create("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.1.10"),
    )

    afterEvaluate {
        val documentation = extension.documentation.takeIf { it.enabled.get() } ?: return@afterEvaluate
        val platform = documentation.compose ?: documentation.view ?: return@afterEvaluate
        val workDirectory = layout.buildDirectory.dir("sdds/documentation")
        val extract = tasks.register<ExtractCodeSnippetsTask>("documentationExtract") {
            group = "documentation"
            description = "Extracts Kotlin and XML documentation examples"
            kotlinCompiler.from(compiler)
            xmlNamespace.set(extensions.findByType<BaseExtension>()?.namespace.orEmpty())
            outputKotlinDir.set(workDirectory.map { it.dir("kotlin") })
            outputXmlDir.set(workDirectory.map { it.dir("xml") })
            outputMeta.set(workDirectory.map { it.file("samples.json") })
        }
        val aggregate = tasks.register<DocumentationAggregateTask>("documentationAggregate") {
            group = "documentation"
            description = "Creates ADR-0003 Android documentation enrichment"
            coreArtifacts.from(coreSnippets)
            kotlinSnippets.set(extract.flatMap { it.outputKotlinDir })
            xmlSnippets.set(extract.flatMap { it.outputXmlDir })
            samplesMetadata.set(extract.flatMap { it.outputMeta })
            componentsInfoFile.set(platform.componentsInfoFile)
            themeInfoFile.set(platform.themeInfoFile)
            screenshotsDirectory.set(
                layout.projectDirectory.dir("override-docs/static/screenshots-docusaurus"),
            )
            userDocumentationRoot.set(documentation.userDocumentationRoot)
            outputDirectory.set(documentation.outputDirectory)
            dependsOn(extract)
        }
        attachToPreBuild(aggregate, documentation.autoGenerate.get())
    }
}

private fun ThemeCapability.toLegacyExtension(root: DsBuilderExtension): ThemeBuilderExtension =
    ThemeBuilderExtension().also { legacy ->
        copyGenerationOptionsTo(legacy)
        val resolvedSources = sources.orNull
            ?: root.sddsDirectory.get().asFile.let { sddsDirectory ->
                SddsThemeSourceReader(sddsDirectory.parentFile, sddsDirectory).read()
            }
        legacy.setThemeSources(resolvedSources)
        legacy.paletteUrl = paletteUrl.get()
        legacy.mode = mode.get()
        legacy.autoGenerate = autoGenerate.get()
        legacy.defaultThemeTypography = defaultTypography.get()
        legacy.ignoreDisabledTokens = ignoreDisabledTokens.get()
        legacy.useDefaultFonts = useDefaultFonts.get()
    }

private fun ComponentsCapability.toLegacyExtension(): ThemeBuilderExtension =
    ThemeBuilderExtension().also { legacy ->
        copyGenerationOptionsTo(legacy)
        legacy.componentSource = source.orNull
        legacy.componentsMetaStyleClass = componentsMetaStyleClass.get()
        legacy.autoGenerate = autoGenerate.get()
    }

private fun GenerationCapability.copyGenerationOptionsTo(legacy: ThemeBuilderExtension) {
    legacy.target = target()
    legacy.ktPackage = packageName.orNull
    legacy.resourcesPrefix = resourcesPrefix.orNull
    legacy.viewThemeParents = viewThemeParents.get()
    legacy.viewShapeAppearanceConfig = viewShapeAppearance.get()
    legacy.outputLocation = outputLocation.get()
    legacy.dimensionsConfig = dimensions.get()
    legacy.multiplatform = multiplatform.get()
}

private fun Project.attachToPreBuild(task: TaskProvider<*>, enabled: Boolean) {
    if (!enabled) return
    tasks.matching { it.name == "preBuild" }.configureEach {
        dependsOn(task)
    }
}
