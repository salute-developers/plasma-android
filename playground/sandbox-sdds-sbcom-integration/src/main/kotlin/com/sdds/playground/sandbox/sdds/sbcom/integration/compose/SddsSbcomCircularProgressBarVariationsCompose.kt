package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.circularprogressbar.Accent
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.Danger
import com.sdds.sbcom.styles.circularprogressbar.GlobalWhite
import com.sdds.sbcom.styles.circularprogressbar.M
import com.sdds.sbcom.styles.circularprogressbar.Primary
import com.sdds.sbcom.styles.circularprogressbar.S
import com.sdds.sbcom.styles.circularprogressbar.Secondary
import com.sdds.sbcom.styles.circularprogressbar.Xs
import com.sdds.sbcom.styles.circularprogressbar.Xxl
import com.sdds.sbcom.styles.circularprogressbar.Xxs

internal object SddsSbcomCircularProgressBarVariationsCompose : ComposeStyleProvider<String, CircularProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> CircularProgressBarStyle> =
        mapOf(
            "Xxl.Primary" to { CircularProgressBar.Xxl.Primary.style() },
            "Xxl.Secondary" to { CircularProgressBar.Xxl.Secondary.style() },
            "Xxl.GlobalWhite" to { CircularProgressBar.Xxl.GlobalWhite.style() },
            "Xxl.Accent" to { CircularProgressBar.Xxl.Accent.style() },
            "Xxl.Danger" to { CircularProgressBar.Xxl.Danger.style() },
            "M.Primary" to { CircularProgressBar.M.Primary.style() },
            "M.Secondary" to { CircularProgressBar.M.Secondary.style() },
            "M.GlobalWhite" to { CircularProgressBar.M.GlobalWhite.style() },
            "M.Accent" to { CircularProgressBar.M.Accent.style() },
            "M.Danger" to { CircularProgressBar.M.Danger.style() },
            "S.Primary" to { CircularProgressBar.S.Primary.style() },
            "S.Secondary" to { CircularProgressBar.S.Secondary.style() },
            "S.GlobalWhite" to { CircularProgressBar.S.GlobalWhite.style() },
            "S.Accent" to { CircularProgressBar.S.Accent.style() },
            "S.Danger" to { CircularProgressBar.S.Danger.style() },
            "Xs.Primary" to { CircularProgressBar.Xs.Primary.style() },
            "Xs.Secondary" to { CircularProgressBar.Xs.Secondary.style() },
            "Xs.GlobalWhite" to { CircularProgressBar.Xs.GlobalWhite.style() },
            "Xs.Accent" to { CircularProgressBar.Xs.Accent.style() },
            "Xs.Danger" to { CircularProgressBar.Xs.Danger.style() },
            "Xxs.Primary" to { CircularProgressBar.Xxs.Primary.style() },
            "Xxs.Secondary" to { CircularProgressBar.Xxs.Secondary.style() },
            "Xxs.GlobalWhite" to { CircularProgressBar.Xxs.GlobalWhite.style() },
            "Xxs.Accent" to { CircularProgressBar.Xxs.Accent.style() },
            "Xxs.Danger" to { CircularProgressBar.Xxs.Danger.style() },
        )
}
