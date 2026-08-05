package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.mappers.IntegerPropertyMapper
import org.junit.Assert.assertEquals
import org.junit.Test

class IntegerPropertyMapperTest {

    @Test
    fun `возвращает вызов билдера без состояний`() {
        val underTest = IntegerPropertyMapper(null)
        val builderCall = underTest.map(
            meta = ComposeIntegerPropertyMeta(
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
            meta = ComposeIntegerPropertyMeta(
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

    @Test
    fun `возвращает вызов билдера с кастомным stateEnum`() {
        val underTest = IntegerPropertyMapper(
            stateEnum = ComposeStateEnum(
                qualifiedName = "com.test.ItemState",
                simpleName = "ItemState",
                values = listOf(ComposeEnumValueInfo(name = "Checked", configName = "checked")),
            ),
        )

        val builderCall = underTest.map(
            meta = ComposeIntegerPropertyMeta(
                id = "",
                methodName = "count",
                paramName = "",
                paramQualifiedType = "",
                paramSimpleType = "",
                group = "",
            ),
            tokenValue = Value(
                value = "3",
                states = listOf(
                    StringState(state = listOf("checked"), value = "5"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "count(3.asStatefulValue(setOf(ItemState.Checked) to 5))",
            builderCall,
        )
    }
}
