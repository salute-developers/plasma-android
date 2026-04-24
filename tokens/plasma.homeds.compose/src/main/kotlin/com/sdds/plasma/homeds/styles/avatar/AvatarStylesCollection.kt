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
 * Возможные значения свойства shape для avatar
 */
public enum class AvatarShape {
    Default,
    Pilled,
}

/**
 * Возвращает [AvatarStyle] для [AvatarStyles]
 */
@Composable
public fun AvatarStyles.style(modify: @Composable AvatarStyleBuilder.() -> Unit = {}): AvatarStyle {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AvatarStyles] для avatar
 */
public fun AvatarStyles.Companion.resolve(
    size: AvatarSize = AvatarSize.M,
    shape: AvatarShape =
        AvatarShape.Default,
): AvatarStyles = when {
    size == AvatarSize.Xxl && shape == AvatarShape.Pilled -> AvatarStyles.AvatarXxlPilled
    size == AvatarSize.L && shape == AvatarShape.Pilled -> AvatarStyles.AvatarLPilled
    size == AvatarSize.M && shape == AvatarShape.Pilled -> AvatarStyles.AvatarMPilled
    size == AvatarSize.S && shape == AvatarShape.Pilled -> AvatarStyles.AvatarSPilled
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
    size: AvatarSize = AvatarSize.M,
    shape: AvatarShape = AvatarShape.Default,
    modify: @Composable AvatarStyleBuilder.() -> Unit = {},
): AvatarStyle = resolve(size, shape).style(modify)
