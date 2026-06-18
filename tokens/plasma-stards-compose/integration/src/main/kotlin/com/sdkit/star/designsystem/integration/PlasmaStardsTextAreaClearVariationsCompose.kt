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
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.L
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextAreaClear
import com.sdkit.star.designsystem.styles.textarea.TextAreaClearLabelPlacement
import com.sdkit.star.designsystem.styles.textarea.TextAreaClearSize
import com.sdkit.star.designsystem.styles.textarea.TextAreaClearView
import com.sdkit.star.designsystem.styles.textarea.TextAreaStyles
import com.sdkit.star.designsystem.styles.textarea.Xs
import com.sdkit.star.designsystem.styles.textarea.resolve

internal object PlasmaStardsTextAreaClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
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
            "TextAreaClear.Xs.Default" to ComposeStyleReference { TextAreaClear.Xs.Default.style() },
            "TextAreaClear.Xs.Error" to ComposeStyleReference { TextAreaClear.Xs.Error.style() },
            "TextAreaClear.Xs.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Default.style() },
            "TextAreaClear.Xs.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Error.style() },
            "TextAreaClear.S.Default" to ComposeStyleReference { TextAreaClear.S.Default.style() },
            "TextAreaClear.S.Error" to ComposeStyleReference { TextAreaClear.S.Error.style() },
            "TextAreaClear.S.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Default.style() },
            "TextAreaClear.S.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Error.style() },
            "TextAreaClear.S.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Default.style() },
            "TextAreaClear.S.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Error.style() },
            "TextAreaClear.M.Default" to ComposeStyleReference { TextAreaClear.M.Default.style() },
            "TextAreaClear.M.Error" to ComposeStyleReference { TextAreaClear.M.Error.style() },
            "TextAreaClear.M.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Default.style() },
            "TextAreaClear.M.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Error.style() },
            "TextAreaClear.M.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Default.style() },
            "TextAreaClear.M.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Error.style() },
            "TextAreaClear.L.Default" to ComposeStyleReference { TextAreaClear.L.Default.style() },
            "TextAreaClear.L.Error" to ComposeStyleReference { TextAreaClear.L.Error.style() },
            "TextAreaClear.L.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Default.style() },
            "TextAreaClear.L.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Error.style() },
            "TextAreaClear.L.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Default.style() },
            "TextAreaClear.L.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Error.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextAreaStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TextAreaClearSize.L
                "M" -> TextAreaClearSize.M
                "S" -> TextAreaClearSize.S
                "Xs" -> TextAreaClearSize.Xs
                else -> TextAreaClearSize.L
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextAreaClearLabelPlacement.None
                "Outer" -> TextAreaClearLabelPlacement.Outer
                "Inner" -> TextAreaClearLabelPlacement.Inner
                else -> TextAreaClearLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextAreaClearView.Default
                "Error" -> TextAreaClearView.Error
                else -> TextAreaClearView.Default
            },
        ).key
    }
}
