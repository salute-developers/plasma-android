package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.SpacingTokenResult
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ViewAttributeGeneratorsTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `ViewSpacingAttributeGenerator генерирует spacing attrs с prefix`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = ViewSpacingAttributeGenerator(
            xmlDocumentBuilder = xmlBuilder(),
            outputResDir = outputResDir,
            attrPrefix = "thmbldr",
        )
        underTest.setSpacingTokenData(
            listOf(
                SpacingTokenResult.TokenData(
                    attrName = "spacingS",
                    tokenRefName = "@dimen/thmbldr_spacing_s",
                ),
                SpacingTokenResult.TokenData(
                    attrName = "spacingM",
                    tokenRefName = "@dimen/thmbldr_spacing_m",
                ),
            ),
        )

        underTest.generate()

        val content = outputResDir.resolve("values/spacing-attributes.xml").normalizedText()
        assertTrue(content.contains("<!--Spacing-->"))
        assertTrue(content.contains("<attr format=\"reference\" name=\"thmbldr_spacingS\"/>"))
        assertTrue(content.contains("<attr format=\"reference\" name=\"thmbldr_spacingM\"/>"))
    }

    @Test
    fun `ViewXmlGradientAttributeGenerator генерирует merged gradient attrs с prefix`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = ViewXmlGradientAttributeGenerator(
            xmlDocumentBuilder = xmlBuilder(),
            outputResDir = outputResDir,
            attrPrefix = "thmbldr",
        )
        underTest.setGradientTokenData(
            GradientTokenResult.ViewTokenData(
                light = mapOf(
                    "gradientAccent" to gradient("light_gradient_accent"),
                ),
                dark = mapOf(
                    "gradientAccent" to gradient("dark_gradient_accent"),
                    "gradientSurface" to gradient("dark_gradient_surface"),
                ),
            ),
        )

        underTest.generate()

        val content = outputResDir.resolve("values/gradient-attributes.xml").normalizedText()
        assertTrue(content.contains("<!--Gradient attributes-->"))
        assertEquals(1, "thmbldr_gradientAccent".toRegex().findAll(content).count())
        assertTrue(content.contains("<attr format=\"reference\" name=\"thmbldr_gradientAccent\"/>"))
        assertTrue(content.contains("<attr format=\"reference\" name=\"thmbldr_gradientSurface\"/>"))
    }

    private fun xmlBuilder(): XmlResourcesDocumentBuilder =
        XmlResourcesDocumentBuilder(
            tokenPrefix = "thmbldr",
            rootAttributes = XmlResourcesDocumentBuilder.DEFAULT_ROOT_ATTRIBUTES,
            themeName = "TestTheme",
        )

    private fun gradient(nameSnakeCase: String): GradientTokenResult.ViewTokenData.Gradient =
        GradientTokenResult.ViewTokenData.Gradient(
            nameSnakeCase = nameSnakeCase,
            layers = emptyList(),
            description = nameSnakeCase,
            isTextGradient = false,
        )

    private fun java.io.File.normalizedText(): String =
        readText().replace("\r\n", "\n").replace("\r", "\n")
}
