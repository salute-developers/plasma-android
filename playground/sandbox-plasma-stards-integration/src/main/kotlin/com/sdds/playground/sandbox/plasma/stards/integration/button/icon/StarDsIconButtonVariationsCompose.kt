package com.sdds.playground.sandbox.plasma.stards.integration.button.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.button.icon.L
import com.sdkit.star.designsystem.styles.button.icon.M
import com.sdkit.star.designsystem.styles.button.icon.Pilled
import com.sdkit.star.designsystem.styles.button.icon.S
import com.sdkit.star.designsystem.styles.button.icon.Xs

internal object StarDsIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "L" to { IconButton.L.style() },
            "LPilled" to { IconButton.L.Pilled.style() },
            "M" to { IconButton.M.style() },
            "MPilled" to { IconButton.M.Pilled.style() },
            "S" to { IconButton.S.style() },
            "SPilled" to { IconButton.S.Pilled.style() },
            "XS" to { IconButton.Xs.style() },
            "XSPilled" to { IconButton.Xs.Pilled.style() },
        )
}
