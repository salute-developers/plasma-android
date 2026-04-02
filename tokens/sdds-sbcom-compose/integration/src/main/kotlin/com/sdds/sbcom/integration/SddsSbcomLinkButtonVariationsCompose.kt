// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.linkbutton.Accent
import com.sdds.sbcom.styles.linkbutton.DangerTint
import com.sdds.sbcom.styles.linkbutton.LinkButton
import com.sdds.sbcom.styles.linkbutton.M
import com.sdds.sbcom.styles.linkbutton.S
import com.sdds.sbcom.styles.linkbutton.Xs
import com.sdds.sbcom.styles.linkbutton.Xxs

internal object SddsSbcomLinkButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "M.Accent" to ComposeStyleReference { LinkButton.M.Accent.style() },
            "M.DangerTint" to ComposeStyleReference { LinkButton.M.DangerTint.style() },
            "S.Accent" to ComposeStyleReference { LinkButton.S.Accent.style() },
            "S.DangerTint" to ComposeStyleReference { LinkButton.S.DangerTint.style() },
            "Xs.Accent" to ComposeStyleReference { LinkButton.Xs.Accent.style() },
            "Xs.DangerTint" to ComposeStyleReference { LinkButton.Xs.DangerTint.style() },
            "Xxs.Accent" to ComposeStyleReference { LinkButton.Xxs.Accent.style() },
            "Xxs.DangerTint" to ComposeStyleReference { LinkButton.Xxs.DangerTint.style() },
        )
}
