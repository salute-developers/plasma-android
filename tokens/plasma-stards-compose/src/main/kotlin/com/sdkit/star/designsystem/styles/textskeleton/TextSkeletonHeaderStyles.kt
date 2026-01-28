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
public interface WrapperTextSkeletonHeader :
    BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Обертка для вариации H1
 */
@JvmInline
public value class WrapperTextSkeletonHeaderH1(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonHeader

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperTextSkeletonHeaderH2(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonHeader

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperTextSkeletonHeaderH3(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonHeader

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperTextSkeletonHeaderH4(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonHeader

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperTextSkeletonHeaderH5(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonHeader

private val TextSkeletonStyleBuilder.invariantProps: TextSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(StarDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )

public val TextSkeletonHeader.H1: WrapperTextSkeletonHeaderH1
    @Composable
    @JvmName("WrapperTextSkeletonHeaderH1")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.headerH1Bold)
        .wrap(::WrapperTextSkeletonHeaderH1)

public val TextSkeletonHeader.H2: WrapperTextSkeletonHeaderH2
    @Composable
    @JvmName("WrapperTextSkeletonHeaderH2")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.headerH2Bold)
        .wrap(::WrapperTextSkeletonHeaderH2)

public val TextSkeletonHeader.H3: WrapperTextSkeletonHeaderH3
    @Composable
    @JvmName("WrapperTextSkeletonHeaderH3")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.headerH3Bold)
        .wrap(::WrapperTextSkeletonHeaderH3)

public val TextSkeletonHeader.H4: WrapperTextSkeletonHeaderH4
    @Composable
    @JvmName("WrapperTextSkeletonHeaderH4")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.headerH4Bold)
        .wrap(::WrapperTextSkeletonHeaderH4)

public val TextSkeletonHeader.H5: WrapperTextSkeletonHeaderH5
    @Composable
    @JvmName("WrapperTextSkeletonHeaderH5")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.headerH5Bold)
        .wrap(::WrapperTextSkeletonHeaderH5)
