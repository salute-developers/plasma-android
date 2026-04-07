// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.listitem.Default
import com.sdds.plasma.giga.styles.listitem.DropdownMenuItemTight
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.Negative
import com.sdds.plasma.giga.styles.listitem.Positive
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs

internal object PlasmaGigaDropdownMenuItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "Xl.Default" to ComposeStyleReference { DropdownMenuItemTight.Xl.Default.style() },
            "Xl.Positive" to ComposeStyleReference { DropdownMenuItemTight.Xl.Positive.style() },
            "Xl.Negative" to ComposeStyleReference { DropdownMenuItemTight.Xl.Negative.style() },
            "L.Default" to ComposeStyleReference { DropdownMenuItemTight.L.Default.style() },
            "L.Positive" to ComposeStyleReference { DropdownMenuItemTight.L.Positive.style() },
            "L.Negative" to ComposeStyleReference { DropdownMenuItemTight.L.Negative.style() },
            "M.Default" to ComposeStyleReference { DropdownMenuItemTight.M.Default.style() },
            "M.Positive" to ComposeStyleReference { DropdownMenuItemTight.M.Positive.style() },
            "M.Negative" to ComposeStyleReference { DropdownMenuItemTight.M.Negative.style() },
            "S.Default" to ComposeStyleReference { DropdownMenuItemTight.S.Default.style() },
            "S.Positive" to ComposeStyleReference { DropdownMenuItemTight.S.Positive.style() },
            "S.Negative" to ComposeStyleReference { DropdownMenuItemTight.S.Negative.style() },
            "Xs.Default" to ComposeStyleReference { DropdownMenuItemTight.Xs.Default.style() },
            "Xs.Positive" to ComposeStyleReference { DropdownMenuItemTight.Xs.Positive.style() },
            "Xs.Negative" to ComposeStyleReference { DropdownMenuItemTight.Xs.Negative.style() },
        )
}
