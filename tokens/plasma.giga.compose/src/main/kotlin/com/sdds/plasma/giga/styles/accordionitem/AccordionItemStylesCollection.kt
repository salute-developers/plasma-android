// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.accordionitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AccordionItem
 */
public enum class AccordionItemStyles(
    public val key: String,
) {
    AccordionItemSolidActionStartXs("AccordionItemSolidActionStart.Xs"),
    AccordionItemSolidActionStartS("AccordionItemSolidActionStart.S"),
    AccordionItemSolidActionStartM("AccordionItemSolidActionStart.M"),
    AccordionItemSolidActionStartL("AccordionItemSolidActionStart.L"),
    AccordionItemSolidActionStartH2("AccordionItemSolidActionStart.H2"),
    AccordionItemSolidActionStartH3("AccordionItemSolidActionStart.H3"),
    AccordionItemSolidActionStartH4("AccordionItemSolidActionStart.H4"),
    AccordionItemSolidActionStartH5("AccordionItemSolidActionStart.H5"),
    AccordionItemSolidActionEndXs("AccordionItemSolidActionEnd.Xs"),
    AccordionItemSolidActionEndS("AccordionItemSolidActionEnd.S"),
    AccordionItemSolidActionEndM("AccordionItemSolidActionEnd.M"),
    AccordionItemSolidActionEndL("AccordionItemSolidActionEnd.L"),
    AccordionItemSolidActionEndH2("AccordionItemSolidActionEnd.H2"),
    AccordionItemSolidActionEndH3("AccordionItemSolidActionEnd.H3"),
    AccordionItemSolidActionEndH4("AccordionItemSolidActionEnd.H4"),
    AccordionItemSolidActionEndH5("AccordionItemSolidActionEnd.H5"),
    AccordionItemClearActionStartXs("AccordionItemClearActionStart.Xs"),
    AccordionItemClearActionStartS("AccordionItemClearActionStart.S"),
    AccordionItemClearActionStartM("AccordionItemClearActionStart.M"),
    AccordionItemClearActionStartL("AccordionItemClearActionStart.L"),
    AccordionItemClearActionStartH2("AccordionItemClearActionStart.H2"),
    AccordionItemClearActionStartH3("AccordionItemClearActionStart.H3"),
    AccordionItemClearActionStartH4("AccordionItemClearActionStart.H4"),
    AccordionItemClearActionStartH5("AccordionItemClearActionStart.H5"),
    AccordionItemClearActionEndXs("AccordionItemClearActionEnd.Xs"),
    AccordionItemClearActionEndS("AccordionItemClearActionEnd.S"),
    AccordionItemClearActionEndM("AccordionItemClearActionEnd.M"),
    AccordionItemClearActionEndL("AccordionItemClearActionEnd.L"),
    AccordionItemClearActionEndH2("AccordionItemClearActionEnd.H2"),
    AccordionItemClearActionEndH3("AccordionItemClearActionEnd.H3"),
    AccordionItemClearActionEndH4("AccordionItemClearActionEnd.H4"),
    AccordionItemClearActionEndH5("AccordionItemClearActionEnd.H5"),
    ;

    /**
     * Typed API для подбора стиля accordion-item-solid-action-start
     */
    public object SolidActionStart

    /**
     * Typed API для подбора стиля accordion-item-solid-action-end
     */
    public object SolidActionEnd

    /**
     * Typed API для подбора стиля accordion-item-clear-action-start
     */
    public object ClearActionStart

    /**
     * Typed API для подбора стиля accordion-item-clear-action-end
     */
    public object ClearActionEnd
}

/**
 * Возможные значения свойства size для accordion-item-solid-action-start
 */
