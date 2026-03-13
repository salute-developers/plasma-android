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
    IconButtonMAccentFilled("IconButton.M.AccentFilled"),
    IconButtonMAccentGrey("IconButton.M.AccentGrey"),
    IconButtonMDangerTint("IconButton.M.DangerTint"),
    IconButtonSAccentFilled("IconButton.S.AccentFilled"),
    IconButtonSAccentGrey("IconButton.S.AccentGrey"),
    IconButtonSDangerTint("IconButton.S.DangerTint"),
    IconButtonXsAccentFilled("IconButton.Xs.AccentFilled"),
    IconButtonXsAccentGrey("IconButton.Xs.AccentGrey"),
    IconButtonXsDangerTint("IconButton.Xs.DangerTint"),
    IconButtonClearMAccent("IconButtonClear.M.Accent"),
    IconButtonClearMDangerTint("IconButtonClear.M.DangerTint"),
    IconButtonClearSAccent("IconButtonClear.S.Accent"),
    IconButtonClearSDangerTint("IconButtonClear.S.DangerTint"),
    IconButtonClearXsAccent("IconButtonClear.Xs.Accent"),
    IconButtonClearXsDangerTint("IconButtonClear.Xs.DangerTint"),
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modifyAction: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonMAccentFilled -> IconButton.M.AccentFilled
        IconButtonStyles.IconButtonMAccentGrey -> IconButton.M.AccentGrey
        IconButtonStyles.IconButtonMDangerTint -> IconButton.M.DangerTint
        IconButtonStyles.IconButtonSAccentFilled -> IconButton.S.AccentFilled
        IconButtonStyles.IconButtonSAccentGrey -> IconButton.S.AccentGrey
        IconButtonStyles.IconButtonSDangerTint -> IconButton.S.DangerTint
        IconButtonStyles.IconButtonXsAccentFilled -> IconButton.Xs.AccentFilled
        IconButtonStyles.IconButtonXsAccentGrey -> IconButton.Xs.AccentGrey
        IconButtonStyles.IconButtonXsDangerTint -> IconButton.Xs.DangerTint
        IconButtonStyles.IconButtonClearMAccent -> IconButtonClear.M.Accent
        IconButtonStyles.IconButtonClearMDangerTint -> IconButtonClear.M.DangerTint
        IconButtonStyles.IconButtonClearSAccent -> IconButtonClear.S.Accent
        IconButtonStyles.IconButtonClearSDangerTint -> IconButtonClear.S.DangerTint
        IconButtonStyles.IconButtonClearXsAccent -> IconButtonClear.Xs.Accent
        IconButtonStyles.IconButtonClearXsDangerTint -> IconButtonClear.Xs.DangerTint
    }
    return builder.modify(modifyAction).style()
}
