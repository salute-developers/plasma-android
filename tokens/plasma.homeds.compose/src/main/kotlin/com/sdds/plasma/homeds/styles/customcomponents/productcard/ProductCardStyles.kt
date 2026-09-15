@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.customcomponents.productcard

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.components.productcard.ProductCardStyle
import com.sdds.plasma.homeds.components.productcard.ProductCardStyleBuilder
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
public interface WrapperProductCard : BuilderWrapper<ProductCardStyle, ProductCardStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperProductCardL(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации MHasInnerPaddings
 */
@JvmInline
public value class WrapperProductCardM(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации LHasInnerPaddings
 */
@JvmInline
public value class WrapperProductCardLHasInnerPaddings(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperProductCardMHasInnerPaddings(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации LHumidity
 */
@JvmInline
public value class WrapperProductCardLHumidity(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации MHumidity
 */
@JvmInline
public value class WrapperProductCardMHumidity(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации LHumidityHasInnerPaddings
 */
@JvmInline
public value class WrapperProductCardLHumidityHasInnerPaddings(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

/**
 * Обертка для вариации MHumidityHasInnerPaddings
 */
@JvmInline
public value class WrapperProductCardMHumidityHasInnerPaddings(
    public override val builder: ProductCardStyleBuilder,
) : WrapperProductCard

public val ProductCard.L: WrapperProductCardL
    @Composable
    @JvmName("WrapperProductCardL")
    get() = ProductCardStyle.builder(this)
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperProductCardL)

public val ProductCard.M: WrapperProductCardM
    @Composable
    @JvmName("WrapperProductCardM")
    get() = ProductCardStyle.builder(this)
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperProductCardM)

public val WrapperProductCardL.HasInnerPaddings: WrapperProductCardLHasInnerPaddings
    @Composable
    @JvmName("WrapperProductCardLHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperProductCardLHasInnerPaddings)

public val WrapperProductCardM.HasInnerPaddings: WrapperProductCardMHasInnerPaddings
    @Composable
    @JvmName("WrapperProductCardMHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.style())
        .wrap(::WrapperProductCardMHasInnerPaddings)

public val WrapperProductCardL.Humidity: WrapperProductCardLHumidity
    @Composable
    @JvmName("WrapperProductCardLHumidity")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperProductCardLHumidity)

public val WrapperProductCardM.Humidity: WrapperProductCardMHumidity
    @Composable
    @JvmName("WrapperProductCardMHumidity")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperProductCardMHumidity)

public val WrapperProductCardLHumidity.HasInnerPaddings: WrapperProductCardLHumidityHasInnerPaddings
    @Composable
    @JvmName("WrapperProductCardLHumidityHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(17.dp)
        }
        .cardStyle(Card.L.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperProductCardLHumidityHasInnerPaddings)

public val WrapperProductCardMHumidity.HasInnerPaddings: WrapperProductCardMHumidityHasInnerPaddings
    @Composable
    @JvmName("WrapperProductCardMHumidityHasInnerPaddings")
    get() = builder
        .dimensions {
            paddingTop(28.dp)
        }
        .cardStyle(Card.M.HasInnerPaddings.style())
        .numberPanelStyle(NumberPanel.Xs.Humidity.style())
        .wrap(::WrapperProductCardMHumidityHasInnerPaddings)
