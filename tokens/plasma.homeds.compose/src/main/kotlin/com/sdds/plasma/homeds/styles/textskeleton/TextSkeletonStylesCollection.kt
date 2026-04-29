// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.textskeleton

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
    TextSkeletonBodyL("TextSkeletonBody.L"),
    TextSkeletonBodyM("TextSkeletonBody.M"),
    TextSkeletonBodyS("TextSkeletonBody.S"),
    TextSkeletonBodyXs("TextSkeletonBody.Xs"),
    TextSkeletonBodyXxs("TextSkeletonBody.Xxs"),
    TextSkeletonDisplayL("TextSkeletonDisplay.L"),
    TextSkeletonDisplayM("TextSkeletonDisplay.M"),
    TextSkeletonDisplayS("TextSkeletonDisplay.S"),
    TextSkeletonHeaderH1("TextSkeletonHeader.H1"),
    TextSkeletonHeaderH2("TextSkeletonHeader.H2"),
    TextSkeletonHeaderH3("TextSkeletonHeader.H3"),
    TextSkeletonHeaderH4("TextSkeletonHeader.H4"),
    TextSkeletonHeaderH5("TextSkeletonHeader.H5"),
    TextSkeletonHeaderH6("TextSkeletonHeader.H6"),
    TextSkeletonTextL("TextSkeletonText.L"),
    TextSkeletonTextM("TextSkeletonText.M"),
    TextSkeletonTextS("TextSkeletonText.S"),
    TextSkeletonTextXs("TextSkeletonText.Xs"),
    ;

    /**
     * Typed API для подбора стиля text-skeleton-body
     */
    public object Body

    /**
     * Typed API для подбора стиля text-skeleton-display
     */
    public object Display

    /**
     * Typed API для подбора стиля text-skeleton-header
     */
    public object Header

    /**
     * Typed API для подбора стиля text-skeleton-text
     */
    public object Text
}

/**
 * Возможные значения свойства size для text-skeleton-body
 */
