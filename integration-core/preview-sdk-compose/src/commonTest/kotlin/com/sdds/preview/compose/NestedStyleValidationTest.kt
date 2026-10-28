package com.sdds.preview.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.style.Style
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStyle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NestedStyleValidationTest {
    private class FakeFactory(
        override val componentName: String,
        override val styleQualifiedName: String,
        override val nestedStyleTypes: Map<String, String> = emptyMap(),
        private val registryProvider: () -> Map<String, GeneratedStyleFactory<*>> = { emptyMap() },
    ) : GeneratedStyleFactory<Style> {
        override val states: PreviewStateMap = PreviewStateMap()
        override val registry: Map<String, GeneratedStyleFactory<*>> get() = registryProvider()

        @Composable
        override fun build(
            properties: Map<String, PreviewPropertyValue>,
            theme: PreparedComposeTheme,
            context: PreviewStyleContext,
        ): Style = error("Не используется в тесте")
    }

    private val item = FakeFactory("TabItem", "ui.TabItemStyle", mapOf("badgeStyle" to "ui.BadgeStyle")) { all }
    private val badge = FakeFactory("Badge", "ui.BadgeStyle")
    private val divider = FakeFactory("Divider", "ui.DividerStyle")
    private val tabs = FakeFactory(
        "Tabs",
        "ui.TabsStyle",
        mapOf("tabItemStyle" to "ui.TabItemStyle", "dividerStyle" to "ui.DividerStyle"),
    ) { all }
    private val all: Map<String, GeneratedStyleFactory<*>> =
        listOf(item, badge, divider, tabs).associateBy { it.componentName }

    private fun ref(styleId: String) = PreviewPropertyValue(PreviewPropertySource.StyleReference(styleId))

    private fun payload(
        properties: Map<String, PreviewPropertyValue>,
        styles: Map<String, PreviewStyle>,
    ) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = emptyMap(),
        component = PreviewComponent("Tabs", properties = properties),
        styles = styles,
        example = PreviewExample("default"),
    )

    private fun validate(payload: PreviewPayload) =
        tabs.validateNestedStyles(payload, payload.component.properties, "$.component.properties")

    @Test
    fun `matching nested styles are accepted including deeper levels`() {
        validate(
            payload(
                mapOf("tabItemStyle" to ref("item"), "dividerStyle" to ref("divider")),
                mapOf(
                    "item" to PreviewStyle("TabItem", mapOf("badgeStyle" to ref("badge"))),
                    "badge" to PreviewStyle("Badge"),
                    "divider" to PreviewStyle("Divider"),
                ),
            ),
        )
    }

    @Test
    fun `style of another component type is rejected with its path`() {
        val error = assertFailsWith<PreviewPreparationException> {
            validate(payload(mapOf("dividerStyle" to ref("s")), mapOf("s" to PreviewStyle("Badge"))))
        }

        assertEquals("style_type_mismatch", error.code)
        assertEquals("$.component.properties.dividerStyle", error.path)
    }

    @Test
    fun `mismatch inside a nested style is rejected`() {
        val error = assertFailsWith<PreviewPreparationException> {
            validate(
                payload(
                    mapOf("tabItemStyle" to ref("item")),
                    mapOf(
                        "item" to PreviewStyle("TabItem", mapOf("badgeStyle" to ref("d"))),
                        "d" to PreviewStyle("Divider"),
                    ),
                ),
            )
        }

        assertEquals("style_type_mismatch", error.code)
        assertEquals("$.styles.item.properties.badgeStyle", error.path)
    }

    @Test
    fun `style of a component without a factory is rejected`() {
        val error = assertFailsWith<PreviewPreparationException> {
            validate(payload(mapOf("dividerStyle" to ref("s")), mapOf("s" to PreviewStyle("Unknown"))))
        }

        assertEquals("style_component_not_found", error.code)
    }

    @Test
    fun `properties that are not style properties are ignored`() {
        validate(payload(mapOf("unknown" to ref("s")), mapOf("s" to PreviewStyle("Whatever"))))
    }
}
