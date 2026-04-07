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
import com.sdds.sbcom.styles.iconbutton.Accent
import com.sdds.sbcom.styles.iconbutton.DangerTint
import com.sdds.sbcom.styles.iconbutton.IconButtonClear
import com.sdds.sbcom.styles.iconbutton.M
import com.sdds.sbcom.styles.iconbutton.S
import com.sdds.sbcom.styles.iconbutton.Xs

internal object SddsSbcomIconButtonClearVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "M.Accent" to ComposeStyleReference { IconButtonClear.M.Accent.style() },
            "M.DangerTint" to ComposeStyleReference { IconButtonClear.M.DangerTint.style() },
            "S.Accent" to ComposeStyleReference { IconButtonClear.S.Accent.style() },
            "S.DangerTint" to ComposeStyleReference { IconButtonClear.S.DangerTint.style() },
            "Xs.Accent" to ComposeStyleReference { IconButtonClear.Xs.Accent.style() },
            "Xs.DangerTint" to ComposeStyleReference { IconButtonClear.Xs.DangerTint.style() },
        )
}
