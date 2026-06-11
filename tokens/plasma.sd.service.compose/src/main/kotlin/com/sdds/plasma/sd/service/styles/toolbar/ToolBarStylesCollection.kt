// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.toolbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.ToolBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ToolBar
 */
public enum class ToolBarStyles(
    public val key: String,
) {
    ToolBarHorizontalL("ToolBarHorizontal.L"),
    ToolBarHorizontalLHasShadow("ToolBarHorizontal.L.HasShadow"),
    ToolBarHorizontalM("ToolBarHorizontal.M"),
    ToolBarHorizontalMHasShadow("ToolBarHorizontal.M.HasShadow"),
    ToolBarHorizontalS("ToolBarHorizontal.S"),
    ToolBarHorizontalSHasShadow("ToolBarHorizontal.S.HasShadow"),
    ToolBarHorizontalXs("ToolBarHorizontal.Xs"),
    ToolBarHorizontalXsHasShadow("ToolBarHorizontal.Xs.HasShadow"),
    ToolBarVerticalL("ToolBarVertical.L"),
    ToolBarVerticalLHasShadow("ToolBarVertical.L.HasShadow"),
    ToolBarVerticalM("ToolBarVertical.M"),
    ToolBarVerticalMHasShadow("ToolBarVertical.M.HasShadow"),
    ToolBarVerticalS("ToolBarVertical.S"),
    ToolBarVerticalSHasShadow("ToolBarVertical.S.HasShadow"),
    ToolBarVerticalXs("ToolBarVertical.Xs"),
    ToolBarVerticalXsHasShadow("ToolBarVertical.Xs.HasShadow"),
    ;

    /**
     * Typed API для подбора стиля tool-bar-horizontal
     */
    public object Horizontal

    /**
     * Typed API для подбора стиля tool-bar-vertical
     */
    public object Vertical
}

/**
 * Возможные значения свойства size для tool-bar-horizontal
 */
public enum class ToolBarHorizontalSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для tool-bar-vertical
 */
public enum class ToolBarVerticalSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [ToolBarStyle] для [ToolBarStyles]
 */
@Composable
public fun ToolBarStyles.style(modify: @Composable ToolBarStyleBuilder.() -> Unit = {}): ToolBarStyle {
    val builder = when (this) {
        ToolBarStyles.ToolBarHorizontalL -> ToolBarHorizontal.L
        ToolBarStyles.ToolBarHorizontalLHasShadow -> ToolBarHorizontal.L.HasShadow
        ToolBarStyles.ToolBarHorizontalM -> ToolBarHorizontal.M
        ToolBarStyles.ToolBarHorizontalMHasShadow -> ToolBarHorizontal.M.HasShadow
        ToolBarStyles.ToolBarHorizontalS -> ToolBarHorizontal.S
        ToolBarStyles.ToolBarHorizontalSHasShadow -> ToolBarHorizontal.S.HasShadow
        ToolBarStyles.ToolBarHorizontalXs -> ToolBarHorizontal.Xs
        ToolBarStyles.ToolBarHorizontalXsHasShadow -> ToolBarHorizontal.Xs.HasShadow
        ToolBarStyles.ToolBarVerticalL -> ToolBarVertical.L
        ToolBarStyles.ToolBarVerticalLHasShadow -> ToolBarVertical.L.HasShadow
        ToolBarStyles.ToolBarVerticalM -> ToolBarVertical.M
        ToolBarStyles.ToolBarVerticalMHasShadow -> ToolBarVertical.M.HasShadow
        ToolBarStyles.ToolBarVerticalS -> ToolBarVertical.S
        ToolBarStyles.ToolBarVerticalSHasShadow -> ToolBarVertical.S.HasShadow
        ToolBarStyles.ToolBarVerticalXs -> ToolBarVertical.Xs
        ToolBarStyles.ToolBarVerticalXsHasShadow -> ToolBarVertical.Xs.HasShadow
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ToolBarStyles] для tool-bar-horizontal
 */
public fun ToolBarStyles.Horizontal.resolve(
    size: ToolBarHorizontalSize = ToolBarHorizontalSize.L,
    hasShadow: Boolean = false,
): ToolBarStyles = when {
    size == ToolBarHorizontalSize.L && hasShadow == true ->
        ToolBarStyles.ToolBarHorizontalLHasShadow
    size == ToolBarHorizontalSize.M && hasShadow == true ->
        ToolBarStyles.ToolBarHorizontalMHasShadow
    size == ToolBarHorizontalSize.S && hasShadow == true ->
        ToolBarStyles.ToolBarHorizontalSHasShadow
    size == ToolBarHorizontalSize.Xs && hasShadow == true ->
        ToolBarStyles.ToolBarHorizontalXsHasShadow
    size == ToolBarHorizontalSize.L -> ToolBarStyles.ToolBarHorizontalL
    size == ToolBarHorizontalSize.M -> ToolBarStyles.ToolBarHorizontalM
    size == ToolBarHorizontalSize.S -> ToolBarStyles.ToolBarHorizontalS
    size == ToolBarHorizontalSize.Xs -> ToolBarStyles.ToolBarHorizontalXs
    else -> error("Unsupported tool-bar-horizontal style combination")
}

/**
 * Возвращает [ToolBarStyle] для tool-bar-horizontal
 */
@Composable
public fun ToolBarStyles.Horizontal.style(
    size: ToolBarHorizontalSize = ToolBarHorizontalSize.L,
    hasShadow: Boolean = false,
    modify: @Composable ToolBarStyleBuilder.() -> Unit = {},
): ToolBarStyle = resolve(size, hasShadow).style(modify)

/**
 * Возвращает экземпляр [ToolBarStyles] для tool-bar-vertical
 */
public fun ToolBarStyles.Vertical.resolve(
    size: ToolBarVerticalSize = ToolBarVerticalSize.L,
    hasShadow: Boolean = false,
): ToolBarStyles = when {
    size == ToolBarVerticalSize.L && hasShadow == true -> ToolBarStyles.ToolBarVerticalLHasShadow
    size == ToolBarVerticalSize.M && hasShadow == true -> ToolBarStyles.ToolBarVerticalMHasShadow
    size == ToolBarVerticalSize.S && hasShadow == true -> ToolBarStyles.ToolBarVerticalSHasShadow
    size == ToolBarVerticalSize.Xs && hasShadow == true -> ToolBarStyles.ToolBarVerticalXsHasShadow
    size == ToolBarVerticalSize.L -> ToolBarStyles.ToolBarVerticalL
    size == ToolBarVerticalSize.M -> ToolBarStyles.ToolBarVerticalM
    size == ToolBarVerticalSize.S -> ToolBarStyles.ToolBarVerticalS
    size == ToolBarVerticalSize.Xs -> ToolBarStyles.ToolBarVerticalXs
    else -> error("Unsupported tool-bar-vertical style combination")
}

/**
 * Возвращает [ToolBarStyle] для tool-bar-vertical
 */
@Composable
public fun ToolBarStyles.Vertical.style(
    size: ToolBarVerticalSize = ToolBarVerticalSize.L,
    hasShadow: Boolean = false,
    modify: @Composable ToolBarStyleBuilder.() -> Unit = {},
): ToolBarStyle = resolve(size, hasShadow).style(modify)
