package com.sdds.compose.uikit

import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WheelWidthModeTest {

    @Test
    fun `auto resolves to center content for mixed alignment`() {
        assertEquals(
            WheelWidthMode.CenterContent,
            WheelWidthMode.Auto.resolveFor(WheelAlignment.Mixed),
        )
    }

    @Test
    fun `auto resolves to equal for non-mixed alignments`() {
        val alignments = listOf(
            WheelAlignment.Start,
            WheelAlignment.End,
            WheelAlignment.Center,
        )
        alignments.forEach { alignment ->
            assertEquals(WheelWidthMode.Equal, WheelWidthMode.Auto.resolveFor(alignment))
        }
    }

    @Test
    fun `explicit modes ignore alignment`() {
        assertEquals(
            WheelWidthMode.Equal,
            WheelWidthMode.Equal.resolveFor(WheelAlignment.Mixed),
        )
        assertEquals(
            WheelWidthMode.CenterContent,
            WheelWidthMode.CenterContent.resolveFor(WheelAlignment.Center),
        )
    }

    @Test
    fun `equal mode stretches every wheel`() {
        (1..4).forEach { wheelCount ->
            (0 until wheelCount).forEach { wheelIndex ->
                assertTrue(
                    "count=$wheelCount index=$wheelIndex",
                    shouldStretchWheel(WheelWidthMode.Equal, wheelIndex, wheelCount),
                )
            }
        }
    }

    @Test
    fun `center content with a single wheel stretches it`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 1))
    }

    @Test
    fun `center content with two wheels stretches both`() {
        (0..1).forEach { wheelIndex ->
            assertTrue(
                "index=$wheelIndex",
                shouldStretchWheel(WheelWidthMode.CenterContent, wheelIndex, 2),
            )
        }
    }

    @Test
    fun `center content with three wheels stretches only edges`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 3))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 1, 3))
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 2, 3))
    }

    @Test
    fun `center content with four wheels stretches only edges`() {
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 0, 4))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 1, 4))
        assertFalse(shouldStretchWheel(WheelWidthMode.CenterContent, 2, 4))
        assertTrue(shouldStretchWheel(WheelWidthMode.CenterContent, 3, 4))
    }

    @Test
    fun `builder style exposes its width mode via safeWidthMode`() {
        val style = WheelStyle.builder()
            .widthMode(WheelWidthMode.CenterContent)
            .style()

        assertEquals(WheelWidthMode.CenterContent, style.safeWidthMode())
    }

    @Test
    fun `builder style defaults to auto`() {
        assertEquals(WheelWidthMode.Auto, WheelStyle.builder().style().safeWidthMode())
    }

    @Test
    fun `style without width mode provider falls back to auto`() {
        // Имитация стиля, скомпилированного против версии uikit-compose без WheelWidthMode:
        // реализация WheelStyle, не реализующая WheelWidthModeProvider.
        val legacyStyle = LegacyCompiledWheelStyle()

        assertEquals(WheelWidthMode.Auto, legacyStyle.safeWidthMode())
    }
}

private class LegacyCompiledWheelStyle : WheelStyle {
    override val dimensions: WheelDimensions = WheelDimensions.builder().build()
    override val colors: WheelColors = WheelColors.builder().build()
    override val itemTextStyle: TextStyle = TextStyle.Default
    override val itemTextAfterStyle: TextStyle = TextStyle.Default
    override val descriptionStyle: TextStyle = TextStyle.Default
    override val itemAlignment: WheelAlignment = WheelAlignment.Center
    override val wheelCount: Int = 3
    override val visibleItemsCount: Int = 5
    override val controlIconUpSource: ImageSource? = null
    override val controlIconDownSource: ImageSource? = null
    override val dividerStyle: DividerStyle = DividerStyle.builder().style()
    override val textAfterMode: TextAfterMode = TextAfterMode.EachItem
    override val selectionIndicatorEnabled: Boolean = false
    override val selectionIndicatorShape: StatefulValue<Shape> = RectangleShape.asStatefulValue()

    @Deprecated("Не используется, используйте selectionIndicatorEnabled")
    override val itemSelectorEnabled: Boolean = false

    @Deprecated("Не используется, используйте selectionIndicatorShape")
    override val itemSelectorShape: StatefulValue<Shape> = RectangleShape.asStatefulValue()
}
