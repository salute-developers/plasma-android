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
import org.gradle.api.file.Directory
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register

/**
 * Плагин для генерации тем и токенов ДС
 * @author Малышев Александр on 09.02.2024
 */
class ThemeBuilderPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val themeZip = project.layout.buildDirectory.file("$THEME_PATH/theme.zip")
        val componentsZip = project.layout.buildDirectory.file("$COMPONENTS_PATH/components.zip")
        val paletteJson = project.layout.buildDirectory.file("$THEME_PATH/$PALETTE_JSON_NAME")
        val extension = project.themeBuilderExt()
        project.configureSourceSets()

        project.afterEvaluate {
            project.registerClean(extension)
            val unzipThemeTask = registerFetchAndUnzipTheme(extension, themeZip, paletteJson)
            registerThemeBuilder(
                extension = extension,
                unzipThemeTask = unzipThemeTask,
                dependOnPreBuild = extension.autoGenerate,
            )

            val fetchComponentsTask = registerFetchAndUnzipComponents(extension, componentsZip)
            fetchComponentsTask?.let { registerGenerateComponentsTask(extension, it) }
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
        extension: ThemeBuilderExtension,
        themeOutputZip: Provider<RegularFile>,
        paletteOutputJson: Provider<RegularFile>,
    ): TaskProvider<Copy> {
        val source = getThemeSource(extension)

        val fetchPaletteTask = registerPaletteFetcher(
            taskName = "fetchPalette",
            paletteUrl = extension.paletteUrl,
            paletteOutput = paletteOutputJson,
        )
        val fetchThemeTask = registerFileFetcher(
            taskName = "fetchTheme",
            url = getThemeUrl(source),
            output = themeOutputZip,
            dependsOnTask = fetchPaletteTask,
        )
        val unzipTask = registerUnzip(
            taskName = "unpackThemeFiles",
            zipFile = themeOutputZip,
            outputPath = THEME_PATH,
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
        unzipThemeTask: Any,
        dependOnPreBuild: Boolean,
    ) {
        val generateThemeTask =
            registerThemeGenerator(
                extension = extension,
                paletteFileProvider = getPaletteFile(),
                baseFileProvider = getMetaFile(),
                colorFileProvider = getValueFile(TokenValueFile.COLORS),
                typographyFileProvider = getValueFile(TokenValueFile.TYPOGRAPHY),
                fontFileProvider = getValueFile(TokenValueFile.FONTS),
                shadowFileProvider = getValueFile(TokenValueFile.SHADOWS),
                spacingFileProvider = getValueFile(TokenValueFile.SPACING),
                gradientFileProvider = getValueFile(TokenValueFile.GRADIENTS),
                shapeFileProvider = getValueFile(TokenValueFile.SHAPES),
                unzipTask = unzipThemeTask,
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

    private fun getThemeSource(extension: ThemeBuilderExtension): ThemeBuilderSource =
        extension.themeSource ?: throw GradleException("themeSource must be set")

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
        return layout.buildDirectory.file("$THEME_PATH/$META_JSON_NAME")
    }

    private fun Project.getValueFile(fileType: TokenValueFile): Provider<RegularFile> {
        return layout.buildDirectory.file("$THEME_PATH/android/${fileType.fileName}")
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

    private fun Project.registerThemeGenerator(
        extension: ThemeBuilderExtension,
        paletteFileProvider: Provider<RegularFile>,
        baseFileProvider: Provider<RegularFile>,
        colorFileProvider: Provider<RegularFile>,
        typographyFileProvider: Provider<RegularFile>,
        fontFileProvider: Provider<RegularFile>,
        shadowFileProvider: Provider<RegularFile>,
        spacingFileProvider: Provider<RegularFile>,
        gradientFileProvider: Provider<RegularFile>,
        shapeFileProvider: Provider<RegularFile>,
        unzipTask: Any,
    ): TaskProvider<GenerateThemeTask> {
        return project.tasks.register<GenerateThemeTask>("generateTheme") {
            group = TASK_GROUP
            paletteFile.set(paletteFileProvider)
            themeName.set(getThemeSource(extension).themeName)
            metaFile.set(baseFileProvider)
            colorFile.set(colorFileProvider)
            typographyFile.set(typographyFileProvider)
            fontFile.set(fontFileProvider)
            shadowFile.set(shadowFileProvider)
            spacingFile.set(spacingFileProvider)
            gradientFile.set(gradientFileProvider)
            shapeFile.set(shapeFileProvider)

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
            dependsOn(unzipTask)
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
