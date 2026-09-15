package com.sdds.plasma.homeds.components.productcard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle

/**
 * CompositionLocal c [ProductCardStyle] для компонента [ProductCard]
 */
val LocalProductCardStyle =
    compositionLocalOf { ProductCardStyle.builder().style() }

/**
 * Стиль компонента [ProductCard]
 */
@Stable
interface ProductCardStyle : Style {

    /**
     * Стиль компонента [NumberPanel]
     * @see NumberPanelStyle
     */
    val numberPanelStyle: NumberPanelStyle

    /**
     * Стиль компонента [Card]
     * @see CardStyle
     */
    val cardStyle: CardStyle

    /**
     * Размеры и отступы
     * @see ProductCardDimensions
     */
    val dimensions: ProductCardDimensions

    companion object {

        /**
         * Возвращает экземпляр [ProductCardStyleBuilder]
         */
        fun builder(receiver: Any? = null): ProductCardStyleBuilder = DefaultProductCardStyle.Builder()
    }
}

/**
 * Размеры и отступы
 */
@Immutable
interface ProductCardDimensions {

    /**
     * Отступ контента от края в начале
     */
    val paddingStart: StatefulValue<Dp>

    /**
     * Отступ контента от края в конце
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Отступ контента от верхнего края
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Отступ контента от нижнего края
     */
    val paddingBottom: StatefulValue<Dp>
}

/**
 * Builder для [ProductCardDimensions]
 */
interface ProductCardDimensionsBuilder {

    /**
     * Устанавливает отступ контента от верхнего края
     */
    fun paddingTop(pTop: Dp): ProductCardDimensionsBuilder =
        paddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента от верхнего края
     */
    fun paddingTop(pTop: StatefulValue<Dp>): ProductCardDimensionsBuilder

    /**
     * Устанавливает отступ контента от края в начале
     */
    fun paddingStart(pStart: Dp): ProductCardDimensionsBuilder =
        paddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента от края в начале
     */
    fun paddingStart(pStart: StatefulValue<Dp>): ProductCardDimensionsBuilder

    /**
     * Устанавливает отступ контента от края в конце
     */
    fun paddingEnd(pEnd: Dp): ProductCardDimensionsBuilder =
        paddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента от края в конце
     */
    fun paddingEnd(pEnd: StatefulValue<Dp>): ProductCardDimensionsBuilder

    /**
     * Устанавливает отступ контента от нижнего края
     */
    fun paddingBottom(pBottom: Dp): ProductCardDimensionsBuilder =
        paddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента от нижнего края
     */
    fun paddingBottom(pBottom: StatefulValue<Dp>): ProductCardDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [ProductCardDimensions]
     */
    fun build(): ProductCardDimensions

    companion object {
        /**
         * Возвращает экземпляр [ ProductCardDimensionsBuilder]
         */
        fun builder(): ProductCardDimensionsBuilder = DefaultProductCardDimensions.Builder()
    }
}

@Immutable
private class DefaultProductCardDimensions(
    override val paddingTop: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,

) : ProductCardDimensions {
    class Builder : ProductCardDimensionsBuilder {
        private var pTop: StatefulValue<Dp>? = null
        private var pStart: StatefulValue<Dp>? = null
        private var pEnd: StatefulValue<Dp>? = null
        private var pBottom: StatefulValue<Dp>? = null

        override fun paddingTop(pTop: StatefulValue<Dp>): ProductCardDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingStart(pStart: StatefulValue<Dp>): ProductCardDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: StatefulValue<Dp>): ProductCardDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingBottom(pBottom: StatefulValue<Dp>): ProductCardDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): ProductCardDimensions {
            return DefaultProductCardDimensions(
                paddingTop = pTop ?: 0.dp.asStatefulValue(),
                paddingStart = pStart ?: 0.dp.asStatefulValue(),
                paddingEnd = pEnd ?: 0.dp.asStatefulValue(),
                paddingBottom = pBottom ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

/**
 * Builder стиля [ProductCard].
 */
@Stable
interface ProductCardStyleBuilder : StyleBuilder<ProductCardStyle> {

    /**
     * Устанавливает стиль компонента [NumberPanel]
     */
    fun numberPanelStyle(numberPanelStyle: NumberPanelStyle): ProductCardStyleBuilder

    /**
     * Устанавливает стиль компонента [Card]
     */
    fun cardStyle(cardStyle: CardStyle): ProductCardStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable ProductCardDimensionsBuilder.() -> Unit): ProductCardStyleBuilder
}

@Immutable
internal class DefaultProductCardStyle(
    override val numberPanelStyle: NumberPanelStyle,
    override val cardStyle: CardStyle,
    override val dimensions: ProductCardDimensions,

) : ProductCardStyle {
    @Stable
    class Builder : ProductCardStyleBuilder {

        private var numberPanelStyle: NumberPanelStyle? = null
        private var cardStyle: CardStyle? = null
        private var dimensionsBuilder: ProductCardDimensionsBuilder = ProductCardDimensionsBuilder.builder()

        override fun numberPanelStyle(numberPanelStyle: NumberPanelStyle): ProductCardStyleBuilder = apply {
            this.numberPanelStyle = numberPanelStyle
        }

        override fun cardStyle(cardStyle: CardStyle): ProductCardStyleBuilder = apply {
            this.cardStyle = cardStyle
        }

        @Composable
        override fun dimensions(
            builder: @Composable (ProductCardDimensionsBuilder.() -> Unit),
        ): ProductCardStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun style(): ProductCardStyle {
            return DefaultProductCardStyle(
                numberPanelStyle = numberPanelStyle ?: NumberPanelStyle.builder().style(),
                cardStyle = cardStyle ?: CardStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}
