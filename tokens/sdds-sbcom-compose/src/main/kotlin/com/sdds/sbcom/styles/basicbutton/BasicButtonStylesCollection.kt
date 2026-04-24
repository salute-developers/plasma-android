// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.basicbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента BasicButton
 */
public enum class BasicButtonStyles(
    public val key: String,
) {
    BasicButtonSize48ModePrimary("BasicButton.Size48.ModePrimary"),
    BasicButtonSize48ModeAccentFilled("BasicButton.Size48.ModeAccentFilled"),
    BasicButtonSize48ModeAccentWhite("BasicButton.Size48.ModeAccentWhite"),
    BasicButtonSize48ModeAccentGrey("BasicButton.Size48.ModeAccentGrey"),
    BasicButtonSize48ModeDangerTint("BasicButton.Size48.ModeDangerTint"),
    BasicButtonSize48BgNoModePrimary("BasicButton.Size48.BgNo.ModePrimary"),
    BasicButtonSize48BgNoModeAccentFilled("BasicButton.Size48.BgNo.ModeAccentFilled"),
    BasicButtonSize48BgNoModeAccentWhite("BasicButton.Size48.BgNo.ModeAccentWhite"),
    BasicButtonSize48BgNoModeAccentGrey("BasicButton.Size48.BgNo.ModeAccentGrey"),
    BasicButtonSize48BgNoModeDangerTint("BasicButton.Size48.BgNo.ModeDangerTint"),
    BasicButtonSize40ModePrimary("BasicButton.Size40.ModePrimary"),
    BasicButtonSize40ModeAccentFilled("BasicButton.Size40.ModeAccentFilled"),
    BasicButtonSize40ModeAccentWhite("BasicButton.Size40.ModeAccentWhite"),
    BasicButtonSize40ModeAccentGrey("BasicButton.Size40.ModeAccentGrey"),
    BasicButtonSize40ModeDangerTint("BasicButton.Size40.ModeDangerTint"),
    BasicButtonSize40BgNoModePrimary("BasicButton.Size40.BgNo.ModePrimary"),
    BasicButtonSize40BgNoModeAccentFilled("BasicButton.Size40.BgNo.ModeAccentFilled"),
    BasicButtonSize40BgNoModeAccentWhite("BasicButton.Size40.BgNo.ModeAccentWhite"),
    BasicButtonSize40BgNoModeAccentGrey("BasicButton.Size40.BgNo.ModeAccentGrey"),
    BasicButtonSize40BgNoModeDangerTint("BasicButton.Size40.BgNo.ModeDangerTint"),
    BasicButtonSize32ModePrimary("BasicButton.Size32.ModePrimary"),
    BasicButtonSize32ModeAccentFilled("BasicButton.Size32.ModeAccentFilled"),
    BasicButtonSize32ModeAccentWhite("BasicButton.Size32.ModeAccentWhite"),
    BasicButtonSize32ModeAccentGrey("BasicButton.Size32.ModeAccentGrey"),
    BasicButtonSize32ModeDangerTint("BasicButton.Size32.ModeDangerTint"),
    BasicButtonSize32BgNoModePrimary("BasicButton.Size32.BgNo.ModePrimary"),
    BasicButtonSize32BgNoModeAccentFilled("BasicButton.Size32.BgNo.ModeAccentFilled"),
    BasicButtonSize32BgNoModeAccentWhite("BasicButton.Size32.BgNo.ModeAccentWhite"),
    BasicButtonSize32BgNoModeAccentGrey("BasicButton.Size32.BgNo.ModeAccentGrey"),
    BasicButtonSize32BgNoModeDangerTint("BasicButton.Size32.BgNo.ModeDangerTint"),
    BasicButtonSize24ModePrimary("BasicButton.Size24.ModePrimary"),
    BasicButtonSize24ModeAccentFilled("BasicButton.Size24.ModeAccentFilled"),
    BasicButtonSize24ModeAccentWhite("BasicButton.Size24.ModeAccentWhite"),
    BasicButtonSize24ModeAccentGrey("BasicButton.Size24.ModeAccentGrey"),
    BasicButtonSize24ModeDangerTint("BasicButton.Size24.ModeDangerTint"),
    BasicButtonSize24BgNoModePrimary("BasicButton.Size24.BgNo.ModePrimary"),
    BasicButtonSize24BgNoModeAccentFilled("BasicButton.Size24.BgNo.ModeAccentFilled"),
    BasicButtonSize24BgNoModeAccentWhite("BasicButton.Size24.BgNo.ModeAccentWhite"),
    BasicButtonSize24BgNoModeAccentGrey("BasicButton.Size24.BgNo.ModeAccentGrey"),
    BasicButtonSize24BgNoModeDangerTint("BasicButton.Size24.BgNo.ModeDangerTint"),
    ;

    /**
     * Typed API для подбора стиля basic-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для basic-button
 */
public enum class BasicButtonSize {
    Size48,
    Size40,
    Size32,
    Size24,
}

/**
 * Возможные значения свойства bg для basic-button
 */
public enum class BasicButtonBg {
    Yes,
    No,
}

/**
 * Возможные значения свойства mode для basic-button
 */
public enum class BasicButtonMode {
    Primary,
    AccentFilled,
    AccentWhite,
    AccentGrey,
    DangerTint,
}

/**
 * Возвращает [ButtonStyle] для [BasicButtonStyles]
 */
@Composable
public fun BasicButtonStyles.style(modify: @Composable BasicButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        BasicButtonStyles.BasicButtonSize48ModePrimary -> BasicButton.Size48.ModePrimary
        BasicButtonStyles.BasicButtonSize48ModeAccentFilled -> BasicButton.Size48.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize48ModeAccentWhite -> BasicButton.Size48.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize48ModeAccentGrey -> BasicButton.Size48.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize48ModeDangerTint -> BasicButton.Size48.ModeDangerTint
        BasicButtonStyles.BasicButtonSize48BgNoModePrimary -> BasicButton.Size48.BgNo.ModePrimary
        BasicButtonStyles.BasicButtonSize48BgNoModeAccentFilled ->
            BasicButton.Size48.BgNo.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize48BgNoModeAccentWhite ->
            BasicButton.Size48.BgNo.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize48BgNoModeAccentGrey ->
            BasicButton.Size48.BgNo.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize48BgNoModeDangerTint ->
            BasicButton.Size48.BgNo.ModeDangerTint
        BasicButtonStyles.BasicButtonSize40ModePrimary -> BasicButton.Size40.ModePrimary
        BasicButtonStyles.BasicButtonSize40ModeAccentFilled -> BasicButton.Size40.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize40ModeAccentWhite -> BasicButton.Size40.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize40ModeAccentGrey -> BasicButton.Size40.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize40ModeDangerTint -> BasicButton.Size40.ModeDangerTint
        BasicButtonStyles.BasicButtonSize40BgNoModePrimary -> BasicButton.Size40.BgNo.ModePrimary
        BasicButtonStyles.BasicButtonSize40BgNoModeAccentFilled ->
            BasicButton.Size40.BgNo.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize40BgNoModeAccentWhite ->
            BasicButton.Size40.BgNo.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize40BgNoModeAccentGrey ->
            BasicButton.Size40.BgNo.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize40BgNoModeDangerTint ->
            BasicButton.Size40.BgNo.ModeDangerTint
        BasicButtonStyles.BasicButtonSize32ModePrimary -> BasicButton.Size32.ModePrimary
        BasicButtonStyles.BasicButtonSize32ModeAccentFilled -> BasicButton.Size32.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize32ModeAccentWhite -> BasicButton.Size32.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize32ModeAccentGrey -> BasicButton.Size32.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize32ModeDangerTint -> BasicButton.Size32.ModeDangerTint
        BasicButtonStyles.BasicButtonSize32BgNoModePrimary -> BasicButton.Size32.BgNo.ModePrimary
        BasicButtonStyles.BasicButtonSize32BgNoModeAccentFilled ->
            BasicButton.Size32.BgNo.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize32BgNoModeAccentWhite ->
            BasicButton.Size32.BgNo.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize32BgNoModeAccentGrey ->
            BasicButton.Size32.BgNo.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize32BgNoModeDangerTint ->
            BasicButton.Size32.BgNo.ModeDangerTint
        BasicButtonStyles.BasicButtonSize24ModePrimary -> BasicButton.Size24.ModePrimary
        BasicButtonStyles.BasicButtonSize24ModeAccentFilled -> BasicButton.Size24.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize24ModeAccentWhite -> BasicButton.Size24.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize24ModeAccentGrey -> BasicButton.Size24.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize24ModeDangerTint -> BasicButton.Size24.ModeDangerTint
        BasicButtonStyles.BasicButtonSize24BgNoModePrimary -> BasicButton.Size24.BgNo.ModePrimary
        BasicButtonStyles.BasicButtonSize24BgNoModeAccentFilled ->
            BasicButton.Size24.BgNo.ModeAccentFilled
        BasicButtonStyles.BasicButtonSize24BgNoModeAccentWhite ->
            BasicButton.Size24.BgNo.ModeAccentWhite
        BasicButtonStyles.BasicButtonSize24BgNoModeAccentGrey ->
            BasicButton.Size24.BgNo.ModeAccentGrey
        BasicButtonStyles.BasicButtonSize24BgNoModeDangerTint ->
            BasicButton.Size24.BgNo.ModeDangerTint
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BasicButtonStyles] для basic-button
 */
public fun BasicButtonStyles.Companion.resolve(
    size: BasicButtonSize = BasicButtonSize.Size48,
    bg: BasicButtonBg = BasicButtonBg.Yes,
    mode: BasicButtonMode = BasicButtonMode.Primary,
): BasicButtonStyles = when {
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.Yes && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize48ModePrimary
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize48ModeAccentFilled
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize48ModeAccentWhite
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize48ModeAccentGrey
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize48ModeDangerTint
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.No && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize48BgNoModePrimary
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize48BgNoModeAccentFilled
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize48BgNoModeAccentWhite
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize48BgNoModeAccentGrey
    size == BasicButtonSize.Size48 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize48BgNoModeDangerTint
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.Yes && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize40ModePrimary
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize40ModeAccentFilled
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize40ModeAccentWhite
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize40ModeAccentGrey
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize40ModeDangerTint
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.No && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize40BgNoModePrimary
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize40BgNoModeAccentFilled
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize40BgNoModeAccentWhite
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize40BgNoModeAccentGrey
    size == BasicButtonSize.Size40 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize40BgNoModeDangerTint
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.Yes && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize32ModePrimary
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize32ModeAccentFilled
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize32ModeAccentWhite
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize32ModeAccentGrey
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize32ModeDangerTint
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.No && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize32BgNoModePrimary
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize32BgNoModeAccentFilled
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize32BgNoModeAccentWhite
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize32BgNoModeAccentGrey
    size == BasicButtonSize.Size32 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize32BgNoModeDangerTint
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.Yes && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize24ModePrimary
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize24ModeAccentFilled
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize24ModeAccentWhite
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize24ModeAccentGrey
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.Yes && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize24ModeDangerTint
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.No && mode == BasicButtonMode.Primary ->
        BasicButtonStyles.BasicButtonSize24BgNoModePrimary
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentFilled -> BasicButtonStyles.BasicButtonSize24BgNoModeAccentFilled
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentWhite -> BasicButtonStyles.BasicButtonSize24BgNoModeAccentWhite
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.AccentGrey -> BasicButtonStyles.BasicButtonSize24BgNoModeAccentGrey
    size == BasicButtonSize.Size24 && bg == BasicButtonBg.No && mode ==
        BasicButtonMode.DangerTint -> BasicButtonStyles.BasicButtonSize24BgNoModeDangerTint
    else -> error("Unsupported basic-button style combination")
}

/**
 * Возвращает [ButtonStyle] для basic-button
 */
@Composable
public fun BasicButtonStyles.Companion.style(
    size: BasicButtonSize = BasicButtonSize.Size48,
    bg: BasicButtonBg = BasicButtonBg.Yes,
    mode: BasicButtonMode = BasicButtonMode.Primary,
    modify: @Composable BasicButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, bg, mode).style(modify)
