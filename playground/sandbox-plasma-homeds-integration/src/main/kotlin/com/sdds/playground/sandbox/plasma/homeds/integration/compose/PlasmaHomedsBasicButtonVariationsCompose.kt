package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
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
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "M.Default" to { BasicButton.M.Default.style() },
            "M.Secondary" to { BasicButton.M.Secondary.style() },
            "M.Dark" to { BasicButton.M.Dark.style() },
            "M.Negative" to { BasicButton.M.Negative.style() },
            "M.Warning" to { BasicButton.M.Warning.style() },
            "M.Accent" to { BasicButton.M.Accent.style() },
            "M.Clear" to { BasicButton.M.Clear.style() },
            "S.Default" to { BasicButton.S.Default.style() },
            "S.Secondary" to { BasicButton.S.Secondary.style() },
            "S.Dark" to { BasicButton.S.Dark.style() },
            "S.Negative" to { BasicButton.S.Negative.style() },
            "S.Warning" to { BasicButton.S.Warning.style() },
            "S.Accent" to { BasicButton.S.Accent.style() },
            "S.Clear" to { BasicButton.S.Clear.style() },
            "Xs.Default" to { BasicButton.Xs.Default.style() },
            "Xs.Secondary" to { BasicButton.Xs.Secondary.style() },
            "Xs.Dark" to { BasicButton.Xs.Dark.style() },
            "Xs.Negative" to { BasicButton.Xs.Negative.style() },
            "Xs.Warning" to { BasicButton.Xs.Warning.style() },
            "Xs.Accent" to { BasicButton.Xs.Accent.style() },
            "Xs.Clear" to { BasicButton.Xs.Clear.style() },
        )
}
