package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import org.junit.Assert.assertEquals
import org.junit.Test

class TypographyPropertyMapperTest {

    @Test
    fun `возвращает ссылку на типографику без состояний`() {
        val underTest = TypographyPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = typographyParam(methodName = "labelStyle"),
            tokenValue = Typography("body.l"),
            variationId = "",
        )

        assertEquals("labelStyle(TestTheme.typography.bodyL)", builderCall)
    }

    @Test
    fun `возвращает ссылку на типографику с состояниями`() {
        val underTest = TypographyPropertyMapper(
            stateEnum = null,
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = typographyParam(methodName = "labelStyle"),
            tokenValue = Typography(
                value = "body.l",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "body.m"),
                    StringState(state = listOf("pressed", "hovered"), value = "header.h1"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "labelStyle(TestTheme.typography.bodyL.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TestTheme.typography.bodyM, setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TestTheme.typography.headerH1))",
            builderCall,
        )
    }

    @Test
    fun `возвращает ссылку на типографику с кастомным stateEnum`() {
        val underTest = TypographyPropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.test.TextState",
                simpleName = "TextState",
                values = listOf(EnumValueInfo(name = "Active", configName = "active")),
            ),
            themeClassName = "TestTheme",
        )

        val builderCall = underTest.map(
            meta = typographyParam(methodName = "labelStyle"),
            tokenValue = Typography(
                value = "body.l",
                states = listOf(
                    StringState(state = listOf("active"), value = "body.m"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "labelStyle(TestTheme.typography.bodyL.asStatefulValue(setOf(TextState.Active) " +
                "to TestTheme.typography.bodyM))",
            builderCall,
        )
    }

    private fun typographyParam(methodName: String) = TypographyPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
