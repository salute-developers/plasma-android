package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.circularprogressbar.Accent
import com.sdds.plasma.sd.service.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.sd.service.styles.circularprogressbar.Default
import com.sdds.plasma.sd.service.styles.circularprogressbar.Gradient
import com.sdds.plasma.sd.service.styles.circularprogressbar.Info
import com.sdds.plasma.sd.service.styles.circularprogressbar.L
import com.sdds.plasma.sd.service.styles.circularprogressbar.M
import com.sdds.plasma.sd.service.styles.circularprogressbar.Negative
import com.sdds.plasma.sd.service.styles.circularprogressbar.Positive
import com.sdds.plasma.sd.service.styles.circularprogressbar.S
import com.sdds.plasma.sd.service.styles.circularprogressbar.Secondary
import com.sdds.plasma.sd.service.styles.circularprogressbar.Warning
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xl
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xs
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xxl
import com.sdds.plasma.sd.service.styles.circularprogressbar.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cCircularProgressBarVariationsCompose : ComposeStyleProvider<String, CircularProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> CircularProgressBarStyle> =
        mapOf(
            "Xxl.Default" to { CircularProgressBar.Xxl.Default.style() },
            "Xxl.Secondary" to { CircularProgressBar.Xxl.Secondary.style() },
            "Xxl.Accent" to { CircularProgressBar.Xxl.Accent.style() },
            "Xxl.Gradient" to { CircularProgressBar.Xxl.Gradient.style() },
            "Xxl.Info" to { CircularProgressBar.Xxl.Info.style() },
            "Xxl.Negative" to { CircularProgressBar.Xxl.Negative.style() },
            "Xxl.Positive" to { CircularProgressBar.Xxl.Positive.style() },
            "Xxl.Warning" to { CircularProgressBar.Xxl.Warning.style() },
            "Xl.Default" to { CircularProgressBar.Xl.Default.style() },
            "Xl.Secondary" to { CircularProgressBar.Xl.Secondary.style() },
            "Xl.Accent" to { CircularProgressBar.Xl.Accent.style() },
            "Xl.Gradient" to { CircularProgressBar.Xl.Gradient.style() },
            "Xl.Info" to { CircularProgressBar.Xl.Info.style() },
            "Xl.Negative" to { CircularProgressBar.Xl.Negative.style() },
            "Xl.Positive" to { CircularProgressBar.Xl.Positive.style() },
            "Xl.Warning" to { CircularProgressBar.Xl.Warning.style() },
            "L.Default" to { CircularProgressBar.L.Default.style() },
            "L.Secondary" to { CircularProgressBar.L.Secondary.style() },
            "L.Accent" to { CircularProgressBar.L.Accent.style() },
            "L.Gradient" to { CircularProgressBar.L.Gradient.style() },
            "L.Info" to { CircularProgressBar.L.Info.style() },
            "L.Negative" to { CircularProgressBar.L.Negative.style() },
            "L.Positive" to { CircularProgressBar.L.Positive.style() },
            "L.Warning" to { CircularProgressBar.L.Warning.style() },
            "M.Default" to { CircularProgressBar.M.Default.style() },
            "M.Secondary" to { CircularProgressBar.M.Secondary.style() },
            "M.Accent" to { CircularProgressBar.M.Accent.style() },
            "M.Gradient" to { CircularProgressBar.M.Gradient.style() },
            "M.Info" to { CircularProgressBar.M.Info.style() },
            "M.Negative" to { CircularProgressBar.M.Negative.style() },
            "M.Positive" to { CircularProgressBar.M.Positive.style() },
            "M.Warning" to { CircularProgressBar.M.Warning.style() },
            "S.Default" to { CircularProgressBar.S.Default.style() },
            "S.Secondary" to { CircularProgressBar.S.Secondary.style() },
            "S.Accent" to { CircularProgressBar.S.Accent.style() },
            "S.Gradient" to { CircularProgressBar.S.Gradient.style() },
            "S.Info" to { CircularProgressBar.S.Info.style() },
            "S.Negative" to { CircularProgressBar.S.Negative.style() },
            "S.Positive" to { CircularProgressBar.S.Positive.style() },
            "S.Warning" to { CircularProgressBar.S.Warning.style() },
            "Xs.Default" to { CircularProgressBar.Xs.Default.style() },
            "Xs.Secondary" to { CircularProgressBar.Xs.Secondary.style() },
            "Xs.Accent" to { CircularProgressBar.Xs.Accent.style() },
            "Xs.Gradient" to { CircularProgressBar.Xs.Gradient.style() },
            "Xs.Info" to { CircularProgressBar.Xs.Info.style() },
            "Xs.Negative" to { CircularProgressBar.Xs.Negative.style() },
            "Xs.Positive" to { CircularProgressBar.Xs.Positive.style() },
            "Xs.Warning" to { CircularProgressBar.Xs.Warning.style() },
            "Xxs.Default" to { CircularProgressBar.Xxs.Default.style() },
            "Xxs.Secondary" to { CircularProgressBar.Xxs.Secondary.style() },
            "Xxs.Accent" to { CircularProgressBar.Xxs.Accent.style() },
            "Xxs.Gradient" to { CircularProgressBar.Xxs.Gradient.style() },
            "Xxs.Info" to { CircularProgressBar.Xxs.Info.style() },
            "Xxs.Negative" to { CircularProgressBar.Xxs.Negative.style() },
            "Xxs.Positive" to { CircularProgressBar.Xxs.Positive.style() },
            "Xxs.Warning" to { CircularProgressBar.Xxs.Warning.style() },
        )
}
