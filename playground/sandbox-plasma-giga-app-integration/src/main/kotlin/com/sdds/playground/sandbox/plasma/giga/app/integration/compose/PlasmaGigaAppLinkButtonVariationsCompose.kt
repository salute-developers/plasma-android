package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.linkbutton.Accent
import com.sdds.plasma.giga.app.styles.linkbutton.Default
import com.sdds.plasma.giga.app.styles.linkbutton.L
import com.sdds.plasma.giga.app.styles.linkbutton.LinkButton
import com.sdds.plasma.giga.app.styles.linkbutton.M
import com.sdds.plasma.giga.app.styles.linkbutton.Negative
import com.sdds.plasma.giga.app.styles.linkbutton.Positive
import com.sdds.plasma.giga.app.styles.linkbutton.S
import com.sdds.plasma.giga.app.styles.linkbutton.Secondary
import com.sdds.plasma.giga.app.styles.linkbutton.Warning
import com.sdds.plasma.giga.app.styles.linkbutton.Xl
import com.sdds.plasma.giga.app.styles.linkbutton.Xs
import com.sdds.plasma.giga.app.styles.linkbutton.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "Xl.Default" to { LinkButton.Xl.Default.style() },
            "Xl.Secondary" to { LinkButton.Xl.Secondary.style() },
            "Xl.Accent" to { LinkButton.Xl.Accent.style() },
            "Xl.Positive" to { LinkButton.Xl.Positive.style() },
            "Xl.Negative" to { LinkButton.Xl.Negative.style() },
            "Xl.Warning" to { LinkButton.Xl.Warning.style() },
            "L.Default" to { LinkButton.L.Default.style() },
            "L.Secondary" to { LinkButton.L.Secondary.style() },
            "L.Accent" to { LinkButton.L.Accent.style() },
            "L.Positive" to { LinkButton.L.Positive.style() },
            "L.Negative" to { LinkButton.L.Negative.style() },
            "L.Warning" to { LinkButton.L.Warning.style() },
            "M.Default" to { LinkButton.M.Default.style() },
            "M.Secondary" to { LinkButton.M.Secondary.style() },
            "M.Accent" to { LinkButton.M.Accent.style() },
            "M.Positive" to { LinkButton.M.Positive.style() },
            "M.Negative" to { LinkButton.M.Negative.style() },
            "M.Warning" to { LinkButton.M.Warning.style() },
            "S.Default" to { LinkButton.S.Default.style() },
            "S.Secondary" to { LinkButton.S.Secondary.style() },
            "S.Accent" to { LinkButton.S.Accent.style() },
            "S.Positive" to { LinkButton.S.Positive.style() },
            "S.Negative" to { LinkButton.S.Negative.style() },
            "S.Warning" to { LinkButton.S.Warning.style() },
            "Xs.Default" to { LinkButton.Xs.Default.style() },
            "Xs.Secondary" to { LinkButton.Xs.Secondary.style() },
            "Xs.Accent" to { LinkButton.Xs.Accent.style() },
            "Xs.Positive" to { LinkButton.Xs.Positive.style() },
            "Xs.Negative" to { LinkButton.Xs.Negative.style() },
            "Xs.Warning" to { LinkButton.Xs.Warning.style() },
            "Xxs.Default" to { LinkButton.Xxs.Default.style() },
            "Xxs.Secondary" to { LinkButton.Xxs.Secondary.style() },
            "Xxs.Accent" to { LinkButton.Xxs.Accent.style() },
            "Xxs.Positive" to { LinkButton.Xxs.Positive.style() },
            "Xxs.Negative" to { LinkButton.Xxs.Negative.style() },
            "Xxs.Warning" to { LinkButton.Xxs.Warning.style() },
        )
}
