package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import org.junit.Assert.assertEquals
import org.junit.Test

class ShadowPropertyMapperTest {

    @Test
    fun `возвращает shadow без состояний`() {
        val underTest = ShadowPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = shadowParam("shadow"),
            tokenValue = Shadow("soft.card"),
            variationId = "",
        )

        assertEquals(
            "shadow(TestTheme.shadows.softCard)",
            builderCall,
        )
    }

    @Test
    fun `возвращает shadow с состояниями`() {
        val underTest = ShadowPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = shadowParam("shadow"),
            tokenValue = Shadow(
                value = "soft.card",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "hard.card"),
                    StringState(
                        state = listOf("pressed", "hovered"),
                        value = "hard.modal",
                    ),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "shadow(TestTheme.shadows.softCard.asStatefulValue(setOf(InteractiveState.Pressed) to " +
                "TestTheme.shadows.hardCard, setOf(InteractiveState.Pressed, InteractiveState.Hovered) to " +
                "TestTheme.shadows.hardModal))",
            builderCall,
        )
    }

    private fun shadowParam(methodName: String) = ShadowPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
