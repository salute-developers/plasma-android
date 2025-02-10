package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.fileWriter
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
 * Unit тесты [ViewShadowAttributeGenerator]
 * @author Малышев Александр on 28.01.2025
 */
class ViewShadowAttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var underTest: ViewShadowAttributeGenerator

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        underTest = ViewShadowAttributeGenerator(
            xmlDocumentBuilder = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme")
                .create(),
            outputResDir = mockOutputResDir,
            attrPrefix = "thmbldr",
        )
    }

    @After
    fun tearDown() {
        unmockkObject(FileProvider)
        clearAllMocks()
    }

    @Test
    fun `ViewShadowAttributeGenerator генерирует атрибуты теней для темы`() {
        val outputXml = ByteArrayOutputStream()
        val shadowsAttrsFile = mockk<File>(relaxed = true)
        every { shadowsAttrsFile.fileWriter() } returns outputXml.writer()
        every { mockOutputResDir.attrsFile("shadow") } returns shadowsAttrsFile

        underTest.setShadowTokenData(testShadows)
        underTest.generate()

        assertEquals(
            getResourceAsText("shadow-outputs/test-shadows-attributes.xml"),
            outputXml.toString(),
        )
    }

    private companion object {
        val testShadows = listOf(
            ShadowTokenResult.TokenData(
                tokenTechName = "down.soft.s",
                layers = emptyList(),
                tokenDescription = "Shadow/Down/Soft/S",
            ),
            ShadowTokenResult.TokenData(
                tokenTechName = "down.hard.s",
                layers = emptyList(),
                tokenDescription = "Shadow/Down/Hard/S",
            ),
        )
    }
}
