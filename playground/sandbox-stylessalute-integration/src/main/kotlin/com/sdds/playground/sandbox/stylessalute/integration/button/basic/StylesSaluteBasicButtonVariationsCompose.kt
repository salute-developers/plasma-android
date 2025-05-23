package com.sdds.playground.sandbox.stylessalute.integration.button.basic

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.basicbutton.Accent
import com.sdds.stylessalute.styles.basicbutton.BasicButton
import com.sdds.stylessalute.styles.basicbutton.Black
import com.sdds.stylessalute.styles.basicbutton.Clear
import com.sdds.stylessalute.styles.basicbutton.Dark
import com.sdds.stylessalute.styles.basicbutton.Default
import com.sdds.stylessalute.styles.basicbutton.L
import com.sdds.stylessalute.styles.basicbutton.M
import com.sdds.stylessalute.styles.basicbutton.Negative
import com.sdds.stylessalute.styles.basicbutton.Positive
import com.sdds.stylessalute.styles.basicbutton.S
import com.sdds.stylessalute.styles.basicbutton.Secondary
import com.sdds.stylessalute.styles.basicbutton.Warning
import com.sdds.stylessalute.styles.basicbutton.White
import com.sdds.stylessalute.styles.basicbutton.Xs

internal object StylesSaluteBasicButtonVariationsCompose :
    ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> = mapOf(
        "LDefault" to { BasicButton.L.Default.style() },
        "MDefault" to { BasicButton.M.Default.style() },
        "SDefault" to { BasicButton.S.Default.style() },
        "XSDefault" to { BasicButton.Xs.Default.style() },

        "LSecondary" to { BasicButton.L.Secondary.style() },
        "MSecondary" to { BasicButton.M.Secondary.style() },
        "SSecondary" to { BasicButton.S.Secondary.style() },
        "XSSecondary" to { BasicButton.Xs.Secondary.style() },

        "LAccent" to { BasicButton.L.Accent.style() },
        "MAccent" to { BasicButton.M.Accent.style() },
        "SAccent" to { BasicButton.S.Accent.style() },
        "XSAccent" to { BasicButton.Xs.Accent.style() },

        "LPositive" to { BasicButton.L.Positive.style() },
        "MPositive" to { BasicButton.M.Positive.style() },
        "SPositive" to { BasicButton.S.Positive.style() },
        "XSPositive" to { BasicButton.Xs.Positive.style() },

        "LNegative" to { BasicButton.L.Negative.style() },
        "MNegative" to { BasicButton.M.Negative.style() },
        "SNegative" to { BasicButton.S.Negative.style() },
        "XSNegative" to { BasicButton.Xs.Negative.style() },

        "LWarning" to { BasicButton.L.Warning.style() },
        "MWarning" to { BasicButton.M.Warning.style() },
        "SWarning" to { BasicButton.S.Warning.style() },
        "XSWarning" to { BasicButton.Xs.Warning.style() },

        "LClear" to { BasicButton.L.Clear.style() },
        "MClear" to { BasicButton.M.Clear.style() },
        "SClear" to { BasicButton.S.Clear.style() },
        "XSClear" to { BasicButton.Xs.Clear.style() },

        "LDark" to { BasicButton.L.Dark.style() },
        "MDark" to { BasicButton.M.Dark.style() },
        "SDark" to { BasicButton.S.Dark.style() },
        "XSDark" to { BasicButton.Xs.Dark.style() },

        "LBlack" to { BasicButton.L.Black.style() },
        "MBlack" to { BasicButton.M.Black.style() },
        "SBlack" to { BasicButton.S.Black.style() },
        "XSBlack" to { BasicButton.Xs.Black.style() },

        "LWhite" to { BasicButton.L.White.style() },
        "MWhite" to { BasicButton.M.White.style() },
        "SWhite" to { BasicButton.S.White.style() },
        "XSWhite" to { BasicButton.Xs.White.style() },
    )
}
