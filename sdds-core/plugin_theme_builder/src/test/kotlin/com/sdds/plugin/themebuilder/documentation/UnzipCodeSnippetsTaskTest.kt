package com.sdds.plugin.themebuilder.documentation

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class UnzipCodeSnippetsTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `run распаковывает только sdds documentation файлы из артефактов`() {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.newFolder("project"))
            .build()
        val task = project.tasks.create("unzipDocs", UnzipCodeSnippetsTask::class.java)
        val artifact = createJar(
            "docs.jar",
            "META-INF/sdds-docs/assets/examples/kotlin/Sample.kt" to "kotlin sample",
            "META-INF/sdds-docs/meta/samples.json" to "[]",
            "META-INF/other/Ignored.kt" to "ignored",
        )
        val output = temporaryFolder.newFolder("output")
        task.docsArtifacts.from(artifact)
        task.snippetsOutDir.set(output)

        task.run()

        assertEquals(
            "kotlin sample",
            output.resolve("assets/examples/kotlin/Sample.kt").readText(),
        )
        assertEquals("[]", output.resolve("meta/samples.json").readText())
        assertTrue(!output.resolve("META-INF/other/Ignored.kt").exists())
        assertTrue(!output.resolve("Ignored.kt").exists())
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
