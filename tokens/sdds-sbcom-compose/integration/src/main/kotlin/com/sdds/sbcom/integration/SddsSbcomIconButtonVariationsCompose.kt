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
import com.sdds.sbcom.styles.iconbutton.AccentFilled
import com.sdds.sbcom.styles.iconbutton.AccentGrey
import com.sdds.sbcom.styles.iconbutton.DangerTint
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.M
import com.sdds.sbcom.styles.iconbutton.S
import com.sdds.sbcom.styles.iconbutton.Xs

internal object SddsSbcomIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "M.AccentFilled" to ComposeStyleReference { IconButton.M.AccentFilled.style() },
            "M.AccentGrey" to ComposeStyleReference { IconButton.M.AccentGrey.style() },
            "M.DangerTint" to ComposeStyleReference { IconButton.M.DangerTint.style() },
            "S.AccentFilled" to ComposeStyleReference { IconButton.S.AccentFilled.style() },
            "S.AccentGrey" to ComposeStyleReference { IconButton.S.AccentGrey.style() },
            "S.DangerTint" to ComposeStyleReference { IconButton.S.DangerTint.style() },
            "Xs.AccentFilled" to ComposeStyleReference { IconButton.Xs.AccentFilled.style() },
            "Xs.AccentGrey" to ComposeStyleReference { IconButton.Xs.AccentGrey.style() },
            "Xs.DangerTint" to ComposeStyleReference { IconButton.Xs.DangerTint.style() },
        )
}
