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
        val paletteJson = project.layout.buildDirectory.file("$THEME_PATH/$PALETTE_JSON_NAME")
        val componentJsons = ComponentConfig.values()
            .associateWith { project.layout.buildDirectory.file("$COMPONENTS_PATH/${it.fileName}") }
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

            val fetchComponentConfigsTasks =
                registerFetchComponentConfigs(extension, componentJsons)
            registerGenerateComponentConfigsTask(extension, fetchComponentConfigsTasks)
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
        val fetchThemeTask = registerThemeFetcher(
            taskName = "fetchTheme",
            themeUrl = getThemeUrl(source),
            themeOutput = themeOutputZip,
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

    private fun Project.registerFetchComponentConfigs(
        extension: ThemeBuilderExtension,
        componentJsons: Map<ComponentConfig, Provider<RegularFile>>,
    ): List<TaskProvider<FetchFileTask>> {
        val themeRemoteName = when (val source = getThemeSource(extension)) {
            is ThemeBuilderSource.NameAndVersion -> source.remoteName
            is ThemeBuilderSource.Url -> source.themeName
        }
        val baseUrl = extension.componentsSource ?: "${BASE_COMPONENT_CONFIG_URL}$themeRemoteName"
        return ComponentConfig.values().map {
            project.tasks.register<FetchFileTask>(it.fetchTaskName) {
                group = TASK_GROUP
                url.set("$baseUrl/${it.fileName}")
                file.set(componentJsons[it]!!)
                failMessage.set("Can't fetch ${it.fileName}")
            }
        }
    }

    private fun Project.registerGenerateComponentConfigsTask(
        extension: ThemeBuilderExtension,
        fetchComponentConfigsTasks: List<TaskProvider<FetchFileTask>>,
    ) {
        val task =
            project.tasks.register<GenerateComponentConfigsTask>("generateComponentConfigs") {
                group = TASK_GROUP
                basicButtonConfigFile.set(getComponentConfigFile(ComponentConfig.BASIC_BUTTON.fileName))
                iconButtonConfigFile.set(getComponentConfigFile(ComponentConfig.ICON_BUTTON.fileName))
                linkButtonConfigFile.set(getComponentConfigFile(ComponentConfig.LINK_BUTTON.fileName))
                textFieldConfigFile.set(getComponentConfigFile(ComponentConfig.TEXT_FIELD.fileName))
                textFieldClearConfigFile.set(getComponentConfigFile(ComponentConfig.TEXT_FIELD_CLEAR.fileName))
                textAreaConfigFile.set(getComponentConfigFile(ComponentConfig.TEXT_AREA.fileName))
                textAreaClearConfigFile.set(getComponentConfigFile(ComponentConfig.TEXT_AREA_CLEAR.fileName))
                cardConfigFile.set(getComponentConfigFile(ComponentConfig.CARD_SOLID.fileName))
                cardClearConfigFile.set(getComponentConfigFile(ComponentConfig.CARD_CLEAR.fileName))
                cellConfigFile.set(getComponentConfigFile(ComponentConfig.CELL.fileName))
                indicatorConfigFile.set(getComponentConfigFile(ComponentConfig.INDICATOR.fileName))
                counterConfigFile.set(getComponentConfigFile(ComponentConfig.COUNTER.fileName))
                badgeConfigFile.set(getComponentConfigFile(ComponentConfig.BADGE_SOLID.fileName))
                badgeClearConfigFile.set(getComponentConfigFile(ComponentConfig.BADGE_CLEAR.fileName))
                badgeTransparentConfigFile.set(getComponentConfigFile(ComponentConfig.BADGE_TRANSPARENT.fileName))
                iconBadgeConfigFile.set(getComponentConfigFile(ComponentConfig.ICON_BADGE_SOLID.fileName))
                iconBadgeClearConfigFile.set(getComponentConfigFile(ComponentConfig.ICON_BADGE_CLEAR.fileName))
                iconBadgeTransparentConfigFile.set(
                    getComponentConfigFile(ComponentConfig.ICON_BADGE_TRANSPARENT.fileName),
                )
                segmentItemConfigFile.set(
                    getComponentConfigFile(ComponentConfig.SEGMENT_ITEM.fileName),
                )
                segmentConfigFile.set(getComponentConfigFile(ComponentConfig.SEGMENT.fileName))
                outputDirPath.set(extension.outputLocation.getSourcePath())
                outputResDirPath.set(extension.outputLocation.getResourcePath())
                packageName.set(extension.ktPackage ?: DEFAULT_KT_PACKAGE)
                val projectDirProperty = objects.directoryProperty()
                    .apply { set(layout.projectDirectory) }
                projectDir.set(projectDirProperty)
                dimensionsConfig.set(extension.dimensionsConfig)
                resourcesPrefixConfig.set(getResourcePrefixConfig(extension))
                namespace.set(getProjectNameSpace())
                themeName.set(getThemeSource(extension).themeName)
                target.set(extension.target)
            }
        fetchComponentConfigsTasks.forEach { task.dependsOn(it) }
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
        return when (source) {
            is ThemeBuilderSource.NameAndVersion -> {
                if (source.remoteName.isEmpty() || source.version.isEmpty()) {
                    throw GradleException(
                        "Theme name and version should not be empty: " +
                            "name=${source.remoteName} version=${source.version}",
                    )
                }
                "$BASE_THEME_URL${source.remoteName}/${source.version}.zip"
            }

            is ThemeBuilderSource.Url -> {
                if (source.url.isEmpty()) {
                    throw GradleException("Theme url should not be empty: url=${source.url}")
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

    private fun Project.registerThemeFetcher(
        taskName: String,
        themeUrl: String,
        themeOutput: Provider<RegularFile>,
        dependsOnTask: Any,
    ): TaskProvider<FetchFileTask> {
        return project.tasks.register<FetchFileTask>(taskName) {
            group = TASK_GROUP
            url.set(themeUrl)
            file.set(themeOutput)
            failMessage.set("Can't fetch theme")
            dependsOn(dependsOnTask)
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

    private enum class ComponentConfig(val fileName: String, val fetchTaskName: String) {
        BASIC_BUTTON("basic_button_config.json", "fetchBasicButtonConfig"),
        ICON_BUTTON("icon_button_config.json", "fetchIconButtonConfig"),
        LINK_BUTTON("link_button_config.json", "fetchLinkButtonConfig"),
        TEXT_FIELD("text_field_config.json", "fetchTextFieldConfig"),
        TEXT_FIELD_CLEAR("text_field_clear_config.json", "fetchTextFieldClearConfig"),
        TEXT_AREA("text_area_config.json", "fetchTextAreaConfig"),
        TEXT_AREA_CLEAR("text_area_clear_config.json", "fetchTextAreaClearConfig"),
        CELL("cell_config.json", "fetchCellConfig"),
        INDICATOR("indicator_config.json", "fetchIndicatorConfig"),
        BADGE_SOLID("badge_solid_config.json", "fetchBadgeConfig"),
        BADGE_CLEAR("badge_clear_config.json", "fetchBadgeClearConfig"),
        BADGE_TRANSPARENT("badge_transparent_config.json", "fetchBadgeTransparentConfig"),
        ICON_BADGE_SOLID("icon_badge_solid_config.json", "fetchIconBadgeConfig"),
        ICON_BADGE_CLEAR("icon_badge_clear_config.json", "fetchIconBadgeClearConfig"),
        ICON_BADGE_TRANSPARENT(
            "icon_badge_transparent_config.json",
            "fetchIconBadgeTransparentConfig",
        ),
        COUNTER("counter_config.json", "fetchCounterConfig"),
        CARD_SOLID("card_solid_config.json", "fetchCardConfig"),
        CARD_CLEAR("card_clear_config.json", "fetchCardClearConfig"),
        SEGMENT_ITEM("segment_item_config.json", "fetchSegmentItemConfig"),
        SEGMENT("segment_config.json", "fetchSegmentConfig"),
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
