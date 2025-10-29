// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.avatar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Avatar
 */
public enum class AvatarStyles(
    public val key: String,
) {
    AvatarXxl("Avatar.Xxl"),
    AvatarXxlPilled("Avatar.Xxl.Pilled"),
    AvatarL("Avatar.L"),
    AvatarLPilled("Avatar.L.Pilled"),
    AvatarM("Avatar.M"),
    AvatarMPilled("Avatar.M.Pilled"),
    AvatarS("Avatar.S"),
    AvatarSPilled("Avatar.S.Pilled"),
}

/**
 * Возвращает [AvatarStyle] для [AvatarStyles]
 */
@Composable
public fun AvatarStyles.style(modifyAction: @Composable AvatarStyleBuilder.() -> Unit = {}): AvatarStyle {
    val builder = when (this) {
        AvatarStyles.AvatarXxl -> Avatar.Xxl
        AvatarStyles.AvatarXxlPilled -> Avatar.Xxl.Pilled
        AvatarStyles.AvatarL -> Avatar.L
        AvatarStyles.AvatarLPilled -> Avatar.L.Pilled
        AvatarStyles.AvatarM -> Avatar.M
        AvatarStyles.AvatarMPilled -> Avatar.M.Pilled
        AvatarStyles.AvatarS -> Avatar.S
        AvatarStyles.AvatarSPilled -> Avatar.S.Pilled
    }
    return builder.modify(modifyAction).style()
}
