// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.splitter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SplitterStyle
import com.sdds.compose.uikit.SplitterStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Splitter
 */
public enum class SplitterStyles(
    public val key: String,
) {
    SplitterDefault("Splitter.Default"),
    ;

    /**
     * Typed API для подбора стиля splitter
     */
    public companion object
}

/**
 * Возвращает [SplitterStyle] для [SplitterStyles]
 */
@Composable
public fun SplitterStyles.style(modify: @Composable SplitterStyleBuilder.() -> Unit = {}): SplitterStyle {
    val builder = when (this) {
        SplitterStyles.SplitterDefault -> Splitter.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SplitterStyles] для splitter
 */
public fun SplitterStyles.Companion.resolve(): SplitterStyles = SplitterStyles.SplitterDefault

/**
 * Возвращает [SplitterStyle] для splitter
 */
@Composable
public fun SplitterStyles.Companion.style(modify: @Composable SplitterStyleBuilder.() -> Unit = {}):
    SplitterStyle = resolve().style(modify)
