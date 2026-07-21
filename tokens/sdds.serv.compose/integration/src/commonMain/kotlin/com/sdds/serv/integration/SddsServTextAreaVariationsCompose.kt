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
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.Error
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.L
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.RequiredEnd
import com.sdds.serv.styles.textarea.RequiredStart
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.TextArea
import com.sdds.serv.styles.textarea.TextAreaDefaultLabelPlacement
import com.sdds.serv.styles.textarea.TextAreaDefaultRequiredPlacement
import com.sdds.serv.styles.textarea.TextAreaDefaultSize
import com.sdds.serv.styles.textarea.TextAreaDefaultView
import com.sdds.serv.styles.textarea.TextAreaStyles
import com.sdds.serv.styles.textarea.Warning
import com.sdds.serv.styles.textarea.Xl
import com.sdds.serv.styles.textarea.Xs
import com.sdds.serv.styles.textarea.resolve

internal object SddsServTextAreaVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
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
                variants = listOf("Default", "Warning", "Error"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextArea.Xs.Default" to ComposeStyleReference { TextArea.Xs.Default.style() },
            "TextArea.Xs.Warning" to ComposeStyleReference { TextArea.Xs.Warning.style() },
            "TextArea.Xs.Error" to ComposeStyleReference { TextArea.Xs.Error.style() },
            "TextArea.Xs.RequiredStart.Default" to ComposeStyleReference { TextArea.Xs.RequiredStart.Default.style() },
            "TextArea.Xs.RequiredStart.Warning" to ComposeStyleReference { TextArea.Xs.RequiredStart.Warning.style() },
            "TextArea.Xs.RequiredStart.Error" to ComposeStyleReference { TextArea.Xs.RequiredStart.Error.style() },
            "TextArea.Xs.RequiredEnd.Default" to ComposeStyleReference { TextArea.Xs.RequiredEnd.Default.style() },
            "TextArea.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextArea.Xs.RequiredEnd.Warning.style() },
            "TextArea.Xs.RequiredEnd.Error" to ComposeStyleReference { TextArea.Xs.RequiredEnd.Error.style() },
            "TextArea.Xs.OuterLabel.Default" to ComposeStyleReference { TextArea.Xs.OuterLabel.Default.style() },
            "TextArea.Xs.OuterLabel.Warning" to ComposeStyleReference { TextArea.Xs.OuterLabel.Warning.style() },
            "TextArea.Xs.OuterLabel.Error" to ComposeStyleReference { TextArea.Xs.OuterLabel.Error.style() },
            "TextArea.Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "TextArea.Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "TextArea.Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredStart.Error.style()
            },
            "TextArea.Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredEnd.Default.style()
            },
            "TextArea.Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextArea.Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextArea.Xs.OuterLabel.RequiredEnd.Error.style()
            },
            "TextArea.S.Default" to ComposeStyleReference { TextArea.S.Default.style() },
            "TextArea.S.Warning" to ComposeStyleReference { TextArea.S.Warning.style() },
            "TextArea.S.Error" to ComposeStyleReference { TextArea.S.Error.style() },
            "TextArea.S.RequiredStart.Default" to ComposeStyleReference { TextArea.S.RequiredStart.Default.style() },
            "TextArea.S.RequiredStart.Warning" to ComposeStyleReference { TextArea.S.RequiredStart.Warning.style() },
            "TextArea.S.RequiredStart.Error" to ComposeStyleReference { TextArea.S.RequiredStart.Error.style() },
            "TextArea.S.RequiredEnd.Default" to ComposeStyleReference { TextArea.S.RequiredEnd.Default.style() },
            "TextArea.S.RequiredEnd.Warning" to ComposeStyleReference { TextArea.S.RequiredEnd.Warning.style() },
            "TextArea.S.RequiredEnd.Error" to ComposeStyleReference { TextArea.S.RequiredEnd.Error.style() },
            "TextArea.S.OuterLabel.Default" to ComposeStyleReference { TextArea.S.OuterLabel.Default.style() },
            "TextArea.S.OuterLabel.Warning" to ComposeStyleReference { TextArea.S.OuterLabel.Warning.style() },
            "TextArea.S.OuterLabel.Error" to ComposeStyleReference { TextArea.S.OuterLabel.Error.style() },
            "TextArea.S.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.S.OuterLabel.RequiredStart.Default.style()
            },
            "TextArea.S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.S.OuterLabel.RequiredStart.Warning.style()
            },
            "TextArea.S.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.S.OuterLabel.RequiredStart.Error.style()
            },
            "TextArea.S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.S.OuterLabel.RequiredEnd.Default.style()
            },
            "TextArea.S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.S.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextArea.S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.S.OuterLabel.RequiredEnd.Error.style() },
            "TextArea.S.InnerLabel.Default" to ComposeStyleReference { TextArea.S.InnerLabel.Default.style() },
            "TextArea.S.InnerLabel.Warning" to ComposeStyleReference { TextArea.S.InnerLabel.Warning.style() },
            "TextArea.S.InnerLabel.Error" to ComposeStyleReference { TextArea.S.InnerLabel.Error.style() },
            "TextArea.S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.S.InnerLabel.RequiredStart.Default.style()
            },
            "TextArea.S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.S.InnerLabel.RequiredStart.Warning.style()
            },
            "TextArea.S.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.S.InnerLabel.RequiredStart.Error.style()
            },
            "TextArea.S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.S.InnerLabel.RequiredEnd.Default.style()
            },
            "TextArea.S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.S.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextArea.S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.S.InnerLabel.RequiredEnd.Error.style() },
            "TextArea.M.Default" to ComposeStyleReference { TextArea.M.Default.style() },
            "TextArea.M.Warning" to ComposeStyleReference { TextArea.M.Warning.style() },
            "TextArea.M.Error" to ComposeStyleReference { TextArea.M.Error.style() },
            "TextArea.M.RequiredStart.Default" to ComposeStyleReference { TextArea.M.RequiredStart.Default.style() },
            "TextArea.M.RequiredStart.Warning" to ComposeStyleReference { TextArea.M.RequiredStart.Warning.style() },
            "TextArea.M.RequiredStart.Error" to ComposeStyleReference { TextArea.M.RequiredStart.Error.style() },
            "TextArea.M.RequiredEnd.Default" to ComposeStyleReference { TextArea.M.RequiredEnd.Default.style() },
            "TextArea.M.RequiredEnd.Warning" to ComposeStyleReference { TextArea.M.RequiredEnd.Warning.style() },
            "TextArea.M.RequiredEnd.Error" to ComposeStyleReference { TextArea.M.RequiredEnd.Error.style() },
            "TextArea.M.OuterLabel.Default" to ComposeStyleReference { TextArea.M.OuterLabel.Default.style() },
            "TextArea.M.OuterLabel.Warning" to ComposeStyleReference { TextArea.M.OuterLabel.Warning.style() },
            "TextArea.M.OuterLabel.Error" to ComposeStyleReference { TextArea.M.OuterLabel.Error.style() },
            "TextArea.M.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.M.OuterLabel.RequiredStart.Default.style()
            },
            "TextArea.M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.M.OuterLabel.RequiredStart.Warning.style()
            },
            "TextArea.M.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.M.OuterLabel.RequiredStart.Error.style()
            },
            "TextArea.M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.M.OuterLabel.RequiredEnd.Default.style()
            },
            "TextArea.M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.M.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextArea.M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.M.OuterLabel.RequiredEnd.Error.style() },
            "TextArea.M.InnerLabel.Default" to ComposeStyleReference { TextArea.M.InnerLabel.Default.style() },
            "TextArea.M.InnerLabel.Warning" to ComposeStyleReference { TextArea.M.InnerLabel.Warning.style() },
            "TextArea.M.InnerLabel.Error" to ComposeStyleReference { TextArea.M.InnerLabel.Error.style() },
            "TextArea.M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.M.InnerLabel.RequiredStart.Default.style()
            },
            "TextArea.M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.M.InnerLabel.RequiredStart.Warning.style()
            },
            "TextArea.M.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.M.InnerLabel.RequiredStart.Error.style()
            },
            "TextArea.M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.M.InnerLabel.RequiredEnd.Default.style()
            },
            "TextArea.M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.M.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextArea.M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.M.InnerLabel.RequiredEnd.Error.style() },
            "TextArea.L.Default" to ComposeStyleReference { TextArea.L.Default.style() },
            "TextArea.L.Warning" to ComposeStyleReference { TextArea.L.Warning.style() },
            "TextArea.L.Error" to ComposeStyleReference { TextArea.L.Error.style() },
            "TextArea.L.RequiredStart.Default" to ComposeStyleReference { TextArea.L.RequiredStart.Default.style() },
            "TextArea.L.RequiredStart.Warning" to ComposeStyleReference { TextArea.L.RequiredStart.Warning.style() },
            "TextArea.L.RequiredStart.Error" to ComposeStyleReference { TextArea.L.RequiredStart.Error.style() },
            "TextArea.L.RequiredEnd.Default" to ComposeStyleReference { TextArea.L.RequiredEnd.Default.style() },
            "TextArea.L.RequiredEnd.Warning" to ComposeStyleReference { TextArea.L.RequiredEnd.Warning.style() },
            "TextArea.L.RequiredEnd.Error" to ComposeStyleReference { TextArea.L.RequiredEnd.Error.style() },
            "TextArea.L.OuterLabel.Default" to ComposeStyleReference { TextArea.L.OuterLabel.Default.style() },
            "TextArea.L.OuterLabel.Warning" to ComposeStyleReference { TextArea.L.OuterLabel.Warning.style() },
            "TextArea.L.OuterLabel.Error" to ComposeStyleReference { TextArea.L.OuterLabel.Error.style() },
            "TextArea.L.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.L.OuterLabel.RequiredStart.Default.style()
            },
            "TextArea.L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.L.OuterLabel.RequiredStart.Warning.style()
            },
            "TextArea.L.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.L.OuterLabel.RequiredStart.Error.style()
            },
            "TextArea.L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.L.OuterLabel.RequiredEnd.Default.style()
            },
            "TextArea.L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.L.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextArea.L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.L.OuterLabel.RequiredEnd.Error.style() },
            "TextArea.L.InnerLabel.Default" to ComposeStyleReference { TextArea.L.InnerLabel.Default.style() },
            "TextArea.L.InnerLabel.Warning" to ComposeStyleReference { TextArea.L.InnerLabel.Warning.style() },
            "TextArea.L.InnerLabel.Error" to ComposeStyleReference { TextArea.L.InnerLabel.Error.style() },
            "TextArea.L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.L.InnerLabel.RequiredStart.Default.style()
            },
            "TextArea.L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.L.InnerLabel.RequiredStart.Warning.style()
            },
            "TextArea.L.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.L.InnerLabel.RequiredStart.Error.style()
            },
            "TextArea.L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.L.InnerLabel.RequiredEnd.Default.style()
            },
            "TextArea.L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.L.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextArea.L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference { TextArea.L.InnerLabel.RequiredEnd.Error.style() },
            "TextArea.Xl.Default" to ComposeStyleReference { TextArea.Xl.Default.style() },
            "TextArea.Xl.Warning" to ComposeStyleReference { TextArea.Xl.Warning.style() },
            "TextArea.Xl.Error" to ComposeStyleReference { TextArea.Xl.Error.style() },
            "TextArea.Xl.RequiredStart.Default" to ComposeStyleReference { TextArea.Xl.RequiredStart.Default.style() },
            "TextArea.Xl.RequiredStart.Warning" to ComposeStyleReference { TextArea.Xl.RequiredStart.Warning.style() },
            "TextArea.Xl.RequiredStart.Error" to ComposeStyleReference { TextArea.Xl.RequiredStart.Error.style() },
            "TextArea.Xl.RequiredEnd.Default" to ComposeStyleReference { TextArea.Xl.RequiredEnd.Default.style() },
            "TextArea.Xl.RequiredEnd.Warning" to ComposeStyleReference { TextArea.Xl.RequiredEnd.Warning.style() },
            "TextArea.Xl.RequiredEnd.Error" to ComposeStyleReference { TextArea.Xl.RequiredEnd.Error.style() },
            "TextArea.Xl.OuterLabel.Default" to ComposeStyleReference { TextArea.Xl.OuterLabel.Default.style() },
            "TextArea.Xl.OuterLabel.Warning" to ComposeStyleReference { TextArea.Xl.OuterLabel.Warning.style() },
            "TextArea.Xl.OuterLabel.Error" to ComposeStyleReference { TextArea.Xl.OuterLabel.Error.style() },
            "TextArea.Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "TextArea.Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "TextArea.Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredStart.Error.style()
            },
            "TextArea.Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredEnd.Default.style()
            },
            "TextArea.Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextArea.Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextArea.Xl.OuterLabel.RequiredEnd.Error.style()
            },
            "TextArea.Xl.InnerLabel.Default" to ComposeStyleReference { TextArea.Xl.InnerLabel.Default.style() },
            "TextArea.Xl.InnerLabel.Warning" to ComposeStyleReference { TextArea.Xl.InnerLabel.Warning.style() },
            "TextArea.Xl.InnerLabel.Error" to ComposeStyleReference { TextArea.Xl.InnerLabel.Error.style() },
            "TextArea.Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "TextArea.Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "TextArea.Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredStart.Error.style()
            },
            "TextArea.Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredEnd.Default.style()
            },
            "TextArea.Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextArea.Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextArea.Xl.InnerLabel.RequiredEnd.Error.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextAreaStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> TextAreaDefaultSize.Xs
                "S" -> TextAreaDefaultSize.S
                "M" -> TextAreaDefaultSize.M
                "L" -> TextAreaDefaultSize.L
                "Xl" -> TextAreaDefaultSize.Xl
                else -> TextAreaDefaultSize.Xs
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextAreaDefaultRequiredPlacement.None
                "Start" -> TextAreaDefaultRequiredPlacement.Start
                "End" -> TextAreaDefaultRequiredPlacement.End
                else -> TextAreaDefaultRequiredPlacement.None
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextAreaDefaultLabelPlacement.None
                "Outer" -> TextAreaDefaultLabelPlacement.Outer
                "Inner" -> TextAreaDefaultLabelPlacement.Inner
                else -> TextAreaDefaultLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextAreaDefaultView.Default
                "Warning" -> TextAreaDefaultView.Warning
                "Error" -> TextAreaDefaultView.Error
                else -> TextAreaDefaultView.Default
            },
        ).key
    }
}
