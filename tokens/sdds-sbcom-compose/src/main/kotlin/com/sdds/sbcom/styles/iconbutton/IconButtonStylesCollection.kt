// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.iconbutton

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
    IconButtonSize48ModeAccentFilled("IconButton.Size48.ModeAccentFilled"),
    IconButtonSize48ModeAccentGrey("IconButton.Size48.ModeAccentGrey"),
    IconButtonSize48ModeDangerTint("IconButton.Size48.ModeDangerTint"),
    IconButtonSize48BgNoModeAccentFilled("IconButton.Size48.BgNo.ModeAccentFilled"),
    IconButtonSize48BgNoModeAccentGrey("IconButton.Size48.BgNo.ModeAccentGrey"),
    IconButtonSize48BgNoModeDangerTint("IconButton.Size48.BgNo.ModeDangerTint"),
    IconButtonSize40ModeAccentFilled("IconButton.Size40.ModeAccentFilled"),
    IconButtonSize40ModeAccentGrey("IconButton.Size40.ModeAccentGrey"),
    IconButtonSize40ModeDangerTint("IconButton.Size40.ModeDangerTint"),
    IconButtonSize40BgNoModeAccentFilled("IconButton.Size40.BgNo.ModeAccentFilled"),
    IconButtonSize40BgNoModeAccentGrey("IconButton.Size40.BgNo.ModeAccentGrey"),
    IconButtonSize40BgNoModeDangerTint("IconButton.Size40.BgNo.ModeDangerTint"),
    IconButtonSize32ModeAccentFilled("IconButton.Size32.ModeAccentFilled"),
    IconButtonSize32ModeAccentGrey("IconButton.Size32.ModeAccentGrey"),
    IconButtonSize32ModeDangerTint("IconButton.Size32.ModeDangerTint"),
    IconButtonSize32BgNoModeAccentFilled("IconButton.Size32.BgNo.ModeAccentFilled"),
    IconButtonSize32BgNoModeAccentGrey("IconButton.Size32.BgNo.ModeAccentGrey"),
    IconButtonSize32BgNoModeDangerTint("IconButton.Size32.BgNo.ModeDangerTint"),
    IconButtonSize24ModeAccentFilled("IconButton.Size24.ModeAccentFilled"),
    IconButtonSize24ModeAccentGrey("IconButton.Size24.ModeAccentGrey"),
    IconButtonSize24ModeDangerTint("IconButton.Size24.ModeDangerTint"),
    IconButtonSize24BgNoModeAccentFilled("IconButton.Size24.BgNo.ModeAccentFilled"),
    IconButtonSize24BgNoModeAccentGrey("IconButton.Size24.BgNo.ModeAccentGrey"),
    IconButtonSize24BgNoModeDangerTint("IconButton.Size24.BgNo.ModeDangerTint"),
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
    Size48,
    Size40,
    Size32,
    Size24,
}

/**
 * Возможные значения свойства bg для icon-button
 */
public enum class IconButtonBg {
    Yes,
    No,
}

/**
 * Возможные значения свойства mode для icon-button
 */
public enum class IconButtonMode {
    AccentFilled,
    AccentGrey,
    DangerTint,
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modify: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonSize48ModeAccentFilled -> IconButton.Size48.ModeAccentFilled
        IconButtonStyles.IconButtonSize48ModeAccentGrey -> IconButton.Size48.ModeAccentGrey
        IconButtonStyles.IconButtonSize48ModeDangerTint -> IconButton.Size48.ModeDangerTint
        IconButtonStyles.IconButtonSize48BgNoModeAccentFilled ->
            IconButton.Size48.BgNo.ModeAccentFilled
        IconButtonStyles.IconButtonSize48BgNoModeAccentGrey -> IconButton.Size48.BgNo.ModeAccentGrey
        IconButtonStyles.IconButtonSize48BgNoModeDangerTint -> IconButton.Size48.BgNo.ModeDangerTint
        IconButtonStyles.IconButtonSize40ModeAccentFilled -> IconButton.Size40.ModeAccentFilled
        IconButtonStyles.IconButtonSize40ModeAccentGrey -> IconButton.Size40.ModeAccentGrey
        IconButtonStyles.IconButtonSize40ModeDangerTint -> IconButton.Size40.ModeDangerTint
        IconButtonStyles.IconButtonSize40BgNoModeAccentFilled ->
            IconButton.Size40.BgNo.ModeAccentFilled
        IconButtonStyles.IconButtonSize40BgNoModeAccentGrey -> IconButton.Size40.BgNo.ModeAccentGrey
        IconButtonStyles.IconButtonSize40BgNoModeDangerTint -> IconButton.Size40.BgNo.ModeDangerTint
        IconButtonStyles.IconButtonSize32ModeAccentFilled -> IconButton.Size32.ModeAccentFilled
        IconButtonStyles.IconButtonSize32ModeAccentGrey -> IconButton.Size32.ModeAccentGrey
        IconButtonStyles.IconButtonSize32ModeDangerTint -> IconButton.Size32.ModeDangerTint
        IconButtonStyles.IconButtonSize32BgNoModeAccentFilled ->
            IconButton.Size32.BgNo.ModeAccentFilled
        IconButtonStyles.IconButtonSize32BgNoModeAccentGrey -> IconButton.Size32.BgNo.ModeAccentGrey
        IconButtonStyles.IconButtonSize32BgNoModeDangerTint -> IconButton.Size32.BgNo.ModeDangerTint
        IconButtonStyles.IconButtonSize24ModeAccentFilled -> IconButton.Size24.ModeAccentFilled
        IconButtonStyles.IconButtonSize24ModeAccentGrey -> IconButton.Size24.ModeAccentGrey
        IconButtonStyles.IconButtonSize24ModeDangerTint -> IconButton.Size24.ModeDangerTint
        IconButtonStyles.IconButtonSize24BgNoModeAccentFilled ->
            IconButton.Size24.BgNo.ModeAccentFilled
        IconButtonStyles.IconButtonSize24BgNoModeAccentGrey -> IconButton.Size24.BgNo.ModeAccentGrey
        IconButtonStyles.IconButtonSize24BgNoModeDangerTint -> IconButton.Size24.BgNo.ModeDangerTint
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconButtonStyles] для icon-button
 */
