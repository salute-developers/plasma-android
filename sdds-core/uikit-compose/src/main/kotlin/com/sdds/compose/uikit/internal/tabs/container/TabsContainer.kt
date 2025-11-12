package com.sdds.compose.uikit.internal.tabs.container

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.LocalTabsStyle
import com.sdds.compose.uikit.Tabs.DISABLE_ALPHA
import com.sdds.compose.uikit.TabsClip
import com.sdds.compose.uikit.TabsOrientation
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TriggerInfo
import kotlinx.coroutines.CoroutineScope

@Composable
internal fun TabsContainer(
    modifier: Modifier = Modifier,
    style: TabsStyle = LocalTabsStyle.current,
    enabled: Boolean,
    selectedTabIndex: Int,
    onTabClicked: (Int) -> Unit,
    clip: TabsClip = TabsClip.None,
    spacingDp: Dp,
    spacingPx: Int,
    canStretch: Boolean = false,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    scrollState: ScrollState = rememberScrollState(),
    indicatorEnabled: Boolean = style.indicatorEnabled,
    orientation: TabsOrientation = TabsOrientation.Horizontal,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    tabSizes: SnapshotStateList<Int>,
    tabs: List<@Composable ((Boolean) -> Unit)>,
    disclosureContent: @Composable (() -> Unit)? = null,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    onDisclosureClick: () -> Unit,
    onOverflowTab: ((Int) -> Unit)? = null,
) {
    if (tabs.isEmpty()) return

    Box(modifier.graphicsLayer { alpha = if (enabled) 1f else DISABLE_ALPHA }) {
        when (orientation) {
            TabsOrientation.Horizontal -> HorizontalTabsContainer(
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
                disclosureContent = disclosureContent,
                dropdownTriggerInfo = dropdownTriggerInfo,
                onDisclosureClick = onDisclosureClick,
                onOverflowTab = onOverflowTab,
            )

            TabsOrientation.Vertical -> VerticalTabsContainer(
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
                disclosureContent = disclosureContent,
                dropdownTriggerInfo = dropdownTriggerInfo,
                onDisclosureClick = onDisclosureClick,
                onOverflowTab = onOverflowTab,
            )
        }
    }
}
