// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textfield.TextFieldDefaultLabelPlacement
import com.sdkit.star.designsystem.styles.textfield.TextFieldDefaultSize
import com.sdkit.star.designsystem.styles.textfield.TextFieldDefaultView
import com.sdkit.star.designsystem.styles.textfield.TextFieldStyles
import com.sdkit.star.designsystem.styles.textfield.Xs
import com.sdkit.star.designsystem.styles.textfield.resolve

internal object PlasmaStardsTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "labelPlacement",
                value = "None",
                variants = listOf("None", "Outer", "Inner"),
            ),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Error")),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextField.Xs.Default" to ComposeStyleReference { TextField.Xs.Default.style() },
            "TextField.Xs.Error" to ComposeStyleReference { TextField.Xs.Error.style() },
            "TextField.Xs.OuterLabel.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.Default.style() },
            "TextField.Xs.OuterLabel.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.Error.style() },
            "TextField.S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "TextField.S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "TextField.S.OuterLabel.Default" to ComposeStyleReference { TextField.S.OuterLabel.Default.style() },
            "TextField.S.OuterLabel.Error" to ComposeStyleReference { TextField.S.OuterLabel.Error.style() },
            "TextField.S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "TextField.S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "TextField.M.Default" to ComposeStyleReference { TextField.M.Default.style() },
            "TextField.M.Error" to ComposeStyleReference { TextField.M.Error.style() },
            "TextField.M.OuterLabel.Default" to ComposeStyleReference { TextField.M.OuterLabel.Default.style() },
            "TextField.M.OuterLabel.Error" to ComposeStyleReference { TextField.M.OuterLabel.Error.style() },
            "TextField.M.InnerLabel.Default" to ComposeStyleReference { TextField.M.InnerLabel.Default.style() },
            "TextField.M.InnerLabel.Error" to ComposeStyleReference { TextField.M.InnerLabel.Error.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TextFieldDefaultSize.M
                "S" -> TextFieldDefaultSize.S
                "Xs" -> TextFieldDefaultSize.Xs
                else -> TextFieldDefaultSize.M
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextFieldDefaultLabelPlacement.None
                "Outer" -> TextFieldDefaultLabelPlacement.Outer
                "Inner" -> TextFieldDefaultLabelPlacement.Inner
                else -> TextFieldDefaultLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldDefaultView.Default
                "Error" -> TextFieldDefaultView.Error
                else -> TextFieldDefaultView.Default
            },
        ).key
    }
}
