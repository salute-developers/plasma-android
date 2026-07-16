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
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.formitem.Default
import com.sdds.serv.styles.formitem.FormItem
import com.sdds.serv.styles.formitem.FormItemRequiredPlacement
import com.sdds.serv.styles.formitem.FormItemSize
import com.sdds.serv.styles.formitem.FormItemStyles
import com.sdds.serv.styles.formitem.FormItemTitlePlacement
import com.sdds.serv.styles.formitem.FormItemView
import com.sdds.serv.styles.formitem.L
import com.sdds.serv.styles.formitem.M
import com.sdds.serv.styles.formitem.Negative
import com.sdds.serv.styles.formitem.Positive
import com.sdds.serv.styles.formitem.RequiredEnd
import com.sdds.serv.styles.formitem.RequiredStart
import com.sdds.serv.styles.formitem.S
import com.sdds.serv.styles.formitem.TitleStart
import com.sdds.serv.styles.formitem.TitleTop
import com.sdds.serv.styles.formitem.Warning
import com.sdds.serv.styles.formitem.Xs
import com.sdds.serv.styles.formitem.resolve

internal object SddsServFormItemVariationsCompose : ComposeStyleProvider<FormItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(
                name = "requiredPlacement",
                value = "None",
                variants = listOf("None", "Start", "End"),
            ),
            Property.SingleChoiceProperty(
                name = "titlePlacement",
                value = "None",
                variants = listOf("None", "Top", "Start"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<FormItemStyle>> =
        mapOf(
            "FormItem.Xs.Default" to ComposeStyleReference { FormItem.Xs.Default.style() },
            "FormItem.Xs.Positive" to ComposeStyleReference { FormItem.Xs.Positive.style() },
            "FormItem.Xs.Negative" to ComposeStyleReference { FormItem.Xs.Negative.style() },
            "FormItem.Xs.Warning" to ComposeStyleReference { FormItem.Xs.Warning.style() },
            "FormItem.Xs.RequiredStart.Default" to ComposeStyleReference { FormItem.Xs.RequiredStart.Default.style() },
            "FormItem.Xs.RequiredStart.Positive" to ComposeStyleReference { FormItem.Xs.RequiredStart.Positive.style() },
            "FormItem.Xs.RequiredStart.Negative" to ComposeStyleReference { FormItem.Xs.RequiredStart.Negative.style() },
            "FormItem.Xs.RequiredStart.Warning" to ComposeStyleReference { FormItem.Xs.RequiredStart.Warning.style() },
            "FormItem.Xs.RequiredEnd.Default" to ComposeStyleReference { FormItem.Xs.RequiredEnd.Default.style() },
            "FormItem.Xs.RequiredEnd.Positive" to ComposeStyleReference { FormItem.Xs.RequiredEnd.Positive.style() },
            "FormItem.Xs.RequiredEnd.Negative" to ComposeStyleReference { FormItem.Xs.RequiredEnd.Negative.style() },
            "FormItem.Xs.RequiredEnd.Warning" to ComposeStyleReference { FormItem.Xs.RequiredEnd.Warning.style() },
            "FormItem.Xs.TitleTop.Default" to ComposeStyleReference { FormItem.Xs.TitleTop.Default.style() },
            "FormItem.Xs.TitleTop.Positive" to ComposeStyleReference { FormItem.Xs.TitleTop.Positive.style() },
            "FormItem.Xs.TitleTop.Negative" to ComposeStyleReference { FormItem.Xs.TitleTop.Negative.style() },
            "FormItem.Xs.TitleTop.Warning" to ComposeStyleReference { FormItem.Xs.TitleTop.Warning.style() },
            "FormItem.Xs.TitleTop.RequiredStart.Default" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredStart.Default.style()
            },
            "FormItem.Xs.TitleTop.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredStart.Positive.style()
            },
            "FormItem.Xs.TitleTop.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredStart.Negative.style()
            },
            "FormItem.Xs.TitleTop.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredStart.Warning.style()
            },
            "FormItem.Xs.TitleTop.RequiredEnd.Default" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredEnd.Default.style()
            },
            "FormItem.Xs.TitleTop.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredEnd.Positive.style()
            },
            "FormItem.Xs.TitleTop.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredEnd.Negative.style()
            },
            "FormItem.Xs.TitleTop.RequiredEnd.Warning" to ComposeStyleReference {
                FormItem.Xs.TitleTop.RequiredEnd.Warning.style()
            },
            "FormItem.Xs.TitleStart.Default" to ComposeStyleReference { FormItem.Xs.TitleStart.Default.style() },
            "FormItem.Xs.TitleStart.Positive" to ComposeStyleReference { FormItem.Xs.TitleStart.Positive.style() },
            "FormItem.Xs.TitleStart.Negative" to ComposeStyleReference { FormItem.Xs.TitleStart.Negative.style() },
            "FormItem.Xs.TitleStart.Warning" to ComposeStyleReference { FormItem.Xs.TitleStart.Warning.style() },
            "FormItem.Xs.TitleStart.RequiredStart.Default" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredStart.Default.style()
            },
            "FormItem.Xs.TitleStart.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredStart.Positive.style()
            },
            "FormItem.Xs.TitleStart.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredStart.Negative.style()
            },
            "FormItem.Xs.TitleStart.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredStart.Warning.style()
            },
            "FormItem.Xs.TitleStart.RequiredEnd.Default" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredEnd.Default.style()
            },
            "FormItem.Xs.TitleStart.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredEnd.Positive.style()
            },
            "FormItem.Xs.TitleStart.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredEnd.Negative.style()
            },
            "FormItem.Xs.TitleStart.RequiredEnd.Warning" to ComposeStyleReference {
                FormItem.Xs.TitleStart.RequiredEnd.Warning.style()
            },
            "FormItem.S.Default" to ComposeStyleReference { FormItem.S.Default.style() },
            "FormItem.S.Positive" to ComposeStyleReference { FormItem.S.Positive.style() },
            "FormItem.S.Negative" to ComposeStyleReference { FormItem.S.Negative.style() },
            "FormItem.S.Warning" to ComposeStyleReference { FormItem.S.Warning.style() },
            "FormItem.S.RequiredStart.Default" to ComposeStyleReference { FormItem.S.RequiredStart.Default.style() },
            "FormItem.S.RequiredStart.Positive" to ComposeStyleReference { FormItem.S.RequiredStart.Positive.style() },
            "FormItem.S.RequiredStart.Negative" to ComposeStyleReference { FormItem.S.RequiredStart.Negative.style() },
            "FormItem.S.RequiredStart.Warning" to ComposeStyleReference { FormItem.S.RequiredStart.Warning.style() },
            "FormItem.S.RequiredEnd.Default" to ComposeStyleReference { FormItem.S.RequiredEnd.Default.style() },
            "FormItem.S.RequiredEnd.Positive" to ComposeStyleReference { FormItem.S.RequiredEnd.Positive.style() },
            "FormItem.S.RequiredEnd.Negative" to ComposeStyleReference { FormItem.S.RequiredEnd.Negative.style() },
            "FormItem.S.RequiredEnd.Warning" to ComposeStyleReference { FormItem.S.RequiredEnd.Warning.style() },
            "FormItem.S.TitleTop.Default" to ComposeStyleReference { FormItem.S.TitleTop.Default.style() },
            "FormItem.S.TitleTop.Positive" to ComposeStyleReference { FormItem.S.TitleTop.Positive.style() },
            "FormItem.S.TitleTop.Negative" to ComposeStyleReference { FormItem.S.TitleTop.Negative.style() },
            "FormItem.S.TitleTop.Warning" to ComposeStyleReference { FormItem.S.TitleTop.Warning.style() },
            "FormItem.S.TitleTop.RequiredStart.Default" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredStart.Default.style()
            },
            "FormItem.S.TitleTop.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredStart.Positive.style()
            },
            "FormItem.S.TitleTop.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredStart.Negative.style()
            },
            "FormItem.S.TitleTop.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredStart.Warning.style()
            },
            "FormItem.S.TitleTop.RequiredEnd.Default" to ComposeStyleReference { FormItem.S.TitleTop.RequiredEnd.Default.style() },
            "FormItem.S.TitleTop.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredEnd.Positive.style()
            },
            "FormItem.S.TitleTop.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.S.TitleTop.RequiredEnd.Negative.style()
            },
            "FormItem.S.TitleTop.RequiredEnd.Warning" to ComposeStyleReference { FormItem.S.TitleTop.RequiredEnd.Warning.style() },
            "FormItem.S.TitleStart.Default" to ComposeStyleReference { FormItem.S.TitleStart.Default.style() },
            "FormItem.S.TitleStart.Positive" to ComposeStyleReference { FormItem.S.TitleStart.Positive.style() },
            "FormItem.S.TitleStart.Negative" to ComposeStyleReference { FormItem.S.TitleStart.Negative.style() },
            "FormItem.S.TitleStart.Warning" to ComposeStyleReference { FormItem.S.TitleStart.Warning.style() },
            "FormItem.S.TitleStart.RequiredStart.Default" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredStart.Default.style()
            },
            "FormItem.S.TitleStart.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredStart.Positive.style()
            },
            "FormItem.S.TitleStart.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredStart.Negative.style()
            },
            "FormItem.S.TitleStart.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredStart.Warning.style()
            },
            "FormItem.S.TitleStart.RequiredEnd.Default" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredEnd.Default.style()
            },
            "FormItem.S.TitleStart.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredEnd.Positive.style()
            },
            "FormItem.S.TitleStart.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredEnd.Negative.style()
            },
            "FormItem.S.TitleStart.RequiredEnd.Warning" to ComposeStyleReference {
                FormItem.S.TitleStart.RequiredEnd.Warning.style()
            },
            "FormItem.M.Default" to ComposeStyleReference { FormItem.M.Default.style() },
            "FormItem.M.Positive" to ComposeStyleReference { FormItem.M.Positive.style() },
            "FormItem.M.Negative" to ComposeStyleReference { FormItem.M.Negative.style() },
            "FormItem.M.Warning" to ComposeStyleReference { FormItem.M.Warning.style() },
            "FormItem.M.RequiredStart.Default" to ComposeStyleReference { FormItem.M.RequiredStart.Default.style() },
            "FormItem.M.RequiredStart.Positive" to ComposeStyleReference { FormItem.M.RequiredStart.Positive.style() },
            "FormItem.M.RequiredStart.Negative" to ComposeStyleReference { FormItem.M.RequiredStart.Negative.style() },
            "FormItem.M.RequiredStart.Warning" to ComposeStyleReference { FormItem.M.RequiredStart.Warning.style() },
            "FormItem.M.RequiredEnd.Default" to ComposeStyleReference { FormItem.M.RequiredEnd.Default.style() },
            "FormItem.M.RequiredEnd.Positive" to ComposeStyleReference { FormItem.M.RequiredEnd.Positive.style() },
            "FormItem.M.RequiredEnd.Negative" to ComposeStyleReference { FormItem.M.RequiredEnd.Negative.style() },
            "FormItem.M.RequiredEnd.Warning" to ComposeStyleReference { FormItem.M.RequiredEnd.Warning.style() },
            "FormItem.M.TitleTop.Default" to ComposeStyleReference { FormItem.M.TitleTop.Default.style() },
            "FormItem.M.TitleTop.Positive" to ComposeStyleReference { FormItem.M.TitleTop.Positive.style() },
            "FormItem.M.TitleTop.Negative" to ComposeStyleReference { FormItem.M.TitleTop.Negative.style() },
            "FormItem.M.TitleTop.Warning" to ComposeStyleReference { FormItem.M.TitleTop.Warning.style() },
            "FormItem.M.TitleTop.RequiredStart.Default" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredStart.Default.style()
            },
            "FormItem.M.TitleTop.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredStart.Positive.style()
            },
            "FormItem.M.TitleTop.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredStart.Negative.style()
            },
            "FormItem.M.TitleTop.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredStart.Warning.style()
            },
            "FormItem.M.TitleTop.RequiredEnd.Default" to ComposeStyleReference { FormItem.M.TitleTop.RequiredEnd.Default.style() },
            "FormItem.M.TitleTop.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredEnd.Positive.style()
            },
            "FormItem.M.TitleTop.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.M.TitleTop.RequiredEnd.Negative.style()
            },
            "FormItem.M.TitleTop.RequiredEnd.Warning" to ComposeStyleReference { FormItem.M.TitleTop.RequiredEnd.Warning.style() },
            "FormItem.M.TitleStart.Default" to ComposeStyleReference { FormItem.M.TitleStart.Default.style() },
            "FormItem.M.TitleStart.Positive" to ComposeStyleReference { FormItem.M.TitleStart.Positive.style() },
            "FormItem.M.TitleStart.Negative" to ComposeStyleReference { FormItem.M.TitleStart.Negative.style() },
            "FormItem.M.TitleStart.Warning" to ComposeStyleReference { FormItem.M.TitleStart.Warning.style() },
            "FormItem.M.TitleStart.RequiredStart.Default" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredStart.Default.style()
            },
            "FormItem.M.TitleStart.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredStart.Positive.style()
            },
            "FormItem.M.TitleStart.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredStart.Negative.style()
            },
            "FormItem.M.TitleStart.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredStart.Warning.style()
            },
            "FormItem.M.TitleStart.RequiredEnd.Default" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredEnd.Default.style()
            },
            "FormItem.M.TitleStart.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredEnd.Positive.style()
            },
            "FormItem.M.TitleStart.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredEnd.Negative.style()
            },
            "FormItem.M.TitleStart.RequiredEnd.Warning" to ComposeStyleReference {
                FormItem.M.TitleStart.RequiredEnd.Warning.style()
            },
            "FormItem.L.Default" to ComposeStyleReference { FormItem.L.Default.style() },
            "FormItem.L.Positive" to ComposeStyleReference { FormItem.L.Positive.style() },
            "FormItem.L.Negative" to ComposeStyleReference { FormItem.L.Negative.style() },
            "FormItem.L.Warning" to ComposeStyleReference { FormItem.L.Warning.style() },
            "FormItem.L.RequiredStart.Default" to ComposeStyleReference { FormItem.L.RequiredStart.Default.style() },
            "FormItem.L.RequiredStart.Positive" to ComposeStyleReference { FormItem.L.RequiredStart.Positive.style() },
            "FormItem.L.RequiredStart.Negative" to ComposeStyleReference { FormItem.L.RequiredStart.Negative.style() },
            "FormItem.L.RequiredStart.Warning" to ComposeStyleReference { FormItem.L.RequiredStart.Warning.style() },
            "FormItem.L.RequiredEnd.Default" to ComposeStyleReference { FormItem.L.RequiredEnd.Default.style() },
            "FormItem.L.RequiredEnd.Positive" to ComposeStyleReference { FormItem.L.RequiredEnd.Positive.style() },
            "FormItem.L.RequiredEnd.Negative" to ComposeStyleReference { FormItem.L.RequiredEnd.Negative.style() },
            "FormItem.L.RequiredEnd.Warning" to ComposeStyleReference { FormItem.L.RequiredEnd.Warning.style() },
            "FormItem.L.TitleTop.Default" to ComposeStyleReference { FormItem.L.TitleTop.Default.style() },
            "FormItem.L.TitleTop.Positive" to ComposeStyleReference { FormItem.L.TitleTop.Positive.style() },
            "FormItem.L.TitleTop.Negative" to ComposeStyleReference { FormItem.L.TitleTop.Negative.style() },
            "FormItem.L.TitleTop.Warning" to ComposeStyleReference { FormItem.L.TitleTop.Warning.style() },
            "FormItem.L.TitleTop.RequiredStart.Default" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredStart.Default.style()
            },
            "FormItem.L.TitleTop.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredStart.Positive.style()
            },
            "FormItem.L.TitleTop.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredStart.Negative.style()
            },
            "FormItem.L.TitleTop.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredStart.Warning.style()
            },
            "FormItem.L.TitleTop.RequiredEnd.Default" to ComposeStyleReference { FormItem.L.TitleTop.RequiredEnd.Default.style() },
            "FormItem.L.TitleTop.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredEnd.Positive.style()
            },
            "FormItem.L.TitleTop.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.L.TitleTop.RequiredEnd.Negative.style()
            },
            "FormItem.L.TitleTop.RequiredEnd.Warning" to ComposeStyleReference { FormItem.L.TitleTop.RequiredEnd.Warning.style() },
            "FormItem.L.TitleStart.Default" to ComposeStyleReference { FormItem.L.TitleStart.Default.style() },
            "FormItem.L.TitleStart.Positive" to ComposeStyleReference { FormItem.L.TitleStart.Positive.style() },
            "FormItem.L.TitleStart.Negative" to ComposeStyleReference { FormItem.L.TitleStart.Negative.style() },
            "FormItem.L.TitleStart.Warning" to ComposeStyleReference { FormItem.L.TitleStart.Warning.style() },
            "FormItem.L.TitleStart.RequiredStart.Default" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredStart.Default.style()
            },
            "FormItem.L.TitleStart.RequiredStart.Positive" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredStart.Positive.style()
            },
            "FormItem.L.TitleStart.RequiredStart.Negative" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredStart.Negative.style()
            },
            "FormItem.L.TitleStart.RequiredStart.Warning" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredStart.Warning.style()
            },
            "FormItem.L.TitleStart.RequiredEnd.Default" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredEnd.Default.style()
            },
            "FormItem.L.TitleStart.RequiredEnd.Positive" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredEnd.Positive.style()
            },
            "FormItem.L.TitleStart.RequiredEnd.Negative" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredEnd.Negative.style()
            },
            "FormItem.L.TitleStart.RequiredEnd.Warning" to ComposeStyleReference {
                FormItem.L.TitleStart.RequiredEnd.Warning.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return FormItemStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> FormItemSize.Xs
                "S" -> FormItemSize.S
                "M" -> FormItemSize.M
                "L" -> FormItemSize.L
                else -> FormItemSize.Xs
            },
            requiredPlacement = when (bindings["requiredPlacement"]?.toString()) {
                "None" -> FormItemRequiredPlacement.None
                "Start" -> FormItemRequiredPlacement.Start
                "End" -> FormItemRequiredPlacement.End
                else -> FormItemRequiredPlacement.None
            },
            titlePlacement = when (bindings["titlePlacement"]?.toString()) {
                "None" -> FormItemTitlePlacement.None
                "Top" -> FormItemTitlePlacement.Top
                "Start" -> FormItemTitlePlacement.Start
                else -> FormItemTitlePlacement.None
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> FormItemView.Default
                "Positive" -> FormItemView.Positive
                "Negative" -> FormItemView.Negative
                "Warning" -> FormItemView.Warning
                else -> FormItemView.Default
            },
        ).key
    }
}
