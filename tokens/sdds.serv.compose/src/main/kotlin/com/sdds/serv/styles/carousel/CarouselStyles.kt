// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.carousel

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CarouselButtonsPlacement
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.CarouselStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.Pilled
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.serv.styles.paginationdots.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCarousel : BuilderWrapper<CarouselStyle, CarouselStyleBuilder>

/**
 * Обертка для вариации ButtonsPlacementInner
 */
@JvmInline
public value class WrapperCarouselButtonsPlacementInner(
    public override val builder: CarouselStyleBuilder,
) : WrapperCarousel

/**
 * Обертка для вариации ButtonsPlacementOuter
 */
@JvmInline
public value class WrapperCarouselButtonsPlacementOuter(
    public override val builder: CarouselStyleBuilder,
) : WrapperCarousel

private val CarouselStyleBuilder.invariantProps: CarouselStyleBuilder
    @Composable
    get() = this
        .prevButtonIcon(com.sdds.icons.R.drawable.ic_chevron_left_24)
        .nextButtonIcon(com.sdds.icons.R.drawable.ic_chevron_right_24)
        .indicatorStyle(PaginationDotsHorizontal.S.style())
        .prevButtonStyle(IconButton.S.Pilled.Secondary.style())
        .nextButtonStyle(IconButton.S.Pilled.Secondary.style())
        .dimensions {
            prevButtonPadding(12.0.dp)
            nextButtonPadding(12.0.dp)
            indicatorPadding(12.0.dp)
        }

public val Carousel.ButtonsPlacementInner: WrapperCarouselButtonsPlacementInner
    @Composable
    @JvmName("WrapperCarouselButtonsPlacementInner")
    get() = CarouselStyle.builder(this)
        .invariantProps
        .buttonsPlacement(CarouselButtonsPlacement.Inner)
        .prevButtonStyle(IconButton.S.Pilled.Secondary.style())
        .nextButtonStyle(IconButton.S.Pilled.Secondary.style())
        .wrap(::WrapperCarouselButtonsPlacementInner)

public val Carousel.ButtonsPlacementOuter: WrapperCarouselButtonsPlacementOuter
    @Composable
    @JvmName("WrapperCarouselButtonsPlacementOuter")
    get() = CarouselStyle.builder(this)
        .invariantProps
        .buttonsPlacement(CarouselButtonsPlacement.Outer)
        .prevButtonStyle(IconButton.S.Pilled.Clear.style())
        .nextButtonStyle(IconButton.S.Pilled.Clear.style())
        .wrap(::WrapperCarouselButtonsPlacementOuter)
