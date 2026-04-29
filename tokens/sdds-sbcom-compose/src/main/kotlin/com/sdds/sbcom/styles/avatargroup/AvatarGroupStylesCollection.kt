// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.avatargroup

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
    AvatarGroupSize24("AvatarGroup.Size24"),
    ;

    /**
     * Typed API для подбора стиля avatar-group
     */
    public companion object
}

/**
 * Возможные значения свойства size для avatar-group
 */
public enum class AvatarGroupSize {
    Size24,
}

/**
 * Возвращает [AvatarGroupStyle] для [AvatarGroupStyles]
 */
@Composable
public fun AvatarGroupStyles.style(modify: @Composable AvatarGroupStyleBuilder.() -> Unit = {}): AvatarGroupStyle {
    val builder = when (this) {
        AvatarGroupStyles.AvatarGroupSize24 -> AvatarGroup.Size24
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AvatarGroupStyles] для avatar-group
 */
public fun AvatarGroupStyles.Companion.resolve(size: AvatarGroupSize = AvatarGroupSize.Size24):
    AvatarGroupStyles = when {
    size == AvatarGroupSize.Size24 -> AvatarGroupStyles.AvatarGroupSize24
    else -> error("Unsupported avatar-group style combination")
}

/**
 * Возвращает [AvatarGroupStyle] для avatar-group
 */
@Composable
public fun AvatarGroupStyles.Companion.style(
    size: AvatarGroupSize = AvatarGroupSize.Size24,
    modify: @Composable AvatarGroupStyleBuilder.() -> Unit = {},
): AvatarGroupStyle =
    resolve(size).style(modify)
