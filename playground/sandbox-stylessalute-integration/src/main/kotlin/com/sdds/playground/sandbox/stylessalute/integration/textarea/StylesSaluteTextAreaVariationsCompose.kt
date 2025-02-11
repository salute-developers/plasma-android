package com.sdds.playground.sandbox.stylessalute.integration.textarea

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.textarea.Default
import com.sdds.stylessalute.styles.textarea.Error
import com.sdds.stylessalute.styles.textarea.InnerLabel
import com.sdds.stylessalute.styles.textarea.L
import com.sdds.stylessalute.styles.textarea.M
import com.sdds.stylessalute.styles.textarea.OuterLabel
import com.sdds.stylessalute.styles.textarea.RequiredEnd
import com.sdds.stylessalute.styles.textarea.RequiredStart
import com.sdds.stylessalute.styles.textarea.S
import com.sdds.stylessalute.styles.textarea.Warning
import com.sdds.stylessalute.styles.textarea.Xs

internal object StylesSaluteTextAreaVariationsCompose :
    ComposeStyleProvider<String, TextFieldStyle>() {

    override val variations: Map<String, @Composable () -> TextFieldStyle> = mapOf(
        "LDefault" to { TextArea.L.Default.style() },
        "LRequiredStartDefault" to { TextArea.L.RequiredStart.Default.style() },
        "LRequiredEndDefault" to { TextArea.L.RequiredEnd.Default.style() },
        "LOuterLabelDefault" to { TextArea.L.OuterLabel.Default.style() },
        "LOuterLabelRequiredStartDefault" to { TextArea.L.OuterLabel.RequiredStart.Default.style() },
        "LOuterLabelRequiredEndDefault" to { TextArea.L.OuterLabel.RequiredEnd.Default.style() },
        "LInnerLabelDefault" to { TextArea.L.InnerLabel.Default.style() },
        "LInnerLabelRequiredStartDefault" to { TextArea.L.InnerLabel.RequiredStart.Default.style() },
        "LInnerLabelRequiredEndDefault" to { TextArea.L.InnerLabel.RequiredEnd.Default.style() },
        "MDefault" to { TextArea.M.Default.style() },
        "MRequiredStartDefault" to { TextArea.M.RequiredStart.Default.style() },
        "MRequiredEndDefault" to { TextArea.M.RequiredEnd.Default.style() },
        "MOuterLabelDefault" to { TextArea.M.OuterLabel.Default.style() },
        "MOuterLabelRequiredStartDefault" to { TextArea.M.OuterLabel.RequiredStart.Default.style() },
        "MOuterLabelRequiredEndDefault" to { TextArea.M.OuterLabel.RequiredEnd.Default.style() },
        "MInnerLabelDefault" to { TextArea.M.InnerLabel.Default.style() },
        "MInnerLabelRequiredStartDefault" to { TextArea.M.InnerLabel.RequiredStart.Default.style() },
        "MInnerLabelRequiredEndDefault" to { TextArea.M.InnerLabel.RequiredEnd.Default.style() },
        "SDefault" to { TextArea.S.Default.style() },
        "SRequiredStartDefault" to { TextArea.S.RequiredStart.Default.style() },
        "SRequiredEndDefault" to { TextArea.S.RequiredEnd.Default.style() },
        "SOuterLabelDefault" to { TextArea.S.OuterLabel.Default.style() },
        "SOuterLabelRequiredStartDefault" to { TextArea.S.OuterLabel.RequiredStart.Default.style() },
        "SOuterLabelRequiredEndDefault" to { TextArea.S.OuterLabel.RequiredEnd.Default.style() },
        "SInnerLabelDefault" to { TextArea.S.InnerLabel.Default.style() },
        "SInnerLabelRequiredStartDefault" to { TextArea.S.InnerLabel.RequiredStart.Default.style() },
        "SInnerLabelRequiredEndDefault" to { TextArea.S.InnerLabel.RequiredEnd.Default.style() },
        "XSDefault" to { TextArea.Xs.Default.style() },
        "XSRequiredStartDefault" to { TextArea.Xs.RequiredStart.Default.style() },
        "XSRequiredEndDefault" to { TextArea.Xs.RequiredEnd.Default.style() },
        "XSOuterLabelDefault" to { TextArea.Xs.OuterLabel.Default.style() },
        "XSOuterLabelRequiredStartDefault" to { TextArea.Xs.OuterLabel.RequiredStart.Default.style() },
        "XSOuterLabelRequiredEndDefault" to { TextArea.Xs.OuterLabel.RequiredEnd.Default.style() },

        "LWarning" to { TextArea.L.Warning.style() },
        "LRequiredStartWarning" to { TextArea.L.RequiredStart.Warning.style() },
        "LRequiredEndWarning" to { TextArea.L.RequiredEnd.Warning.style() },
        "LOuterLabelWarning" to { TextArea.L.OuterLabel.Warning.style() },
        "LOuterLabelRequiredStartWarning" to { TextArea.L.OuterLabel.RequiredStart.Warning.style() },
        "LOuterLabelRequiredEndWarning" to { TextArea.L.OuterLabel.RequiredEnd.Warning.style() },
        "LInnerLabelWarning" to { TextArea.L.InnerLabel.Warning.style() },
        "LInnerLabelRequiredStartWarning" to { TextArea.L.InnerLabel.RequiredStart.Warning.style() },
        "LInnerLabelRequiredEndWarning" to { TextArea.L.InnerLabel.RequiredEnd.Warning.style() },
        "MWarning" to { TextArea.M.Warning.style() },
        "MRequiredStartWarning" to { TextArea.M.RequiredStart.Warning.style() },
        "MRequiredEndWarning" to { TextArea.M.RequiredEnd.Warning.style() },
        "MOuterLabelWarning" to { TextArea.M.OuterLabel.Warning.style() },
        "MOuterLabelRequiredStartWarning" to { TextArea.M.OuterLabel.RequiredStart.Warning.style() },
        "MOuterLabelRequiredEndWarning" to { TextArea.M.OuterLabel.RequiredEnd.Warning.style() },
        "MInnerLabelWarning" to { TextArea.M.InnerLabel.Warning.style() },
        "MInnerLabelRequiredStartWarning" to { TextArea.M.InnerLabel.RequiredStart.Warning.style() },
        "MInnerLabelRequiredEndWarning" to { TextArea.M.InnerLabel.RequiredEnd.Warning.style() },
        "SWarning" to { TextArea.S.Warning.style() },
        "SRequiredStartWarning" to { TextArea.S.RequiredStart.Warning.style() },
        "SRequiredEndWarning" to { TextArea.S.RequiredEnd.Warning.style() },
        "SOuterLabelWarning" to { TextArea.S.OuterLabel.Warning.style() },
        "SOuterLabelRequiredStartWarning" to { TextArea.S.OuterLabel.RequiredStart.Warning.style() },
        "SOuterLabelRequiredEndWarning" to { TextArea.S.OuterLabel.RequiredEnd.Warning.style() },
        "SInnerLabelWarning" to { TextArea.S.InnerLabel.Warning.style() },
        "SInnerLabelRequiredStartWarning" to { TextArea.S.InnerLabel.RequiredStart.Warning.style() },
        "SInnerLabelRequiredEndWarning" to { TextArea.S.InnerLabel.RequiredEnd.Warning.style() },
        "XSWarning" to { TextArea.Xs.Warning.style() },
        "XSRequiredStartWarning" to { TextArea.Xs.RequiredStart.Warning.style() },
        "XSRequiredEndWarning" to { TextArea.Xs.RequiredEnd.Warning.style() },
        "XSOuterLabelWarning" to { TextArea.Xs.OuterLabel.Warning.style() },
        "XSOuterLabelRequiredStartWarning" to { TextArea.Xs.OuterLabel.RequiredStart.Warning.style() },
        "XSOuterLabelRequiredEndWarning" to { TextArea.Xs.OuterLabel.RequiredEnd.Warning.style() },

        "LError" to { TextArea.L.Error.style() },
        "LRequiredStartError" to { TextArea.L.RequiredStart.Error.style() },
        "LRequiredEndError" to { TextArea.L.RequiredEnd.Error.style() },
        "LOuterLabelError" to { TextArea.L.OuterLabel.Error.style() },
        "LOuterLabelRequiredStartError" to { TextArea.L.OuterLabel.RequiredStart.Error.style() },
        "LOuterLabelRequiredEndError" to { TextArea.L.OuterLabel.RequiredEnd.Error.style() },
        "LInnerLabelError" to { TextArea.L.InnerLabel.Error.style() },
        "LInnerLabelRequiredStartError" to { TextArea.L.InnerLabel.RequiredStart.Error.style() },
        "LInnerLabelRequiredEndError" to { TextArea.L.InnerLabel.RequiredEnd.Error.style() },
        "MError" to { TextArea.M.Error.style() },
        "MRequiredStartError" to { TextArea.M.RequiredStart.Error.style() },
        "MRequiredEndError" to { TextArea.M.RequiredEnd.Error.style() },
        "MOuterLabelError" to { TextArea.M.OuterLabel.Error.style() },
        "MOuterLabelRequiredStartError" to { TextArea.M.OuterLabel.RequiredStart.Error.style() },
        "MOuterLabelRequiredEndError" to { TextArea.M.OuterLabel.RequiredEnd.Error.style() },
        "MInnerLabelError" to { TextArea.M.InnerLabel.Error.style() },
        "MInnerLabelRequiredStartError" to { TextArea.M.InnerLabel.RequiredStart.Error.style() },
        "MInnerLabelRequiredEndError" to { TextArea.M.InnerLabel.RequiredEnd.Error.style() },
        "SError" to { TextArea.S.Error.style() },
        "SRequiredStartError" to { TextArea.S.RequiredStart.Error.style() },
        "SRequiredEndError" to { TextArea.S.RequiredEnd.Error.style() },
        "SOuterLabelError" to { TextArea.S.OuterLabel.Error.style() },
        "SOuterLabelRequiredStartError" to { TextArea.S.OuterLabel.RequiredStart.Error.style() },
        "SOuterLabelRequiredEndError" to { TextArea.S.OuterLabel.RequiredEnd.Error.style() },
        "SInnerLabelError" to { TextArea.S.InnerLabel.Error.style() },
        "SInnerLabelRequiredStartError" to { TextArea.S.InnerLabel.RequiredStart.Error.style() },
        "SInnerLabelRequiredEndError" to { TextArea.S.InnerLabel.RequiredEnd.Error.style() },
        "XSError" to { TextArea.Xs.Error.style() },
        "XSRequiredStartError" to { TextArea.Xs.RequiredStart.Error.style() },
        "XSRequiredEndError" to { TextArea.Xs.RequiredEnd.Error.style() },
        "XSOuterLabelError" to { TextArea.Xs.OuterLabel.Error.style() },
        "XSOuterLabelRequiredStartError" to { TextArea.Xs.OuterLabel.RequiredStart.Error.style() },
        "XSOuterLabelRequiredEndError" to { TextArea.Xs.OuterLabel.RequiredEnd.Error.style() },
    )
}
