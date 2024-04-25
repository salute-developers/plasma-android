package com.sdds.plugin.themebuilder

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import com.android.build.gradle.tasks.MergeResources
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
import org.gradle.kotlin.dsl.withType

/**
 * Плагин для генерации тем и токенов ДС
 * @author Малышев Александр on 09.02.2024
 */
class ThemeBuilderPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val themeOutputZip = project.layout.buildDirectory.file("theme-builder/theme.zip")
        val extension =
            project.extensions.create("theme-builder", ThemeBuilderExtension::class.java)

        configureSourceSets(project)

        project.afterEvaluate {
            extension.resourcesPrefix.convention(project.getDefaultResourcePrefix())
            extension.parentThemeName.convention(DEFAULT_PARENT_THEME_NAME)
            extension.parentThemePrefix.convention(DEFAULT_PARENT_THEME_PREFIX)

            val source = getThemeSource(extension)
            val themeUrl = getThemeUrl(source)

            val fetchThemeTask = registerThemeFetcher(
                themeUrl = themeUrl,
                themeOutput = themeOutputZip,
            )
            val unzipTask = registerUnzip(
                themeInputZip = themeOutputZip,
                fetchThemeTask = fetchThemeTask,
            )

            val baseFileProvider = getBaseFile(source)
            val colorFileProvider = getValueFile(TokenValueFile.COLORS)
            val typographyFileProvider = getValueFile(TokenValueFile.TYPOGRAPHY)
            val fontFileProvider = getValueFile(TokenValueFile.FONTS)
            val shadowFileProvider = getValueFile(TokenValueFile.SHADOWS)
            val gradientFileProvider = getValueFile(TokenValueFile.GRADIENTS)
            val shapeFileProvider = getValueFile(TokenValueFile.SHAPES)

            val generateThemeTask =
                registerThemeGenerator(
                    extension = extension,
                    baseFileProvider = baseFileProvider,
                    colorFileProvider = colorFileProvider,
                    typographyFileProvider = typographyFileProvider,
                    fontFileProvider = fontFileProvider,
                    shadowFileProvider = shadowFileProvider,
                    gradientFileProvider = gradientFileProvider,
                    shapeFileProvider = shapeFileProvider,
                    unzipTask = unzipTask,
                )

            tasks.withType(MergeResources::class).configureEach {
                dependsOn(generateThemeTask)
            }
        }
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

    private fun getThemeSource(extension: ThemeBuilderExtension): ThemeBuilderSource {
        val isSourceConfigured = extension.themeSource.isPresent
        if (isSourceConfigured.not()) throw GradleException("Property themeSource must be set")
        return extension.themeSource.get()
    }

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

    private fun Project.getBaseFile(themeSource: ThemeBuilderSource): Provider<RegularFile> {
        return layout.buildDirectory.file("theme-builder/${themeSource.baseFileName}.json")
    }

    private fun Project.getValueFile(fileType: TokenValueFile): Provider<RegularFile> {
        return layout.buildDirectory.file("theme-builder/android/${fileType.fileName}")
    }

    private fun Project.registerUnzip(
        themeInputZip: Provider<RegularFile>,
        fetchThemeTask: Any,
    ): TaskProvider<Copy> {
        return project.tasks.register<Copy>("unpackFiles") {
            from(zipTree(themeInputZip.get().asFile))
            into(layout.buildDirectory.dir("theme-builder"))
            dependsOn(fetchThemeTask)
        }
    }

    private fun Project.registerThemeFetcher(
        themeUrl: String,
        themeOutput: Provider<RegularFile>,
    ): TaskProvider<FetchThemeTask> {
        return project.tasks.register<FetchThemeTask>("fetchTheme") {
            url.set(themeUrl)
            themeFile.set(themeOutput)
        }
    }

    private fun Project.registerThemeGenerator(
        extension: ThemeBuilderExtension,
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
            baseFile.set(baseFileProvider)
            colorFile.set(colorFileProvider)
            typographyFile.set(typographyFileProvider)
            fontFile.set(fontFileProvider)
            shadowFile.set(shadowFileProvider)
            gradientFile.set(gradientFileProvider)
            shapeFile.set(shapeFileProvider)

            packageName.set(extension.packageName)
            target.set(extension.target)
            resourcesPrefix.set(extension.resourcesPrefix)
            parentThemePrefix.set(extension.parentThemePrefix)
            parentThemeName.set(extension.parentThemeName)
            outputDir.set(project.layout.projectDirectory.dir(OUTPUT_PATH))
            outputResDir.set(project.layout.projectDirectory.dir(OUTPUT_RESOURCE_PATH))
            namespace.set(getProjectNameSpace())
            dependsOn(unzipTask)
        }
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
        const val OUTPUT_RESOURCE_PATH = "build/generated/theme-builder-res"
        const val OUTPUT_PATH = "build/generated/theme-builder"

        const val DEFAULT_PARENT_THEME_NAME = "Sdds.Theme"
        const val DEFAULT_PARENT_THEME_PREFIX = "sdds"

        const val BASE_THEME_URL =
            "https://github.com/salute-developers/theme-converter/raw/main/themes/"
    }
}
