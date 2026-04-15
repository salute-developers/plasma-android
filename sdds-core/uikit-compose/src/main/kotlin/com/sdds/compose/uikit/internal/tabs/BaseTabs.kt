package com.sdds.compose.uikit.internal.tabs

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DividerOrientation
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.LocalTabsStyle
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TabScope
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.internal.tabs.Tabs.DISABLE_ALPHA
import com.sdds.compose.uikit.internal.tabs.Tabs.DIVIDER_LAYOUT_ID
import com.sdds.compose.uikit.internal.tabs.Tabs.END_BUTTON_LAYOUT_ID
import com.sdds.compose.uikit.internal.tabs.Tabs.TABS_CONTAINER_LAYOUT_ID
import com.sdds.compose.uikit.internal.tabs.container.TabsContainer
import com.sdds.compose.uikit.internal.tabs.measure.HorizontalMeasurePolicy
import com.sdds.compose.uikit.internal.tabs.measure.VerticalMeasurePolicy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
@Suppress("LongMethod")
internal fun BaseTabs(
    selectedTabIndexProvider: () -> Int,
    onDisclosureTabClicked: ((Int) -> Unit)? = null,
    modifier: Modifier = Modifier,
    style: TabsStyle = LocalTabsStyle.current,
    onTabClicked: ((Int) -> Unit)? = null,
    selectedTabOffset: () -> Float = { 0f },
    clip: TabsClip = TabsClip.None,
    stretch: Boolean = false,
    enabled: Boolean = true,
    indicatorEnabled: Boolean = style.indicatorEnabled,
    dividerEnabled: Boolean = style.dividerEnabled,
    orientation: TabsOrientation = style.orientation,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    tabs: TabScope.() -> Unit,
) {
    var overflowIndex by remember { mutableIntStateOf(-1) }
    val tabScope = remember(selectedTabIndexProvider) { TabScopeImpl(selectedTabIndexProvider) }
    tabScope.reset()
    tabScope.tabs()
    Box(modifier = modifier) {
        @DrawableRes
        val overFlowNextIcon: Int? = style.overflowNextIcon

        @DrawableRes
        val overFlowPrevIcon: Int? = style.overflowPrevIcon
        val dropdownTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
        val showDropdown = remember { mutableStateOf(false) }
        Layout(
            modifier = Modifier
                .clip(style.shape)
                .background(
                    color = style.colors.backgroundColor.colorForInteraction(interactionSource),
                )
                .padding(
                    start = style.dimensions.contentPaddingStart,
                    top = style.dimensions.contentPaddingTop,
                    end = style.dimensions.contentPaddingEnd,
                    bottom = style.dimensions.contentPaddingBottom,
                ),
            measurePolicy = remember(orientation) {
                when (orientation) {
                    TabsOrientation.Horizontal -> HorizontalMeasurePolicy()
                    TabsOrientation.Vertical -> VerticalMeasurePolicy()
                }
            },
            content = {
                val scrollState = rememberScrollState()
                val coroutineScope = rememberCoroutineScope()
                val canStretch = stretch && clip != TabsClip.Scroll
                val spacingDp = getItemSpacing(style.dimensions.minSpacing, canStretch)
                val spacingPx = with(LocalDensity.current) {
                    spacingDp.roundToPx()
                }
                val tabSizes = remember { mutableStateListOf<Int>() }
                StartControl(
                    overFlowIcon = overFlowPrevIcon,
                    clip = clip,
                    coroutineScope = coroutineScope,
                    scrollState = scrollState,
                    tabSizes = tabSizes,
                    spacingPx = spacingPx,
                    color = style.colors.overflowPrevIconColor,
                    interactionSource = interactionSource,
                    enabled = enabled,
                )
                TabsContainer(
                    modifier = Modifier
                        .layoutId(TABS_CONTAINER_LAYOUT_ID)
                        .clip(style.shape),
                    style = style,
                    enabled = enabled,
                    selectedTabIndexProvider = selectedTabIndexProvider,
                    selectedTabOffset = selectedTabOffset,
                    onTabClicked = onTabClicked,
                    clip = clip,
                    canStretch = canStretch,
                    spacingDp = spacingDp,
                    spacingPx = spacingPx,
                    scrollState = scrollState,
                    coroutineScope = coroutineScope,
                    indicatorEnabled = indicatorEnabled,
                    orientation = orientation,
                    interactionSource = interactionSource,
                    tabSizes = tabSizes,
                    dropdownTriggerInfo = dropdownTriggerInfo,
                    onDisclosureClick = { showDropdown.value = true },
                    tabs = tabScope.tabs.map { it.main },
                    disclosureContent = tabScope.disclosureContent,
                    onOverflowTab = { overflowIndex = it },
                )
                EndControl(
                    overFlowIcon = overFlowNextIcon,
                    clip = clip,
                    coroutineScope = coroutineScope,
                    scrollState = scrollState,
                    tabSizes = tabSizes,
                    spacingPx = spacingPx,
                    color = style.colors.overflowNextIconColor,
                    interactionSource = interactionSource,
                    enabled = enabled,
                )
                if (dividerEnabled) {
                    Divider(
                        modifier = Modifier.layoutId(DIVIDER_LAYOUT_ID),
                        style = style.dividerStyle,
                        orientation = when (orientation) {
                            TabsOrientation.Horizontal -> DividerOrientation.Horizontal
                            TabsOrientation.Vertical -> DividerOrientation.Vertical
                        },
                    )
                }
            },
        )

        DropdownIfNeed(
            clip = clip,
            showDropdown = showDropdown,
            style = style,
            dropdownTriggerInfo = dropdownTriggerInfo,
            tabScope = tabScope,
            overflowIndex = overflowIndex,
            onTabClicked = onDisclosureTabClicked,
        )
    }
}

