package com.sdds.compose.uikit.internal.tabs.container

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.internal.tabs.TabItemContainer
import com.sdds.compose.uikit.internal.tabs.TabItemDisclosure
import com.sdds.compose.uikit.internal.tabs.tabIndicator

@Composable
internal fun HorizontalTabsContainer(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndexProvider: () -> Int,
    selectedTabOffset: () -> Float,
    onTabClicked: ((Int) -> Unit)? = null,
    clip: TabsClip,
    spacingDp: Dp,
    minSpacingDp: Dp,
    canStretch: Boolean,
    stretchForScroll: Boolean,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable (() -> Unit)>,
    disclosureContent: @Composable (() -> Unit)?,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    onDisclosureClick: () -> Unit,
    onOverflowTab: ((Int) -> Unit)?,
    onScrollControlsVisibilityChange: ((Boolean) -> Unit)?,
) {
    val onTabsMeasured: (Int, IntSize) -> Unit = { index, intSize ->
        tabSizes.apply {
            if (index >= size) addAll(List(index - size + 1) { 0 })
            set(index, intSize.width)
        }
    }

    if (clip == TabsClip.ShowMore) {
        ShowMoreRow(
            style = style,
            enabled = enabled,
            selectedTabIndexProvider = selectedTabIndexProvider,
            selectedTabOffset = selectedTabOffset,
            onTabClicked = onTabClicked,
            spacingDp = spacingDp,
            canStretch = canStretch,
            scrollState = scrollState,
            indicatorEnabled = indicatorEnabled,
            interactionSource = interactionSource,
            tabSizes = tabSizes,
            tabs = tabs,
            disclosureContent = disclosureContent,
            dropdownTriggerInfo = dropdownTriggerInfo,
            onDisclosureClick = onDisclosureClick,
            onOverflowTab = onOverflowTab,
            onTabsMeasured = onTabsMeasured,
        )
    } else {
        if (clip == TabsClip.Scroll && stretchForScroll) {
            AutoStretchScrollableRow(
                style = style,
                enabled = enabled,
                selectedTabIndexProvider = selectedTabIndexProvider,
                selectedTabOffset = selectedTabOffset,
                onTabClicked = onTabClicked,
                minSpacingDp = minSpacingDp,
                scrollState = scrollState,
                indicatorEnabled = indicatorEnabled,
                interactionSource = interactionSource,
                tabSizes = tabSizes,
                tabs = tabs,
                onTabsMeasured = onTabsMeasured,
                onScrollControlsVisibilityChange = onScrollControlsVisibilityChange,
            )
        } else {
            RegularRow(
                style = style,
                enabled = enabled,
                selectedTabIndexProvider = selectedTabIndexProvider,
                selectedTabOffset = selectedTabOffset,
                onTabClicked = onTabClicked,
                clip = clip,
                spacingDp = spacingDp,
                canStretch = canStretch,
                scrollState = scrollState,
                indicatorEnabled = indicatorEnabled,
                interactionSource = interactionSource,
                tabSizes = tabSizes,
                tabs = tabs,
                onTabsMeasured = onTabsMeasured,
            )
        }
    }
}

@Composable
private fun RegularRow(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndexProvider: () -> Int,
    selectedTabOffset: () -> Float,
    onTabClicked: ((Int) -> Unit)?,
    clip: TabsClip,
    spacingDp: Dp,
    canStretch: Boolean,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable (() -> Unit)>,
    onTabsMeasured: (Int, IntSize) -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(spacingDp),
        modifier = Modifier
            .tabIndicator(
                indicatorEnabled = indicatorEnabled,
                indicatorColor = style.colors.indicatorColor.colorForInteraction(
                    interactionSource,
                ),
                indicatorShape = style.indicatorShape,
                indicatorThickness = style.dimensions.indicatorThickness,
                spacingDp = spacingDp,
                tabSizes = tabSizes,
                selectedTabIndexProvider = selectedTabIndexProvider,
                selectedTabOffset = selectedTabOffset,
                scrollState = scrollState,
                orientation = TabsOrientation.Horizontal,
                clip = clip,
            )
            .clipModifier(clip, scrollState, enabled, canStretch),
    ) {
        tabs.forEachIndexed { index, tabItem ->
            TabItemContainer(
                modifier = if (canStretch) Modifier.weight(1f) else Modifier,
                enabled = enabled,
                stretch = canStretch,
                onClick = { onTabClicked?.invoke(index) },
                onSizeMeasured = { intSize ->
                    onTabsMeasured.invoke(index, intSize)
                },
                tabItemStyle = style.tabItemStyle,
                tabItemContent = tabItem,
            )
        }
    }
}

