package com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.button.icon.Accent
import com.sdds.plasma.sd.service.styles.button.icon.Black
import com.sdds.plasma.sd.service.styles.button.icon.Clear
import com.sdds.plasma.sd.service.styles.button.icon.Dark
import com.sdds.plasma.sd.service.styles.button.icon.Default
import com.sdds.plasma.sd.service.styles.button.icon.IconButton
import com.sdds.plasma.sd.service.styles.button.icon.L
import com.sdds.plasma.sd.service.styles.button.icon.M
import com.sdds.plasma.sd.service.styles.button.icon.Negative
import com.sdds.plasma.sd.service.styles.button.icon.Pilled
import com.sdds.plasma.sd.service.styles.button.icon.Positive
import com.sdds.plasma.sd.service.styles.button.icon.S
import com.sdds.plasma.sd.service.styles.button.icon.Secondary
import com.sdds.plasma.sd.service.styles.button.icon.Warning
import com.sdds.plasma.sd.service.styles.button.icon.White
import com.sdds.plasma.sd.service.styles.button.icon.Xl
import com.sdds.plasma.sd.service.styles.button.icon.Xs
import com.sdds.plasma.sd.service.styles.button.icon.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "XLDefault" to { IconButton.Xl.Default.style() },
            "XLPilledDefault" to { IconButton.Xl.Pilled.Default.style() },
            "LDefault" to { IconButton.L.Default.style() },
            "LPilledDefault" to { IconButton.L.Pilled.Default.style() },
            "MDefault" to { IconButton.M.Default.style() },
            "MPilledDefault" to { IconButton.M.Pilled.Default.style() },
            "SDefault" to { IconButton.S.Default.style() },
            "SPilledDefault" to { IconButton.S.Pilled.Default.style() },
            "XSDefault" to { IconButton.Xs.Default.style() },
            "XSPilledDefault" to { IconButton.Xs.Pilled.Default.style() },
            "XXSDefault" to { IconButton.Xxs.Default.style() },
            "XXSPilledDefault" to { IconButton.Xxs.Pilled.Default.style() },

            "XLSecondary" to { IconButton.Xl.Secondary.style() },
            "XLPilledSecondary" to { IconButton.Xl.Pilled.Secondary.style() },
            "LSecondary" to { IconButton.L.Secondary.style() },
            "LPilledSecondary" to { IconButton.L.Pilled.Secondary.style() },
            "MSecondary" to { IconButton.M.Secondary.style() },
            "MPilledSecondary" to { IconButton.M.Pilled.Secondary.style() },
            "SSecondary" to { IconButton.S.Secondary.style() },
            "SPilledSecondary" to { IconButton.S.Pilled.Secondary.style() },
            "XSSecondary" to { IconButton.Xs.Secondary.style() },
            "XSPilledSecondary" to { IconButton.Xs.Pilled.Secondary.style() },
            "XXSSecondary" to { IconButton.Xxs.Secondary.style() },
            "XXSPilledSecondary" to { IconButton.Xxs.Pilled.Secondary.style() },

            "XLAccent" to { IconButton.Xl.Accent.style() },
            "XLPilledAccent" to { IconButton.Xl.Pilled.Accent.style() },
            "LAccent" to { IconButton.L.Accent.style() },
            "LPilledAccent" to { IconButton.L.Pilled.Accent.style() },
            "MAccent" to { IconButton.M.Accent.style() },
            "MPilledAccent" to { IconButton.M.Pilled.Accent.style() },
            "SAccent" to { IconButton.S.Accent.style() },
            "SPilledAccent" to { IconButton.S.Pilled.Accent.style() },
            "XSAccent" to { IconButton.Xs.Accent.style() },
            "XSPilledSAccent" to { IconButton.Xs.Pilled.Accent.style() },
            "XXSAccent" to { IconButton.Xxs.Accent.style() },
            "XXSPilledSAccent" to { IconButton.Xxs.Pilled.Accent.style() },

            "XLPositive" to { IconButton.Xl.Positive.style() },
            "XLPilledPositive" to { IconButton.Xl.Pilled.Positive.style() },
            "LPositive" to { IconButton.L.Positive.style() },
            "LPilledPositive" to { IconButton.L.Pilled.Positive.style() },
            "MPositive" to { IconButton.M.Positive.style() },
            "MPilledPositive" to { IconButton.M.Pilled.Positive.style() },
            "SPositive" to { IconButton.S.Positive.style() },
            "SPilledPositive" to { IconButton.S.Pilled.Positive.style() },
            "XSPositive" to { IconButton.Xs.Positive.style() },
            "XSPilledPositive" to { IconButton.Xs.Pilled.Positive.style() },
            "XXSPositive" to { IconButton.Xxs.Positive.style() },
            "XXSPilledPositive" to { IconButton.Xxs.Pilled.Positive.style() },

            "XLNegative" to { IconButton.Xl.Negative.style() },
            "XLPilledNegative" to { IconButton.Xl.Pilled.Negative.style() },
            "LNegative" to { IconButton.L.Negative.style() },
            "LPilledNegative" to { IconButton.L.Pilled.Negative.style() },
            "MNegative" to { IconButton.M.Negative.style() },
            "MPilledNegative" to { IconButton.M.Pilled.Negative.style() },
            "SNegative" to { IconButton.S.Negative.style() },
            "SPilledNegative" to { IconButton.S.Pilled.Negative.style() },
            "XSNegative" to { IconButton.Xs.Negative.style() },
            "XSPilledNegative" to { IconButton.Xs.Pilled.Negative.style() },
            "XXSNegative" to { IconButton.Xxs.Negative.style() },
            "XXSPilledNegative" to { IconButton.Xxs.Pilled.Negative.style() },

            "XLWarning" to { IconButton.Xl.Warning.style() },
            "XLPilledWarning" to { IconButton.Xl.Pilled.Warning.style() },
            "LWarning" to { IconButton.L.Warning.style() },
            "LPilledWarning" to { IconButton.L.Pilled.Warning.style() },
            "MWarning" to { IconButton.M.Warning.style() },
            "MPilledWarning" to { IconButton.M.Pilled.Warning.style() },
            "SWarning" to { IconButton.S.Warning.style() },
            "SPilledWarning" to { IconButton.S.Pilled.Warning.style() },
            "XSWarning" to { IconButton.Xs.Warning.style() },
            "XSPilledWarning" to { IconButton.Xs.Pilled.Warning.style() },
            "XXSWarning" to { IconButton.Xxs.Warning.style() },
            "XXSPilledWarning" to { IconButton.Xxs.Pilled.Warning.style() },

            "XLClear" to { IconButton.Xl.Clear.style() },
            "XLPilledClear" to { IconButton.Xl.Pilled.Clear.style() },
            "LClear" to { IconButton.L.Clear.style() },
            "LPilledClear" to { IconButton.L.Pilled.Clear.style() },
            "MClear" to { IconButton.M.Clear.style() },
            "MPilledClear" to { IconButton.M.Pilled.Clear.style() },
            "SClear" to { IconButton.S.Clear.style() },
            "SPilledClear" to { IconButton.S.Pilled.Clear.style() },
            "XSClear" to { IconButton.Xs.Clear.style() },
            "XSPilledClear" to { IconButton.Xs.Pilled.Clear.style() },
            "XXSClear" to { IconButton.Xxs.Clear.style() },
            "XXSPilledClear" to { IconButton.Xxs.Pilled.Clear.style() },

            "XLDark" to { IconButton.Xl.Dark.style() },
            "XLPilledDark" to { IconButton.Xl.Pilled.Dark.style() },
            "LDark" to { IconButton.L.Dark.style() },
            "LPilledDark" to { IconButton.L.Pilled.Dark.style() },
            "MDark" to { IconButton.M.Dark.style() },
            "MPilledDark" to { IconButton.M.Pilled.Dark.style() },
            "SDark" to { IconButton.S.Dark.style() },
            "SPilledDark" to { IconButton.S.Pilled.Dark.style() },
            "XSDark" to { IconButton.Xs.Dark.style() },
            "XSPilledDark" to { IconButton.Xs.Pilled.Dark.style() },
            "XXSDark" to { IconButton.Xxs.Dark.style() },
            "XXSPilledDark" to { IconButton.Xxs.Pilled.Dark.style() },

            "XLBlack" to { IconButton.Xl.Black.style() },
            "XLPilledBlack" to { IconButton.Xl.Pilled.Black.style() },
            "LBlack" to { IconButton.L.Black.style() },
            "LPilledBlack" to { IconButton.L.Pilled.Black.style() },
            "MBlack" to { IconButton.M.Black.style() },
            "MPilledBlack" to { IconButton.M.Pilled.Black.style() },
            "SBlack" to { IconButton.S.Black.style() },
            "SPilledBlack" to { IconButton.S.Pilled.Black.style() },
            "XSBlack" to { IconButton.Xs.Black.style() },
            "XSPilledBlack" to { IconButton.Xs.Pilled.Black.style() },
            "XXSBlack" to { IconButton.Xxs.Black.style() },
            "XXSPilledBlack" to { IconButton.Xxs.Pilled.Black.style() },

            "XLWhite" to { IconButton.Xl.White.style() },
            "XLPilledWhite" to { IconButton.Xl.Pilled.White.style() },
            "LWhite" to { IconButton.L.White.style() },
            "LPilledWhite" to { IconButton.L.Pilled.White.style() },
            "MWhite" to { IconButton.M.White.style() },
            "MPilledWhite" to { IconButton.M.Pilled.White.style() },
            "SWhite" to { IconButton.S.White.style() },
            "SPilledWhite" to { IconButton.S.Pilled.White.style() },
            "XSWhite" to { IconButton.Xs.White.style() },
            "XSPilledWhite" to { IconButton.Xs.Pilled.White.style() },
            "XXSWhite" to { IconButton.Xxs.White.style() },
            "XXSPilledWhite" to { IconButton.Xxs.Pilled.White.style() },
        )
}
