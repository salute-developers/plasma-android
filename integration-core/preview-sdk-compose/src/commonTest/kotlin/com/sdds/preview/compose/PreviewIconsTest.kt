package com.sdds.preview.compose

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PreviewIconsTest {
    private val vector = ImageVector.Builder("icon", 16.dp, 16.dp, 16f, 16f).build()
    private val registry = PreviewIconRegistry(mapOf("DisclosureDownFill16" to { vector }))

    private fun literal(value: String) = PreviewPropertyValue(PreviewPropertySource.Literal(JsonPrimitive(value)))

    private fun payload(properties: Map<String, PreviewPropertyValue>) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = emptyMap(),
        component = PreviewComponent("AccordionItem", properties = properties),
        example = PreviewExample("default"),
    )

    @Test
    fun `an icon name from the data becomes a SddsIcons member name`() {
        assertEquals("DisclosureDownFill16", iconMemberName("disclosure.down.fill.16"))
        assertEquals("Plus16", iconMemberName("plus.16"))
        assertEquals("DotsHorizontalOutline24", iconMemberName("dots.horizontal.outline.24"))
        assertEquals("ArrowLeft24", iconMemberName("arrow-left_24"))
        assertEquals("", iconMemberName(""))
    }

    @Test
    fun `the registry finds an icon by the name from the data`() {
        assertTrue(registry.contains("disclosure.down.fill.16"))
        assertNotNull(registry.find("disclosure.down.fill.16"))
        assertFalse(registry.contains("no.such.icon.16"))
        assertNull(registry.find("no.such.icon.16"))
    }

    @Test
    fun `iconValue resolves a literal name through the theme and ignores unknown names and tokens`() {
        val theme = payload(emptyMap()).prepareComposeTheme().withIcons(registry)

        assertNotNull(literal("disclosure.down.fill.16").iconValue(theme))
        assertNull(literal("no.such.icon.16").iconValue(theme))
        assertNull(
            PreviewPropertyValue(PreviewPropertySource.TokenReference("disclosure.down.fill.16")).iconValue(theme),
        )
        assertNull(literal("disclosure.down.fill.16").iconValue(payload(emptyMap()).prepareComposeTheme()))
    }

    @Test
    fun `an icon missing from the registry produces unknown_icon and a known icon does not`() {
        val rules = PreviewWarningRules(isStateSupported = { true }, iconProperties = setOf("closedIcon", "openedIcon"))

        val warnings = payload(
            mapOf("closedIcon" to literal("disclosure.down.fill.16"), "openedIcon" to literal("no.such.icon.16")),
        ).collectWarnings(rules, hasIcon = registry::contains)

        assertEquals(listOf("$.component.properties.openedIcon"), warnings.map { it.path })
        assertEquals(listOf("unknown_icon"), warnings.map { it.code })
    }

    @Test
    fun `icon warnings are not produced without icon properties in the rules`() {
        val warnings = payload(mapOf("closedIcon" to literal("no.such.icon.16")))
            .collectWarnings(PreviewWarningRules(isStateSupported = { true }), hasIcon = { false })

        assertEquals(emptyList(), warnings)
    }
}
