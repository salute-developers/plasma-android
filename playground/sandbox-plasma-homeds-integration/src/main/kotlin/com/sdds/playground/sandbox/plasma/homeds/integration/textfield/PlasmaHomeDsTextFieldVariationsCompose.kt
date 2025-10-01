package com.sdds.playground.sandbox.plasma.homeds.integration.textfield

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textfield.Default
import com.sdds.plasma.homeds.styles.textfield.Error
import com.sdds.plasma.homeds.styles.textfield.InnerLabel
import com.sdds.plasma.homeds.styles.textfield.L
import com.sdds.plasma.homeds.styles.textfield.M
import com.sdds.plasma.homeds.styles.textfield.RequiredEnd
import com.sdds.plasma.homeds.styles.textfield.RequiredStart
import com.sdds.plasma.homeds.styles.textfield.S
import com.sdds.plasma.homeds.styles.textfield.TextField
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsTextFieldVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle>
        get() = mapOf<String, @Composable () -> TextFieldStyle>(
            "LDefault" to ({ TextField.L.Default.style() }),
            "LRequiredStartDefault" to ({ TextField.L.RequiredStart.Default.style() }),
            "LRequiredEndDefault" to ({ TextField.L.RequiredEnd.Default.style() }),
            "LInnerLabelDefault" to ({ TextField.L.InnerLabel.Default.style() }),
            "LInnerLabelRequiredStartDefault" to ({ TextField.L.InnerLabel.RequiredStart.Default.style() }),
            "LInnerLabelRequiredEndDefault" to ({ TextField.L.InnerLabel.RequiredEnd.Default.style() }),
            "MDefault" to ({ TextField.M.Default.style() }),
            "MRequiredStartDefault" to ({ TextField.M.RequiredStart.Default.style() }),
            "MRequiredEndDefault" to ({ TextField.M.RequiredEnd.Default.style() }),
            "MInnerLabelDefault" to ({ TextField.M.InnerLabel.Default.style() }),
            "MInnerLabelRequiredStartDefault" to ({ TextField.M.InnerLabel.RequiredStart.Default.style() }),
            "MInnerLabelRequiredEndDefault" to ({ TextField.M.InnerLabel.RequiredEnd.Default.style() }),
            "SDefault" to ({ TextField.S.Default.style() }),
            "SRequiredStartDefault" to ({ TextField.S.RequiredStart.Default.style() }),
            "SRequiredEndDefault" to ({ TextField.S.RequiredEnd.Default.style() }),
            "SInnerLabelDefault" to ({ TextField.S.InnerLabel.Default.style() }),
            "SInnerLabelRequiredStartDefault" to ({ TextField.S.InnerLabel.RequiredStart.Default.style() }),
            "SInnerLabelRequiredEndDefault" to ({ TextField.S.InnerLabel.RequiredEnd.Default.style() }),

            "LError" to ({ TextField.L.Error.style() }),
            "LRequiredStartError" to ({ TextField.L.RequiredStart.Error.style() }),
            "LRequiredEndError" to ({ TextField.L.RequiredEnd.Error.style() }),
            "LInnerLabelError" to ({ TextField.L.InnerLabel.Error.style() }),
            "LInnerLabelRequiredStartError" to ({ TextField.L.InnerLabel.RequiredStart.Error.style() }),
            "LInnerLabelRequiredEndError" to ({ TextField.L.InnerLabel.RequiredEnd.Error.style() }),
            "MError" to ({ TextField.M.Error.style() }),
            "MRequiredStartError" to ({ TextField.M.RequiredStart.Error.style() }),
            "MRequiredEndError" to ({ TextField.M.RequiredEnd.Error.style() }),
            "MInnerLabelError" to ({ TextField.M.InnerLabel.Error.style() }),
            "MInnerLabelRequiredStartError" to ({ TextField.M.InnerLabel.RequiredStart.Error.style() }),
            "MInnerLabelRequiredEndError" to ({ TextField.M.InnerLabel.RequiredEnd.Error.style() }),
            "SError" to ({ TextField.S.Error.style() }),
            "SRequiredStartError" to ({ TextField.S.RequiredStart.Error.style() }),
            "SRequiredEndError" to ({ TextField.S.RequiredEnd.Error.style() }),
            "SInnerLabelError" to ({ TextField.S.InnerLabel.Error.style() }),
            "SInnerLabelRequiredStartError" to ({ TextField.S.InnerLabel.RequiredStart.Error.style() }),
            "SInnerLabelRequiredEndError" to ({ TextField.S.InnerLabel.RequiredEnd.Error.style() }),
        )
}
