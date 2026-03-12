// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.linkbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента LinkButton
 */
public enum class LinkButtonStyles(
    public val key: String,
) {
    LinkButtonMAccent("LinkButton.M.Accent"),
    LinkButtonMDangerTint("LinkButton.M.DangerTint"),
    LinkButtonSAccent("LinkButton.S.Accent"),
    LinkButtonSDangerTint("LinkButton.S.DangerTint"),
    LinkButtonXsAccent("LinkButton.Xs.Accent"),
    LinkButtonXsDangerTint("LinkButton.Xs.DangerTint"),
    LinkButtonXxsAccent("LinkButton.Xxs.Accent"),
    LinkButtonXxsDangerTint("LinkButton.Xxs.DangerTint"),
}

/**
 * Возвращает [ButtonStyle] для [LinkButtonStyles]
 */
@Composable
public fun LinkButtonStyles.style(modifyAction: @Composable LinkButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        LinkButtonStyles.LinkButtonMAccent -> LinkButton.M.Accent
        LinkButtonStyles.LinkButtonMDangerTint -> LinkButton.M.DangerTint
        LinkButtonStyles.LinkButtonSAccent -> LinkButton.S.Accent
        LinkButtonStyles.LinkButtonSDangerTint -> LinkButton.S.DangerTint
        LinkButtonStyles.LinkButtonXsAccent -> LinkButton.Xs.Accent
        LinkButtonStyles.LinkButtonXsDangerTint -> LinkButton.Xs.DangerTint
        LinkButtonStyles.LinkButtonXxsAccent -> LinkButton.Xxs.Accent
        LinkButtonStyles.LinkButtonXxsDangerTint -> LinkButton.Xxs.DangerTint
    }
    return builder.modify(modifyAction).style()
}
