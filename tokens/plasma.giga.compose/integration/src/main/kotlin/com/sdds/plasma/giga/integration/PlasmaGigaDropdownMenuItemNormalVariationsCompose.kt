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
import com.sdds.plasma.giga.styles.listitem.DropdownMenuItemNormal
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.Negative
import com.sdds.plasma.giga.styles.listitem.Positive
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs

internal object PlasmaGigaDropdownMenuItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "Xl.Default" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Default.style() },
            "Xl.Positive" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Positive.style() },
            "Xl.Negative" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Negative.style() },
            "L.Default" to ComposeStyleReference { DropdownMenuItemNormal.L.Default.style() },
            "L.Positive" to ComposeStyleReference { DropdownMenuItemNormal.L.Positive.style() },
            "L.Negative" to ComposeStyleReference { DropdownMenuItemNormal.L.Negative.style() },
            "M.Default" to ComposeStyleReference { DropdownMenuItemNormal.M.Default.style() },
            "M.Positive" to ComposeStyleReference { DropdownMenuItemNormal.M.Positive.style() },
            "M.Negative" to ComposeStyleReference { DropdownMenuItemNormal.M.Negative.style() },
            "S.Default" to ComposeStyleReference { DropdownMenuItemNormal.S.Default.style() },
            "S.Positive" to ComposeStyleReference { DropdownMenuItemNormal.S.Positive.style() },
            "S.Negative" to ComposeStyleReference { DropdownMenuItemNormal.S.Negative.style() },
            "Xs.Default" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Default.style() },
            "Xs.Positive" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Positive.style() },
            "Xs.Negative" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Negative.style() },
        )
}
