package com.sdds.playground.sandbox.sdds.serv.integration.circularprogress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.circularprogressbar.Accent
import com.sdds.serv.styles.circularprogressbar.CircularProgressBar
import com.sdds.serv.styles.circularprogressbar.Default
import com.sdds.serv.styles.circularprogressbar.Gradient
import com.sdds.serv.styles.circularprogressbar.Info
import com.sdds.serv.styles.circularprogressbar.L
import com.sdds.serv.styles.circularprogressbar.M
import com.sdds.serv.styles.circularprogressbar.Negative
import com.sdds.serv.styles.circularprogressbar.Positive
import com.sdds.serv.styles.circularprogressbar.S
import com.sdds.serv.styles.circularprogressbar.Secondary
import com.sdds.serv.styles.circularprogressbar.Warning
import com.sdds.serv.styles.circularprogressbar.Xl
import com.sdds.serv.styles.circularprogressbar.Xs
import com.sdds.serv.styles.circularprogressbar.Xxl
import com.sdds.serv.styles.circularprogressbar.Xxs

internal object SddsServCircularProgressBarVariationsCompose :
    ComposeStyleProvider<String, CircularProgressBarStyle>() {

    override val variations: Map<String, @Composable () -> CircularProgressBarStyle> =
        mapOf(
            "XxlDefault" to { CircularProgressBar.Xxl.Default.style() },
            "XxlSecondary" to { CircularProgressBar.Xxl.Secondary.style() },
            "XxlAccent" to { CircularProgressBar.Xxl.Accent.style() },
            "XxlGradient" to { CircularProgressBar.Xxl.Gradient.style() },
            "XxlInfo" to { CircularProgressBar.Xxl.Info.style() },
            "XxlPositive" to { CircularProgressBar.Xxl.Positive.style() },
            "XxlWarning" to { CircularProgressBar.Xxl.Warning.style() },
            "XxlNegative" to { CircularProgressBar.Xxl.Negative.style() },

            "XlDefault" to { CircularProgressBar.Xl.Default.style() },
            "XlSecondary" to { CircularProgressBar.Xl.Secondary.style() },
            "XlAccent" to { CircularProgressBar.Xl.Accent.style() },
            "XlGradient" to { CircularProgressBar.Xl.Gradient.style() },
            "XlInfo" to { CircularProgressBar.Xl.Info.style() },
            "XlPositive" to { CircularProgressBar.Xl.Positive.style() },
            "XlWarning" to { CircularProgressBar.Xl.Warning.style() },
            "XlNegative" to { CircularProgressBar.Xl.Negative.style() },

            "LDefault" to { CircularProgressBar.L.Default.style() },
            "LSecondary" to { CircularProgressBar.L.Secondary.style() },
            "LAccent" to { CircularProgressBar.L.Accent.style() },
            "LGradient" to { CircularProgressBar.L.Gradient.style() },
            "LInfo" to { CircularProgressBar.L.Info.style() },
            "LPositive" to { CircularProgressBar.L.Positive.style() },
            "LWarning" to { CircularProgressBar.L.Warning.style() },
            "LNegative" to { CircularProgressBar.L.Negative.style() },

            "MDefault" to { CircularProgressBar.M.Default.style() },
            "MSecondary" to { CircularProgressBar.M.Secondary.style() },
            "MAccent" to { CircularProgressBar.M.Accent.style() },
            "MGradient" to { CircularProgressBar.M.Gradient.style() },
            "MInfo" to { CircularProgressBar.M.Info.style() },
            "MPositive" to { CircularProgressBar.M.Positive.style() },
            "MWarning" to { CircularProgressBar.M.Warning.style() },
            "MNegative" to { CircularProgressBar.M.Negative.style() },

            "SDefault" to { CircularProgressBar.S.Default.style() },
            "SSecondary" to { CircularProgressBar.S.Secondary.style() },
            "SAccent" to { CircularProgressBar.S.Accent.style() },
            "SGradient" to { CircularProgressBar.S.Gradient.style() },
            "SInfo" to { CircularProgressBar.S.Info.style() },
            "SPositive" to { CircularProgressBar.S.Positive.style() },
            "SWarning" to { CircularProgressBar.S.Warning.style() },
            "SNegative" to { CircularProgressBar.S.Negative.style() },

            "XsDefault" to { CircularProgressBar.Xs.Default.style() },
            "XsSecondary" to { CircularProgressBar.Xs.Secondary.style() },
            "XsAccent" to { CircularProgressBar.Xs.Accent.style() },
            "XsGradient" to { CircularProgressBar.Xs.Gradient.style() },
            "XsInfo" to { CircularProgressBar.Xs.Info.style() },
            "XsPositive" to { CircularProgressBar.Xs.Positive.style() },
            "XsWarning" to { CircularProgressBar.Xs.Warning.style() },
            "XsNegative" to { CircularProgressBar.Xs.Negative.style() },

            "XxsDefault" to { CircularProgressBar.Xxs.Default.style() },
            "XxsSecondary" to { CircularProgressBar.Xxs.Secondary.style() },
            "XxsAccent" to { CircularProgressBar.Xxs.Accent.style() },
            "XxsGradient" to { CircularProgressBar.Xxs.Gradient.style() },
            "XxsInfo" to { CircularProgressBar.Xxs.Info.style() },
            "XxsPositive" to { CircularProgressBar.Xxs.Positive.style() },
            "XxsWarning" to { CircularProgressBar.Xxs.Warning.style() },
            "XxsNegative" to { CircularProgressBar.Xxs.Negative.style() },
        )
}
