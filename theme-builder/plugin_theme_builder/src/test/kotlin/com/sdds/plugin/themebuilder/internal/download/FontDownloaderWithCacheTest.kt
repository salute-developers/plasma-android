package com.sdds.plugin.themebuilder.internal.download

import io.mockk.clearAllMocks
import io.mockk.mockk
import io.mockk.unmockkStatic
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Unit тесты [FontDownloaderWithCache]
 */
class FontDownloaderWithCacheTest {

    private lateinit var underTest: FontDownloader
    private lateinit var fileDownloader: FileDownloader

    @Before
    fun setUp() {
        fileDownloader = mockk<FileDownloader>(relaxed = true)
        underTest = FontDownloaderWithCache(fileDownloader)
    }

    @Test
    fun `download загружает файл шрифта в fontDir, если он еще не был загружен`() {
        val fontDir = File("fontDir")

        val linkOne = "link/FontOne.otf"
        val linkTwo = "link/Font-SampleTwo.otf"

        val fontFileOne = File("fontDir/font_one.otf")
        val fontFileTwo = File("fontDir/font_sample_two.otf")

        underTest.download(linkOne, fontDir)
        underTest.download(linkOne, fontDir)
        underTest.download(linkTwo, fontDir)

        verify(exactly = 1) { fileDownloader.download(linkOne, fontFileOne) }
        verify(exactly = 1) { fileDownloader.download(linkTwo, fontFileTwo) }
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkStatic(DocumentBuilderFactory::class)
    }
}
