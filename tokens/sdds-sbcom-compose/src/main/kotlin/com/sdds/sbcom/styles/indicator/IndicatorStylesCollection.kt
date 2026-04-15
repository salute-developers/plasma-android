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
    AvatarIndicatorSize14("AvatarIndicator.Size14"),
    AvatarIndicatorSize12("AvatarIndicator.Size12"),
    AvatarIndicatorSize10("AvatarIndicator.Size10"),
    AvatarIndicatorSize8("AvatarIndicator.Size8"),
    AvatarIndicatorSize6("AvatarIndicator.Size6"),
    IndicatorStateSuccess("Indicator.StateSuccess"),
    IndicatorStateGlobalWhite("Indicator.StateGlobalWhite"),
    IndicatorStateMute("Indicator.StateMute"),
    IndicatorStateDanger("Indicator.StateDanger"),
    IndicatorStateWarning("Indicator.StateWarning"),
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modifyAction: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
    val builder = when (this) {
        IndicatorStyles.AvatarIndicatorSize14 -> AvatarIndicator.Size14
        IndicatorStyles.AvatarIndicatorSize12 -> AvatarIndicator.Size12
        IndicatorStyles.AvatarIndicatorSize10 -> AvatarIndicator.Size10
        IndicatorStyles.AvatarIndicatorSize8 -> AvatarIndicator.Size8
        IndicatorStyles.AvatarIndicatorSize6 -> AvatarIndicator.Size6
        IndicatorStyles.IndicatorStateSuccess -> Indicator.StateSuccess
        IndicatorStyles.IndicatorStateGlobalWhite -> Indicator.StateGlobalWhite
        IndicatorStyles.IndicatorStateMute -> Indicator.StateMute
        IndicatorStyles.IndicatorStateDanger -> Indicator.StateDanger
        IndicatorStyles.IndicatorStateWarning -> Indicator.StateWarning
    }
    return builder.modify(modifyAction).style()
}
