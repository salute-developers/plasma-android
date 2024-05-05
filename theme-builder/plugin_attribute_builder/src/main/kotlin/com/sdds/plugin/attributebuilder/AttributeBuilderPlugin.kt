package com.sdds.plugin.attributebuilder

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.tasks.MergeResources
import com.sdds.plugin.core.task.registerFileFetcher
import com.sdds.plugin.core.task.registerUnzip
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
 * Плагин для генерации стандартных атрибутов в целевом uikit.
 * Генерирует атрибуты на основе списка токенов из дефолтной темы.
 */
class AttributeBuilderPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val themeZip =
            project.layout.buildDirectory.file("$DOWNLOAD_DIR/default_theme.zip")

        val extension =
            project.extensions.create("attribute-builder", AttributeBuilderExtension::class.java)

        configureSourceSet(project)

        project.afterEvaluate {
            if (extension.target.isPresent.not()) throw GradleException("Target must be set")

            val fetchThemeTask = registerFileFetcher(
                name = "fetchDefaultTheme",
                fileUrl = getThemeUrl(extension),
                outputFile = themeZip,
            )
            val unzipTask = registerUnzip(
                name = "unpackDefaultTheme",
                inputZip = themeZip,
                outputDir = layout.buildDirectory.dir(DOWNLOAD_DIR),
                dependsOnTask = fetchThemeTask,
            )

            val generateAttributesTask = registerAttributeGenerator(
                themeFileProvider = layout.buildDirectory.file("$DOWNLOAD_DIR/meta.json"),
                extension = extension,
                dependsOnTask = unzipTask,
            )

            tasks.withType(MergeResources::class).configureEach {
                dependsOn(generateAttributesTask)
            }
        }
    }

    private fun configureSourceSet(project: Project) {
        project.extensions.getByType(LibraryExtension::class)
            .configureSourceSets()
    }

    private fun getThemeUrl(extension: AttributeBuilderExtension): String {
        if (extension.themeUrl.isPresent.not()) throw GradleException("Theme url must be present")
        return extension.themeUrl.get()
    }

    private fun Project.registerAttributeGenerator(
        themeFileProvider: Provider<RegularFile>,
        extension: AttributeBuilderExtension,
        dependsOnTask: Any,
    ): TaskProvider<GenerateAttributesTask> {
        return project.tasks.register<GenerateAttributesTask>("generateAttributes") {
            themeFile.set(themeFileProvider)
            outputDir.set(layout.projectDirectory.dir(OUTPUT_PATH))
            outputResDir.set(layout.projectDirectory.dir(OUTPUT_RESOURCE_PATH))
            target.set(extension.target.get())
            dependsOn(dependsOnTask)
        }
    }

    private fun BaseExtension.configureSourceSets() {
        this.sourceSets.maybeCreate("main").res.srcDir(OUTPUT_RESOURCE_PATH)
        this.sourceSets.maybeCreate("main").kotlin.srcDir(OUTPUT_PATH)
    }

    private companion object {
        const val DOWNLOAD_DIR = "attribute-builder"
        const val OUTPUT_RESOURCE_PATH = "build/generated/attribute-builder-res"
        const val OUTPUT_PATH = "build/generated/attribute-builder"
    }
}
