package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.linkbutton.Accent
import com.sdds.serv.styles.linkbutton.Default
import com.sdds.serv.styles.linkbutton.Info
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
            "Xl.Default" to { LinkButton.Xl.Default.style() },
            "Xl.Secondary" to { LinkButton.Xl.Secondary.style() },
            "Xl.Accent" to { LinkButton.Xl.Accent.style() },
            "Xl.Positive" to { LinkButton.Xl.Positive.style() },
            "Xl.Negative" to { LinkButton.Xl.Negative.style() },
            "Xl.Warning" to { LinkButton.Xl.Warning.style() },
            "Xl.Info" to { LinkButton.Xl.Info.style() },
            "L.Default" to { LinkButton.L.Default.style() },
            "L.Secondary" to { LinkButton.L.Secondary.style() },
            "L.Accent" to { LinkButton.L.Accent.style() },
            "L.Positive" to { LinkButton.L.Positive.style() },
            "L.Negative" to { LinkButton.L.Negative.style() },
            "L.Warning" to { LinkButton.L.Warning.style() },
            "L.Info" to { LinkButton.L.Info.style() },
            "M.Default" to { LinkButton.M.Default.style() },
            "M.Secondary" to { LinkButton.M.Secondary.style() },
            "M.Accent" to { LinkButton.M.Accent.style() },
            "M.Positive" to { LinkButton.M.Positive.style() },
            "M.Negative" to { LinkButton.M.Negative.style() },
            "M.Warning" to { LinkButton.M.Warning.style() },
            "M.Info" to { LinkButton.M.Info.style() },
            "S.Default" to { LinkButton.S.Default.style() },
            "S.Secondary" to { LinkButton.S.Secondary.style() },
            "S.Accent" to { LinkButton.S.Accent.style() },
            "S.Positive" to { LinkButton.S.Positive.style() },
            "S.Negative" to { LinkButton.S.Negative.style() },
            "S.Warning" to { LinkButton.S.Warning.style() },
            "S.Info" to { LinkButton.S.Info.style() },
            "Xs.Default" to { LinkButton.Xs.Default.style() },
            "Xs.Secondary" to { LinkButton.Xs.Secondary.style() },
            "Xs.Accent" to { LinkButton.Xs.Accent.style() },
            "Xs.Positive" to { LinkButton.Xs.Positive.style() },
            "Xs.Negative" to { LinkButton.Xs.Negative.style() },
            "Xs.Warning" to { LinkButton.Xs.Warning.style() },
            "Xs.Info" to { LinkButton.Xs.Info.style() },
            "Xxs.Default" to { LinkButton.Xxs.Default.style() },
            "Xxs.Secondary" to { LinkButton.Xxs.Secondary.style() },
            "Xxs.Accent" to { LinkButton.Xxs.Accent.style() },
            "Xxs.Positive" to { LinkButton.Xxs.Positive.style() },
            "Xxs.Negative" to { LinkButton.Xxs.Negative.style() },
            "Xxs.Warning" to { LinkButton.Xxs.Warning.style() },
            "Xxs.Info" to { LinkButton.Xxs.Info.style() },
        )
}
