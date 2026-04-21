// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.overlay

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
    ;

    /**
     * Typed API для подбора стиля overlay
     */
    public companion object
}

/**
 * Возвращает [OverlayStyle] для [OverlayStyles]
 */
@Composable
public fun OverlayStyles.style(modify: @Composable OverlayStyleBuilder.() -> Unit = {}): OverlayStyle {
    val builder = when (this) {
        OverlayStyles.OverlayDefault -> Overlay.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [OverlayStyles] для overlay
 */
public fun OverlayStyles.Companion.resolve(): OverlayStyles = OverlayStyles.OverlayDefault

/**
 * Возвращает [OverlayStyle] для overlay
 */
@Composable
public fun OverlayStyles.Companion.style(modify: @Composable OverlayStyleBuilder.() -> Unit = {}):
    OverlayStyle = resolve().style(modify)
