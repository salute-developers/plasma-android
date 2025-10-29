package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.L
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextFieldClear
import com.sdkit.star.designsystem.styles.textfield.Xs

internal object PlasmaStardsTextFieldClearVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Xs.Default" to { TextFieldClear.Xs.Default.style() },
            "Xs.Error" to { TextFieldClear.Xs.Error.style() },
            "Xs.OuterLabel.Default" to { TextFieldClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to { TextFieldClear.Xs.OuterLabel.Error.style() },
            "S.Default" to { TextFieldClear.S.Default.style() },
            "S.Error" to { TextFieldClear.S.Error.style() },
            "S.OuterLabel.Default" to { TextFieldClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to { TextFieldClear.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to { TextFieldClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to { TextFieldClear.S.InnerLabel.Error.style() },
            "M.Default" to { TextFieldClear.M.Default.style() },
            "M.Error" to { TextFieldClear.M.Error.style() },
            "M.OuterLabel.Default" to { TextFieldClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to { TextFieldClear.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to { TextFieldClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to { TextFieldClear.M.InnerLabel.Error.style() },
            "L.Default" to { TextFieldClear.L.Default.style() },
            "L.Error" to { TextFieldClear.L.Error.style() },
            "L.OuterLabel.Default" to { TextFieldClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Error" to { TextFieldClear.L.OuterLabel.Error.style() },
            "L.InnerLabel.Default" to { TextFieldClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Error" to { TextFieldClear.L.InnerLabel.Error.style() },
        )
}
