package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import org.junit.Assert.assertEquals
import org.junit.Test

class ColorPropertyMapperTest {

    @Test
    fun `возвращает SolidColor без состояний`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "labelColor"),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals("labelColor(SolidColor(TestTheme.colors.textDefaultPrimary))", builderCall)
    }

    @Test
    fun `возвращает SolidColor с alpha`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "labelColor"),
            tokenValue = SolidColor(
                default = "text.default.primary",
                alpha = 0.4f,
            ),
            variationId = "",
        )

        assertEquals(
            "labelColor(SolidColor(TestTheme.colors.textDefaultPrimary).multiplyAlpha(0.4f))",
            builderCall,
        )
    }

    @Test
    fun `возвращает Gradient как layered`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background"),
            tokenValue = Gradient("surface.default.solidCard"),
            variationId = "",
        )

        assertEquals(
            "background(TestTheme.gradients.surfaceDefaultSolidCard.asLayered())",
            builderCall,
        )
    }

    @Test
    fun `возвращает смешанный стэйт с цветом и градиентом`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background"),
            tokenValue = SolidColor(
                default = "surface.default.clear",
                states = listOf(
                    ColorState(
                        state = listOf("pressed"),
                        value = "surface.default.solidCard",
                        type = "gradient",
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "background(SolidColor(TestTheme.colors.surfaceDefaultClear)" +
                ".asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TestTheme.gradients.surfaceDefaultSolidCard.asLayered()))",
            builderCall,
        )
    }

    @Test
    fun `возвращает color со state color и gradient`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background"),
            tokenValue = SolidColor(
                default = "surface.default.clear",
                states = listOf(
                    ColorState(
                        state = listOf("pressed"),
                        value = "surface.default.solidCard",
                        type = "color",
                    ),
                    ColorState(
                        state = listOf("pressed", "hovered"),
                        value = "surface.default.gradient",
                        type = "gradient",
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "background(SolidColor(TestTheme.colors.surfaceDefaultClear)" +
                ".asStatefulValue(" +
                "setOf(InteractiveState.Pressed) to SolidColor(TestTheme.colors.surfaceDefaultSolidCard), " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TestTheme.gradients.surfaceDefaultGradient.asLayered()))",
            builderCall,
        )
    }

    @Test
    fun `возвращает gradient со state color и gradient`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background"),
            tokenValue = Gradient(
                default = "surface.default.clear",
                states = listOf(
                    ColorState(
                        state = listOf("pressed"),
                        value = "surface.default.solidCard",
                        type = "color",
                    ),
                    ColorState(
                        state = listOf("pressed", "hovered"),
                        value = "surface.default.gradient",
                        type = "gradient",
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "background(TestTheme.gradients.surfaceDefaultClear.asLayered()" +
                ".asStatefulValue(" +
                "setOf(InteractiveState.Pressed) to SolidColor(TestTheme.colors.surfaceDefaultSolidCard), " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TestTheme.gradients.surfaceDefaultGradient.asLayered()))",
            builderCall,
        )
    }

    private fun colorParam(methodName: String) = ColorPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
