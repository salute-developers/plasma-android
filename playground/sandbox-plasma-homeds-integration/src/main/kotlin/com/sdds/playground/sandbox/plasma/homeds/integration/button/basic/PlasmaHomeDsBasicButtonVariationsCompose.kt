package com.sdds.playground.sandbox.plasma.homeds.integration.button.basic

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

internal object PlasmaHomeDsBasicButtonVariationsCompose :
    ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "MDefault" to { BasicButton.M.Default.style() },
            "SDefault" to { BasicButton.S.Default.style() },
            "XsDefault" to { BasicButton.Xs.Default.style() },

            "MSecondary" to { BasicButton.M.Secondary.style() },
            "SSecondary" to { BasicButton.S.Secondary.style() },
            "XsSecondary" to { BasicButton.Xs.Secondary.style() },

            "MDark" to { BasicButton.M.Dark.style() },
            "SDark" to { BasicButton.S.Dark.style() },
            "XsDark" to { BasicButton.Xs.Dark.style() },

            "MAccent" to { BasicButton.M.Accent.style() },
            "SAccent" to { BasicButton.S.Accent.style() },
            "XsAccent" to { BasicButton.Xs.Accent.style() },

            "MNegative" to { BasicButton.M.Negative.style() },
            "SNegative" to { BasicButton.S.Negative.style() },
            "XsNegative" to { BasicButton.Xs.Negative.style() },

            "MWarning" to { BasicButton.M.Warning.style() },
            "SWarning" to { BasicButton.S.Warning.style() },
            "XsWarning" to { BasicButton.Xs.Warning.style() },

            "MClear" to { BasicButton.M.Clear.style() },
            "SClear" to { BasicButton.S.Clear.style() },
            "XsClear" to { BasicButton.Xs.Clear.style() },
        )
}
