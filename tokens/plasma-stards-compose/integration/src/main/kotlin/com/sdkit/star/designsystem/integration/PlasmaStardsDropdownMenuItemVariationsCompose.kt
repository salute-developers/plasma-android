// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.listitem.Default
import com.sdkit.star.designsystem.styles.listitem.DropdownMenuItem
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.Negative
import com.sdkit.star.designsystem.styles.listitem.Positive
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xl
import com.sdkit.star.designsystem.styles.listitem.Xs

internal object PlasmaStardsDropdownMenuItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "Xl.Default" to ComposeStyleReference { DropdownMenuItem.Xl.Default.style() },
            "Xl.Positive" to ComposeStyleReference { DropdownMenuItem.Xl.Positive.style() },
            "Xl.Negative" to ComposeStyleReference { DropdownMenuItem.Xl.Negative.style() },
            "L.Default" to ComposeStyleReference { DropdownMenuItem.L.Default.style() },
            "L.Positive" to ComposeStyleReference { DropdownMenuItem.L.Positive.style() },
            "L.Negative" to ComposeStyleReference { DropdownMenuItem.L.Negative.style() },
            "M.Default" to ComposeStyleReference { DropdownMenuItem.M.Default.style() },
            "M.Positive" to ComposeStyleReference { DropdownMenuItem.M.Positive.style() },
            "M.Negative" to ComposeStyleReference { DropdownMenuItem.M.Negative.style() },
            "S.Default" to ComposeStyleReference { DropdownMenuItem.S.Default.style() },
            "S.Positive" to ComposeStyleReference { DropdownMenuItem.S.Positive.style() },
            "S.Negative" to ComposeStyleReference { DropdownMenuItem.S.Negative.style() },
            "Xs.Default" to ComposeStyleReference { DropdownMenuItem.Xs.Default.style() },
            "Xs.Positive" to ComposeStyleReference { DropdownMenuItem.Xs.Positive.style() },
            "Xs.Negative" to ComposeStyleReference { DropdownMenuItem.Xs.Negative.style() },
        )
}
