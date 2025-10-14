package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.Clear
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.basicbutton.Xs

internal object PlasmaStardsBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "L.Default" to { BasicButton.L.Default.style() },
            "L.Clear" to { BasicButton.L.Clear.style() },
            "M.Default" to { BasicButton.M.Default.style() },
            "M.Clear" to { BasicButton.M.Clear.style() },
            "S.Default" to { BasicButton.S.Default.style() },
            "S.Clear" to { BasicButton.S.Clear.style() },
            "Xs.Default" to { BasicButton.Xs.Default.style() },
            "Xs.Clear" to { BasicButton.Xs.Clear.style() },
        )
}
