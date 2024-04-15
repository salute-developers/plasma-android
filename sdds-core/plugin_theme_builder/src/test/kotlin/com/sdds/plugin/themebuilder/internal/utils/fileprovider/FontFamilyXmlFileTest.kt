package com.sdds.plugin.themebuilder.internal.utils.fileprovider

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontFamilyXmlFile
import org.junit.After
import org.junit.Assert
import org.junit.Test
import java.io.File

class FontFamilyXmlFileTest {

    private val resDir = File("res")
    private val fontFamilyName: String = "display"
    private val expectedOutputFile: File = File("res/font/display.xml")

    @After
    fun after() {
        resDir.deleteRecursively()
    }

    @Test
    fun `fontFamilyXmlFile создает File с корректным именем`() {
        Assert.assertEquals(expectedOutputFile, resDir.fontFamilyXmlFile(fontFamilyName))
    }
}
