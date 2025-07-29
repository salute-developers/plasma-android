package com.sdds.playground.sandbox.plasma.homeds.integration.button.basic

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Clear
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.basicbutton.Negative
import com.sdds.plasma.homeds.styles.basicbutton.S
import com.sdds.plasma.homeds.styles.basicbutton.Secondary
import com.sdds.plasma.homeds.styles.basicbutton.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsBasicButtonVariationsCompose :
    ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "MDefault" to { BasicButton.M.Default.style() },
            "SDefault" to { BasicButton.S.Default.style() },

            "MSecondary" to { BasicButton.M.Secondary.style() },
            "SSecondary" to { BasicButton.S.Secondary.style() },

            "MNegative" to { BasicButton.M.Negative.style() },
            "SNegative" to { BasicButton.S.Negative.style() },

            "MWarning" to { BasicButton.M.Warning.style() },
            "SWarning" to { BasicButton.S.Warning.style() },

            "MClear" to { BasicButton.M.Clear.style() },
            "SClear" to { BasicButton.S.Clear.style() },
        )
}
