package com.sdds.plugin.themebuilder.internal.utils.fileprovider

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontDir
import org.junit.After
import org.junit.Assert
import org.junit.Test
import java.io.File

class FontDirTest {

    private val inputDir: File = File("res")
    private val expectedOutputDir: File = File("res/font")

    @After
    fun after() {
        inputDir.deleteRecursively()
    }

    @Test
    fun `fontDir создает директорию font в указанной директории`() {
        Assert.assertEquals(expectedOutputDir, inputDir.fontDir())
        Assert.assertTrue(expectedOutputDir.exists())
    }
}
