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
import org.gradle.kotlin.dsl.newInstance
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
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
                    ?.toLegacyExtension(extension)
            },
        )
        project.configureDocumentation(extension)
        project.configureSandbox(extension)
    }
}

private fun Project.configureSandbox(extension: DsBuilderExtension) {
    afterEvaluate {
        val sandbox = extension.sandbox.takeIf { it.enabled.get() } ?: return@afterEvaluate
        val targets = extension.targets.get()
        if (DsBuilderPlatform.COMPOSE in targets) {
            sandbox.compose?.let { platform ->
                configureSandboxConventions(extension, platform)
                val output = sandboxOutputDirectory(sandbox.outputLocation.get(), platform.multiplatform.get())
                val task = registerSandboxTask(
                    name = "generateComposeSandbox",
                    platform = platform,
                    target = SandboxTarget.COMPOSE,
                    output = output,
                    multiplatform = platform.multiplatform.get(),
                    autoGenerate = sandbox.autoGenerate.get(),
                )
                attachToPreBuild(task, sandbox.autoGenerate.get())
                if (platform.multiplatform.get()) {
                    extensions.findByType<KotlinMultiplatformExtension>()
                        ?.sourceSets
                        ?.findByName("commonMain")
                        ?.kotlin
                        ?.srcDir(
                            if (sandbox.autoGenerate.get()) task.flatMap { it.outputDirectory } else output,
                        )
                }
            }
        }
        if (DsBuilderPlatform.VIEW in targets) {
            sandbox.view?.let { platform ->
                configureSandboxConventions(extension, platform)
                val output = sandboxOutputDirectory(sandbox.outputLocation.get(), multiplatform = false)
                val task = registerSandboxTask(
                    name = "generateViewSandbox",
                    platform = platform,
                    target = SandboxTarget.XML,
                    output = output,
                    multiplatform = false,
                    autoGenerate = sandbox.autoGenerate.get(),
                )
                attachToPreBuild(task, sandbox.autoGenerate.get())
            }
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
                ?: (
                    Gson().fromJson(
                        platform.componentsInfoFile.get().asFile.readText(),
                        Config::class.java,
                    ).packageName + ".sandbox"
                    )
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
    autoGenerate: Boolean,
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
            ?.srcDir(if (autoGenerate) task.flatMap { it.outputDirectory } else output)
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
        val targets = extension.targets.get()

        // Compose идёт первым нарочно: `documentationAggregate` сохраняет старый приоритет
        // (Compose, если сконфигурированы обе платформы) — этот список одновременно и определяет
        // его выбор, и перечисляет, какие пер-платформенные таски вообще регистрировать.
        val resolvedPlatforms = buildList {
            if (DsBuilderPlatform.COMPOSE in targets) {
                val platform = resolveDocumentationPlatform(extension, documentation.compose, DsBuilderPlatform.COMPOSE)
                add(DsBuilderPlatform.COMPOSE to platform)
            }
            if (DsBuilderPlatform.VIEW in targets) {
                val platform = resolveDocumentationPlatform(extension, documentation.view, DsBuilderPlatform.VIEW)
                add(DsBuilderPlatform.VIEW to platform)
            }
        }
        if (resolvedPlatforms.isEmpty()) return@afterEvaluate

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
        // `kotlinSources` (см. ExtractCodeSnippetsTask.init) читает src/main/kotlin и
        // src/main/theme-builder-res напрямую через project.file(...), без provenance от
        // задачи, которая их пишет — Gradle не может вывести порядок сам и с включённым
        // configuration cache падает валидацией "implicit dependency" вместо предупреждения.
        // tasks.withType — ленивая коллекция: безопасна, даже если capability выключена и
        // задачи вовсе не зарегистрированы, и не требует конфигурировать `extract` изнутри
        // колбэка другой задачи (это запрещено в контексте создания графа задач).
        extract.configure {
            mustRunAfter(tasks.withType<GenerateThemeTask>())
            mustRunAfter(tasks.withType<GenerateComponentsTask>())
        }

        fun registerAggregate(taskName: String, platform: DocumentationPlatform) =
            tasks.register<DocumentationAggregateTask>(taskName) {
                group = "documentation"
                description = "Creates ADR-0003 Android documentation enrichment"
                coreArtifacts.from(coreSnippets)
                kotlinSnippets.set(extract.flatMap { it.outputKotlinDir })
                xmlSnippets.set(extract.flatMap { it.outputXmlDir })
                samplesMetadata.set(extract.flatMap { it.outputMeta })
                componentsInfoFile.set(platform.componentsInfoFile)
                themeInfoFile.set(platform.themeInfoFile)
                // Обе директории объявлены `@Optional @InputDirectory`, и aggregate() уже
                // трактует их отсутствие как «нет override-докёв» (`.orNull`). Но Gradle
                // валидирует существование ЛЮБОГО заданного значения `@InputDirectory`,
                // даже optional-свойства, — поэтому нельзя просто `.set()` путь по
                // конвенции: если override-docs/ реально нет (обычный случай для проекта
                // без кастомной документации), сборка падает. Задаём значение только когда
                // директория действительно на диске, иначе оставляем свойство неустановленным.
                screenshotsDirectory.set(
                    layout.projectDirectory.dir("override-docs/static/screenshots-docusaurus")
                        .takeIf { it.asFile.isDirectory },
                )
                userDocumentationRoot.set(documentation.userDocumentationRoot.orNull?.takeIf { it.asFile.isDirectory })
                outputDirectory.set(documentation.outputDirectory)
                dependsOn(extract)
            }

        // Существующая таска: то же имя, то же поведение (Compose > View, если обе сконфигурированы) —
        // preBuild/autoGenerate продолжают ссылаться именно на неё.
        val aggregate = registerAggregate("documentationAggregate", resolvedPlatforms.first().second)
        attachToPreBuild(aggregate, documentation.autoGenerate.get())

        // Пер-платформенные таски — для внешнего вызывающего (CLI platform-delegate), который просит
        // агрегацию конкретной платформы и должен получить понятную ошибку "task not found", если
        // модуль её не конфигурировал, а не агрегацию не той платформы молча. Не участвуют в preBuild.
        resolvedPlatforms.forEach { (target, platform) ->
            val suffix = if (target == DsBuilderPlatform.COMPOSE) "Compose" else "View"
            registerAggregate("aggregate${suffix}Documentation", platform)
        }
    }
}

private fun Project.resolveDocumentationPlatform(
    extension: DsBuilderExtension,
    explicit: DocumentationPlatform?,
    platform: DsBuilderPlatform,
): DocumentationPlatform = explicit ?: objects.newInstance<DocumentationPlatform>().also {
    it.componentsInfoFile.convention(extension.sddsDirectory.file(platform.componentsInfoName))
    it.themeInfoFile.convention(extension.sddsDirectory.file(platform.themeInfoName))
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

private fun ComponentsCapability.toLegacyExtension(root: DsBuilderExtension): ThemeBuilderExtension =
    ThemeBuilderExtension().also { legacy ->
        copyGenerationOptionsTo(legacy)
        legacy.componentSource = source.orNull
            ?: root.sddsDirectory.get().asFile.let { sddsDirectory ->
                // Тема и компоненты должны ссылаться на один и тот же themeName, иначе
                // сгенерированные стили компонентов не находят объект темы (компилятор
                // не резолвит `<themeName>Theme`). Источник истины для имени — тот же,
                // что использует тема: .sdds/config.json (publicName первого tenant).
                // Если конфиг темы недоступен или не читается, откатываемся к прежнему
                // поведению — имени из .sdds/components/meta.json, — чтобы не ломать
                // проекты, использующие только components без theme.
                val configThemeName = runCatching {
                    SddsThemeSourceReader(sddsDirectory.parentFile, sddsDirectory).read().baseAlias
                }.getOrNull()?.takeIf { it.isNotBlank() }
                SddsComponentsSourceReader(sddsDirectory).read(themeNameOverride = configThemeName)
            }
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
