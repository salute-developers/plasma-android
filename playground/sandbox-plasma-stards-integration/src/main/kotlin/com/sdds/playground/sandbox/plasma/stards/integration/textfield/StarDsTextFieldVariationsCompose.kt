package com.sdds.playground.sandbox.plasma.stards.integration.textfield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.Xs

internal object StarDsTextFieldVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle>
        get() = mapOf<String, @Composable () -> TextFieldStyle>(
            "MDefault" to ({ TextField.M.Default.style() }),
            "MOuterLabelDefault" to ({ TextField.M.OuterLabel.Default.style() }),
            "MInnerLabelDefault" to ({ TextField.M.InnerLabel.Default.style() }),
            "SDefault" to ({ TextField.S.Default.style() }),
            "SOuterLabelDefault" to ({ TextField.S.OuterLabel.Default.style() }),
            "SInnerLabelDefault" to ({ TextField.S.InnerLabel.Default.style() }),
            "XSDefault" to ({ TextField.Xs.Default.style() }),
            "XSOuterLabelDefault" to ({ TextField.Xs.OuterLabel.Default.style() }),

            "MError" to ({ TextField.M.Error.style() }),
            "MOuterLabelError" to ({ TextField.M.OuterLabel.Error.style() }),
            "MInnerLabelError" to ({ TextField.M.InnerLabel.Error.style() }),
            "SError" to ({ TextField.S.Error.style() }),
            "SOuterLabelError" to ({ TextField.S.OuterLabel.Error.style() }),
            "SInnerLabelError" to ({ TextField.S.InnerLabel.Error.style() }),
            "XSError" to ({ TextField.Xs.Error.style() }),
            "XSOuterLabelError" to ({ TextField.Xs.OuterLabel.Error.style() }),
        )
}
