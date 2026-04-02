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
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.Clear
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.basicbutton.Xs

internal object PlasmaStardsBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { BasicButton.L.Default.style() },
            "L.Clear" to ComposeStyleReference { BasicButton.L.Clear.style() },
            "M.Default" to ComposeStyleReference { BasicButton.M.Default.style() },
            "M.Clear" to ComposeStyleReference { BasicButton.M.Clear.style() },
            "S.Default" to ComposeStyleReference { BasicButton.S.Default.style() },
            "S.Clear" to ComposeStyleReference { BasicButton.S.Clear.style() },
            "Xs.Default" to ComposeStyleReference { BasicButton.Xs.Default.style() },
            "Xs.Clear" to ComposeStyleReference { BasicButton.Xs.Clear.style() },
        )
}
