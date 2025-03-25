package com.sdds.playground.sandbox.plasma.stards.integration.textarea.clear

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textarea.clear.Default
import com.sdkit.star.designsystem.styles.textarea.clear.Error
import com.sdkit.star.designsystem.styles.textarea.clear.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.clear.L
import com.sdkit.star.designsystem.styles.textarea.clear.M
import com.sdkit.star.designsystem.styles.textarea.clear.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.clear.S
import com.sdkit.star.designsystem.styles.textarea.clear.TextAreaClear
import com.sdkit.star.designsystem.styles.textarea.clear.Xs

internal object StarDsTextAreaClearVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {

    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "LDefault" to { TextAreaClear.L.Default.style() },
            "LOuterLabelDefault" to { TextAreaClear.L.OuterLabel.Default.style() },
            "LInnerLabelDefault" to { TextAreaClear.L.InnerLabel.Default.style() },
            "MDefault" to { TextAreaClear.M.Default.style() },
            "MOuterLabelDefault" to { TextAreaClear.M.OuterLabel.Default.style() },
            "MInnerLabelDefault" to { TextAreaClear.M.InnerLabel.Default.style() },
            "SDefault" to { TextAreaClear.S.Default.style() },
            "SOuterLabelDefault" to { TextAreaClear.S.OuterLabel.Default.style() },
            "SInnerLabelDefault" to { TextAreaClear.S.InnerLabel.Default.style() },
            "XSDefault" to { TextAreaClear.Xs.Default.style() },
            "XSOuterLabelDefault" to { TextAreaClear.Xs.OuterLabel.Default.style() },

            "LError" to { TextAreaClear.L.Error.style() },
            "LOuterLabelError" to { TextAreaClear.L.OuterLabel.Error.style() },
            "LInnerLabelError" to { TextAreaClear.L.InnerLabel.Error.style() },
            "MError" to { TextAreaClear.M.Error.style() },
            "MOuterLabelError" to { TextAreaClear.M.OuterLabel.Error.style() },
            "MInnerLabelError" to { TextAreaClear.M.InnerLabel.Error.style() },
            "SError" to { TextAreaClear.S.Error.style() },
            "SOuterLabelError" to { TextAreaClear.S.OuterLabel.Error.style() },
            "SInnerLabelError" to { TextAreaClear.S.InnerLabel.Error.style() },
            "XSError" to { TextAreaClear.Xs.Error.style() },
            "XSOuterLabelError" to { TextAreaClear.Xs.OuterLabel.Error.style() },
        )
}
