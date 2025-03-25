package com.sdds.playground.sandbox.plasma.stards.integration.button.basic

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.button.basic.BasicButton
import com.sdkit.star.designsystem.styles.button.basic.L
import com.sdkit.star.designsystem.styles.button.basic.M
import com.sdkit.star.designsystem.styles.button.basic.S
import com.sdkit.star.designsystem.styles.button.basic.Xs

internal object StarDsBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "L" to { BasicButton.L.style() },
            "M" to { BasicButton.M.style() },
            "S" to { BasicButton.S.style() },
            "Xs" to { BasicButton.Xs.style() },
        )
}
