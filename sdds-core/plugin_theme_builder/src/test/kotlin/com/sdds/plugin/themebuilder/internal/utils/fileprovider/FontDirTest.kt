package com.sdds.plugin.themebuilder.internal.utils.fileprovider

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fontDir
import org.junit.After
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.io.File

@RunWith(Parameterized::class)
class FontDirTest(
    private val inputDir: File,
    private val expectedOutputDir: File,
) {

    @After
    fun after() {
        files.forEach {
            it.second.delete()
        }
    }

    @Test
    fun `fontDir создает директорию font в указанной директории`() {
        Assert.assertEquals(expectedOutputDir, inputDir.fontDir())
        Assert.assertTrue(expectedOutputDir.exists())
    }

    companion object {

        private val files = listOf(
            Pair(File("res"), File("res/font")),
            Pair(File("path/res"), File("path/res/font")),
            Pair(File("root/path/res"), File("root/path/res/font")),
        )

        @JvmStatic
        @Parameterized.Parameters
        fun data() = files.map {
            arrayOf(it.first, it.second)
        }
    }
}
