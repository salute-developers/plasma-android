package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.serv.styles.dropdownemptystate.HasButton
import com.sdds.serv.styles.dropdownemptystate.L
import com.sdds.serv.styles.dropdownemptystate.M
import com.sdds.serv.styles.dropdownemptystate.S
import com.sdds.serv.styles.dropdownemptystate.Xl
import com.sdds.serv.styles.dropdownemptystate.Xs

internal object SddsServDropdownEmptyStateVariationsCompose : ComposeStyleProvider<String, DropdownEmptyStateStyle>() {
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
