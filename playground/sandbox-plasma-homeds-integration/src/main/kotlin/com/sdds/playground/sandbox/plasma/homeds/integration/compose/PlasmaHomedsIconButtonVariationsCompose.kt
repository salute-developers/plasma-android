package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.iconbutton.Accent
import com.sdds.plasma.homeds.styles.iconbutton.Clear
import com.sdds.plasma.homeds.styles.iconbutton.Dark
import com.sdds.plasma.homeds.styles.iconbutton.Default
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.L
import com.sdds.plasma.homeds.styles.iconbutton.M
import com.sdds.plasma.homeds.styles.iconbutton.Negative
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.plasma.homeds.styles.iconbutton.Secondary
import com.sdds.plasma.homeds.styles.iconbutton.Warning
import com.sdds.plasma.homeds.styles.iconbutton.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "L.Default" to { IconButton.L.Default.style() },
            "L.Secondary" to { IconButton.L.Secondary.style() },
            "L.Dark" to { IconButton.L.Dark.style() },
            "L.Negative" to { IconButton.L.Negative.style() },
            "L.Warning" to { IconButton.L.Warning.style() },
            "L.Accent" to { IconButton.L.Accent.style() },
            "L.Clear" to { IconButton.L.Clear.style() },
            "M.Default" to { IconButton.M.Default.style() },
            "M.Secondary" to { IconButton.M.Secondary.style() },
            "M.Dark" to { IconButton.M.Dark.style() },
            "M.Negative" to { IconButton.M.Negative.style() },
            "M.Warning" to { IconButton.M.Warning.style() },
            "M.Accent" to { IconButton.M.Accent.style() },
            "M.Clear" to { IconButton.M.Clear.style() },
            "S.Default" to { IconButton.S.Default.style() },
            "S.Secondary" to { IconButton.S.Secondary.style() },
            "S.Dark" to { IconButton.S.Dark.style() },
            "S.Negative" to { IconButton.S.Negative.style() },
            "S.Warning" to { IconButton.S.Warning.style() },
            "S.Accent" to { IconButton.S.Accent.style() },
            "S.Clear" to { IconButton.S.Clear.style() },
            "Xs.Default" to { IconButton.Xs.Default.style() },
            "Xs.Secondary" to { IconButton.Xs.Secondary.style() },
            "Xs.Dark" to { IconButton.Xs.Dark.style() },
            "Xs.Negative" to { IconButton.Xs.Negative.style() },
            "Xs.Warning" to { IconButton.Xs.Warning.style() },
            "Xs.Accent" to { IconButton.Xs.Accent.style() },
            "Xs.Clear" to { IconButton.Xs.Clear.style() },
        )
}
