package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
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
import com.sdds.stylessalute.styles.textarea.TextAreaClear
import com.sdds.stylessalute.styles.textarea.Warning
import com.sdds.stylessalute.styles.textarea.Xs

internal object StylesSaluteTextAreaClearVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Xs.Default" to { TextAreaClear.Xs.Default.style() },
            "Xs.Warning" to { TextAreaClear.Xs.Warning.style() },
            "Xs.Error" to { TextAreaClear.Xs.Error.style() },
            "Xs.RequiredStart.Default" to { TextAreaClear.Xs.RequiredStart.Default.style() },
            "Xs.RequiredStart.Warning" to { TextAreaClear.Xs.RequiredStart.Warning.style() },
            "Xs.RequiredStart.Error" to { TextAreaClear.Xs.RequiredStart.Error.style() },
            "Xs.RequiredEnd.Default" to { TextAreaClear.Xs.RequiredEnd.Default.style() },
            "Xs.RequiredEnd.Warning" to { TextAreaClear.Xs.RequiredEnd.Warning.style() },
            "Xs.RequiredEnd.Error" to { TextAreaClear.Xs.RequiredEnd.Error.style() },
            "Xs.OuterLabel.Default" to { TextAreaClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Warning" to { TextAreaClear.Xs.OuterLabel.Warning.style() },
            "Xs.OuterLabel.Error" to { TextAreaClear.Xs.OuterLabel.Error.style() },
            "Xs.OuterLabel.RequiredStart.Default" to { TextAreaClear.Xs.OuterLabel.RequiredStart.Default.style() },
            "Xs.OuterLabel.RequiredStart.Warning" to { TextAreaClear.Xs.OuterLabel.RequiredStart.Warning.style() },
            "Xs.OuterLabel.RequiredStart.Error" to { TextAreaClear.Xs.OuterLabel.RequiredStart.Error.style() },
            "Xs.OuterLabel.RequiredEnd.Default" to { TextAreaClear.Xs.OuterLabel.RequiredEnd.Default.style() },
            "Xs.OuterLabel.RequiredEnd.Warning" to { TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning.style() },
            "Xs.OuterLabel.RequiredEnd.Error" to { TextAreaClear.Xs.OuterLabel.RequiredEnd.Error.style() },
            "S.Default" to { TextAreaClear.S.Default.style() },
            "S.Warning" to { TextAreaClear.S.Warning.style() },
            "S.Error" to { TextAreaClear.S.Error.style() },
            "S.RequiredStart.Default" to { TextAreaClear.S.RequiredStart.Default.style() },
            "S.RequiredStart.Warning" to { TextAreaClear.S.RequiredStart.Warning.style() },
            "S.RequiredStart.Error" to { TextAreaClear.S.RequiredStart.Error.style() },
            "S.RequiredEnd.Default" to { TextAreaClear.S.RequiredEnd.Default.style() },
            "S.RequiredEnd.Warning" to { TextAreaClear.S.RequiredEnd.Warning.style() },
            "S.RequiredEnd.Error" to { TextAreaClear.S.RequiredEnd.Error.style() },
            "S.OuterLabel.Default" to { TextAreaClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Warning" to { TextAreaClear.S.OuterLabel.Warning.style() },
            "S.OuterLabel.Error" to { TextAreaClear.S.OuterLabel.Error.style() },
            "S.OuterLabel.RequiredStart.Default" to { TextAreaClear.S.OuterLabel.RequiredStart.Default.style() },
            "S.OuterLabel.RequiredStart.Warning" to { TextAreaClear.S.OuterLabel.RequiredStart.Warning.style() },
            "S.OuterLabel.RequiredStart.Error" to { TextAreaClear.S.OuterLabel.RequiredStart.Error.style() },
            "S.OuterLabel.RequiredEnd.Default" to { TextAreaClear.S.OuterLabel.RequiredEnd.Default.style() },
            "S.OuterLabel.RequiredEnd.Warning" to { TextAreaClear.S.OuterLabel.RequiredEnd.Warning.style() },
            "S.OuterLabel.RequiredEnd.Error" to { TextAreaClear.S.OuterLabel.RequiredEnd.Error.style() },
            "S.InnerLabel.Default" to { TextAreaClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Warning" to { TextAreaClear.S.InnerLabel.Warning.style() },
            "S.InnerLabel.Error" to { TextAreaClear.S.InnerLabel.Error.style() },
            "S.InnerLabel.RequiredStart.Default" to { TextAreaClear.S.InnerLabel.RequiredStart.Default.style() },
            "S.InnerLabel.RequiredStart.Warning" to { TextAreaClear.S.InnerLabel.RequiredStart.Warning.style() },
            "S.InnerLabel.RequiredStart.Error" to { TextAreaClear.S.InnerLabel.RequiredStart.Error.style() },
            "S.InnerLabel.RequiredEnd.Default" to { TextAreaClear.S.InnerLabel.RequiredEnd.Default.style() },
            "S.InnerLabel.RequiredEnd.Warning" to { TextAreaClear.S.InnerLabel.RequiredEnd.Warning.style() },
            "S.InnerLabel.RequiredEnd.Error" to { TextAreaClear.S.InnerLabel.RequiredEnd.Error.style() },
            "M.Default" to { TextAreaClear.M.Default.style() },
            "M.Warning" to { TextAreaClear.M.Warning.style() },
            "M.Error" to { TextAreaClear.M.Error.style() },
            "M.RequiredStart.Default" to { TextAreaClear.M.RequiredStart.Default.style() },
            "M.RequiredStart.Warning" to { TextAreaClear.M.RequiredStart.Warning.style() },
            "M.RequiredStart.Error" to { TextAreaClear.M.RequiredStart.Error.style() },
            "M.RequiredEnd.Default" to { TextAreaClear.M.RequiredEnd.Default.style() },
            "M.RequiredEnd.Warning" to { TextAreaClear.M.RequiredEnd.Warning.style() },
            "M.RequiredEnd.Error" to { TextAreaClear.M.RequiredEnd.Error.style() },
            "M.OuterLabel.Default" to { TextAreaClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Warning" to { TextAreaClear.M.OuterLabel.Warning.style() },
            "M.OuterLabel.Error" to { TextAreaClear.M.OuterLabel.Error.style() },
            "M.OuterLabel.RequiredStart.Default" to { TextAreaClear.M.OuterLabel.RequiredStart.Default.style() },
            "M.OuterLabel.RequiredStart.Warning" to { TextAreaClear.M.OuterLabel.RequiredStart.Warning.style() },
            "M.OuterLabel.RequiredStart.Error" to { TextAreaClear.M.OuterLabel.RequiredStart.Error.style() },
            "M.OuterLabel.RequiredEnd.Default" to { TextAreaClear.M.OuterLabel.RequiredEnd.Default.style() },
            "M.OuterLabel.RequiredEnd.Warning" to { TextAreaClear.M.OuterLabel.RequiredEnd.Warning.style() },
            "M.OuterLabel.RequiredEnd.Error" to { TextAreaClear.M.OuterLabel.RequiredEnd.Error.style() },
            "M.InnerLabel.Default" to { TextAreaClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Warning" to { TextAreaClear.M.InnerLabel.Warning.style() },
            "M.InnerLabel.Error" to { TextAreaClear.M.InnerLabel.Error.style() },
            "M.InnerLabel.RequiredStart.Default" to { TextAreaClear.M.InnerLabel.RequiredStart.Default.style() },
            "M.InnerLabel.RequiredStart.Warning" to { TextAreaClear.M.InnerLabel.RequiredStart.Warning.style() },
            "M.InnerLabel.RequiredStart.Error" to { TextAreaClear.M.InnerLabel.RequiredStart.Error.style() },
            "M.InnerLabel.RequiredEnd.Default" to { TextAreaClear.M.InnerLabel.RequiredEnd.Default.style() },
            "M.InnerLabel.RequiredEnd.Warning" to { TextAreaClear.M.InnerLabel.RequiredEnd.Warning.style() },
            "M.InnerLabel.RequiredEnd.Error" to { TextAreaClear.M.InnerLabel.RequiredEnd.Error.style() },
            "L.Default" to { TextAreaClear.L.Default.style() },
            "L.Warning" to { TextAreaClear.L.Warning.style() },
            "L.Error" to { TextAreaClear.L.Error.style() },
            "L.RequiredStart.Default" to { TextAreaClear.L.RequiredStart.Default.style() },
            "L.RequiredStart.Warning" to { TextAreaClear.L.RequiredStart.Warning.style() },
            "L.RequiredStart.Error" to { TextAreaClear.L.RequiredStart.Error.style() },
            "L.RequiredEnd.Default" to { TextAreaClear.L.RequiredEnd.Default.style() },
            "L.RequiredEnd.Warning" to { TextAreaClear.L.RequiredEnd.Warning.style() },
            "L.RequiredEnd.Error" to { TextAreaClear.L.RequiredEnd.Error.style() },
            "L.OuterLabel.Default" to { TextAreaClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Warning" to { TextAreaClear.L.OuterLabel.Warning.style() },
            "L.OuterLabel.Error" to { TextAreaClear.L.OuterLabel.Error.style() },
            "L.OuterLabel.RequiredStart.Default" to { TextAreaClear.L.OuterLabel.RequiredStart.Default.style() },
            "L.OuterLabel.RequiredStart.Warning" to { TextAreaClear.L.OuterLabel.RequiredStart.Warning.style() },
            "L.OuterLabel.RequiredStart.Error" to { TextAreaClear.L.OuterLabel.RequiredStart.Error.style() },
            "L.OuterLabel.RequiredEnd.Default" to { TextAreaClear.L.OuterLabel.RequiredEnd.Default.style() },
            "L.OuterLabel.RequiredEnd.Warning" to { TextAreaClear.L.OuterLabel.RequiredEnd.Warning.style() },
            "L.OuterLabel.RequiredEnd.Error" to { TextAreaClear.L.OuterLabel.RequiredEnd.Error.style() },
            "L.InnerLabel.Default" to { TextAreaClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Warning" to { TextAreaClear.L.InnerLabel.Warning.style() },
            "L.InnerLabel.Error" to { TextAreaClear.L.InnerLabel.Error.style() },
            "L.InnerLabel.RequiredStart.Default" to { TextAreaClear.L.InnerLabel.RequiredStart.Default.style() },
            "L.InnerLabel.RequiredStart.Warning" to { TextAreaClear.L.InnerLabel.RequiredStart.Warning.style() },
            "L.InnerLabel.RequiredStart.Error" to { TextAreaClear.L.InnerLabel.RequiredStart.Error.style() },
            "L.InnerLabel.RequiredEnd.Default" to { TextAreaClear.L.InnerLabel.RequiredEnd.Default.style() },
            "L.InnerLabel.RequiredEnd.Warning" to { TextAreaClear.L.InnerLabel.RequiredEnd.Warning.style() },
            "L.InnerLabel.RequiredEnd.Error" to { TextAreaClear.L.InnerLabel.RequiredEnd.Error.style() },
        )
}
