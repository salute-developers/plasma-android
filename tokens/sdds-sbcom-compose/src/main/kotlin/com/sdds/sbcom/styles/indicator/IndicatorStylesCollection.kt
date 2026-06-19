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
    IndicatorSize14StateAccent("Indicator.Size14.StateAccent"),
    IndicatorSize14StateGlobalWhite("Indicator.Size14.StateGlobalWhite"),
    IndicatorSize14StateMute("Indicator.Size14.StateMute"),
    IndicatorSize14StateDanger("Indicator.Size14.StateDanger"),
    IndicatorSize14StateWarning("Indicator.Size14.StateWarning"),
    IndicatorSize12StateAccent("Indicator.Size12.StateAccent"),
    IndicatorSize12StateGlobalWhite("Indicator.Size12.StateGlobalWhite"),
    IndicatorSize12StateMute("Indicator.Size12.StateMute"),
    IndicatorSize12StateDanger("Indicator.Size12.StateDanger"),
    IndicatorSize12StateWarning("Indicator.Size12.StateWarning"),
    IndicatorSize10StateAccent("Indicator.Size10.StateAccent"),
    IndicatorSize10StateGlobalWhite("Indicator.Size10.StateGlobalWhite"),
    IndicatorSize10StateMute("Indicator.Size10.StateMute"),
    IndicatorSize10StateDanger("Indicator.Size10.StateDanger"),
    IndicatorSize10StateWarning("Indicator.Size10.StateWarning"),
    IndicatorSize8StateAccent("Indicator.Size8.StateAccent"),
    IndicatorSize8StateGlobalWhite("Indicator.Size8.StateGlobalWhite"),
    IndicatorSize8StateMute("Indicator.Size8.StateMute"),
    IndicatorSize8StateDanger("Indicator.Size8.StateDanger"),
    IndicatorSize8StateWarning("Indicator.Size8.StateWarning"),
    IndicatorSize6StateAccent("Indicator.Size6.StateAccent"),
    IndicatorSize6StateGlobalWhite("Indicator.Size6.StateGlobalWhite"),
    IndicatorSize6StateMute("Indicator.Size6.StateMute"),
    IndicatorSize6StateDanger("Indicator.Size6.StateDanger"),
    IndicatorSize6StateWarning("Indicator.Size6.StateWarning"),
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
public enum class AvatarIndicatorSize {
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
    Accent,
    GlobalWhite,
    Mute,
    Danger,
    Warning,
}

/**
 * Возможные значения свойства size для indicator
 */
public enum class IndicatorDefaultSize {
    Size14,
    Size12,
    Size10,
    Size8,
    Size6,
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
        IndicatorStyles.IndicatorSize14StateAccent -> Indicator.Size14.StateAccent
        IndicatorStyles.IndicatorSize14StateGlobalWhite -> Indicator.Size14.StateGlobalWhite
        IndicatorStyles.IndicatorSize14StateMute -> Indicator.Size14.StateMute
        IndicatorStyles.IndicatorSize14StateDanger -> Indicator.Size14.StateDanger
        IndicatorStyles.IndicatorSize14StateWarning -> Indicator.Size14.StateWarning
        IndicatorStyles.IndicatorSize12StateAccent -> Indicator.Size12.StateAccent
        IndicatorStyles.IndicatorSize12StateGlobalWhite -> Indicator.Size12.StateGlobalWhite
        IndicatorStyles.IndicatorSize12StateMute -> Indicator.Size12.StateMute
        IndicatorStyles.IndicatorSize12StateDanger -> Indicator.Size12.StateDanger
        IndicatorStyles.IndicatorSize12StateWarning -> Indicator.Size12.StateWarning
        IndicatorStyles.IndicatorSize10StateAccent -> Indicator.Size10.StateAccent
        IndicatorStyles.IndicatorSize10StateGlobalWhite -> Indicator.Size10.StateGlobalWhite
        IndicatorStyles.IndicatorSize10StateMute -> Indicator.Size10.StateMute
        IndicatorStyles.IndicatorSize10StateDanger -> Indicator.Size10.StateDanger
        IndicatorStyles.IndicatorSize10StateWarning -> Indicator.Size10.StateWarning
        IndicatorStyles.IndicatorSize8StateAccent -> Indicator.Size8.StateAccent
        IndicatorStyles.IndicatorSize8StateGlobalWhite -> Indicator.Size8.StateGlobalWhite
        IndicatorStyles.IndicatorSize8StateMute -> Indicator.Size8.StateMute
        IndicatorStyles.IndicatorSize8StateDanger -> Indicator.Size8.StateDanger
        IndicatorStyles.IndicatorSize8StateWarning -> Indicator.Size8.StateWarning
        IndicatorStyles.IndicatorSize6StateAccent -> Indicator.Size6.StateAccent
        IndicatorStyles.IndicatorSize6StateGlobalWhite -> Indicator.Size6.StateGlobalWhite
        IndicatorStyles.IndicatorSize6StateMute -> Indicator.Size6.StateMute
        IndicatorStyles.IndicatorSize6StateDanger -> Indicator.Size6.StateDanger
        IndicatorStyles.IndicatorSize6StateWarning -> Indicator.Size6.StateWarning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IndicatorStyles] для avatar-indicator
 */
