package com.sdds.playground.sandbox.sdds.serv.integration.button.link

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.linkbutton.Accent
import com.sdds.serv.styles.linkbutton.Default
import com.sdds.serv.styles.linkbutton.L
import com.sdds.serv.styles.linkbutton.LinkButton
import com.sdds.serv.styles.linkbutton.M
import com.sdds.serv.styles.linkbutton.Negative
import com.sdds.serv.styles.linkbutton.Positive
import com.sdds.serv.styles.linkbutton.S
import com.sdds.serv.styles.linkbutton.Secondary
import com.sdds.serv.styles.linkbutton.Warning
import com.sdds.serv.styles.linkbutton.Xl
import com.sdds.serv.styles.linkbutton.Xs
import com.sdds.serv.styles.linkbutton.Xxs

internal object SddsServLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "XLDefault" to { LinkButton.Xl.Default.style() },
            "LDefault" to { LinkButton.L.Default.style() },
            "MDefault" to { LinkButton.M.Default.style() },
            "SDefault" to { LinkButton.S.Default.style() },
            "XSDefault" to { LinkButton.Xs.Default.style() },
            "XXSDefault" to { LinkButton.Xxs.Default.style() },

            "XLSecondary" to { LinkButton.Xl.Secondary.style() },
            "LSecondary" to { LinkButton.L.Secondary.style() },
            "MSecondary" to { LinkButton.M.Secondary.style() },
            "SSecondary" to { LinkButton.S.Secondary.style() },
            "XSSecondary" to { LinkButton.Xs.Secondary.style() },
            "XXSSecondary" to { LinkButton.Xxs.Secondary.style() },

            "XLAccent" to { LinkButton.Xl.Accent.style() },
            "LAccent" to { LinkButton.L.Accent.style() },
            "MAccent" to { LinkButton.M.Accent.style() },
            "SAccent" to { LinkButton.S.Accent.style() },
            "XSAccent" to { LinkButton.Xs.Accent.style() },
            "XXSAccent" to { LinkButton.Xxs.Accent.style() },

            "XLPositive" to { LinkButton.Xl.Positive.style() },
            "LPositive" to { LinkButton.L.Positive.style() },
            "MPositive" to { LinkButton.M.Positive.style() },
            "SPositive" to { LinkButton.S.Positive.style() },
            "XSPositive" to { LinkButton.Xs.Positive.style() },
            "XXSPositive" to { LinkButton.Xxs.Positive.style() },

            "XLNegative" to { LinkButton.Xl.Negative.style() },
            "LNegative" to { LinkButton.L.Negative.style() },
            "MNegative" to { LinkButton.M.Negative.style() },
            "SNegative" to { LinkButton.S.Negative.style() },
            "XSNegative" to { LinkButton.Xs.Negative.style() },
            "XXSNegative" to { LinkButton.Xxs.Negative.style() },

            "XLWarning" to { LinkButton.Xl.Warning.style() },
            "LWarning" to { LinkButton.L.Warning.style() },
            "MWarning" to { LinkButton.M.Warning.style() },
            "SWarning" to { LinkButton.S.Warning.style() },
            "XSWarning" to { LinkButton.Xs.Warning.style() },
            "XXSWarning" to { LinkButton.Xxs.Warning.style() },
        )
}
