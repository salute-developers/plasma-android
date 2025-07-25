// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.TextSkeletonStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTextSkeleton : BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTextSkeletonTerminate(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeleton

public val TextSkeleton.Default: WrapperTextSkeletonTerminate
    @Composable
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .gradient(
            PlasmaSdServiceTheme.gradients.surfaceDefaultSkeletonGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperTextSkeletonTerminate)

public val TextSkeleton.Lighter: WrapperTextSkeletonTerminate
    @Composable
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .gradient(

            PlasmaSdServiceTheme.gradients.surfaceDefaultSkeletonDeepGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperTextSkeletonTerminate)

private val TextSkeletonStyleBuilder.invariantProps: TextSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(PlasmaSdServiceTheme.shapes.roundXxs)
        .duration(5000.0.toInt())
