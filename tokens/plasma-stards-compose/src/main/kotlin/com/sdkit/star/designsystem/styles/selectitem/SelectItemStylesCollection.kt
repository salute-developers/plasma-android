// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.selectitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента SelectItem
 */
public enum class SelectItemStyles(
    public val key: String,
) {
    SelectItemL("SelectItem.L"),
    SelectItemM("SelectItem.M"),
    SelectItemS("SelectItem.S"),
    SelectItemXs("SelectItem.Xs"),
    ;

    /**
     * Typed API для подбора стиля select-item
     */
    public companion object
}

/**
 * Возможные значения свойства size для select-item
 */
public enum class SelectItemSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [SelectItemStyle] для [SelectItemStyles]
 */
@Composable
public fun SelectItemStyles.style(modify: @Composable SelectItemStyleBuilder.() -> Unit = {}): SelectItemStyle {
    val builder = when (this) {
        SelectItemStyles.SelectItemL -> SelectItem.L
        SelectItemStyles.SelectItemM -> SelectItem.M
        SelectItemStyles.SelectItemS -> SelectItem.S
        SelectItemStyles.SelectItemXs -> SelectItem.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SelectItemStyles] для select-item
 */
public fun SelectItemStyles.Companion.resolve(size: SelectItemSize = SelectItemSize.L): SelectItemStyles = when {
    size == SelectItemSize.L -> SelectItemStyles.SelectItemL
    size == SelectItemSize.M -> SelectItemStyles.SelectItemM
    size == SelectItemSize.S -> SelectItemStyles.SelectItemS
    size == SelectItemSize.Xs -> SelectItemStyles.SelectItemXs
    else -> error("Unsupported select-item style combination")
}

/**
 * Возвращает [SelectItemStyle] для select-item
 */
@Composable
public fun SelectItemStyles.Companion.style(
    size: SelectItemSize = SelectItemSize.L,
    modify: @Composable SelectItemStyleBuilder.() -> Unit = {},
): SelectItemStyle =
    resolve(size).style(modify)
