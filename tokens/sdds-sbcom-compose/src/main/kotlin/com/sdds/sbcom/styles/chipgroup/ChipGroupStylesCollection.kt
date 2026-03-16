// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.chipgroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ChipGroup
 */
public enum class ChipGroupStyles(
    public val key: String,
) {
    ChipGroupDefault("ChipGroup.Default"),
    ChipGroupHasContentStart("ChipGroup.HasContentStart"),
}

/**
 * Возвращает [ChipGroupStyle] для [ChipGroupStyles]
 */
@Composable
public fun ChipGroupStyles.style(modifyAction: @Composable ChipGroupStyleBuilder.() -> Unit = {}): ChipGroupStyle {
    val builder = when (this) {
        ChipGroupStyles.ChipGroupDefault -> ChipGroup.Default
        ChipGroupStyles.ChipGroupHasContentStart -> ChipGroup.HasContentStart
    }
    return builder.modify(modifyAction).style()
}
