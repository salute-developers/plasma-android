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
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextArea
import com.sdkit.star.designsystem.styles.textarea.TextAreaDefaultLabelPlacement
import com.sdkit.star.designsystem.styles.textarea.TextAreaDefaultSize
import com.sdkit.star.designsystem.styles.textarea.TextAreaDefaultView
import com.sdkit.star.designsystem.styles.textarea.TextAreaStyles
import com.sdkit.star.designsystem.styles.textarea.Xs
import com.sdkit.star.designsystem.styles.textarea.resolve

internal object PlasmaStardsTextAreaVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
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
            "TextArea.Xs.Default" to ComposeStyleReference { TextArea.Xs.Default.style() },
            "TextArea.Xs.Error" to ComposeStyleReference { TextArea.Xs.Error.style() },
            "TextArea.Xs.OuterLabel.Default" to ComposeStyleReference { TextArea.Xs.OuterLabel.Default.style() },
            "TextArea.Xs.OuterLabel.Error" to ComposeStyleReference { TextArea.Xs.OuterLabel.Error.style() },
            "TextArea.S.Default" to ComposeStyleReference { TextArea.S.Default.style() },
            "TextArea.S.Error" to ComposeStyleReference { TextArea.S.Error.style() },
            "TextArea.S.OuterLabel.Default" to ComposeStyleReference { TextArea.S.OuterLabel.Default.style() },
            "TextArea.S.OuterLabel.Error" to ComposeStyleReference { TextArea.S.OuterLabel.Error.style() },
            "TextArea.S.InnerLabel.Default" to ComposeStyleReference { TextArea.S.InnerLabel.Default.style() },
            "TextArea.S.InnerLabel.Error" to ComposeStyleReference { TextArea.S.InnerLabel.Error.style() },
            "TextArea.M.Default" to ComposeStyleReference { TextArea.M.Default.style() },
            "TextArea.M.Error" to ComposeStyleReference { TextArea.M.Error.style() },
            "TextArea.M.OuterLabel.Default" to ComposeStyleReference { TextArea.M.OuterLabel.Default.style() },
            "TextArea.M.OuterLabel.Error" to ComposeStyleReference { TextArea.M.OuterLabel.Error.style() },
            "TextArea.M.InnerLabel.Default" to ComposeStyleReference { TextArea.M.InnerLabel.Default.style() },
            "TextArea.M.InnerLabel.Error" to ComposeStyleReference { TextArea.M.InnerLabel.Error.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextAreaStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TextAreaDefaultSize.M
                "S" -> TextAreaDefaultSize.S
                "Xs" -> TextAreaDefaultSize.Xs
                else -> TextAreaDefaultSize.M
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextAreaDefaultLabelPlacement.None
                "Outer" -> TextAreaDefaultLabelPlacement.Outer
                "Inner" -> TextAreaDefaultLabelPlacement.Inner
                else -> TextAreaDefaultLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextAreaDefaultView.Default
                "Error" -> TextAreaDefaultView.Error
                else -> TextAreaDefaultView.Default
            },
        ).key
    }
}
