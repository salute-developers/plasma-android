package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.dimensFile
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
 * Unit тесты [DimenTokenGenerator]
 * @author Малышев Александр on 13.03.2024
 */
class DimenTokenGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var mockDimensAggregator: DimensAggregator
    private lateinit var underTest: DimenTokenGenerator

    @Before
    fun setUp() {
        mockkObject(FileProvider)
        mockOutputResDir = mockk(relaxed = true)
        mockDimensAggregator = mockk(relaxed = true)
        underTest = DimenTokenGenerator(
            outputResDir = mockOutputResDir,
            dimensAggregator = mockDimensAggregator,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
        )
    }

    @After
    fun tearDown() {
        clearAllMocks()
        unmockkObject(FileProvider)
    }

    @Test
    fun `DimenAggregator генерирует файл с размерами`() {
        val dimensFile = mockk<File>(relaxed = true)
        val fileOutput = ByteArrayOutputStream()
        val expected = getResourceAsText("test-dimens-output.xml")
        every { mockDimensAggregator.dimens } returns setOf(
            DimenData("test_dimen", 128f, DimenData.Type.DP),
        )
        every { dimensFile.fileWriter() } returns fileOutput.writer()
        every { mockOutputResDir.dimensFile() } returns dimensFile

        underTest.generate()

        assertEquals(expected, fileOutput.toString())
    }
}
