// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.Error
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.L
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.RequiredEnd
import com.sdds.serv.styles.textarea.RequiredStart
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.TextAreaClear
import com.sdds.serv.styles.textarea.Warning
import com.sdds.serv.styles.textarea.Xl
import com.sdds.serv.styles.textarea.Xs

internal object SddsServTextAreaClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextAreaClear.Xs.Default.style() },
            "Xs.Warning" to ComposeStyleReference { TextAreaClear.Xs.Warning.style() },
            "Xs.Error" to ComposeStyleReference { TextAreaClear.Xs.Error.style() },
            "Xs.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Default.style() },
            "Xs.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Warning.style() },
            "Xs.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Error.style() },
            "Xs.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Default.style() },
            "Xs.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Warning.style() },
            "Xs.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Warning.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Error.style() },
            "Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Error.style()
            },
            "Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredEnd.Default.style()
            },
            "Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning.style()
            },
            "Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.RequiredEnd.Error.style() },
            "S.Default" to ComposeStyleReference { TextAreaClear.S.Default.style() },
            "S.Warning" to ComposeStyleReference { TextAreaClear.S.Warning.style() },
            "S.Error" to ComposeStyleReference { TextAreaClear.S.Error.style() },
            "S.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Default.style() },
            "S.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Warning.style() },
            "S.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Error.style() },
            "S.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Default.style() },
            "S.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Warning.style() },
            "S.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Warning.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Error.style() },
            "S.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredStart.Default.style()
            },
            "S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredStart.Warning.style()
            },
            "S.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.RequiredStart.Error.style() },
            "S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.S.OuterLabel.RequiredEnd.Default.style() },
            "S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.S.OuterLabel.RequiredEnd.Warning.style() },
            "S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.RequiredEnd.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Warning.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Error.style() },
            "S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredStart.Default.style()
            },
            "S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredStart.Warning.style()
            },
            "S.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.RequiredStart.Error.style() },
            "S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.S.InnerLabel.RequiredEnd.Default.style() },
            "S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.S.InnerLabel.RequiredEnd.Warning.style() },
            "S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.RequiredEnd.Error.style() },
            "M.Default" to ComposeStyleReference { TextAreaClear.M.Default.style() },
            "M.Warning" to ComposeStyleReference { TextAreaClear.M.Warning.style() },
            "M.Error" to ComposeStyleReference { TextAreaClear.M.Error.style() },
            "M.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Default.style() },
            "M.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Warning.style() },
            "M.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Error.style() },
            "M.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Default.style() },
            "M.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Warning.style() },
            "M.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Warning.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Error.style() },
            "M.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredStart.Default.style()
            },
            "M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredStart.Warning.style()
            },
            "M.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.RequiredStart.Error.style() },
            "M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.M.OuterLabel.RequiredEnd.Default.style() },
            "M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.M.OuterLabel.RequiredEnd.Warning.style() },
            "M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.RequiredEnd.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Warning.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Error.style() },
            "M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredStart.Default.style()
            },
            "M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredStart.Warning.style()
            },
            "M.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.RequiredStart.Error.style() },
            "M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.M.InnerLabel.RequiredEnd.Default.style() },
            "M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.M.InnerLabel.RequiredEnd.Warning.style() },
            "M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.RequiredEnd.Error.style() },
            "L.Default" to ComposeStyleReference { TextAreaClear.L.Default.style() },
            "L.Warning" to ComposeStyleReference { TextAreaClear.L.Warning.style() },
            "L.Error" to ComposeStyleReference { TextAreaClear.L.Error.style() },
            "L.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Default.style() },
            "L.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Warning.style() },
            "L.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Error.style() },
            "L.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Default.style() },
            "L.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Warning.style() },
            "L.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Error.style() },
            "L.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Warning.style() },
            "L.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Error.style() },
            "L.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredStart.Default.style()
            },
            "L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredStart.Warning.style()
            },
            "L.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.RequiredStart.Error.style() },
            "L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.L.OuterLabel.RequiredEnd.Default.style() },
            "L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.L.OuterLabel.RequiredEnd.Warning.style() },
            "L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.RequiredEnd.Error.style() },
            "L.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Warning.style() },
            "L.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Error.style() },
            "L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredStart.Default.style()
            },
            "L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredStart.Warning.style()
            },
            "L.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.RequiredStart.Error.style() },
            "L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.L.InnerLabel.RequiredEnd.Default.style() },
            "L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.L.InnerLabel.RequiredEnd.Warning.style() },
            "L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.RequiredEnd.Error.style() },
            "Xl.Default" to ComposeStyleReference { TextAreaClear.Xl.Default.style() },
            "Xl.Warning" to ComposeStyleReference { TextAreaClear.Xl.Warning.style() },
            "Xl.Error" to ComposeStyleReference { TextAreaClear.Xl.Error.style() },
            "Xl.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Default.style() },
            "Xl.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Warning.style() },
            "Xl.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Error.style() },
            "Xl.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Default.style() },
            "Xl.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Warning.style() },
            "Xl.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Error.style() },
            "Xl.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Default.style() },
            "Xl.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Warning.style() },
            "Xl.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Error.style() },
            "Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Error.style()
            },
            "Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredEnd.Default.style()
            },
            "Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredEnd.Warning.style()
            },
            "Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.RequiredEnd.Error.style() },
            "Xl.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Default.style() },
            "Xl.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Warning.style() },
            "Xl.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Error.style() },
            "Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Error.style()
            },
            "Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredEnd.Default.style()
            },
            "Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredEnd.Warning.style()
            },
            "Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.RequiredEnd.Error.style() },
        )
}
