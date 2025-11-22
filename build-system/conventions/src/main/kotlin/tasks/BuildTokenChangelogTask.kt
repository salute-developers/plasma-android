package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonObject
import utils.docsArtifactId
import utils.isComposeLib
import utils.parseTokenLibChangelog
import utils.toDto
import utils.toMarkdown
import utils.versionInfo
import java.io.File

/**
 * Создает файлы CHANGELOG.md и changelog.json
 * @author Малышев Александр on 05.08.2025
 */
abstract class BuildTokenChangelogTask : DefaultTask() {

    @get:Input
    abstract val releaseChangelogPath: Property<String>

    @get:Input
    abstract val libraryChangelogJsonPath: Property<String>

    @get:OutputFile
    abstract val outputChangelogMdFile: RegularFileProperty

    @TaskAction
    fun buildChangelog() {
        val gson = GsonBuilder().setPrettyPrinting().create()

        val releaseChangelog = File(releaseChangelogPath.get())
            .takeIf { it.exists() }
            ?.readText().orEmpty()
        if (releaseChangelog.isBlank()) {
            logger.warn("release-changelog.md file is empty or do not exists")
            return
        }
        val coreLibName = if (project.isComposeLib()) "sdds-uikit-compose" else "sdds-uikit"
        val version = project.versionInfo().name
        val changelog = parseTokenLibChangelog(releaseChangelog, version, project.docsArtifactId, coreLibName)

        outputChangelogMdFile.get().asFile.apply {
            appendText(changelog.toMarkdown())
        }

        val sourceJsonFile = File(libraryChangelogJsonPath.get())
        if (!sourceJsonFile.exists()) {
            logger.warn("${sourceJsonFile.path} is not exist, creating")
            sourceJsonFile.writeText("{}")
        }
        logger.info("${sourceJsonFile.path} is exist ${sourceJsonFile.exists()}")
        val sourceJson = gson.fromJson(sourceJsonFile.readText(), JsonObject::class.java)
        if (sourceJson.has(version)) {
            sourceJson.remove(version)
        }
        sourceJson.add(version, gson.toJsonTree(changelog.toDto()))
        sourceJsonFile.writeText(gson.toJson(sourceJson))
    }
}