// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.plasma.giga.styles.dropdownemptystate.HasButton
import com.sdds.plasma.giga.styles.dropdownemptystate.L
import com.sdds.plasma.giga.styles.dropdownemptystate.M
import com.sdds.plasma.giga.styles.dropdownemptystate.S
import com.sdds.plasma.giga.styles.dropdownemptystate.Xl
import com.sdds.plasma.giga.styles.dropdownemptystate.Xs

internal object PlasmaGigaDropdownEmptyStateVariationsCompose : ComposeStyleProvider<DropdownEmptyStateStyle>() {
    override val variations: Map<String, ComposeStyleReference<DropdownEmptyStateStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { DropdownEmptyState.Xs.style() },
            "Xs.HasButton" to ComposeStyleReference { DropdownEmptyState.Xs.HasButton.style() },
            "S" to ComposeStyleReference { DropdownEmptyState.S.style() },
            "S.HasButton" to ComposeStyleReference { DropdownEmptyState.S.HasButton.style() },
            "M" to ComposeStyleReference { DropdownEmptyState.M.style() },
            "M.HasButton" to ComposeStyleReference { DropdownEmptyState.M.HasButton.style() },
            "L" to ComposeStyleReference { DropdownEmptyState.L.style() },
            "L.HasButton" to ComposeStyleReference { DropdownEmptyState.L.HasButton.style() },
            "Xl" to ComposeStyleReference { DropdownEmptyState.Xl.style() },
            "Xl.HasButton" to ComposeStyleReference { DropdownEmptyState.Xl.HasButton.style() },
        )
}
