package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.linkbutton.Accent
import com.sdds.sbcom.styles.linkbutton.DangerTint
import com.sdds.sbcom.styles.linkbutton.LinkButton
import com.sdds.sbcom.styles.linkbutton.M
import com.sdds.sbcom.styles.linkbutton.S
import com.sdds.sbcom.styles.linkbutton.Xs
import com.sdds.sbcom.styles.linkbutton.Xxs

internal object SddsSbcomLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "M.Accent" to { LinkButton.M.Accent.style() },
            "M.DangerTint" to { LinkButton.M.DangerTint.style() },
            "S.Accent" to { LinkButton.S.Accent.style() },
            "S.DangerTint" to { LinkButton.S.DangerTint.style() },
            "Xs.Accent" to { LinkButton.Xs.Accent.style() },
            "Xs.DangerTint" to { LinkButton.Xs.DangerTint.style() },
            "Xxs.Accent" to { LinkButton.Xxs.Accent.style() },
            "Xxs.DangerTint" to { LinkButton.Xxs.DangerTint.style() },
        )
}
