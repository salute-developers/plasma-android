package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.L
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextAreaClear
import com.sdkit.star.designsystem.styles.textarea.Xs

internal object PlasmaStardsTextAreaClearVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Xs.Default" to { TextAreaClear.Xs.Default.style() },
            "Xs.Error" to { TextAreaClear.Xs.Error.style() },
            "Xs.OuterLabel.Default" to { TextAreaClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to { TextAreaClear.Xs.OuterLabel.Error.style() },
            "S.Default" to { TextAreaClear.S.Default.style() },
            "S.Error" to { TextAreaClear.S.Error.style() },
            "S.OuterLabel.Default" to { TextAreaClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to { TextAreaClear.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to { TextAreaClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to { TextAreaClear.S.InnerLabel.Error.style() },
            "M.Default" to { TextAreaClear.M.Default.style() },
            "M.Error" to { TextAreaClear.M.Error.style() },
            "M.OuterLabel.Default" to { TextAreaClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to { TextAreaClear.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to { TextAreaClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to { TextAreaClear.M.InnerLabel.Error.style() },
            "L.Default" to { TextAreaClear.L.Default.style() },
            "L.Error" to { TextAreaClear.L.Error.style() },
            "L.OuterLabel.Default" to { TextAreaClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Error" to { TextAreaClear.L.OuterLabel.Error.style() },
            "L.InnerLabel.Default" to { TextAreaClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Error" to { TextAreaClear.L.InnerLabel.Error.style() },
        )
}
