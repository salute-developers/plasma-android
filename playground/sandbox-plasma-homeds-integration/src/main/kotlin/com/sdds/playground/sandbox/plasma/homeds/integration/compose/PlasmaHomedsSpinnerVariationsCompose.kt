package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.spinner.Accent
import com.sdds.plasma.homeds.styles.spinner.Default
import com.sdds.plasma.homeds.styles.spinner.Info
import com.sdds.plasma.homeds.styles.spinner.M
import com.sdds.plasma.homeds.styles.spinner.Negative
import com.sdds.plasma.homeds.styles.spinner.Positive
import com.sdds.plasma.homeds.styles.spinner.S
import com.sdds.plasma.homeds.styles.spinner.Scalable
import com.sdds.plasma.homeds.styles.spinner.Secondary
import com.sdds.plasma.homeds.styles.spinner.Spinner
import com.sdds.plasma.homeds.styles.spinner.Warning
import com.sdds.plasma.homeds.styles.spinner.Xs
import com.sdds.plasma.homeds.styles.spinner.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsSpinnerVariationsCompose : ComposeStyleProvider<String, SpinnerStyle>() {
    override val variations: Map<String, @Composable () -> SpinnerStyle> =
        mapOf(
            "M.Default" to { Spinner.M.Default.style() },
            "M.Secondary" to { Spinner.M.Secondary.style() },
            "M.Accent" to { Spinner.M.Accent.style() },
            "M.Positive" to { Spinner.M.Positive.style() },
            "M.Negative" to { Spinner.M.Negative.style() },
            "M.Warning" to { Spinner.M.Warning.style() },
            "M.Info" to { Spinner.M.Info.style() },
            "S.Default" to { Spinner.S.Default.style() },
            "S.Secondary" to { Spinner.S.Secondary.style() },
            "S.Accent" to { Spinner.S.Accent.style() },
            "S.Positive" to { Spinner.S.Positive.style() },
            "S.Negative" to { Spinner.S.Negative.style() },
            "S.Warning" to { Spinner.S.Warning.style() },
            "S.Info" to { Spinner.S.Info.style() },
            "Xs.Default" to { Spinner.Xs.Default.style() },
            "Xs.Secondary" to { Spinner.Xs.Secondary.style() },
            "Xs.Accent" to { Spinner.Xs.Accent.style() },
            "Xs.Positive" to { Spinner.Xs.Positive.style() },
            "Xs.Negative" to { Spinner.Xs.Negative.style() },
            "Xs.Warning" to { Spinner.Xs.Warning.style() },
            "Xs.Info" to { Spinner.Xs.Info.style() },
            "Xxs.Default" to { Spinner.Xxs.Default.style() },
            "Xxs.Secondary" to { Spinner.Xxs.Secondary.style() },
            "Xxs.Accent" to { Spinner.Xxs.Accent.style() },
            "Xxs.Positive" to { Spinner.Xxs.Positive.style() },
            "Xxs.Negative" to { Spinner.Xxs.Negative.style() },
            "Xxs.Warning" to { Spinner.Xxs.Warning.style() },
            "Xxs.Info" to { Spinner.Xxs.Info.style() },
            "Scalable.Default" to { Spinner.Scalable.Default.style() },
            "Scalable.Secondary" to { Spinner.Scalable.Secondary.style() },
            "Scalable.Accent" to { Spinner.Scalable.Accent.style() },
            "Scalable.Positive" to { Spinner.Scalable.Positive.style() },
            "Scalable.Negative" to { Spinner.Scalable.Negative.style() },
            "Scalable.Warning" to { Spinner.Scalable.Warning.style() },
            "Scalable.Info" to { Spinner.Scalable.Info.style() },
        )
}
