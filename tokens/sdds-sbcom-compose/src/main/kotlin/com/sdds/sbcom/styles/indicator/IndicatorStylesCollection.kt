// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.indicator

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Indicator
 */
public enum class IndicatorStyles(
    public val key: String,
) {
    IndicatorSuccess("Indicator.Success"),
    IndicatorGlobalWhite("Indicator.GlobalWhite"),
    IndicatorMute("Indicator.Mute"),
    IndicatorDanger("Indicator.Danger"),
    IndicatorWarning("Indicator.Warning"),
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modifyAction: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
    val builder = when (this) {
        IndicatorStyles.IndicatorSuccess -> Indicator.Success
        IndicatorStyles.IndicatorGlobalWhite -> Indicator.GlobalWhite
        IndicatorStyles.IndicatorMute -> Indicator.Mute
        IndicatorStyles.IndicatorDanger -> Indicator.Danger
        IndicatorStyles.IndicatorWarning -> Indicator.Warning
    }
    return builder.modify(modifyAction).style()
}
