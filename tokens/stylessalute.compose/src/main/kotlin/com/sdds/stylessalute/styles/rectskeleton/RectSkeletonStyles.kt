// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.RectSkeletonStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperRectSkeleton : BuilderWrapper<RectSkeletonStyle, RectSkeletonStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperRectSkeletonTerminate(
    public override val builder: RectSkeletonStyleBuilder,
) : WrapperRectSkeleton

public val RectSkeleton.Default: WrapperRectSkeletonTerminate
    @Composable
    get() = RectSkeletonStyle.builder(this)
        .invariantProps
        .gradient(
            StylesSaluteTheme.gradients.surfaceDefaultSkeletonGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperRectSkeletonTerminate)

public val RectSkeleton.Lighter: WrapperRectSkeletonTerminate
    @Composable
    get() = RectSkeletonStyle.builder(this)
        .invariantProps
        .gradient(
            StylesSaluteTheme.gradients.surfaceDefaultSkeletonDeepGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperRectSkeletonTerminate)

private val RectSkeletonStyleBuilder.invariantProps: RectSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(StylesSaluteTheme.shapes.roundM)
        .duration(5000.0.toInt())
