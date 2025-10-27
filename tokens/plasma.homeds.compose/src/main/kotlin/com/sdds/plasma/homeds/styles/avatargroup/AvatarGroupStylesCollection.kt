// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.avatargroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AvatarGroup
 */
public enum class AvatarGroupStyles(
    public val key: String,
) {
    AvatarGroupS("AvatarGroup.S"),
}

/**
 * Возвращает [AvatarGroupStyle] для [AvatarGroupStyles]
 */
@Composable
public fun AvatarGroupStyles.style(
    modifyAction: @Composable AvatarGroupStyleBuilder.() -> Unit =
        {},
): AvatarGroupStyle {
    val builder = when (this) {
        AvatarGroupStyles.AvatarGroupS -> AvatarGroup.S
    }
    return builder.modify(modifyAction).style()
}
