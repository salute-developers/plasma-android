// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.iconbutton.Clear
import com.sdkit.star.designsystem.styles.iconbutton.Default
import com.sdkit.star.designsystem.styles.iconbutton.IconButton
import com.sdkit.star.designsystem.styles.iconbutton.L
import com.sdkit.star.designsystem.styles.iconbutton.M
import com.sdkit.star.designsystem.styles.iconbutton.Pilled
import com.sdkit.star.designsystem.styles.iconbutton.S
import com.sdkit.star.designsystem.styles.iconbutton.Xs

internal object PlasmaStardsIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { IconButton.L.Default.style() },
            "L.Clear" to ComposeStyleReference { IconButton.L.Clear.style() },
            "L.Pilled.Default" to ComposeStyleReference { IconButton.L.Pilled.Default.style() },
            "L.Pilled.Clear" to ComposeStyleReference { IconButton.L.Pilled.Clear.style() },
            "M.Default" to ComposeStyleReference { IconButton.M.Default.style() },
            "M.Clear" to ComposeStyleReference { IconButton.M.Clear.style() },
            "M.Pilled.Default" to ComposeStyleReference { IconButton.M.Pilled.Default.style() },
            "M.Pilled.Clear" to ComposeStyleReference { IconButton.M.Pilled.Clear.style() },
            "S.Default" to ComposeStyleReference { IconButton.S.Default.style() },
            "S.Clear" to ComposeStyleReference { IconButton.S.Clear.style() },
            "S.Pilled.Default" to ComposeStyleReference { IconButton.S.Pilled.Default.style() },
            "S.Pilled.Clear" to ComposeStyleReference { IconButton.S.Pilled.Clear.style() },
            "Xs.Default" to ComposeStyleReference { IconButton.Xs.Default.style() },
            "Xs.Clear" to ComposeStyleReference { IconButton.Xs.Clear.style() },
            "Xs.Pilled.Default" to ComposeStyleReference { IconButton.Xs.Pilled.Default.style() },
            "Xs.Pilled.Clear" to ComposeStyleReference { IconButton.Xs.Pilled.Clear.style() },
        )
}
