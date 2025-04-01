package com.sdds.playground.sandbox.plasma.sd.service.integration.button.basic

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.basicbutton.Accent
import com.sdds.plasma.sd.service.styles.basicbutton.BasicButton
import com.sdds.plasma.sd.service.styles.basicbutton.Black
import com.sdds.plasma.sd.service.styles.basicbutton.Clear
import com.sdds.plasma.sd.service.styles.basicbutton.Dark
import com.sdds.plasma.sd.service.styles.basicbutton.Default
import com.sdds.plasma.sd.service.styles.basicbutton.L
import com.sdds.plasma.sd.service.styles.basicbutton.M
import com.sdds.plasma.sd.service.styles.basicbutton.Negative
import com.sdds.plasma.sd.service.styles.basicbutton.Positive
import com.sdds.plasma.sd.service.styles.basicbutton.S
import com.sdds.plasma.sd.service.styles.basicbutton.Secondary
import com.sdds.plasma.sd.service.styles.basicbutton.Warning
import com.sdds.plasma.sd.service.styles.basicbutton.White
import com.sdds.plasma.sd.service.styles.basicbutton.Xl
import com.sdds.plasma.sd.service.styles.basicbutton.Xs
import com.sdds.plasma.sd.service.styles.basicbutton.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "XLDefault" to { BasicButton.Xl.Default.style() },
            "LDefault" to { BasicButton.L.Default.style() },
            "MDefault" to { BasicButton.M.Default.style() },
            "SDefault" to { BasicButton.S.Default.style() },
            "XSDefault" to { BasicButton.Xs.Default.style() },
            "XXSDefault" to { BasicButton.Xxs.Default.style() },

            "XLSecondary" to { BasicButton.Xl.Secondary.style() },
            "LSecondary" to { BasicButton.L.Secondary.style() },
            "MSecondary" to { BasicButton.M.Secondary.style() },
            "SSecondary" to { BasicButton.S.Secondary.style() },
            "XSSecondary" to { BasicButton.Xs.Secondary.style() },
            "XXSSecondary" to { BasicButton.Xxs.Secondary.style() },

            "XLAccent" to { BasicButton.Xl.Accent.style() },
            "LAccent" to { BasicButton.L.Accent.style() },
            "MAccent" to { BasicButton.M.Accent.style() },
            "SAccent" to { BasicButton.S.Accent.style() },
            "XSAccent" to { BasicButton.Xs.Accent.style() },
            "XXSAccent" to { BasicButton.Xxs.Accent.style() },

            "XLPositive" to { BasicButton.Xl.Positive.style() },
            "LPositive" to { BasicButton.L.Positive.style() },
            "MPositive" to { BasicButton.M.Positive.style() },
            "SPositive" to { BasicButton.S.Positive.style() },
            "XSPositive" to { BasicButton.Xs.Positive.style() },
            "XXSPositive" to { BasicButton.Xxs.Positive.style() },

            "XLNegative" to { BasicButton.Xl.Negative.style() },
            "LNegative" to { BasicButton.L.Negative.style() },
            "MNegative" to { BasicButton.M.Negative.style() },
            "SNegative" to { BasicButton.S.Negative.style() },
            "XSNegative" to { BasicButton.Xs.Negative.style() },
            "XXSNegative" to { BasicButton.Xxs.Negative.style() },

            "XLWarning" to { BasicButton.Xl.Warning.style() },
            "LWarning" to { BasicButton.L.Warning.style() },
            "MWarning" to { BasicButton.M.Warning.style() },
            "SWarning" to { BasicButton.S.Warning.style() },
            "XSWarning" to { BasicButton.Xs.Warning.style() },
            "XXSWarning" to { BasicButton.Xxs.Warning.style() },

            "XLClear" to { BasicButton.Xl.Clear.style() },
            "LClear" to { BasicButton.L.Clear.style() },
            "MClear" to { BasicButton.M.Clear.style() },
            "SClear" to { BasicButton.S.Clear.style() },
            "XSClear" to { BasicButton.Xs.Clear.style() },
            "XXSClear" to { BasicButton.Xxs.Clear.style() },

            "XLDark" to { BasicButton.Xl.Dark.style() },
            "LDark" to { BasicButton.L.Dark.style() },
            "MDark" to { BasicButton.M.Dark.style() },
            "SDark" to { BasicButton.S.Dark.style() },
            "XSDark" to { BasicButton.Xs.Dark.style() },
            "XXSDark" to { BasicButton.Xxs.Dark.style() },

            "XLBlack" to { BasicButton.Xl.Black.style() },
            "LBlack" to { BasicButton.L.Black.style() },
            "MBlack" to { BasicButton.M.Black.style() },
            "SBlack" to { BasicButton.S.Black.style() },
            "XSBlack" to { BasicButton.Xs.Black.style() },
            "XXSBlack" to { BasicButton.Xxs.Black.style() },

            "XLWhite" to { BasicButton.Xl.White.style() },
            "LWhite" to { BasicButton.L.White.style() },
            "MWhite" to { BasicButton.M.White.style() },
            "SWhite" to { BasicButton.S.White.style() },
            "XSWhite" to { BasicButton.Xs.White.style() },
            "XXSWhite" to { BasicButton.Xxs.White.style() },
        )
}
