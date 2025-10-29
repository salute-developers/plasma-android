package com.sdds.playground.sandbox.tabbar.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class TabBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val items: List<Int> = listOf(1, 2, 3),
    val customWeight: Boolean = false,
    val current: Int = items.first(),
    val extraType: TabBarExtraType = TabBarExtraType.Counter,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class TabBarExtraType {
    None,
    Counter,
    Indicator,
}
