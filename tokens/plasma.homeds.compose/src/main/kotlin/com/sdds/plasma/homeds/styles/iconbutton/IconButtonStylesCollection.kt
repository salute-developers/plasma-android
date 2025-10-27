// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.iconbutton

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
    IconButtonLSecondary("IconButton.L.Secondary"),
    IconButtonLDark("IconButton.L.Dark"),
    IconButtonLNegative("IconButton.L.Negative"),
    IconButtonLWarning("IconButton.L.Warning"),
    IconButtonLAccent("IconButton.L.Accent"),
    IconButtonLClear("IconButton.L.Clear"),
    IconButtonMDefault("IconButton.M.Default"),
    IconButtonMSecondary("IconButton.M.Secondary"),
    IconButtonMDark("IconButton.M.Dark"),
    IconButtonMNegative("IconButton.M.Negative"),
    IconButtonMWarning("IconButton.M.Warning"),
    IconButtonMAccent("IconButton.M.Accent"),
    IconButtonMClear("IconButton.M.Clear"),
    IconButtonSDefault("IconButton.S.Default"),
    IconButtonSSecondary("IconButton.S.Secondary"),
    IconButtonSDark("IconButton.S.Dark"),
    IconButtonSNegative("IconButton.S.Negative"),
    IconButtonSWarning("IconButton.S.Warning"),
    IconButtonSAccent("IconButton.S.Accent"),
    IconButtonSClear("IconButton.S.Clear"),
    IconButtonXsDefault("IconButton.Xs.Default"),
    IconButtonXsSecondary("IconButton.Xs.Secondary"),
    IconButtonXsDark("IconButton.Xs.Dark"),
    IconButtonXsNegative("IconButton.Xs.Negative"),
    IconButtonXsWarning("IconButton.Xs.Warning"),
    IconButtonXsAccent("IconButton.Xs.Accent"),
    IconButtonXsClear("IconButton.Xs.Clear"),
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modifyAction: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonLDefault -> IconButton.L.Default
        IconButtonStyles.IconButtonLSecondary -> IconButton.L.Secondary
        IconButtonStyles.IconButtonLDark -> IconButton.L.Dark
        IconButtonStyles.IconButtonLNegative -> IconButton.L.Negative
        IconButtonStyles.IconButtonLWarning -> IconButton.L.Warning
        IconButtonStyles.IconButtonLAccent -> IconButton.L.Accent
        IconButtonStyles.IconButtonLClear -> IconButton.L.Clear
        IconButtonStyles.IconButtonMDefault -> IconButton.M.Default
        IconButtonStyles.IconButtonMSecondary -> IconButton.M.Secondary
        IconButtonStyles.IconButtonMDark -> IconButton.M.Dark
        IconButtonStyles.IconButtonMNegative -> IconButton.M.Negative
        IconButtonStyles.IconButtonMWarning -> IconButton.M.Warning
        IconButtonStyles.IconButtonMAccent -> IconButton.M.Accent
        IconButtonStyles.IconButtonMClear -> IconButton.M.Clear
        IconButtonStyles.IconButtonSDefault -> IconButton.S.Default
        IconButtonStyles.IconButtonSSecondary -> IconButton.S.Secondary
        IconButtonStyles.IconButtonSDark -> IconButton.S.Dark
        IconButtonStyles.IconButtonSNegative -> IconButton.S.Negative
        IconButtonStyles.IconButtonSWarning -> IconButton.S.Warning
        IconButtonStyles.IconButtonSAccent -> IconButton.S.Accent
        IconButtonStyles.IconButtonSClear -> IconButton.S.Clear
        IconButtonStyles.IconButtonXsDefault -> IconButton.Xs.Default
        IconButtonStyles.IconButtonXsSecondary -> IconButton.Xs.Secondary
        IconButtonStyles.IconButtonXsDark -> IconButton.Xs.Dark
        IconButtonStyles.IconButtonXsNegative -> IconButton.Xs.Negative
        IconButtonStyles.IconButtonXsWarning -> IconButton.Xs.Warning
        IconButtonStyles.IconButtonXsAccent -> IconButton.Xs.Accent
        IconButtonStyles.IconButtonXsClear -> IconButton.Xs.Clear
    }
    return builder.modify(modifyAction).style()
}
