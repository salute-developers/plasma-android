// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.carousel

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.iconbutton.Clear
import com.sdds.compose.sandbox.styles.iconbutton.IconButton
import com.sdds.compose.sandbox.styles.iconbutton.Pilled
import com.sdds.compose.sandbox.styles.iconbutton.S
import com.sdds.compose.sandbox.styles.iconbutton.Secondary
import com.sdds.compose.sandbox.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.compose.sandbox.styles.paginationdots.S
import com.sdds.compose.uikit.CarouselButtonsPlacement
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.CarouselStyleBuilder
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
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
        .indicatorStyle(PaginationDotsHorizontal.S.style())
        .nextButtonStyle(IconButton.S.Pilled.Secondary.style())
        .prevButtonStyle(IconButton.S.Pilled.Secondary.style())
        .nextButtonIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_chevron_right_24))
        .prevButtonIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_chevron_left_24))
        .dimensions {
            nextButtonPadding(12.0.dp)
            prevButtonPadding(12.0.dp)
            indicatorPadding(12.0.dp)
        }

public val Carousel.ButtonsPlacementInner: WrapperCarouselButtonsPlacementInner
    @Composable
    @JvmName("WrapperCarouselButtonsPlacementInner")
    get() = CarouselStyle.builder(this)
        .invariantProps
        .nextButtonStyle(IconButton.S.Pilled.Secondary.style())
        .prevButtonStyle(IconButton.S.Pilled.Secondary.style())
        .buttonsPlacement(CarouselButtonsPlacement.Inner)
        .wrap(::WrapperCarouselButtonsPlacementInner)

public val Carousel.ButtonsPlacementOuter: WrapperCarouselButtonsPlacementOuter
    @Composable
    @JvmName("WrapperCarouselButtonsPlacementOuter")
    get() = CarouselStyle.builder(this)
        .invariantProps
        .nextButtonStyle(IconButton.S.Pilled.Clear.style())
        .prevButtonStyle(IconButton.S.Pilled.Clear.style())
        .buttonsPlacement(CarouselButtonsPlacement.Outer)
        .wrap(::WrapperCarouselButtonsPlacementOuter)
