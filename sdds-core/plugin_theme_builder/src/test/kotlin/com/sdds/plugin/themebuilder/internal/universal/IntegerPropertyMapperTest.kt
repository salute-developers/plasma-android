package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Test

class IntegerPropertyMapperTest {

    @Test
    fun `возвращает вызов билдера без состояний`() {
        val underTest = IntegerPropertyMapper(null)
        val builderCall = underTest.map(
            meta = IntegerPropertyMeta(
                id = "",
                methodName = "wheelCount",
                paramName = "",
                paramQualifiedType = "",
                paramSimpleType = "",
                group = "",
            ),
            tokenValue = Value("4"),
            variationId = "",
        )
        assertEquals(builderCall, "wheelCount(4)")
    }

    @Test
    fun `возвращает вызов билдера с состояниями`() {
        val underTest = IntegerPropertyMapper(null)
        val tokenValue = Value(
            value = "4",
            states = listOf(
                StringState(state = listOf("pressed"), value = "8"),
                StringState(state = listOf("pressed", "hovered"), value = "6"),
            ),
        )
        val builderCall = underTest.map(
            meta = IntegerPropertyMeta(
                id = "",
                methodName = "wheelCount",
                paramName = "",
                paramQualifiedType = "",
                paramSimpleType = "",
                group = "",
            ),
            tokenValue = tokenValue,
            variationId = "",
        )
        assertEquals(
            "wheelCount(4.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to 8, setOf(InteractiveState.Pressed, InteractiveState.Hovered) to 6))",
            builderCall,
        )
    }
}
