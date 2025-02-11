package com.sdds.playground.sandbox.sdds.serv.integration.button.link

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.button.link.Accent
import com.sdds.serv.styles.button.link.Default
import com.sdds.serv.styles.button.link.L
import com.sdds.serv.styles.button.link.M
import com.sdds.serv.styles.button.link.Negative
import com.sdds.serv.styles.button.link.Positive
import com.sdds.serv.styles.button.link.S
import com.sdds.serv.styles.button.link.Secondary
import com.sdds.serv.styles.button.link.Warning
import com.sdds.serv.styles.button.link.Xs

internal object SddsServLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle>
        get() = mapOf(
            "LDefault" to { LinkButton.L.Default.style() },
            "MDefault" to { LinkButton.M.Default.style() },
            "SDefault" to { LinkButton.S.Default.style() },
            "XSDefault" to { LinkButton.Xs.Default.style() },

            "LSecondary" to { LinkButton.L.Secondary.style() },
            "MSecondary" to { LinkButton.M.Secondary.style() },
            "SSecondary" to { LinkButton.S.Secondary.style() },
            "XSSecondary" to { LinkButton.Xs.Secondary.style() },

            "LAccent" to { LinkButton.L.Accent.style() },
            "MAccent" to { LinkButton.M.Accent.style() },
            "SAccent" to { LinkButton.S.Accent.style() },
            "XSAccent" to { LinkButton.Xs.Accent.style() },

            "LPositive" to { LinkButton.L.Positive.style() },
            "MPositive" to { LinkButton.M.Positive.style() },
            "SPositive" to { LinkButton.S.Positive.style() },
            "XSPositive" to { LinkButton.Xs.Positive.style() },

            "LNegative" to { LinkButton.L.Negative.style() },
            "MNegative" to { LinkButton.M.Negative.style() },
            "SNegative" to { LinkButton.S.Negative.style() },
            "XSNegative" to { LinkButton.Xs.Negative.style() },

            "LWarning" to { LinkButton.L.Warning.style() },
            "MWarning" to { LinkButton.M.Warning.style() },
            "SWarning" to { LinkButton.S.Warning.style() },
            "XSWarning" to { LinkButton.Xs.Warning.style() },
        )
}