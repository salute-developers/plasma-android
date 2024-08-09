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
        val extension = project.themeBuilderExt()

        configureSourceSets(project)

        project.afterEvaluate {
            val unzipTask = registerFetchAndUnzip(extension, themeZip, paletteJson)
            registerThemeBuilder(extension, unzipTask)
        }
    }

    private fun Project.registerFetchAndUnzip(
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

    private fun Project.registerThemeBuilder(
        extension: ThemeBuilderExtension,
        unzipTask: Any,
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
                gradientFileProvider = getValueFile(TokenValueFile.GRADIENTS),
                shapeFileProvider = getValueFile(TokenValueFile.SHAPES),
                unzipTask = unzipTask,
            )

        tasks.named("preBuild").dependsOn(generateThemeTask)
    }

    private fun configureSourceSets(project: Project) {
        project.plugins.all {
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
                if (source.name.isEmpty() || source.version.isEmpty()) {
                    throw GradleException(
                        "Theme name and version should not be empty: " +
                            "name=${source.name} version=${source.version}",
                    )
                }
                "$BASE_THEME_URL${source.name}/${source.version}.zip"
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

    private fun Project.registerUnzip(
        taskName: String,
        zipFile: Provider<RegularFile>,
        outputPath: String,
        dependsOnTask: Any,
    ): TaskProvider<Copy> {
        return project.tasks.register<Copy>(taskName) {
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
    ): TaskProvider<FetchThemeTask> {
        return project.tasks.register<FetchThemeTask>(taskName) {
            url.set(themeUrl)
            themeFile.set(themeOutput)
            dependsOn(dependsOnTask)
        }
    }

    private fun Project.registerPaletteFetcher(
        taskName: String,
        paletteUrl: String,
        paletteOutput: Provider<RegularFile>,
    ): TaskProvider<FetchPaletteTask> {
        return project.tasks.register<FetchPaletteTask>(taskName) {
            url.set(paletteUrl)
            paletteFile.set(paletteOutput)
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
        gradientFileProvider: Provider<RegularFile>,
        shapeFileProvider: Provider<RegularFile>,
        unzipTask: Any,
    ): TaskProvider<GenerateThemeTask> {
        return project.tasks.register<GenerateThemeTask>("generateTheme") {
            paletteFile.set(paletteFileProvider)
            themeName.set(getThemeSource(extension).themeName)
            metaFile.set(baseFileProvider)
            colorFile.set(colorFileProvider)
            typographyFile.set(typographyFileProvider)
            fontFile.set(fontFileProvider)
            shadowFile.set(shadowFileProvider)
            gradientFile.set(gradientFileProvider)
            shapeFile.set(shapeFileProvider)

            packageName.set(extension.ktPackage ?: DEFAULT_KT_PACKAGE)
            target.set(extension.target)
            resourcesPrefixConfig.set(getResourcePrefixConfig(extension))
            viewThemeParents.set(extension.viewThemeParents)
            generatorMode.set(extension.mode)
            val projectDirProperty = objects.directoryProperty()
                .apply { set(layout.projectDirectory) }
            projectDir.set(projectDirProperty)
            outputDirPath.set(OUTPUT_PATH)
            outputResDirPath.set(OUTPUT_RESOURCE_PATH)
            namespace.set(getProjectNameSpace())

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
        this.sourceSets.maybeCreate("main").res.srcDir(OUTPUT_RESOURCE_PATH)
        this.sourceSets.maybeCreate("main").kotlin.srcDir(OUTPUT_PATH)
    }

    private fun Project.getDefaultResourcePrefix(): String {
        return getBaseExtension()?.resourcePrefix.orEmpty()
    }

    private fun Project.getProjectNameSpace(): String {
        return getBaseExtension()?.namespace.orEmpty()
    }

    private fun Project.getBaseExtension() = extensions.findByType<AppExtension>()
        ?: extensions.findByType<LibraryExtension>()

    private enum class TokenValueFile(val fileName: String) {
        COLORS("android_color.json"),
        TYPOGRAPHY("android_typography.json"),
        FONTS("android_fontFamily.json"),
        SHADOWS("android_shadow.json"),
        GRADIENTS("android_gradient.json"),
        SHAPES("android_shape.json"),
    }

    private companion object {
        const val DEFAULT_KT_PACKAGE = "com.themebuilder.tokens"
        const val OUTPUT_RESOURCE_PATH = "build/generated/theme-builder-res"
        const val OUTPUT_PATH = "build/generated/theme-builder"

        const val THEME_PATH = "theme-builder/theme"
        const val META_JSON_NAME = "meta.json"
        const val PALETTE_JSON_NAME = "palette.json"

        const val BASE_THEME_URL =
            "https://github.com/salute-developers/theme-converter/raw/main/themes/"
    }
}
