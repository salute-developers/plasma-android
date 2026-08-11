package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.ShadowTokenResult
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ViewStyleGeneratorsAdditionalTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun `GradientStyleGenerator записывает параметры single layer и кеширует duplicate style`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = gradientStyleGenerator(outputResDir)

        val firstRef = underTest.addStyle(
            nameSnakeCase = "light_gradient_with_points",
            gradientLayers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                    angle = "@string/light_gradient_angle",
                    colors = "@array/light_gradient_colors",
                    stops = "@array/light_gradient_stops",
                    startX = "@string/light_gradient_start_x",
                    startY = "@string/light_gradient_start_y",
                    endX = "@string/light_gradient_end_x",
                    endY = "@string/light_gradient_end_y",
                ),
            ),
            description = "Linear with endpoints",
        )
        val duplicateRef = underTest.addStyle(
            nameSnakeCase = "light_gradient_with_points",
            gradientLayers = emptyList(),
            description = "Duplicate must not be rendered",
        )

        underTest.generate()

        val content = outputResDir.resolve("values/gradient-styles.xml").normalizedText()
        assertEquals("@style/Thmbldr.TestTheme.Gradient.LightGradientWithPoints", firstRef)
        assertEquals(firstRef, duplicateRef)
        assertEquals(
            1,
            "name=\"Thmbldr.TestTheme.Gradient.LightGradientWithPoints\"".toRegex().findAll(content).count(),
        )
        assertTrue(content.contains("<item name=\"sd_gradientType\">linear</item>"))
        assertTrue(content.contains("<item name=\"sd_startX\">@string/light_gradient_start_x</item>"))
        assertTrue(content.contains("<item name=\"sd_startY\">@string/light_gradient_start_y</item>"))
        assertTrue(content.contains("<item name=\"sd_endX\">@string/light_gradient_end_x</item>"))
        assertTrue(content.contains("<item name=\"sd_endY\">@string/light_gradient_end_y</item>"))
        assertTrue(!content.contains("Duplicate must not be rendered"))
    }

    @Test
    fun `GradientStyleGenerator записывает параметры sweep и solid gradient`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = gradientStyleGenerator(outputResDir)
        underTest.addStyle(
            nameSnakeCase = "light_gradient_sweep",
            gradientLayers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Sweep(
                    centerX = "@string/sweep_center_x",
                    centerY = "@string/sweep_center_y",
                    colors = "@array/sweep_colors",
                    stops = "@array/sweep_stops",
                ),
            ),
            description = "Sweep gradient",
        )
        underTest.addStyle(
            nameSnakeCase = "light_gradient_solid",
            gradientLayers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Solid(
                    colors = "@array/solid_colors",
                ),
            ),
            description = "Solid gradient",
        )

        underTest.generate()

        val content = outputResDir.resolve("values/gradient-styles.xml").normalizedText()
        assertTrue(content.contains("<style name=\"Thmbldr.TestTheme.Gradient.LightGradientSweep\">"))
        assertTrue(content.contains("<item name=\"sd_gradientType\">sweep</item>"))
        assertTrue(content.contains("<item name=\"sd_centerX\">@string/sweep_center_x</item>"))
        assertTrue(content.contains("<style name=\"Thmbldr.TestTheme.Gradient.LightGradientSolid\">"))
        assertTrue(content.contains("<item name=\"sd_gradientType\">solid</item>"))
        assertTrue(content.contains("<item name=\"sd_colors\">@array/solid_colors</item>"))
    }

    @Test
    fun `ShadowStyleGenerator записывает layer styles array fallback elevation и кеширует duplicate style`() {
        val outputResDir = temporaryFolder.newFolder("res")
        val underTest = shadowStyleGenerator(outputResDir)

        val firstRef = underTest.addStyle(
            tokenTechName = "down.soft.m",
            shadowLayers = listOf(
                shadowLayer("first", fallbackElevationRef = "@dimen/thmbldr_shadow_fallback_elevation"),
                shadowLayer("second"),
            ),
            description = "Layered shadow",
        )
        val duplicateRef = underTest.addStyle(
            tokenTechName = "down.soft.m",
            shadowLayers = emptyList(),
            description = "Duplicate must not be rendered",
        )

        underTest.generate()

        val content = outputResDir.resolve("values/styles-shadows.xml").normalizedText()
        assertEquals("@style/Thmbldr.TestTheme.Shadow.DownSoftM", firstRef)
        assertEquals(firstRef, duplicateRef)
        assertEquals(1, "name=\"Thmbldr.TestTheme.Shadow.DownSoftM\"".toRegex().findAll(content).count())
        assertTrue(content.contains("<style name=\"Thmbldr.TestTheme.ShadowLayer\"/>"))
        assertTrue(content.contains("<style name=\"Thmbldr.TestTheme.ShadowLayer.DownSoftMLayer1\">"))
        assertTrue(content.contains("<style name=\"Thmbldr.TestTheme.ShadowLayer.DownSoftMLayer2\">"))
        assertTrue(content.contains("<integer-array name=\"thmbldr_shadow_down_soft_m_layers\">"))
        assertTrue(content.contains("<item name=\"sd_shadowLayers\">@array/thmbldr_shadow_down_soft_m_layers</item>"))
        assertTrue(
            content.contains(
                "<item name=\"sd_shadowFallbackElevation\">@dimen/thmbldr_shadow_fallback_elevation</item>",
            ),
        )
        assertTrue(!content.contains("Duplicate must not be rendered"))
    }

    private fun gradientStyleGenerator(outputResDir: java.io.File): GradientStyleGenerator =
        GradientStyleGenerator(
            outputResDir = outputResDir,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
        )

    private fun shadowStyleGenerator(outputResDir: java.io.File): ShadowStyleGenerator =
        ShadowStyleGenerator(
            outputResDir = outputResDir,
            xmlBuilderFactory = XmlResourcesDocumentBuilderFactory("thmbldr", "TestTheme"),
            resourceReferenceProvider = ResourceReferenceProvider("thmbldr", "TestTheme"),
        )

    private fun shadowLayer(
        name: String,
        fallbackElevationRef: String? = null,
    ): ShadowTokenResult.ShadowLayer =
        ShadowTokenResult.ShadowLayer(
            colorRef = "@color/thmbldr_shadow_${name}_color",
            offsetXRef = "@dimen/thmbldr_shadow_${name}_offset_x",
            offsetYRef = "@dimen/thmbldr_shadow_${name}_offset_y",
            spreadRef = "@dimen/thmbldr_shadow_${name}_spread",
            blurRef = "@dimen/thmbldr_shadow_${name}_blur",
            fallbackElevationRef = fallbackElevationRef,
        )

    private fun java.io.File.normalizedText(): String =
        readText().replace("\r\n", "\n").replace("\r", "\n")
}
