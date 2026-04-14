// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Chip
 */
public enum class ChipStyles(
    public val key: String,
) {
    ChipChipSlotPadding("Chip.ChipSlotPadding"),
    ChipChipSlotAvatar("Chip.ChipSlotAvatar"),
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modifyAction: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
    val builder = when (this) {
        ChipStyles.ChipChipSlotPadding -> Chip.ChipSlotPadding
        ChipStyles.ChipChipSlotAvatar -> Chip.ChipSlotAvatar
    }
    return builder.modify(modifyAction).style()
}
