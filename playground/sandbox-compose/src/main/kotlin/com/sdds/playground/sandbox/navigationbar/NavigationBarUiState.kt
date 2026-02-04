package com.sdds.playground.sandbox.navigationbar

import com.sdds.compose.uikit.NavBarCenterAlignmentStrategy
import com.sdds.compose.uikit.NavigationBarContentPlacement
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.playground.sandbox.core.compose.UiState

internal data class NavigationBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val description: String = "Description",
    val contentText: String = "Content",
    val hasActionStart: Boolean = true,
    val hasActionEnd: Boolean = true,
    val textPlacement: NavigationBarTextPlacement = NavigationBarTextPlacement.Bottom,
    val contentPlacement: NavigationBarContentPlacement = NavigationBarContentPlacement.Bottom,
    val textAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    val centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
