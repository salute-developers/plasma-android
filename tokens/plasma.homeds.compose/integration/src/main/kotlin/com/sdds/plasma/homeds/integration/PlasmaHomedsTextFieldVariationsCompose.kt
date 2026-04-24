// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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
import com.sdds.plasma.homeds.styles.textfield.TextFieldLabelPlacement
import com.sdds.plasma.homeds.styles.textfield.TextFieldRequiredPlacement
import com.sdds.plasma.homeds.styles.textfield.TextFieldSize
import com.sdds.plasma.homeds.styles.textfield.TextFieldStyles
import com.sdds.plasma.homeds.styles.textfield.TextFieldView
import com.sdds.plasma.homeds.styles.textfield.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "M", "L")),
            Property.SingleChoiceProperty(
                name = "requiredPlacement",
                value = "None",
                variants = listOf("None", "Start", "End"),
            ),
            Property.SingleChoiceProperty(name = "labelPlacement", value = "Inner", variants = listOf("Inner", "None")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Error")),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextField.S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "TextField.S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "TextField.S.RequiredStart.Default" to ComposeStyleReference { TextField.S.RequiredStart.Default.style() },
            "TextField.S.RequiredStart.Error" to ComposeStyleReference { TextField.S.RequiredStart.Error.style() },
            "TextField.S.RequiredEnd.Default" to ComposeStyleReference { TextField.S.RequiredEnd.Default.style() },
            "TextField.S.RequiredEnd.Error" to ComposeStyleReference { TextField.S.RequiredEnd.Error.style() },
            "TextField.S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "TextField.S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "TextField.S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.S.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.S.InnerLabel.RequiredEnd.Error.style()
            },
            "TextField.M.Default" to ComposeStyleReference { TextField.M.Default.style() },
            "TextField.M.Error" to ComposeStyleReference { TextField.M.Error.style() },
            "TextField.M.RequiredStart.Default" to ComposeStyleReference { TextField.M.RequiredStart.Default.style() },
            "TextField.M.RequiredStart.Error" to ComposeStyleReference { TextField.M.RequiredStart.Error.style() },
            "TextField.M.RequiredEnd.Default" to ComposeStyleReference { TextField.M.RequiredEnd.Default.style() },
            "TextField.M.RequiredEnd.Error" to ComposeStyleReference { TextField.M.RequiredEnd.Error.style() },
            "TextField.M.InnerLabel.Default" to ComposeStyleReference { TextField.M.InnerLabel.Default.style() },
            "TextField.M.InnerLabel.Error" to ComposeStyleReference { TextField.M.InnerLabel.Error.style() },
            "TextField.M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.M.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.M.InnerLabel.RequiredEnd.Error.style()
            },
            "TextField.L.Default" to ComposeStyleReference { TextField.L.Default.style() },
            "TextField.L.Error" to ComposeStyleReference { TextField.L.Error.style() },
            "TextField.L.RequiredStart.Default" to ComposeStyleReference { TextField.L.RequiredStart.Default.style() },
            "TextField.L.RequiredStart.Error" to ComposeStyleReference { TextField.L.RequiredStart.Error.style() },
            "TextField.L.RequiredEnd.Default" to ComposeStyleReference { TextField.L.RequiredEnd.Default.style() },
            "TextField.L.RequiredEnd.Error" to ComposeStyleReference { TextField.L.RequiredEnd.Error.style() },
            "TextField.L.InnerLabel.Default" to ComposeStyleReference { TextField.L.InnerLabel.Default.style() },
            "TextField.L.InnerLabel.Error" to ComposeStyleReference { TextField.L.InnerLabel.Error.style() },
            "TextField.L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Default.style()
            },
            "TextField.L.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredStart.Error.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Default.style()
            },
            "TextField.L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextField.L.InnerLabel.RequiredEnd.Error.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> TextFieldSize.S
                "M" -> TextFieldSize.M
                "L" -> TextFieldSize.L
                else -> TextFieldSize.S
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextFieldRequiredPlacement.None
                "Start" -> TextFieldRequiredPlacement.Start
                "End" -> TextFieldRequiredPlacement.End
                else -> TextFieldRequiredPlacement.None
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "Inner" -> TextFieldLabelPlacement.Inner
                "None" -> TextFieldLabelPlacement.None
                else -> TextFieldLabelPlacement.Inner
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldView.Default
                "Error" -> TextFieldView.Error
                else -> TextFieldView.Default
            },
        ).key
    }
}
