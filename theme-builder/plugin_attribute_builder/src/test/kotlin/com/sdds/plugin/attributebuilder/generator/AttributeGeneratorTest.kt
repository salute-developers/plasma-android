package com.sdds.plugin.attributebuilder.generator

import com.sdds.plugin.attributebuilder.AttributeBuilderTarget
import com.sdds.plugin.attributebuilder.internal.data.AttributeData
import com.sdds.plugin.attributebuilder.internal.factory.GeneratorFactory
import com.sdds.plugin.attributebuilder.internal.factory.KtAttributeGeneratorFactory
import com.sdds.plugin.attributebuilder.internal.factory.XmlAttributeGeneratorFactory
import com.sdds.plugin.attributebuilder.internal.factory.XmlDocumentBuilderFactory
import com.sdds.plugin.attributebuilder.internal.generator.AttributeGenerator
import com.sdds.plugin.attributebuilder.internal.generator.KtAttributeGenerator
import com.sdds.plugin.attributebuilder.internal.generator.XmlAttributeGenerator
import com.sdds.plugin.core.token.ColorToken
import com.sdds.plugin.core.token.Token
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.File

class AttributeGeneratorTest {

    private lateinit var mockOutputResDir: File
    private lateinit var mockOutputDir: File
    private lateinit var underTest: AttributeGenerator
    private lateinit var mockXmlDocumentBuilderFactory: XmlDocumentBuilderFactory
    private lateinit var mockXmlGeneratorFactory: XmlAttributeGeneratorFactory
    private lateinit var mockKtGeneratorFactory: KtAttributeGeneratorFactory
    private lateinit var mockXmlGenerator: XmlAttributeGenerator
    private lateinit var mockKtGenerator: KtAttributeGenerator

    @Before
    fun before() {
        mockOutputResDir = mockk<File>(relaxed = true)
        mockOutputDir = mockk<File>(relaxed = true)
        mockXmlDocumentBuilderFactory = mockk(relaxed = true)
        mockKtGeneratorFactory = mockk(relaxed = true)
        mockXmlGenerator = mockk(relaxed = true)
        mockKtGenerator = mockk(relaxed = true)
        mockXmlGeneratorFactory = mockk(relaxed = true)

        every { mockXmlGeneratorFactory.create() } returns mockXmlGenerator
        every { mockKtGeneratorFactory.create() } returns mockKtGenerator

        val generatorFactory = GeneratorFactory(
            target = AttributeBuilderTarget.View("sdds"),
            xmlAttributeGeneratorFactory = mockXmlGeneratorFactory,
            ktAttributeGeneratorFactory = mockKtGeneratorFactory,
        )

        underTest = generatorFactory.createAttributeGenerator()
    }

    @After
    fun after() {
        clearAllMocks(true)
    }

    @Test
    fun `AttributeGenerator должен генерировать xml атрибуты из списка токенов`() {
        underTest.generateFrom(inputTokens)

        verify {
            mockXmlGenerator.generate(
                attributeData = AttributeData(colors = outputAttrs),
                attrPrefix = "sdds"
            )
        }
    }

    private companion object {
        val inputTokens = listOf<Token>(
            ColorToken(
                displayName = "textPrimary",
                name = "light.text.primary",
                tags = setOf("light", "text"),
                enabled = true,
                description = "description 1"
            ),
            ColorToken(
                displayName = "textPrimary",
                name = "dark.text.primary",
                tags = setOf("dark", "text"),
                enabled = true,
                description = ""
            ),
            ColorToken(
                displayName = "textTertiary",
                name = "light.text.tertiary",
                tags = setOf("light", "text"),
                enabled = true,
                description = "description 2"
            ),
        )
        val outputAttrs = listOf("textPrimary", "textTertiary")
    }
}
