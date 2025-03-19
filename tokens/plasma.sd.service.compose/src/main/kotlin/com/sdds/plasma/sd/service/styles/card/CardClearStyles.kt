// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.card

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.cardBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCardClear : BuilderWrapper<CardStyle, CardStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCardClearL(
    public override val builder: CardStyleBuilder,
) : WrapperCardClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCardClearM(
    public override val builder: CardStyleBuilder,
) : WrapperCardClear

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCardClearS(
    public override val builder: CardStyleBuilder,
) : WrapperCardClear

private val CardStyleBuilder.invariantProps: CardStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val CardClear.L: WrapperCardClearL
    @Composable
    @JvmName("WrapperCardClearL")
    get() = CardStyle.cardBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .contentShape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions {
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperCardClearL)

public val CardClear.M: WrapperCardClearM
    @Composable
    @JvmName("WrapperCardClearM")
    get() = CardStyle.cardBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .contentShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperCardClearM)

public val CardClear.S: WrapperCardClearS
    @Composable
    @JvmName("WrapperCardClearS")
    get() = CardStyle.cardBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .contentShape(PlasmaSdServiceTheme.shapes.roundM)
        .dimensions {
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperCardClearS)
