package com.sdds.plugin.themebuilder.internal.utils.fileprovider

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontFamilyXmlFile
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.io.File

@RunWith(Parameterized::class)
class FontFamilyXmlFileTest(
    private val fontDir: File,
    private val fontFamilyName: String,
    private val expectedOutputFile: File,
) {

    @Test
    fun `fontFamilyXmlFile создает File с корректным именем`() {
        Assert.assertEquals(expectedOutputFile, fontDir.fontFamilyXmlFile(fontFamilyName))
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(File("res"), "display", File("res/font/display.xml")),
            arrayOf(File("res"), "fontFamilyText", File("res/font/fontFamilyText.xml")),
            arrayOf(File("res"), "header", File("res/font/header.xml"))
        )
    }
}
