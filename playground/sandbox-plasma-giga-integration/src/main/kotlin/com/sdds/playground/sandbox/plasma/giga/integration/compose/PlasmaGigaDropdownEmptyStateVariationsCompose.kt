package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.plasma.giga.styles.dropdownemptystate.HasButton
import com.sdds.plasma.giga.styles.dropdownemptystate.L
import com.sdds.plasma.giga.styles.dropdownemptystate.M
import com.sdds.plasma.giga.styles.dropdownemptystate.S
import com.sdds.plasma.giga.styles.dropdownemptystate.Xl
import com.sdds.plasma.giga.styles.dropdownemptystate.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaDropdownEmptyStateVariationsCompose : ComposeStyleProvider<String, DropdownEmptyStateStyle>() {
    override val variations: Map<String, @Composable () -> DropdownEmptyStateStyle> =
        mapOf(
            "Xs" to { DropdownEmptyState.Xs.style() },
            "Xs.HasButton" to { DropdownEmptyState.Xs.HasButton.style() },
            "S" to { DropdownEmptyState.S.style() },
            "S.HasButton" to { DropdownEmptyState.S.HasButton.style() },
            "M" to { DropdownEmptyState.M.style() },
            "M.HasButton" to { DropdownEmptyState.M.HasButton.style() },
            "L" to { DropdownEmptyState.L.style() },
            "L.HasButton" to { DropdownEmptyState.L.HasButton.style() },
            "Xl" to { DropdownEmptyState.Xl.style() },
            "Xl.HasButton" to { DropdownEmptyState.Xl.HasButton.style() },
        )
}
