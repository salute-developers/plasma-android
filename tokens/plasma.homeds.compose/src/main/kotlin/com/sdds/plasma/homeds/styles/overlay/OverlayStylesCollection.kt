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
}

/**
 * Возвращает [OverlayStyle] для [OverlayStyles]
 */
@Composable
public fun OverlayStyles.style(modifyAction: @Composable OverlayStyleBuilder.() -> Unit = {}): OverlayStyle {
    val builder = when (this) {
        OverlayStyles.OverlayDefault -> Overlay.Default
        OverlayStyles.OverlayDirectionTop -> Overlay.DirectionTop
        OverlayStyles.OverlayDirectionBottom -> Overlay.DirectionBottom
    }
    return builder.modify(modifyAction).style()
}
