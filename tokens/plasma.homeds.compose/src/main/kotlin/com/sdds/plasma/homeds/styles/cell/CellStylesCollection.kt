// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.cell

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
}

/**
 * Возвращает [CellStyle] для [CellStyles]
 */
@Composable
public fun CellStyles.style(modifyAction: @Composable CellStyleBuilder.() -> Unit = {}): CellStyle {
    val builder = when (this) {
        CellStyles.CellL -> Cell.L
        CellStyles.CellM -> Cell.M
        CellStyles.CellS -> Cell.S
        CellStyles.CellXs -> Cell.Xs
    }
    return builder.modify(modifyAction).style()
}
