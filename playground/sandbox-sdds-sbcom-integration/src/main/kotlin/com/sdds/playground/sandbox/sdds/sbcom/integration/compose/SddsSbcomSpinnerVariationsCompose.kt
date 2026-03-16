package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
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

internal object SddsSbcomSpinnerVariationsCompose : ComposeStyleProvider<String, SpinnerStyle>() {
    override val variations: Map<String, @Composable () -> SpinnerStyle> =
        mapOf(
            "M.Primary" to { Spinner.M.Primary.style() },
            "M.Secondary" to { Spinner.M.Secondary.style() },
            "M.GlobalWhite" to { Spinner.M.GlobalWhite.style() },
            "M.Accent" to { Spinner.M.Accent.style() },
            "M.Danger" to { Spinner.M.Danger.style() },
            "S.Primary" to { Spinner.S.Primary.style() },
            "S.Secondary" to { Spinner.S.Secondary.style() },
            "S.GlobalWhite" to { Spinner.S.GlobalWhite.style() },
            "S.Accent" to { Spinner.S.Accent.style() },
            "S.Danger" to { Spinner.S.Danger.style() },
            "Xs.Primary" to { Spinner.Xs.Primary.style() },
            "Xs.Secondary" to { Spinner.Xs.Secondary.style() },
            "Xs.GlobalWhite" to { Spinner.Xs.GlobalWhite.style() },
            "Xs.Accent" to { Spinner.Xs.Accent.style() },
            "Xs.Danger" to { Spinner.Xs.Danger.style() },
            "Xxs.Primary" to { Spinner.Xxs.Primary.style() },
            "Xxs.Secondary" to { Spinner.Xxs.Secondary.style() },
            "Xxs.GlobalWhite" to { Spinner.Xxs.GlobalWhite.style() },
            "Xxs.Accent" to { Spinner.Xxs.Accent.style() },
            "Xxs.Danger" to { Spinner.Xxs.Danger.style() },
        )
}
