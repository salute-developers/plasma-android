package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.spinner.Accent
import com.sdds.plasma.giga.styles.spinner.Default
import com.sdds.plasma.giga.styles.spinner.Info
import com.sdds.plasma.giga.styles.spinner.L
import com.sdds.plasma.giga.styles.spinner.M
import com.sdds.plasma.giga.styles.spinner.Negative
import com.sdds.plasma.giga.styles.spinner.Positive
import com.sdds.plasma.giga.styles.spinner.S
import com.sdds.plasma.giga.styles.spinner.Scalable
import com.sdds.plasma.giga.styles.spinner.Secondary
import com.sdds.plasma.giga.styles.spinner.Spinner
import com.sdds.plasma.giga.styles.spinner.Warning
import com.sdds.plasma.giga.styles.spinner.Xl
import com.sdds.plasma.giga.styles.spinner.Xs
import com.sdds.plasma.giga.styles.spinner.Xxl
import com.sdds.plasma.giga.styles.spinner.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaSpinnerVariationsCompose : ComposeStyleProvider<String, SpinnerStyle>() {
    override val variations: Map<String, @Composable () -> SpinnerStyle> =
        mapOf(
            "Xxl.Default" to { Spinner.Xxl.Default.style() },
            "Xxl.Secondary" to { Spinner.Xxl.Secondary.style() },
            "Xxl.Accent" to { Spinner.Xxl.Accent.style() },
            "Xxl.Positive" to { Spinner.Xxl.Positive.style() },
            "Xxl.Negative" to { Spinner.Xxl.Negative.style() },
            "Xxl.Warning" to { Spinner.Xxl.Warning.style() },
            "Xxl.Info" to { Spinner.Xxl.Info.style() },
            "Xl.Default" to { Spinner.Xl.Default.style() },
            "Xl.Secondary" to { Spinner.Xl.Secondary.style() },
            "Xl.Accent" to { Spinner.Xl.Accent.style() },
            "Xl.Positive" to { Spinner.Xl.Positive.style() },
            "Xl.Negative" to { Spinner.Xl.Negative.style() },
            "Xl.Warning" to { Spinner.Xl.Warning.style() },
            "Xl.Info" to { Spinner.Xl.Info.style() },
            "L.Default" to { Spinner.L.Default.style() },
            "L.Secondary" to { Spinner.L.Secondary.style() },
            "L.Accent" to { Spinner.L.Accent.style() },
            "L.Positive" to { Spinner.L.Positive.style() },
            "L.Negative" to { Spinner.L.Negative.style() },
            "L.Warning" to { Spinner.L.Warning.style() },
            "L.Info" to { Spinner.L.Info.style() },
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
