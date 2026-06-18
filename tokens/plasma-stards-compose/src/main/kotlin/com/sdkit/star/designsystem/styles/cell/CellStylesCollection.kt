// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.cell

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Cell
 */
public enum class CellStyles(
    public val key: String,
) {
    CellL("Cell.L"),
    CellM("Cell.M"),
    CellS("Cell.S"),
    CellXs("Cell.Xs"),
    CellSelectL("CellSelect.L"),
    CellSelectM("CellSelect.M"),
    CellSelectS("CellSelect.S"),
    CellSelectXs("CellSelect.Xs"),
    ;

    /**
     * Typed API для подбора стиля cell
     */
    public object Default

    /**
     * Typed API для подбора стиля cell-select
     */
    public object Select
}

/**
 * Возможные значения свойства size для cell
 */
public enum class CellDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для cell-select
 */
public enum class CellSelectSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [CellStyle] для [CellStyles]
 */
@Composable
public fun CellStyles.style(modify: @Composable CellStyleBuilder.() -> Unit = {}): CellStyle {
    val builder = when (this) {
        CellStyles.CellL -> Cell.L
        CellStyles.CellM -> Cell.M
        CellStyles.CellS -> Cell.S
        CellStyles.CellXs -> Cell.Xs
        CellStyles.CellSelectL -> CellSelect.L
        CellStyles.CellSelectM -> CellSelect.M
        CellStyles.CellSelectS -> CellSelect.S
        CellStyles.CellSelectXs -> CellSelect.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CellStyles] для cell
 */
public fun CellStyles.Default.resolve(size: CellDefaultSize = CellDefaultSize.L): CellStyles = when {
    size == CellDefaultSize.L -> CellStyles.CellL
    size == CellDefaultSize.M -> CellStyles.CellM
    size == CellDefaultSize.S -> CellStyles.CellS
    size == CellDefaultSize.Xs -> CellStyles.CellXs
    else -> error("Unsupported cell style combination")
}

/**
 * Возвращает [CellStyle] для cell
 */
@Composable
public fun CellStyles.Default.style(
    size: CellDefaultSize = CellDefaultSize.L,
    modify: @Composable
    CellStyleBuilder.() -> Unit = {},
): CellStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [CellStyles] для cell-select
 */
public fun CellStyles.Select.resolve(size: CellSelectSize = CellSelectSize.L): CellStyles = when {
    size == CellSelectSize.L -> CellStyles.CellSelectL
    size == CellSelectSize.M -> CellStyles.CellSelectM
    size == CellSelectSize.S -> CellStyles.CellSelectS
    size == CellSelectSize.Xs -> CellStyles.CellSelectXs
    else -> error("Unsupported cell-select style combination")
}

/**
 * Возвращает [CellStyle] для cell-select
 */
@Composable
public fun CellStyles.Select.style(
    size: CellSelectSize = CellSelectSize.L,
    modify: @Composable
    CellStyleBuilder.() -> Unit = {},
): CellStyle = resolve(size).style(modify)