public enum class AccordionItemSolidActionStartSize {
    L,
    M,
    S,
    Xs,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возможные значения свойства size для accordion-item-solid-action-end
 */
public enum class AccordionItemSolidActionEndSize {
    L,
    M,
    S,
    Xs,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возможные значения свойства size для accordion-item-clear-action-start
 */
public enum class AccordionItemClearActionStartSize {
    L,
    M,
    S,
    Xs,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возможные значения свойства size для accordion-item-clear-action-end
 */
public enum class AccordionItemClearActionEndSize {
    L,
    M,
    S,
    Xs,
    H2,
    H3,
    H4,
    H5,
}

/**
 * Возвращает [AccordionItemStyle] для [AccordionItemStyles]
 */
@Composable
public fun AccordionItemStyles.style(modify: @Composable AccordionItemStyleBuilder.() -> Unit = {}):
    AccordionItemStyle {
    val builder = when (this) {
        AccordionItemStyles.AccordionItemSolidActionStartXs -> AccordionItemSolidActionStart.Xs
        AccordionItemStyles.AccordionItemSolidActionStartS -> AccordionItemSolidActionStart.S
        AccordionItemStyles.AccordionItemSolidActionStartM -> AccordionItemSolidActionStart.M
        AccordionItemStyles.AccordionItemSolidActionStartL -> AccordionItemSolidActionStart.L
        AccordionItemStyles.AccordionItemSolidActionStartH2 -> AccordionItemSolidActionStart.H2
        AccordionItemStyles.AccordionItemSolidActionStartH3 -> AccordionItemSolidActionStart.H3
        AccordionItemStyles.AccordionItemSolidActionStartH4 -> AccordionItemSolidActionStart.H4
        AccordionItemStyles.AccordionItemSolidActionStartH5 -> AccordionItemSolidActionStart.H5
        AccordionItemStyles.AccordionItemSolidActionEndXs -> AccordionItemSolidActionEnd.Xs
        AccordionItemStyles.AccordionItemSolidActionEndS -> AccordionItemSolidActionEnd.S
        AccordionItemStyles.AccordionItemSolidActionEndM -> AccordionItemSolidActionEnd.M
        AccordionItemStyles.AccordionItemSolidActionEndL -> AccordionItemSolidActionEnd.L
        AccordionItemStyles.AccordionItemSolidActionEndH2 -> AccordionItemSolidActionEnd.H2
        AccordionItemStyles.AccordionItemSolidActionEndH3 -> AccordionItemSolidActionEnd.H3
        AccordionItemStyles.AccordionItemSolidActionEndH4 -> AccordionItemSolidActionEnd.H4
        AccordionItemStyles.AccordionItemSolidActionEndH5 -> AccordionItemSolidActionEnd.H5
        AccordionItemStyles.AccordionItemClearActionStartXs -> AccordionItemClearActionStart.Xs
        AccordionItemStyles.AccordionItemClearActionStartS -> AccordionItemClearActionStart.S
        AccordionItemStyles.AccordionItemClearActionStartM -> AccordionItemClearActionStart.M
        AccordionItemStyles.AccordionItemClearActionStartL -> AccordionItemClearActionStart.L
        AccordionItemStyles.AccordionItemClearActionStartH2 -> AccordionItemClearActionStart.H2
        AccordionItemStyles.AccordionItemClearActionStartH3 -> AccordionItemClearActionStart.H3
        AccordionItemStyles.AccordionItemClearActionStartH4 -> AccordionItemClearActionStart.H4
        AccordionItemStyles.AccordionItemClearActionStartH5 -> AccordionItemClearActionStart.H5
        AccordionItemStyles.AccordionItemClearActionEndXs -> AccordionItemClearActionEnd.Xs
        AccordionItemStyles.AccordionItemClearActionEndS -> AccordionItemClearActionEnd.S
        AccordionItemStyles.AccordionItemClearActionEndM -> AccordionItemClearActionEnd.M
        AccordionItemStyles.AccordionItemClearActionEndL -> AccordionItemClearActionEnd.L
        AccordionItemStyles.AccordionItemClearActionEndH2 -> AccordionItemClearActionEnd.H2
        AccordionItemStyles.AccordionItemClearActionEndH3 -> AccordionItemClearActionEnd.H3
        AccordionItemStyles.AccordionItemClearActionEndH4 -> AccordionItemClearActionEnd.H4
        AccordionItemStyles.AccordionItemClearActionEndH5 -> AccordionItemClearActionEnd.H5
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AccordionItemStyles] для accordion-item-solid-action-start
 */
public fun AccordionItemStyles.SolidActionStart.resolve(
    size: AccordionItemSolidActionStartSize =
        AccordionItemSolidActionStartSize.L,
): AccordionItemStyles = when {
    size == AccordionItemSolidActionStartSize.Xs ->
        AccordionItemStyles.AccordionItemSolidActionStartXs
    size == AccordionItemSolidActionStartSize.S ->
        AccordionItemStyles.AccordionItemSolidActionStartS
    size == AccordionItemSolidActionStartSize.M ->
        AccordionItemStyles.AccordionItemSolidActionStartM
    size == AccordionItemSolidActionStartSize.L ->
        AccordionItemStyles.AccordionItemSolidActionStartL
    size == AccordionItemSolidActionStartSize.H2 ->
        AccordionItemStyles.AccordionItemSolidActionStartH2
    size == AccordionItemSolidActionStartSize.H3 ->
        AccordionItemStyles.AccordionItemSolidActionStartH3
    size == AccordionItemSolidActionStartSize.H4 ->
        AccordionItemStyles.AccordionItemSolidActionStartH4
    size == AccordionItemSolidActionStartSize.H5 ->
        AccordionItemStyles.AccordionItemSolidActionStartH5
    else -> error("Unsupported accordion-item-solid-action-start style combination")
}

/**
 * Возвращает [AccordionItemStyle] для accordion-item-solid-action-start
 */
@Composable
public fun AccordionItemStyles.SolidActionStart.style(
    size: AccordionItemSolidActionStartSize =
        AccordionItemSolidActionStartSize.L,
    modify: @Composable
    AccordionItemStyleBuilder.() -> Unit = {},
): AccordionItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionItemStyles] для accordion-item-solid-action-end
 */
public fun AccordionItemStyles.SolidActionEnd.resolve(
    size: AccordionItemSolidActionEndSize =
        AccordionItemSolidActionEndSize.L,
): AccordionItemStyles = when {
    size == AccordionItemSolidActionEndSize.Xs -> AccordionItemStyles.AccordionItemSolidActionEndXs
    size == AccordionItemSolidActionEndSize.S -> AccordionItemStyles.AccordionItemSolidActionEndS
    size == AccordionItemSolidActionEndSize.M -> AccordionItemStyles.AccordionItemSolidActionEndM
    size == AccordionItemSolidActionEndSize.L -> AccordionItemStyles.AccordionItemSolidActionEndL
    size == AccordionItemSolidActionEndSize.H2 -> AccordionItemStyles.AccordionItemSolidActionEndH2
    size == AccordionItemSolidActionEndSize.H3 -> AccordionItemStyles.AccordionItemSolidActionEndH3
    size == AccordionItemSolidActionEndSize.H4 -> AccordionItemStyles.AccordionItemSolidActionEndH4
    size == AccordionItemSolidActionEndSize.H5 -> AccordionItemStyles.AccordionItemSolidActionEndH5
    else -> error("Unsupported accordion-item-solid-action-end style combination")
}

/**
 * Возвращает [AccordionItemStyle] для accordion-item-solid-action-end
 */
@Composable
public fun AccordionItemStyles.SolidActionEnd.style(
    size: AccordionItemSolidActionEndSize =
        AccordionItemSolidActionEndSize.L,
    modify: @Composable AccordionItemStyleBuilder.() -> Unit =
        {},
): AccordionItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionItemStyles] для accordion-item-clear-action-start
 */
public fun AccordionItemStyles.ClearActionStart.resolve(
    size: AccordionItemClearActionStartSize =
        AccordionItemClearActionStartSize.L,
): AccordionItemStyles = when {
    size == AccordionItemClearActionStartSize.Xs ->
        AccordionItemStyles.AccordionItemClearActionStartXs
    size == AccordionItemClearActionStartSize.S ->
        AccordionItemStyles.AccordionItemClearActionStartS
    size == AccordionItemClearActionStartSize.M ->
        AccordionItemStyles.AccordionItemClearActionStartM
    size == AccordionItemClearActionStartSize.L ->
        AccordionItemStyles.AccordionItemClearActionStartL
    size == AccordionItemClearActionStartSize.H2 ->
        AccordionItemStyles.AccordionItemClearActionStartH2
    size == AccordionItemClearActionStartSize.H3 ->
        AccordionItemStyles.AccordionItemClearActionStartH3
    size == AccordionItemClearActionStartSize.H4 ->
        AccordionItemStyles.AccordionItemClearActionStartH4
    size == AccordionItemClearActionStartSize.H5 ->
        AccordionItemStyles.AccordionItemClearActionStartH5
    else -> error("Unsupported accordion-item-clear-action-start style combination")
}

/**
 * Возвращает [AccordionItemStyle] для accordion-item-clear-action-start
 */
@Composable
public fun AccordionItemStyles.ClearActionStart.style(
    size: AccordionItemClearActionStartSize =
        AccordionItemClearActionStartSize.L,
    modify: @Composable
    AccordionItemStyleBuilder.() -> Unit = {},
): AccordionItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionItemStyles] для accordion-item-clear-action-end
 */
public fun AccordionItemStyles.ClearActionEnd.resolve(
    size: AccordionItemClearActionEndSize =
        AccordionItemClearActionEndSize.L,
): AccordionItemStyles = when {
    size == AccordionItemClearActionEndSize.Xs -> AccordionItemStyles.AccordionItemClearActionEndXs
    size == AccordionItemClearActionEndSize.S -> AccordionItemStyles.AccordionItemClearActionEndS
    size == AccordionItemClearActionEndSize.M -> AccordionItemStyles.AccordionItemClearActionEndM
    size == AccordionItemClearActionEndSize.L -> AccordionItemStyles.AccordionItemClearActionEndL
    size == AccordionItemClearActionEndSize.H2 -> AccordionItemStyles.AccordionItemClearActionEndH2
    size == AccordionItemClearActionEndSize.H3 -> AccordionItemStyles.AccordionItemClearActionEndH3
    size == AccordionItemClearActionEndSize.H4 -> AccordionItemStyles.AccordionItemClearActionEndH4
    size == AccordionItemClearActionEndSize.H5 -> AccordionItemStyles.AccordionItemClearActionEndH5
    else -> error("Unsupported accordion-item-clear-action-end style combination")
}

/**
 * Возвращает [AccordionItemStyle] для accordion-item-clear-action-end
 */
@Composable
public fun AccordionItemStyles.ClearActionEnd.style(
    size: AccordionItemClearActionEndSize =
        AccordionItemClearActionEndSize.L,
    modify: @Composable AccordionItemStyleBuilder.() -> Unit =
        {},
): AccordionItemStyle = resolve(size).style(modify)
