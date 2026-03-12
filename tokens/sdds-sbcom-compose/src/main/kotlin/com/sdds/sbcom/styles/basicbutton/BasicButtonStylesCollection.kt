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
    BasicButtonMPrimary("BasicButton.M.Primary"),
    BasicButtonMAccentFilled("BasicButton.M.AccentFilled"),
    BasicButtonMAccentWhite("BasicButton.M.AccentWhite"),
    BasicButtonMAccentGrey("BasicButton.M.AccentGrey"),
    BasicButtonMDangerTint("BasicButton.M.DangerTint"),
    BasicButtonSPrimary("BasicButton.S.Primary"),
    BasicButtonSAccentFilled("BasicButton.S.AccentFilled"),
    BasicButtonSAccentWhite("BasicButton.S.AccentWhite"),
    BasicButtonSAccentGrey("BasicButton.S.AccentGrey"),
    BasicButtonSDangerTint("BasicButton.S.DangerTint"),
    BasicButtonXsPrimary("BasicButton.Xs.Primary"),
    BasicButtonXsAccentFilled("BasicButton.Xs.AccentFilled"),
    BasicButtonXsAccentWhite("BasicButton.Xs.AccentWhite"),
    BasicButtonXsAccentGrey("BasicButton.Xs.AccentGrey"),
    BasicButtonXsDangerTint("BasicButton.Xs.DangerTint"),
    BasicButtonXxsPrimary("BasicButton.Xxs.Primary"),
    BasicButtonXxsAccentFilled("BasicButton.Xxs.AccentFilled"),
    BasicButtonXxsAccentWhite("BasicButton.Xxs.AccentWhite"),
    BasicButtonXxsAccentGrey("BasicButton.Xxs.AccentGrey"),
    BasicButtonXxsDangerTint("BasicButton.Xxs.DangerTint"),
}

/**
 * Возвращает [ButtonStyle] для [BasicButtonStyles]
 */
@Composable
public fun BasicButtonStyles.style(
    modifyAction: @Composable BasicButtonStyleBuilder.() -> Unit =
        {},
): ButtonStyle {
    val builder = when (this) {
        BasicButtonStyles.BasicButtonMPrimary -> BasicButton.M.Primary
        BasicButtonStyles.BasicButtonMAccentFilled -> BasicButton.M.AccentFilled
        BasicButtonStyles.BasicButtonMAccentWhite -> BasicButton.M.AccentWhite
        BasicButtonStyles.BasicButtonMAccentGrey -> BasicButton.M.AccentGrey
        BasicButtonStyles.BasicButtonMDangerTint -> BasicButton.M.DangerTint
        BasicButtonStyles.BasicButtonSPrimary -> BasicButton.S.Primary
        BasicButtonStyles.BasicButtonSAccentFilled -> BasicButton.S.AccentFilled
        BasicButtonStyles.BasicButtonSAccentWhite -> BasicButton.S.AccentWhite
        BasicButtonStyles.BasicButtonSAccentGrey -> BasicButton.S.AccentGrey
        BasicButtonStyles.BasicButtonSDangerTint -> BasicButton.S.DangerTint
        BasicButtonStyles.BasicButtonXsPrimary -> BasicButton.Xs.Primary
        BasicButtonStyles.BasicButtonXsAccentFilled -> BasicButton.Xs.AccentFilled
        BasicButtonStyles.BasicButtonXsAccentWhite -> BasicButton.Xs.AccentWhite
        BasicButtonStyles.BasicButtonXsAccentGrey -> BasicButton.Xs.AccentGrey
        BasicButtonStyles.BasicButtonXsDangerTint -> BasicButton.Xs.DangerTint
        BasicButtonStyles.BasicButtonXxsPrimary -> BasicButton.Xxs.Primary
        BasicButtonStyles.BasicButtonXxsAccentFilled -> BasicButton.Xxs.AccentFilled
        BasicButtonStyles.BasicButtonXxsAccentWhite -> BasicButton.Xxs.AccentWhite
        BasicButtonStyles.BasicButtonXxsAccentGrey -> BasicButton.Xxs.AccentGrey
        BasicButtonStyles.BasicButtonXxsDangerTint -> BasicButton.Xxs.DangerTint
    }
    return builder.modify(modifyAction).style()
}
