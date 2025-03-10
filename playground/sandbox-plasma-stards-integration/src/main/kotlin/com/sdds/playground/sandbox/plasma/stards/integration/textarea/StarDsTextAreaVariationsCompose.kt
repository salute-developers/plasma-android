package com.sdds.playground.sandbox.plasma.stards.integration.textarea

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.Xs

internal object StarDsTextAreaVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {

    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "MDefault" to { TextArea.M.Default.style() },
            "MOuterLabelDefault" to { TextArea.M.OuterLabel.Default.style() },
            "MInnerLabelDefault" to { TextArea.M.InnerLabel.Default.style() },
            "SDefault" to { TextArea.S.Default.style() },
            "SOuterLabelDefault" to { TextArea.S.OuterLabel.Default.style() },
            "SInnerLabelDefault" to { TextArea.S.InnerLabel.Default.style() },
            "XSDefault" to { TextArea.Xs.Default.style() },
            "XSOuterLabelDefault" to { TextArea.Xs.OuterLabel.Default.style() },

            "MError" to { TextArea.M.Error.style() },
            "MOuterLabelError" to { TextArea.M.OuterLabel.Error.style() },
            "MInnerLabelError" to { TextArea.M.InnerLabel.Error.style() },
            "SError" to { TextArea.S.Error.style() },
            "SOuterLabelError" to { TextArea.S.OuterLabel.Error.style() },
            "SInnerLabelError" to { TextArea.S.InnerLabel.Error.style() },
            "XSError" to { TextArea.Xs.Error.style() },
            "XSOuterLabelError" to { TextArea.Xs.OuterLabel.Error.style() },
        )
}
