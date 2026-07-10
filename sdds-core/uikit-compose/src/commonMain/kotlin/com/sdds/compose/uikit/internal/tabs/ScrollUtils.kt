package com.sdds.compose.uikit.internal.tabs

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState

internal suspend fun scrollToTabIfNeeded(
    selectedIndex: Int,
    tabSizes: List<Int>,
    spacing: Int,
    scrollState: ScrollState,
) {
    if (tabSizes.size <= selectedIndex) return

    val totalWidthBeforeSelected = tabSizes.take(selectedIndex).sum() + selectedIndex * spacing
    val selectedTabWidth = tabSizes[selectedIndex]
    val totalWidthIncludingSelected = totalWidthBeforeSelected + selectedTabWidth

    val currentScroll = scrollState.value
    val visibleEnd = currentScroll + scrollState.viewportSize

    val targetScroll = when {
        totalWidthBeforeSelected < currentScroll -> totalWidthBeforeSelected
        totalWidthIncludingSelected > visibleEnd -> totalWidthIncludingSelected - scrollState.viewportSize
        else -> currentScroll
    }

    val maxScroll =
        (tabSizes.sum() + selectedIndex * spacing - scrollState.viewportSize).coerceAtLeast(0)
    val clampedTarget = targetScroll.coerceIn(0, maxScroll)

    if (clampedTarget != currentScroll) {
        scrollState.animateScrollTo(
            value = clampedTarget,
            animationSpec = tween(durationMillis = 300),
        )
    }
}

internal suspend fun scrollToNextTab(
    tabSizes: List<Int>,
    scrollState: ScrollState,
    spacing: Int,
) {
    if (tabSizes.isEmpty()) return

    val visibleSize = scrollState.viewportSize
    val currentScroll = scrollState.value
    val currentVisibleEnd = currentScroll + visibleSize

    var totalSize = 0
    var nextTabIndex = -1

    for (i in tabSizes.indices) {
        totalSize += tabSizes[i]
        if (totalSize > currentVisibleEnd) {
            nextTabIndex = i
            break
        }
        totalSize += spacing
    }

    if (nextTabIndex == -1) {
        val totalContentWidth = tabSizes.sum() + spacing * (tabSizes.size - 1)
        scrollState.animateScrollTo((totalContentWidth - visibleSize).coerceAtLeast(0))
        return
    }

    var accumulatedSize = 0
    for (i in 0..nextTabIndex) {
        accumulatedSize += if (i == nextTabIndex) {
            tabSizes[i]
        } else {
            tabSizes[i] + spacing
        }
    }

    val scrollToPosition = (accumulatedSize - visibleSize).coerceAtLeast(0)
    scrollState.animateScrollTo(scrollToPosition)
}

internal suspend fun scrollToPreviousTab(
    tabSizes: List<Int>,
    scrollState: ScrollState,
    spacing: Int,
) {
    if (tabSizes.isEmpty()) return
    val currentScroll = scrollState.value

    var totalSize = 0
    var previousTabIndex = -1

    for (i in tabSizes.indices) {
        val tabStart = totalSize
        val tabEnd = totalSize + tabSizes[i]
        if (tabStart < currentScroll && tabEnd > currentScroll) {
            previousTabIndex = i
            break
        }
        if (tabEnd <= currentScroll) {
            previousTabIndex = i
        }
        totalSize += tabSizes[i] + spacing
    }

    if (previousTabIndex == -1 || currentScroll == 0) {
        scrollState.animateScrollTo(0)
        return
    }

    var accumulatedSize = 0
    for (i in 0 until previousTabIndex) {
        accumulatedSize += tabSizes[i] + spacing
    }

    val scrollToPosition = accumulatedSize.coerceAtLeast(0)
    scrollState.animateScrollTo(scrollToPosition)
}