@Composable
private fun AutoStretchScrollableRow(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndexProvider: () -> Int,
    selectedTabOffset: () -> Float,
    onTabClicked: ((Int) -> Unit)?,
    minSpacingDp: Dp,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable (() -> Unit)>,
    onTabsMeasured: (Int, IntSize) -> Unit,
    onScrollControlsVisibilityChange: ((Boolean) -> Unit)?,
) {
    SubcomposeLayout { constraints ->
        val measureConstraints = constraints.copy(
            minWidth = 0,
            maxWidth = Constraints.Infinity,
            minHeight = 0,
        )
        val naturalWidths = subcompose(AutoStretchScrollableRowSlot.Measure) {
            tabs.forEach { tabItem ->
                TabItemContainer(
                    stretch = false,
                    enabled = enabled,
                    onClick = null,
                    onSizeMeasured = {},
                    tabItemStyle = style.tabItemStyle,
                    tabItemContent = tabItem,
                )
            }
        }.map { measurable ->
            measurable.measure(measureConstraints).width
        }

        val totalNaturalWidth = naturalWidths.sum() +
            minSpacingDp.roundToPx() * (naturalWidths.size - 1).coerceAtLeast(0)
        val canStretchWithoutScroll = totalNaturalWidth <= constraints.maxWidth
        onScrollControlsVisibilityChange?.invoke(!canStretchWithoutScroll)
        val effectiveSpacing = if (canStretchWithoutScroll) 0.dp else minSpacingDp
        val effectiveClip = if (canStretchWithoutScroll) TabsClip.None else TabsClip.Scroll

        val contentPlaceable = subcompose(AutoStretchScrollableRowSlot.Content) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(effectiveSpacing),
                modifier = Modifier
                    .then(
                        if (canStretchWithoutScroll) {
                            Modifier.fillMaxWidth()
                        } else {
                            Modifier
                        },
                    )
                    .tabIndicator(
                        indicatorEnabled = indicatorEnabled,
                        indicatorColor = style.colors.indicatorColor.colorForInteraction(
                            interactionSource,
                        ),
                        indicatorShape = style.indicatorShape,
                        indicatorThickness = style.dimensions.indicatorThickness,
                        spacingDp = effectiveSpacing,
                        tabSizes = tabSizes,
                        selectedTabIndexProvider = selectedTabIndexProvider,
                        selectedTabOffset = selectedTabOffset,
                        scrollState = scrollState,
                        orientation = TabsOrientation.Horizontal,
                        clip = effectiveClip,
                    )
                    .clipModifier(
                        clip = effectiveClip,
                        scrollState = scrollState,
                        enabled = enabled,
                        canStretch = canStretchWithoutScroll,
                    ),
            ) {
                tabs.forEachIndexed { index, tabItem ->
                    TabItemContainer(
                        modifier = if (canStretchWithoutScroll) Modifier.weight(1f) else Modifier,
                        enabled = enabled,
                        stretch = canStretchWithoutScroll,
                        onClick = { onTabClicked?.invoke(index) },
                        onSizeMeasured = { intSize ->
                            onTabsMeasured.invoke(index, intSize)
                        },
                        tabItemStyle = style.tabItemStyle,
                        tabItemContent = tabItem,
                    )
                }
            }
        }.first().measure(constraints)

        layout(contentPlaceable.width, contentPlaceable.height) {
            contentPlaceable.placeRelative(0, 0)
        }
    }
}

private enum class AutoStretchScrollableRowSlot {
    Measure,
    Content,
}

@Composable
private fun ShowMoreRow(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndexProvider: () -> Int,
    selectedTabOffset: () -> Float,
    onTabClicked: ((Int) -> Unit)?,
    spacingDp: Dp,
    canStretch: Boolean,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable (() -> Unit)>,
    disclosureContent: @Composable (() -> Unit)?,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    onDisclosureClick: () -> Unit,
    onOverflowTab: ((Int) -> Unit)?,
    onTabsMeasured: (Int, IntSize) -> Unit,
) {
    OverflowRow(
        items = tabs.mapIndexed { index, tabItem ->
            {
                TabItemContainer(
                    stretch = canStretch,
                    enabled = enabled,
                    onClick = onTabClicked?.let { tabClicked ->
                        {
                            tabClicked(index)
                        }
                    },
                    onSizeMeasured = { intSize -> onTabsMeasured.invoke(index, intSize) },
                    tabItemStyle = style.tabItemStyle,
                    tabItemContent = tabItem,
                )
            }
        },
        modifier = Modifier
            .tabIndicator(
                indicatorEnabled = indicatorEnabled,
                indicatorColor = style.colors.indicatorColor.colorForInteraction(
                    interactionSource,
                ),
                indicatorShape = style.indicatorShape,
                indicatorThickness = style.dimensions.indicatorThickness,
                spacingDp = spacingDp,
                tabSizes = tabSizes,
                selectedTabIndexProvider = selectedTabIndexProvider,
                selectedTabOffset = selectedTabOffset,
                scrollState = scrollState,
                orientation = TabsOrientation.Horizontal,
                clip = TabsClip.ShowMore,
            ),
        spacing = spacingDp,
        onOverflowIndex = { onOverflowTab?.invoke(it) },
        disclosure = {
            TabItemDisclosure(
                disclosureBtn = disclosureContent,
                style = style,
                dropdownTriggerInfo = dropdownTriggerInfo,
                enabled = enabled,
                onClick = onDisclosureClick,
            )
        },
    )
}

private fun Modifier.clipModifier(
    clip: TabsClip,
    scrollState: ScrollState,
    enabled: Boolean,
    canStretch: Boolean,
): Modifier {
    return when {
        clip == TabsClip.Scroll -> this.horizontalScroll(
            state = scrollState,
            enabled = enabled,
        )

        clip == TabsClip.None && !canStretch -> this.wrapContentSize(
            unbounded = true,
            align = Alignment.CenterStart,
        )

        else -> this
    }
}
