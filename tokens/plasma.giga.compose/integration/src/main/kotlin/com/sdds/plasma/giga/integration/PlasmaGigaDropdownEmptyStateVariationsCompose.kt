// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.plasma.giga.styles.dropdownemptystate.DropdownEmptyStateSize
import com.sdds.plasma.giga.styles.dropdownemptystate.DropdownEmptyStateStyles
import com.sdds.plasma.giga.styles.dropdownemptystate.HasButton
import com.sdds.plasma.giga.styles.dropdownemptystate.L
import com.sdds.plasma.giga.styles.dropdownemptystate.M
import com.sdds.plasma.giga.styles.dropdownemptystate.S
import com.sdds.plasma.giga.styles.dropdownemptystate.Xl
import com.sdds.plasma.giga.styles.dropdownemptystate.Xs
import com.sdds.plasma.giga.styles.dropdownemptystate.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaDropdownEmptyStateVariationsCompose : ComposeStyleProvider<DropdownEmptyStateStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.BooleanProperty(name = "hasButton", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownEmptyStateStyle>> =
        mapOf(
            "DropdownEmptyState.Xs" to ComposeStyleReference { DropdownEmptyState.Xs.style() },
            "DropdownEmptyState.Xs.HasButton" to ComposeStyleReference { DropdownEmptyState.Xs.HasButton.style() },
            "DropdownEmptyState.S" to ComposeStyleReference { DropdownEmptyState.S.style() },
            "DropdownEmptyState.S.HasButton" to ComposeStyleReference { DropdownEmptyState.S.HasButton.style() },
            "DropdownEmptyState.M" to ComposeStyleReference { DropdownEmptyState.M.style() },
            "DropdownEmptyState.M.HasButton" to ComposeStyleReference { DropdownEmptyState.M.HasButton.style() },
            "DropdownEmptyState.L" to ComposeStyleReference { DropdownEmptyState.L.style() },
            "DropdownEmptyState.L.HasButton" to ComposeStyleReference { DropdownEmptyState.L.HasButton.style() },
            "DropdownEmptyState.Xl" to ComposeStyleReference { DropdownEmptyState.Xl.style() },
            "DropdownEmptyState.Xl.HasButton" to ComposeStyleReference { DropdownEmptyState.Xl.HasButton.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownEmptyStateStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownEmptyStateSize.Xl
                "L" -> DropdownEmptyStateSize.L
                "M" -> DropdownEmptyStateSize.M
                "S" -> DropdownEmptyStateSize.S
                "Xs" -> DropdownEmptyStateSize.Xs
                else -> DropdownEmptyStateSize.Xl
            },
            hasButton = booleanBindingValue(bindings, "hasButton", false),
        ).key
    }
}
