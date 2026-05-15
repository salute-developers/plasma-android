package com.sdds.plugin.themebuilder

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import com.android.build.gradle.internal.tasks.factory.dependsOn
import com.sdds.plugin.themebuilder.ThemeBuilderExtension.Companion.themeBuilderExt
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.attributes.Attribute
import org.gradle.api.file.Directory
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import java.io.File

/**
 * Плагин для генерации тем и токенов ДС
 * @author Малышев Александр on 09.02.2024
 */
class ThemeBuilderPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val componentsZip = project.layout.buildDirectory.file("$COMPONENTS_PATH/components.zip")
        val paletteJson = project.layout.buildDirectory.file("$THEME_PATH/$PALETTE_JSON_NAME")
        val extension = project.themeBuilderExt()
        project.configureSourceSets()

        val readUikitApiMetaTask = project.registerApiMetaTask()

        project.afterEvaluate {
            val compileClasspath = listOf(
                "debugCompileClasspath",
                "releaseCompileClasspath",
                "compileClasspath",
            ).firstNotNullOfOrNull { project.configurations.findByName(it) } ?: return@afterEvaluate
            readUikitApiMetaTask.configureUikitApiMetaTask(compileClasspath)

            project.registerClean(extension)
            val themeSources = extension.getThemeSources()

            val fetchPaletteTask = registerPaletteFetcher(
                taskName = "fetchPalette",
                paletteUrl = extension.paletteUrl,
                paletteOutput = paletteJson,
            )

            val unzipTasks = mutableListOf<TaskProvider<Copy>>()
            themeSources.sources.forEach { source ->
                val tenantId = source.tenant
                val tenantIdForPath = if (tenantId.isEmpty()) "default" else tenantId.lowercase()
                val themeZip = project.layout.buildDirectory.file("$THEME_PATH/$tenantIdForPath/theme.zip")

                val unzipThemeTask = registerFetchAndUnzipTheme(
                    source = source,
                    themeOutputZip = themeZip,
                    themeId = tenantId,
                    fetchPaletteTask = fetchPaletteTask,
                )
                unzipTasks.add(unzipThemeTask)
            }

            registerThemeBuilder(
                extension = extension,
                unzipThemeTasks = unzipTasks,
                dependOnPreBuild = extension.autoGenerate,
                themeSources = themeSources,
            )

            val fetchComponentsTask = registerFetchAndUnzipComponents(extension, componentsZip)
            fetchComponentsTask?.let { registerGenerateComponentsTask(extension, it) }
        }
    }

    private fun Project.registerApiMetaTask() = tasks.register(
        "readUikitApiMeta",
        UikitApiMetaTask::class.java,
    ) {
        group = TASK_GROUP
    }

    private fun TaskProvider<UikitApiMetaTask>.configureUikitApiMetaTask(compileClasspath: Configuration) {
        configure {
            metaClasspath.from(
                compileClasspath.incoming.artifactView {
                    attributes {
                        attribute(
                            Attribute.of("artifactType", String::class.java),
                            "jar",
                        )
                    }
                    isLenient = true
                }.files,
            )
        }
    }

    private fun Project.registerClean(extension: ThemeBuilderExtension): TaskProvider<CleanThemeTask> {
        return project.tasks.register<CleanThemeTask>("cleanTheme") {
            group = TASK_GROUP
            outputDirPath.set(extension.outputLocation.getSourcePath())
            outputResDirPath.set(extension.outputLocation.getResourcePath())
            packageName.set(extension.ktPackage ?: DEFAULT_KT_PACKAGE)
        }
    }

    private fun Project.registerFetchAndUnzipComponents(
        extension: ThemeBuilderExtension,
        outputZip: Provider<RegularFile>,
    ): TaskProvider<Copy>? {
        val source = extension.componentSource
            ?: run {
                logger.warn("componentSource not specified")
                return null
            }
        val fetchComponentsTask = registerFileFetcher(
            taskName = "fetchComponents",
            url = getComponentsUrl(source),
            output = outputZip,
        )
        val unzipTask = registerUnzip(
            taskName = "unpackComponentFiles",
            zipFile = outputZip,
            outputPath = COMPONENTS_PATH,
            dependsOnTask = fetchComponentsTask,
        )
        return unzipTask
    }

    private fun Project.registerFetchAndUnzipTheme(
        themeOutputZip: Provider<RegularFile>,
        source: ThemeBuilderSource,
        themeId: String,
        fetchPaletteTask: TaskProvider<FetchFileTask>,
    ): TaskProvider<Copy> {
        val themeIdPathToken = if (themeId.isEmpty()) "default" else themeId.lowercase()

        val fetchThemeTask = registerFileFetcher(
            taskName = "fetchTheme$themeId",
            url = getThemeUrl(source),
            output = themeOutputZip,
            dependsOnTask = fetchPaletteTask,
        )
        val unzipTask = registerUnzip(
            taskName = "unpackThemeFiles$themeId",
            zipFile = themeOutputZip,
            outputPath = "$THEME_PATH$themeIdPathToken",
            dependsOnTask = fetchThemeTask,
        )
        return unzipTask
    }

    private fun Project.registerGenerateComponentsTask(
        extension: ThemeBuilderExtension,
        fetchComponentsTask: TaskProvider<Copy>,
    ) {
        val task = project.tasks.register<GenerateComponentsTask>("generateComponents") {
            group = TASK_GROUP
            componentsDir.set(getComponentsDir())
            outputDirPath.set(extension.outputLocation.getSourcePath())
            outputResDirPath.set(extension.outputLocation.getResourcePath())
            packageName.set(extension.ktPackage ?: DEFAULT_KT_PACKAGE)
            val projectDirProperty = objects.directoryProperty()
                .apply { set(layout.projectDirectory) }
            projectDir.set(projectDirProperty)
            dimensionsConfig.set(extension.dimensionsConfig)
            resourcesPrefixConfig.set(getResourcePrefixConfig(extension))
            themeName.set(extension.componentSource?.themeName)
            namespace.set(getProjectNameSpace())
            target.set(extension.target)
            componentsMetaStyleClass.set(extension.componentsMetaStyleClass)
        }
        task.dependsOn(fetchComponentsTask)
    }

    private fun Project.registerThemeBuilder(
        extension: ThemeBuilderExtension,
        unzipThemeTasks: List<Any>,
        dependOnPreBuild: Boolean,
        themeSources: ThemeBuilderSources,
    ) {
        val tenants = mutableListOf<String>()
        val colorFiles = mutableListOf<File>()
        val gradientFiles = mutableListOf<File>()
        val typographyFiles = mutableListOf<File>()
        val fontFiles = mutableListOf<File>()
        val shapeFiles = mutableListOf<File>()
        val shadowFiles = mutableListOf<File>()
        val spacingFiles = mutableListOf<File>()

        themeSources.sources.forEach {
            val themeId = it.tenant.also(tenants::add)
            val themeIdPathToken = if (themeId.isEmpty()) "default" else themeId.lowercase()
            colorFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.COLORS)))
            gradientFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.GRADIENTS)))
            typographyFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.TYPOGRAPHY)))
            fontFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.FONTS)))
            shapeFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.SHAPES)))
            shadowFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.SHADOWS)))
            spacingFiles.add(file(getValueFile(themeIdPathToken, TokenValueFile.SPACING)))
        }

        logger.warn("themeSources=$themeSources")

        val generateThemeTask =
            registerThemeGenerator(
                extension = extension,
                paletteFileProvider = getPaletteFile(),
                metaFileProvider = getMetaFile(),
                tenants = tenants,
                colorFiles = colorFiles,
                typographyFiles = typographyFiles,
                fontFiles = fontFiles,
                shadowFiles = shadowFiles,
                spacingFiles = spacingFiles,
                gradientFiles = gradientFiles,
                shapeFiles = shapeFiles,
                unzipTasks = unzipThemeTasks,
                themeName = themeSources.baseAlias,
            )
        if (dependOnPreBuild) {
            tasks.named("preBuild").dependsOn(generateThemeTask)
        }
    }

    private fun Project.configureSourceSets() {
        plugins.all {
            when (this) {
                is AppPlugin -> project.extensions.getByType(AppExtension::class)
                    .configureSourceSets()

                is LibraryPlugin -> project.extensions.getByType(LibraryExtension::class)
                    .configureSourceSets()
            }
        }
    }

    private fun getThemeUrl(source: ThemeBuilderSource): String {
        return getSourceUrl(source, BASE_THEME_URL)
    }

    private fun getComponentsUrl(source: ThemeBuilderSource): String {
        return getSourceUrl(source, BASE_COMPONENT_CONFIG_URL)
    }

    private fun getSourceUrl(source: ThemeBuilderSource, baseUrl: String): String {
        return when (source) {
            is ThemeBuilderSource.NameAndVersion -> {
                if (source.remoteName.isEmpty() || source.version.isEmpty()) {
                    throw GradleException(
                        "Theme name and version should not be empty: " +
                            "name=${source.remoteName} version=${source.version}",
                    )
                }
                "$baseUrl${source.remoteName}/${source.version}.zip"
            }

            is ThemeBuilderSource.Url -> {
                if (source.url.isEmpty()) {
                    throw GradleException("Source url should not be empty: url=${source.url}")
                }
                source.url
            }
        }
    }

    private fun Project.getPaletteFile(): Provider<RegularFile> {
        return layout.buildDirectory.file("$THEME_PATH/$PALETTE_JSON_NAME")
    }

    private fun Project.getMetaFile(): Provider<RegularFile> {
        return layout.buildDirectory.file("${THEME_PATH}default/$META_JSON_NAME")
    }

    private fun Project.getValueFile(themeIdPathToken: String, fileType: TokenValueFile): String {
        return "build/$THEME_PATH$themeIdPathToken/android/${fileType.fileName}"
    }

    private fun Project.getComponentConfigFile(fileName: String): Provider<RegularFile> {
        return layout.buildDirectory.file("$COMPONENTS_PATH/$fileName")
    }

    private fun Project.getComponentsDir(): Provider<Directory> {
        return layout.buildDirectory.dir(COMPONENTS_PATH)
    }

    private fun Project.registerUnzip(
        taskName: String,
        zipFile: Provider<RegularFile>,
        outputPath: String,
        dependsOnTask: Any,
    ): TaskProvider<Copy> {
        return project.tasks.register<Copy>(taskName) {
            group = TASK_GROUP
            from(zipTree(zipFile.get().asFile))
            into(layout.buildDirectory.dir(outputPath))
            dependsOn(dependsOnTask)
        }
    }

    private fun Project.registerFileFetcher(
        taskName: String,
        url: String,
        output: Provider<RegularFile>,
        dependsOnTask: Any? = null,
    ): TaskProvider<FetchFileTask> {
        return project.tasks.register<FetchFileTask>(taskName) {
            group = TASK_GROUP
            this.url.set(url)
            file.set(output)
            failMessage.set("Can't fetch file")
            dependsOnTask?.let { dependsOn(it) }
        }
    }

    private fun Project.registerPaletteFetcher(
        taskName: String,
        paletteUrl: String,
        paletteOutput: Provider<RegularFile>,
    ): TaskProvider<FetchFileTask> {
        return project.tasks.register<FetchFileTask>(taskName) {
            group = TASK_GROUP
            url.set(paletteUrl)
            file.set(paletteOutput)
            failMessage.set("Can't fetch palette")
        }
    }

    @Suppress("SpreadOperator")
    private fun Project.registerThemeGenerator(
        extension: ThemeBuilderExtension,
        paletteFileProvider: Provider<RegularFile>,
        metaFileProvider: Provider<RegularFile>,
        unzipTasks: List<Any>,
        tenants: List<String>,
        colorFiles: List<File>,
        typographyFiles: List<File>,
        fontFiles: List<File>,
        shadowFiles: List<File>,
        spacingFiles: List<File>,
        gradientFiles: List<File>,
        shapeFiles: List<File>,
        themeName: String,
    ): TaskProvider<GenerateThemeTask> {
        return project.tasks.register<GenerateThemeTask>("generateTheme") {
            group = TASK_GROUP
            paletteFile.set(paletteFileProvider)
            metaFile.set(metaFileProvider)
            this.themeTenants.set(tenants)
            this.themeName.set(themeName)
            this.colorFiles.setFrom(colorFiles)
            this.typographyFiles.setFrom(typographyFiles)
            this.fontFiles.setFrom(fontFiles)
            this.shadowFiles.setFrom(shadowFiles)
            this.spacingFiles.setFrom(spacingFiles)
            this.gradientFiles.setFrom(gradientFiles)
            this.shapeFiles.setFrom(shapeFiles)

            packageName.set(extension.ktPackage ?: DEFAULT_KT_PACKAGE)
            target.set(extension.target)
            resourcesPrefixConfig.set(getResourcePrefixConfig(extension))
            viewThemeParents.set(extension.viewThemeParents)
            viewShapeAppearanceConfig.set(extension.viewShapeAppearanceConfig)
            generatorMode.set(extension.mode)
            val projectDirProperty = objects.directoryProperty()
                .apply { set(layout.projectDirectory) }
            projectDir.set(projectDirProperty)
            outputDirPath.set(extension.outputLocation.getSourcePath())
            outputResDirPath.set(extension.outputLocation.getResourcePath())
            namespace.set(getProjectNameSpace())
            dimensionsConfig.set(extension.dimensionsConfig)
            defaultThemeTypography.set(extension.defaultThemeTypography)
            ignoreDisabledTokens.set(extension.ignoreDisabledTokens)
            dependsOn(*unzipTasks.toTypedArray())
        }
    }

    private fun Project.getResourcePrefixConfig(extension: ThemeBuilderExtension): ResourcePrefixConfig {
        return extension.resourcesPrefix?.let {
            ResourcePrefixConfig(
                resourcePrefix = it,
                shouldGenerateResPrefixStyle = true,
            )
        } ?: ResourcePrefixConfig(
            resourcePrefix = project.getDefaultResourcePrefix(),
            shouldGenerateResPrefixStyle = false,
        )
    }

    private fun BaseExtension.configureSourceSets() {
        this.sourceSets.maybeCreate("main").res.apply {
            srcDir(OutputLocation.BUILD.getResourcePath())
            srcDir(OutputLocation.SRC.getResourcePath())
        }
        this.sourceSets.maybeCreate("main").kotlin.apply {
            srcDir(OutputLocation.BUILD.getSourcePath())
            srcDir(OutputLocation.SRC.getSourcePath())
        }
    }

    private fun Project.getDefaultResourcePrefix(): String {
        return getBaseExtension()?.resourcePrefix.orEmpty()
    }

    private fun Project.getProjectNameSpace(): String {
        return getBaseExtension()?.namespace.orEmpty()
    }

    private fun Project.getBaseExtension() = extensions.findByType<AppExtension>()
        ?: extensions.findByType<LibraryExtension>()

    private fun OutputLocation.getSourcePath(): String =
        when (this) {
            OutputLocation.BUILD -> BUILD_OUTPUT_PATH
            OutputLocation.SRC -> SRC_OUTPUT_PATH
        }

    private fun OutputLocation.getResourcePath(): String =
        when (this) {
            OutputLocation.BUILD -> BUILD_OUTPUT_RESOURCE_PATH
            OutputLocation.SRC -> SRC_OUTPUT_RESOURCE_PATH
        }

    private enum class TokenValueFile(val fileName: String) {
        COLORS("android_color.json"),
        TYPOGRAPHY("android_typography.json"),
        FONTS("android_fontFamily.json"),
        SHADOWS("android_shadow.json"),
        SPACING("android_spacing.json"),
        GRADIENTS("android_gradient.json"),
        SHAPES("android_shape.json"),
    }

    private companion object {
        const val TASK_GROUP = "theme-builder"
        const val DEFAULT_KT_PACKAGE = "com.themebuilder.tokens"
        const val BUILD_OUTPUT_RESOURCE_PATH = "build/generated/theme-builder-res"
        const val BUILD_OUTPUT_PATH = "build/generated/theme-builder"
        const val SRC_OUTPUT_RESOURCE_PATH = "src/main/theme-builder-res"
        const val SRC_OUTPUT_PATH = "src/main/kotlin"

        const val THEME_PATH = "theme-builder/theme"
        const val COMPONENTS_PATH = "theme-builder/components"
        const val META_JSON_NAME = "meta.json"
        const val PALETTE_JSON_NAME = "palette.json"

        const val BASE_THEME_URL =
            "https://github.com/salute-developers/theme-converter/raw/main/themes/"

        const val BASE_COMPONENT_CONFIG_URL =
            "https://github.com/salute-developers/theme-converter/raw/main/components/"
    }
}
