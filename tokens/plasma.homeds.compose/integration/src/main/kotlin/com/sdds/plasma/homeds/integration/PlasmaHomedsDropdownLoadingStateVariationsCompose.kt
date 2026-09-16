// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownLoadingStateStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.dropdownloadingstate.Default
import com.sdds.plasma.homeds.styles.dropdownloadingstate.DropdownLoadingState

internal object PlasmaHomedsDropdownLoadingStateVariationsCompose : ComposeStyleProvider<DropdownLoadingStateStyle>() {

    override val variations: Map<String, ComposeStyleReference<DropdownLoadingStateStyle>> =
        mapOf(
            "DropdownLoadingState.Default" to ComposeStyleReference { DropdownLoadingState.Default.style() },
        )
}
