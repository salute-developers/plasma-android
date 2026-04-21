// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.tooltip

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
    TooltipDefault("Tooltip.Default"),
    ;

    /**
     * Typed API для подбора стиля tooltip
     */
    public companion object
}

/**
 * Возвращает [TooltipStyle] для [TooltipStyles]
 */
@Composable
public fun TooltipStyles.style(modify: @Composable TooltipStyleBuilder.() -> Unit = {}): TooltipStyle {
    val builder = when (this) {
        TooltipStyles.TooltipDefault -> Tooltip.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TooltipStyles] для tooltip
 */
public fun TooltipStyles.Companion.resolve(): TooltipStyles = TooltipStyles.TooltipDefault

/**
 * Возвращает [TooltipStyle] для tooltip
 */
@Composable
public fun TooltipStyles.Companion.style(modify: @Composable TooltipStyleBuilder.() -> Unit = {}):
    TooltipStyle = resolve().style(modify)
