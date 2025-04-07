package com.sdds.playground.sandbox.plasma.stards.integration.textfield.clear

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

internal object StarDsTextFieldClearVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {

    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "LDefault" to { TextFieldClear.L.Default.style() },
            "LOuterLabelDefault" to { TextFieldClear.L.OuterLabel.Default.style() },
            "LInnerLabelDefault" to { TextFieldClear.L.InnerLabel.Default.style() },
            "MDefault" to { TextFieldClear.M.Default.style() },
            "MOuterLabelDefault" to { TextFieldClear.M.OuterLabel.Default.style() },
            "MInnerLabelDefault" to { TextFieldClear.M.InnerLabel.Default.style() },
            "SDefault" to { TextFieldClear.S.Default.style() },
            "SOuterLabelDefault" to { TextFieldClear.S.OuterLabel.Default.style() },
            "SInnerLabelDefault" to { TextFieldClear.S.InnerLabel.Default.style() },
            "XSDefault" to { TextFieldClear.Xs.Default.style() },
            "XSOuterLabelDefault" to { TextFieldClear.Xs.OuterLabel.Default.style() },

            "LError" to { TextFieldClear.L.Error.style() },
            "LOuterLabelError" to { TextFieldClear.L.OuterLabel.Error.style() },
            "LInnerLabelError" to { TextFieldClear.L.InnerLabel.Error.style() },
            "MError" to { TextFieldClear.M.Error.style() },
            "MOuterLabelError" to { TextFieldClear.M.OuterLabel.Error.style() },
            "MInnerLabelError" to { TextFieldClear.M.InnerLabel.Error.style() },
            "SError" to { TextFieldClear.S.Error.style() },
            "SOuterLabelError" to { TextFieldClear.S.OuterLabel.Error.style() },
            "SInnerLabelError" to { TextFieldClear.S.InnerLabel.Error.style() },
            "XSError" to { TextFieldClear.Xs.Error.style() },
            "XSOuterLabelError" to { TextFieldClear.Xs.OuterLabel.Error.style() },
        )
}
