package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class IconPropertyMapperTest {

    @Test
    fun `возвращает ссылку на drawable без состояний`() {
        val underTest = IconPropertyMapper(null, mockk(relaxed = true))

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value("actions.add"),
            variationId = "",
        )

        assertEquals("startIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_actions_add))", builderCall)
    }

    @Test
    fun `возвращает ссылку на drawable с состояниями`() {
        val underTest = IconPropertyMapper(null, mockk(relaxed = true))

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value(
                value = "actions.add",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "actions.remove"),
                    StringState(state = listOf("pressed", "hovered"), value = "actions.close"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "startIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_actions_add)." +
                "asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to resourceImageSource(com.sdds.icons.R.drawable.ic_actions_remove), " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to resourceImageSource(com.sdds.icons.R.drawable.ic_actions_close)))",
            builderCall,
        )
    }

    @Test
    fun `возвращает ссылку на drawable с кастомным stateEnum`() {
        val underTest = IconPropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.test.ChipState",
                simpleName = "ChipState",
                values = listOf(EnumValueInfo(name = "Selected", configName = "selected_chip")),
            ),
            importCollector = mockk(relaxed = true),
        )

        val builderCall = underTest.map(
            meta = iconParam(methodName = "icon"),
            tokenValue = Value(
                value = "actions.add",
                states = listOf(
                    StringState(state = listOf("selected_chip"), value = "actions.check"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "icon(resourceImageSource(com.sdds.icons.R.drawable.ic_actions_add).asStatefulValue(" +
                "setOf(ChipState.Selected) to resourceImageSource(com.sdds.icons.R.drawable.ic_actions_check)))",
            builderCall,
        )
    }

    private fun iconParam(methodName: String) = IconPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
