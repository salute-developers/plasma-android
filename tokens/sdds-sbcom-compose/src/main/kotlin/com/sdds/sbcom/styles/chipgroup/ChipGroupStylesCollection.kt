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
    ChipGroupChipSlotPadding("ChipGroup.ChipSlotPadding"),
    ChipGroupChipSlotAvatar("ChipGroup.ChipSlotAvatar"),
    ;

    /**
     * Typed API для подбора стиля chip-group
     */
    public companion object
}

/**
 * Возможные значения свойства chip-slot для chip-group
 */
public enum class ChipGroupChipSlot {
    Padding,
    Avatar,
}

/**
 * Возвращает [ChipGroupStyle] для [ChipGroupStyles]
 */
@Composable
public fun ChipGroupStyles.style(modify: @Composable ChipGroupStyleBuilder.() -> Unit = {}): ChipGroupStyle {
    val builder = when (this) {
        ChipGroupStyles.ChipGroupChipSlotPadding -> ChipGroup.ChipSlotPadding
        ChipGroupStyles.ChipGroupChipSlotAvatar -> ChipGroup.ChipSlotAvatar
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipGroupStyles] для chip-group
 */
public fun ChipGroupStyles.Companion.resolve(
    chipSlot: ChipGroupChipSlot =
        ChipGroupChipSlot.Padding,
): ChipGroupStyles = when {
    chipSlot == ChipGroupChipSlot.Padding -> ChipGroupStyles.ChipGroupChipSlotPadding
    chipSlot == ChipGroupChipSlot.Avatar -> ChipGroupStyles.ChipGroupChipSlotAvatar
    else -> error("Unsupported chip-group style combination")
}

/**
 * Возвращает [ChipGroupStyle] для chip-group
 */
@Composable
public fun ChipGroupStyles.Companion.style(
    chipSlot: ChipGroupChipSlot = ChipGroupChipSlot.Padding,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle =
    resolve(chipSlot).style(modify)
