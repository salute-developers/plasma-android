package com.sdds.preview.compose.plugin

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.preview.compose.PreparedComposeTheme
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.prepareComposeTheme
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

/**
 * Сгенерированная фабрика должна строить тот же стиль, что и прямой вызов билдера UIKit с теми же значениями.
 * Эталон написан вручную и не использует помощники SDK (`toStateful`, выбор перегрузки): сравнивается поведение
 * стиля (`getValue` для наборов состояний) и значения, которые видит компонент. По одному компоненту на фазу:
 * A (BasicButton), B (CheckBox, кастомные состояния), C (Tabs, вложенные стили).
 */
class ReferenceStyleComparisonTest {
    private val background = Color(0xFF2A72E5)
    private val pressed = Color(0xFF1959B8)
    private val content = Color(0xFF202124)
    private val shape = RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)
    private val label = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight(400),
    )

    private val tokens: Map<String, TokenValue> = mapOf(
        "color.background" to TokenValue.Color("#2A72E5FF"),
        "color.background.pressed" to TokenValue.Color("#1959B8FF"),
        "color.content" to TokenValue.Color("#202124FF"),
        "size.height" to TokenValue.Dimension(48.0),
        "size.padding" to TokenValue.Dimension(20.0),
        "shape.button" to TokenValue.Shape(listOf(12.0, 12.0, 12.0, 12.0)),
        "font.body" to TokenValue.FontFamily(emptyList(), allowFallback = true),
        "typography.button" to TokenValue.Typography("font.body", 16.0, 20.0, 0.0, 400),
    )

    private fun token(id: String, alpha: Double? = null) = PreviewPropertySource.TokenReference(id, alpha)

    private fun entry(source: PreviewPropertySource, vararg states: String) = PreviewStateEntry(states.toList(), source)

    private fun payload(
        componentId: String,
        properties: Map<String, PreviewPropertyValue>,
        styles: Map<String, PreviewStyle> = emptyMap(),
    ) = PreviewPayload(
        requestId = "r",
        platform = PreviewPlatform.COMPOSE,
        theme = tokens,
        component = PreviewComponent(componentId, properties = properties),
        styles = styles,
        example = PreviewExample("default"),
    )

    private fun theme(payload: PreviewPayload): PreparedComposeTheme =
        payload.prepareComposeTheme(mapOf("font.body" to FontFamily.Default))

    @Suppress("UNCHECKED_CAST")
    private fun <S> generated(payload: PreviewPayload): S {
        val factory = GeneratedPreviewStyleFactories.all.getValue(payload.component.id)
        val theme = theme(payload)
        return composeOnce { factory.create(payload, theme) } as S
    }

    private fun <T> StatefulValue<T>.probe(vararg sets: Set<ValueState>): List<T> = sets.map { getValue(it) }

    @Test
    fun `BasicButton factory matches a style built by hand`() {
        val payload = payload(
            "BasicButton",
            mapOf(
                "shape" to PreviewPropertyValue(token("shape.button")),
                "labelStyle" to PreviewPropertyValue(token("typography.button")),
                "disableAlpha" to PreviewPropertyValue(PreviewPropertySource.Literal(JsonPrimitive(0.4))),
                "height" to PreviewPropertyValue(token("size.height")),
                "paddingStart" to PreviewPropertyValue(token("size.padding")),
                "backgroundColor" to PreviewPropertyValue(
                    base = token("color.background"),
                    states = listOf(
                        entry(token("color.background.pressed"), "pressed"),
                        entry(token("color.background", alpha = 0.5), "pressed", "selected"),
                        // Две записи для одного набора: побеждает последняя, как задаёт Preview Protocol.
                        entry(token("color.content"), "pressed"),
                    ),
                ),
            ),
        )
        val actual = generated<ButtonStyle>(payload)

        val expected = composeOnce {
            ButtonStyle.basicButtonBuilder()
                .shape(shape)
                .labelStyle(label)
                .disableAlpha(0.4f)
                .colors {
                    backgroundColor(
                        SolidColor(background).asStatefulValue(
                            setOf<ValueState>(InteractiveState.Pressed) to SolidColor(content),
                            setOf<ValueState>(InteractiveState.Pressed, InteractiveState.Selected) to
                                SolidColor(background.copy(alpha = 0.5f)),
                        ),
                    )
                }
                .dimensions {
                    height(48.dp)
                    paddingStart(20.dp)
                }
                .style()
        }

        assertEquals(expected.shapes.getDefaultValue(), actual.shapes.getDefaultValue())
        assertEquals(expected.labelStyles.getDefaultValue(), actual.labelStyles.getDefaultValue())
        assertEquals(expected.disableAlpha, actual.disableAlpha)
        assertEquals(
            expected.dimensions.heightValues.getDefaultValue(),
            actual.dimensions.heightValues.getDefaultValue(),
        )
        assertEquals(
            expected.dimensions.paddingStartValues.getDefaultValue(),
            actual.dimensions.paddingStartValues.getDefaultValue(),
        )
        val probes = arrayOf<Set<ValueState>>(
            emptySet(),
            setOf(InteractiveState.Pressed),
            setOf(InteractiveState.Hovered),
            setOf(InteractiveState.Pressed, InteractiveState.Selected),
        )
        assertEquals(expected.colors.backgroundBrush.probe(*probes), actual.colors.backgroundBrush.probe(*probes))
    }

    @Test
    fun `CheckBox factory matches a style built by hand including custom and combined states`() {
        val payload = payload(
            "CheckBox",
            mapOf(
                "shape" to PreviewPropertyValue(token("shape.button")),
                "toggleColor" to PreviewPropertyValue(
                    base = token("color.background"),
                    states = listOf(
                        entry(token("color.background.pressed"), "checked"),
                        entry(token("color.background", alpha = 0.5), "Checked", "pressed"),
                        entry(token("color.content"), "indeterminate"),
                    ),
                ),
            ),
        )
        val actual = generated<CheckBoxStyle>(payload)

        val expected = composeOnce {
            CheckBoxStyle.builder()
                .shape(shape)
                .colorValues {
                    toggleColor(
                        SolidColor(background).asStatefulValue(
                            setOf<ValueState>(CheckBoxStates.Checked) to SolidColor(pressed),
                            setOf<ValueState>(CheckBoxStates.Checked, InteractiveState.Pressed) to
                                SolidColor(background.copy(alpha = 0.5f)),
                            setOf<ValueState>(CheckBoxStates.Indeterminate) to SolidColor(content),
                        ),
                    )
                }
                .style()
        }

        assertEquals(expected.shapes.getDefaultValue(), actual.shapes.getDefaultValue())
        val probes = arrayOf<Set<ValueState>>(
            emptySet(),
            setOf(CheckBoxStates.Checked),
            setOf(CheckBoxStates.Checked, InteractiveState.Pressed),
            setOf(CheckBoxStates.Indeterminate),
            setOf(CheckBoxStates.Error),
        )
        assertEquals(expected.colorValues.toggleBrush.probe(*probes), actual.colorValues.toggleBrush.probe(*probes))
    }

    @Test
    fun `Tabs factory matches a style built by hand including nested item and divider styles`() {
        fun ref(id: String) = PreviewPropertyValue(PreviewPropertySource.StyleReference(id))
        val payload = payload(
            "Tabs",
            mapOf("tabItemStyle" to ref("item"), "dividerStyle" to ref("divider")),
            mapOf(
                "item" to PreviewStyle(
                    "TabItem",
                    mapOf(
                        "shape" to PreviewPropertyValue(token("shape.button")),
                        "labelStyle" to PreviewPropertyValue(token("typography.button")),
                    ),
                ),
                "divider" to PreviewStyle(
                    "Divider",
                    mapOf("backgroundColor" to PreviewPropertyValue(token("color.content"))),
                ),
            ),
        )
        val actual = generated<TabsStyle>(payload)

        val expected = composeOnce {
            val item = TabItemStyle.builder().shape(shape).labelStyle(label).style()
            val divider = DividerStyle.builder().color { backgroundColor(content) }.style()
            TabsStyle.builder().tabItemStyle(item).dividerStyle(divider).style()
        }

        assertEquals(expected.tabItemStyle.shape, actual.tabItemStyle.shape)
        assertEquals(
            expected.tabItemStyle.labelStyles.getDefaultValue(),
            actual.tabItemStyle.labelStyles.getDefaultValue(),
        )
        assertEquals(
            expected.dividerStyle.color.backgroundBrush.getDefaultValue(),
            actual.dividerStyle.color.backgroundBrush.getDefaultValue(),
        )
    }
}
