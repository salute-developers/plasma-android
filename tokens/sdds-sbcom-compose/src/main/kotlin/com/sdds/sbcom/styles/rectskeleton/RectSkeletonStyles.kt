// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.rectskeleton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.RectSkeletonStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperRectSkeleton : BuilderWrapper<RectSkeletonStyle, RectSkeletonStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperRectSkeletonDefault(
    public override val builder: RectSkeletonStyleBuilder,
) : WrapperRectSkeleton

/**
 * Обертка для вариации Pulse
 */
@JvmInline
public value class WrapperRectSkeletonPulse(
    public override val builder: RectSkeletonStyleBuilder,
) : WrapperRectSkeleton

private val RectSkeletonStyleBuilder.invariantProps: RectSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(SddsSbComTheme.shapes.roundM)
        .duration(1000.0.toInt())

public val RectSkeleton.Default: WrapperRectSkeletonDefault
    @Composable
    @JvmName("WrapperRectSkeletonDefault")
    get() = RectSkeletonStyle.builder(this)
        .invariantProps
        .gradient(
            SddsSbComTheme.gradients.surfaceDefaultSkeletonGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperRectSkeletonDefault)

public val RectSkeleton.Pulse: WrapperRectSkeletonPulse
    @Composable
    @JvmName("WrapperRectSkeletonPulse")
    get() = RectSkeletonStyle.builder(this)
        .invariantProps
        .gradient(
            SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(),
        )
        .wrap(::WrapperRectSkeletonPulse)
