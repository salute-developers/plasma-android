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
    ;

    /**
     * Typed API для подбора стиля chip
     */
    public companion object
}

/**
 * Возможные значения свойства chip-slot для chip
 */
public enum class ChipChipSlot {
    Padding,
    Avatar,
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modify: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
    val builder = when (this) {
        ChipStyles.ChipChipSlotPadding -> Chip.ChipSlotPadding
        ChipStyles.ChipChipSlotAvatar -> Chip.ChipSlotAvatar
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipStyles] для chip
 */
public fun ChipStyles.Companion.resolve(chipSlot: ChipChipSlot = ChipChipSlot.Padding): ChipStyles =
    when {
        chipSlot == ChipChipSlot.Padding -> ChipStyles.ChipChipSlotPadding
        chipSlot == ChipChipSlot.Avatar -> ChipStyles.ChipChipSlotAvatar
        else -> error("Unsupported chip style combination")
    }

/**
 * Возвращает [ChipStyle] для chip
 */
@Composable
public fun ChipStyles.Companion.style(
    chipSlot: ChipChipSlot = ChipChipSlot.Padding,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle =
    resolve(chipSlot).style(modify)
