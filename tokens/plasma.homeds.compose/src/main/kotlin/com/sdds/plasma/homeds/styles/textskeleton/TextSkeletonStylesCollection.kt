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
    TextSkeletonDefault("TextSkeleton.Default"),
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
        TextSkeletonStyles.TextSkeletonDefault -> TextSkeleton.Default
    }
    return builder.modify(modifyAction).style()
}
