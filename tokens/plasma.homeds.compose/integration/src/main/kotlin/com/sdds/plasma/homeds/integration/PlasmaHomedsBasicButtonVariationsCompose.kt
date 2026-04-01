// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.basicbutton.Accent
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Clear
import com.sdds.plasma.homeds.styles.basicbutton.Dark
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.basicbutton.Negative
import com.sdds.plasma.homeds.styles.basicbutton.S
import com.sdds.plasma.homeds.styles.basicbutton.Secondary
import com.sdds.plasma.homeds.styles.basicbutton.Warning
import com.sdds.plasma.homeds.styles.basicbutton.Xs

internal object PlasmaHomedsBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { BasicButton.M.Default.style() },
            "M.Secondary" to ComposeStyleReference { BasicButton.M.Secondary.style() },
            "M.Dark" to ComposeStyleReference { BasicButton.M.Dark.style() },
            "M.Negative" to ComposeStyleReference { BasicButton.M.Negative.style() },
            "M.Warning" to ComposeStyleReference { BasicButton.M.Warning.style() },
            "M.Accent" to ComposeStyleReference { BasicButton.M.Accent.style() },
            "M.Clear" to ComposeStyleReference { BasicButton.M.Clear.style() },
            "S.Default" to ComposeStyleReference { BasicButton.S.Default.style() },
            "S.Secondary" to ComposeStyleReference { BasicButton.S.Secondary.style() },
            "S.Dark" to ComposeStyleReference { BasicButton.S.Dark.style() },
            "S.Negative" to ComposeStyleReference { BasicButton.S.Negative.style() },
            "S.Warning" to ComposeStyleReference { BasicButton.S.Warning.style() },
            "S.Accent" to ComposeStyleReference { BasicButton.S.Accent.style() },
            "S.Clear" to ComposeStyleReference { BasicButton.S.Clear.style() },
            "Xs.Default" to ComposeStyleReference { BasicButton.Xs.Default.style() },
            "Xs.Secondary" to ComposeStyleReference { BasicButton.Xs.Secondary.style() },
            "Xs.Dark" to ComposeStyleReference { BasicButton.Xs.Dark.style() },
            "Xs.Negative" to ComposeStyleReference { BasicButton.Xs.Negative.style() },
            "Xs.Warning" to ComposeStyleReference { BasicButton.Xs.Warning.style() },
            "Xs.Accent" to ComposeStyleReference { BasicButton.Xs.Accent.style() },
            "Xs.Clear" to ComposeStyleReference { BasicButton.Xs.Clear.style() },
        )
}
