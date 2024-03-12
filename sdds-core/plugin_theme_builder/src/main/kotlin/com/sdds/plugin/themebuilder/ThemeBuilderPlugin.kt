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
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType

/**
 * Плагин для генерации тем и токенов ДС
 * @author Малышев Александр on 09.02.2024
 */
class ThemeBuilderPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("theme-builder", ThemeBuilderExtension::class.java)
        val themeOutputFile = project.layout.buildDirectory.file("theme-builder/theme.json")
        val fetchThemeTask = project.registerThemeFetcher(extension, themeOutputFile)
        val generateThemeTask = project.registerThemeGenerator(themeOutputFile, fetchThemeTask)

        project.tasks.withType(MergeResources::class).configureEach {
            dependsOn(generateThemeTask)
        }

        project.plugins.all {
            when (this) {
                is AppPlugin -> project.extensions.getByType(AppExtension::class).configureSourceSets()
                is LibraryPlugin -> project.extensions.getByType(LibraryExtension::class).configureSourceSets()
            }
        }
    }

    private fun Project.registerThemeFetcher(
        extension: ThemeBuilderExtension,
        output: Provider<RegularFile>,
    ): TaskProvider<FetchThemeTask> {
        return project.tasks.register<FetchThemeTask>("fetchTheme") {
            if (extension.themeUrl.orNull == null) throw GradleException("Property themeUrl must be set")
            url.set(extension.themeUrl)
            themeFile.set(output)
        }
    }

    private fun Project.registerThemeGenerator(
        input: Provider<RegularFile>,
        fetchTask: Any,
    ): TaskProvider<GenerateThemeTask> {
        return project.tasks.register<GenerateThemeTask>("generateTheme") {
            themeFile.set(input)
            outputDir.set(project.layout.projectDirectory.dir(OUTPUT_PATH))
            outputResDir.set(project.layout.projectDirectory.dir(OUTPUT_RESOURCE_PATH))
            dependsOn(fetchTask)
        }
    }

    private fun BaseExtension.configureSourceSets() {
        this.sourceSets.maybeCreate("main").res.srcDir(OUTPUT_RESOURCE_PATH)
        this.sourceSets.maybeCreate("main").kotlin.srcDir(OUTPUT_PATH)
    }

    private companion object {
        const val OUTPUT_RESOURCE_PATH = "build/generated/theme-builder-res"
        const val OUTPUT_PATH = "build/generated/theme-builder"
    }
}
