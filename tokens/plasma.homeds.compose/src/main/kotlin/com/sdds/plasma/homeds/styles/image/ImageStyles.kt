// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.image

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ImageStyle
import com.sdds.compose.uikit.ImageStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperImage : BuilderWrapper<ImageStyle, ImageStyleBuilder>

/**
 * Обертка для вариации Ratio1x2
 */
@JvmInline
public value class WrapperImageRatio1x2(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio9x16
 */
@JvmInline
public value class WrapperImageRatio9x16(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio3x4
 */
@JvmInline
public value class WrapperImageRatio3x4(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio2x1
 */
@JvmInline
public value class WrapperImageRatio2x1(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio16x9
 */
@JvmInline
public value class WrapperImageRatio16x9(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio4x3
 */
@JvmInline
public value class WrapperImageRatio4x3(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

/**
 * Обертка для вариации Ratio1x1
 */
@JvmInline
public value class WrapperImageRatio1x1(
    public override val builder: ImageStyleBuilder,
) : WrapperImage

private val ImageStyleBuilder.invariantProps: ImageStyleBuilder
    @Composable
    get() = this

public val Image.Ratio1x2: WrapperImageRatio1x2
    @Composable
    @JvmName("WrapperImageRatio1x2")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(0.5f)
        .wrap(::WrapperImageRatio1x2)

public val Image.Ratio9x16: WrapperImageRatio9x16
    @Composable
    @JvmName("WrapperImageRatio9x16")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(0.5625f)
        .wrap(::WrapperImageRatio9x16)

public val Image.Ratio3x4: WrapperImageRatio3x4
    @Composable
    @JvmName("WrapperImageRatio3x4")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(0.75f)
        .wrap(::WrapperImageRatio3x4)

public val Image.Ratio2x1: WrapperImageRatio2x1
    @Composable
    @JvmName("WrapperImageRatio2x1")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(2.0f)
        .wrap(::WrapperImageRatio2x1)

public val Image.Ratio16x9: WrapperImageRatio16x9
    @Composable
    @JvmName("WrapperImageRatio16x9")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(1.7777778f)
        .wrap(::WrapperImageRatio16x9)

public val Image.Ratio4x3: WrapperImageRatio4x3
    @Composable
    @JvmName("WrapperImageRatio4x3")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(1.3333334f)
        .wrap(::WrapperImageRatio4x3)

public val Image.Ratio1x1: WrapperImageRatio1x1
    @Composable
    @JvmName("WrapperImageRatio1x1")
    get() = ImageStyle.builder(this)
        .invariantProps
        .ratio(1.0f)
        .wrap(::WrapperImageRatio1x1)
