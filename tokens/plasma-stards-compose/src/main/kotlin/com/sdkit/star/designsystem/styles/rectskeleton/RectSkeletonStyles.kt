// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.rectskeleton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.RectSkeletonStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.theme.StarDsTheme
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

public val RectSkeleton.Default: WrapperRectSkeletonDefault
    @Composable
    @JvmName("WrapperRectSkeletonDefault")
    get() = RectSkeletonStyle.builder(this)
        .shape(StarDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )
        .wrap(::WrapperRectSkeletonDefault)
