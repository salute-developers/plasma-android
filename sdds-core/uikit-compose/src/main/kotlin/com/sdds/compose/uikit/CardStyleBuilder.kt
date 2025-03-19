package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [CardStyle] для компонента [Card]
 */
val LocalCardStyle = compositionLocalOf { CardStyle.cardBuilder().style() }

/**
 * Возвращает экземпляр [CardStyleBuilder]
 */
fun CardStyle.Companion.cardBuilder(receiver: Any? = null): CardStyleBuilder =
    DefaultCardStyleBuilderImpl(receiver)

/**
 * Builder стиля [CardStyle]
 */
interface CardStyleBuilder : StyleBuilder<CardStyle> {

    /**
     * Устанавливает цвета компонента [colors]
     */
    @Composable
    fun colors(builder: @Composable CardColorsBuilder.() -> Unit): CardStyleBuilder

    /**
     * Устанавливает форму компонента [shape]
     * @see CardStyle.shape
     */
    fun shape(shape: CornerBasedShape): CardStyleBuilder

    /**
     * Устанавливает форму контента внутри Card [shape]
     * @see CardStyle.contentShape
     */
    fun contentShape(contentShape: CornerBasedShape): CardStyleBuilder

    /**
     * Устанавливает отступы внутри компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable CardDimensionsBuilder.() -> Unit): CardStyleBuilder
}

/**
 * Builder для [CardColors]
 */
interface CardColorsBuilder {

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see CardColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): CardColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see CardColorsBuilder.backgroundColor
     * @see CardColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): CardColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [CardColors]
     */
    fun build(): CardColors

    companion object {
        /**
         * Возвращает экземпляр [CardColorsBuilder]
         */
        fun builder(): CardColorsBuilder = DefaultCardColors.Builder()
    }
}

/**
 * Builder для [CardDimensions]
 */
interface CardDimensionsBuilder {

    /**
     * Устанавливает внутренний отступ вначале
     */
    fun paddingStart(pStart: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ вконце
     */
    fun paddingEnd(pEnd: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху
     */
    fun paddingTop(pTop: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу
     */
    fun paddingBottom(pBottom: Dp): CardDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [CardDimensions]
     */
    fun build(): CardDimensions

    companion object {
        /**
         * Возвращает экземпляр [CardDimensionsBuilder]
         */
        fun builder(): CardDimensionsBuilder = DefaultCardDimensions.Builder()
    }
}

@Immutable
private class DefaultCardDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
) : CardDimensions {
    class Builder : CardDimensionsBuilder {

        private var pStart: Dp? = null
        private var pEnd: Dp? = null
        private var pTop: Dp? = null
        private var pBottom: Dp? = null

        override fun paddingStart(pStart: Dp): CardDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: Dp): CardDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingTop(pTop: Dp): CardDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingBottom(pBottom: Dp): CardDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        override fun build(): CardDimensions {
            return DefaultCardDimensions(
                paddingStart = pStart ?: 8.dp,
                paddingEnd = pEnd ?: 8.dp,
                paddingTop = pTop ?: 8.dp,
                paddingBottom = pBottom ?: 8.dp,
            )
        }
    }
}

@Immutable
private class DefaultCardColors(
    override val backgroundColor: InteractiveColor,
) : CardColors {
    class Builder : CardColorsBuilder {
        private var backgroundColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): CardColorsBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): CardColors {
            return DefaultCardColors(
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
            )
        }
    }
}

@Immutable
private class DefaultCardStyle(
    override val colors: CardColors,
    override val shape: CornerBasedShape,
    override val contentShape: CornerBasedShape,
    override val dimensions: CardDimensions,
) : CardStyle

private class DefaultCardStyleBuilderImpl(receiver: Any?) : CardStyleBuilder {
    private var colorsBuilder: CardColorsBuilder = CardColorsBuilder.builder()
    private var shape: CornerBasedShape? = null
    private var contentShape: CornerBasedShape? = null
    private var dimensionsBuilder: CardDimensionsBuilder = CardDimensionsBuilder.builder()

    @Composable
    override fun colors(
        builder:
        @Composable()
        (CardColorsBuilder.() -> Unit),
    ): CardStyleBuilder = apply {
        this.colorsBuilder.builder()
    }

    override fun shape(shape: CornerBasedShape): CardStyleBuilder = apply {
        this.shape = shape
    }

    override fun contentShape(contentShape: CornerBasedShape): CardStyleBuilder = apply {
        this.contentShape = contentShape
    }

    @Composable
    override fun dimensions(
        builder:
        @Composable()
        (CardDimensionsBuilder.() -> Unit),
    ): CardStyleBuilder = apply {
        this.dimensionsBuilder.builder()
    }

    override fun style(): CardStyle {
        return DefaultCardStyle(
            colors = colorsBuilder.build(),
            shape = shape ?: RoundedCornerShape(25),
            contentShape = contentShape ?: RoundedCornerShape(25),
            dimensions = dimensionsBuilder.build(),
        )
    }
}
