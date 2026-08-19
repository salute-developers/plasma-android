package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ApiMeta
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@OptIn(ExperimentalSerializationApi::class)
class UikitApiMetaTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `UikitApiMetaTask читает view api meta из директории classpath`() {
        val metaDir = temporaryFolder.newFolder("classes").apply {
            resolve("sdds/api/uikit-api-meta.json").apply {
                parentFile.mkdirs()
                writeText(viewApiMetaJson(componentName = "BasicButton"))
            }
        }
        val task = uikitApiMetaTask("readViewMetaFromDir")
        val output = temporaryFolder.newFile("view-meta-dir.json")
        task.metaClasspath.from(metaDir)
        task.outputFile.set(output)

        task.generate()

        val meta = Serializer.componentConfig.decodeFromString<ApiMeta>(output.readText())
        assertEquals(listOf("BasicButton"), meta.components.single().componentNames)
        assertEquals("Button", meta.components.single().styleableName)
        assertEquals(mapOf("loading" to "sd_state_loading"), meta.sharedStates)
    }

    @Test
    fun `UikitApiMetaTask читает view api meta из jar classpath`() {
        val artifact = createJar(
            "view-api.jar",
            "sdds/api/uikit-api-meta.json" to viewApiMetaJson(componentName = "IconButton"),
        )
        val task = uikitApiMetaTask("readViewMetaFromJar")
        val output = temporaryFolder.newFile("view-meta-jar.json")
        task.metaClasspath.from(artifact)
        task.outputFile.set(output)

        task.generate()

        val meta = Serializer.componentConfig.decodeFromString<ApiMeta>(output.readText())
        assertEquals(listOf("IconButton"), meta.components.single().componentNames)
    }

    @Test
    fun `UikitApiMetaTask записывает пустой view api meta если в classpath нет meta файла`() {
        val task = uikitApiMetaTask("readMissingViewMeta")
        val output = temporaryFolder.newFile("view-meta-empty.json")
        task.metaClasspath.from(temporaryFolder.root.resolve("missing.jar"))
        task.outputFile.set(output)

        task.generate()

        assertEquals(ApiMeta(), Serializer.componentConfig.decodeFromString<ApiMeta>(output.readText()))
    }

    @Test
    fun `UikitComposeApiMetaTask читает compose api meta из директории classpath`() {
        val metaDir = temporaryFolder.newFolder("compose-classes").apply {
            resolve("sdds/api/uikit-compose-api-meta.json").apply {
                parentFile.mkdirs()
                writeText(composeApiMetaJson(componentName = "Button"))
            }
        }
        val task = uikitComposeApiMetaTask("readComposeMetaFromDir")
        val output = temporaryFolder.newFile("compose-meta-dir.json")
        task.metaClasspath.from(metaDir)
        task.outputFile.set(output)

        task.generate()

        val meta = Serializer.componentConfig.decodeFromString<List<ComposeComponentMeta>>(output.readText())
        assertEquals("Button", meta.single().componentName)
        assertEquals("com.test.Button", meta.single().qualifiedName)
    }

    @Test
    fun `UikitComposeApiMetaTask читает compose api meta из jar classpath`() {
        val artifact = createJar(
            "compose-api.jar",
            "sdds/api/uikit-compose-api-meta.json" to composeApiMetaJson(componentName = "Card"),
        )
        val task = uikitComposeApiMetaTask("readComposeMetaFromJar")
        val output = temporaryFolder.newFile("compose-meta-jar.json")
        task.metaClasspath.from(artifact)
        task.outputFile.set(output)

        task.generate()

        val meta = Serializer.componentConfig.decodeFromString<List<ComposeComponentMeta>>(output.readText())
        assertEquals("Card", meta.single().componentName)
    }

    @Test
    fun `UikitComposeApiMetaTask записывает пустой список если в classpath нет compose meta файла`() {
        val task = uikitComposeApiMetaTask("readMissingComposeMeta")
        val output = temporaryFolder.newFile("compose-meta-empty.json")
        task.metaClasspath.from(temporaryFolder.root.resolve("missing.jar"))
        task.outputFile.set(output)

        task.generate()

        assertEquals(
            emptyList<ComposeComponentMeta>(),
            Serializer.componentConfig.decodeFromString<List<ComposeComponentMeta>>(output.readText()),
        )
    }

    private fun uikitApiMetaTask(name: String): UikitApiMetaTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        return project.tasks.register(name, UikitApiMetaTask::class.java).get()
    }

    private fun uikitComposeApiMetaTask(name: String): UikitComposeApiMetaTask {
        val project = ProjectBuilder.builder().withProjectDir(temporaryFolder.newFolder()).build()
        return project.tasks.register(name, UikitComposeApiMetaTask::class.java).get()
    }

    private fun viewApiMetaJson(componentName: String): String =
        """
            {
              "components": [
                {
                  "componentNames": ["$componentName"],
                  "styleableName": "Button",
                  "params": []
                }
              ],
              "sharedStates": { "loading": "sd_state_loading" }
            }
        """.trimIndent()

    private fun composeApiMetaJson(componentName: String): String =
        """
            [
              {
                "componentName": "$componentName",
                "qualifiedName": "com.test.$componentName",
                "resolvedTypes": ["$componentName"],
                "params": []
              }
            ]
        """.trimIndent()

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
