// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.textarea.Default
import com.sdds.plasma.sd.service.styles.textarea.Error
import com.sdds.plasma.sd.service.styles.textarea.InnerLabel
import com.sdds.plasma.sd.service.styles.textarea.L
import com.sdds.plasma.sd.service.styles.textarea.M
import com.sdds.plasma.sd.service.styles.textarea.OuterLabel
import com.sdds.plasma.sd.service.styles.textarea.RequiredEnd
import com.sdds.plasma.sd.service.styles.textarea.RequiredStart
import com.sdds.plasma.sd.service.styles.textarea.S
import com.sdds.plasma.sd.service.styles.textarea.TextAreaClear
import com.sdds.plasma.sd.service.styles.textarea.TextAreaClearLabelPlacement
import com.sdds.plasma.sd.service.styles.textarea.TextAreaClearRequiredPlacement
import com.sdds.plasma.sd.service.styles.textarea.TextAreaClearSize
import com.sdds.plasma.sd.service.styles.textarea.TextAreaClearView
import com.sdds.plasma.sd.service.styles.textarea.TextAreaStyles
import com.sdds.plasma.sd.service.styles.textarea.Warning
import com.sdds.plasma.sd.service.styles.textarea.Xl
import com.sdds.plasma.sd.service.styles.textarea.Xs
import com.sdds.plasma.sd.service.styles.textarea.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cTextAreaClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
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
            "TextAreaClear.Xs.Default" to ComposeStyleReference { TextAreaClear.Xs.Default.style() },
            "TextAreaClear.Xs.Warning" to ComposeStyleReference { TextAreaClear.Xs.Warning.style() },
            "TextAreaClear.Xs.Error" to ComposeStyleReference { TextAreaClear.Xs.Error.style() },
            "TextAreaClear.Xs.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Default.style() },
            "TextAreaClear.Xs.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Warning.style() },
            "TextAreaClear.Xs.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.Xs.RequiredStart.Error.style() },
            "TextAreaClear.Xs.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Default.style() },
            "TextAreaClear.Xs.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Warning.style() },
            "TextAreaClear.Xs.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xs.RequiredEnd.Error.style() },
            "TextAreaClear.Xs.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Default.style() },
            "TextAreaClear.Xs.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Warning.style() },
            "TextAreaClear.Xs.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Error.style() },
            "TextAreaClear.Xs.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.Xs.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.Xs.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.Xs.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.Xs.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.Xs.OuterLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.S.Default" to ComposeStyleReference { TextAreaClear.S.Default.style() },
            "TextAreaClear.S.Warning" to ComposeStyleReference { TextAreaClear.S.Warning.style() },
            "TextAreaClear.S.Error" to ComposeStyleReference { TextAreaClear.S.Error.style() },
            "TextAreaClear.S.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Default.style() },
            "TextAreaClear.S.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Warning.style() },
            "TextAreaClear.S.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.S.RequiredStart.Error.style() },
            "TextAreaClear.S.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Default.style() },
            "TextAreaClear.S.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Warning.style() },
            "TextAreaClear.S.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.S.RequiredEnd.Error.style() },
            "TextAreaClear.S.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Default.style() },
            "TextAreaClear.S.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Warning.style() },
            "TextAreaClear.S.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Error.style() },
            "TextAreaClear.S.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.S.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.S.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.S.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.S.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.S.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.S.OuterLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.S.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Default.style() },
            "TextAreaClear.S.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Warning.style() },
            "TextAreaClear.S.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Error.style() },
            "TextAreaClear.S.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.S.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.S.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.S.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.S.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.S.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.S.InnerLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.M.Default" to ComposeStyleReference { TextAreaClear.M.Default.style() },
            "TextAreaClear.M.Warning" to ComposeStyleReference { TextAreaClear.M.Warning.style() },
            "TextAreaClear.M.Error" to ComposeStyleReference { TextAreaClear.M.Error.style() },
            "TextAreaClear.M.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Default.style() },
            "TextAreaClear.M.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Warning.style() },
            "TextAreaClear.M.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.M.RequiredStart.Error.style() },
            "TextAreaClear.M.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Default.style() },
            "TextAreaClear.M.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Warning.style() },
            "TextAreaClear.M.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.M.RequiredEnd.Error.style() },
            "TextAreaClear.M.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Default.style() },
            "TextAreaClear.M.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Warning.style() },
            "TextAreaClear.M.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Error.style() },
            "TextAreaClear.M.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.M.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.M.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.M.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.M.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.M.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.M.OuterLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.M.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Default.style() },
            "TextAreaClear.M.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Warning.style() },
            "TextAreaClear.M.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Error.style() },
            "TextAreaClear.M.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.M.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.M.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.M.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.M.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.M.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.M.InnerLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.L.Default" to ComposeStyleReference { TextAreaClear.L.Default.style() },
            "TextAreaClear.L.Warning" to ComposeStyleReference { TextAreaClear.L.Warning.style() },
            "TextAreaClear.L.Error" to ComposeStyleReference { TextAreaClear.L.Error.style() },
            "TextAreaClear.L.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Default.style() },
            "TextAreaClear.L.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Warning.style() },
            "TextAreaClear.L.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.L.RequiredStart.Error.style() },
            "TextAreaClear.L.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Default.style() },
            "TextAreaClear.L.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Warning.style() },
            "TextAreaClear.L.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.L.RequiredEnd.Error.style() },
            "TextAreaClear.L.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Default.style() },
            "TextAreaClear.L.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Warning.style() },
            "TextAreaClear.L.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Error.style() },
            "TextAreaClear.L.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.L.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.L.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.L.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.L.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.L.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.L.OuterLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.L.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Default.style() },
            "TextAreaClear.L.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Warning.style() },
            "TextAreaClear.L.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Error.style() },
            "TextAreaClear.L.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.L.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.L.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.L.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.L.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.L.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.L.InnerLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.Xl.Default" to ComposeStyleReference { TextAreaClear.Xl.Default.style() },
            "TextAreaClear.Xl.Warning" to ComposeStyleReference { TextAreaClear.Xl.Warning.style() },
            "TextAreaClear.Xl.Error" to ComposeStyleReference { TextAreaClear.Xl.Error.style() },
            "TextAreaClear.Xl.RequiredStart.Default" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Default.style() },
            "TextAreaClear.Xl.RequiredStart.Warning" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Warning.style() },
            "TextAreaClear.Xl.RequiredStart.Error" to ComposeStyleReference { TextAreaClear.Xl.RequiredStart.Error.style() },
            "TextAreaClear.Xl.RequiredEnd.Default" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Default.style() },
            "TextAreaClear.Xl.RequiredEnd.Warning" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Warning.style() },
            "TextAreaClear.Xl.RequiredEnd.Error" to ComposeStyleReference { TextAreaClear.Xl.RequiredEnd.Error.style() },
            "TextAreaClear.Xl.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Default.style() },
            "TextAreaClear.Xl.OuterLabel.Warning" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Warning.style() },
            "TextAreaClear.Xl.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xl.OuterLabel.Error.style() },
            "TextAreaClear.Xl.OuterLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.Xl.OuterLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.Xl.OuterLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.Xl.OuterLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.Xl.OuterLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.Xl.OuterLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.Xl.OuterLabel.RequiredEnd.Error.style()
            },
            "TextAreaClear.Xl.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Default.style() },
            "TextAreaClear.Xl.InnerLabel.Warning" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Warning.style() },
            "TextAreaClear.Xl.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.Xl.InnerLabel.Error.style() },
            "TextAreaClear.Xl.InnerLabel.RequiredStart.Default" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Default.style()
            },
            "TextAreaClear.Xl.InnerLabel.RequiredStart.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Warning.style()
            },
            "TextAreaClear.Xl.InnerLabel.RequiredStart.Error" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredStart.Error.style()
            },
            "TextAreaClear.Xl.InnerLabel.RequiredEnd.Default" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredEnd.Default.style()
            },
            "TextAreaClear.Xl.InnerLabel.RequiredEnd.Warning" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredEnd.Warning.style()
            },
            "TextAreaClear.Xl.InnerLabel.RequiredEnd.Error" to ComposeStyleReference {
                TextAreaClear.Xl.InnerLabel.RequiredEnd.Error.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextAreaStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> TextAreaClearSize.Xs
                "S" -> TextAreaClearSize.S
                "M" -> TextAreaClearSize.M
                "L" -> TextAreaClearSize.L
                "Xl" -> TextAreaClearSize.Xl
                else -> TextAreaClearSize.Xs
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> TextAreaClearRequiredPlacement.None
                "Start" -> TextAreaClearRequiredPlacement.Start
                "End" -> TextAreaClearRequiredPlacement.End
                else -> TextAreaClearRequiredPlacement.None
            },
            labelPlacement = when (bindings["labelPlacement"]?.toString()) {
                "None" -> TextAreaClearLabelPlacement.None
                "Outer" -> TextAreaClearLabelPlacement.Outer
                "Inner" -> TextAreaClearLabelPlacement.Inner
                else -> TextAreaClearLabelPlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextAreaClearView.Default
                "Warning" -> TextAreaClearView.Warning
                "Error" -> TextAreaClearView.Error
                else -> TextAreaClearView.Default
            },
        ).key
    }
}
