package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Test

class BooleanPropertyMapperTest {

    @Test
    fun `возвращает вызов билдера без состояний`() {
        val underTest = BooleanPropertyMapper(null)

        val builderCall = underTest.map(
            meta = booleanParam(methodName = "enabled"),
            tokenValue = Value("true"),
            variationId = "",
        )

        assertEquals("enabled(true)", builderCall)
    }

    @Test
    fun `возвращает вызов билдера с состояниями`() {
        val underTest = BooleanPropertyMapper(null)

        val builderCall = underTest.map(
            meta = booleanParam(methodName = "enabled"),
            tokenValue = Value(
                value = "true",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "false"),
                    StringState(state = listOf("pressed", "hovered"), value = "true"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "enabled(true.asStatefulValue(setOf(InteractiveState.Pressed) to false, " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) to true))",
            builderCall,
        )
    }

    @Test
    fun `возвращает вызов билдера с кастомным stateEnum`() {
        val underTest = BooleanPropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.sdds.compose.uikit.SwitchStates",
                simpleName = "SwitchStates",
                values = listOf(EnumValueInfo(name = "Checked", configName = "checked")),
            ),
        )

        val builderCall = underTest.map(
            meta = booleanParam(methodName = "enabled"),
            tokenValue = Value(
                value = "true",
                states = listOf(
                    StringState(state = listOf("checked"), value = "false"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "enabled(true.asStatefulValue(setOf(SwitchStates.Checked) to false))",
            builderCall,
        )
    }

    private fun booleanParam(methodName: String) = BooleanPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
