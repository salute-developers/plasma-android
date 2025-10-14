package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.iconbutton.Clear
import com.sdkit.star.designsystem.styles.iconbutton.Default
import com.sdkit.star.designsystem.styles.iconbutton.IconButton
import com.sdkit.star.designsystem.styles.iconbutton.L
import com.sdkit.star.designsystem.styles.iconbutton.M
import com.sdkit.star.designsystem.styles.iconbutton.Pilled
import com.sdkit.star.designsystem.styles.iconbutton.S
import com.sdkit.star.designsystem.styles.iconbutton.Xs

internal object PlasmaStardsIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "L.Default" to { IconButton.L.Default.style() },
            "L.Clear" to { IconButton.L.Clear.style() },
            "L.Pilled.Default" to { IconButton.L.Pilled.Default.style() },
            "L.Pilled.Clear" to { IconButton.L.Pilled.Clear.style() },
            "M.Default" to { IconButton.M.Default.style() },
            "M.Clear" to { IconButton.M.Clear.style() },
            "M.Pilled.Default" to { IconButton.M.Pilled.Default.style() },
            "M.Pilled.Clear" to { IconButton.M.Pilled.Clear.style() },
            "S.Default" to { IconButton.S.Default.style() },
            "S.Clear" to { IconButton.S.Clear.style() },
            "S.Pilled.Default" to { IconButton.S.Pilled.Default.style() },
            "S.Pilled.Clear" to { IconButton.S.Pilled.Clear.style() },
            "Xs.Default" to { IconButton.Xs.Default.style() },
            "Xs.Clear" to { IconButton.Xs.Clear.style() },
            "Xs.Pilled.Default" to { IconButton.Xs.Pilled.Default.style() },
            "Xs.Pilled.Clear" to { IconButton.Xs.Pilled.Clear.style() },
        )
}