public fun IconButtonStyles.Companion.resolve(
    size: IconButtonSize = IconButtonSize.Size48,
    bg: IconButtonBg = IconButtonBg.Yes,
    mode: IconButtonMode = IconButtonMode.AccentFilled,
): IconButtonStyles = when {
    size == IconButtonSize.Size48 && bg == IconButtonBg.Yes && mode ==
        IconButtonMode.AccentFilled -> IconButtonStyles.IconButtonSize48ModeAccentFilled
    size == IconButtonSize.Size48 && bg == IconButtonBg.Yes && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize48ModeAccentGrey
    size == IconButtonSize.Size48 && bg == IconButtonBg.Yes && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize48ModeDangerTint
    size == IconButtonSize.Size48 && bg == IconButtonBg.No && mode == IconButtonMode.AccentFilled ->
        IconButtonStyles.IconButtonSize48BgNoModeAccentFilled
    size == IconButtonSize.Size48 && bg == IconButtonBg.No && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize48BgNoModeAccentGrey
    size == IconButtonSize.Size48 && bg == IconButtonBg.No && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize48BgNoModeDangerTint
    size == IconButtonSize.Size40 && bg == IconButtonBg.Yes && mode ==
        IconButtonMode.AccentFilled -> IconButtonStyles.IconButtonSize40ModeAccentFilled
    size == IconButtonSize.Size40 && bg == IconButtonBg.Yes && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize40ModeAccentGrey
    size == IconButtonSize.Size40 && bg == IconButtonBg.Yes && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize40ModeDangerTint
    size == IconButtonSize.Size40 && bg == IconButtonBg.No && mode == IconButtonMode.AccentFilled ->
        IconButtonStyles.IconButtonSize40BgNoModeAccentFilled
    size == IconButtonSize.Size40 && bg == IconButtonBg.No && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize40BgNoModeAccentGrey
    size == IconButtonSize.Size40 && bg == IconButtonBg.No && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize40BgNoModeDangerTint
    size == IconButtonSize.Size32 && bg == IconButtonBg.Yes && mode ==
        IconButtonMode.AccentFilled -> IconButtonStyles.IconButtonSize32ModeAccentFilled
    size == IconButtonSize.Size32 && bg == IconButtonBg.Yes && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize32ModeAccentGrey
    size == IconButtonSize.Size32 && bg == IconButtonBg.Yes && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize32ModeDangerTint
    size == IconButtonSize.Size32 && bg == IconButtonBg.No && mode == IconButtonMode.AccentFilled ->
        IconButtonStyles.IconButtonSize32BgNoModeAccentFilled
    size == IconButtonSize.Size32 && bg == IconButtonBg.No && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize32BgNoModeAccentGrey
    size == IconButtonSize.Size32 && bg == IconButtonBg.No && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize32BgNoModeDangerTint
    size == IconButtonSize.Size24 && bg == IconButtonBg.Yes && mode ==
        IconButtonMode.AccentFilled -> IconButtonStyles.IconButtonSize24ModeAccentFilled
    size == IconButtonSize.Size24 && bg == IconButtonBg.Yes && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize24ModeAccentGrey
    size == IconButtonSize.Size24 && bg == IconButtonBg.Yes && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize24ModeDangerTint
    size == IconButtonSize.Size24 && bg == IconButtonBg.No && mode == IconButtonMode.AccentFilled ->
        IconButtonStyles.IconButtonSize24BgNoModeAccentFilled
    size == IconButtonSize.Size24 && bg == IconButtonBg.No && mode == IconButtonMode.AccentGrey ->
        IconButtonStyles.IconButtonSize24BgNoModeAccentGrey
    size == IconButtonSize.Size24 && bg == IconButtonBg.No && mode == IconButtonMode.DangerTint ->
        IconButtonStyles.IconButtonSize24BgNoModeDangerTint
    else -> error("Unsupported icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для icon-button
 */
@Composable
public fun IconButtonStyles.Companion.style(
    size: IconButtonSize = IconButtonSize.Size48,
    bg: IconButtonBg = IconButtonBg.Yes,
    mode: IconButtonMode = IconButtonMode.AccentFilled,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, bg, mode).style(modify)
