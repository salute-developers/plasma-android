package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [CardStyle] для компонента [Card]
 */
val LocalCardStyle = compositionLocalOf { CardStyle.builder().style() }

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
     * Устанавливает ориентацию контента внутри Card
     * @see CardOrientation
     */
    fun orientation(orientation: CardOrientation): CardStyleBuilder

    /**
     * Устанавливает стиль текста [labelStyle]
     * @see CardStyle.labelStyle
     */
    fun labelStyle(labelStyle: TextStyle): CardStyleBuilder

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
     * Устанавливает внутренний отступ у контента вначале
     */
    fun contentPaddingStart(pStart: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ у контента вконце
     */
    fun contentPaddingEnd(pEnd: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ у контента сверху
     */
    fun contentPaddingTop(pTop: Dp): CardDimensionsBuilder

    /**
     * Устанавливает внутренний отступ у контента снизу
     */
    fun contentPaddingBottom(pBottom: Dp): CardDimensionsBuilder

    /**
     * Устанавливает минимальную ширину контента
     */
    fun contentMinWidth(minWidth: Dp): CardDimensionsBuilder

    /**
     * Устанавливает минимальную высоту контента
     */
    fun contentMinHeight(minHeight: Dp): CardDimensionsBuilder

    /**
     * Устанавливает отступ между content и label
     */
    fun mainAxisGap(gap: Dp): CardDimensionsBuilder

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
    override val contentMinWidth: Dp,
    override val contentMinHeight: Dp,
    override val mainAxisGap: Dp,
    override val contentPaddingStart: Dp,
    override val contentPaddingEnd: Dp,
    override val contentPaddingTop: Dp,
    override val contentPaddingBottom: Dp,
) : CardDimensions {
    class Builder : CardDimensionsBuilder {

        private var pStart: Dp? = null
        private var pEnd: Dp? = null
        private var pTop: Dp? = null
        private var pBottom: Dp? = null
        private var contentPStart: Dp? = null
        private var contentPEnd: Dp? = null
        private var contentPTop: Dp? = null
        private var contentPBottom: Dp? = null
        private var minWidth: Dp? = null
        private var minHeight: Dp? = null
        private var gap: Dp? = null

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

        override fun contentPaddingStart(pStart: Dp): CardDimensionsBuilder = apply {
            this.contentPStart = pStart
        }

        override fun contentPaddingEnd(pEnd: Dp): CardDimensionsBuilder = apply {
            this.contentPEnd = pEnd
        }

        override fun contentPaddingTop(pTop: Dp): CardDimensionsBuilder = apply {
            this.contentPTop = pTop
        }

        override fun contentPaddingBottom(pBottom: Dp): CardDimensionsBuilder = apply {
            this.contentPBottom = pBottom
        }

        override fun contentMinWidth(minWidth: Dp): CardDimensionsBuilder = apply {
            this.minWidth = minWidth
        }

        override fun contentMinHeight(minHeight: Dp): CardDimensionsBuilder = apply {
            this.minHeight = minHeight
        }

        override fun mainAxisGap(gap: Dp): CardDimensionsBuilder = apply {
            this.gap = gap
        }

        override fun build(): CardDimensions {
            return DefaultCardDimensions(
                paddingStart = pStart ?: 8.dp,
                paddingEnd = pEnd ?: 8.dp,
                paddingTop = pTop ?: 8.dp,
                paddingBottom = pBottom ?: 8.dp,
                contentPaddingStart = contentPStart ?: 8.dp,
                contentPaddingEnd = contentPEnd ?: 8.dp,
                contentPaddingTop = contentPTop ?: 8.dp,
                contentPaddingBottom = contentPBottom ?: 8.dp,
                contentMinWidth = minWidth ?: 0.dp,
                contentMinHeight = minHeight ?: 0.dp,
                mainAxisGap = gap ?: 0.dp,
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
    override val labelStyle: TextStyle,
    override val orientation: CardOrientation,
) : CardStyle

internal class DefaultCardStyleBuilderImpl(receiver: Any?) : CardStyleBuilder {
    private var colorsBuilder: CardColorsBuilder = CardColorsBuilder.builder()
    private var shape: CornerBasedShape? = null
    private var contentShape: CornerBasedShape? = null
    private var orientation: CardOrientation? = null
    private var labelStyle: TextStyle? = null
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

    override fun orientation(orientation: CardOrientation): CardStyleBuilder = apply {
        this.orientation = orientation
    }

    override fun labelStyle(labelStyle: TextStyle) = apply {
        this.labelStyle = labelStyle
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
            shape = shape ?: RoundedCornerShape(0),
            contentShape = contentShape ?: RoundedCornerShape(0),
            labelStyle = labelStyle ?: TextStyle.Default,
            dimensions = dimensionsBuilder.build(),
            orientation = orientation ?: CardOrientation.Vertical,
        )
    }
}
