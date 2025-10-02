package com.sdds.playground.sandbox.plasma.homeds.integration.spinner

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

internal object PlasmaHomeDsSpinnerVariationsCompose :
    ComposeStyleProvider<String, SpinnerStyle>() {
    override val variations: Map<String, @Composable () -> SpinnerStyle> =
        mapOf(
            "MDefault" to { Spinner.M.Default.style() },
            "MSecondary" to { Spinner.M.Secondary.style() },
            "MAccent" to { Spinner.M.Accent.style() },
            "MPositive" to { Spinner.M.Positive.style() },
            "MNegative" to { Spinner.M.Negative.style() },
            "MWarning" to { Spinner.M.Warning.style() },
            "MInfo" to { Spinner.M.Info.style() },

            "SDefault" to { Spinner.S.Default.style() },
            "SSecondary" to { Spinner.S.Secondary.style() },
            "SAccent" to { Spinner.S.Accent.style() },
            "SPositive" to { Spinner.S.Positive.style() },
            "SNegative" to { Spinner.S.Negative.style() },
            "SWarning" to { Spinner.S.Warning.style() },
            "SInfo" to { Spinner.S.Info.style() },

            "XsDefault" to { Spinner.Xs.Default.style() },
            "XsSecondary" to { Spinner.Xs.Secondary.style() },
            "XsAccent" to { Spinner.Xs.Accent.style() },
            "XsPositive" to { Spinner.Xs.Positive.style() },
            "XsNegative" to { Spinner.Xs.Negative.style() },
            "XsWarning" to { Spinner.Xs.Warning.style() },
            "XsInfo" to { Spinner.Xs.Info.style() },

            "XxsDefault" to { Spinner.Xxs.Default.style() },
            "XxsSecondary" to { Spinner.Xxs.Secondary.style() },
            "XxsAccent" to { Spinner.Xxs.Accent.style() },
            "XxsPositive" to { Spinner.Xxs.Positive.style() },
            "XxsNegative" to { Spinner.Xxs.Negative.style() },
            "XxsWarning" to { Spinner.Xxs.Warning.style() },
            "XxsInfo" to { Spinner.Xxs.Info.style() },

            "ScalableDefault" to { Spinner.Scalable.Default.style() },
            "ScalableSecondary" to { Spinner.Scalable.Secondary.style() },
            "ScalableAccent" to { Spinner.Scalable.Accent.style() },
            "ScalablePositive" to { Spinner.Scalable.Positive.style() },
            "ScalableNegative" to { Spinner.Scalable.Negative.style() },
            "ScalableWarning" to { Spinner.Scalable.Warning.style() },
            "ScalableInfo" to { Spinner.Scalable.Info.style() },
        )
}
