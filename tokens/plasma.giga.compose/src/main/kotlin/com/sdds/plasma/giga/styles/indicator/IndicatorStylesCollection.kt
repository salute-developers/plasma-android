// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.indicator

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
    AvatarIndicatorL("AvatarIndicator.L"),
    AvatarIndicatorM("AvatarIndicator.M"),
    AvatarIndicatorS("AvatarIndicator.S"),
    IndicatorLDefault("Indicator.L.Default"),
    IndicatorLAccent("Indicator.L.Accent"),
    IndicatorLInactive("Indicator.L.Inactive"),
    IndicatorLPositive("Indicator.L.Positive"),
    IndicatorLWarning("Indicator.L.Warning"),
    IndicatorLNegative("Indicator.L.Negative"),
    IndicatorLBlack("Indicator.L.Black"),
    IndicatorLWhite("Indicator.L.White"),
    IndicatorMDefault("Indicator.M.Default"),
    IndicatorMAccent("Indicator.M.Accent"),
    IndicatorMInactive("Indicator.M.Inactive"),
    IndicatorMPositive("Indicator.M.Positive"),
    IndicatorMWarning("Indicator.M.Warning"),
    IndicatorMNegative("Indicator.M.Negative"),
    IndicatorMBlack("Indicator.M.Black"),
    IndicatorMWhite("Indicator.M.White"),
    IndicatorSDefault("Indicator.S.Default"),
    IndicatorSAccent("Indicator.S.Accent"),
    IndicatorSInactive("Indicator.S.Inactive"),
    IndicatorSPositive("Indicator.S.Positive"),
    IndicatorSWarning("Indicator.S.Warning"),
    IndicatorSNegative("Indicator.S.Negative"),
    IndicatorSBlack("Indicator.S.Black"),
    IndicatorSWhite("Indicator.S.White"),
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
    L,
    M,
    S,
}

/**
 * Возможные значения свойства size для indicator
 */
public enum class IndicatorDefaultSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства view для indicator
 */
public enum class IndicatorDefaultView {
    Default,
    Accent,
    Inactive,
    Positive,
    Warning,
    Negative,
    Black,
    White,
}

/**
 * Возвращает [IndicatorStyle] для [IndicatorStyles]
 */
