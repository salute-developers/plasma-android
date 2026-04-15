// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.avatar

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
    AvatarSize72("Avatar.Size72"),
    AvatarSize64("Avatar.Size64"),
    AvatarSize56("Avatar.Size56"),
    AvatarSize44("Avatar.Size44"),
    AvatarSize40("Avatar.Size40"),
    AvatarSize36("Avatar.Size36"),
    AvatarSize32("Avatar.Size32"),
    AvatarSize26("Avatar.Size26"),
    AvatarSize24("Avatar.Size24"),
}

/**
 * Возвращает [AvatarStyle] для [AvatarStyles]
 */
@Composable
public fun AvatarStyles.style(modifyAction: @Composable AvatarStyleBuilder.() -> Unit = {}): AvatarStyle {
    val builder = when (this) {
        AvatarStyles.AvatarSize72 -> Avatar.Size72
        AvatarStyles.AvatarSize64 -> Avatar.Size64
        AvatarStyles.AvatarSize56 -> Avatar.Size56
        AvatarStyles.AvatarSize44 -> Avatar.Size44
        AvatarStyles.AvatarSize40 -> Avatar.Size40
        AvatarStyles.AvatarSize36 -> Avatar.Size36
        AvatarStyles.AvatarSize32 -> Avatar.Size32
        AvatarStyles.AvatarSize26 -> Avatar.Size26
        AvatarStyles.AvatarSize24 -> Avatar.Size24
    }
    return builder.modify(modifyAction).style()
}
