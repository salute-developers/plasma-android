// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.iconbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента IconButton
 */
public enum class IconButtonStyles(
    public val key: String,
) {
    IconButtonLDefault("IconButton.L.Default"),
    IconButtonLClear("IconButton.L.Clear"),
    IconButtonLPilledDefault("IconButton.L.Pilled.Default"),
    IconButtonLPilledClear("IconButton.L.Pilled.Clear"),
    IconButtonMDefault("IconButton.M.Default"),
    IconButtonMClear("IconButton.M.Clear"),
    IconButtonMPilledDefault("IconButton.M.Pilled.Default"),
    IconButtonMPilledClear("IconButton.M.Pilled.Clear"),
    IconButtonSDefault("IconButton.S.Default"),
    IconButtonSClear("IconButton.S.Clear"),
    IconButtonSPilledDefault("IconButton.S.Pilled.Default"),
    IconButtonSPilledClear("IconButton.S.Pilled.Clear"),
    IconButtonXsDefault("IconButton.Xs.Default"),
    IconButtonXsClear("IconButton.Xs.Clear"),
    IconButtonXsPilledDefault("IconButton.Xs.Pilled.Default"),
    IconButtonXsPilledClear("IconButton.Xs.Pilled.Clear"),
    ;

    /**
     * Typed API для подбора стиля icon-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для icon-button
 */
public enum class IconButtonSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для icon-button
 */
public enum class IconButtonShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для icon-button
 */
public enum class IconButtonView {
    Default,
    Clear,
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modify: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonLDefault -> IconButton.L.Default
        IconButtonStyles.IconButtonLClear -> IconButton.L.Clear
        IconButtonStyles.IconButtonLPilledDefault -> IconButton.L.Pilled.Default
        IconButtonStyles.IconButtonLPilledClear -> IconButton.L.Pilled.Clear
        IconButtonStyles.IconButtonMDefault -> IconButton.M.Default
        IconButtonStyles.IconButtonMClear -> IconButton.M.Clear
        IconButtonStyles.IconButtonMPilledDefault -> IconButton.M.Pilled.Default
        IconButtonStyles.IconButtonMPilledClear -> IconButton.M.Pilled.Clear
        IconButtonStyles.IconButtonSDefault -> IconButton.S.Default
        IconButtonStyles.IconButtonSClear -> IconButton.S.Clear
        IconButtonStyles.IconButtonSPilledDefault -> IconButton.S.Pilled.Default
        IconButtonStyles.IconButtonSPilledClear -> IconButton.S.Pilled.Clear
        IconButtonStyles.IconButtonXsDefault -> IconButton.Xs.Default
        IconButtonStyles.IconButtonXsClear -> IconButton.Xs.Clear
        IconButtonStyles.IconButtonXsPilledDefault -> IconButton.Xs.Pilled.Default
        IconButtonStyles.IconButtonXsPilledClear -> IconButton.Xs.Pilled.Clear
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconButtonStyles] для icon-button
 */
public fun IconButtonStyles.Companion.resolve(
    size: IconButtonSize = IconButtonSize.L,
    shape: IconButtonShape = IconButtonShape.Default,
    view: IconButtonView = IconButtonView.Default,
): IconButtonStyles = when {
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonLPilledDefault
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonLPilledClear
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonMPilledDefault
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonMPilledClear
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonSPilledDefault
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonSPilledClear
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Default -> IconButtonStyles.IconButtonXsPilledDefault
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonXsPilledClear
    size == IconButtonSize.L && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonLDefault
    size == IconButtonSize.L && view == IconButtonView.Clear -> IconButtonStyles.IconButtonLClear
    size == IconButtonSize.M && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonMDefault
    size == IconButtonSize.M && view == IconButtonView.Clear -> IconButtonStyles.IconButtonMClear
    size == IconButtonSize.S && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonSDefault
    size == IconButtonSize.S && view == IconButtonView.Clear -> IconButtonStyles.IconButtonSClear
    size == IconButtonSize.Xs && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonXsDefault
    size == IconButtonSize.Xs && view == IconButtonView.Clear -> IconButtonStyles.IconButtonXsClear
    else -> error("Unsupported icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для icon-button
 */
@Composable
public fun IconButtonStyles.Companion.style(
    size: IconButtonSize = IconButtonSize.L,
    shape: IconButtonShape = IconButtonShape.Default,
    view: IconButtonView = IconButtonView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, shape, view).style(modify)
