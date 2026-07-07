package com.sdds.compose.uikit.internal.tabs.container

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.verticalScroll
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
internal fun VerticalTabsContainer(
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
            set(index, intSize.height)
        }
    }
    if (clip == TabsClip.ShowMore) {
        ShowMoreColumn(
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
            AutoStretchScrollableColumn(
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
            RegularColumn(
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
private fun RegularColumn(
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
    Column(
        verticalArrangement = Arrangement.spacedBy(spacingDp),
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
                orientation = TabsOrientation.Vertical,
                clip = clip,
            )
            .clipModifier(clip, scrollState, enabled, canStretch),
    ) {
        tabs.forEachIndexed { index, tabItem ->
            TabItemContainer(
                modifier = if (canStretch) Modifier.weight(1f) else Modifier,
                stretch = canStretch,
                onClick = { onTabClicked?.invoke(index) },
                onSizeMeasured = { intSize -> onTabsMeasured.invoke(index, intSize) },
                tabItemStyle = style.tabItemStyle,
                enabled = enabled,
                tabItemContent = tabItem,
            )
        }
    }
}

@Composable
private fun AutoStretchScrollableColumn(
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
            maxHeight = Constraints.Infinity,
            minHeight = 0,
        )
        val naturalHeights = subcompose(AutoStretchScrollableColumnSlot.Measure) {
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
            measurable.measure(measureConstraints).height
        }

        val totalNaturalHeight = naturalHeights.sum() +
            minSpacingDp.roundToPx() * (naturalHeights.size - 1).coerceAtLeast(0)
        val canStretchWithoutScroll = totalNaturalHeight <= constraints.maxHeight
        onScrollControlsVisibilityChange?.invoke(!canStretchWithoutScroll)
        val effectiveSpacing = if (canStretchWithoutScroll) 0.dp else minSpacingDp
        val effectiveClip = if (canStretchWithoutScroll) TabsClip.None else TabsClip.Scroll

        val contentPlaceable = subcompose(AutoStretchScrollableColumnSlot.Content) {
            Column(
                verticalArrangement = Arrangement.spacedBy(effectiveSpacing),
                modifier = Modifier
                    .then(
                        if (canStretchWithoutScroll) {
                            Modifier.fillMaxHeight()
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
                        orientation = TabsOrientation.Vertical,
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
                        stretch = canStretchWithoutScroll,
                        onClick = { onTabClicked?.invoke(index) },
                        onSizeMeasured = { intSize -> onTabsMeasured.invoke(index, intSize) },
                        tabItemStyle = style.tabItemStyle,
                        enabled = enabled,
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

private enum class AutoStretchScrollableColumnSlot {
    Measure,
    Content,
}

@Composable
private fun ShowMoreColumn(
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
    OverflowColumn(
        items = tabs.mapIndexed { index, tabItem ->
            {
                TabItemContainer(
                    stretch = canStretch,
                    onClick = onTabClicked?.let { tabClicked ->
                        {
                            tabClicked(index)
                        }
                    },
                    onSizeMeasured = { intSize -> onTabsMeasured.invoke(index, intSize) },
                    tabItemStyle = style.tabItemStyle,
                    tabItemContent = tabItem,
                    enabled = enabled,
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
                orientation = TabsOrientation.Vertical,
                clip = TabsClip.ShowMore,
            ),
        spacing = spacingDp,
        onOverflowIndex = { onOverflowTab?.invoke(it) },
        disclosure = {
            TabItemDisclosure(
                disclosureBtn = disclosureContent,
                style = style,
                dropdownTriggerInfo = dropdownTriggerInfo,
                onClick = onDisclosureClick,
                enabled = enabled,
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
        clip == TabsClip.Scroll -> this.verticalScroll(
            state = scrollState,
            enabled = enabled,
        )

        clip == TabsClip.None && !canStretch -> this.wrapContentSize(
            unbounded = true,
            align = Alignment.TopCenter,
        )

        else -> this
    }
}
