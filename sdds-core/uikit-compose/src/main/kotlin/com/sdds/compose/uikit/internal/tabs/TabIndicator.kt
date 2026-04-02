package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import kotlin.math.ceil
import kotlin.math.floor

@Composable
internal fun Modifier.tabIndicator(
    indicatorEnabled: Boolean,
    indicatorColor: Color,
    indicatorThickness: Dp,
    spacingDp: Dp,
    tabSizes: List<Int>,
    selectedTabIndexProvider: () -> Int,
    selectedTabOffset: () -> Float,
    scrollState: ScrollState,
    orientation: TabsOrientation,
    clip: TabsClip,
    indicatorShape: Shape = RectangleShape,
): Modifier {
    return if (indicatorEnabled) {
        this.drawWithCache {
            val selectedTabIndex = selectedTabIndexProvider()
            if (tabSizes.isNotEmpty() && selectedTabIndex < tabSizes.size) {
                val spacing = spacingDp.toPx()
                val indicatorPosition =
                    (selectedTabIndex + selectedTabOffset()).coerceIn(0f, tabSizes.lastIndex.toFloat())
                val fromIndex = floor(indicatorPosition).toInt()
                val toIndex = ceil(indicatorPosition).toInt()
                val fraction = indicatorPosition - fromIndex
                val totalSizeBeforeTab = { index: Int ->
                    tabSizes.take(index).sum().toFloat() + index * spacing
                }
                val scrollOffset = when (clip) {
                    TabsClip.Scroll -> scrollState.value.toFloat()
                    else -> 0f
                }
                val fromMainAxisOffset = totalSizeBeforeTab(fromIndex)
                val toMainAxisOffset = totalSizeBeforeTab(toIndex)
                val indicatorMainAxisOffset =
                    lerp(fromMainAxisOffset, toMainAxisOffset, fraction) - scrollOffset
                val indicatorMainAxisSize = lerp(
                    start = tabSizes[fromIndex].toFloat(),
                    stop = tabSizes[toIndex].toFloat(),
                    fraction = fraction,
                )
                val indicatorCrossAxisSize =
                    if (indicatorThickness != Dp.Unspecified) {
                        indicatorThickness.toPx()
                    } else {
                        size.height
                    }
                val topStartOffset = when (orientation) {
                    TabsOrientation.Horizontal -> Offset(
                        indicatorMainAxisOffset,
                        size.height - indicatorCrossAxisSize,
                    )

                    TabsOrientation.Vertical -> Offset(
                        0f,
                        indicatorMainAxisOffset,
                    )
                }
                val indicatorSize = when (orientation) {
                    TabsOrientation.Horizontal -> Size(
                        width = indicatorMainAxisSize,
                        height = indicatorCrossAxisSize,
                    )

                    TabsOrientation.Vertical -> Size(
                        width = indicatorCrossAxisSize,
                        height = indicatorMainAxisSize,
                    )
                }
                val outline = indicatorShape.createOutline(
                    size = indicatorSize,
                    layoutDirection = layoutDirection,
                    density = this,
                )
                onDrawBehind {
                    translate(left = topStartOffset.x, top = topStartOffset.y) {
                        drawOutline(
                            outline = outline,
                            color = indicatorColor,
                        )
                    }
                }
            } else {
                onDrawBehind {  }
            }
        }
    } else {
        this
    }
}

private fun lerp(start: Float, stop: Float, fraction: Float): Float {
    return start + (stop - start) * fraction
}
