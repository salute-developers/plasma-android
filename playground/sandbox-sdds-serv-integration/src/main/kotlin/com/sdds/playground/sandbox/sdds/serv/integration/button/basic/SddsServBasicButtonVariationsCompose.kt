package com.sdds.playground.sandbox.sdds.serv.integration.button.basic

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.button.basic.Accent
import com.sdds.serv.styles.button.basic.Black
import com.sdds.serv.styles.button.basic.Clear
import com.sdds.serv.styles.button.basic.Dark
import com.sdds.serv.styles.button.basic.Default
import com.sdds.serv.styles.button.basic.L
import com.sdds.serv.styles.button.basic.M
import com.sdds.serv.styles.button.basic.Negative
import com.sdds.serv.styles.button.basic.Positive
import com.sdds.serv.styles.button.basic.S
import com.sdds.serv.styles.button.basic.Secondary
import com.sdds.serv.styles.button.basic.Warning
import com.sdds.serv.styles.button.basic.White
import com.sdds.serv.styles.button.basic.Xs

internal object SddsServBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle>
        get() = mapOf(
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