@Composable
public fun IndicatorStyles.style(modify: @Composable IndicatorStyleBuilder.() -> Unit = {}): IndicatorStyle {
    val builder = when (this) {
        IndicatorStyles.AvatarIndicatorL -> AvatarIndicator.L
        IndicatorStyles.AvatarIndicatorM -> AvatarIndicator.M
        IndicatorStyles.AvatarIndicatorS -> AvatarIndicator.S
        IndicatorStyles.IndicatorLDefault -> Indicator.L.Default
        IndicatorStyles.IndicatorLAccent -> Indicator.L.Accent
        IndicatorStyles.IndicatorLInactive -> Indicator.L.Inactive
        IndicatorStyles.IndicatorLPositive -> Indicator.L.Positive
        IndicatorStyles.IndicatorLWarning -> Indicator.L.Warning
        IndicatorStyles.IndicatorLNegative -> Indicator.L.Negative
        IndicatorStyles.IndicatorLBlack -> Indicator.L.Black
        IndicatorStyles.IndicatorLWhite -> Indicator.L.White
        IndicatorStyles.IndicatorMDefault -> Indicator.M.Default
        IndicatorStyles.IndicatorMAccent -> Indicator.M.Accent
        IndicatorStyles.IndicatorMInactive -> Indicator.M.Inactive
        IndicatorStyles.IndicatorMPositive -> Indicator.M.Positive
        IndicatorStyles.IndicatorMWarning -> Indicator.M.Warning
        IndicatorStyles.IndicatorMNegative -> Indicator.M.Negative
        IndicatorStyles.IndicatorMBlack -> Indicator.M.Black
        IndicatorStyles.IndicatorMWhite -> Indicator.M.White
        IndicatorStyles.IndicatorSDefault -> Indicator.S.Default
        IndicatorStyles.IndicatorSAccent -> Indicator.S.Accent
        IndicatorStyles.IndicatorSInactive -> Indicator.S.Inactive
        IndicatorStyles.IndicatorSPositive -> Indicator.S.Positive
        IndicatorStyles.IndicatorSWarning -> Indicator.S.Warning
        IndicatorStyles.IndicatorSNegative -> Indicator.S.Negative
        IndicatorStyles.IndicatorSBlack -> Indicator.S.Black
        IndicatorStyles.IndicatorSWhite -> Indicator.S.White
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IndicatorStyles] для avatar-indicator
 */
public fun IndicatorStyles.AvatarIndicator.resolve(
    size: AvatarIndicatorSize =
        AvatarIndicatorSize.L,
): IndicatorStyles = when {
    size == AvatarIndicatorSize.L -> IndicatorStyles.AvatarIndicatorL
    size == AvatarIndicatorSize.M -> IndicatorStyles.AvatarIndicatorM
    size == AvatarIndicatorSize.S -> IndicatorStyles.AvatarIndicatorS
    else -> error("Unsupported avatar-indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для avatar-indicator
 */
@Composable
public fun IndicatorStyles.AvatarIndicator.style(
    size: AvatarIndicatorSize = AvatarIndicatorSize.L,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [IndicatorStyles] для indicator
 */
public fun IndicatorStyles.Default.resolve(
    size: IndicatorDefaultSize = IndicatorDefaultSize.L,
    view: IndicatorDefaultView = IndicatorDefaultView.Default,
): IndicatorStyles = when {
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Default ->
        IndicatorStyles.IndicatorLDefault
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Accent ->
        IndicatorStyles.IndicatorLAccent
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Inactive ->
        IndicatorStyles.IndicatorLInactive
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Positive ->
        IndicatorStyles.IndicatorLPositive
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Warning ->
        IndicatorStyles.IndicatorLWarning
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Negative ->
        IndicatorStyles.IndicatorLNegative
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.Black ->
        IndicatorStyles.IndicatorLBlack
    size == IndicatorDefaultSize.L && view == IndicatorDefaultView.White ->
        IndicatorStyles.IndicatorLWhite
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Default ->
        IndicatorStyles.IndicatorMDefault
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Accent ->
        IndicatorStyles.IndicatorMAccent
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Inactive ->
        IndicatorStyles.IndicatorMInactive
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Positive ->
        IndicatorStyles.IndicatorMPositive
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Warning ->
        IndicatorStyles.IndicatorMWarning
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Negative ->
        IndicatorStyles.IndicatorMNegative
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.Black ->
        IndicatorStyles.IndicatorMBlack
    size == IndicatorDefaultSize.M && view == IndicatorDefaultView.White ->
        IndicatorStyles.IndicatorMWhite
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Default ->
        IndicatorStyles.IndicatorSDefault
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Accent ->
        IndicatorStyles.IndicatorSAccent
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Inactive ->
        IndicatorStyles.IndicatorSInactive
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Positive ->
        IndicatorStyles.IndicatorSPositive
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Warning ->
        IndicatorStyles.IndicatorSWarning
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Negative ->
        IndicatorStyles.IndicatorSNegative
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.Black ->
        IndicatorStyles.IndicatorSBlack
    size == IndicatorDefaultSize.S && view == IndicatorDefaultView.White ->
        IndicatorStyles.IndicatorSWhite
    else -> error("Unsupported indicator style combination")
}

/**
 * Возвращает [IndicatorStyle] для indicator
 */
@Composable
public fun IndicatorStyles.Default.style(
    size: IndicatorDefaultSize = IndicatorDefaultSize.L,
    view: IndicatorDefaultView = IndicatorDefaultView.Default,
    modify: @Composable IndicatorStyleBuilder.() -> Unit = {},
): IndicatorStyle = resolve(size, view).style(modify)
