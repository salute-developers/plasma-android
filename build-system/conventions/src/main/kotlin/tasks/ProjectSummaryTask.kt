package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import utils.docsBaseProdUrl
import utils.docsUrl
import utils.isComposeLib
import utils.versionInfo

/**
 * Создает JSON файл с информацией о библиотеках
 * @author Малышев Александр on 11.09.2025
 */
abstract class ProjectSummaryTask : DefaultTask() {

    @get:OutputFile
    abstract val outputSummaryFile: RegularFileProperty

    @TaskAction
    fun generate() {
        val gson = GsonBuilder().setPrettyPrinting().create()
        val items = project.subprojects
            .mapNotNull {
                val key = it.properties["summary.key"]?.toString() ?: return@mapNotNull null
                val docsUrl = "${it.docsUrl}${it.docsBaseProdUrl}"
                key to ProjectSummaryItem(
                    title = if (it.isComposeLib()) {
                        ProjectSummaryTitle.ComposeUI.title
                    } else {
                        ProjectSummaryTitle.ViewSystem.title
                    },
                    version = it.versionInfo().name,
                    links = ProjectLinks(
                        documentation = ProjectLink(docsUrl),
                        changelog = ProjectLink("${docsUrl}CHANGELOG/"),
                    )
                )
            }
            .groupBy { it.first }
            .map { group ->
                group.key to ProjectSummary(
                    group.value.find { it.second.title == ProjectSummaryTitle.ViewSystem.title }?.second,
                    group.value.find { it.second.title == ProjectSummaryTitle.ComposeUI.title }?.second,
                )
            }
            .associate { it.first to it.second }

        val json = gson.toJson(items)
        outputSummaryFile.get().asFile.writeText(json)
    }
}

internal data class ProjectSummary(
    val viewSystem: ProjectSummaryItem?,
    val composeUi: ProjectSummaryItem?
)

internal enum class ProjectSummaryTitle(val title: String) {
    ViewSystem("XML"),
    ComposeUI("Compose UI")
}

internal data class ProjectSummaryItem(
    val title: String,
    val version: String,
    val links: ProjectLinks
)

internal data class ProjectLinks(
    val documentation: ProjectLink,
    val changelog: ProjectLink,
)

internal data class ProjectLink(
    val href: String
)