internal object Tabs {
    const val DISABLE_ALPHA = 0.4f
    const val START_BUTTON_LAYOUT_ID = "StartButton"
    const val END_BUTTON_LAYOUT_ID = "EndButton"
    const val DIVIDER_LAYOUT_ID = "Divider"
    const val TABS_CONTAINER_LAYOUT_ID = "TabsContainer"
}

@Composable
private fun DropdownIfNeed(
    clip: TabsClip,
    showDropdown: MutableState<Boolean>,
    style: TabsStyle,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    tabScope: TabScopeImpl,
    overflowIndex: Int,
    onTabClicked: ((Int) -> Unit)? = null,
) {
    if (clip == TabsClip.ShowMore) {
        DropdownMenu(
            modifier = Modifier,
            opened = showDropdown.value,
            onDismissRequest = { showDropdown.value = false },
            triggerInfo = dropdownTriggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Start,
            style = style.dropdownMenuStyle,
        ) {
            com.sdds.compose.uikit.List {
                for (i in overflowIndex..tabScope.tabs.lastIndex) {
                    item {
                        val interactionSource = remember { MutableInteractionSource() }
                        ListItem(
                            modifier = Modifier
                                .clickable(
                                    indication = null,
                                    interactionSource = interactionSource,
                                ) {
                                    onTabClicked?.invoke(i)
                                    showDropdown.value = false
                                }
                                .focusable(interactionSource = interactionSource),
                            text = tabScope.tabs[i].dropdownAlias,
                            disclosureEnabled = false,
                            interactionSource = interactionSource,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun StartControl(
    overFlowIcon: Int?,
    clip: TabsClip,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    tabSizes: SnapshotStateList<Int>,
    spacingPx: Int,
    color: InteractiveColor,
    interactionSource: InteractionSource,
    enabled: Boolean,
) {
    if (overFlowIcon != null && clip == TabsClip.Scroll) {
        val nonTransparentAlpha = if (enabled) 1f else DISABLE_ALPHA
        Icon(
            modifier = Modifier
                .graphicsLayer { alpha = if (!scrollState.isStart()) nonTransparentAlpha else 0f }
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    coroutineScope.launch {
                        scrollToPreviousTab(
                            tabSizes = tabSizes,
                            scrollState = scrollState,
                            spacing = spacingPx,
                        )
                    }
                }
                .layoutId(Tabs.START_BUTTON_LAYOUT_ID),
            painter = painterResource(overFlowIcon),
            contentDescription = "",
            tint = color.colorForInteraction(interactionSource),
        )
    }
}

@Composable
private fun EndControl(
    overFlowIcon: Int?,
    clip: TabsClip,
    coroutineScope: CoroutineScope,
    scrollState: ScrollState,
    tabSizes: SnapshotStateList<Int>,
    spacingPx: Int,
    color: InteractiveColor,
    interactionSource: InteractionSource,
    enabled: Boolean,
) {
    if (overFlowIcon != null && clip == TabsClip.Scroll) {
        val nonTransparentAlpha = if (enabled) 1f else DISABLE_ALPHA
        Icon(
            modifier = Modifier
                .graphicsLayer { alpha = if (!scrollState.isEnd()) nonTransparentAlpha else 0f }
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                ) {
                    coroutineScope.launch {
                        scrollToNextTab(
                            tabSizes = tabSizes,
                            scrollState = scrollState,
                            spacing = spacingPx,
                        )
                    }
                }
                .layoutId(END_BUTTON_LAYOUT_ID),
            painter = painterResource(overFlowIcon),
            contentDescription = "",
            tint = color.colorForInteraction(interactionSource),
        )
    }
}

private fun ScrollState.isStart(): Boolean {
    return this.value == 0
}

private fun ScrollState.isEnd(): Boolean {
    return this.value == this.maxValue
}

private fun getItemSpacing(styleMinSpacing: Dp, canStretch: Boolean) =
    if (canStretch) 0.dp else styleMinSpacing
