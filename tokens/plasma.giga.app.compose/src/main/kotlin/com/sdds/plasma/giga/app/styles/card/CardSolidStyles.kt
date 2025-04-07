// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.card

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.CardStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCardSolid : BuilderWrapper<CardStyle, CardStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCardSolidL(
    public override val builder: CardStyleBuilder,
) : WrapperCardSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCardSolidM(
    public override val builder: CardStyleBuilder,
) : WrapperCardSolid

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCardSolidS(
    public override val builder: CardStyleBuilder,
) : WrapperCardSolid

private val CardStyleBuilder.invariantProps: CardStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }

public val CardSolid.L: WrapperCardSolidL
    @Composable
    @JvmName("WrapperCardSolidL")
    get() = CardStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundL)
        .contentShape(PlasmaGigaAppTheme.shapes.roundS)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperCardSolidL)

public val CardSolid.M: WrapperCardSolidM
    @Composable
    @JvmName("WrapperCardSolidM")
    get() = CardStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .contentShape(PlasmaGigaAppTheme.shapes.roundXs)
        .dimensions {
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperCardSolidM)

public val CardSolid.S: WrapperCardSolidS
    @Composable
    @JvmName("WrapperCardSolidS")
    get() = CardStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundM)
        .contentShape(PlasmaGigaAppTheme.shapes.roundXs)
        .dimensions {
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperCardSolidS)
