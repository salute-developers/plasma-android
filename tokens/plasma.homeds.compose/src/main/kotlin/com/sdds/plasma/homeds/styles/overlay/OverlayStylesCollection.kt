// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.overlay

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.OverlayStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Overlay
 */
public enum class OverlayStyles(
    public val key: String,
) {
    OverlayDefault("Overlay.Default"),
    OverlayDirectionTop("Overlay.DirectionTop"),
    OverlayDirectionBottom("Overlay.DirectionBottom"),
    ;

    /**
     * Typed API для подбора стиля overlay
     */
    public companion object
}

/**
 * Возможные значения свойства kind для overlay
 */
public enum class OverlayKind {
    Default,
    DirectionTop,
    DirectionBottom,
}

/**
 * Возвращает [OverlayStyle] для [OverlayStyles]
 */
@Composable
public fun OverlayStyles.style(modify: @Composable OverlayStyleBuilder.() -> Unit = {}): OverlayStyle {
    val builder = when (this) {
        OverlayStyles.OverlayDefault -> Overlay.Default
        OverlayStyles.OverlayDirectionTop -> Overlay.DirectionTop
        OverlayStyles.OverlayDirectionBottom -> Overlay.DirectionBottom
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [OverlayStyles] для overlay
 */
public fun OverlayStyles.Companion.resolve(kind: OverlayKind = OverlayKind.Default): OverlayStyles =
    when {
        kind == OverlayKind.Default -> OverlayStyles.OverlayDefault
        kind == OverlayKind.DirectionTop -> OverlayStyles.OverlayDirectionTop
        kind == OverlayKind.DirectionBottom -> OverlayStyles.OverlayDirectionBottom
        else -> error("Unsupported overlay style combination")
    }

/**
 * Возвращает [OverlayStyle] для overlay
 */
@Composable
public fun OverlayStyles.Companion.style(
    kind: OverlayKind = OverlayKind.Default,
    modify: @Composable OverlayStyleBuilder.() -> Unit = {},
): OverlayStyle =
    resolve(kind).style(modify)
