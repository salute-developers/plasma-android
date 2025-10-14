package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textfield.Xs

internal object PlasmaStardsTextFieldVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Xs.Default" to { TextField.Xs.Default.style() },
            "Xs.Error" to { TextField.Xs.Error.style() },
            "Xs.OuterLabel.Default" to { TextField.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to { TextField.Xs.OuterLabel.Error.style() },
            "S.Default" to { TextField.S.Default.style() },
            "S.Error" to { TextField.S.Error.style() },
            "S.OuterLabel.Default" to { TextField.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to { TextField.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to { TextField.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to { TextField.S.InnerLabel.Error.style() },
            "M.Default" to { TextField.M.Default.style() },
            "M.Error" to { TextField.M.Error.style() },
            "M.OuterLabel.Default" to { TextField.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to { TextField.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to { TextField.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to { TextField.M.InnerLabel.Error.style() },
        )
}