public fun IndicatorStyles.AvatarIndicator.resolve(
    size: AvatarIndicatorSize =
        AvatarIndicatorSize.Size14,
): IndicatorStyles = when {
    size == AvatarIndicatorSize.Size14 -> IndicatorStyles.AvatarIndicatorSize14
    size == AvatarIndicatorSize.Size12 -> IndicatorStyles.AvatarIndicatorSize12
    size == AvatarIndicatorSize.Size10 -> IndicatorStyles.AvatarIndicatorSize10
    size == AvatarIndicatorSize.Size8 -> IndicatorStyles.AvatarIndicatorSize8
    size == AvatarIndicatorSize.Size6 -> IndicatorStyles.AvatarIndicatorSize6
    else -> error("Unsupported avatar-indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для avatar-indicator
 */
@Composable
public fun IndicatorStyles.AvatarIndicator.style(
    size: AvatarIndicatorSize =
        AvatarIndicatorSize.Size14,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [IndicatorStyles] для indicator
 */
public fun IndicatorStyles.Default.resolve(
    state: IndicatorDefaultState =
        IndicatorDefaultState.Accent,
    size: IndicatorDefaultSize = IndicatorDefaultSize.Size8,
): IndicatorStyles = when {
    state == IndicatorDefaultState.Accent && size == IndicatorDefaultSize.Size14 ->
        IndicatorStyles.IndicatorSize14StateAccent
    state == IndicatorDefaultState.GlobalWhite && size == IndicatorDefaultSize.Size14 ->
        IndicatorStyles.IndicatorSize14StateGlobalWhite
    state == IndicatorDefaultState.Mute && size == IndicatorDefaultSize.Size14 ->
        IndicatorStyles.IndicatorSize14StateMute
    state == IndicatorDefaultState.Danger && size == IndicatorDefaultSize.Size14 ->
        IndicatorStyles.IndicatorSize14StateDanger
    state == IndicatorDefaultState.Warning && size == IndicatorDefaultSize.Size14 ->
        IndicatorStyles.IndicatorSize14StateWarning
    state == IndicatorDefaultState.Accent && size == IndicatorDefaultSize.Size12 ->
        IndicatorStyles.IndicatorSize12StateAccent
    state == IndicatorDefaultState.GlobalWhite && size == IndicatorDefaultSize.Size12 ->
        IndicatorStyles.IndicatorSize12StateGlobalWhite
    state == IndicatorDefaultState.Mute && size == IndicatorDefaultSize.Size12 ->
        IndicatorStyles.IndicatorSize12StateMute
    state == IndicatorDefaultState.Danger && size == IndicatorDefaultSize.Size12 ->
        IndicatorStyles.IndicatorSize12StateDanger
    state == IndicatorDefaultState.Warning && size == IndicatorDefaultSize.Size12 ->
        IndicatorStyles.IndicatorSize12StateWarning
    state == IndicatorDefaultState.Accent && size == IndicatorDefaultSize.Size10 ->
        IndicatorStyles.IndicatorSize10StateAccent
    state == IndicatorDefaultState.GlobalWhite && size == IndicatorDefaultSize.Size10 ->
        IndicatorStyles.IndicatorSize10StateGlobalWhite
    state == IndicatorDefaultState.Mute && size == IndicatorDefaultSize.Size10 ->
        IndicatorStyles.IndicatorSize10StateMute
    state == IndicatorDefaultState.Danger && size == IndicatorDefaultSize.Size10 ->
        IndicatorStyles.IndicatorSize10StateDanger
    state == IndicatorDefaultState.Warning && size == IndicatorDefaultSize.Size10 ->
        IndicatorStyles.IndicatorSize10StateWarning
    state == IndicatorDefaultState.Accent && size == IndicatorDefaultSize.Size8 ->
        IndicatorStyles.IndicatorSize8StateAccent
    state == IndicatorDefaultState.GlobalWhite && size == IndicatorDefaultSize.Size8 ->
        IndicatorStyles.IndicatorSize8StateGlobalWhite
    state == IndicatorDefaultState.Mute && size == IndicatorDefaultSize.Size8 ->
        IndicatorStyles.IndicatorSize8StateMute
    state == IndicatorDefaultState.Danger && size == IndicatorDefaultSize.Size8 ->
        IndicatorStyles.IndicatorSize8StateDanger
    state == IndicatorDefaultState.Warning && size == IndicatorDefaultSize.Size8 ->
        IndicatorStyles.IndicatorSize8StateWarning
    state == IndicatorDefaultState.Accent && size == IndicatorDefaultSize.Size6 ->
        IndicatorStyles.IndicatorSize6StateAccent
    state == IndicatorDefaultState.GlobalWhite && size == IndicatorDefaultSize.Size6 ->
        IndicatorStyles.IndicatorSize6StateGlobalWhite
    state == IndicatorDefaultState.Mute && size == IndicatorDefaultSize.Size6 ->
        IndicatorStyles.IndicatorSize6StateMute
    state == IndicatorDefaultState.Danger && size == IndicatorDefaultSize.Size6 ->
        IndicatorStyles.IndicatorSize6StateDanger
    state == IndicatorDefaultState.Warning && size == IndicatorDefaultSize.Size6 ->
        IndicatorStyles.IndicatorSize6StateWarning
    else -> error("Unsupported indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для indicator
 */
@Composable
public fun IndicatorStyles.Default.style(
    state: IndicatorDefaultState = IndicatorDefaultState.Accent,
    size: IndicatorDefaultSize = IndicatorDefaultSize.Size8,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle = resolve(state, size).style(modify)
