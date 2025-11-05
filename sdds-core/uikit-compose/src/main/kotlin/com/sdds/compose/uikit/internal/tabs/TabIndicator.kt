package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.TabsOrientation

@Composable
internal fun Modifier.tabIndicator(
    indicatorEnabled: Boolean,
    indicatorColor: Color,
    indicatorThickness: Dp,
    spacingDp: Dp,
    tabSizes: List<Int>,
    selectedTabIndex: Int,
    scrollState: ScrollState,
    orientation: TabsOrientation,
): Modifier {
    return if (indicatorEnabled) {
        this.drawBehind {
            if (tabSizes.isNotEmpty() && selectedTabIndex < tabSizes.size) {
                val spacing = spacingDp.toPx()
                val totalSizeBeforeSelected =
                    tabSizes.take(selectedTabIndex).sum() + selectedTabIndex * spacing
                val scrollOffset = scrollState.value
                val indicatorMainAxisOffset = totalSizeBeforeSelected - scrollOffset
                val indicatorMainAxisSize = tabSizes[selectedTabIndex]
                val indicatorThickness = indicatorThickness
                val topStartOffset = when (orientation) {
                    TabsOrientation.Horizontal -> Offset(
                        indicatorMainAxisOffset,
                        size.height - indicatorThickness.toPx(),
                    )

                    TabsOrientation.Vertical -> Offset(
                        0f,
                        indicatorMainAxisOffset,
                    )
                }
                val indicatorSize = when (orientation) {
                    TabsOrientation.Horizontal -> Size(
                        width = indicatorMainAxisSize.toFloat(),
                        height = indicatorThickness.toPx(),
                    )

                    TabsOrientation.Vertical -> Size(
                        width = indicatorThickness.toPx(),
                        height = indicatorMainAxisSize.toFloat(),
                    )
                }

                drawRect(
                    color = indicatorColor,
                    topLeft = topStartOffset,
                    size = indicatorSize,
                )
            }
        }
    } else {
        this
    }
}
