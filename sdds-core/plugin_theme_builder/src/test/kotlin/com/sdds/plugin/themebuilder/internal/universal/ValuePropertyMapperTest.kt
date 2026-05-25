package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Test

class ValuePropertyMapperTest {

    @Test
    fun `возвращает enum значение без состояний`() {
        val underTest = ValuePropertyMapper(null)

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value("outer"),
            variationId = "",
        )

        assertEquals("placement(TextFieldLabelPlacement.Outer)", builderCall)
    }

    @Test
    fun `возвращает enum значение с состояниями`() {
        val underTest = ValuePropertyMapper(null)

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value(
                value = "outer",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "inner"),
                    StringState(state = listOf("pressed", "hovered"), value = "none"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "placement(TextFieldLabelPlacement.Outer.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TextFieldLabelPlacement.Inner, setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TextFieldLabelPlacement.None))",
            builderCall,
        )
    }

    @Test
    fun `возвращает enum значение с кастомным state enum`() {
        val underTest = ValuePropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.test.TextFieldState",
                simpleName = "TextFieldState",
                values = listOf(
                    EnumValueInfo(name = "Focused", configName = "activated"),
                    EnumValueInfo(name = "Hovered", configName = "moved"),
                ),
            ),
        )

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value(
                value = "outer",
                states = listOf(
                    StringState(state = listOf("activated"), value = "inner"),
                    StringState(state = listOf("activated", "moved"), value = "none"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "placement(TextFieldLabelPlacement.Outer.asStatefulValue(setOf(TextFieldState.Focused) " +
                "to TextFieldLabelPlacement.Inner, setOf(TextFieldState.Focused, TextFieldState.Hovered) " +
                "to TextFieldLabelPlacement.None))",
            builderCall,
        )
    }

    private fun valueParam(
        methodName: String,
        paramSimpleType: String,
        values: List<String>,
    ) = ValuePropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = paramSimpleType,
        group = "",
        values = values,
    )
}
