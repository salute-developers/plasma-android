// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Loader
 */
public enum class LoaderStyles(
    public val key: String,
) {
    LoaderDefault("Loader.Default"),
    ;

    /**
     * Typed API для подбора стиля loader
     */
    public companion object
}

/**
 * Возвращает [LoaderStyle] для [LoaderStyles]
 */
@Composable
public fun LoaderStyles.style(modify: @Composable LoaderStyleBuilder.() -> Unit = {}): LoaderStyle {
    val builder = when (this) {
        LoaderStyles.LoaderDefault -> Loader.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [LoaderStyles] для loader
 */
public fun LoaderStyles.Companion.resolve(): LoaderStyles = LoaderStyles.LoaderDefault

/**
 * Возвращает [LoaderStyle] для loader
 */
@Composable
public fun LoaderStyles.Companion.style(modify: @Composable LoaderStyleBuilder.() -> Unit = {}):
    LoaderStyle = resolve().style(modify)
