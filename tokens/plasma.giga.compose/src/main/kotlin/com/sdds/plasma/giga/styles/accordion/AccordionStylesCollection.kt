// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.accordion

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.AccordionStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Accordion
 */
public enum class AccordionStyles(
    public val key: String,
) {
    AccordionSolidActionStartXs("AccordionSolidActionStart.Xs"),
    AccordionSolidActionStartS("AccordionSolidActionStart.S"),
    AccordionSolidActionStartM("AccordionSolidActionStart.M"),
    AccordionSolidActionStartL("AccordionSolidActionStart.L"),
    AccordionSolidActionStartH2("AccordionSolidActionStart.H2"),
    AccordionSolidActionStartH3("AccordionSolidActionStart.H3"),
    AccordionSolidActionStartH4("AccordionSolidActionStart.H4"),
    AccordionSolidActionStartH5("AccordionSolidActionStart.H5"),
    AccordionSolidActionEndXs("AccordionSolidActionEnd.Xs"),
    AccordionSolidActionEndS("AccordionSolidActionEnd.S"),
    AccordionSolidActionEndM("AccordionSolidActionEnd.M"),
    AccordionSolidActionEndL("AccordionSolidActionEnd.L"),
    AccordionSolidActionEndH2("AccordionSolidActionEnd.H2"),
    AccordionSolidActionEndH3("AccordionSolidActionEnd.H3"),
    AccordionSolidActionEndH4("AccordionSolidActionEnd.H4"),
    AccordionSolidActionEndH5("AccordionSolidActionEnd.H5"),
    AccordionClearActionStartXs("AccordionClearActionStart.Xs"),
    AccordionClearActionStartS("AccordionClearActionStart.S"),
    AccordionClearActionStartM("AccordionClearActionStart.M"),
    AccordionClearActionStartL("AccordionClearActionStart.L"),
    AccordionClearActionStartH2("AccordionClearActionStart.H2"),
    AccordionClearActionStartH3("AccordionClearActionStart.H3"),
    AccordionClearActionStartH4("AccordionClearActionStart.H4"),
    AccordionClearActionStartH5("AccordionClearActionStart.H5"),
    AccordionClearActionEndXs("AccordionClearActionEnd.Xs"),
    AccordionClearActionEndS("AccordionClearActionEnd.S"),
    AccordionClearActionEndM("AccordionClearActionEnd.M"),
    AccordionClearActionEndL("AccordionClearActionEnd.L"),
    AccordionClearActionEndH2("AccordionClearActionEnd.H2"),
    AccordionClearActionEndH3("AccordionClearActionEnd.H3"),
    AccordionClearActionEndH4("AccordionClearActionEnd.H4"),
    AccordionClearActionEndH5("AccordionClearActionEnd.H5"),
    ;

    /**
     * Typed API для подбора стиля accordion-solid-action-start
     */
    public object SolidActionStart

    /**
     * Typed API для подбора стиля accordion-solid-action-end
     */
    public object SolidActionEnd

    /**
     * Typed API для подбора стиля accordion-clear-action-start
     */
    public object ClearActionStart

    /**
     * Typed API для подбора стиля accordion-clear-action-end
     */
    public object ClearActionEnd
}

/**
 * Возможные значения свойства size для accordion-solid-action-start
 */
