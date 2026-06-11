// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.popover

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
    ;

    /**
     * Typed API для подбора стиля popover
     */
    public companion object
}

/**
 * Возможные значения свойства size для popover
 */
public enum class PopoverSize {
    M,
    S,
}

/**
 * Возможные значения свойства view для popover
 */
public enum class PopoverView {
    Default,
    Accent,
}

/**
 * Возвращает [PopoverStyle] для [PopoverStyles]
 */
@Composable
public fun PopoverStyles.style(modify: @Composable PopoverStyleBuilder.() -> Unit = {}): PopoverStyle {
    val builder = when (this) {
        PopoverStyles.PopoverMDefault -> Popover.M.Default
        PopoverStyles.PopoverMAccent -> Popover.M.Accent
        PopoverStyles.PopoverSDefault -> Popover.S.Default
        PopoverStyles.PopoverSAccent -> Popover.S.Accent
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [PopoverStyles] для popover
 */
public fun PopoverStyles.Companion.resolve(
    size: PopoverSize = PopoverSize.M,
    view: PopoverView =
        PopoverView.Default,
): PopoverStyles = when {
    size == PopoverSize.M && view == PopoverView.Default -> PopoverStyles.PopoverMDefault
    size == PopoverSize.M && view == PopoverView.Accent -> PopoverStyles.PopoverMAccent
    size == PopoverSize.S && view == PopoverView.Default -> PopoverStyles.PopoverSDefault
    size == PopoverSize.S && view == PopoverView.Accent -> PopoverStyles.PopoverSAccent
    else -> error("Unsupported popover style combination")
}

/**
 * Возвращает [PopoverStyle] для popover
 */
@Composable
public fun PopoverStyles.Companion.style(
    size: PopoverSize = PopoverSize.M,
    view: PopoverView = PopoverView.Default,
    modify: @Composable PopoverStyleBuilder.() -> Unit = {},
): PopoverStyle = resolve(size, view).style(modify)