public enum class TextSkeletonBodySize {
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства size для text-skeleton-display
 */
public enum class TextSkeletonDisplaySize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства size для text-skeleton-header
 */
public enum class TextSkeletonHeaderSize {
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
}

/**
 * Возможные значения свойства size для text-skeleton-text
 */
public enum class TextSkeletonTextSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [TextSkeletonStyle] для [TextSkeletonStyles]
 */
@Composable
public fun TextSkeletonStyles.style(modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {}): TextSkeletonStyle {
    val builder = when (this) {
        TextSkeletonStyles.TextSkeletonBodyL -> TextSkeletonBody.L
        TextSkeletonStyles.TextSkeletonBodyM -> TextSkeletonBody.M
        TextSkeletonStyles.TextSkeletonBodyS -> TextSkeletonBody.S
        TextSkeletonStyles.TextSkeletonBodyXs -> TextSkeletonBody.Xs
        TextSkeletonStyles.TextSkeletonBodyXxs -> TextSkeletonBody.Xxs
        TextSkeletonStyles.TextSkeletonDisplayL -> TextSkeletonDisplay.L
        TextSkeletonStyles.TextSkeletonDisplayM -> TextSkeletonDisplay.M
        TextSkeletonStyles.TextSkeletonDisplayS -> TextSkeletonDisplay.S
        TextSkeletonStyles.TextSkeletonHeaderH1 -> TextSkeletonHeader.H1
        TextSkeletonStyles.TextSkeletonHeaderH2 -> TextSkeletonHeader.H2
        TextSkeletonStyles.TextSkeletonHeaderH3 -> TextSkeletonHeader.H3
        TextSkeletonStyles.TextSkeletonHeaderH4 -> TextSkeletonHeader.H4
        TextSkeletonStyles.TextSkeletonHeaderH5 -> TextSkeletonHeader.H5
        TextSkeletonStyles.TextSkeletonHeaderH6 -> TextSkeletonHeader.H6
        TextSkeletonStyles.TextSkeletonTextL -> TextSkeletonText.L
        TextSkeletonStyles.TextSkeletonTextM -> TextSkeletonText.M
        TextSkeletonStyles.TextSkeletonTextS -> TextSkeletonText.S
        TextSkeletonStyles.TextSkeletonTextXs -> TextSkeletonText.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TextSkeletonStyles] для text-skeleton-body
 */
public fun TextSkeletonStyles.Body.resolve(size: TextSkeletonBodySize = TextSkeletonBodySize.L):
    TextSkeletonStyles = when {
    size == TextSkeletonBodySize.L -> TextSkeletonStyles.TextSkeletonBodyL
    size == TextSkeletonBodySize.M -> TextSkeletonStyles.TextSkeletonBodyM
    size == TextSkeletonBodySize.S -> TextSkeletonStyles.TextSkeletonBodyS
    size == TextSkeletonBodySize.Xs -> TextSkeletonStyles.TextSkeletonBodyXs
    size == TextSkeletonBodySize.Xxs -> TextSkeletonStyles.TextSkeletonBodyXxs
    else -> error("Unsupported text-skeleton-body style combination")
}

/**
 * Возвращает [TextSkeletonStyle] для text-skeleton-body
 */
@Composable
public fun TextSkeletonStyles.Body.style(
    size: TextSkeletonBodySize = TextSkeletonBodySize.L,
    modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {},
): TextSkeletonStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [TextSkeletonStyles] для text-skeleton-display
 */
public fun TextSkeletonStyles.Display.resolve(
    size: TextSkeletonDisplaySize =
        TextSkeletonDisplaySize.L,
): TextSkeletonStyles = when {
    size == TextSkeletonDisplaySize.L -> TextSkeletonStyles.TextSkeletonDisplayL
    size == TextSkeletonDisplaySize.M -> TextSkeletonStyles.TextSkeletonDisplayM
    size == TextSkeletonDisplaySize.S -> TextSkeletonStyles.TextSkeletonDisplayS
    else -> error("Unsupported text-skeleton-display style combination")
}

/**
 * Возвращает [TextSkeletonStyle] для text-skeleton-display
 */
@Composable
public fun TextSkeletonStyles.Display.style(
    size: TextSkeletonDisplaySize =
        TextSkeletonDisplaySize.L,
    modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {},
): TextSkeletonStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [TextSkeletonStyles] для text-skeleton-header
 */
public fun TextSkeletonStyles.Header.resolve(
    size: TextSkeletonHeaderSize =
        TextSkeletonHeaderSize.H1,
): TextSkeletonStyles = when {
    size == TextSkeletonHeaderSize.H1 -> TextSkeletonStyles.TextSkeletonHeaderH1
    size == TextSkeletonHeaderSize.H2 -> TextSkeletonStyles.TextSkeletonHeaderH2
    size == TextSkeletonHeaderSize.H3 -> TextSkeletonStyles.TextSkeletonHeaderH3
    size == TextSkeletonHeaderSize.H4 -> TextSkeletonStyles.TextSkeletonHeaderH4
    size == TextSkeletonHeaderSize.H5 -> TextSkeletonStyles.TextSkeletonHeaderH5
    size == TextSkeletonHeaderSize.H6 -> TextSkeletonStyles.TextSkeletonHeaderH6
    else -> error("Unsupported text-skeleton-header style combination")
}

/**
 * Возвращает [TextSkeletonStyle] для text-skeleton-header
 */
@Composable
public fun TextSkeletonStyles.Header.style(
    size: TextSkeletonHeaderSize = TextSkeletonHeaderSize.H1,
    modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {},
): TextSkeletonStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [TextSkeletonStyles] для text-skeleton-text
 */
public fun TextSkeletonStyles.Text.resolve(size: TextSkeletonTextSize = TextSkeletonTextSize.L):
    TextSkeletonStyles = when {
    size == TextSkeletonTextSize.L -> TextSkeletonStyles.TextSkeletonTextL
    size == TextSkeletonTextSize.M -> TextSkeletonStyles.TextSkeletonTextM
    size == TextSkeletonTextSize.S -> TextSkeletonStyles.TextSkeletonTextS
    size == TextSkeletonTextSize.Xs -> TextSkeletonStyles.TextSkeletonTextXs
    else -> error("Unsupported text-skeleton-text style combination")
}

/**
 * Возвращает [TextSkeletonStyle] для text-skeleton-text
 */
@Composable
public fun TextSkeletonStyles.Text.style(
    size: TextSkeletonTextSize = TextSkeletonTextSize.L,
    modify: @Composable TextSkeletonStyleBuilder.() -> Unit = {},
): TextSkeletonStyle =
    resolve(size).style(modify)
