package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shadowsStylesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.getResourceAsText
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * Unit тесты для [ShadowStyleGenerator]
 * @author Малышев Александр on 28.01.2025
 */
class ShadowStyleGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ShadowStyleGenerator

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        underTest = ShadowStyleGenerator(
            outputResDir = mockOutputResDir,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
        )
    }

    @After
    fun tearDown() {
        unmockkObject(FileProvider)
        clearAllMocks()
    }

    @Test
    fun `ShadowStyleGenerator создает стиль и возвращает ссылку на него`() {
        val outputXml = ByteArrayOutputStream()
        val shadowsStyleFile = mockk<File>(relaxed = true)
        every { shadowsStyleFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.shadowsStylesXmlFile() } returns shadowsStyleFile

        val styleRef = underTest.addStyle(testShadow.tokenTechName, testShadow.layers, testShadow.tokenDescription)

        underTest.generate()

        assertEquals("@style/Thmbldr.TestTheme.Shadow.DownSoftS", styleRef)

        assertEquals(
            getResourceAsText("shadow-outputs/test-shadow-styles-output.xml"),
            outputXml.toString(),
        )
    }

    private companion object {
        val testShadow = ShadowTokenResult.TokenData(
            tokenTechName = "down.soft.s",
            layers = listOf(
                ShadowTokenResult.ShadowLayer(
                    colorRef = "@color/thmbldr_shadow_down_soft_s_color",
                    offsetXRef = "@dimen/thmbldr_shadow_down_soft_s_offset_x",
                    offsetYRef = "@dimen/thmbldr_shadow_down_soft_s_offset_y",
                    spreadRef = "@dimen/thmbldr_shadow_down_soft_s_spread",
                    blurRef = "@dimen/thmbldr_shadow_down_soft_s_blur",
                ),
            ),
            tokenDescription = "Shadow/Down/Soft/S",
        )
    }
}
