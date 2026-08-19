package com.sdds.plugin.themebuilder

import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.FileNotFoundException

class FetchFileTaskTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `fetch записывает байты файла в output файл`() {
        val source = temporaryFolder.newFile("source.bin").apply {
            writeBytes(byteArrayOf(1, 2, 3, 4))
        }
        val output = temporaryFolder.root.resolve("downloaded.bin")
        val task = fetchFileTask()
        task.url.set(source.toURI().toURL().toString())
        task.file.set(output)
        task.failMessage.set("Cannot download test file")

        task.fetch()

        assertArrayEquals(source.readBytes(), output.readBytes())
    }

    @Test
    fun `fetch пробрасывает исключение если файл не удалось скачать`() {
        val missingSource = temporaryFolder.root.resolve("missing-source.bin")
        val output = temporaryFolder.root.resolve("downloaded-after-error.bin")
        val task = fetchFileTask()
        task.url.set(missingSource.toURI().toURL().toString())
        task.file.set(output)
        task.failMessage.set("Cannot download test file")

        assertThrows(FileNotFoundException::class.java) {
            task.fetch()
        }
        assertFalse(output.exists())
    }

    private fun fetchFileTask(): FetchFileTask {
        val project = ProjectBuilder.builder()
            .withProjectDir(temporaryFolder.newFolder())
            .build()
        return project.tasks.register("fetchFile", FetchFileTask::class.java).get()
    }
}
