package com.sdds.plugin.themebuilder.internal.generator.gradient

import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientDrawableGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.GradientStyleGenerator
import com.sdds.plugin.themebuilder.internal.generator.theme.view.ViewGradientGenerator
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Unit-тесты [ViewGradientGenerator]
 */
class ViewGradientGeneratorTest {

    private lateinit var gradientStyleGenerator: GradientStyleGenerator
    private lateinit var gradientDrawableGenerator: GradientDrawableGenerator
    private lateinit var underTest: ViewGradientGenerator

    @Before
    fun setup() {
        gradientStyleGenerator = mockk {
            every {
                addStyle(
                    nameSnakeCase = "light_gradient_accent",
                    gradientLayers = notTextGradient.layers,
                    description = "Accent Gradient",
                )
            } returns "@style/Gradient.LightGradientAccent"
            every {
                addStyle(
                    nameSnakeCase = "light_text_gradient_accent",
                    gradientLayers = textGradient.layers,
                    description = "Text Accent Gradient",
                )
            } returns "@style/Gradient.LightTextGradientAccent"
        }
        gradientDrawableGenerator = mockk {
            every {
                addDrawable(
                    drawableName = "light_gradient_accent",
                    styleRef = "@style/Gradient.LightGradientAccent",
                )
            } returns "@drawable/light_gradient_accent"
        }
        underTest = ViewGradientGenerator(
            gradientStyleGenerator = gradientStyleGenerator,
            gradientDrawableGenerator = gradientDrawableGenerator,
        )
    }

    @Test
    fun `ViewGradientGenerator должен корректно вызывать методы`() {
        val ref = underTest.addGradient(notTextGradient)

        verify {
            gradientStyleGenerator.addStyle(
                nameSnakeCase = "light_gradient_accent",
                gradientLayers = notTextGradient.layers,
                description = "Accent Gradient",
            )
        }

        verify {
            gradientDrawableGenerator.addDrawable(
                "light_gradient_accent",
                "@style/Gradient.LightGradientAccent",
            )
        }

        Assert.assertEquals("@drawable/light_gradient_accent", ref)
    }

    @Test
    fun `ViewGradientGenerator должен корректно вызывать методы для текстового градиента`() {
        val ref = underTest.addGradient(textGradient)

        verify {
            gradientStyleGenerator.addStyle(
                nameSnakeCase = "light_text_gradient_accent",
                gradientLayers = textGradient.layers,
                description = "Text Accent Gradient",
            )
        }

        verify(inverse = true) {
            gradientDrawableGenerator.addDrawable(
                "light_text_gradient_accent",
                "@style/Gradient.LightTextGradientAccent",
            )
        }

        Assert.assertEquals("@style/Gradient.LightTextGradientAccent", ref)
    }

    private companion object {
        val notTextGradient = GradientTokenResult.ViewTokenData.Gradient(
            nameSnakeCase = "light_gradient_accent",
            layers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                    angle = "@string/light_gradient_accent_angle_layer_3",
                    colors = "@array/light_gradient_accent_colors_layer_3",
                    stops = "@array/light_gradient_accent_stops_layer_3",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Radial(
                    centerX = "@string/light_gradient_accent_center_x_layer_2",
                    centerY = "@string/light_gradient_accent_center_y_layer_2",
                    radius = "@string/light_gradient_accent_radius_layer_2",
                    colors = "@array/light_gradient_accent_colors_layer_2",
                    stops = "@array/light_gradient_accent_stops_layer_2",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Sweep(
                    centerX = "@string/light_gradient_accent_center_x_layer_1",
                    centerY = "@string/light_gradient_accent_center_y_layer_1",
                    colors = "@array/light_gradient_accent_colors_layer_1",
                    stops = "@array/light_gradient_accent_stops_layer_1",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Solid(
                    colors = "@array/light_gradient_accent_colors_layer_0",
                ),
            ),
            description = "Accent Gradient",
            isTextGradient = false,
        )
        val textGradient = GradientTokenResult.ViewTokenData.Gradient(
            nameSnakeCase = "light_text_gradient_accent",
            layers = listOf(
                GradientTokenResult.ViewTokenData.Gradient.Layer.Linear(
                    angle = "@string/light_text_gradient_accent_angle",
                    colors = "@array/light_text_gradient_accent_colors",
                    stops = "@array/light_text_gradient_accent_stops",
                ),
            ),
            description = "Text Accent Gradient",
            isTextGradient = true,
        )
    }
}
