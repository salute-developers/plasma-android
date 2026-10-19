package com.sdds.preview.compose.plugin

import com.sdds.preview.compose.PreviewPreparationException
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
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

/** Проверка типов вложенных стилей на настоящих сгенерированных фабриках `Tabs`, `TabItem` и `Avatar`. */
class GeneratedFactoryValidationTest {
    private fun ref(styleId: String) = PreviewPropertyValue(PreviewPropertySource.StyleReference(styleId))

    private fun validate(
        componentId: String,
        properties: Map<String, PreviewPropertyValue>,
        styles: Map<String, PreviewStyle>,
    ) {
        val payload = PreviewPayload(
            requestId = "r",
            platform = PreviewPlatform.COMPOSE,
            theme = emptyMap(),
            component = PreviewComponent(componentId, properties = properties),
            styles = styles,
            example = PreviewExample("default"),
        )
        GeneratedPreviewStyleFactories.all.getValue(componentId)
            .validateNestedStyles(payload, properties, "$.component.properties")
    }

    @Test
    fun `tabs accept item and divider styles of the matching components`() {
        validate(
            "Tabs",
            mapOf("tabItemStyle" to ref("item"), "dividerStyle" to ref("divider")),
            mapOf("item" to PreviewStyle("TabItem"), "divider" to PreviewStyle("Divider")),
        )
    }

    @Test
    fun `item style of the icon tab component is accepted because it shares the style class`() {
        validate("Tabs", mapOf("tabItemStyle" to ref("item")), mapOf("item" to PreviewStyle("IconTabItem")))
    }

    @Test
    fun `divider style given to an item property is rejected`() {
        val error = assertFailsWith<PreviewPreparationException> {
            validate("Tabs", mapOf("tabItemStyle" to ref("s")), mapOf("s" to PreviewStyle("Divider")))
        }

        assertEquals("style_type_mismatch", error.code)
        assertEquals("$.component.properties.tabItemStyle", error.path)
    }

    @Test
    fun `style of an unknown component is rejected`() {
        val error = assertFailsWith<PreviewPreparationException> {
            validate("Avatar", mapOf("badgeStyle" to ref("s")), mapOf("s" to PreviewStyle("Nope")))
        }

        assertEquals("style_component_not_found", error.code)
    }

    @Test
    fun `nested badge style is accepted for avatar`() {
        validate("Avatar", mapOf("badgeStyle" to ref("b")), mapOf("b" to PreviewStyle("Badge")))
    }
}
