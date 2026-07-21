package com.sdds.plugin.themebuilder.internal.download

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.net.MalformedURLException

class FileDownloaderTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    private val underTest = DefaultFileDownloader()

    @Test
    fun `download записывает файл при успешной загрузке`() {
        val sourceFile = temporaryFolder.newFile("source.txt")
        val outputFile = temporaryFolder.newFile("output.txt")
        val content = "font content".toByteArray()

        sourceFile.writeBytes(content)
        val url = sourceFile.toURI().toURL().toString()
        underTest.download(url, outputFile)

        assertArrayEquals(content, outputFile.readBytes())
    }

    @Test
    fun `download прокидывает ошибку и пишет сообщение если загрузка не удалась`() {
        val outputFile = temporaryFolder.newFile("output.txt")
        val url = "bad-url"

        val exception = try {
            underTest.download(url, outputFile)
            error("Expected exception")
        } catch (exception: Exception) {
            exception
        }
        assertTrue(exception is MalformedURLException)
    }
}
