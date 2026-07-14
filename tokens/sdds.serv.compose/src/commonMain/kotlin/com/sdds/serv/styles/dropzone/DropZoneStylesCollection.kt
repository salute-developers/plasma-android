// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.dropzone

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropZoneStyle
import com.sdds.compose.uikit.DropZoneStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента DropZone
 */
public enum class DropZoneStyles(
    public val key: String,
) {
    DropZoneDefault("DropZone.Default"),
    ;

    /**
     * Typed API для подбора стиля drop-zone
     */
    public companion object
}

/**
 * Возвращает [DropZoneStyle] для [DropZoneStyles]
 */
@Composable
public fun DropZoneStyles.style(modify: @Composable DropZoneStyleBuilder.() -> Unit = {}): DropZoneStyle {
    val builder = when (this) {
        DropZoneStyles.DropZoneDefault -> DropZone.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropZoneStyles] для drop-zone
 */
public fun DropZoneStyles.Companion.resolve(): DropZoneStyles = DropZoneStyles.DropZoneDefault

/**
 * Возвращает [DropZoneStyle] для drop-zone
 */
@Composable
public fun DropZoneStyles.Companion.style(modify: @Composable DropZoneStyleBuilder.() -> Unit = {}):
    DropZoneStyle = resolve().style(modify)
