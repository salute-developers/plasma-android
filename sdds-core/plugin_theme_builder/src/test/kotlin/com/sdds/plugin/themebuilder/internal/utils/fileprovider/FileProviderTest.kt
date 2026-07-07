package com.sdds.plugin.themebuilder.internal.utils.fileprovider

import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.componentStyleXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.dimensFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.drawableXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientParametersXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.gradientStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.selectorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.spacingXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.subThemeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.textAppearancesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.themeXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.typographyXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.xmlDir
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class FileProviderTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `values files возвращают файлы в директории values`() {
        val resDir = temporaryFolder.newFolder("res")

        assertEquals(File(resDir, "values/colors.xml"), resDir.colorsXmlFile())
        assertEquals(
            File(resDir, "values/gradient-parameters.xml"),
            resDir.gradientParametersXmlFile(),
        )
        assertEquals(File(resDir, "values/gradient-styles.xml"), resDir.gradientStylesXmlFile())
        assertEquals(File(resDir, "values/dimens.xml"), resDir.dimensFile())
        assertEquals(File(resDir, "values/style-dimens.xml"), resDir.dimensFile("style"))
        assertEquals(File(resDir, "values/shapes.xml"), resDir.shapesXmlFile())
        assertEquals(File(resDir, "values/shadows.xml"), resDir.shadowsXmlFile())
        assertEquals(File(resDir, "values/styles-shadows.xml"), resDir.shadowsStylesXmlFile())
        assertEquals(File(resDir, "values/spacing.xml"), resDir.spacingXmlFile())
        assertEquals(File(resDir, "values/button-attributes.xml"), resDir.attrsFile("button"))
        assertEquals(
            File(resDir, "values/styles-button.xml"),
            resDir.componentStyleXmlFile("Button"),
        )

        assertTrue(File(resDir, "values").exists())
    }

    @Test
    fun `resource files возвращают файлы в drawable color и xml директориях`() {
        val resDir = temporaryFolder.newFolder("res")

        assertEquals(File(resDir, "drawable/button_bg.xml"), resDir.drawableXmlFile("button_bg"))
        assertEquals(
            File(resDir, "drawable/thmbldr_button_bg.xml"),
            resDir.drawableXmlFile("button_bg", "thmbldr"),
        )
        assertEquals(File(resDir, "color/selector.xml"), resDir.colorXmlFile("selector"))
        assertEquals(
            File(resDir, "color/thmbldr_selector.xml"),
            resDir.colorXmlFile("selector", "thmbldr"),
        )
        assertEquals(File(resDir, "xml/state.xml"), resDir.selectorXmlFile("state"))
        assertEquals(
            File(resDir, "xml/thmbldr_state.xml"),
            resDir.selectorXmlFile("state", "thmbldr"),
        )
        assertEquals(File(resDir, "xml"), resDir.xmlDir())
        assertTrue(File(resDir, "drawable").exists())
        assertTrue(File(resDir, "color").exists())
        assertTrue(File(resDir, "xml").exists())
    }

    @Test
    fun `values files возвращают файлы в values и values с qualifier`() {
        val resDir = temporaryFolder.newFolder("res")

        assertEquals(File(resDir, "values-night/theme.xml"), resDir.themeXmlFile("night"))
        assertEquals(File(resDir, "values-night/subtheme.xml"), resDir.subThemeXmlFile("night"))
        assertEquals(
            File(resDir, "values-sw600dp/typography.xml"),
            resDir.typographyXmlFile("sw600dp"),
        )
        assertEquals(
            File(resDir, "values/text-appearances.xml"),
            resDir.textAppearancesXmlFile(),
        )
        assertEquals(
            File(resDir, "values-night/text-appearances.xml"),
            resDir.textAppearancesXmlFile("night"),
        )
        assertEquals(File(resDir, "values/theme.xml"), resDir.themeXmlFile())
        assertEquals(File(resDir, "values/typography.xml"), resDir.typographyXmlFile())
        assertTrue(File(resDir, "values-night").exists())
        assertTrue(File(resDir, "values-sw600dp").exists())
    }

    @Test
    fun `fileWriter записывает файлы`() {
        val file = temporaryFolder.newFile("file")
        file.fileWriter().use { writer ->
            writer.write("test")
        }

        assertEquals("test", file.readText())
    }

    @Test
    fun `subThemeXmlFile возвращает файл с subtheme в values`() {
        val resDir = temporaryFolder.newFolder("res")

        assertEquals(File(resDir, "values/subtheme.xml"), resDir.subThemeXmlFile())
    }
}
