// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.textfield.Default
import com.sdds.finai.styles.textfield.Edited
import com.sdds.finai.styles.textfield.Error
import com.sdds.finai.styles.textfield.InnerLabel
import com.sdds.finai.styles.textfield.OuterLabel
import com.sdds.finai.styles.textfield.RequiredEnd
import com.sdds.finai.styles.textfield.S
import com.sdds.finai.styles.textfield.Success
import com.sdds.finai.styles.textfield.TextField
import com.sdds.finai.styles.textfield.TextFieldDefaultLabelPlacement
import com.sdds.finai.styles.textfield.TextFieldDefaultRequiredPlacement
import com.sdds.finai.styles.textfield.TextFieldDefaultSize
import com.sdds.finai.styles.textfield.TextFieldDefaultView
import com.sdds.finai.styles.textfield.TextFieldStyles
import com.sdds.finai.styles.textfield.Warning
import com.sdds.finai.styles.textfield.Xs
import com.sdds.finai.styles.textfield.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("Xs", "S")),
            Property.SingleChoiceProperty(name = "requiredPlacement", value = "None", variants = listOf("None", "End")),
            Property.SingleChoiceProperty(
                name = "labelPlacement",
                value = "None",
                variants = listOf("None", "Outer", "Inner"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Success", "Warning", "Error", "Edited"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextField.Xs.Default" to ComposeStyleReference { TextField.Xs.Default.style() },
            "TextField.Xs.Success" to ComposeStyleReference { TextField.Xs.Success.style() },
            "TextField.Xs.Warning" to ComposeStyleReference { TextField.Xs.Warning.style() },
            "TextField.Xs.Error" to ComposeStyleReference { TextField.Xs.Error.style() },
            "TextField.Xs.Edited" to ComposeStyleReference { TextField.Xs.Edited.style() },
            "TextField.Xs.RequiredEnd.Default" to ComposeStyleReference { TextField.Xs.RequiredEnd.Default.style() },
            "TextField.Xs.RequiredEnd.Success" to ComposeStyleReference { TextField.Xs.RequiredEnd.Success.style() },
            "TextField.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextField.Xs.RequiredEnd.Warning.style() },
            "TextField.Xs.RequiredEnd.Error" to ComposeStyleReference { TextField.Xs.RequiredEnd.Error.style() },
            "TextField.Xs.RequiredEnd.Edited" to ComposeStyleReference { TextField.Xs.RequiredEnd.Edited.style() },
            "TextField.Xs.OuterLabel.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.Default.style() },
            "TextField.Xs.OuterLabel.Success" to ComposeStyleReference { TextField.Xs.OuterLabel.Success.style() },
            "TextField.Xs.OuterLabel.Warning" to ComposeStyleReference { TextField.Xs.OuterLabel.Warning.style() },
            "TextField.Xs.OuterLabel.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.Error.style() },
            "TextField.Xs.OuterLabel.Edited" to ComposeStyleReference { TextField.Xs.OuterLabel.Edited.style() },
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
            "TextField.Xs.OuterLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextField.Xs.OuterLabel.RequiredEnd.Edited.style()
            },
            "TextField.S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "TextField.S.Success" to ComposeStyleReference { TextField.S.Success.style() },
            "TextField.S.Warning" to ComposeStyleReference { TextField.S.Warning.style() },
            "TextField.S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "TextField.S.Edited" to ComposeStyleReference { TextField.S.Edited.style() },
            "TextField.S.RequiredEnd.Default" to ComposeStyleReference { TextField.S.RequiredEnd.Default.style() },
            "TextField.S.RequiredEnd.Success" to ComposeStyleReference { TextField.S.RequiredEnd.Success.style() },
            "TextField.S.RequiredEnd.Warning" to ComposeStyleReference { TextField.S.RequiredEnd.Warning.style() },
            "TextField.S.RequiredEnd.Error" to ComposeStyleReference { TextField.S.RequiredEnd.Error.style() },
            "TextField.S.RequiredEnd.Edited" to ComposeStyleReference { TextField.S.RequiredEnd.Edited.style() },
            "TextField.S.OuterLabel.Default" to ComposeStyleReference { TextField.S.OuterLabel.Default.style() },
            "TextField.S.OuterLabel.Success" to ComposeStyleReference { TextField.S.OuterLabel.Success.style() },
            "TextField.S.OuterLabel.Warning" to ComposeStyleReference { TextField.S.OuterLabel.Warning.style() },
            "TextField.S.OuterLabel.Error" to ComposeStyleReference { TextField.S.OuterLabel.Error.style() },
            "TextField.S.OuterLabel.Edited" to ComposeStyleReference { TextField.S.OuterLabel.Edited.style() },
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
            "TextField.S.OuterLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextField.S.OuterLabel.RequiredEnd.Edited.style()
            },
            "TextField.S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "TextField.S.InnerLabel.Success" to ComposeStyleReference { TextField.S.InnerLabel.Success.style() },
            "TextField.S.InnerLabel.Warning" to ComposeStyleReference { TextField.S.InnerLabel.Warning.style() },
            "TextField.S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "TextField.S.InnerLabel.Edited" to ComposeStyleReference { TextField.S.InnerLabel.Edited.style() },
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
            "TextField.S.InnerLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Edited.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> TextFieldDefaultSize.Xs
                "S" -> TextFieldDefaultSize.S
                else -> TextFieldDefaultSize.S
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextFieldDefaultRequiredPlacement.None
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
                "Edited" -> TextFieldDefaultView.Edited
                else -> TextFieldDefaultView.Default
            },
        ).key
    }
}
