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
public interface WrapperTextSkeletonDisplay :
    BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextSkeletonDisplayL(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonDisplay

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextSkeletonDisplayM(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonDisplay

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextSkeletonDisplayS(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonDisplay

private val TextSkeletonStyleBuilder.invariantProps: TextSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(StarDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )

public val TextSkeletonDisplay.L: WrapperTextSkeletonDisplayL
    @Composable
    @JvmName("WrapperTextSkeletonDisplayL")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.displayLNormal)
        .wrap(::WrapperTextSkeletonDisplayL)

public val TextSkeletonDisplay.M: WrapperTextSkeletonDisplayM
    @Composable
    @JvmName("WrapperTextSkeletonDisplayM")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.displayMNormal)
        .wrap(::WrapperTextSkeletonDisplayM)

public val TextSkeletonDisplay.S: WrapperTextSkeletonDisplayS
    @Composable
    @JvmName("WrapperTextSkeletonDisplayS")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.displaySNormal)
        .wrap(::WrapperTextSkeletonDisplayS)
