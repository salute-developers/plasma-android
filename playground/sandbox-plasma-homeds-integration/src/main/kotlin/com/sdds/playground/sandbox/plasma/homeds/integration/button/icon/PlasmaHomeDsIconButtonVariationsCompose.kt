package com.sdds.playground.sandbox.plasma.homeds.integration.button.icon

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

internal object PlasmaHomeDsIconButtonVariationsCompose :
    ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "LDefault" to { IconButton.L.Default.style() },
            "MDefault" to { IconButton.M.Default.style() },
            "SDefault" to { IconButton.S.Default.style() },
            "XsDefault" to { IconButton.Xs.Default.style() },

            "LSecondary" to { IconButton.L.Secondary.style() },
            "MSecondary" to { IconButton.M.Secondary.style() },
            "SSecondary" to { IconButton.S.Secondary.style() },
            "XsSecondary" to { IconButton.Xs.Secondary.style() },

            "LDark" to { IconButton.L.Dark.style() },
            "MDark" to { IconButton.M.Dark.style() },
            "SDark" to { IconButton.S.Dark.style() },
            "XsDark" to { IconButton.Xs.Dark.style() },

            "LNegative" to { IconButton.L.Negative.style() },
            "MNegative" to { IconButton.M.Negative.style() },
            "SNegative" to { IconButton.S.Negative.style() },
            "XsNegative" to { IconButton.Xs.Negative.style() },

            "LAccent" to { IconButton.L.Accent.style() },
            "MAccent" to { IconButton.M.Accent.style() },
            "SAccent" to { IconButton.S.Accent.style() },
            "XsAccent" to { IconButton.Xs.Accent.style() },

            "LWarning" to { IconButton.L.Warning.style() },
            "MWarning" to { IconButton.M.Warning.style() },
            "SWarning" to { IconButton.S.Warning.style() },
            "XsWarning" to { IconButton.Xs.Warning.style() },

            "LClear" to { IconButton.L.Clear.style() },
            "MClear" to { IconButton.M.Clear.style() },
            "SClear" to { IconButton.S.Clear.style() },
            "XsClear" to { IconButton.Xs.Clear.style() },
        )
}