public enum class AccordionSolidActionStartSize {
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
 * Возможные значения свойства size для accordion-solid-action-end
 */
public enum class AccordionSolidActionEndSize {
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
 * Возможные значения свойства size для accordion-clear-action-start
 */
public enum class AccordionClearActionStartSize {
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
 * Возможные значения свойства size для accordion-clear-action-end
 */
public enum class AccordionClearActionEndSize {
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
 * Возвращает [AccordionStyle] для [AccordionStyles]
 */
@Composable
public fun AccordionStyles.style(modify: @Composable AccordionStyleBuilder.() -> Unit = {}): AccordionStyle {
    val builder = when (this) {
        AccordionStyles.AccordionSolidActionStartXs -> AccordionSolidActionStart.Xs
        AccordionStyles.AccordionSolidActionStartS -> AccordionSolidActionStart.S
        AccordionStyles.AccordionSolidActionStartM -> AccordionSolidActionStart.M
        AccordionStyles.AccordionSolidActionStartL -> AccordionSolidActionStart.L
        AccordionStyles.AccordionSolidActionStartH2 -> AccordionSolidActionStart.H2
        AccordionStyles.AccordionSolidActionStartH3 -> AccordionSolidActionStart.H3
        AccordionStyles.AccordionSolidActionStartH4 -> AccordionSolidActionStart.H4
        AccordionStyles.AccordionSolidActionStartH5 -> AccordionSolidActionStart.H5
        AccordionStyles.AccordionSolidActionEndXs -> AccordionSolidActionEnd.Xs
        AccordionStyles.AccordionSolidActionEndS -> AccordionSolidActionEnd.S
        AccordionStyles.AccordionSolidActionEndM -> AccordionSolidActionEnd.M
        AccordionStyles.AccordionSolidActionEndL -> AccordionSolidActionEnd.L
        AccordionStyles.AccordionSolidActionEndH2 -> AccordionSolidActionEnd.H2
        AccordionStyles.AccordionSolidActionEndH3 -> AccordionSolidActionEnd.H3
        AccordionStyles.AccordionSolidActionEndH4 -> AccordionSolidActionEnd.H4
        AccordionStyles.AccordionSolidActionEndH5 -> AccordionSolidActionEnd.H5
        AccordionStyles.AccordionClearActionStartXs -> AccordionClearActionStart.Xs
        AccordionStyles.AccordionClearActionStartS -> AccordionClearActionStart.S
        AccordionStyles.AccordionClearActionStartM -> AccordionClearActionStart.M
        AccordionStyles.AccordionClearActionStartL -> AccordionClearActionStart.L
        AccordionStyles.AccordionClearActionStartH2 -> AccordionClearActionStart.H2
        AccordionStyles.AccordionClearActionStartH3 -> AccordionClearActionStart.H3
        AccordionStyles.AccordionClearActionStartH4 -> AccordionClearActionStart.H4
        AccordionStyles.AccordionClearActionStartH5 -> AccordionClearActionStart.H5
        AccordionStyles.AccordionClearActionEndXs -> AccordionClearActionEnd.Xs
        AccordionStyles.AccordionClearActionEndS -> AccordionClearActionEnd.S
        AccordionStyles.AccordionClearActionEndM -> AccordionClearActionEnd.M
        AccordionStyles.AccordionClearActionEndL -> AccordionClearActionEnd.L
        AccordionStyles.AccordionClearActionEndH2 -> AccordionClearActionEnd.H2
        AccordionStyles.AccordionClearActionEndH3 -> AccordionClearActionEnd.H3
        AccordionStyles.AccordionClearActionEndH4 -> AccordionClearActionEnd.H4
        AccordionStyles.AccordionClearActionEndH5 -> AccordionClearActionEnd.H5
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AccordionStyles] для accordion-solid-action-start
 */
public fun AccordionStyles.SolidActionStart.resolve(
    size: AccordionSolidActionStartSize =
        AccordionSolidActionStartSize.L,
): AccordionStyles = when {
    size == AccordionSolidActionStartSize.Xs -> AccordionStyles.AccordionSolidActionStartXs
    size == AccordionSolidActionStartSize.S -> AccordionStyles.AccordionSolidActionStartS
    size == AccordionSolidActionStartSize.M -> AccordionStyles.AccordionSolidActionStartM
    size == AccordionSolidActionStartSize.L -> AccordionStyles.AccordionSolidActionStartL
    size == AccordionSolidActionStartSize.H2 -> AccordionStyles.AccordionSolidActionStartH2
    size == AccordionSolidActionStartSize.H3 -> AccordionStyles.AccordionSolidActionStartH3
    size == AccordionSolidActionStartSize.H4 -> AccordionStyles.AccordionSolidActionStartH4
    size == AccordionSolidActionStartSize.H5 -> AccordionStyles.AccordionSolidActionStartH5
    else -> error("Unsupported accordion-solid-action-start style combination")
}

/**
 * Возвращает [AccordionStyle] для accordion-solid-action-start
 */
@Composable
public fun AccordionStyles.SolidActionStart.style(
    size: AccordionSolidActionStartSize =
        AccordionSolidActionStartSize.L,
    modify: @Composable AccordionStyleBuilder.() -> Unit = {},
): AccordionStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionStyles] для accordion-solid-action-end
 */
public fun AccordionStyles.SolidActionEnd.resolve(
    size: AccordionSolidActionEndSize =
        AccordionSolidActionEndSize.L,
): AccordionStyles = when {
    size == AccordionSolidActionEndSize.Xs -> AccordionStyles.AccordionSolidActionEndXs
    size == AccordionSolidActionEndSize.S -> AccordionStyles.AccordionSolidActionEndS
    size == AccordionSolidActionEndSize.M -> AccordionStyles.AccordionSolidActionEndM
    size == AccordionSolidActionEndSize.L -> AccordionStyles.AccordionSolidActionEndL
    size == AccordionSolidActionEndSize.H2 -> AccordionStyles.AccordionSolidActionEndH2
    size == AccordionSolidActionEndSize.H3 -> AccordionStyles.AccordionSolidActionEndH3
    size == AccordionSolidActionEndSize.H4 -> AccordionStyles.AccordionSolidActionEndH4
    size == AccordionSolidActionEndSize.H5 -> AccordionStyles.AccordionSolidActionEndH5
    else -> error("Unsupported accordion-solid-action-end style combination")
}

/**
 * Возвращает [AccordionStyle] для accordion-solid-action-end
 */
@Composable
public fun AccordionStyles.SolidActionEnd.style(
    size: AccordionSolidActionEndSize =
        AccordionSolidActionEndSize.L,
    modify: @Composable AccordionStyleBuilder.() -> Unit = {},
): AccordionStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionStyles] для accordion-clear-action-start
 */
public fun AccordionStyles.ClearActionStart.resolve(
    size: AccordionClearActionStartSize =
        AccordionClearActionStartSize.L,
): AccordionStyles = when {
    size == AccordionClearActionStartSize.Xs -> AccordionStyles.AccordionClearActionStartXs
    size == AccordionClearActionStartSize.S -> AccordionStyles.AccordionClearActionStartS
    size == AccordionClearActionStartSize.M -> AccordionStyles.AccordionClearActionStartM
    size == AccordionClearActionStartSize.L -> AccordionStyles.AccordionClearActionStartL
    size == AccordionClearActionStartSize.H2 -> AccordionStyles.AccordionClearActionStartH2
    size == AccordionClearActionStartSize.H3 -> AccordionStyles.AccordionClearActionStartH3
    size == AccordionClearActionStartSize.H4 -> AccordionStyles.AccordionClearActionStartH4
    size == AccordionClearActionStartSize.H5 -> AccordionStyles.AccordionClearActionStartH5
    else -> error("Unsupported accordion-clear-action-start style combination")
}

/**
 * Возвращает [AccordionStyle] для accordion-clear-action-start
 */
@Composable
public fun AccordionStyles.ClearActionStart.style(
    size: AccordionClearActionStartSize =
        AccordionClearActionStartSize.L,
    modify: @Composable AccordionStyleBuilder.() -> Unit = {},
): AccordionStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [AccordionStyles] для accordion-clear-action-end
 */
public fun AccordionStyles.ClearActionEnd.resolve(
    size: AccordionClearActionEndSize =
        AccordionClearActionEndSize.L,
): AccordionStyles = when {
    size == AccordionClearActionEndSize.Xs -> AccordionStyles.AccordionClearActionEndXs
    size == AccordionClearActionEndSize.S -> AccordionStyles.AccordionClearActionEndS
    size == AccordionClearActionEndSize.M -> AccordionStyles.AccordionClearActionEndM
    size == AccordionClearActionEndSize.L -> AccordionStyles.AccordionClearActionEndL
    size == AccordionClearActionEndSize.H2 -> AccordionStyles.AccordionClearActionEndH2
    size == AccordionClearActionEndSize.H3 -> AccordionStyles.AccordionClearActionEndH3
    size == AccordionClearActionEndSize.H4 -> AccordionStyles.AccordionClearActionEndH4
    size == AccordionClearActionEndSize.H5 -> AccordionStyles.AccordionClearActionEndH5
    else -> error("Unsupported accordion-clear-action-end style combination")
}

/**
 * Возвращает [AccordionStyle] для accordion-clear-action-end
 */
@Composable
public fun AccordionStyles.ClearActionEnd.style(
    size: AccordionClearActionEndSize =
        AccordionClearActionEndSize.L,
    modify: @Composable AccordionStyleBuilder.() -> Unit = {},
): AccordionStyle = resolve(size).style(modify)
