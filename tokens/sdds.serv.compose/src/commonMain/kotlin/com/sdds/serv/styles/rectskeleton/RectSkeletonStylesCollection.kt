// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.rectskeleton

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
    RectSkeletonLighter("RectSkeleton.Lighter"),
    ;

    /**
     * Typed API для подбора стиля rect-skeleton
     */
    public companion object
}

/**
 * Возможные значения свойства view для rect-skeleton
 */
public enum class RectSkeletonView {
    Default,
    Lighter,
}

/**
 * Возвращает [RectSkeletonStyle] для [RectSkeletonStyles]
 */
@Composable
public fun RectSkeletonStyles.style(modify: @Composable RectSkeletonStyleBuilder.() -> Unit = {}): RectSkeletonStyle {
    val builder = when (this) {
        RectSkeletonStyles.RectSkeletonDefault -> RectSkeleton.Default
        RectSkeletonStyles.RectSkeletonLighter -> RectSkeleton.Lighter
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [RectSkeletonStyles] для rect-skeleton
 */
public fun RectSkeletonStyles.Companion.resolve(view: RectSkeletonView = RectSkeletonView.Default):
    RectSkeletonStyles = when {
    view == RectSkeletonView.Default -> RectSkeletonStyles.RectSkeletonDefault
    view == RectSkeletonView.Lighter -> RectSkeletonStyles.RectSkeletonLighter
    else -> error("Unsupported rect-skeleton style combination")
}

/**
 * Возвращает [RectSkeletonStyle] для rect-skeleton
 */
@Composable
public fun RectSkeletonStyles.Companion.style(
    view: RectSkeletonView = RectSkeletonView.Default,
    modify: @Composable RectSkeletonStyleBuilder.() -> Unit = {},
): RectSkeletonStyle =
    resolve(view).style(modify)
