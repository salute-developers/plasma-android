// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.TextSkeletonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TextSkeleton
 */
public enum class TextSkeletonStyles(
    public val key: String,
) {
    TextSkeletonDefault("TextSkeleton.Default"),
    TextSkeletonLighter("TextSkeleton.Lighter"),
    ;

    /**
     * Typed API для подбора стиля text-skeleton
     */
    public companion object
}

/**
 * Возможные значения свойства view для text-skeleton
 */
public enum class TextSkeletonView {
    Default,
    Lighter,
}

/**
 * Возвращает [TextSkeletonStyle] для [TextSkeletonStyles]
 */
@Composable
public fun TextSkeletonStyles.style(modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {}): TextSkeletonStyle {
    val builder = when (this) {
        TextSkeletonStyles.TextSkeletonDefault -> TextSkeleton.Default
        TextSkeletonStyles.TextSkeletonLighter -> TextSkeleton.Lighter
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextSkeletonStyles] для text-skeleton
 */
public fun TextSkeletonStyles.Companion.resolve(view: TextSkeletonView = TextSkeletonView.Default):
    TextSkeletonStyles = when {
    view == TextSkeletonView.Default -> TextSkeletonStyles.TextSkeletonDefault
    view == TextSkeletonView.Lighter -> TextSkeletonStyles.TextSkeletonLighter
    else -> error("Unsupported text-skeleton style combination")
}

/**
 * Возвращает [TextSkeletonStyle] для text-skeleton
 */
@Composable
public fun TextSkeletonStyles.Companion.style(
    view: TextSkeletonView = TextSkeletonView.Default,
    modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {},
): TextSkeletonStyle =
    resolve(view).style(modify)
