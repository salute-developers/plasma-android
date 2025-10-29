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
}

/**
 * Возвращает [TooltipStyle] для [TooltipStyles]
 */
@Composable
public fun TooltipStyles.style(modifyAction: @Composable TooltipStyleBuilder.() -> Unit = {}): TooltipStyle {
    val builder = when (this) {
        TooltipStyles.TooltipM -> Tooltip.M
        TooltipStyles.TooltipS -> Tooltip.S
    }
    return builder.modify(modifyAction).style()
}
