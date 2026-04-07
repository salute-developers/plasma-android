// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.textfield.Default
import com.sdds.plasma.sd.service.styles.textfield.Error
import com.sdds.plasma.sd.service.styles.textfield.InnerLabel
import com.sdds.plasma.sd.service.styles.textfield.L
import com.sdds.plasma.sd.service.styles.textfield.M
import com.sdds.plasma.sd.service.styles.textfield.OuterLabel
import com.sdds.plasma.sd.service.styles.textfield.RequiredEnd
import com.sdds.plasma.sd.service.styles.textfield.RequiredStart
import com.sdds.plasma.sd.service.styles.textfield.S
import com.sdds.plasma.sd.service.styles.textfield.Success
import com.sdds.plasma.sd.service.styles.textfield.TextField
import com.sdds.plasma.sd.service.styles.textfield.Warning
import com.sdds.plasma.sd.service.styles.textfield.Xl
import com.sdds.plasma.sd.service.styles.textfield.Xs

internal object PlasmaB2cTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextField.Xs.Default.style() },
            "Xs.Success" to ComposeStyleReference { TextField.Xs.Success.style() },
            "Xs.Warning" to ComposeStyleReference { TextField.Xs.Warning.style() },
            "Xs.Error" to ComposeStyleReference { TextField.Xs.Error.style() },
            "Xs.RequiredStart.Default" to ComposeStyleReference { TextField.Xs.RequiredStart.Default.style() },
            "Xs.RequiredStart.Success" to ComposeStyleReference { TextField.Xs.RequiredStart.Success.style() },
            "Xs.RequiredStart.Warning" to ComposeStyleReference { TextField.Xs.RequiredStart.Warning.style() },
            "Xs.RequiredStart.Error" to ComposeStyleReference { TextField.Xs.RequiredStart.Error.style() },
            "Xs.RequiredEnd.Default" to ComposeStyleReference { TextField.Xs.RequiredEnd.Default.style() },
            "Xs.RequiredEnd.Success" to ComposeStyleReference { TextField.Xs.RequiredEnd.Success.style() },
            "Xs.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xs.RequiredEnd.Warning.style() },
            "Xs.RequiredEnd.Error" to ComposeStyleReference { TextField.Xs.RequiredEnd.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Success" to ComposeStyleReference { TextField.Xs.OuterLabel.Success.style() },
            "Xs.OuterLabel.Warning" to ComposeStyleReference { TextField.Xs.OuterLabel.Warning.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.Error.style() },
            "Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "Xs.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Success.style()
            },
            "Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.RequiredStart.Error.style() },
            "Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.RequiredEnd.Default.style() },
            "Xs.OuterLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.Xs.OuterLabel.RequiredEnd.Success.style() },
            "Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xs.OuterLabel.RequiredEnd.Warning.style() },
            "Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.RequiredEnd.Error.style() },
            "S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "S.Success" to ComposeStyleReference { TextField.S.Success.style() },
            "S.Warning" to ComposeStyleReference { TextField.S.Warning.style() },
            "S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "S.RequiredStart.Default" to ComposeStyleReference { TextField.S.RequiredStart.Default.style() },
            "S.RequiredStart.Success" to ComposeStyleReference { TextField.S.RequiredStart.Success.style() },
            "S.RequiredStart.Warning" to ComposeStyleReference { TextField.S.RequiredStart.Warning.style() },
            "S.RequiredStart.Error" to ComposeStyleReference { TextField.S.RequiredStart.Error.style() },
            "S.RequiredEnd.Default" to ComposeStyleReference { TextField.S.RequiredEnd.Default.style() },
            "S.RequiredEnd.Success" to ComposeStyleReference { TextField.S.RequiredEnd.Success.style() },
            "S.RequiredEnd.Warning" to ComposeStyleReference { TextField.S.RequiredEnd.Warning.style() },
            "S.RequiredEnd.Error" to ComposeStyleReference { TextField.S.RequiredEnd.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextField.S.OuterLabel.Default.style() },
            "S.OuterLabel.Success" to ComposeStyleReference { TextField.S.OuterLabel.Success.style() },
            "S.OuterLabel.Warning" to ComposeStyleReference { TextField.S.OuterLabel.Warning.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextField.S.OuterLabel.Error.style() },
            "S.OuterLabel.RequiredStart.Default" to ComposeStyleReference { TextField.S.OuterLabel.RequiredStart.Default.style() },
            "S.OuterLabel.RequiredStart.Success" to ComposeStyleReference { TextField.S.OuterLabel.RequiredStart.Success.style() },
            "S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.S.OuterLabel.RequiredStart.Warning.style() },
            "S.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextField.S.OuterLabel.RequiredStart.Error.style() },
            "S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.S.OuterLabel.RequiredEnd.Default.style() },
            "S.OuterLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.S.OuterLabel.RequiredEnd.Success.style() },
            "S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.S.OuterLabel.RequiredEnd.Warning.style() },
            "S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.S.OuterLabel.RequiredEnd.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "S.InnerLabel.Success" to ComposeStyleReference { TextField.S.InnerLabel.Success.style() },
            "S.InnerLabel.Warning" to ComposeStyleReference { TextField.S.InnerLabel.Warning.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "S.InnerLabel.RequiredStart.Default" to ComposeStyleReference { TextField.S.InnerLabel.RequiredStart.Default.style() },
            "S.InnerLabel.RequiredStart.Success" to ComposeStyleReference { TextField.S.InnerLabel.RequiredStart.Success.style() },
            "S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.S.InnerLabel.RequiredStart.Warning.style() },
            "S.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextField.S.InnerLabel.RequiredStart.Error.style() },
            "S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.S.InnerLabel.RequiredEnd.Default.style() },
            "S.InnerLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.S.InnerLabel.RequiredEnd.Success.style() },
            "S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.S.InnerLabel.RequiredEnd.Warning.style() },
            "S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.S.InnerLabel.RequiredEnd.Error.style() },
            "M.Default" to ComposeStyleReference { TextField.M.Default.style() },
            "M.Success" to ComposeStyleReference { TextField.M.Success.style() },
            "M.Warning" to ComposeStyleReference { TextField.M.Warning.style() },
            "M.Error" to ComposeStyleReference { TextField.M.Error.style() },
            "M.RequiredStart.Default" to ComposeStyleReference { TextField.M.RequiredStart.Default.style() },
            "M.RequiredStart.Success" to ComposeStyleReference { TextField.M.RequiredStart.Success.style() },
            "M.RequiredStart.Warning" to ComposeStyleReference { TextField.M.RequiredStart.Warning.style() },
            "M.RequiredStart.Error" to ComposeStyleReference { TextField.M.RequiredStart.Error.style() },
            "M.RequiredEnd.Default" to ComposeStyleReference { TextField.M.RequiredEnd.Default.style() },
            "M.RequiredEnd.Success" to ComposeStyleReference { TextField.M.RequiredEnd.Success.style() },
            "M.RequiredEnd.Warning" to ComposeStyleReference { TextField.M.RequiredEnd.Warning.style() },
            "M.RequiredEnd.Error" to ComposeStyleReference { TextField.M.RequiredEnd.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextField.M.OuterLabel.Default.style() },
            "M.OuterLabel.Success" to ComposeStyleReference { TextField.M.OuterLabel.Success.style() },
            "M.OuterLabel.Warning" to ComposeStyleReference { TextField.M.OuterLabel.Warning.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextField.M.OuterLabel.Error.style() },
            "M.OuterLabel.RequiredStart.Default" to ComposeStyleReference { TextField.M.OuterLabel.RequiredStart.Default.style() },
            "M.OuterLabel.RequiredStart.Success" to ComposeStyleReference { TextField.M.OuterLabel.RequiredStart.Success.style() },
            "M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.M.OuterLabel.RequiredStart.Warning.style() },
            "M.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextField.M.OuterLabel.RequiredStart.Error.style() },
            "M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.M.OuterLabel.RequiredEnd.Default.style() },
            "M.OuterLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.M.OuterLabel.RequiredEnd.Success.style() },
            "M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.M.OuterLabel.RequiredEnd.Warning.style() },
            "M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.M.OuterLabel.RequiredEnd.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextField.M.InnerLabel.Default.style() },
            "M.InnerLabel.Success" to ComposeStyleReference { TextField.M.InnerLabel.Success.style() },
            "M.InnerLabel.Warning" to ComposeStyleReference { TextField.M.InnerLabel.Warning.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextField.M.InnerLabel.Error.style() },
            "M.InnerLabel.RequiredStart.Default" to ComposeStyleReference { TextField.M.InnerLabel.RequiredStart.Default.style() },
            "M.InnerLabel.RequiredStart.Success" to ComposeStyleReference { TextField.M.InnerLabel.RequiredStart.Success.style() },
            "M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.M.InnerLabel.RequiredStart.Warning.style() },
            "M.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextField.M.InnerLabel.RequiredStart.Error.style() },
            "M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.M.InnerLabel.RequiredEnd.Default.style() },
            "M.InnerLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.M.InnerLabel.RequiredEnd.Success.style() },
            "M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.M.InnerLabel.RequiredEnd.Warning.style() },
            "M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.M.InnerLabel.RequiredEnd.Error.style() },
            "L.Default" to ComposeStyleReference { TextField.L.Default.style() },
            "L.Success" to ComposeStyleReference { TextField.L.Success.style() },
            "L.Warning" to ComposeStyleReference { TextField.L.Warning.style() },
            "L.Error" to ComposeStyleReference { TextField.L.Error.style() },
            "L.RequiredStart.Default" to ComposeStyleReference { TextField.L.RequiredStart.Default.style() },
            "L.RequiredStart.Success" to ComposeStyleReference { TextField.L.RequiredStart.Success.style() },
            "L.RequiredStart.Warning" to ComposeStyleReference { TextField.L.RequiredStart.Warning.style() },
            "L.RequiredStart.Error" to ComposeStyleReference { TextField.L.RequiredStart.Error.style() },
            "L.RequiredEnd.Default" to ComposeStyleReference { TextField.L.RequiredEnd.Default.style() },
            "L.RequiredEnd.Success" to ComposeStyleReference { TextField.L.RequiredEnd.Success.style() },
            "L.RequiredEnd.Warning" to ComposeStyleReference { TextField.L.RequiredEnd.Warning.style() },
            "L.RequiredEnd.Error" to ComposeStyleReference { TextField.L.RequiredEnd.Error.style() },
            "L.OuterLabel.Default" to ComposeStyleReference { TextField.L.OuterLabel.Default.style() },
            "L.OuterLabel.Success" to ComposeStyleReference { TextField.L.OuterLabel.Success.style() },
            "L.OuterLabel.Warning" to ComposeStyleReference { TextField.L.OuterLabel.Warning.style() },
            "L.OuterLabel.Error" to ComposeStyleReference { TextField.L.OuterLabel.Error.style() },
            "L.OuterLabel.RequiredStart.Default" to ComposeStyleReference { TextField.L.OuterLabel.RequiredStart.Default.style() },
            "L.OuterLabel.RequiredStart.Success" to ComposeStyleReference { TextField.L.OuterLabel.RequiredStart.Success.style() },
            "L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.L.OuterLabel.RequiredStart.Warning.style() },
            "L.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextField.L.OuterLabel.RequiredStart.Error.style() },
            "L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.L.OuterLabel.RequiredEnd.Default.style() },
            "L.OuterLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.L.OuterLabel.RequiredEnd.Success.style() },
            "L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.L.OuterLabel.RequiredEnd.Warning.style() },
            "L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.L.OuterLabel.RequiredEnd.Error.style() },
            "L.InnerLabel.Default" to ComposeStyleReference { TextField.L.InnerLabel.Default.style() },
            "L.InnerLabel.Success" to ComposeStyleReference { TextField.L.InnerLabel.Success.style() },
            "L.InnerLabel.Warning" to ComposeStyleReference { TextField.L.InnerLabel.Warning.style() },
            "L.InnerLabel.Error" to ComposeStyleReference { TextField.L.InnerLabel.Error.style() },
            "L.InnerLabel.RequiredStart.Default" to ComposeStyleReference { TextField.L.InnerLabel.RequiredStart.Default.style() },
            "L.InnerLabel.RequiredStart.Success" to ComposeStyleReference { TextField.L.InnerLabel.RequiredStart.Success.style() },
            "L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference { TextField.L.InnerLabel.RequiredStart.Warning.style() },
            "L.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextField.L.InnerLabel.RequiredStart.Error.style() },
            "L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.L.InnerLabel.RequiredEnd.Default.style() },
            "L.InnerLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.L.InnerLabel.RequiredEnd.Success.style() },
            "L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.L.InnerLabel.RequiredEnd.Warning.style() },
            "L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.L.InnerLabel.RequiredEnd.Error.style() },
            "Xl.Default" to ComposeStyleReference { TextField.Xl.Default.style() },
            "Xl.Success" to ComposeStyleReference { TextField.Xl.Success.style() },
            "Xl.Warning" to ComposeStyleReference { TextField.Xl.Warning.style() },
            "Xl.Error" to ComposeStyleReference { TextField.Xl.Error.style() },
            "Xl.RequiredStart.Default" to ComposeStyleReference { TextField.Xl.RequiredStart.Default.style() },
            "Xl.RequiredStart.Success" to ComposeStyleReference { TextField.Xl.RequiredStart.Success.style() },
            "Xl.RequiredStart.Warning" to ComposeStyleReference { TextField.Xl.RequiredStart.Warning.style() },
            "Xl.RequiredStart.Error" to ComposeStyleReference { TextField.Xl.RequiredStart.Error.style() },
            "Xl.RequiredEnd.Default" to ComposeStyleReference { TextField.Xl.RequiredEnd.Default.style() },
            "Xl.RequiredEnd.Success" to ComposeStyleReference { TextField.Xl.RequiredEnd.Success.style() },
            "Xl.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xl.RequiredEnd.Warning.style() },
            "Xl.RequiredEnd.Error" to ComposeStyleReference { TextField.Xl.RequiredEnd.Error.style() },
            "Xl.OuterLabel.Default" to ComposeStyleReference { TextField.Xl.OuterLabel.Default.style() },
            "Xl.OuterLabel.Success" to ComposeStyleReference { TextField.Xl.OuterLabel.Success.style() },
            "Xl.OuterLabel.Warning" to ComposeStyleReference { TextField.Xl.OuterLabel.Warning.style() },
            "Xl.OuterLabel.Error" to ComposeStyleReference { TextField.Xl.OuterLabel.Error.style() },
            "Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "Xl.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Success.style()
            },
            "Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference { TextField.Xl.OuterLabel.RequiredStart.Error.style() },
            "Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.Xl.OuterLabel.RequiredEnd.Default.style() },
            "Xl.OuterLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.Xl.OuterLabel.RequiredEnd.Success.style() },
            "Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xl.OuterLabel.RequiredEnd.Warning.style() },
            "Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.Xl.OuterLabel.RequiredEnd.Error.style() },
            "Xl.InnerLabel.Default" to ComposeStyleReference { TextField.Xl.InnerLabel.Default.style() },
            "Xl.InnerLabel.Success" to ComposeStyleReference { TextField.Xl.InnerLabel.Success.style() },
            "Xl.InnerLabel.Warning" to ComposeStyleReference { TextField.Xl.InnerLabel.Warning.style() },
            "Xl.InnerLabel.Error" to ComposeStyleReference { TextField.Xl.InnerLabel.Error.style() },
            "Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "Xl.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Success.style()
            },
            "Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference { TextField.Xl.InnerLabel.RequiredStart.Error.style() },
            "Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference { TextField.Xl.InnerLabel.RequiredEnd.Default.style() },
            "Xl.InnerLabel.RequiredEnd.Success" to ComposeStyleReference { TextField.Xl.InnerLabel.RequiredEnd.Success.style() },
            "Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xl.InnerLabel.RequiredEnd.Warning.style() },
            "Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextField.Xl.InnerLabel.RequiredEnd.Error.style() },
        )
}
