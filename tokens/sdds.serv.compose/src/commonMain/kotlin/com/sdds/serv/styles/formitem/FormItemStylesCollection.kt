// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.formitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента FormItem
 */
public enum class FormItemStyles(
    public val key: String,
) {
    FormItemXsDefault("FormItem.Xs.Default"),
    FormItemXsPositive("FormItem.Xs.Positive"),
    FormItemXsNegative("FormItem.Xs.Negative"),
    FormItemXsWarning("FormItem.Xs.Warning"),
    FormItemXsRequiredStartDefault("FormItem.Xs.RequiredStart.Default"),
    FormItemXsRequiredStartPositive("FormItem.Xs.RequiredStart.Positive"),
    FormItemXsRequiredStartNegative("FormItem.Xs.RequiredStart.Negative"),
    FormItemXsRequiredStartWarning("FormItem.Xs.RequiredStart.Warning"),
    FormItemXsRequiredEndDefault("FormItem.Xs.RequiredEnd.Default"),
    FormItemXsRequiredEndPositive("FormItem.Xs.RequiredEnd.Positive"),
    FormItemXsRequiredEndNegative("FormItem.Xs.RequiredEnd.Negative"),
    FormItemXsRequiredEndWarning("FormItem.Xs.RequiredEnd.Warning"),
    FormItemXsTitleTopDefault("FormItem.Xs.TitleTop.Default"),
    FormItemXsTitleTopPositive("FormItem.Xs.TitleTop.Positive"),
    FormItemXsTitleTopNegative("FormItem.Xs.TitleTop.Negative"),
    FormItemXsTitleTopWarning("FormItem.Xs.TitleTop.Warning"),
    FormItemXsTitleTopRequiredStartDefault("FormItem.Xs.TitleTop.RequiredStart.Default"),
    FormItemXsTitleTopRequiredStartPositive("FormItem.Xs.TitleTop.RequiredStart.Positive"),
    FormItemXsTitleTopRequiredStartNegative("FormItem.Xs.TitleTop.RequiredStart.Negative"),
    FormItemXsTitleTopRequiredStartWarning("FormItem.Xs.TitleTop.RequiredStart.Warning"),
    FormItemXsTitleTopRequiredEndDefault("FormItem.Xs.TitleTop.RequiredEnd.Default"),
    FormItemXsTitleTopRequiredEndPositive("FormItem.Xs.TitleTop.RequiredEnd.Positive"),
    FormItemXsTitleTopRequiredEndNegative("FormItem.Xs.TitleTop.RequiredEnd.Negative"),
    FormItemXsTitleTopRequiredEndWarning("FormItem.Xs.TitleTop.RequiredEnd.Warning"),
    FormItemXsTitleStartDefault("FormItem.Xs.TitleStart.Default"),
    FormItemXsTitleStartPositive("FormItem.Xs.TitleStart.Positive"),
    FormItemXsTitleStartNegative("FormItem.Xs.TitleStart.Negative"),
    FormItemXsTitleStartWarning("FormItem.Xs.TitleStart.Warning"),
    FormItemXsTitleStartRequiredStartDefault("FormItem.Xs.TitleStart.RequiredStart.Default"),
    FormItemXsTitleStartRequiredStartPositive("FormItem.Xs.TitleStart.RequiredStart.Positive"),
    FormItemXsTitleStartRequiredStartNegative("FormItem.Xs.TitleStart.RequiredStart.Negative"),
    FormItemXsTitleStartRequiredStartWarning("FormItem.Xs.TitleStart.RequiredStart.Warning"),
    FormItemXsTitleStartRequiredEndDefault("FormItem.Xs.TitleStart.RequiredEnd.Default"),
    FormItemXsTitleStartRequiredEndPositive("FormItem.Xs.TitleStart.RequiredEnd.Positive"),
    FormItemXsTitleStartRequiredEndNegative("FormItem.Xs.TitleStart.RequiredEnd.Negative"),
    FormItemXsTitleStartRequiredEndWarning("FormItem.Xs.TitleStart.RequiredEnd.Warning"),
    FormItemSDefault("FormItem.S.Default"),
    FormItemSPositive("FormItem.S.Positive"),
    FormItemSNegative("FormItem.S.Negative"),
    FormItemSWarning("FormItem.S.Warning"),
    FormItemSRequiredStartDefault("FormItem.S.RequiredStart.Default"),
    FormItemSRequiredStartPositive("FormItem.S.RequiredStart.Positive"),
    FormItemSRequiredStartNegative("FormItem.S.RequiredStart.Negative"),
    FormItemSRequiredStartWarning("FormItem.S.RequiredStart.Warning"),
    FormItemSRequiredEndDefault("FormItem.S.RequiredEnd.Default"),
    FormItemSRequiredEndPositive("FormItem.S.RequiredEnd.Positive"),
    FormItemSRequiredEndNegative("FormItem.S.RequiredEnd.Negative"),
    FormItemSRequiredEndWarning("FormItem.S.RequiredEnd.Warning"),
    FormItemSTitleTopDefault("FormItem.S.TitleTop.Default"),
    FormItemSTitleTopPositive("FormItem.S.TitleTop.Positive"),
    FormItemSTitleTopNegative("FormItem.S.TitleTop.Negative"),
    FormItemSTitleTopWarning("FormItem.S.TitleTop.Warning"),
    FormItemSTitleTopRequiredStartDefault("FormItem.S.TitleTop.RequiredStart.Default"),
    FormItemSTitleTopRequiredStartPositive("FormItem.S.TitleTop.RequiredStart.Positive"),
    FormItemSTitleTopRequiredStartNegative("FormItem.S.TitleTop.RequiredStart.Negative"),
    FormItemSTitleTopRequiredStartWarning("FormItem.S.TitleTop.RequiredStart.Warning"),
    FormItemSTitleTopRequiredEndDefault("FormItem.S.TitleTop.RequiredEnd.Default"),
    FormItemSTitleTopRequiredEndPositive("FormItem.S.TitleTop.RequiredEnd.Positive"),
    FormItemSTitleTopRequiredEndNegative("FormItem.S.TitleTop.RequiredEnd.Negative"),
    FormItemSTitleTopRequiredEndWarning("FormItem.S.TitleTop.RequiredEnd.Warning"),
    FormItemSTitleStartDefault("FormItem.S.TitleStart.Default"),
    FormItemSTitleStartPositive("FormItem.S.TitleStart.Positive"),
    FormItemSTitleStartNegative("FormItem.S.TitleStart.Negative"),
    FormItemSTitleStartWarning("FormItem.S.TitleStart.Warning"),
    FormItemSTitleStartRequiredStartDefault("FormItem.S.TitleStart.RequiredStart.Default"),
    FormItemSTitleStartRequiredStartPositive("FormItem.S.TitleStart.RequiredStart.Positive"),
    FormItemSTitleStartRequiredStartNegative("FormItem.S.TitleStart.RequiredStart.Negative"),
    FormItemSTitleStartRequiredStartWarning("FormItem.S.TitleStart.RequiredStart.Warning"),
    FormItemSTitleStartRequiredEndDefault("FormItem.S.TitleStart.RequiredEnd.Default"),
    FormItemSTitleStartRequiredEndPositive("FormItem.S.TitleStart.RequiredEnd.Positive"),
    FormItemSTitleStartRequiredEndNegative("FormItem.S.TitleStart.RequiredEnd.Negative"),
    FormItemSTitleStartRequiredEndWarning("FormItem.S.TitleStart.RequiredEnd.Warning"),
    FormItemMDefault("FormItem.M.Default"),
    FormItemMPositive("FormItem.M.Positive"),
    FormItemMNegative("FormItem.M.Negative"),
    FormItemMWarning("FormItem.M.Warning"),
    FormItemMRequiredStartDefault("FormItem.M.RequiredStart.Default"),
    FormItemMRequiredStartPositive("FormItem.M.RequiredStart.Positive"),
    FormItemMRequiredStartNegative("FormItem.M.RequiredStart.Negative"),
    FormItemMRequiredStartWarning("FormItem.M.RequiredStart.Warning"),
    FormItemMRequiredEndDefault("FormItem.M.RequiredEnd.Default"),
    FormItemMRequiredEndPositive("FormItem.M.RequiredEnd.Positive"),
    FormItemMRequiredEndNegative("FormItem.M.RequiredEnd.Negative"),
    FormItemMRequiredEndWarning("FormItem.M.RequiredEnd.Warning"),
    FormItemMTitleTopDefault("FormItem.M.TitleTop.Default"),
    FormItemMTitleTopPositive("FormItem.M.TitleTop.Positive"),
    FormItemMTitleTopNegative("FormItem.M.TitleTop.Negative"),
    FormItemMTitleTopWarning("FormItem.M.TitleTop.Warning"),
    FormItemMTitleTopRequiredStartDefault("FormItem.M.TitleTop.RequiredStart.Default"),
    FormItemMTitleTopRequiredStartPositive("FormItem.M.TitleTop.RequiredStart.Positive"),
    FormItemMTitleTopRequiredStartNegative("FormItem.M.TitleTop.RequiredStart.Negative"),
    FormItemMTitleTopRequiredStartWarning("FormItem.M.TitleTop.RequiredStart.Warning"),
    FormItemMTitleTopRequiredEndDefault("FormItem.M.TitleTop.RequiredEnd.Default"),
    FormItemMTitleTopRequiredEndPositive("FormItem.M.TitleTop.RequiredEnd.Positive"),
    FormItemMTitleTopRequiredEndNegative("FormItem.M.TitleTop.RequiredEnd.Negative"),
    FormItemMTitleTopRequiredEndWarning("FormItem.M.TitleTop.RequiredEnd.Warning"),
    FormItemMTitleStartDefault("FormItem.M.TitleStart.Default"),
    FormItemMTitleStartPositive("FormItem.M.TitleStart.Positive"),
    FormItemMTitleStartNegative("FormItem.M.TitleStart.Negative"),
    FormItemMTitleStartWarning("FormItem.M.TitleStart.Warning"),
    FormItemMTitleStartRequiredStartDefault("FormItem.M.TitleStart.RequiredStart.Default"),
    FormItemMTitleStartRequiredStartPositive("FormItem.M.TitleStart.RequiredStart.Positive"),
    FormItemMTitleStartRequiredStartNegative("FormItem.M.TitleStart.RequiredStart.Negative"),
    FormItemMTitleStartRequiredStartWarning("FormItem.M.TitleStart.RequiredStart.Warning"),
    FormItemMTitleStartRequiredEndDefault("FormItem.M.TitleStart.RequiredEnd.Default"),
    FormItemMTitleStartRequiredEndPositive("FormItem.M.TitleStart.RequiredEnd.Positive"),
    FormItemMTitleStartRequiredEndNegative("FormItem.M.TitleStart.RequiredEnd.Negative"),
    FormItemMTitleStartRequiredEndWarning("FormItem.M.TitleStart.RequiredEnd.Warning"),
    FormItemLDefault("FormItem.L.Default"),
    FormItemLPositive("FormItem.L.Positive"),
    FormItemLNegative("FormItem.L.Negative"),
    FormItemLWarning("FormItem.L.Warning"),
    FormItemLRequiredStartDefault("FormItem.L.RequiredStart.Default"),
    FormItemLRequiredStartPositive("FormItem.L.RequiredStart.Positive"),
    FormItemLRequiredStartNegative("FormItem.L.RequiredStart.Negative"),
    FormItemLRequiredStartWarning("FormItem.L.RequiredStart.Warning"),
    FormItemLRequiredEndDefault("FormItem.L.RequiredEnd.Default"),
    FormItemLRequiredEndPositive("FormItem.L.RequiredEnd.Positive"),
    FormItemLRequiredEndNegative("FormItem.L.RequiredEnd.Negative"),
    FormItemLRequiredEndWarning("FormItem.L.RequiredEnd.Warning"),
    FormItemLTitleTopDefault("FormItem.L.TitleTop.Default"),
    FormItemLTitleTopPositive("FormItem.L.TitleTop.Positive"),
    FormItemLTitleTopNegative("FormItem.L.TitleTop.Negative"),
    FormItemLTitleTopWarning("FormItem.L.TitleTop.Warning"),
    FormItemLTitleTopRequiredStartDefault("FormItem.L.TitleTop.RequiredStart.Default"),
    FormItemLTitleTopRequiredStartPositive("FormItem.L.TitleTop.RequiredStart.Positive"),
    FormItemLTitleTopRequiredStartNegative("FormItem.L.TitleTop.RequiredStart.Negative"),
    FormItemLTitleTopRequiredStartWarning("FormItem.L.TitleTop.RequiredStart.Warning"),
    FormItemLTitleTopRequiredEndDefault("FormItem.L.TitleTop.RequiredEnd.Default"),
    FormItemLTitleTopRequiredEndPositive("FormItem.L.TitleTop.RequiredEnd.Positive"),
    FormItemLTitleTopRequiredEndNegative("FormItem.L.TitleTop.RequiredEnd.Negative"),
    FormItemLTitleTopRequiredEndWarning("FormItem.L.TitleTop.RequiredEnd.Warning"),
    FormItemLTitleStartDefault("FormItem.L.TitleStart.Default"),
    FormItemLTitleStartPositive("FormItem.L.TitleStart.Positive"),
    FormItemLTitleStartNegative("FormItem.L.TitleStart.Negative"),
    FormItemLTitleStartWarning("FormItem.L.TitleStart.Warning"),
    FormItemLTitleStartRequiredStartDefault("FormItem.L.TitleStart.RequiredStart.Default"),
    FormItemLTitleStartRequiredStartPositive("FormItem.L.TitleStart.RequiredStart.Positive"),
    FormItemLTitleStartRequiredStartNegative("FormItem.L.TitleStart.RequiredStart.Negative"),
    FormItemLTitleStartRequiredStartWarning("FormItem.L.TitleStart.RequiredStart.Warning"),
    FormItemLTitleStartRequiredEndDefault("FormItem.L.TitleStart.RequiredEnd.Default"),
    FormItemLTitleStartRequiredEndPositive("FormItem.L.TitleStart.RequiredEnd.Positive"),
    FormItemLTitleStartRequiredEndNegative("FormItem.L.TitleStart.RequiredEnd.Negative"),
    FormItemLTitleStartRequiredEndWarning("FormItem.L.TitleStart.RequiredEnd.Warning"),
    ;

    /**
     * Typed API для подбора стиля form-item
     */
    public companion object
}

