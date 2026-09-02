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
import com.sdds.finai.styles.textfield.TextFieldClear
import com.sdds.finai.styles.textfield.TextFieldClearLabelPlacement
import com.sdds.finai.styles.textfield.TextFieldClearRequiredPlacement
import com.sdds.finai.styles.textfield.TextFieldClearSize
import com.sdds.finai.styles.textfield.TextFieldClearView
import com.sdds.finai.styles.textfield.TextFieldStyles
import com.sdds.finai.styles.textfield.Warning
import com.sdds.finai.styles.textfield.Xs
import com.sdds.finai.styles.textfield.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiTextFieldClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S")),
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
            "TextFieldClear.Xs.Default" to ComposeStyleReference { TextFieldClear.Xs.Default.style() },
            "TextFieldClear.Xs.Success" to ComposeStyleReference { TextFieldClear.Xs.Success.style() },
            "TextFieldClear.Xs.Warning" to ComposeStyleReference { TextFieldClear.Xs.Warning.style() },
            "TextFieldClear.Xs.Error" to ComposeStyleReference { TextFieldClear.Xs.Error.style() },
            "TextFieldClear.Xs.Edited" to ComposeStyleReference { TextFieldClear.Xs.Edited.style() },
            "TextFieldClear.Xs.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Default.style() },
            "TextFieldClear.Xs.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Success.style() },
            "TextFieldClear.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Warning.style() },
            "TextFieldClear.Xs.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Error.style() },
            "TextFieldClear.Xs.RequiredEnd.Edited" to ComposeStyleReference { TextFieldClear.Xs.RequiredEnd.Edited.style() },
            "TextFieldClear.Xs.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Default.style() },
            "TextFieldClear.Xs.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Success.style() },
            "TextFieldClear.Xs.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Warning.style() },
            "TextFieldClear.Xs.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Error.style() },
            "TextFieldClear.Xs.OuterLabel.Edited" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Edited.style() },
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
            "TextFieldClear.Xs.OuterLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextFieldClear.Xs.OuterLabel.RequiredEnd.Edited.style()
            },
            "TextFieldClear.S.Default" to ComposeStyleReference { TextFieldClear.S.Default.style() },
            "TextFieldClear.S.Success" to ComposeStyleReference { TextFieldClear.S.Success.style() },
            "TextFieldClear.S.Warning" to ComposeStyleReference { TextFieldClear.S.Warning.style() },
            "TextFieldClear.S.Error" to ComposeStyleReference { TextFieldClear.S.Error.style() },
            "TextFieldClear.S.Edited" to ComposeStyleReference { TextFieldClear.S.Edited.style() },
            "TextFieldClear.S.RequiredEnd.Default" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Default.style() },
            "TextFieldClear.S.RequiredEnd.Success" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Success.style() },
            "TextFieldClear.S.RequiredEnd.Warning" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Warning.style() },
            "TextFieldClear.S.RequiredEnd.Error" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Error.style() },
            "TextFieldClear.S.RequiredEnd.Edited" to ComposeStyleReference { TextFieldClear.S.RequiredEnd.Edited.style() },
            "TextFieldClear.S.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Default.style() },
            "TextFieldClear.S.OuterLabel.Success" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Success.style() },
            "TextFieldClear.S.OuterLabel.Warning" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Warning.style() },
            "TextFieldClear.S.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Error.style() },
            "TextFieldClear.S.OuterLabel.Edited" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Edited.style() },
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
            "TextFieldClear.S.OuterLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextFieldClear.S.OuterLabel.RequiredEnd.Edited.style()
            },
            "TextFieldClear.S.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Default.style() },
            "TextFieldClear.S.InnerLabel.Success" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Success.style() },
            "TextFieldClear.S.InnerLabel.Warning" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Warning.style() },
            "TextFieldClear.S.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Error.style() },
            "TextFieldClear.S.InnerLabel.Edited" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Edited.style() },
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
            "TextFieldClear.S.InnerLabel.RequiredEnd.Edited" to ComposeStyleReference {
                TextFieldClear.S.InnerLabel.RequiredEnd.Edited.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> TextFieldClearSize.Xs
                "S" -> TextFieldClearSize.S
                else -> TextFieldClearSize.Xs
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextFieldClearRequiredPlacement.None
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
                "Edited" -> TextFieldClearView.Edited
                else -> TextFieldClearView.Default
            },
        ).key
    }
}
