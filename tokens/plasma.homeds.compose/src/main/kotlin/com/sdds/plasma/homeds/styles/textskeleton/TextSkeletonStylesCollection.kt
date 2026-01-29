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
}

/**
 * Возвращает [TextSkeletonStyle] для [TextSkeletonStyles]
 */
@Composable
public fun TextSkeletonStyles.style(
    modifyAction: @Composable TextSkeletonStyleBuilder.() -> Unit =
        {},
): TextSkeletonStyle {
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
    return builder.modify(modifyAction).style()
}
