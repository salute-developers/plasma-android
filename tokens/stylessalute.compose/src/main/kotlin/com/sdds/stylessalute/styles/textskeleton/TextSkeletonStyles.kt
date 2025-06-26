// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.TextSkeletonStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
        .shape(StylesSaluteTheme.shapes.roundXxs)
        .duration(5000.0.toInt())
        .gradient(
            StylesSaluteTheme.gradients.surfaceDefaultSkeletonGradient.asLayered().asStatefulValue(),
        )
        .wrap(::WrapperTextSkeletonDefault)
