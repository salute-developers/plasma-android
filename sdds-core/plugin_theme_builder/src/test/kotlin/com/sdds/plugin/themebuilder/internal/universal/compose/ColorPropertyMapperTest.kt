package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.ColorState
import com.sdds.plugin.themebuilder.internal.universal.Gradient
import com.sdds.plugin.themebuilder.internal.universal.SolidColor
import com.sdds.plugin.themebuilder.internal.universal.compose.mappers.ColorPropertyMapper
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import java.lang.reflect.InvocationTargetException

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
    fun `возвращает StatefulValue Brush даже при наличии InteractiveColor overload`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "labelColor",
                paramQualifiedType = STATEFUL_VALUE_TYPE,
                valueQualifiedType = BRUSH_TYPE,
                hasInteractiveColorOverload = true,
                hasBrushOverload = true,
            ),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals(
            "labelColor(SolidColor(TestTheme.colors.textDefaultPrimary).asStatefulValue())",
            builderCall,
        )
    }

    @Test
    fun `возвращает StatefulValue Color без обертки SolidColor`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "labelColor",
                paramQualifiedType = STATEFUL_VALUE_TYPE,
                valueQualifiedType = COLOR_TYPE,
                hasInteractiveColorOverload = true,
                hasBrushOverload = true,
            ),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals(
            "labelColor(TestTheme.colors.textDefaultPrimary.asStatefulValue())",
            builderCall,
        )
    }

    @Test
    fun `выбирает StatefulValue Color для цвета и Brush для градиента`() {
        val overloads = listOf(
            colorParam(
                methodName = "background",
                paramQualifiedType = INTERACTIVE_COLOR_TYPE,
                valueQualifiedType = INTERACTIVE_COLOR_TYPE,
            ),
            colorParam(
                methodName = "background",
                paramQualifiedType = STATEFUL_VALUE_TYPE,
                valueQualifiedType = COLOR_TYPE,
            ),
            colorParam(
                methodName = "background",
                paramQualifiedType = BRUSH_TYPE,
                valueQualifiedType = BRUSH_TYPE,
            ),
        )

        val colorMeta = overloads.selectOverload(SolidColor("surface.default.clear")) as ComposeColorPropertyMeta
        val gradientMeta = overloads.selectOverload(Gradient("surface.default.gradient")) as ComposeColorPropertyMeta

        assertEquals(STATEFUL_VALUE_TYPE, colorMeta.paramQualifiedType)
        assertEquals(COLOR_TYPE, colorMeta.valueQualifiedType)
        assertEquals(BRUSH_TYPE, gradientMeta.paramQualifiedType)
        assertEquals(BRUSH_TYPE, gradientMeta.valueQualifiedType)
    }

    @Test
    fun `выбирает Color раньше Brush для обычного цвета`() {
        val overloads = listOf(
            colorParam(
                methodName = "background",
                paramQualifiedType = BRUSH_TYPE,
                valueQualifiedType = BRUSH_TYPE,
            ),
            colorParam(
                methodName = "backgroundColor",
                paramQualifiedType = COLOR_TYPE,
                valueQualifiedType = COLOR_TYPE,
            ),
        )

        val colorMeta = overloads.selectOverload(SolidColor("surface.default.clear")) as ComposeColorPropertyMeta
        val gradientMeta = overloads.selectOverload(Gradient("surface.default.gradient")) as ComposeColorPropertyMeta

        assertEquals("backgroundColor", colorMeta.methodName)
        assertEquals(COLOR_TYPE, colorMeta.valueQualifiedType)
        assertEquals("background", gradientMeta.methodName)
        assertEquals(BRUSH_TYPE, gradientMeta.valueQualifiedType)
    }

    @Test
    fun `возвращает StatefulValue Brush с кастомным состоянием`() {
        val underTest = ColorPropertyMapper(
            stateEnum = ComposeStateEnum(
                qualifiedName = "com.sdds.compose.uikit.SwitchStates",
                simpleName = "SwitchStates",
                values = listOf(ComposeEnumValueInfo(name = "Checked", configName = "checked")),
            ),
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "toggleTrackColor",
                paramQualifiedType = STATEFUL_VALUE_TYPE,
                valueQualifiedType = BRUSH_TYPE,
                hasInteractiveColorOverload = true,
                hasBrushOverload = true,
            ),
            tokenValue = SolidColor(
                default = "surface.default.clear",
                states = listOf(
                    ColorState(state = listOf("checked"), value = "surface.default.accent"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "toggleTrackColor(SolidColor(TestTheme.colors.surfaceDefaultClear).asStatefulValue(" +
                "setOf(SwitchStates.Checked) to SolidColor(TestTheme.colors.surfaceDefaultAccent)))",
            builderCall,
        )
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
            "background(listOf(singleColor(TestTheme.colors.surfaceDefaultClear)).asLayered()" +
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
            "background(listOf(singleColor(TestTheme.colors.surfaceDefaultClear)).asLayered()" +
                ".asStatefulValue(" +
                "setOf(InteractiveState.Pressed) " +
                "to listOf(singleColor(TestTheme.colors.surfaceDefaultSolidCard)).asLayered(), " +
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
                "setOf(InteractiveState.Pressed) " +
                "to listOf(singleColor(TestTheme.colors.surfaceDefaultSolidCard)).asLayered(), " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TestTheme.gradients.surfaceDefaultGradient.asLayered()))",
            builderCall,
        )
    }

    @Test
    fun `возвращает InteractiveColor без состояний`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "labelColor", paramQualifiedType = INTERACTIVE_COLOR_TYPE),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals("labelColor(TestTheme.colors.textDefaultPrimary.asInteractive())", builderCall)
    }

    @Test
    fun `возвращает InteractiveColor с alpha`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "labelColor", paramQualifiedType = INTERACTIVE_COLOR_TYPE),
            tokenValue = SolidColor(
                default = "text.default.primary",
                alpha = 0.4f,
            ),
            variationId = "",
        )

        assertEquals(
            "labelColor(TestTheme.colors.textDefaultPrimary.multiplyAlpha(0.4f).asInteractive())",
            builderCall,
        )
    }

    @Test
    fun `возвращает InteractiveColor с состояниями`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "labelColor", paramQualifiedType = INTERACTIVE_COLOR_TYPE),
            tokenValue = SolidColor(
                default = "text.default.primary",
                states = listOf(
                    ColorState(state = listOf("focused"), value = "text.default.secondary"),
                    ColorState(state = listOf("hovered"), value = "text.default.tertiary"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "labelColor(TestTheme.colors.textDefaultPrimary.asInteractive(" +
                "setOf(InteractiveState.Focused) to TestTheme.colors.textDefaultSecondary, " +
                "setOf(InteractiveState.Hovered) to TestTheme.colors.textDefaultTertiary))",
            builderCall,
        )
    }

    @Test
    fun `возвращает Gradient с alpha без состояний`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background"),
            tokenValue = Gradient("surface.default.solidCard", alpha = 0.5f),
            variationId = "",
        )

        assertEquals(
            "background(TestTheme.gradients.surfaceDefaultSolidCard.asLayered(0.5f))",
            builderCall,
        )
    }

    @Test
    fun `возвращает Gradient с StatefulValue param без состояний`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(methodName = "background", paramQualifiedType = STATEFUL_VALUE_TYPE),
            tokenValue = Gradient("surface.default.solidCard"),
            variationId = "",
        )

        assertEquals(
            "background(TestTheme.gradients.surfaceDefaultSolidCard.asLayered().asStatefulValue())",
            builderCall,
        )
    }

    @Test
    fun `возвращает SolidColor как обычный Color без состояний`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "textColor",
                paramQualifiedType = COLOR_TYPE,
                valueQualifiedType = COLOR_TYPE,
            ),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals(
            "textColor(TestTheme.colors.textDefaultPrimary)",
            builderCall,
        )
    }

    @Test
    fun `возвращает SolidColor как обычный Color с состояниями`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "textColor",
                paramQualifiedType = COLOR_TYPE,
                valueQualifiedType = COLOR_TYPE,
            ),
            tokenValue = SolidColor(
                default = "text.default.primary",
                states = listOf(
                    ColorState(state = listOf("focused"), value = "text.default.secondary"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "textColor(TestTheme.colors.textDefaultPrimary.asStatefulValue(" +
                "setOf(InteractiveState.Focused) to TestTheme.colors.textDefaultSecondary))",
            builderCall,
        )
    }

    @Test
    fun `возвращает SolidColor как обычный Color с кастомным stateEnum`() {
        val underTest = ColorPropertyMapper(
            stateEnum = ComposeStateEnum(
                qualifiedName = "com.sdds.compose.uikit.AvatarStatus",
                simpleName = "AvatarStatus",
                values = listOf(ComposeEnumValueInfo(name = "Inactive", configName = "inactive")),
            ),
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "bgColor",
                paramQualifiedType = COLOR_TYPE,
                valueQualifiedType = COLOR_TYPE,
            ),
            tokenValue = SolidColor(
                default = "surface.default.solid",
                states = listOf(
                    ColorState(state = listOf("inactive"), value = "surface.default.tertiary"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "bgColor(TestTheme.colors.surfaceDefaultSolid.asStatefulValue(" +
                "setOf(AvatarStatus.Inactive) to TestTheme.colors.surfaceDefaultTertiary))",
            builderCall,
        )
    }

    @Test
    fun `возвращает InteractiveColor с кастомным stateEnum`() {
        val underTest = ColorPropertyMapper(
            stateEnum = ComposeStateEnum(
                qualifiedName = "com.sdds.compose.uikit.SwitchStates",
                simpleName = "SwitchStates",
                values = listOf(ComposeEnumValueInfo(name = "Checked", configName = "checked")),
            ),
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "trackColor",
                paramQualifiedType = INTERACTIVE_COLOR_TYPE,
            ),
            tokenValue = SolidColor(
                default = "surface.default.clear",
                states = listOf(
                    ColorState(state = listOf("checked"), value = "surface.default.accent"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "trackColor(TestTheme.colors.surfaceDefaultClear.asInteractive(" +
                "setOf(SwitchStates.Checked) to TestTheme.colors.surfaceDefaultAccent))",
            builderCall,
        )
    }

    @Test
    fun `getTokenRef оборачивает SolidColor в Brush и добавляет alpha`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val result = underTest.getTokenRef(
            value = "surface.default.card",
            token = SolidColor(
                default = "surface.default.default",
                alpha = 0.2f,
            ),
            meta = colorParam(methodName = "background"),
        )

        assertEquals(
            "SolidColor(TestTheme.colors.surfaceDefaultCard).multiplyAlpha(0.2f)",
            result,
        )
    }

    @Test
    fun `getTokenRef возвращает Gradient как layered с alpha`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val result = underTest.getTokenRef(
            value = "surface.default.card",
            token = Gradient(
                default = "surface.default.default",
                alpha = 0.3f,
            ),
            meta = colorParam(methodName = "background"),
        )

        assertEquals(
            "TestTheme.gradients.surfaceDefaultCard.asLayered(0.3f)",
            result,
        )
    }

    @Test
    fun `возвращает Gradient state без явного type как gradient`() {
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
                        value = "surface.default.gradient",
                        alpha = 0.6f,
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "background(TestTheme.gradients.surfaceDefaultClear.asLayered()" +
                ".asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TestTheme.gradients.surfaceDefaultGradient.asLayered(0.6f)))",
            builderCall,
        )
    }

    @Test
    fun `возвращает InteractiveColor если valueQualifiedType пустой а param содержит InteractiveColor`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = colorParam(
                methodName = "labelColor",
                paramQualifiedType = INTERACTIVE_COLOR_TYPE,
                valueQualifiedType = "",
            ),
            tokenValue = SolidColor("text.default.primary"),
            variationId = "",
        )

        assertEquals("labelColor(TestTheme.colors.textDefaultPrimary.asInteractive())", builderCall)
    }

    @Test
    fun `падает если state color type неизвестен`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val exception = assertThrows(ThemeBuilderException::class.java) {
            underTest.map(
                meta = colorParam(methodName = "background"),
                tokenValue = SolidColor(
                    default = "surface.default.clear",
                    states = listOf(
                        ColorState(
                            state = listOf("pressed"),
                            value = "surface.default.bitmap",
                            type = "bitmap",
                        ),
                    ),
                ),
                variationId = "",
            )
        }

        assertEquals("Unknown gradient or color type bitmap", exception.message)
    }

    @Test
    fun `getStateTokenRef использует color type по умолчанию для SolidColor`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val result = underTest.stateTokenRef(
            value = "surface.default.pressed",
            state = ColorState(state = listOf("pressed"), value = "surface.default.pressed"),
            token = SolidColor(
                default = "surface.default.clear",
                alpha = 0.2f,
            ),
            meta = colorParam(methodName = "background"),
        )

        assertEquals(
            "SolidColor(TestTheme.colors.surfaceDefaultPressed).multiplyAlpha(0.2f)",
            result,
        )
    }

    @Test
    fun `getStateTokenRef использует gradient type по умолчанию для Gradient`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val result = underTest.stateTokenRef(
            value = "surface.default.pressed",
            state = ColorState(state = listOf("pressed"), value = "surface.default.pressed"),
            token = Gradient(
                default = "surface.default.clear",
                alpha = 0.3f,
            ),
            meta = colorParam(methodName = "background"),
        )

        assertEquals(
            "TestTheme.gradients.surfaceDefaultPressed.asLayered(0.3f)",
            result,
        )
    }

    @Test
    fun `getStateTokenRef падает если state type неизвестен`() {
        val underTest = ColorPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val exception = assertThrows(ThemeBuilderException::class.java) {
            underTest.stateTokenRef(
                value = "surface.default.bitmap",
                state = ColorState(
                    state = listOf("pressed"),
                    value = "surface.default.bitmap",
                    type = "bitmap",
                ),
                token = SolidColor(default = "surface.default.clear"),
                meta = colorParam(methodName = "background"),
            )
        }

        assertEquals("Unknown gradient or color type bitmap", exception.message)
    }
    private fun ColorPropertyMapper.stateTokenRef(
        value: String,
        state: ColorState,
        token: Color,
        meta: ComposeColorPropertyMeta,
        resSuffix: String = "",
    ): String {
        val method = ColorPropertyMapper::class.java.getDeclaredMethod(
            "getStateTokenRef",
            String::class.java,
            ColorState::class.java,
            Color::class.java,
            ComposeColorPropertyMeta::class.java,
            String::class.java,
        )
        method.isAccessible = true
        return try {
            method.invoke(this, value, state, token, meta, resSuffix) as String
        } catch (exception: InvocationTargetException) {
            throw exception.targetException
        }
    }

    private fun colorParam(
        methodName: String,
        paramQualifiedType: String = BRUSH_TYPE,
        valueQualifiedType: String = paramQualifiedType,
        hasInteractiveColorOverload: Boolean = false,
        hasBrushOverload: Boolean = false,
    ) = ComposeColorPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = paramQualifiedType,
        paramSimpleType = "",
        group = "",
        valueQualifiedType = valueQualifiedType,
        hasInteractiveColorOverload = hasInteractiveColorOverload,
        hasBrushOverload = hasBrushOverload,
    )

    private companion object {
        const val BRUSH_TYPE = "androidx.compose.ui.graphics.Brush"
        const val COLOR_TYPE = "androidx.compose.ui.graphics.Color"
        const val INTERACTIVE_COLOR_TYPE = "com.sdds.compose.uikit.interactions.InteractiveColor"
        const val STATEFUL_VALUE_TYPE = "com.sdds.compose.uikit.interactions.StatefulValue"
    }
}
