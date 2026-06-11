// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.drawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Drawer
 */
public enum class DrawerStyles(
    public val key: String,
) {
    DrawerCloseNoneM("DrawerCloseNone.M"),
    DrawerCloseNoneMHasShadow("DrawerCloseNone.M.HasShadow"),
    DrawerCloseInnerM("DrawerCloseInner.M"),
    DrawerCloseInnerMHasShadow("DrawerCloseInner.M.HasShadow"),
    DrawerCloseOuterM("DrawerCloseOuter.M"),
    DrawerCloseOuterMHasShadow("DrawerCloseOuter.M.HasShadow"),
    ;

    /**
     * Typed API для подбора стиля drawer-close-none
     */
    public object CloseNone

    /**
     * Typed API для подбора стиля drawer-close-inner
     */
    public object CloseInner

    /**
     * Typed API для подбора стиля drawer-close-outer
     */
    public object CloseOuter
}

/**
 * Возможные значения свойства size для drawer-close-none
 */
public enum class DrawerCloseNoneSize {
    M,
}

/**
 * Возможные значения свойства size для drawer-close-inner
 */
public enum class DrawerCloseInnerSize {
    M,
}

/**
 * Возможные значения свойства size для drawer-close-outer
 */
public enum class DrawerCloseOuterSize {
    M,
}

/**
 * Возвращает [DrawerStyle] для [DrawerStyles]
 */
@Composable
public fun DrawerStyles.style(modify: @Composable DrawerStyleBuilder.() -> Unit = {}): DrawerStyle {
    val builder = when (this) {
        DrawerStyles.DrawerCloseNoneM -> DrawerCloseNone.M
        DrawerStyles.DrawerCloseNoneMHasShadow -> DrawerCloseNone.M.HasShadow
        DrawerStyles.DrawerCloseInnerM -> DrawerCloseInner.M
        DrawerStyles.DrawerCloseInnerMHasShadow -> DrawerCloseInner.M.HasShadow
        DrawerStyles.DrawerCloseOuterM -> DrawerCloseOuter.M
        DrawerStyles.DrawerCloseOuterMHasShadow -> DrawerCloseOuter.M.HasShadow
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DrawerStyles] для drawer-close-none
 */
public fun DrawerStyles.CloseNone.resolve(
    size: DrawerCloseNoneSize = DrawerCloseNoneSize.M,
    hasShadow: Boolean = false,
): DrawerStyles = when {
    size == DrawerCloseNoneSize.M && hasShadow == true -> DrawerStyles.DrawerCloseNoneMHasShadow
    size == DrawerCloseNoneSize.M -> DrawerStyles.DrawerCloseNoneM
    else -> error("Unsupported drawer-close-none style combination")
}

/**
 * Возвращает [DrawerStyle] для drawer-close-none
 */
@Composable
public fun DrawerStyles.CloseNone.style(
    size: DrawerCloseNoneSize = DrawerCloseNoneSize.M,
    hasShadow: Boolean = false,
    modify: @Composable DrawerStyleBuilder.() -> Unit = {},
): DrawerStyle = resolve(size, hasShadow).style(modify)

/**
 * Возвращает экземпляр [DrawerStyles] для drawer-close-inner
 */
public fun DrawerStyles.CloseInner.resolve(
    size: DrawerCloseInnerSize = DrawerCloseInnerSize.M,
    hasShadow: Boolean = false,
): DrawerStyles = when {
    size == DrawerCloseInnerSize.M && hasShadow == true -> DrawerStyles.DrawerCloseInnerMHasShadow
    size == DrawerCloseInnerSize.M -> DrawerStyles.DrawerCloseInnerM
    else -> error("Unsupported drawer-close-inner style combination")
}

/**
 * Возвращает [DrawerStyle] для drawer-close-inner
 */
@Composable
public fun DrawerStyles.CloseInner.style(
    size: DrawerCloseInnerSize = DrawerCloseInnerSize.M,
    hasShadow: Boolean = false,
    modify: @Composable DrawerStyleBuilder.() -> Unit = {},
): DrawerStyle = resolve(size, hasShadow).style(modify)

/**
 * Возвращает экземпляр [DrawerStyles] для drawer-close-outer
 */
public fun DrawerStyles.CloseOuter.resolve(
    size: DrawerCloseOuterSize = DrawerCloseOuterSize.M,
    hasShadow: Boolean = false,
): DrawerStyles = when {
    size == DrawerCloseOuterSize.M && hasShadow == true -> DrawerStyles.DrawerCloseOuterMHasShadow
    size == DrawerCloseOuterSize.M -> DrawerStyles.DrawerCloseOuterM
    else -> error("Unsupported drawer-close-outer style combination")
}

/**
 * Возвращает [DrawerStyle] для drawer-close-outer
 */
@Composable
public fun DrawerStyles.CloseOuter.style(
    size: DrawerCloseOuterSize = DrawerCloseOuterSize.M,
    hasShadow: Boolean = false,
    modify: @Composable DrawerStyleBuilder.() -> Unit = {},
): DrawerStyle = resolve(size, hasShadow).style(modify)
