package com.sdds.playground.sandbox.tabs.compose

import com.sdds.compose.uikit.TabsClip
import com.sdds.playground.sandbox.core.compose.UiState

internal data class TabsUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 5,
    val icon: TabItemIcon = TabItemIcon.None,
    val tabItemLabel: String = "Tab",
    val tabItemValue: String = "",
    val enabled: Boolean = true,
    val stretch: Boolean = false,
    val clip: TabsClip = TabsClip.Scroll,
    val counter: Boolean = false,
    val count: String = "1",
    val actionEnabled: Boolean = false,
    val dividerEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
) : UiState {

    override fun updateVariant(
        appearance: String,
        variant: String,
    ): UiState {
        return copy(variant = variant, appearance = appearance)
    }
}

internal enum class TabItemIcon {
    Start, End, None,
}
