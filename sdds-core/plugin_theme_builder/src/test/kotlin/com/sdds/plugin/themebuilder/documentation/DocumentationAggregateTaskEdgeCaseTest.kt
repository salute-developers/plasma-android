package com.sdds.plugin.themebuilder.documentation

import org.gradle.api.GradleException
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class DocumentationAggregateTaskEdgeCaseTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `aggregate падает если samples metadata не массив`() {
        val task = configuredTask()
        task.samplesMetadata.set(
            temporaryFolder.newFile("samples-object.json").apply {
                writeText("{}")
            },
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Snippet metadata must be a JSON array"))
    }

    @Test
    fun `aggregate падает если элемент samples metadata не объект`() {
        val task = configuredTask()
        task.samplesMetadata.set(
            temporaryFolder.newFile("samples-primitive.json").apply {
                writeText("[1]")
            },
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Snippet metadata entries must be JSON objects"))
    }

    @Test
    fun `aggregate падает если core structure не содержит navigation array`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "invalid-navigation.jar",
                "META-INF/sdds-docs/structure.json" to "{\"navigation\":{}}",
            ),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Core documentation structure must contain a navigation array"))
    }

    @Test
    fun `aggregate падает если путь core page не markdown`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "invalid-page-path.jar",
                "META-INF/sdds-docs/structure.json" to "{\"navigation\":[{\"path\":\"components/Button.txt\"}]}",
            ),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Core documentation page must reference markdown"))
        assertTrue(error?.message.orEmpty().contains("components/Button.txt"))
    }

    @Test
    fun `aggregate падает если core navigation items не массив`() {
        val task = configuredTask()
        task.coreArtifacts.from(
            createJar(
                "invalid-items.jar",
                "META-INF/sdds-docs/structure.json" to "{\"navigation\":[{\"items\":{}}]}",
            ),
        )

        val error = runCatching(task::aggregate).exceptionOrNull()

        assertTrue(error is GradleException)
        assertTrue(error?.message.orEmpty().contains("Core documentation navigation items must be an array"))
    }

    private fun configuredTask(): DocumentationAggregateTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        return project.tasks.create("aggregate", DocumentationAggregateTask::class.java).apply {
            kotlinSnippets.set(temporaryFolder.newFolder())
            xmlSnippets.set(temporaryFolder.newFolder())
            samplesMetadata.set(temporaryFolder.newFile().apply { writeText("[]") })
            componentsInfoFile.set(temporaryFolder.newFile().apply { writeText("{}") })
            themeInfoFile.set(temporaryFolder.newFile().apply { writeText("{}") })
            outputDirectory.set(temporaryFolder.newFolder())
        }
    }

    private fun createJar(name: String, vararg entries: Pair<String, String>): File =
        temporaryFolder.newFile(name).also { file ->
            ZipOutputStream(file.outputStream()).use { output ->
                entries.forEach { (path, content) ->
                    output.putNextEntry(ZipEntry(path))
                    output.write(content.toByteArray())
                    output.closeEntry()
                }
            }
        }
}
