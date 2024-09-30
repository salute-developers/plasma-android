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
                    nameSnakeCase = "light_gradient_accent_layer_0",
                    gradientParameters = mapOf(
                        "sd_gradientType" to "linear",
                        "sd_angle" to "@string/light_gradient_accent_angle_layer_0",
                        "sd_colors" to "@array/light_gradient_accent_colors_layer_0",
                        "sd_stops" to "@array/light_gradient_accent_stops_layer_0",
                    ),
                    description = "Accent Gradient Слой 0",
                )
            } returns "@style/Gradient.LightGradientAccentLayer0"
            every {
                addStyle(
                    nameSnakeCase = "light_gradient_accent_layer_1",
                    gradientParameters = mapOf(
                        "sd_gradientType" to "radial",
                        "sd_radius" to "@string/light_gradient_accent_radius_layer_1",
                        "sd_centerX" to "@string/light_gradient_accent_center_x_layer_1",
                        "sd_centerY" to "@string/light_gradient_accent_center_y_layer_1",
                        "sd_colors" to "@array/light_gradient_accent_colors_layer_1",
                        "sd_stops" to "@array/light_gradient_accent_stops_layer_1",
                    ),
                    description = "Accent Gradient Слой 1",
                )
            } returns "@style/Gradient.LightGradientAccentLayer1"
            every {
                addStyle(
                    nameSnakeCase = "light_gradient_accent_layer_2",
                    gradientParameters = mapOf(
                        "sd_gradientType" to "sweep",
                        "sd_centerX" to "@string/light_gradient_accent_center_x_layer_2",
                        "sd_centerY" to "@string/light_gradient_accent_center_y_layer_2",
                        "sd_colors" to "@array/light_gradient_accent_colors_layer_2",
                        "sd_stops" to "@array/light_gradient_accent_stops_layer_2",
                    ),
                    description = "Accent Gradient Слой 2",
                )
            } returns "@style/Gradient.LightGradientAccentLayer2"
            every {
                addStyle(
                    nameSnakeCase = "light_gradient_accent_layer_3",
                    gradientParameters = mapOf(
                        "sd_gradientType" to "solid",
                        "sd_colors" to "@array/light_gradient_accent_colors_layer_3",
                    ),
                    description = "Accent Gradient Слой 3",
                )
            } returns "@style/Gradient.LightGradientAccentLayer3"
            every {
                addStyle(
                    nameSnakeCase = "light_text_gradient_accent",
                    gradientParameters = mapOf(
                        "sd_gradientType" to "linear",
                        "sd_angle" to "@string/light_text_gradient_accent_angle",
                        "sd_colors" to "@array/light_text_gradient_accent_colors",
                        "sd_stops" to "@array/light_text_gradient_accent_stops",
                    ),
                    description = "Text Accent Gradient",
                )
            } returns "@style/Gradient.LightTextGradientAccent"
        }
        gradientDrawableGenerator = mockk {
            every {
                addDrawable(
                    drawableName = "light_gradient_accent_layer_0",
                    styleRef = "@style/Gradient.LightGradientAccentLayer0",
                )
            } returns "@drawable/light_gradient_accent_layer_0"
            every {
                addDrawable(
                    drawableName = "light_gradient_accent_layer_1",
                    styleRef = "@style/Gradient.LightGradientAccentLayer1",
                )
            } returns "@drawable/light_gradient_accent_layer_1"
            every {
                addDrawable(
                    drawableName = "light_gradient_accent_layer_2",
                    styleRef = "@style/Gradient.LightGradientAccentLayer2",
                )
            } returns "@drawable/light_gradient_accent_layer_2"
            every {
                addDrawable(
                    drawableName = "light_gradient_accent_layer_3",
                    styleRef = "@style/Gradient.LightGradientAccentLayer3",
                )
            } returns "@drawable/light_gradient_accent_layer_3"
            every {
                addLayerListDrawable(
                    drawableName = "light_gradient_accent",
                    drawableRefs = listOf(
                        "@drawable/light_gradient_accent_layer_0",
                        "@drawable/light_gradient_accent_layer_1",
                        "@drawable/light_gradient_accent_layer_2",
                        "@drawable/light_gradient_accent_layer_3",
                    ),
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
                nameSnakeCase = "light_gradient_accent_layer_0",
                gradientParameters = mapOf(
                    "sd_gradientType" to "linear",
                    "sd_angle" to "@string/light_gradient_accent_angle_layer_0",
                    "sd_colors" to "@array/light_gradient_accent_colors_layer_0",
                    "sd_stops" to "@array/light_gradient_accent_stops_layer_0",
                ),
                description = "Accent Gradient Слой 0",
            )
        }

        verify {
            gradientStyleGenerator.addStyle(
                nameSnakeCase = "light_gradient_accent_layer_1",
                gradientParameters = mapOf(
                    "sd_gradientType" to "radial",
                    "sd_radius" to "@string/light_gradient_accent_radius_layer_1",
                    "sd_centerX" to "@string/light_gradient_accent_center_x_layer_1",
                    "sd_centerY" to "@string/light_gradient_accent_center_y_layer_1",
                    "sd_colors" to "@array/light_gradient_accent_colors_layer_1",
                    "sd_stops" to "@array/light_gradient_accent_stops_layer_1",
                ),
                description = "Accent Gradient Слой 1",
            )
        }

        verify {
            gradientStyleGenerator.addStyle(
                nameSnakeCase = "light_gradient_accent_layer_2",
                gradientParameters = mapOf(
                    "sd_gradientType" to "sweep",
                    "sd_centerX" to "@string/light_gradient_accent_center_x_layer_2",
                    "sd_centerY" to "@string/light_gradient_accent_center_y_layer_2",
                    "sd_colors" to "@array/light_gradient_accent_colors_layer_2",
                    "sd_stops" to "@array/light_gradient_accent_stops_layer_2",
                ),
                description = "Accent Gradient Слой 2",
            )
        }

        verify {
            gradientStyleGenerator.addStyle(
                nameSnakeCase = "light_gradient_accent_layer_3",
                gradientParameters = mapOf(
                    "sd_gradientType" to "solid",
                    "sd_colors" to "@array/light_gradient_accent_colors_layer_3",
                ),
                description = "Accent Gradient Слой 3",
            )
        }

        verify {
            gradientDrawableGenerator.addDrawable(
                "light_gradient_accent_layer_0",
                "@style/Gradient.LightGradientAccentLayer0",
            )
        }

        verify {
            gradientDrawableGenerator.addDrawable(
                "light_gradient_accent_layer_1",
                "@style/Gradient.LightGradientAccentLayer1",
            )
        }

        verify {
            gradientDrawableGenerator.addDrawable(
                "light_gradient_accent_layer_2",
                "@style/Gradient.LightGradientAccentLayer2",
            )
        }

        verify {
            gradientDrawableGenerator.addDrawable(
                "light_gradient_accent_layer_3",
                "@style/Gradient.LightGradientAccentLayer3",
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
                gradientParameters = mapOf(
                    "sd_gradientType" to "linear",
                    "sd_angle" to "@string/light_text_gradient_accent_angle",
                    "sd_colors" to "@array/light_text_gradient_accent_colors",
                    "sd_stops" to "@array/light_text_gradient_accent_stops",
                ),
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
                    angle = "@string/light_gradient_accent_angle_layer_0",
                    colors = "@array/light_gradient_accent_colors_layer_0",
                    stops = "@array/light_gradient_accent_stops_layer_0",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Radial(
                    centerX = "@string/light_gradient_accent_center_x_layer_1",
                    centerY = "@string/light_gradient_accent_center_y_layer_1",
                    radius = "@string/light_gradient_accent_radius_layer_1",
                    colors = "@array/light_gradient_accent_colors_layer_1",
                    stops = "@array/light_gradient_accent_stops_layer_1",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Sweep(
                    centerX = "@string/light_gradient_accent_center_x_layer_2",
                    centerY = "@string/light_gradient_accent_center_y_layer_2",
                    colors = "@array/light_gradient_accent_colors_layer_2",
                    stops = "@array/light_gradient_accent_stops_layer_2",
                ),
                GradientTokenResult.ViewTokenData.Gradient.Layer.Solid(
                    colors = "@array/light_gradient_accent_colors_layer_3",
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
