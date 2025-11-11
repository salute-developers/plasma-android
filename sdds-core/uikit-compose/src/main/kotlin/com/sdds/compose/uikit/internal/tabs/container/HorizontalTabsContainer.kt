package com.sdds.compose.uikit.internal.tabs.container

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.internal.tabs.TabItemContainer
import com.sdds.compose.uikit.internal.tabs.TabItemDisclosure
import com.sdds.compose.uikit.internal.tabs.scrollToTabIfNeeded
import com.sdds.compose.uikit.internal.tabs.tabIndicator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
internal fun HorizontalTabsContainer(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndex: Int,
    onTabClicked: (Int) -> Unit,
    clip: TabsClip,
    spacingDp: Dp,
    spacingPx: Int,
    canStretch: Boolean,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable ((Boolean) -> Unit)>,
    disclosureContent: @Composable (() -> Unit)?,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    onDisclosureClick: () -> Unit,
    onOverflowTab: ((Int) -> Unit)?,
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
            selectedTabIndex = selectedTabIndex,
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
        RegularRow(
            style = style,
            enabled = enabled,
            selectedTabIndex = selectedTabIndex,
            onTabClicked = onTabClicked,
            clip = clip,
            spacingDp = spacingDp,
            spacingPx = spacingPx,
            canStretch = canStretch,
            coroutineScope = coroutineScope,
            scrollState = scrollState,
            indicatorEnabled = indicatorEnabled,
            interactionSource = interactionSource,
            tabSizes = tabSizes,
            tabs = tabs,
            onTabsMeasured = onTabsMeasured,
        )
    }
}

@Composable
private fun RegularRow(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndex: Int,
    onTabClicked: (Int) -> Unit,
    clip: TabsClip,
    spacingDp: Dp,
    spacingPx: Int,
    canStretch: Boolean,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable ((Boolean) -> Unit)>,
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
                indicatorThickness = style.dimensions.indicatorThickness,
                spacingDp = spacingDp,
                tabSizes = tabSizes,
                selectedTabIndex = selectedTabIndex,
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
                isSelected = index == selectedTabIndex,
                stretch = canStretch,
                onClick = {
                    onTabClicked(index)
                    if (clip == TabsClip.Scroll) {
                        coroutineScope.launch {
                            scrollToTabIfNeeded(
                                selectedIndex = index,
                                tabSizes = tabSizes,
                                spacing = spacingPx,
                                scrollState = scrollState,
                            )
                        }
                    }
                },
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
private fun ShowMoreRow(
    style: TabsStyle,
    enabled: Boolean,
    selectedTabIndex: Int,
    onTabClicked: (Int) -> Unit,
    spacingDp: Dp,
    canStretch: Boolean,
    scrollState: ScrollState,
    indicatorEnabled: Boolean,
    interactionSource: InteractionSource,
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable ((Boolean) -> Unit)>,
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
                    isSelected = index == selectedTabIndex,
                    enabled = enabled,
                    onClick = { onTabClicked(index) },
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
                indicatorThickness = style.dimensions.indicatorThickness,
                spacingDp = spacingDp,
                tabSizes = tabSizes,
                selectedTabIndex = selectedTabIndex,
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
