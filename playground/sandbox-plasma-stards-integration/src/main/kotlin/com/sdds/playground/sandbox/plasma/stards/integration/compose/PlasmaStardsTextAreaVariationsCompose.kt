package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextArea
import com.sdkit.star.designsystem.styles.textarea.Xs

internal object PlasmaStardsTextAreaVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Xs.Default" to { TextArea.Xs.Default.style() },
            "Xs.Error" to { TextArea.Xs.Error.style() },
            "Xs.OuterLabel.Default" to { TextArea.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to { TextArea.Xs.OuterLabel.Error.style() },
            "S.Default" to { TextArea.S.Default.style() },
            "S.Error" to { TextArea.S.Error.style() },
            "S.OuterLabel.Default" to { TextArea.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to { TextArea.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to { TextArea.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to { TextArea.S.InnerLabel.Error.style() },
            "M.Default" to { TextArea.M.Default.style() },
            "M.Error" to { TextArea.M.Error.style() },
            "M.OuterLabel.Default" to { TextArea.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to { TextArea.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to { TextArea.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to { TextArea.M.InnerLabel.Error.style() },
        )
}
