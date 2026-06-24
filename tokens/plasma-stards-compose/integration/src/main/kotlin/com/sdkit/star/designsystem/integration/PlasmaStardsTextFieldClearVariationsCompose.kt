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
import com.sdkit.star.designsystem.styles.textfield.L
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextFieldClear
import com.sdkit.star.designsystem.styles.textfield.TextFieldClearLabelPlacement
import com.sdkit.star.designsystem.styles.textfield.TextFieldClearSize
import com.sdkit.star.designsystem.styles.textfield.TextFieldClearView
import com.sdkit.star.designsystem.styles.textfield.TextFieldStyles
import com.sdkit.star.designsystem.styles.textfield.Xs
import com.sdkit.star.designsystem.styles.textfield.resolve

internal object PlasmaStardsTextFieldClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "labelPlacement",
                value = "None",
                variants = listOf("None", "Outer", "Inner"),
            ),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Error")),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextFieldClear.Xs.Default" to ComposeStyleReference { TextFieldClear.Xs.Default.style() },
            "TextFieldClear.Xs.Error" to ComposeStyleReference { TextFieldClear.Xs.Error.style() },
            "TextFieldClear.Xs.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Default.style() },
            "TextFieldClear.Xs.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Error.style() },
            "TextFieldClear.S.Default" to ComposeStyleReference { TextFieldClear.S.Default.style() },
            "TextFieldClear.S.Error" to ComposeStyleReference { TextFieldClear.S.Error.style() },
            "TextFieldClear.S.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Default.style() },
            "TextFieldClear.S.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Error.style() },
            "TextFieldClear.S.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Default.style() },
            "TextFieldClear.S.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Error.style() },
            "TextFieldClear.M.Default" to ComposeStyleReference { TextFieldClear.M.Default.style() },
            "TextFieldClear.M.Error" to ComposeStyleReference { TextFieldClear.M.Error.style() },
            "TextFieldClear.M.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Default.style() },
            "TextFieldClear.M.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Error.style() },
            "TextFieldClear.M.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Default.style() },
            "TextFieldClear.M.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Error.style() },
            "TextFieldClear.L.Default" to ComposeStyleReference { TextFieldClear.L.Default.style() },
            "TextFieldClear.L.Error" to ComposeStyleReference { TextFieldClear.L.Error.style() },
            "TextFieldClear.L.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Default.style() },
            "TextFieldClear.L.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Error.style() },
            "TextFieldClear.L.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Default.style() },
            "TextFieldClear.L.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Error.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TextFieldClearSize.L
                "M" -> TextFieldClearSize.M
                "S" -> TextFieldClearSize.S
                "Xs" -> TextFieldClearSize.Xs
                else -> TextFieldClearSize.L
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextFieldClearLabelPlacement.None
                "Outer" -> TextFieldClearLabelPlacement.Outer
                "Inner" -> TextFieldClearLabelPlacement.Inner
                else -> TextFieldClearLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldClearView.Default
                "Error" -> TextFieldClearView.Error
                else -> TextFieldClearView.Default
            },
        ).key
    }
}
