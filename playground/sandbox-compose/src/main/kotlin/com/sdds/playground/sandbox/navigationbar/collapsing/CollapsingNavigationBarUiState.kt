package com.sdds.playground.sandbox.navigationbar.collapsing

import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.playground.sandbox.core.compose.UiState

internal data class CollapsingNavigationBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val collapsedTitle: String = "Title",
    val expandedTitle: String = "Title",
    val collapsedDescription: String = "Description",
    val expandedDescription: String = "Description",
    val contentText: String = "Content",
    val hasActionStart: Boolean = true,
    val hasActionEnd: Boolean = true,
    val collapsedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    val expandedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Start,
    val centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
