package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Test

class IconPropertyMapperTest {

    @Test
    fun `возвращает ссылку на drawable без состояний`() {
        val underTest = IconPropertyMapper(null)

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value("actions.add"),
            variationId = "",
        )

        assertEquals("startIcon(com.sdds.icons.R.drawable.ic_actions_add)", builderCall)
    }

    @Test
    fun `возвращает ссылку на drawable с состояниями`() {
        val underTest = IconPropertyMapper(null)

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
            "startIcon(com.sdds.icons.R.drawable.ic_actions_add." +
                "asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to com.sdds.icons.R.drawable.ic_actions_remove, " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to com.sdds.icons.R.drawable.ic_actions_close))",
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
