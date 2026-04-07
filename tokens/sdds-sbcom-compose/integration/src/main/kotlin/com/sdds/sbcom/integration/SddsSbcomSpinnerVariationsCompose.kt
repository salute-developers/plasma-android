// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.spinner.Accent
import com.sdds.sbcom.styles.spinner.Danger
import com.sdds.sbcom.styles.spinner.GlobalWhite
import com.sdds.sbcom.styles.spinner.M
import com.sdds.sbcom.styles.spinner.Primary
import com.sdds.sbcom.styles.spinner.S
import com.sdds.sbcom.styles.spinner.Secondary
import com.sdds.sbcom.styles.spinner.Spinner
import com.sdds.sbcom.styles.spinner.Xs
import com.sdds.sbcom.styles.spinner.Xxs

internal object SddsSbcomSpinnerVariationsCompose : ComposeStyleProvider<SpinnerStyle>() {
    override val variations: Map<String, ComposeStyleReference<SpinnerStyle>> =
        mapOf(
            "M.Primary" to ComposeStyleReference { Spinner.M.Primary.style() },
            "M.Secondary" to ComposeStyleReference { Spinner.M.Secondary.style() },
            "M.GlobalWhite" to ComposeStyleReference { Spinner.M.GlobalWhite.style() },
            "M.Accent" to ComposeStyleReference { Spinner.M.Accent.style() },
            "M.Danger" to ComposeStyleReference { Spinner.M.Danger.style() },
            "S.Primary" to ComposeStyleReference { Spinner.S.Primary.style() },
            "S.Secondary" to ComposeStyleReference { Spinner.S.Secondary.style() },
            "S.GlobalWhite" to ComposeStyleReference { Spinner.S.GlobalWhite.style() },
            "S.Accent" to ComposeStyleReference { Spinner.S.Accent.style() },
            "S.Danger" to ComposeStyleReference { Spinner.S.Danger.style() },
            "Xs.Primary" to ComposeStyleReference { Spinner.Xs.Primary.style() },
            "Xs.Secondary" to ComposeStyleReference { Spinner.Xs.Secondary.style() },
            "Xs.GlobalWhite" to ComposeStyleReference { Spinner.Xs.GlobalWhite.style() },
            "Xs.Accent" to ComposeStyleReference { Spinner.Xs.Accent.style() },
            "Xs.Danger" to ComposeStyleReference { Spinner.Xs.Danger.style() },
            "Xxs.Primary" to ComposeStyleReference { Spinner.Xxs.Primary.style() },
            "Xxs.Secondary" to ComposeStyleReference { Spinner.Xxs.Secondary.style() },
            "Xxs.GlobalWhite" to ComposeStyleReference { Spinner.Xxs.GlobalWhite.style() },
            "Xxs.Accent" to ComposeStyleReference { Spinner.Xxs.Accent.style() },
            "Xxs.Danger" to ComposeStyleReference { Spinner.Xxs.Danger.style() },
        )
}
