// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.select

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Select
 */
public enum class SelectStyles(
    public val key: String,
) {
    SelectL("Select.L"),
    SelectM("Select.M"),
    SelectS("Select.S"),
    SelectXs("Select.Xs"),
    ;

    /**
     * Typed API для подбора стиля select
     */
    public companion object
}

/**
 * Возможные значения свойства size для select
 */
public enum class SelectSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [SelectStyle] для [SelectStyles]
 */
@Composable
public fun SelectStyles.style(modify: @Composable SelectStyleBuilder.() -> Unit = {}): SelectStyle {
    val builder = when (this) {
        SelectStyles.SelectL -> Select.L
        SelectStyles.SelectM -> Select.M
        SelectStyles.SelectS -> Select.S
        SelectStyles.SelectXs -> Select.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SelectStyles] для select
 */
public fun SelectStyles.Companion.resolve(size: SelectSize = SelectSize.L): SelectStyles = when {
    size == SelectSize.L -> SelectStyles.SelectL
    size == SelectSize.M -> SelectStyles.SelectM
    size == SelectSize.S -> SelectStyles.SelectS
    size == SelectSize.Xs -> SelectStyles.SelectXs
    else -> error("Unsupported select style combination")
}

/**
 * Возвращает [SelectStyle] для select
 */
@Composable
public fun SelectStyles.Companion.style(
    size: SelectSize = SelectSize.L,
    modify: @Composable
    SelectStyleBuilder.() -> Unit = {},
): SelectStyle = resolve(size).style(modify)
