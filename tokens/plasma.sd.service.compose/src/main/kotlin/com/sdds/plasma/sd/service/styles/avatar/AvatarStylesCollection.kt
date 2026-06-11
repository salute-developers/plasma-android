// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.avatar

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
    AvatarL("Avatar.L"),
    AvatarM("Avatar.M"),
    AvatarS("Avatar.S"),
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
    Xxl,
    L,
    M,
    S,
}

/**
 * Возвращает [AvatarStyle] для [AvatarStyles]
 */
@Composable
public fun AvatarStyles.style(modify: @Composable AvatarStyleBuilder.() -> Unit = {}): AvatarStyle {
    val builder = when (this) {
        AvatarStyles.AvatarXxl -> Avatar.Xxl
        AvatarStyles.AvatarL -> Avatar.L
        AvatarStyles.AvatarM -> Avatar.M
        AvatarStyles.AvatarS -> Avatar.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AvatarStyles] для avatar
 */
public fun AvatarStyles.Companion.resolve(size: AvatarSize = AvatarSize.Xxl): AvatarStyles = when {
    size == AvatarSize.Xxl -> AvatarStyles.AvatarXxl
    size == AvatarSize.L -> AvatarStyles.AvatarL
    size == AvatarSize.M -> AvatarStyles.AvatarM
    size == AvatarSize.S -> AvatarStyles.AvatarS
    else -> error("Unsupported avatar style combination")
}

/**
 * Возвращает [AvatarStyle] для avatar
 */
@Composable
public fun AvatarStyles.Companion.style(
    size: AvatarSize = AvatarSize.Xxl,
    modify: @Composable
    AvatarStyleBuilder.() -> Unit = {},
): AvatarStyle = resolve(size).style(modify)
