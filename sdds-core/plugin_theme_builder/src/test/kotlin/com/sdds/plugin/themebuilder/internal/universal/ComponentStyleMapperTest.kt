package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Test

class ComponentStyleMapperTest {

    private val importCollector = mockk<ImportCollector>(relaxed = true)

    @Test
    fun `возвращает Default стиль если вариация не указана`() {
        val underTest = ComponentStyleMapper(
            stateEnum = null,
            importCollector = importCollector,
            themeStylesPackage = "com.test.theme.styles",
        )

        val builderCall = underTest.map(
            meta = componentParam(
                methodName = "buttonStyle",
                id = "buttonStyle",
            ),
            tokenValue = ComponentStyle<ButtonProperties>("basic-button"),
            variationId = "",
        )

        assertEquals("buttonStyle(BasicButton.Default.style())", builderCall)
        verify {
            importCollector.addImport("com.test.theme.styles.button", "Default")
        }
    }

    @Test
    fun `возвращает стиль с вариациями`() {
        val underTest = ComponentStyleMapper(
            stateEnum = null,
            importCollector = importCollector,
            themeStylesPackage = "com.test.theme.styles",
        )

        val builderCall = underTest.map(
            meta = componentParam(
                methodName = "buttonStyle",
                id = "buttonStyle",
            ),
            tokenValue = ComponentStyle<ButtonProperties>("basic-button.m.clear"),
            variationId = "",
        )

        assertEquals("buttonStyle(BasicButton.M.Clear.style())", builderCall)
        verify {
            importCollector.addImport("com.test.theme.styles.button", "Clear")
            importCollector.addImport("com.test.theme.styles.button", "M")
        }
    }

    @Test
    fun `возвращает стиль с состояниями`() {
        val underTest = ComponentStyleMapper(
            stateEnum = null,
            importCollector = importCollector,
            themeStylesPackage = "com.test.theme.styles",
        )

        val builderCall = underTest.map(
            meta = componentParam(
                methodName = "buttonStyle",
                id = "buttonStyle",
            ),
            tokenValue = ComponentStyle<ButtonProperties>(
                value = "basic-button.m.default",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "basic-button.m.secondary"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "buttonStyle(BasicButton.M.Default.style().asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to BasicButton.M.Secondary.style()))",
            builderCall,
        )
    }

    private fun componentParam(
        methodName: String,
        id: String,
    ) = ComponentPropertyMeta(
        id = id,
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
