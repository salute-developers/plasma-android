package com.sdds.plasma.homeds.components.numberedcard

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
 * CompositionLocal c [CardWithNumbersStyle] для компонента [CardWithNumbers]
 */
val LocalCardWithNumbersStyle =
    compositionLocalOf { CardWithNumbersStyle.builder().style() }

/**
 * Стиль компонента [CardWithNumbers]
 */
@Stable
interface CardWithNumbersStyle : Style {

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
     * @see CardWithNumbersDimensions
     */
    val dimensions: CardWithNumbersDimensions

    companion object {

        /**
         * Возвращает экземпляр [CardWithNumbersStyleBuilder]
         */
        fun builder(receiver: Any? = null): CardWithNumbersStyleBuilder = DefaultCardWithNumbersStyle.Builder()
    }
}

/**
 * Размеры и отступы
 */
@Immutable
interface CardWithNumbersDimensions {

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
 * Builder для [CardWithNumbersDimensions]
 */
interface CardWithNumbersDimensionsBuilder {

    /**
     * Устанавливает отступ контента от верхнего края
     */
    fun paddingTop(pTop: Dp): CardWithNumbersDimensionsBuilder =
        paddingTop(pTop.asStatefulValue())

    /**
     * Устанавливает отступ контента от верхнего края
     */
    fun paddingTop(pTop: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder

    /**
     * Устанавливает отступ контента от края в начале
     */
    fun paddingStart(pStart: Dp): CardWithNumbersDimensionsBuilder =
        paddingStart(pStart.asStatefulValue())

    /**
     * Устанавливает отступ контента от края в начале
     */
    fun paddingStart(pStart: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder

    /**
     * Устанавливает отступ контента от края в конце
     */
    fun paddingEnd(pEnd: Dp): CardWithNumbersDimensionsBuilder =
        paddingEnd(pEnd.asStatefulValue())

    /**
     * Устанавливает отступ контента от края в конце
     */
    fun paddingEnd(pEnd: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder

    /**
     * Устанавливает отступ контента от нижнего края
     */
    fun paddingBottom(pBottom: Dp): CardWithNumbersDimensionsBuilder =
        paddingBottom(pBottom.asStatefulValue())

    /**
     * Устанавливает отступ контента от нижнего края
     */
    fun paddingBottom(pBottom: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [CardWithNumbersDimensions]
     */
    fun build(): CardWithNumbersDimensions

    companion object {
        /**
         * Возвращает экземпляр [ CardWithNumbersDimensionsBuilder]
         */
        fun builder(): CardWithNumbersDimensionsBuilder = DefaultCardWithNumbersDimensions.Builder()
    }
}

@Immutable
private class DefaultCardWithNumbersDimensions(
    override val paddingTop: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,

) : CardWithNumbersDimensions {
    class Builder : CardWithNumbersDimensionsBuilder {
        private var pTop: StatefulValue<Dp>? = null
        private var pStart: StatefulValue<Dp>? = null
        private var pEnd: StatefulValue<Dp>? = null
        private var pBottom: StatefulValue<Dp>? = null

        override fun paddingTop(pTop: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingStart(pStart: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingBottom(pBottom: StatefulValue<Dp>): CardWithNumbersDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): CardWithNumbersDimensions {
            return DefaultCardWithNumbersDimensions(
                paddingTop = pTop ?: 0.dp.asStatefulValue(),
                paddingStart = pStart ?: 0.dp.asStatefulValue(),
                paddingEnd = pEnd ?: 0.dp.asStatefulValue(),
                paddingBottom = pBottom ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

/**
 * Builder стиля [CardWithNumbers].
 */
@Stable
interface CardWithNumbersStyleBuilder : StyleBuilder<CardWithNumbersStyle> {

    /**
     * Устанавливает стиль компонента [NumberPanel]
     */
    fun numberPanelStyle(numberPanelStyle: NumberPanelStyle): CardWithNumbersStyleBuilder

    /**
     * Устанавливает стиль компонента [Card]
     */
    fun cardStyle(cardStyle: CardStyle): CardWithNumbersStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable CardWithNumbersDimensionsBuilder.() -> Unit): CardWithNumbersStyleBuilder
}

@Immutable
internal class DefaultCardWithNumbersStyle(
    override val numberPanelStyle: NumberPanelStyle,
    override val cardStyle: CardStyle,
    override val dimensions: CardWithNumbersDimensions,

) : CardWithNumbersStyle {
    @Stable
    class Builder : CardWithNumbersStyleBuilder {

        private var numberPanelStyle: NumberPanelStyle? = null
        private var cardStyle: CardStyle? = null
        private var dimensionsBuilder: CardWithNumbersDimensionsBuilder = CardWithNumbersDimensionsBuilder.builder()

        override fun numberPanelStyle(numberPanelStyle: NumberPanelStyle): CardWithNumbersStyleBuilder = apply {
            this.numberPanelStyle = numberPanelStyle
        }

        override fun cardStyle(cardStyle: CardStyle): CardWithNumbersStyleBuilder = apply {
            this.cardStyle = cardStyle
        }

        @Composable
        override fun dimensions(
            builder: @Composable (CardWithNumbersDimensionsBuilder.() -> Unit),
        ): CardWithNumbersStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun style(): CardWithNumbersStyle {
            return DefaultCardWithNumbersStyle(
                numberPanelStyle = numberPanelStyle ?: NumberPanelStyle.builder().style(),
                cardStyle = cardStyle ?: CardStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}
