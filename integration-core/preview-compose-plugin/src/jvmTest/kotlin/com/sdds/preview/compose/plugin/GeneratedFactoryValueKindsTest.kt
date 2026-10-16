package com.sdds.preview.compose.plugin

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.graphics.Gradients
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.preview.compose.PreviewStateMap
import com.sdds.preview.compose.ResolvedProperty
import com.sdds.preview.compose.ResolvedState
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.prepareComposeTheme
import com.sdds.preview.compose.toInteractiveColor
import com.sdds.preview.contract.GradientLayer
import com.sdds.preview.contract.GradientStop
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewExample
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPlatform
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.TokenValue
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** Виды значений, которые не покрывает сравнение с эталоном: градиент, literal-цвет, `InteractiveColor`. */
class GeneratedFactoryValueKindsTest {
    private val gradient = TokenValue.Gradient(
        listOf(
            GradientLayer(90.0, listOf(GradientStop("#FF0000FF", 0.0), GradientStop("#0000FFFF", 1.0))),
        ),
    )

    private fun payload(componentId: String, properties: Map<String, PreviewPropertyValue>) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = mapOf("gradient.main" to gradient, "color.red" to TokenValue.Color("#FF0000FF")),
        component = PreviewComponent(componentId, properties = properties),
        example = PreviewExample("default"),
    )

    @Suppress("UNCHECKED_CAST")
    private fun <S> build(payload: PreviewPayload): S {
        val factory = GeneratedPreviewStyleFactories.all.getValue(payload.component.id)
        val theme = payload.prepareComposeTheme(mapOf("font.body" to FontFamily.Default))
        return composeOnce { factory.create(payload, theme) } as S
    }

    private fun token(id: String, alpha: Double? = null) = PreviewPropertyValue(
        PreviewPropertySource.TokenReference(id, alpha),
    )

    @Test
    fun `gradient token goes to the Brush overload of a colour property`() {
        val style = build<ButtonStyle>(payload("BasicButton", mapOf("backgroundColor" to token("gradient.main"))))

        val expected = Gradients.Linear(listOf(Color(0xFFFF0000), Color(0xFF0000FF)), listOf(0f, 1f), 90f)
        assertEquals(expected, style.colors.backgroundBrush.getDefaultValue())
    }

    @Test
    fun `gradient switches to the Brush overload when a solid colour uses another overload`() {
        // У CodeField.valueColor для сплошного цвета выбирается StatefulValue<Color>, а для градиента только Brush.
        val solid = build<CodeFieldStyle>(payload("CodeField", mapOf("valueColor" to token("color.red"))))
        val gradientStyle = build<CodeFieldStyle>(payload("CodeField", mapOf("valueColor" to token("gradient.main"))))

        assertEquals(Color.Red, solid.colors.valueColor.getDefaultValue())
        val expected = Gradients.Linear(listOf(Color(0xFFFF0000), Color(0xFF0000FF)), listOf(0f, 1f), 90f)
        assertEquals(expected, gradientStyle.colors.valueBrush.getDefaultValue())
    }

    @Test
    fun `gradient for a colour property without a Brush overload is skipped and builds anyway`() {
        val factory = GeneratedPreviewStyleFactories.all.getValue("Tabs")
        assertTrue("backgroundColor" in factory.gradientUnsupportedProperties)

        val style = build<TabsStyle>(payload("Tabs", mapOf("backgroundColor" to token("gradient.main"))))

        assertTrue(style.shape.toString().isNotEmpty())
    }

    @Test
    fun `literal colour and its alpha are applied`() {
        val literal = PreviewPropertySource.Literal(JsonPrimitive("#112233FF"))
        val withAlpha = PreviewPropertySource.Literal(JsonPrimitive("#112233FF"), alpha = 0.5)

        val plain = build<ButtonStyle>(payload("BasicButton", mapOf("labelColor" to PreviewPropertyValue(literal))))
        val translucent =
            build<ButtonStyle>(payload("BasicButton", mapOf("labelColor" to PreviewPropertyValue(withAlpha))))

        assertEquals(SolidColor(Color(0xFF112233)), plain.colors.labelBrush.getDefaultValue())
        assertEquals(SolidColor(Color(0xFF112233).copy(alpha = 0.5f)), translucent.colors.labelBrush.getDefaultValue())
    }

    @Test
    fun `interactive colour picks the largest matching state set and the later entry among equal sets`() {
        val property = ResolvedProperty(
            base = Color.Red,
            states = listOf(
                ResolvedState(setOf("pressed"), Color.Green),
                ResolvedState(setOf("pressed"), Color.Blue),
                ResolvedState(setOf("pressed", "selected"), Color.White),
            ),
        )
        val color = property.toInteractiveColor(PreviewStateMap())
        val source = MutableInteractionSource()

        fun probe(vararg states: InteractiveState) = composeOnce { color.colorForInteraction(source, states.toSet()) }

        assertEquals(Color.Red, probe())
        assertEquals(Color.Blue, probe(InteractiveState.Pressed))
        assertEquals(Color.White, probe(InteractiveState.Pressed, InteractiveState.Selected))
    }
}