/**
 * Возможные значения свойства size для form-item
 */
public enum class FormItemSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства required-placement для form-item
 */
public enum class FormItemRequiredPlacement {
    None,
    Start,
    End,
}

/**
 * Возможные значения свойства title-placement для form-item
 */
public enum class FormItemTitlePlacement {
    None,
    Top,
    Start,
}

/**
 * Возможные значения свойства view для form-item
 */
public enum class FormItemView {
    Default,
    Positive,
    Negative,
    Warning,
}

/**
 * Возвращает [FormItemStyle] для [FormItemStyles]
 */
@Composable
public fun FormItemStyles.style(modify: @Composable FormItemStyleBuilder.() -> Unit = {}): FormItemStyle {
    val builder = when (this) {
        FormItemStyles.FormItemXsDefault -> FormItem.Xs.Default
        FormItemStyles.FormItemXsPositive -> FormItem.Xs.Positive
        FormItemStyles.FormItemXsNegative -> FormItem.Xs.Negative
        FormItemStyles.FormItemXsWarning -> FormItem.Xs.Warning
        FormItemStyles.FormItemXsRequiredStartDefault -> FormItem.Xs.RequiredStart.Default
        FormItemStyles.FormItemXsRequiredStartPositive -> FormItem.Xs.RequiredStart.Positive
        FormItemStyles.FormItemXsRequiredStartNegative -> FormItem.Xs.RequiredStart.Negative
        FormItemStyles.FormItemXsRequiredStartWarning -> FormItem.Xs.RequiredStart.Warning
        FormItemStyles.FormItemXsRequiredEndDefault -> FormItem.Xs.RequiredEnd.Default
        FormItemStyles.FormItemXsRequiredEndPositive -> FormItem.Xs.RequiredEnd.Positive
        FormItemStyles.FormItemXsRequiredEndNegative -> FormItem.Xs.RequiredEnd.Negative
        FormItemStyles.FormItemXsRequiredEndWarning -> FormItem.Xs.RequiredEnd.Warning
        FormItemStyles.FormItemXsTitleTopDefault -> FormItem.Xs.TitleTop.Default
        FormItemStyles.FormItemXsTitleTopPositive -> FormItem.Xs.TitleTop.Positive
        FormItemStyles.FormItemXsTitleTopNegative -> FormItem.Xs.TitleTop.Negative
        FormItemStyles.FormItemXsTitleTopWarning -> FormItem.Xs.TitleTop.Warning
        FormItemStyles.FormItemXsTitleTopRequiredStartDefault ->
            FormItem.Xs.TitleTop.RequiredStart.Default
        FormItemStyles.FormItemXsTitleTopRequiredStartPositive ->
            FormItem.Xs.TitleTop.RequiredStart.Positive
        FormItemStyles.FormItemXsTitleTopRequiredStartNegative ->
            FormItem.Xs.TitleTop.RequiredStart.Negative
        FormItemStyles.FormItemXsTitleTopRequiredStartWarning ->
            FormItem.Xs.TitleTop.RequiredStart.Warning
        FormItemStyles.FormItemXsTitleTopRequiredEndDefault ->
            FormItem.Xs.TitleTop.RequiredEnd.Default
        FormItemStyles.FormItemXsTitleTopRequiredEndPositive ->
            FormItem.Xs.TitleTop.RequiredEnd.Positive
        FormItemStyles.FormItemXsTitleTopRequiredEndNegative ->
            FormItem.Xs.TitleTop.RequiredEnd.Negative
        FormItemStyles.FormItemXsTitleTopRequiredEndWarning ->
            FormItem.Xs.TitleTop.RequiredEnd.Warning
        FormItemStyles.FormItemXsTitleStartDefault -> FormItem.Xs.TitleStart.Default
        FormItemStyles.FormItemXsTitleStartPositive -> FormItem.Xs.TitleStart.Positive
        FormItemStyles.FormItemXsTitleStartNegative -> FormItem.Xs.TitleStart.Negative
        FormItemStyles.FormItemXsTitleStartWarning -> FormItem.Xs.TitleStart.Warning
        FormItemStyles.FormItemXsTitleStartRequiredStartDefault ->
            FormItem.Xs.TitleStart.RequiredStart.Default
        FormItemStyles.FormItemXsTitleStartRequiredStartPositive ->
            FormItem.Xs.TitleStart.RequiredStart.Positive
        FormItemStyles.FormItemXsTitleStartRequiredStartNegative ->
            FormItem.Xs.TitleStart.RequiredStart.Negative
        FormItemStyles.FormItemXsTitleStartRequiredStartWarning ->
            FormItem.Xs.TitleStart.RequiredStart.Warning
        FormItemStyles.FormItemXsTitleStartRequiredEndDefault ->
            FormItem.Xs.TitleStart.RequiredEnd.Default
        FormItemStyles.FormItemXsTitleStartRequiredEndPositive ->
            FormItem.Xs.TitleStart.RequiredEnd.Positive
        FormItemStyles.FormItemXsTitleStartRequiredEndNegative ->
            FormItem.Xs.TitleStart.RequiredEnd.Negative
        FormItemStyles.FormItemXsTitleStartRequiredEndWarning ->
            FormItem.Xs.TitleStart.RequiredEnd.Warning
        FormItemStyles.FormItemSDefault -> FormItem.S.Default
        FormItemStyles.FormItemSPositive -> FormItem.S.Positive
        FormItemStyles.FormItemSNegative -> FormItem.S.Negative
        FormItemStyles.FormItemSWarning -> FormItem.S.Warning
        FormItemStyles.FormItemSRequiredStartDefault -> FormItem.S.RequiredStart.Default
        FormItemStyles.FormItemSRequiredStartPositive -> FormItem.S.RequiredStart.Positive
        FormItemStyles.FormItemSRequiredStartNegative -> FormItem.S.RequiredStart.Negative
        FormItemStyles.FormItemSRequiredStartWarning -> FormItem.S.RequiredStart.Warning
        FormItemStyles.FormItemSRequiredEndDefault -> FormItem.S.RequiredEnd.Default
        FormItemStyles.FormItemSRequiredEndPositive -> FormItem.S.RequiredEnd.Positive
        FormItemStyles.FormItemSRequiredEndNegative -> FormItem.S.RequiredEnd.Negative
        FormItemStyles.FormItemSRequiredEndWarning -> FormItem.S.RequiredEnd.Warning
        FormItemStyles.FormItemSTitleTopDefault -> FormItem.S.TitleTop.Default
        FormItemStyles.FormItemSTitleTopPositive -> FormItem.S.TitleTop.Positive
        FormItemStyles.FormItemSTitleTopNegative -> FormItem.S.TitleTop.Negative
        FormItemStyles.FormItemSTitleTopWarning -> FormItem.S.TitleTop.Warning
        FormItemStyles.FormItemSTitleTopRequiredStartDefault ->
            FormItem.S.TitleTop.RequiredStart.Default
        FormItemStyles.FormItemSTitleTopRequiredStartPositive ->
            FormItem.S.TitleTop.RequiredStart.Positive
        FormItemStyles.FormItemSTitleTopRequiredStartNegative ->
            FormItem.S.TitleTop.RequiredStart.Negative
        FormItemStyles.FormItemSTitleTopRequiredStartWarning ->
            FormItem.S.TitleTop.RequiredStart.Warning
        FormItemStyles.FormItemSTitleTopRequiredEndDefault -> FormItem.S.TitleTop.RequiredEnd.Default
        FormItemStyles.FormItemSTitleTopRequiredEndPositive ->
            FormItem.S.TitleTop.RequiredEnd.Positive
        FormItemStyles.FormItemSTitleTopRequiredEndNegative ->
            FormItem.S.TitleTop.RequiredEnd.Negative
        FormItemStyles.FormItemSTitleTopRequiredEndWarning -> FormItem.S.TitleTop.RequiredEnd.Warning
        FormItemStyles.FormItemSTitleStartDefault -> FormItem.S.TitleStart.Default
        FormItemStyles.FormItemSTitleStartPositive -> FormItem.S.TitleStart.Positive
        FormItemStyles.FormItemSTitleStartNegative -> FormItem.S.TitleStart.Negative
        FormItemStyles.FormItemSTitleStartWarning -> FormItem.S.TitleStart.Warning
        FormItemStyles.FormItemSTitleStartRequiredStartDefault ->
            FormItem.S.TitleStart.RequiredStart.Default
        FormItemStyles.FormItemSTitleStartRequiredStartPositive ->
            FormItem.S.TitleStart.RequiredStart.Positive
        FormItemStyles.FormItemSTitleStartRequiredStartNegative ->
            FormItem.S.TitleStart.RequiredStart.Negative
        FormItemStyles.FormItemSTitleStartRequiredStartWarning ->
            FormItem.S.TitleStart.RequiredStart.Warning
        FormItemStyles.FormItemSTitleStartRequiredEndDefault ->
            FormItem.S.TitleStart.RequiredEnd.Default
        FormItemStyles.FormItemSTitleStartRequiredEndPositive ->
            FormItem.S.TitleStart.RequiredEnd.Positive
        FormItemStyles.FormItemSTitleStartRequiredEndNegative ->
            FormItem.S.TitleStart.RequiredEnd.Negative
        FormItemStyles.FormItemSTitleStartRequiredEndWarning ->
            FormItem.S.TitleStart.RequiredEnd.Warning
        FormItemStyles.FormItemMDefault -> FormItem.M.Default
        FormItemStyles.FormItemMPositive -> FormItem.M.Positive
        FormItemStyles.FormItemMNegative -> FormItem.M.Negative
        FormItemStyles.FormItemMWarning -> FormItem.M.Warning
        FormItemStyles.FormItemMRequiredStartDefault -> FormItem.M.RequiredStart.Default
        FormItemStyles.FormItemMRequiredStartPositive -> FormItem.M.RequiredStart.Positive
        FormItemStyles.FormItemMRequiredStartNegative -> FormItem.M.RequiredStart.Negative
        FormItemStyles.FormItemMRequiredStartWarning -> FormItem.M.RequiredStart.Warning
        FormItemStyles.FormItemMRequiredEndDefault -> FormItem.M.RequiredEnd.Default
        FormItemStyles.FormItemMRequiredEndPositive -> FormItem.M.RequiredEnd.Positive
        FormItemStyles.FormItemMRequiredEndNegative -> FormItem.M.RequiredEnd.Negative
        FormItemStyles.FormItemMRequiredEndWarning -> FormItem.M.RequiredEnd.Warning
        FormItemStyles.FormItemMTitleTopDefault -> FormItem.M.TitleTop.Default
        FormItemStyles.FormItemMTitleTopPositive -> FormItem.M.TitleTop.Positive
        FormItemStyles.FormItemMTitleTopNegative -> FormItem.M.TitleTop.Negative
        FormItemStyles.FormItemMTitleTopWarning -> FormItem.M.TitleTop.Warning
        FormItemStyles.FormItemMTitleTopRequiredStartDefault ->
            FormItem.M.TitleTop.RequiredStart.Default
        FormItemStyles.FormItemMTitleTopRequiredStartPositive ->
            FormItem.M.TitleTop.RequiredStart.Positive
        FormItemStyles.FormItemMTitleTopRequiredStartNegative ->
            FormItem.M.TitleTop.RequiredStart.Negative
        FormItemStyles.FormItemMTitleTopRequiredStartWarning ->
            FormItem.M.TitleTop.RequiredStart.Warning
        FormItemStyles.FormItemMTitleTopRequiredEndDefault -> FormItem.M.TitleTop.RequiredEnd.Default
        FormItemStyles.FormItemMTitleTopRequiredEndPositive ->
            FormItem.M.TitleTop.RequiredEnd.Positive
        FormItemStyles.FormItemMTitleTopRequiredEndNegative ->
            FormItem.M.TitleTop.RequiredEnd.Negative
        FormItemStyles.FormItemMTitleTopRequiredEndWarning -> FormItem.M.TitleTop.RequiredEnd.Warning
        FormItemStyles.FormItemMTitleStartDefault -> FormItem.M.TitleStart.Default
        FormItemStyles.FormItemMTitleStartPositive -> FormItem.M.TitleStart.Positive
        FormItemStyles.FormItemMTitleStartNegative -> FormItem.M.TitleStart.Negative
        FormItemStyles.FormItemMTitleStartWarning -> FormItem.M.TitleStart.Warning
        FormItemStyles.FormItemMTitleStartRequiredStartDefault ->
            FormItem.M.TitleStart.RequiredStart.Default
        FormItemStyles.FormItemMTitleStartRequiredStartPositive ->
            FormItem.M.TitleStart.RequiredStart.Positive
        FormItemStyles.FormItemMTitleStartRequiredStartNegative ->
            FormItem.M.TitleStart.RequiredStart.Negative
        FormItemStyles.FormItemMTitleStartRequiredStartWarning ->
            FormItem.M.TitleStart.RequiredStart.Warning
        FormItemStyles.FormItemMTitleStartRequiredEndDefault ->
            FormItem.M.TitleStart.RequiredEnd.Default
        FormItemStyles.FormItemMTitleStartRequiredEndPositive ->
            FormItem.M.TitleStart.RequiredEnd.Positive
        FormItemStyles.FormItemMTitleStartRequiredEndNegative ->
            FormItem.M.TitleStart.RequiredEnd.Negative
        FormItemStyles.FormItemMTitleStartRequiredEndWarning ->
            FormItem.M.TitleStart.RequiredEnd.Warning
        FormItemStyles.FormItemLDefault -> FormItem.L.Default
        FormItemStyles.FormItemLPositive -> FormItem.L.Positive
        FormItemStyles.FormItemLNegative -> FormItem.L.Negative
        FormItemStyles.FormItemLWarning -> FormItem.L.Warning
        FormItemStyles.FormItemLRequiredStartDefault -> FormItem.L.RequiredStart.Default
        FormItemStyles.FormItemLRequiredStartPositive -> FormItem.L.RequiredStart.Positive
        FormItemStyles.FormItemLRequiredStartNegative -> FormItem.L.RequiredStart.Negative
        FormItemStyles.FormItemLRequiredStartWarning -> FormItem.L.RequiredStart.Warning
        FormItemStyles.FormItemLRequiredEndDefault -> FormItem.L.RequiredEnd.Default
        FormItemStyles.FormItemLRequiredEndPositive -> FormItem.L.RequiredEnd.Positive
        FormItemStyles.FormItemLRequiredEndNegative -> FormItem.L.RequiredEnd.Negative
        FormItemStyles.FormItemLRequiredEndWarning -> FormItem.L.RequiredEnd.Warning
        FormItemStyles.FormItemLTitleTopDefault -> FormItem.L.TitleTop.Default
        FormItemStyles.FormItemLTitleTopPositive -> FormItem.L.TitleTop.Positive
        FormItemStyles.FormItemLTitleTopNegative -> FormItem.L.TitleTop.Negative
        FormItemStyles.FormItemLTitleTopWarning -> FormItem.L.TitleTop.Warning
        FormItemStyles.FormItemLTitleTopRequiredStartDefault ->
            FormItem.L.TitleTop.RequiredStart.Default
        FormItemStyles.FormItemLTitleTopRequiredStartPositive ->
            FormItem.L.TitleTop.RequiredStart.Positive
        FormItemStyles.FormItemLTitleTopRequiredStartNegative ->
            FormItem.L.TitleTop.RequiredStart.Negative
        FormItemStyles.FormItemLTitleTopRequiredStartWarning ->
            FormItem.L.TitleTop.RequiredStart.Warning
        FormItemStyles.FormItemLTitleTopRequiredEndDefault -> FormItem.L.TitleTop.RequiredEnd.Default
        FormItemStyles.FormItemLTitleTopRequiredEndPositive ->
            FormItem.L.TitleTop.RequiredEnd.Positive
        FormItemStyles.FormItemLTitleTopRequiredEndNegative ->
            FormItem.L.TitleTop.RequiredEnd.Negative
        FormItemStyles.FormItemLTitleTopRequiredEndWarning -> FormItem.L.TitleTop.RequiredEnd.Warning
        FormItemStyles.FormItemLTitleStartDefault -> FormItem.L.TitleStart.Default
        FormItemStyles.FormItemLTitleStartPositive -> FormItem.L.TitleStart.Positive
        FormItemStyles.FormItemLTitleStartNegative -> FormItem.L.TitleStart.Negative
        FormItemStyles.FormItemLTitleStartWarning -> FormItem.L.TitleStart.Warning
        FormItemStyles.FormItemLTitleStartRequiredStartDefault ->
            FormItem.L.TitleStart.RequiredStart.Default
        FormItemStyles.FormItemLTitleStartRequiredStartPositive ->
            FormItem.L.TitleStart.RequiredStart.Positive
        FormItemStyles.FormItemLTitleStartRequiredStartNegative ->
            FormItem.L.TitleStart.RequiredStart.Negative
        FormItemStyles.FormItemLTitleStartRequiredStartWarning ->
            FormItem.L.TitleStart.RequiredStart.Warning
        FormItemStyles.FormItemLTitleStartRequiredEndDefault ->
            FormItem.L.TitleStart.RequiredEnd.Default
        FormItemStyles.FormItemLTitleStartRequiredEndPositive ->
            FormItem.L.TitleStart.RequiredEnd.Positive
        FormItemStyles.FormItemLTitleStartRequiredEndNegative ->
            FormItem.L.TitleStart.RequiredEnd.Negative
        FormItemStyles.FormItemLTitleStartRequiredEndWarning ->
            FormItem.L.TitleStart.RequiredEnd.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [FormItemStyles] для form-item
 */
public fun FormItemStyles.Companion.resolve(
    size: FormItemSize = FormItemSize.Xs,
    requiredPlacement: FormItemRequiredPlacement = FormItemRequiredPlacement.None,
    titlePlacement: FormItemTitlePlacement = FormItemTitlePlacement.None,
    view: FormItemView = FormItemView.Default,
): FormItemStyles = when {
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleTopDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleTopPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleTopNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleTopWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleTopRequiredStartDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleTopRequiredStartPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleTopRequiredStartNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleTopRequiredStartWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleTopRequiredEndDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleTopRequiredEndPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleTopRequiredEndNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleTopRequiredEndWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleStartDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleStartPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleStartNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleStartWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleStartRequiredStartDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleStartRequiredStartPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleStartRequiredStartNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start &&
        titlePlacement == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleStartRequiredStartWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemXsTitleStartRequiredEndDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemXsTitleStartRequiredEndPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemXsTitleStartRequiredEndNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemXsTitleStartRequiredEndWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleTopDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleTopPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleTopNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleTopWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleTopRequiredStartDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleTopRequiredStartPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleTopRequiredStartNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleTopRequiredStartWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleTopRequiredEndDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleTopRequiredEndPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleTopRequiredEndNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleTopRequiredEndWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleStartDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleStartPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleStartNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleStartWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleStartRequiredStartDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleStartRequiredStartPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleStartRequiredStartNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleStartRequiredStartWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemSTitleStartRequiredEndDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemSTitleStartRequiredEndPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemSTitleStartRequiredEndNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemSTitleStartRequiredEndWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleTopDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleTopPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleTopNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleTopWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleTopRequiredStartDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleTopRequiredStartPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleTopRequiredStartNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleTopRequiredStartWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleTopRequiredEndDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleTopRequiredEndPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleTopRequiredEndNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleTopRequiredEndWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleStartDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleStartPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleStartNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleStartWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleStartRequiredStartDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleStartRequiredStartPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleStartRequiredStartNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleStartRequiredStartWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemMTitleStartRequiredEndDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemMTitleStartRequiredEndPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemMTitleStartRequiredEndNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemMTitleStartRequiredEndWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleTopDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleTopPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleTopNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleTopWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleTopRequiredStartDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleTopRequiredStartPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleTopRequiredStartNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleTopRequiredStartWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleTopRequiredEndDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleTopRequiredEndPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleTopRequiredEndNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Top && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleTopRequiredEndWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleStartDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleStartPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleStartNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleStartWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleStartRequiredStartDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleStartRequiredStartPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleStartRequiredStartNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleStartRequiredStartWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Default ->
        FormItemStyles.FormItemLTitleStartRequiredEndDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Positive ->
        FormItemStyles.FormItemLTitleStartRequiredEndPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Negative ->
        FormItemStyles.FormItemLTitleStartRequiredEndNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && titlePlacement
        == FormItemTitlePlacement.Start && view == FormItemView.Warning ->
        FormItemStyles.FormItemLTitleStartRequiredEndWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Default -> FormItemStyles.FormItemXsDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Positive -> FormItemStyles.FormItemXsPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Negative -> FormItemStyles.FormItemXsNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Warning -> FormItemStyles.FormItemXsWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Default -> FormItemStyles.FormItemXsRequiredStartDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Positive -> FormItemStyles.FormItemXsRequiredStartPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Negative -> FormItemStyles.FormItemXsRequiredStartNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Warning -> FormItemStyles.FormItemXsRequiredStartWarning
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Default -> FormItemStyles.FormItemXsRequiredEndDefault
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Positive -> FormItemStyles.FormItemXsRequiredEndPositive
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Negative -> FormItemStyles.FormItemXsRequiredEndNegative
    size == FormItemSize.Xs && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Warning -> FormItemStyles.FormItemXsRequiredEndWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Default -> FormItemStyles.FormItemSDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Positive -> FormItemStyles.FormItemSPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Negative -> FormItemStyles.FormItemSNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Warning -> FormItemStyles.FormItemSWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Default -> FormItemStyles.FormItemSRequiredStartDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Positive -> FormItemStyles.FormItemSRequiredStartPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Negative -> FormItemStyles.FormItemSRequiredStartNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Warning -> FormItemStyles.FormItemSRequiredStartWarning
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Default -> FormItemStyles.FormItemSRequiredEndDefault
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Positive -> FormItemStyles.FormItemSRequiredEndPositive
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Negative -> FormItemStyles.FormItemSRequiredEndNegative
    size == FormItemSize.S && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Warning -> FormItemStyles.FormItemSRequiredEndWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Default -> FormItemStyles.FormItemMDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Positive -> FormItemStyles.FormItemMPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Negative -> FormItemStyles.FormItemMNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Warning -> FormItemStyles.FormItemMWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Default -> FormItemStyles.FormItemMRequiredStartDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Positive -> FormItemStyles.FormItemMRequiredStartPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Negative -> FormItemStyles.FormItemMRequiredStartNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Warning -> FormItemStyles.FormItemMRequiredStartWarning
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Default -> FormItemStyles.FormItemMRequiredEndDefault
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Positive -> FormItemStyles.FormItemMRequiredEndPositive
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Negative -> FormItemStyles.FormItemMRequiredEndNegative
    size == FormItemSize.M && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Warning -> FormItemStyles.FormItemMRequiredEndWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Default -> FormItemStyles.FormItemLDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Positive -> FormItemStyles.FormItemLPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Negative -> FormItemStyles.FormItemLNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.None && view ==
        FormItemView.Warning -> FormItemStyles.FormItemLWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Default -> FormItemStyles.FormItemLRequiredStartDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Positive -> FormItemStyles.FormItemLRequiredStartPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Negative -> FormItemStyles.FormItemLRequiredStartNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.Start && view ==
        FormItemView.Warning -> FormItemStyles.FormItemLRequiredStartWarning
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Default -> FormItemStyles.FormItemLRequiredEndDefault
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Positive -> FormItemStyles.FormItemLRequiredEndPositive
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Negative -> FormItemStyles.FormItemLRequiredEndNegative
    size == FormItemSize.L && requiredPlacement == FormItemRequiredPlacement.End && view ==
        FormItemView.Warning -> FormItemStyles.FormItemLRequiredEndWarning
    else -> error("Unsupported form-item style combination")
}

/**
 * Возвращает [FormItemStyle] для form-item
 */
@Composable
public fun FormItemStyles.Companion.style(
    size: FormItemSize = FormItemSize.Xs,
    requiredPlacement: FormItemRequiredPlacement = FormItemRequiredPlacement.None,
    titlePlacement: FormItemTitlePlacement = FormItemTitlePlacement.None,
    view: FormItemView = FormItemView.Default,
    modify: @Composable FormItemStyleBuilder.() -> Unit = {},
): FormItemStyle = resolve(size, requiredPlacement, titlePlacement, view).style(modify)
