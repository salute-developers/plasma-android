// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.card

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardClear
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.cardClearBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperCardClear : BuilderWrapper<CardStyle, CardStyleBuilder>

@JvmInline
public value class WrapperCardClearL(
    public override val builder: CardStyleBuilder,
) : WrapperCardClear

@JvmInline
public value class WrapperCardClearM(
    public override val builder: CardStyleBuilder,
) : WrapperCardClear

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
    get() = CardStyle.cardClearBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .contentShape(PlasmaSdServiceTheme.shapes.roundS)
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
    get() = CardStyle.cardClearBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .contentShape(PlasmaSdServiceTheme.shapes.roundXs)
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
    get() = CardStyle.cardClearBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .contentShape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensions {
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperCardClearS)
