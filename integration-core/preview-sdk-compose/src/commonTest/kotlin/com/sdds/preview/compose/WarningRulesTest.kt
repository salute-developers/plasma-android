package com.sdds.preview.compose

import com.sdds.preview.contract.GradientLayer
import com.sdds.preview.contract.GradientStop
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStateEntry
import com.sdds.preview.contract.PreviewStyle
import com.sdds.preview.contract.TokenValue
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals

class WarningRulesTest {
    private fun token(id: String) = PreviewPropertySource.TokenReference(id)

    private fun withState(vararg names: String) = PreviewPropertyValue(
        base = token("color"),
        states = listOf(PreviewStateEntry(names.toList(), token("color"))),
    )

    private fun payload(
        properties: Map<String, PreviewPropertyValue>,
        styles: Map<String, PreviewStyle> = emptyMap(),
        theme: Map<String, TokenValue> = emptyMap(),
    ) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = theme,
        component = PreviewComponent("root", properties = properties),
        styles = styles,
        example = PreviewExample("default"),
    )

    private val rootRules = PreviewWarningRules({ it == "pressed" })
    private val badgeRules = PreviewWarningRules({ it == "checked" })

    @Test
    fun `nested style states are checked by the rules of the component that owns the style`() {
        val warnings = payload(
            properties = mapOf("color" to withState("checked")),
            styles = mapOf("badge" to PreviewStyle("Badge", mapOf("color" to withState("checked", "pressed")))),
        ).collectWarnings(rootRules) { id -> if (id == "Badge") badgeRules else null }

        assertEquals(
            listOf("$.component.properties.color.states[0]", "$.styles.badge.properties.color.states[0]"),
            warnings.map { it.path },
        )
        assertEquals(setOf("unknown_state"), warnings.map { it.code }.toSet())
    }

    @Test
    fun `a nested style of an unknown component is not checked`() {
        val warnings = payload(
            properties = emptyMap(),
            styles = mapOf("other" to PreviewStyle("Other", mapOf("color" to withState("fancy")))),
        ).collectWarnings(rootRules) { null }

        assertEquals(emptyList(), warnings)
    }

    @Test
    fun `unsupported properties and gradients without a brush overload produce warnings`() {
        val gradient = TokenValue.Gradient(
            listOf(GradientLayer(90.0, listOf(GradientStop("#FF0000FF", 0.0), GradientStop("#0000FFFF", 1.0)))),
        )
        val rules = PreviewWarningRules(
            isStateSupported = { true },
            unsupportedProperties = setOf("icon"),
            gradientUnsupportedProperties = setOf("backgroundColor"),
        )

        val warnings = payload(
            properties = mapOf(
                "icon" to PreviewPropertyValue(PreviewPropertySource.Literal(JsonPrimitive("x"))),
                "backgroundColor" to PreviewPropertyValue(token("gradient")),
                "contentColor" to PreviewPropertyValue(token("gradient")),
            ),
            theme = mapOf("gradient" to gradient),
        ).collectWarnings(rules)

        assertEquals(
            listOf("$.component.properties.icon", "$.component.properties.backgroundColor"),
            warnings.map { it.path },
        )
        assertEquals(setOf("unsupported_property"), warnings.map { it.code }.toSet())
    }
}
