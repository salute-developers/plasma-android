// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.textskeleton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.TextSkeletonStyleBuilder
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
public interface WrapperTextSkeleton : BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTextSkeletonDefault(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeleton

public val TextSkeleton.Default: WrapperTextSkeletonDefault
    @Composable
    @JvmName("WrapperTextSkeletonDefault")
    get() = TextSkeletonStyle.builder(this)
        .shape(StarDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )
        .wrap(::WrapperTextSkeletonDefault)
