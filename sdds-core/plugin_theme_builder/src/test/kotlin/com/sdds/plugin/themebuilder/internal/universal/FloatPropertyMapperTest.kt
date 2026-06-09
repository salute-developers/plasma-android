package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import org.junit.Assert.assertEquals
import org.junit.Test

class FloatPropertyMapperTest {

    @Test
    fun `возвращает вызов билдера без состояний`() {
        val underTest = FloatPropertyMapper(null)

        val builderCall = underTest.map(
            meta = floatParam(methodName = "disabledAlpha"),
            tokenValue = FloatValue(0.4f),
            variationId = "",
        )

        assertEquals("disabledAlpha(0.4f)", builderCall)
    }

    @Test
    fun `возвращает вызов билдера с состояниями`() {
        val underTest = FloatPropertyMapper(null)

        val builderCall = underTest.map(
            meta = floatParam(methodName = "disabledAlpha"),
            tokenValue = FloatValue(
                value = 0.4f,
                states = listOf(
                    FloatState(state = listOf("pressed"), value = 0.8f),
                    FloatState(state = listOf("pressed", "hovered"), value = 0.6f),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "disabledAlpha(0.4f.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to 0.8f, setOf(InteractiveState.Pressed, InteractiveState.Hovered) to 0.6f))",
            builderCall,
        )
    }

    @Test
    fun `возвращает вызов билдера с кастомным stateEnum`() {
        val underTest = FloatPropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.test.SliderState",
                simpleName = "SliderState",
                values = listOf(EnumValueInfo(name = "Active", configName = "active")),
            ),
        )

        val builderCall = underTest.map(
            meta = floatParam(methodName = "opacity"),
            tokenValue = FloatValue(
                value = 0.3f,
                states = listOf(
                    FloatState(state = listOf("active"), value = 1.0f),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "opacity(0.3f.asStatefulValue(setOf(SliderState.Active) to 1.0f))",
            builderCall,
        )
    }

    private fun floatParam(methodName: String) = FloatPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
