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
    ;

    /**
     * Typed API для подбора стиля avatar-indicator
     */
    public object AvatarIndicator

    /**
     * Typed API для подбора стиля indicator
     */
    public object Default
}

/**
 * Возможные значения свойства size для avatar-indicator
 */
public enum class IndicatorAvatarIndicatorSize {
    Size14,
    Size12,
    Size10,
    Size8,
    Size6,
}

/**
 * Возможные значения свойства state для indicator
 */
public enum class IndicatorDefaultState {
    Success,
    GlobalWhite,
    Mute,
    Danger,
    Warning,
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modify: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IndicatorStyles] для avatar-indicator
 */
public fun IndicatorStyles.AvatarIndicator.resolve(
    size: IndicatorAvatarIndicatorSize =
        IndicatorAvatarIndicatorSize.Size14,
): IndicatorStyles = when {
    size == IndicatorAvatarIndicatorSize.Size14 -> IndicatorStyles.AvatarIndicatorSize14
    size == IndicatorAvatarIndicatorSize.Size12 -> IndicatorStyles.AvatarIndicatorSize12
    size == IndicatorAvatarIndicatorSize.Size10 -> IndicatorStyles.AvatarIndicatorSize10
    size == IndicatorAvatarIndicatorSize.Size8 -> IndicatorStyles.AvatarIndicatorSize8
    size == IndicatorAvatarIndicatorSize.Size6 -> IndicatorStyles.AvatarIndicatorSize6
    else -> error("Unsupported avatar-indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для avatar-indicator
 */
@Composable
public fun IndicatorStyles.AvatarIndicator.style(
    size: IndicatorAvatarIndicatorSize =
        IndicatorAvatarIndicatorSize.Size14,
    modify: @Composable IndicatorStyleBuilder.() -> Unit =
        {},
): IndicatorStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [IndicatorStyles] для indicator
 */
public fun IndicatorStyles.Default.resolve(
    state: IndicatorDefaultState =
        IndicatorDefaultState.Success,
): IndicatorStyles = when {
    state == IndicatorDefaultState.Success -> IndicatorStyles.IndicatorStateSuccess
    state == IndicatorDefaultState.GlobalWhite -> IndicatorStyles.IndicatorStateGlobalWhite
    state == IndicatorDefaultState.Mute -> IndicatorStyles.IndicatorStateMute
    state == IndicatorDefaultState.Danger -> IndicatorStyles.IndicatorStateDanger
    state == IndicatorDefaultState.Warning -> IndicatorStyles.IndicatorStateWarning
    else -> error("Unsupported indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для indicator
 */
@Composable
public fun IndicatorStyles.Default.style(
    state: IndicatorDefaultState =
        IndicatorDefaultState.Success,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle = resolve(state).style(modify)
