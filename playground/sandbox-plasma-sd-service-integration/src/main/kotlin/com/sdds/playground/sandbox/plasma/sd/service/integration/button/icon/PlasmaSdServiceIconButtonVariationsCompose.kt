package com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.plasma.sd.service.styles.button.icon.Accent
import com.sdds.plasma.sd.service.styles.button.icon.Default
import com.sdds.plasma.sd.service.styles.button.icon.L
import com.sdds.plasma.sd.service.styles.button.icon.M
import com.sdds.plasma.sd.service.styles.button.icon.Negative
import com.sdds.plasma.sd.service.styles.button.icon.Pilled
import com.sdds.plasma.sd.service.styles.button.icon.Positive
import com.sdds.plasma.sd.service.styles.button.icon.S
import com.sdds.plasma.sd.service.styles.button.icon.Secondary
import com.sdds.plasma.sd.service.styles.button.icon.Warning
import com.sdds.plasma.sd.service.styles.button.icon.Xs

internal object PlasmaSdServiceIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle>
        get() = mapOf(
            "LDefault" to { IconButton.L.Default.style() },
            "LPilledDefault" to { IconButton.L.Pilled.Default.style() },
            "MDefault" to { IconButton.M.Default.style() },
            "MPilledDefault" to { IconButton.M.Pilled.Default.style() },
            "SDefault" to { IconButton.S.Default.style() },
            "SPilledDefault" to { IconButton.S.Pilled.Default.style() },
            "XSDefault" to { IconButton.Xs.Default.style() },
            "XSPilledDefault" to { IconButton.Xs.Pilled.Default.style() },

            "LSecondary" to { IconButton.L.Secondary.style() },
            "LPilledSecondary" to { IconButton.L.Pilled.Secondary.style() },
            "MSecondary" to { IconButton.M.Secondary.style() },
            "MPilledSecondary" to { IconButton.M.Pilled.Secondary.style() },
            "SSecondary" to { IconButton.S.Secondary.style() },
            "SPilledSecondary" to { IconButton.S.Pilled.Secondary.style() },
            "XSSecondary" to { IconButton.Xs.Secondary.style() },
            "XSPilledSecondary" to { IconButton.Xs.Pilled.Secondary.style() },

            "LAccent" to { IconButton.L.Accent.style() },
            "LPilledAccent" to { IconButton.L.Pilled.Accent.style() },
            "MAccent" to { IconButton.M.Accent.style() },
            "MPilledAccent" to { IconButton.M.Pilled.Accent.style() },
            "SAccent" to { IconButton.S.Accent.style() },
            "SPilledAccent" to { IconButton.S.Pilled.Accent.style() },
            "XSAccent" to { IconButton.Xs.Accent.style() },
            "XPilledSAccent" to { IconButton.Xs.Pilled.Accent.style() },

            "LPositive" to { IconButton.L.Positive.style() },
            "LPilledPositive" to { IconButton.L.Pilled.Positive.style() },
            "MPositive" to { IconButton.M.Positive.style() },
            "MPilledPositive" to { IconButton.M.Pilled.Positive.style() },
            "SPositive" to { IconButton.S.Positive.style() },
            "SPilledPositive" to { IconButton.S.Pilled.Positive.style() },
            "XSPositive" to { IconButton.Xs.Positive.style() },
            "XSPilledPositive" to { IconButton.Xs.Pilled.Positive.style() },

            "LNegative" to { IconButton.L.Negative.style() },
            "LPilledNegative" to { IconButton.L.Pilled.Negative.style() },
            "MNegative" to { IconButton.M.Negative.style() },
            "MPilledNegative" to { IconButton.M.Pilled.Negative.style() },
            "SNegative" to { IconButton.S.Negative.style() },
            "SPilledNegative" to { IconButton.S.Pilled.Negative.style() },
            "XSNegative" to { IconButton.Xs.Negative.style() },
            "XSPilledNegative" to { IconButton.Xs.Pilled.Negative.style() },

            "LWarning" to { IconButton.L.Warning.style() },
            "LPilledWarning" to { IconButton.L.Pilled.Warning.style() },
            "MWarning" to { IconButton.M.Warning.style() },
            "MPilledWarning" to { IconButton.M.Pilled.Warning.style() },
            "SWarning" to { IconButton.S.Warning.style() },
            "SPilledWarning" to { IconButton.S.Pilled.Warning.style() },
            "XSWarning" to { IconButton.Xs.Warning.style() },
            "XSPilledWarning" to { IconButton.Xs.Pilled.Warning.style() },
        )
}