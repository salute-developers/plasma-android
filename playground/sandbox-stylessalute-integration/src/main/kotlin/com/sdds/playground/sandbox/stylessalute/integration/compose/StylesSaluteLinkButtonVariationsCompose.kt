package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.linkbutton.Accent
import com.sdds.stylessalute.styles.linkbutton.Default
import com.sdds.stylessalute.styles.linkbutton.L
import com.sdds.stylessalute.styles.linkbutton.LinkButton
import com.sdds.stylessalute.styles.linkbutton.M
import com.sdds.stylessalute.styles.linkbutton.Negative
import com.sdds.stylessalute.styles.linkbutton.Positive
import com.sdds.stylessalute.styles.linkbutton.S
import com.sdds.stylessalute.styles.linkbutton.Secondary
import com.sdds.stylessalute.styles.linkbutton.Warning
import com.sdds.stylessalute.styles.linkbutton.Xs

internal object StylesSaluteLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
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
        )
}
