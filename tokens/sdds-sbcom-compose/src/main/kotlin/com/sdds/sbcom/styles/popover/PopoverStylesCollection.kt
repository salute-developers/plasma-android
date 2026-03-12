// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.popover

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.PopoverStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Popover
 */
public enum class PopoverStyles(
    public val key: String,
) {
    PopoverMDefault("Popover.M.Default"),
    PopoverMAccent("Popover.M.Accent"),
    PopoverSDefault("Popover.S.Default"),
    PopoverSAccent("Popover.S.Accent"),
}

/**
 * Возвращает [PopoverStyle] для [PopoverStyles]
 */
@Composable
public fun PopoverStyles.style(modifyAction: @Composable PopoverStyleBuilder.() -> Unit = {}): PopoverStyle {
    val builder = when (this) {
        PopoverStyles.PopoverMDefault -> Popover.M.Default
        PopoverStyles.PopoverMAccent -> Popover.M.Accent
        PopoverStyles.PopoverSDefault -> Popover.S.Default
        PopoverStyles.PopoverSAccent -> Popover.S.Accent
    }
    return builder.modify(modifyAction).style()
}
