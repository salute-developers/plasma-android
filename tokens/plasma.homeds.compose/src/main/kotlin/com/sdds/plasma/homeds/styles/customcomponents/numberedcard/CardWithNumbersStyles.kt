@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.customcomponents.numberedcard

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.components.numberedcard.CardWithNumbersStyle
import com.sdds.plasma.homeds.components.numberedcard.CardWithNumbersStyleBuilder
import com.sdds.plasma.homeds.styles.card.Card
import com.sdds.plasma.homeds.styles.card.HasInnerPaddings
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.card.M
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Xs

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCardWithNumbers : BuilderWrapper<CardWithNumbersStyle, CardWithNumbersStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCardWithNumbersL(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации MHasInnerPaddings
 */
@JvmInline
public value class WrapperCardWithNumbersM(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации LHasInnerPaddings
 */
@JvmInline
public value class WrapperCardWithNumbersLHasInnerPaddings(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCardWithNumbersMHasInnerPaddings(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации LHumidity
 */
@JvmInline
public value class WrapperCardWithNumbersLHumidity(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации MHumidity
 */
@JvmInline
public value class WrapperCardWithNumbersMHumidity(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации LHumidityHasInnerPaddings
 */
@JvmInline
public value class WrapperCardWithNumbersLHumidityHasInnerPaddings(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

/**
 * Обертка для вариации MHumidityHasInnerPaddings
 */
@JvmInline
public value class WrapperCardWithNumbersMHumidityHasInnerPaddings(
    public override val builder: CardWithNumbersStyleBuilder,
) : WrapperCardWithNumbers

public val CardWithNumbers.L: WrapperCardWithNumbersL
    @Composable
    @JvmName("WrapperCardWithNumbersL")
    get() = CardWithNumbersStyle.builder(this)
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperCardWithNumbersL)

public val CardWithNumbers.M: WrapperCardWithNumbersM
    @Composable
    @JvmName("WrapperCardWithNumbersM")
    get() = CardWithNumbersStyle.builder(this)
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperCardWithNumbersM)

public val WrapperCardWithNumbersL.HasInnerPaddings: WrapperCardWithNumbersLHasInnerPaddings
    @Composable
    @JvmName("WrapperCardWithNumbersLHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperCardWithNumbersLHasInnerPaddings)

public val WrapperCardWithNumbersM.HasInnerPaddings: WrapperCardWithNumbersMHasInnerPaddings
    @Composable
    @JvmName("WrapperCardWithNumbersMHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperCardWithNumbersMHasInnerPaddings)

public val WrapperCardWithNumbersL.Humidity: WrapperCardWithNumbersLHumidity
    @Composable
    @JvmName("WrapperCardWithNumbersLHumidity")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperCardWithNumbersLHumidity)

public val WrapperCardWithNumbersM.Humidity: WrapperCardWithNumbersMHumidity
    @Composable
    @JvmName("WrapperCardWithNumbersMHumidity")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperCardWithNumbersMHumidity)

public val WrapperCardWithNumbersLHumidity.HasInnerPaddings: WrapperCardWithNumbersLHumidityHasInnerPaddings
    @Composable
    @JvmName("WrapperCardWithNumbersLHumidityHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperCardWithNumbersLHumidityHasInnerPaddings)

public val WrapperCardWithNumbersMHumidity.HasInnerPaddings: WrapperCardWithNumbersMHumidityHasInnerPaddings
    @Composable
    @JvmName("WrapperCardWithNumbersMHumidityHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperCardWithNumbersMHumidityHasInnerPaddings)
