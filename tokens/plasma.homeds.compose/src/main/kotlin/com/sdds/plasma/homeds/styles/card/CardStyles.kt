// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.card

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardOrientation
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCard : BuilderWrapper<CardStyle, CardStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperCardXl(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации XlHasInnerPaddings
 */
@JvmInline
public value class WrapperCardXlHasInnerPaddings(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCardL(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации LHasInnerPaddings
 */
@JvmInline
public value class WrapperCardLHasInnerPaddings(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCardM(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации MHasInnerPaddings
 */
@JvmInline
public value class WrapperCardMHasInnerPaddings(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCardS(
    public override val builder: CardStyleBuilder,
) : WrapperCard

/**
 * Обертка для вариации SHasInnerPaddings
 */
@JvmInline
public value class WrapperCardSHasInnerPaddings(
    public override val builder: CardStyleBuilder,
) : WrapperCard

private val CardStyleBuilder.invariantProps: CardStyleBuilder
    @Composable
    get() = this
        .orientation(CardOrientation.Vertical)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .dimensions {
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            mainAxisGap(8.0.dp)
        }

public val Card.Xl: WrapperCardXl
    @Composable
    @JvmName("WrapperCardXl")
    get() = CardStyle.builder(this)
        .invariantProps
        .dimensions {
            contentPaddingTop(0.0.dp)
            contentPaddingBottom(0.0.dp)
            contentPaddingStart(0.0.dp)
            contentPaddingEnd(0.0.dp)
            contentMinWidth(219.0.dp)
            contentMinHeight(128.0.dp)
            contentMaxWidth(219.0.dp)
            contentMaxHeight(128.0.dp)
        }
        .wrap(::WrapperCardXl)

public val WrapperCardXl.HasInnerPaddings: WrapperCardXlHasInnerPaddings
    @Composable
    @JvmName("WrapperCardXlHasInnerPaddings")
    get() = builder
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
        }
        .wrap(::WrapperCardXlHasInnerPaddings)

public val Card.L: WrapperCardL
    @Composable
    @JvmName("WrapperCardL")
    get() = CardStyle.builder(this)
        .invariantProps
        .dimensions {
            contentPaddingTop(0.0.dp)
            contentPaddingBottom(0.0.dp)
            contentPaddingStart(0.0.dp)
            contentPaddingEnd(0.0.dp)
            contentMinWidth(104.0.dp)
            contentMinHeight(104.0.dp)
            contentMaxWidth(104.0.dp)
            contentMaxHeight(104.0.dp)
        }
        .wrap(::WrapperCardL)

public val WrapperCardL.HasInnerPaddings: WrapperCardLHasInnerPaddings
    @Composable
    @JvmName("WrapperCardLHasInnerPaddings")
    get() = builder
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
        }
        .wrap(::WrapperCardLHasInnerPaddings)

public val Card.M: WrapperCardM
    @Composable
    @JvmName("WrapperCardM")
    get() = CardStyle.builder(this)
        .invariantProps
        .dimensions {
            contentPaddingTop(0.0.dp)
            contentPaddingBottom(0.0.dp)
            contentPaddingStart(0.0.dp)
            contentPaddingEnd(0.0.dp)
            contentMinWidth(104.0.dp)
            contentMinHeight(80.0.dp)
            contentMaxWidth(104.0.dp)
            contentMaxHeight(80.0.dp)
        }
        .wrap(::WrapperCardM)

public val WrapperCardM.HasInnerPaddings: WrapperCardMHasInnerPaddings
    @Composable
    @JvmName("WrapperCardMHasInnerPaddings")
    get() = builder
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
        }
        .wrap(::WrapperCardMHasInnerPaddings)

public val Card.S: WrapperCardS
    @Composable
    @JvmName("WrapperCardS")
    get() = CardStyle.builder(this)
        .invariantProps
        .dimensions {
            contentPaddingTop(0.0.dp)
            contentPaddingBottom(0.0.dp)
            contentPaddingStart(0.0.dp)
            contentPaddingEnd(0.0.dp)
            contentMinWidth(104.0.dp)
            contentMinHeight(56.0.dp)
            contentMaxWidth(104.0.dp)
            contentMaxHeight(56.0.dp)
        }
        .wrap(::WrapperCardS)

public val WrapperCardS.HasInnerPaddings: WrapperCardSHasInnerPaddings
    @Composable
    @JvmName("WrapperCardSHasInnerPaddings")
    get() = builder
        .dimensions {
            contentPaddingStart(12.0.dp)
            contentPaddingEnd(12.0.dp)
        }
        .wrap(::WrapperCardSHasInnerPaddings)
