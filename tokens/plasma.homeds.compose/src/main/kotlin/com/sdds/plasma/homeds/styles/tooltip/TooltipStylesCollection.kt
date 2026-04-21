// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.tooltip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TooltipStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Tooltip
 */
public enum class TooltipStyles(
    public val key: String,
) {
    TooltipM("Tooltip.M"),
    TooltipS("Tooltip.S"),
    ;

    /**
     * Typed API для подбора стиля tooltip
     */
    public companion object
}

/**
 * Возможные значения свойства size для tooltip
 */
public enum class TooltipSize {
    M,
    S,
}

/**
 * Возвращает [TooltipStyle] для [TooltipStyles]
 */
@Composable
public fun TooltipStyles.style(modify: @Composable TooltipStyleBuilder.() -> Unit = {}): TooltipStyle {
    val builder = when (this) {
        TooltipStyles.TooltipM -> Tooltip.M
        TooltipStyles.TooltipS -> Tooltip.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TooltipStyles] для tooltip
 */
public fun TooltipStyles.Companion.resolve(size: TooltipSize = TooltipSize.M): TooltipStyles = when {
    size == TooltipSize.M -> TooltipStyles.TooltipM
    size == TooltipSize.S -> TooltipStyles.TooltipS
    else -> error("Unsupported tooltip style combination")
}

/**
 * Возвращает [TooltipStyle] для tooltip
 */
@Composable
public fun TooltipStyles.Companion.style(
    size: TooltipSize = TooltipSize.M,
    modify: @Composable
    TooltipStyleBuilder.() -> Unit = {},
): TooltipStyle = resolve(size).style(modify)
