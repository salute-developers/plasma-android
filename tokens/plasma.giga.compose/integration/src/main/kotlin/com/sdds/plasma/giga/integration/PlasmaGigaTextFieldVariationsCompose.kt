// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.textfield.Default
import com.sdds.plasma.giga.styles.textfield.Error
import com.sdds.plasma.giga.styles.textfield.InnerLabel
import com.sdds.plasma.giga.styles.textfield.L
import com.sdds.plasma.giga.styles.textfield.M
import com.sdds.plasma.giga.styles.textfield.OuterLabel
import com.sdds.plasma.giga.styles.textfield.RequiredEnd
import com.sdds.plasma.giga.styles.textfield.RequiredStart
import com.sdds.plasma.giga.styles.textfield.S
import com.sdds.plasma.giga.styles.textfield.Success
import com.sdds.plasma.giga.styles.textfield.TextField
import com.sdds.plasma.giga.styles.textfield.TextFieldDefaultLabelPlacement
import com.sdds.plasma.giga.styles.textfield.TextFieldDefaultRequiredPlacement
import com.sdds.plasma.giga.styles.textfield.TextFieldDefaultSize
import com.sdds.plasma.giga.styles.textfield.TextFieldDefaultView
import com.sdds.plasma.giga.styles.textfield.TextFieldStyles
import com.sdds.plasma.giga.styles.textfield.Warning
import com.sdds.plasma.giga.styles.textfield.Xl
import com.sdds.plasma.giga.styles.textfield.Xs
import com.sdds.plasma.giga.styles.textfield.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
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
            "TextField.Xs.Default" to ComposeStyleReference { TextField.Xs.Default.style() },
            "TextField.Xs.Success" to ComposeStyleReference { TextField.Xs.Success.style() },
            "TextField.Xs.Warning" to ComposeStyleReference { TextField.Xs.Warning.style() },
            "TextField.Xs.Error" to ComposeStyleReference { TextField.Xs.Error.style() },
            "TextField.Xs.RequiredStart.Default" to ComposeStyleReference { TextField.Xs.RequiredStart.Default.style() },
            "TextField.Xs.RequiredStart.Success" to ComposeStyleReference { TextField.Xs.RequiredStart.Success.style() },
            "TextField.Xs.RequiredStart.Warning" to ComposeStyleReference { TextField.Xs.RequiredStart.Warning.style() },
            "TextField.Xs.RequiredStart.Error" to ComposeStyleReference { TextField.Xs.RequiredStart.Error.style() },
            "TextField.Xs.RequiredEnd.Default" to ComposeStyleReference { TextField.Xs.RequiredEnd.Default.style() },
            "TextField.Xs.RequiredEnd.Success" to ComposeStyleReference { TextField.Xs.RequiredEnd.Success.style() },
            "TextField.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xs.RequiredEnd.Warning.style() },
            "TextField.Xs.RequiredEnd.Error" to ComposeStyleReference { TextField.Xs.RequiredEnd.Error.style() },
            "TextField.Xs.OuterLabel.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.Default.style() },
            "TextField.Xs.OuterLabel.Success" to ComposeStyleReference { TextField.Xs.OuterLabel.Success.style() },
            "TextField.Xs.OuterLabel.Warning" to ComposeStyleReference { TextField.Xs.OuterLabel.Warning.style() },
            "TextField.Xs.OuterLabel.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.Error.style() },
            "TextField.Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "TextField.Xs.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Success.style()
            },
            "TextField.Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "TextField.Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredStart.Error.style()
            },
            "TextField.Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredEnd.Default.style()
            },
            "TextField.Xs.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredEnd.Success.style()
            },
            "TextField.Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextField.Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredEnd.Error.style()
            },
            "TextField.S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "TextField.S.Success" to ComposeStyleReference { TextField.S.Success.style() },
            "TextField.S.Warning" to ComposeStyleReference { TextField.S.Warning.style() },
            "TextField.S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "TextField.S.RequiredStart.Default" to ComposeStyleReference { TextField.S.RequiredStart.Default.style() },
            "TextField.S.RequiredStart.Success" to ComposeStyleReference { TextField.S.RequiredStart.Success.style() },
            "TextField.S.RequiredStart.Warning" to ComposeStyleReference { TextField.S.RequiredStart.Warning.style() },
            "TextField.S.RequiredStart.Error" to ComposeStyleReference { TextField.S.RequiredStart.Error.style() },
            "TextField.S.RequiredEnd.Default" to ComposeStyleReference { TextField.S.RequiredEnd.Default.style() },
            "TextField.S.RequiredEnd.Success" to ComposeStyleReference { TextField.S.RequiredEnd.Success.style() },
            "TextField.S.RequiredEnd.Warning" to ComposeStyleReference { TextField.S.RequiredEnd.Warning.style() },
            "TextField.S.RequiredEnd.Error" to ComposeStyleReference { TextField.S.RequiredEnd.Error.style() },
            "TextField.S.OuterLabel.Default" to ComposeStyleReference { TextField.S.OuterLabel.Default.style() },
            "TextField.S.OuterLabel.Success" to ComposeStyleReference { TextField.S.OuterLabel.Success.style() },
            "TextField.S.OuterLabel.Warning" to ComposeStyleReference { TextField.S.OuterLabel.Warning.style() },
            "TextField.S.OuterLabel.Error" to ComposeStyleReference { TextField.S.OuterLabel.Error.style() },
            "TextField.S.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredStart.Default.style()
            },
            "TextField.S.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredStart.Success.style()
            },
            "TextField.S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredStart.Warning.style()
            },
            "TextField.S.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredStart.Error.style()
            },
            "TextField.S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredEnd.Default.style()
            },
            "TextField.S.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredEnd.Success.style()
            },
            "TextField.S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextField.S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredEnd.Error.style()
            },
            "TextField.S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "TextField.S.InnerLabel.Success" to ComposeStyleReference { TextField.S.InnerLabel.Success.style() },
            "TextField.S.InnerLabel.Warning" to ComposeStyleReference { TextField.S.InnerLabel.Warning.style() },
            "TextField.S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "TextField.S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.S.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Success.style()
            },
            "TextField.S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Warning.style()
            },
            "TextField.S.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Success.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Error.style()
            },
            "TextField.M.Default" to ComposeStyleReference { TextField.M.Default.style() },
            "TextField.M.Success" to ComposeStyleReference { TextField.M.Success.style() },
            "TextField.M.Warning" to ComposeStyleReference { TextField.M.Warning.style() },
            "TextField.M.Error" to ComposeStyleReference { TextField.M.Error.style() },
            "TextField.M.RequiredStart.Default" to ComposeStyleReference { TextField.M.RequiredStart.Default.style() },
            "TextField.M.RequiredStart.Success" to ComposeStyleReference { TextField.M.RequiredStart.Success.style() },
            "TextField.M.RequiredStart.Warning" to ComposeStyleReference { TextField.M.RequiredStart.Warning.style() },
            "TextField.M.RequiredStart.Error" to ComposeStyleReference { TextField.M.RequiredStart.Error.style() },
            "TextField.M.RequiredEnd.Default" to ComposeStyleReference { TextField.M.RequiredEnd.Default.style() },
            "TextField.M.RequiredEnd.Success" to ComposeStyleReference { TextField.M.RequiredEnd.Success.style() },
            "TextField.M.RequiredEnd.Warning" to ComposeStyleReference { TextField.M.RequiredEnd.Warning.style() },
            "TextField.M.RequiredEnd.Error" to ComposeStyleReference { TextField.M.RequiredEnd.Error.style() },
            "TextField.M.OuterLabel.Default" to ComposeStyleReference { TextField.M.OuterLabel.Default.style() },
            "TextField.M.OuterLabel.Success" to ComposeStyleReference { TextField.M.OuterLabel.Success.style() },
            "TextField.M.OuterLabel.Warning" to ComposeStyleReference { TextField.M.OuterLabel.Warning.style() },
            "TextField.M.OuterLabel.Error" to ComposeStyleReference { TextField.M.OuterLabel.Error.style() },
            "TextField.M.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredStart.Default.style()
            },
            "TextField.M.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredStart.Success.style()
            },
            "TextField.M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredStart.Warning.style()
            },
            "TextField.M.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredStart.Error.style()
            },
            "TextField.M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredEnd.Default.style()
            },
            "TextField.M.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredEnd.Success.style()
            },
            "TextField.M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextField.M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.M.OuterLabel.RequiredEnd.Error.style()
            },
            "TextField.M.InnerLabel.Default" to ComposeStyleReference { TextField.M.InnerLabel.Default.style() },
            "TextField.M.InnerLabel.Success" to ComposeStyleReference { TextField.M.InnerLabel.Success.style() },
            "TextField.M.InnerLabel.Warning" to ComposeStyleReference { TextField.M.InnerLabel.Warning.style() },
            "TextField.M.InnerLabel.Error" to ComposeStyleReference { TextField.M.InnerLabel.Error.style() },
            "TextField.M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.M.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Success.style()
            },
            "TextField.M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Warning.style()
            },
            "TextField.M.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Success.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Error.style()
            },
            "TextField.L.Default" to ComposeStyleReference { TextField.L.Default.style() },
            "TextField.L.Success" to ComposeStyleReference { TextField.L.Success.style() },
            "TextField.L.Warning" to ComposeStyleReference { TextField.L.Warning.style() },
            "TextField.L.Error" to ComposeStyleReference { TextField.L.Error.style() },
            "TextField.L.RequiredStart.Default" to ComposeStyleReference { TextField.L.RequiredStart.Default.style() },
            "TextField.L.RequiredStart.Success" to ComposeStyleReference { TextField.L.RequiredStart.Success.style() },
            "TextField.L.RequiredStart.Warning" to ComposeStyleReference { TextField.L.RequiredStart.Warning.style() },
            "TextField.L.RequiredStart.Error" to ComposeStyleReference { TextField.L.RequiredStart.Error.style() },
            "TextField.L.RequiredEnd.Default" to ComposeStyleReference { TextField.L.RequiredEnd.Default.style() },
            "TextField.L.RequiredEnd.Success" to ComposeStyleReference { TextField.L.RequiredEnd.Success.style() },
            "TextField.L.RequiredEnd.Warning" to ComposeStyleReference { TextField.L.RequiredEnd.Warning.style() },
            "TextField.L.RequiredEnd.Error" to ComposeStyleReference { TextField.L.RequiredEnd.Error.style() },
            "TextField.L.OuterLabel.Default" to ComposeStyleReference { TextField.L.OuterLabel.Default.style() },
            "TextField.L.OuterLabel.Success" to ComposeStyleReference { TextField.L.OuterLabel.Success.style() },
            "TextField.L.OuterLabel.Warning" to ComposeStyleReference { TextField.L.OuterLabel.Warning.style() },
            "TextField.L.OuterLabel.Error" to ComposeStyleReference { TextField.L.OuterLabel.Error.style() },
            "TextField.L.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredStart.Default.style()
            },
            "TextField.L.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredStart.Success.style()
            },
            "TextField.L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredStart.Warning.style()
            },
            "TextField.L.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredStart.Error.style()
            },
            "TextField.L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredEnd.Default.style()
            },
            "TextField.L.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredEnd.Success.style()
            },
            "TextField.L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextField.L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.L.OuterLabel.RequiredEnd.Error.style()
            },
            "TextField.L.InnerLabel.Default" to ComposeStyleReference { TextField.L.InnerLabel.Default.style() },
            "TextField.L.InnerLabel.Success" to ComposeStyleReference { TextField.L.InnerLabel.Success.style() },
            "TextField.L.InnerLabel.Warning" to ComposeStyleReference { TextField.L.InnerLabel.Warning.style() },
            "TextField.L.InnerLabel.Error" to ComposeStyleReference { TextField.L.InnerLabel.Error.style() },
            "TextField.L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.L.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Success.style()
            },
            "TextField.L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Warning.style()
            },
            "TextField.L.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Success.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Error.style()
            },
            "TextField.Xl.Default" to ComposeStyleReference { TextField.Xl.Default.style() },
            "TextField.Xl.Success" to ComposeStyleReference { TextField.Xl.Success.style() },
            "TextField.Xl.Warning" to ComposeStyleReference { TextField.Xl.Warning.style() },
            "TextField.Xl.Error" to ComposeStyleReference { TextField.Xl.Error.style() },
            "TextField.Xl.RequiredStart.Default" to ComposeStyleReference { TextField.Xl.RequiredStart.Default.style() },
            "TextField.Xl.RequiredStart.Success" to ComposeStyleReference { TextField.Xl.RequiredStart.Success.style() },
            "TextField.Xl.RequiredStart.Warning" to ComposeStyleReference { TextField.Xl.RequiredStart.Warning.style() },
            "TextField.Xl.RequiredStart.Error" to ComposeStyleReference { TextField.Xl.RequiredStart.Error.style() },
            "TextField.Xl.RequiredEnd.Default" to ComposeStyleReference { TextField.Xl.RequiredEnd.Default.style() },
            "TextField.Xl.RequiredEnd.Success" to ComposeStyleReference { TextField.Xl.RequiredEnd.Success.style() },
            "TextField.Xl.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xl.RequiredEnd.Warning.style() },
            "TextField.Xl.RequiredEnd.Error" to ComposeStyleReference { TextField.Xl.RequiredEnd.Error.style() },
            "TextField.Xl.OuterLabel.Default" to ComposeStyleReference { TextField.Xl.OuterLabel.Default.style() },
            "TextField.Xl.OuterLabel.Success" to ComposeStyleReference { TextField.Xl.OuterLabel.Success.style() },
            "TextField.Xl.OuterLabel.Warning" to ComposeStyleReference { TextField.Xl.OuterLabel.Warning.style() },
            "TextField.Xl.OuterLabel.Error" to ComposeStyleReference { TextField.Xl.OuterLabel.Error.style() },
            "TextField.Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "TextField.Xl.OuterLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Success.style()
            },
            "TextField.Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "TextField.Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredStart.Error.style()
            },
            "TextField.Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredEnd.Default.style()
            },
            "TextField.Xl.OuterLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredEnd.Success.style()
            },
            "TextField.Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextField.Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.Xl.OuterLabel.RequiredEnd.Error.style()
            },
            "TextField.Xl.InnerLabel.Default" to ComposeStyleReference { TextField.Xl.InnerLabel.Default.style() },
            "TextField.Xl.InnerLabel.Success" to ComposeStyleReference { TextField.Xl.InnerLabel.Success.style() },
            "TextField.Xl.InnerLabel.Warning" to ComposeStyleReference { TextField.Xl.InnerLabel.Warning.style() },
            "TextField.Xl.InnerLabel.Error" to ComposeStyleReference { TextField.Xl.InnerLabel.Error.style() },
            "TextField.Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.Xl.InnerLabel.RequiredStart.Success" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Success.style()
            },
            "TextField.Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "TextField.Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.Xl.InnerLabel.RequiredEnd.Success" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredEnd.Success.style()
            },
            "TextField.Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextField.Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.Xl.InnerLabel.RequiredEnd.Error.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> TextFieldDefaultSize.Xl
                "L" -> TextFieldDefaultSize.L
                "M" -> TextFieldDefaultSize.M
                "S" -> TextFieldDefaultSize.S
                "Xs" -> TextFieldDefaultSize.Xs
                else -> TextFieldDefaultSize.Xl
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextFieldDefaultRequiredPlacement.None
                "Start" -> TextFieldDefaultRequiredPlacement.Start
                "End" -> TextFieldDefaultRequiredPlacement.End
                else -> TextFieldDefaultRequiredPlacement.None
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextFieldDefaultLabelPlacement.None
                "Outer" -> TextFieldDefaultLabelPlacement.Outer
                "Inner" -> TextFieldDefaultLabelPlacement.Inner
                else -> TextFieldDefaultLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldDefaultView.Default
                "Success" -> TextFieldDefaultView.Success
                "Warning" -> TextFieldDefaultView.Warning
                "Error" -> TextFieldDefaultView.Error
                else -> TextFieldDefaultView.Default
            },
        ).key
    }
}
