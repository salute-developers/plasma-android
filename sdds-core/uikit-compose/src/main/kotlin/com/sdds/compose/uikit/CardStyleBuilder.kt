package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal с [CardStyle] для компонента [Card]
 */
val LocalCardStyle = compositionLocalOf { CardStyle.builder().style() }

/**
 * Builder стиля [CardStyle]
 */
@ApiInfo
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
     * Устанавливает стиль текста [titleStyle]
     * @see CardStyle.titleStyle
     */
    fun titleStyle(titleStyle: TextStyle): CardStyleBuilder

    /**
     * Устанавливает стили текста [CardStyle.subtitleStyles]
     * @see CardStyle.subtitleStyles
     */
    fun subtitleStyle(subtitleStyle: TextStyle): CardStyleBuilder =
        subtitleStyle(subtitleStyle.asStatefulValue())

    /**
     * Устанавливает стили текста [CardStyle.subtitleStyles]
     * @see CardStyle.subtitleStyles
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): CardStyleBuilder

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
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: Color): CardColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: InteractiveColor): CardColorsBuilder

    /**
     * Устанавливает цвет title
     */
    fun titleColor(titleColor: Color): CardColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет title
     */
    fun titleColor(titleColor: InteractiveColor): CardColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает кисть title
     */
    fun titleColor(titleBrush: Brush): CardColorsBuilder =
        titleColor(titleBrush.asStatefulValue())

    /**
     * Устанавливает кисть title
     */
    fun titleColor(titleBrush: StatefulValue<Brush>): CardColorsBuilder

    /**
     * Устанавливает цвет subtitle
     */
    fun subtitleColor(subtitleColor: Color): CardColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает цвет subtitle
     */
    fun subtitleColor(subtitleColor: InteractiveColor): CardColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает цвет subtitle
     */
    fun subtitleColor(subtitleBrush: StatefulValue<Brush>): CardColorsBuilder

    /**
     * Устанавливает кисть subtitle
     */
    fun subtitleColor(subtitleBrush: Brush): CardColorsBuilder =
        subtitleColor(subtitleBrush.asStatefulValue())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see CardColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): CardColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see CardColorsBuilder.backgroundColor
     * @see CardColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): CardColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть [CardColors.backgroundBrush] фона компонента.
     */
    fun backgroundColor(backgroundBrush: Brush): CardColorsBuilder =
        backgroundColor(backgroundBrush.asStatefulValue())

    /**
     * Устанавливает кисть [CardColors.backgroundBrush] фона компонента.
     */
    fun backgroundColor(backgroundBrush: StatefulValue<Brush>): CardColorsBuilder

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
     * Устанавливает максимальную ширину контента
     */
    fun contentMaxWidth(maxWidth: Dp): CardDimensionsBuilder

    /**
     * Устанавливает максимальную высоту контента
     */
    fun contentMaxHeight(maxHeight: Dp): CardDimensionsBuilder

    /**
     * Устанавливает отступ между content и label
     */
    fun mainAxisGap(gap: Dp): CardDimensionsBuilder

    /**
     * Устанавливает отступ между title и subtitle
     */
    fun subtitleGap(gap: Dp): CardDimensionsBuilder =
        subtitleGap(gap.asStatefulValue())

    /**
     * Устанавливает отступ между title и subtitle
     */
    fun subtitleGap(gap: StatefulValue<Dp>): CardDimensionsBuilder

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
    override val contentMaxWidth: Dp,
    override val contentMaxHeight: Dp,
    override val mainAxisGap: Dp,
    override val contentPaddingStart: Dp,
    override val contentPaddingEnd: Dp,
    override val contentPaddingTop: Dp,
    override val contentPaddingBottom: Dp,
    override val subtitleGap: StatefulValue<Dp>,
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
        private var maxWidth: Dp? = null
        private var maxHeight: Dp? = null
        private var gap: Dp? = null
        private var subtitleGap: StatefulValue<Dp>? = null

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

        override fun contentMaxWidth(maxWidth: Dp): CardDimensionsBuilder = apply {
            this.maxWidth = maxWidth
        }

        override fun contentMaxHeight(maxHeight: Dp): CardDimensionsBuilder = apply {
            this.maxHeight = maxHeight
        }

        override fun mainAxisGap(gap: Dp): CardDimensionsBuilder = apply {
            this.gap = gap
        }

        override fun subtitleGap(gap: StatefulValue<Dp>): CardDimensionsBuilder = apply {
            this.subtitleGap = gap
        }

        @Suppress("CyclomaticComplexMethod")
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
                contentMaxWidth = maxWidth ?: Dp.Unspecified,
                contentMaxHeight = maxHeight ?: Dp.Unspecified,
                mainAxisGap = gap ?: 0.dp,
                subtitleGap = subtitleGap ?: 0.dp.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultCardColors(
    @Suppress("OVERRIDE_DEPRECATION")
    override val backgroundColor: InteractiveColor,
    override val backgroundBrush: StatefulValue<Brush>,
    override val titleColor: StatefulValue<Brush>,
    override val subtitleBrush: StatefulValue<Brush>,
    override val labelColor: InteractiveColor,
) : CardColors {
    class Builder : CardColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var titleColor: StatefulValue<Brush>? = null
        private var subtitleBrush: StatefulValue<Brush>? = null

        override fun labelColor(labelColor: InteractiveColor): CardColorsBuilder = apply {
            this.labelColor = labelColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor): CardColorsBuilder = apply {
            this.backgroundColor = backgroundColor
            this.backgroundBrush = backgroundColor.asStatefulBrush()
        }

        override fun titleColor(titleBrush: StatefulValue<Brush>): CardColorsBuilder = apply {
            this.titleColor = titleBrush
        }

        override fun subtitleColor(subtitleBrush: StatefulValue<Brush>): CardColorsBuilder = apply {
            this.subtitleBrush = subtitleBrush
        }

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>): CardColorsBuilder = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun build(): CardColors {
            val defaultBackgroundColor = Color.Transparent.asInteractive()
            val defaultLabelColor = Color.Black.asInteractive()
            return DefaultCardColors(
                backgroundColor = backgroundColor ?: defaultBackgroundColor,
                backgroundBrush = backgroundBrush ?: backgroundColor?.asStatefulBrush()
                    ?: defaultBackgroundColor.asStatefulBrush(),
                titleColor = titleColor ?: labelColor?.asStatefulBrush() ?: defaultLabelColor.asStatefulBrush(),
                subtitleBrush = subtitleBrush ?: Color.Black.asStatefulBrush(),
                labelColor = labelColor ?: defaultLabelColor,
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
    @Suppress("OVERRIDE_DEPRECATION")
    override val labelStyle: TextStyle,
    override val titleStyle: TextStyle,
    override val subtitleStyles: StatefulValue<TextStyle>,
    override val orientation: CardOrientation,
) : CardStyle

internal class DefaultCardStyleBuilderImpl(receiver: Any?) : CardStyleBuilder {
    private var colorsBuilder: CardColorsBuilder = CardColorsBuilder.builder()
    private var shape: CornerBasedShape? = null
    private var contentShape: CornerBasedShape? = null
    private var orientation: CardOrientation? = null
    private var labelStyle: TextStyle? = null
    private var titleStyle: TextStyle? = null
    private var subtitleStyle: StatefulValue<TextStyle>? = null
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
        this.titleStyle = labelStyle
    }

    override fun titleStyle(titleStyle: TextStyle) = apply {
        this.titleStyle = titleStyle
    }

    override fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>) = apply {
        this.subtitleStyle = subtitleStyle
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
            titleStyle = titleStyle ?: labelStyle ?: TextStyle.Default,
            subtitleStyles = subtitleStyle ?: TextStyle.Default.asStatefulValue(),
            dimensions = dimensionsBuilder.build(),
            orientation = orientation ?: CardOrientation.Vertical,
        )
    }
}
