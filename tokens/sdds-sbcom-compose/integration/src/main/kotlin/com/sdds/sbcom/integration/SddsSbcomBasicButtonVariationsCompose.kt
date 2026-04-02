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
import com.sdds.sbcom.styles.basicbutton.AccentFilled
import com.sdds.sbcom.styles.basicbutton.AccentGrey
import com.sdds.sbcom.styles.basicbutton.AccentWhite
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.DangerTint
import com.sdds.sbcom.styles.basicbutton.M
import com.sdds.sbcom.styles.basicbutton.Primary
import com.sdds.sbcom.styles.basicbutton.S
import com.sdds.sbcom.styles.basicbutton.Xs
import com.sdds.sbcom.styles.basicbutton.Xxs

internal object SddsSbcomBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "M.Primary" to ComposeStyleReference { BasicButton.M.Primary.style() },
            "M.AccentFilled" to ComposeStyleReference { BasicButton.M.AccentFilled.style() },
            "M.AccentWhite" to ComposeStyleReference { BasicButton.M.AccentWhite.style() },
            "M.AccentGrey" to ComposeStyleReference { BasicButton.M.AccentGrey.style() },
            "M.DangerTint" to ComposeStyleReference { BasicButton.M.DangerTint.style() },
            "S.Primary" to ComposeStyleReference { BasicButton.S.Primary.style() },
            "S.AccentFilled" to ComposeStyleReference { BasicButton.S.AccentFilled.style() },
            "S.AccentWhite" to ComposeStyleReference { BasicButton.S.AccentWhite.style() },
            "S.AccentGrey" to ComposeStyleReference { BasicButton.S.AccentGrey.style() },
            "S.DangerTint" to ComposeStyleReference { BasicButton.S.DangerTint.style() },
            "Xs.Primary" to ComposeStyleReference { BasicButton.Xs.Primary.style() },
            "Xs.AccentFilled" to ComposeStyleReference { BasicButton.Xs.AccentFilled.style() },
            "Xs.AccentWhite" to ComposeStyleReference { BasicButton.Xs.AccentWhite.style() },
            "Xs.AccentGrey" to ComposeStyleReference { BasicButton.Xs.AccentGrey.style() },
            "Xs.DangerTint" to ComposeStyleReference { BasicButton.Xs.DangerTint.style() },
            "Xxs.Primary" to ComposeStyleReference { BasicButton.Xxs.Primary.style() },
            "Xxs.AccentFilled" to ComposeStyleReference { BasicButton.Xxs.AccentFilled.style() },
            "Xxs.AccentWhite" to ComposeStyleReference { BasicButton.Xxs.AccentWhite.style() },
            "Xxs.AccentGrey" to ComposeStyleReference { BasicButton.Xxs.AccentGrey.style() },
            "Xxs.DangerTint" to ComposeStyleReference { BasicButton.Xxs.DangerTint.style() },
        )
}
