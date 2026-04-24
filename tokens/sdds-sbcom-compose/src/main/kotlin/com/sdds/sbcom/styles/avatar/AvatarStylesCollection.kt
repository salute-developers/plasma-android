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
    ;

    /**
     * Typed API для подбора стиля avatar
     */
    public companion object
}

/**
 * Возможные значения свойства size для avatar
 */
public enum class AvatarSize {
    Size72,
    Size64,
    Size56,
    Size44,
    Size40,
    Size36,
    Size32,
    Size26,
    Size24,
}

/**
 * Возвращает [AvatarStyle] для [AvatarStyles]
 */
@Composable
public fun AvatarStyles.style(modify: @Composable AvatarStyleBuilder.() -> Unit = {}): AvatarStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AvatarStyles] для avatar
 */
public fun AvatarStyles.Companion.resolve(size: AvatarSize = AvatarSize.Size72): AvatarStyles = when {
    size == AvatarSize.Size72 -> AvatarStyles.AvatarSize72
    size == AvatarSize.Size64 -> AvatarStyles.AvatarSize64
    size == AvatarSize.Size56 -> AvatarStyles.AvatarSize56
    size == AvatarSize.Size44 -> AvatarStyles.AvatarSize44
    size == AvatarSize.Size40 -> AvatarStyles.AvatarSize40
    size == AvatarSize.Size36 -> AvatarStyles.AvatarSize36
    size == AvatarSize.Size32 -> AvatarStyles.AvatarSize32
    size == AvatarSize.Size26 -> AvatarStyles.AvatarSize26
    size == AvatarSize.Size24 -> AvatarStyles.AvatarSize24
    else -> error("Unsupported avatar style combination")
}

/**
 * Возвращает [AvatarStyle] для avatar
 */
@Composable
public fun AvatarStyles.Companion.style(
    size: AvatarSize = AvatarSize.Size72,
    modify: @Composable
    AvatarStyleBuilder.() -> Unit = {},
): AvatarStyle = resolve(size).style(modify)
