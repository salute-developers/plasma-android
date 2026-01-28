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
public interface WrapperTextSkeletonBody :
    BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextSkeletonBodyL(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonBody

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextSkeletonBodyM(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonBody

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextSkeletonBodyS(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonBody

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextSkeletonBodyXs(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonBody

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperTextSkeletonBodyXxs(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonBody

private val TextSkeletonStyleBuilder.invariantProps: TextSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(StarDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )

public val TextSkeletonBody.L: WrapperTextSkeletonBodyL
    @Composable
    @JvmName("WrapperTextSkeletonBodyL")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyLNormal)
        .wrap(::WrapperTextSkeletonBodyL)

public val TextSkeletonBody.M: WrapperTextSkeletonBodyM
    @Composable
    @JvmName("WrapperTextSkeletonBodyM")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyMNormal)
        .wrap(::WrapperTextSkeletonBodyM)

public val TextSkeletonBody.S: WrapperTextSkeletonBodyS
    @Composable
    @JvmName("WrapperTextSkeletonBodyS")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodySNormal)
        .wrap(::WrapperTextSkeletonBodyS)

public val TextSkeletonBody.Xs: WrapperTextSkeletonBodyXs
    @Composable
    @JvmName("WrapperTextSkeletonBodyXs")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXsNormal)
        .wrap(::WrapperTextSkeletonBodyXs)

public val TextSkeletonBody.Xxs: WrapperTextSkeletonBodyXxs
    @Composable
    @JvmName("WrapperTextSkeletonBodyXxs")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXxsNormal)
        .wrap(::WrapperTextSkeletonBodyXxs)
