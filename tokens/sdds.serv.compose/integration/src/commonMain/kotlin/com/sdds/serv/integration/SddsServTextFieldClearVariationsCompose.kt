// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.RequiredStart
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.TextFieldClear
import com.sdds.serv.styles.textfield.TextFieldClearLabelPlacement
import com.sdds.serv.styles.textfield.TextFieldClearRequiredPlacement
import com.sdds.serv.styles.textfield.TextFieldClearSize
import com.sdds.serv.styles.textfield.TextFieldClearView
import com.sdds.serv.styles.textfield.TextFieldStyles
import com.sdds.serv.styles.textfield.Warning
import com.sdds.serv.styles.textfield.Xl
import com.sdds.serv.styles.textfield.Xs
import com.sdds.serv.styles.textfield.resolve

internal object SddsServTextFieldClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L", "Xl")),
            Property.SingleChoiceProperty(
                name = "requiredPlacement",
                value = "None",
                variants = listOf("None", "Start", "End"),
            ),
            Property.SingleChoiceProperty(
                name = "labelPlacement",
                value = "None",
                variants = listOf("None", "Outer", "Inner"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Success", "Warning", "Error"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextFieldClear.Xs.Default" to ComposeStyleReference { TextFieldClear.Xs.Default.style() },
            "TextFieldClear.Xs.Success" to ComposeStyleReference { TextFieldClear.Xs.Success.style() },
            "TextFieldClear.Xs.Warning" to ComposeStyleReference { TextFieldClear.Xs.Warning.style() },
            "TextFieldClear.Xs.Error" to ComposeStyleReference { TextFieldClear.Xs.Error.style() },
            "TextFieldClear.Xs.RequiredStart.Default" to ComposeStyleReference { TextFieldClear.Xs.RequiredStart.Default.style() },
            "TextFieldClear.Xs.RequiredStart.Success" to ComposeStyleReference { TextFieldClear.Xs.RequiredStart.Success.style() },
            "TextFieldClear.Xs.RequiredStart.Warning" to ComposeStyleReference { TextFieldClear.Xs.RequiredStart.Warning.style() },
            "TextFieldClear.Xs.RequiredStart.Error" to ComposeStyleReference { TextFieldClear.Xs.RequiredStart.Error.style() },
            "TextFieldClear.Xs.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Default.style() },
            "TextFieldClear.Xs.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Success.style() },
            "TextFieldClear.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Warning.style() },
            "TextFieldClear.Xs.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Error.style() },
            "TextFieldClear.Xs.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Default.style() },
            "TextFieldClear.Xs.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Success.style() },
            "TextFieldClear.Xs.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Warning.style() },
            "TextFieldClear.Xs.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Error.style() },
            "TextFieldClear.Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.S.Default" to ComposeStyleReference { TextFieldClear.S.Default.style() },
            "TextFieldClear.S.Success" to ComposeStyleReference { TextFieldClear.S.Success.style() },
            "TextFieldClear.S.Warning" to ComposeStyleReference { TextFieldClear.S.Warning.style() },
            "TextFieldClear.S.Error" to ComposeStyleReference { TextFieldClear.S.Error.style() },
            "TextFieldClear.S.RequiredStart.Default" to ComposeStyleReference { TextFieldClear.S.RequiredStart.Default.style() },
            "TextFieldClear.S.RequiredStart.Success" to ComposeStyleReference { TextFieldClear.S.RequiredStart.Success.style() },
            "TextFieldClear.S.RequiredStart.Warning" to ComposeStyleReference { TextFieldClear.S.RequiredStart.Warning.style() },
            "TextFieldClear.S.RequiredStart.Error" to ComposeStyleReference { TextFieldClear.S.RequiredStart.Error.style() },
            "TextFieldClear.S.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Default.style() },
            "TextFieldClear.S.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Success.style() },
            "TextFieldClear.S.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Warning.style() },
            "TextFieldClear.S.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Error.style() },
            "TextFieldClear.S.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Default.style() },
            "TextFieldClear.S.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Success.style() },
            "TextFieldClear.S.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Warning.style() },
            "TextFieldClear.S.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Error.style() },
            "TextFieldClear.S.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.S.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Default.style() },
            "TextFieldClear.S.InnerLabel.Success" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Success.style() },
            "TextFieldClear.S.InnerLabel.Warning" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Warning.style() },
            "TextFieldClear.S.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Error.style() },
            "TextFieldClear.S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.M.Default" to ComposeStyleReference { TextFieldClear.M.Default.style() },
            "TextFieldClear.M.Success" to ComposeStyleReference { TextFieldClear.M.Success.style() },
            "TextFieldClear.M.Warning" to ComposeStyleReference { TextFieldClear.M.Warning.style() },
            "TextFieldClear.M.Error" to ComposeStyleReference { TextFieldClear.M.Error.style() },
            "TextFieldClear.M.RequiredStart.Default" to ComposeStyleReference { TextFieldClear.M.RequiredStart.Default.style() },
            "TextFieldClear.M.RequiredStart.Success" to ComposeStyleReference { TextFieldClear.M.RequiredStart.Success.style() },
            "TextFieldClear.M.RequiredStart.Warning" to ComposeStyleReference { TextFieldClear.M.RequiredStart.Warning.style() },
            "TextFieldClear.M.RequiredStart.Error" to ComposeStyleReference { TextFieldClear.M.RequiredStart.Error.style() },
            "TextFieldClear.M.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.M.RequiredEnd.Default.style() },
            "TextFieldClear.M.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.M.RequiredEnd.Success.style() },
            "TextFieldClear.M.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.M.RequiredEnd.Warning.style() },
            "TextFieldClear.M.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.M.RequiredEnd.Error.style() },
            "TextFieldClear.M.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Default.style() },
            "TextFieldClear.M.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Success.style() },
            "TextFieldClear.M.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Warning.style() },
            "TextFieldClear.M.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Error.style() },
            "TextFieldClear.M.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.M.OuterLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.M.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Default.style() },
            "TextFieldClear.M.InnerLabel.Success" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Success.style() },
            "TextFieldClear.M.InnerLabel.Warning" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Warning.style() },
            "TextFieldClear.M.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Error.style() },
            "TextFieldClear.M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.M.InnerLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.L.Default" to ComposeStyleReference { TextFieldClear.L.Default.style() },
            "TextFieldClear.L.Success" to ComposeStyleReference { TextFieldClear.L.Success.style() },
            "TextFieldClear.L.Warning" to ComposeStyleReference { TextFieldClear.L.Warning.style() },
            "TextFieldClear.L.Error" to ComposeStyleReference { TextFieldClear.L.Error.style() },
            "TextFieldClear.L.RequiredStart.Default" to ComposeStyleReference { TextFieldClear.L.RequiredStart.Default.style() },
            "TextFieldClear.L.RequiredStart.Success" to ComposeStyleReference { TextFieldClear.L.RequiredStart.Success.style() },
            "TextFieldClear.L.RequiredStart.Warning" to ComposeStyleReference { TextFieldClear.L.RequiredStart.Warning.style() },
            "TextFieldClear.L.RequiredStart.Error" to ComposeStyleReference { TextFieldClear.L.RequiredStart.Error.style() },
            "TextFieldClear.L.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.L.RequiredEnd.Default.style() },
            "TextFieldClear.L.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.L.RequiredEnd.Success.style() },
            "TextFieldClear.L.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.L.RequiredEnd.Warning.style() },
            "TextFieldClear.L.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.L.RequiredEnd.Error.style() },
            "TextFieldClear.L.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Default.style() },
            "TextFieldClear.L.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Success.style() },
            "TextFieldClear.L.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Warning.style() },
            "TextFieldClear.L.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Error.style() },
            "TextFieldClear.L.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.L.OuterLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.L.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Default.style() },
            "TextFieldClear.L.InnerLabel.Success" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Success.style() },
            "TextFieldClear.L.InnerLabel.Warning" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Warning.style() },
            "TextFieldClear.L.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Error.style() },
            "TextFieldClear.L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.L.InnerLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.Xl.Default" to ComposeStyleReference { TextFieldClear.Xl.Default.style() },
            "TextFieldClear.Xl.Success" to ComposeStyleReference { TextFieldClear.Xl.Success.style() },
            "TextFieldClear.Xl.Warning" to ComposeStyleReference { TextFieldClear.Xl.Warning.style() },
            "TextFieldClear.Xl.Error" to ComposeStyleReference { TextFieldClear.Xl.Error.style() },
            "TextFieldClear.Xl.RequiredStart.Default" to ComposeStyleReference { TextFieldClear.Xl.RequiredStart.Default.style() },
            "TextFieldClear.Xl.RequiredStart.Success" to ComposeStyleReference { TextFieldClear.Xl.RequiredStart.Success.style() },
            "TextFieldClear.Xl.RequiredStart.Warning" to ComposeStyleReference { TextFieldClear.Xl.RequiredStart.Warning.style() },
            "TextFieldClear.Xl.RequiredStart.Error" to ComposeStyleReference { TextFieldClear.Xl.RequiredStart.Error.style() },
            "TextFieldClear.Xl.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.Xl.RequiredEnd.Default.style() },
            "TextFieldClear.Xl.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.Xl.RequiredEnd.Success.style() },
            "TextFieldClear.Xl.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.Xl.RequiredEnd.Warning.style() },
            "TextFieldClear.Xl.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.Xl.RequiredEnd.Error.style() },
            "TextFieldClear.Xl.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.Xl.OuterLabel.Default.style() },
            "TextFieldClear.Xl.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.Xl.OuterLabel.Success.style() },
            "TextFieldClear.Xl.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.Xl.OuterLabel.Warning.style() },
            "TextFieldClear.Xl.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.Xl.OuterLabel.Error.style() },
            "TextFieldClear.Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.Xl.OuterLabel.RequiredEnd.Error.style()
            },
            "TextFieldClear.Xl.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.Xl.InnerLabel.Default.style() },
            "TextFieldClear.Xl.InnerLabel.Success" to ComposeStyleReference { TextFieldClear.Xl.InnerLabel.Success.style() },
            "TextFieldClear.Xl.InnerLabel.Warning" to ComposeStyleReference { TextFieldClear.Xl.InnerLabel.Warning.style() },
            "TextFieldClear.Xl.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.Xl.InnerLabel.Error.style() },
            "TextFieldClear.Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredStart.Success.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredStart.Error.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredEnd.Default.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredEnd.Success.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextFieldClear.Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextFieldClear.Xl.InnerLabel.RequiredEnd.Error.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> TextFieldClearSize.Xs
                "S" -> TextFieldClearSize.S
                "M" -> TextFieldClearSize.M
                "L" -> TextFieldClearSize.L
                "Xl" -> TextFieldClearSize.Xl
                else -> TextFieldClearSize.Xs
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextFieldClearRequiredPlacement.None
                "Start" -> TextFieldClearRequiredPlacement.Start
                "End" -> TextFieldClearRequiredPlacement.End
                else -> TextFieldClearRequiredPlacement.None
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextFieldClearLabelPlacement.None
                "Outer" -> TextFieldClearLabelPlacement.Outer
                "Inner" -> TextFieldClearLabelPlacement.Inner
                else -> TextFieldClearLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldClearView.Default
                "Success" -> TextFieldClearView.Success
                "Warning" -> TextFieldClearView.Warning
                "Error" -> TextFieldClearView.Error
                else -> TextFieldClearView.Default
            },
        ).key
    }
}
