// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.RectSkeletonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента RectSkeleton
 */
public enum class RectSkeletonStyles(
    public val key: String,
) {
    RectSkeletonDefault("RectSkeleton.Default"),
}

/**
 * Возвращает [RectSkeletonStyle] для [RectSkeletonStyles]
 */
@Composable
public fun RectSkeletonStyles.style(
    modifyAction: @Composable RectSkeletonStyleBuilder.() -> Unit =
        {},
): RectSkeletonStyle {
    val builder = when (this) {
        RectSkeletonStyles.RectSkeletonDefault -> RectSkeleton.Default
    }
    return builder.modify(modifyAction).style()
}
