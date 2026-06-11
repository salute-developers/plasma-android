// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.paginationdots

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.PaginationDotsStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента PaginationDots
 */
public enum class PaginationDotsStyles(
    public val key: String,
) {
    PaginationDotsHorizontalM("PaginationDotsHorizontal.M"),
    PaginationDotsHorizontalMActiveTypeLine("PaginationDotsHorizontal.M.ActiveTypeLine"),
    PaginationDotsHorizontalS("PaginationDotsHorizontal.S"),
    PaginationDotsHorizontalSActiveTypeLine("PaginationDotsHorizontal.S.ActiveTypeLine"),
    PaginationDotsVerticalM("PaginationDotsVertical.M"),
    PaginationDotsVerticalMActiveTypeLine("PaginationDotsVertical.M.ActiveTypeLine"),
    PaginationDotsVerticalS("PaginationDotsVertical.S"),
    PaginationDotsVerticalSActiveTypeLine("PaginationDotsVertical.S.ActiveTypeLine"),
    ;

    /**
     * Typed API для подбора стиля pagination-dots-horizontal
     */
    public object Horizontal

    /**
     * Typed API для подбора стиля pagination-dots-vertical
     */
    public object Vertical
}

/**
 * Возможные значения свойства size для pagination-dots-horizontal
 */
public enum class PaginationDotsHorizontalSize {
    M,
    S,
}

/**
 * Возможные значения свойства active-type для pagination-dots-horizontal
 */
public enum class PaginationDotsHorizontalActiveType {
    Default,
    Line,
}

/**
 * Возможные значения свойства size для pagination-dots-vertical
 */
public enum class PaginationDotsVerticalSize {
    M,
    S,
}

/**
 * Возможные значения свойства active-type для pagination-dots-vertical
 */
public enum class PaginationDotsVerticalActiveType {
    Default,
    Line,
}

/**
 * Возвращает [PaginationDotsStyle] для [PaginationDotsStyles]
 */
@Composable
public fun PaginationDotsStyles.style(
    modify: @Composable PaginationDotsStyleBuilder.() -> Unit =
        {},
): PaginationDotsStyle {
    val builder = when (this) {
        PaginationDotsStyles.PaginationDotsHorizontalM -> PaginationDotsHorizontal.M
        PaginationDotsStyles.PaginationDotsHorizontalMActiveTypeLine ->
            PaginationDotsHorizontal.M.ActiveTypeLine
        PaginationDotsStyles.PaginationDotsHorizontalS -> PaginationDotsHorizontal.S
        PaginationDotsStyles.PaginationDotsHorizontalSActiveTypeLine ->
            PaginationDotsHorizontal.S.ActiveTypeLine
        PaginationDotsStyles.PaginationDotsVerticalM -> PaginationDotsVertical.M
        PaginationDotsStyles.PaginationDotsVerticalMActiveTypeLine ->
            PaginationDotsVertical.M.ActiveTypeLine
        PaginationDotsStyles.PaginationDotsVerticalS -> PaginationDotsVertical.S
        PaginationDotsStyles.PaginationDotsVerticalSActiveTypeLine ->
            PaginationDotsVertical.S.ActiveTypeLine
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [PaginationDotsStyles] для pagination-dots-horizontal
 */
public fun PaginationDotsStyles.Horizontal.resolve(
    size: PaginationDotsHorizontalSize =
        PaginationDotsHorizontalSize.M,
    activeType: PaginationDotsHorizontalActiveType =
        PaginationDotsHorizontalActiveType.Default,
): PaginationDotsStyles = when {
    size == PaginationDotsHorizontalSize.M && activeType ==
        PaginationDotsHorizontalActiveType.Line ->
        PaginationDotsStyles.PaginationDotsHorizontalMActiveTypeLine
    size == PaginationDotsHorizontalSize.S && activeType ==
        PaginationDotsHorizontalActiveType.Line ->
        PaginationDotsStyles.PaginationDotsHorizontalSActiveTypeLine
    size == PaginationDotsHorizontalSize.M -> PaginationDotsStyles.PaginationDotsHorizontalM
    size == PaginationDotsHorizontalSize.S -> PaginationDotsStyles.PaginationDotsHorizontalS
    else -> error("Unsupported pagination-dots-horizontal style combination")
}

/**
 * Возвращает [PaginationDotsStyle] для pagination-dots-horizontal
 */
@Composable
public fun PaginationDotsStyles.Horizontal.style(
    size: PaginationDotsHorizontalSize = PaginationDotsHorizontalSize.M,
    activeType: PaginationDotsHorizontalActiveType = PaginationDotsHorizontalActiveType.Default,
    modify: @Composable PaginationDotsStyleBuilder.() -> Unit = {},
): PaginationDotsStyle = resolve(size, activeType).style(modify)

/**
 * Возвращает экземпляр [PaginationDotsStyles] для pagination-dots-vertical
 */
public fun PaginationDotsStyles.Vertical.resolve(
    size: PaginationDotsVerticalSize =
        PaginationDotsVerticalSize.M,
    activeType: PaginationDotsVerticalActiveType =
        PaginationDotsVerticalActiveType.Default,
): PaginationDotsStyles = when {
    size == PaginationDotsVerticalSize.M && activeType == PaginationDotsVerticalActiveType.Line ->
        PaginationDotsStyles.PaginationDotsVerticalMActiveTypeLine
    size == PaginationDotsVerticalSize.S && activeType == PaginationDotsVerticalActiveType.Line ->
        PaginationDotsStyles.PaginationDotsVerticalSActiveTypeLine
    size == PaginationDotsVerticalSize.M -> PaginationDotsStyles.PaginationDotsVerticalM
    size == PaginationDotsVerticalSize.S -> PaginationDotsStyles.PaginationDotsVerticalS
    else -> error("Unsupported pagination-dots-vertical style combination")
}

/**
 * Возвращает [PaginationDotsStyle] для pagination-dots-vertical
 */
@Composable
public fun PaginationDotsStyles.Vertical.style(
    size: PaginationDotsVerticalSize = PaginationDotsVerticalSize.M,
    activeType: PaginationDotsVerticalActiveType = PaginationDotsVerticalActiveType.Default,
    modify: @Composable PaginationDotsStyleBuilder.() -> Unit = {},
): PaginationDotsStyle = resolve(size, activeType).style(modify)
