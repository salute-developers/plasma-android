// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.carousel

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.CarouselStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Carousel
 */
public enum class CarouselStyles(
    public val key: String,
) {
    CarouselButtonsPlacementInner("Carousel.ButtonsPlacementInner"),
    CarouselButtonsPlacementOuter("Carousel.ButtonsPlacementOuter"),
    ;

    /**
     * Typed API для подбора стиля carousel
     */
    public companion object
}

/**
 * Возможные значения свойства buttons-placement для carousel
 */
public enum class CarouselButtonsPlacement {
    Inner,
    Outer,
}

/**
 * Возвращает [CarouselStyle] для [CarouselStyles]
 */
@Composable
public fun CarouselStyles.style(modify: @Composable CarouselStyleBuilder.() -> Unit = {}): CarouselStyle {
    val builder = when (this) {
        CarouselStyles.CarouselButtonsPlacementInner -> Carousel.ButtonsPlacementInner
        CarouselStyles.CarouselButtonsPlacementOuter -> Carousel.ButtonsPlacementOuter
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CarouselStyles] для carousel
 */
public fun CarouselStyles.Companion.resolve(
    buttonsPlacement: CarouselButtonsPlacement =
        CarouselButtonsPlacement.Inner,
): CarouselStyles = when {
    buttonsPlacement == CarouselButtonsPlacement.Inner ->
        CarouselStyles.CarouselButtonsPlacementInner
    buttonsPlacement == CarouselButtonsPlacement.Outer ->
        CarouselStyles.CarouselButtonsPlacementOuter
    else -> error("Unsupported carousel style combination")
}

/**
 * Возвращает [CarouselStyle] для carousel
 */
@Composable
public fun CarouselStyles.Companion.style(
    buttonsPlacement: CarouselButtonsPlacement =
        CarouselButtonsPlacement.Inner,
    modify: @Composable CarouselStyleBuilder.() -> Unit = {},
): CarouselStyle = resolve(buttonsPlacement).style(modify)
