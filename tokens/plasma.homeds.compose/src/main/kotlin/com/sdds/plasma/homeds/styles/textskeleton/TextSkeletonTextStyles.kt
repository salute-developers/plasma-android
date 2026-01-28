// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.textskeleton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.TextSkeletonStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTextSkeletonText :
    BuilderWrapper<TextSkeletonStyle, TextSkeletonStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTextSkeletonTextL(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonText

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTextSkeletonTextM(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonText

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTextSkeletonTextS(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonText

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTextSkeletonTextXs(
    public override val builder: TextSkeletonStyleBuilder,
) : WrapperTextSkeletonText

private val TextSkeletonStyleBuilder.invariantProps: TextSkeletonStyleBuilder
    @Composable
    get() = this
        .shape(PlasmaHomeDsTheme.shapes.roundM)
        .duration(700.0.toInt())
        .gradient(
            SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
        )

public val TextSkeletonText.L: WrapperTextSkeletonTextL
    @Composable
    @JvmName("WrapperTextSkeletonTextL")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaHomeDsTheme.typography.textLNormal)
        .wrap(::WrapperTextSkeletonTextL)

public val TextSkeletonText.M: WrapperTextSkeletonTextM
    @Composable
    @JvmName("WrapperTextSkeletonTextM")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaHomeDsTheme.typography.textMNormal)
        .wrap(::WrapperTextSkeletonTextM)

public val TextSkeletonText.S: WrapperTextSkeletonTextS
    @Composable
    @JvmName("WrapperTextSkeletonTextS")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaHomeDsTheme.typography.textSNormal)
        .wrap(::WrapperTextSkeletonTextS)

public val TextSkeletonText.Xs: WrapperTextSkeletonTextXs
    @Composable
    @JvmName("WrapperTextSkeletonTextXs")
    get() = TextSkeletonStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaHomeDsTheme.typography.textXsNormal)
        .wrap(::WrapperTextSkeletonTextXs)
