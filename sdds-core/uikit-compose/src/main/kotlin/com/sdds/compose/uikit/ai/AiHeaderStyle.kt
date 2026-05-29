package com.sdds.compose.uikit.ai

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AiHeaderStyle] для компонента [AiHeader]
 */
val LocalAiHeaderStyle = compositionLocalOf { AiHeaderStyle.builder().style() }

/**
 * Стиль компонента [AiHeader]
 */
@Stable
interface AiHeaderStyle : Style {

    /**
     * Форма компонента
     */
    val shape: StatefulValue<Shape>

    /**
     * Стили заголовка
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стили подзаголовка
     */
    val subtitleStyles: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     */
    val colors: AiHeaderColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: AiHeaderDimensions

    /**
     * Стиль кнопки слева
     */
    val startButtonStyle: ButtonStyle

    /**
     * Стиль кнопки справа
     */
    val endButtonStyle: ButtonStyle

    companion object {
        /**
         * Возвращает экземпляр [AiHeaderStyleBuilder]
         */
        fun builder(receiver: Any? = null): AiHeaderStyleBuilder = DefaultAiHeaderStyle.Builder()
    }
}

/**
 * Билдер стиля [AiHeaderStyle]
 */
interface AiHeaderStyleBuilder : StyleBuilder<AiHeaderStyle> {

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: StatefulValue<Shape>): AiHeaderStyleBuilder

    /**
     * Устанавливает форму компонента
     */
    fun shape(shape: Shape): AiHeaderStyleBuilder = shape(shape.asStatefulValue())

    /**
     * Устанавливает стиль заголовка
     */
    fun titleStyle(titleStyle: TextStyle): AiHeaderStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стили заголовка
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): AiHeaderStyleBuilder

    /**
     * Устанавливает стиль подзаголовка
     */
    fun subtitleStyle(subtitleStyle: TextStyle): AiHeaderStyleBuilder =
        subtitleStyle(subtitleStyle.asStatefulValue())

    /**
     * Устанавливает стили подзаголовка
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): AiHeaderStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable AiHeaderColorsBuilder.() -> Unit): AiHeaderStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable AiHeaderDimensionsBuilder.() -> Unit): AiHeaderStyleBuilder

    /**
     * Устанавливает стиль кнопки слева
     */
    fun startButtonStyle(startButtonStyle: ButtonStyle): AiHeaderStyleBuilder

    /**
     * Устанавливает стиль кнопки справа
     */
    fun endButtonStyle(endButtonStyle: ButtonStyle): AiHeaderStyleBuilder
}

@Immutable
private data class DefaultAiHeaderStyle(
    override val shape: StatefulValue<Shape>,
    override val titleStyles: StatefulValue<TextStyle>,
    override val subtitleStyles: StatefulValue<TextStyle>,
    override val colors: AiHeaderColors,
    override val dimensions: AiHeaderDimensions,
    override val startButtonStyle: ButtonStyle,
    override val endButtonStyle: ButtonStyle,
) : AiHeaderStyle {

    class Builder : AiHeaderStyleBuilder {
        private var shape: StatefulValue<Shape>? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var subtitleStyle: StatefulValue<TextStyle>? = null
        private var colorsBuilder: AiHeaderColorsBuilder = AiHeaderColors.builder()
        private var dimensionsBuilder: AiHeaderDimensionsBuilder = AiHeaderDimensions.builder()
        private var startButtonStyle: ButtonStyle? = null
        private var endButtonStyle: ButtonStyle? = null

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>) = apply {
            this.subtitleStyle = subtitleStyle
        }

        @Composable
        override fun colors(builder: @Composable AiHeaderColorsBuilder.() -> Unit) = apply {
            colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable AiHeaderDimensionsBuilder.() -> Unit) = apply {
            dimensionsBuilder.builder()
        }

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shape = shape
        }

        override fun startButtonStyle(startButtonStyle: ButtonStyle) = apply {
            this.startButtonStyle = startButtonStyle
        }

        override fun endButtonStyle(endButtonStyle: ButtonStyle) = apply {
            this.endButtonStyle = endButtonStyle
        }

        override fun style(): AiHeaderStyle = DefaultAiHeaderStyle(
            shape = shape ?: RoundedCornerShape(0).asStatefulValue(),
            titleStyles = titleStyle ?: TextStyle.Default.asStatefulValue(),
            subtitleStyles = subtitleStyle ?: TextStyle.Default.asStatefulValue(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            startButtonStyle = startButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
            endButtonStyle = endButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
        )
    }
}

/**
 * Цвета компонента [AiHeader]
 */
@Stable
interface AiHeaderColors {

    /**
     * Кисть фона компонента
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Кисть заголовка
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Кисть подзаголовка
     */
    val subtitleBrush: StatefulValue<Brush>

    /**
     * Кисть разделителя
     */
    val dividerBrush: StatefulValue<Brush>

    companion object {
        /**
         * Возвращает экземпляр [AiHeaderColorsBuilder]
         */
        fun builder(): AiHeaderColorsBuilder = DefaultAiHeaderColors.Builder()
    }
}

/**
 * Билдер для [AiHeaderColors]
 */
interface AiHeaderColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(color: Color): AiHeaderColorsBuilder =
        backgroundColor(SolidColor(color).asStatefulValue())

    /**
     * Устанавливает интерактивный цвет фона
     */
    fun backgroundColor(color: InteractiveColor): AiHeaderColorsBuilder =
        backgroundColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundColor(brush: Brush): AiHeaderColorsBuilder =
        backgroundColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти фона
     */
    fun backgroundColor(brush: StatefulValue<Brush>): AiHeaderColorsBuilder

    /**
     * Устанавливает цвет заголовка
     */
    fun titleColor(color: Color): AiHeaderColorsBuilder =
        titleColor(color.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет заголовка
     */
    fun titleColor(color: InteractiveColor): AiHeaderColorsBuilder =
        titleColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть заголовка
     */
    fun titleColor(brush: Brush): AiHeaderColorsBuilder =
        titleColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти заголовка
     */
    fun titleColor(brush: StatefulValue<Brush>): AiHeaderColorsBuilder

    /**
     * Устанавливает цвет подзаголовка
     */
    fun subtitleColor(color: Color): AiHeaderColorsBuilder =
        subtitleColor(color.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет подзаголовка
     */
    fun subtitleColor(color: InteractiveColor): AiHeaderColorsBuilder =
        subtitleColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть подзаголовка
     */
    fun subtitleColor(brush: Brush): AiHeaderColorsBuilder =
        subtitleColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти подзаголовка
     */
    fun subtitleColor(brush: StatefulValue<Brush>): AiHeaderColorsBuilder

    /**
     * Устанавливает цвет разделителя
     */
    fun dividerColor(color: Color): AiHeaderColorsBuilder =
        dividerColor(color.asStatefulBrush())

    /**
     * Устанавливает интерактивный цвет разделителя
     */
    fun dividerColor(color: InteractiveColor): AiHeaderColorsBuilder =
        dividerColor(color.asStatefulBrush())

    /**
     * Устанавливает кисть разделителя
     */
    fun dividerColor(brush: Brush): AiHeaderColorsBuilder =
        dividerColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти разделителя
     */
    fun dividerColor(brush: StatefulValue<Brush>): AiHeaderColorsBuilder

    /**
     * Создаёт экземпляр [AiHeaderColors]
     */
    fun build(): AiHeaderColors
}

@Immutable
private class DefaultAiHeaderColors(
    override val backgroundBrush: StatefulValue<Brush>,
    override val titleBrush: StatefulValue<Brush>,
    override val subtitleBrush: StatefulValue<Brush>,
    override val dividerBrush: StatefulValue<Brush>,
) : AiHeaderColors {

    class Builder : AiHeaderColorsBuilder {
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var titleBrush: StatefulValue<Brush>? = null
        private var subtitleBrush: StatefulValue<Brush>? = null
        private var dividerBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(brush: StatefulValue<Brush>) = apply {
            this.backgroundBrush = brush
        }

        override fun titleColor(brush: StatefulValue<Brush>) = apply {
            this.titleBrush = brush
        }

        override fun subtitleColor(brush: StatefulValue<Brush>) = apply {
            this.subtitleBrush = brush
        }

        override fun dividerColor(brush: StatefulValue<Brush>) = apply {
            this.dividerBrush = brush
        }

        override fun build(): AiHeaderColors = DefaultAiHeaderColors(
            backgroundBrush = backgroundBrush ?: SolidColor(Color.Transparent).asStatefulValue(),
            titleBrush = titleBrush ?: Color.Black.asStatefulBrush(),
            subtitleBrush = subtitleBrush ?: Color.Black.asStatefulBrush(),
            dividerBrush = dividerBrush ?: Color.Black.asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента [AiHeader]
 */
@Stable
interface AiHeaderDimensions {

    /**
     * Внешний отступ слева
     */
    val paddingStart: Dp

    /**
     * Внешний отступ справа
     */
    val paddingEnd: Dp

    /**
     * Внешний отступ сверху
     */
    val paddingTop: Dp

    /**
     * Внешний отступ снизу
     */
    val paddingBottom: Dp

    /**
     * Внутренний отступ текстового блока слева
     */
    val textPaddingStart: Dp

    /**
     * Внутренний отступ текстового блока справа
     */
    val textPaddingEnd: Dp

    /**
     * Внутренний отступ текстового блока сверху
     */
    val textPaddingTop: Dp

    /**
     * Внутренний отступ текстового блока снизу
     */
    val textPaddingBottom: Dp

    /**
     * Отступ между заголовком и подзаголовком
     */
    val subtitlePadding: Dp

    /**
     * Толщина линии разделителя
     */
    val dividerThickness: Dp

    companion object {
        /**
         * Возвращает экземпляр [AiHeaderDimensionsBuilder]
         */
        fun builder(): AiHeaderDimensionsBuilder = DefaultAiHeaderDimensions.Builder()
    }
}

/**
 * Билдер для [AiHeaderDimensions]
 */
interface AiHeaderDimensionsBuilder {

    /**
     * Устанавливает внешний отступ слева
     */
    fun paddingStart(paddingStart: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внешний отступ справа
     */
    fun paddingEnd(paddingEnd: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внешний отступ сверху
     */
    fun paddingTop(paddingTop: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внешний отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового блока слева
     */
    fun textPaddingStart(textPaddingStart: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового блока справа
     */
    fun textPaddingEnd(textPaddingEnd: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового блока сверху
     */
    fun textPaddingTop(textPaddingTop: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает внутренний отступ текстового блока снизу
     */
    fun textPaddingBottom(textPaddingBottom: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает отступ между заголовком и подзаголовком
     */
    fun subtitlePadding(subtitlePadding: Dp): AiHeaderDimensionsBuilder

    /**
     * Устанавливает толщину линии разделителя
     */
    fun dividerThickness(dividerThickness: Dp): AiHeaderDimensionsBuilder

    /**
     * Создаёт экземпляр [AiHeaderDimensions]
     */
    fun build(): AiHeaderDimensions
}

@Immutable
private data class DefaultAiHeaderDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val textPaddingStart: Dp,
    override val textPaddingEnd: Dp,
    override val textPaddingTop: Dp,
    override val textPaddingBottom: Dp,
    override val subtitlePadding: Dp,
    override val dividerThickness: Dp,
) : AiHeaderDimensions {

    class Builder : AiHeaderDimensionsBuilder {
        private var paddingStart: Dp = 0.dp
        private var paddingEnd: Dp = 0.dp
        private var paddingTop: Dp = 0.dp
        private var paddingBottom: Dp = 0.dp
        private var textPaddingStart: Dp = 0.dp
        private var textPaddingEnd: Dp = 0.dp
        private var textPaddingTop: Dp = 0.dp
        private var textPaddingBottom: Dp = 0.dp
        private var subtitlePadding: Dp = 0.dp
        private var dividerThickness: Dp = 1.dp

        override fun paddingStart(paddingStart: Dp) = apply { this.paddingStart = paddingStart }
        override fun paddingEnd(paddingEnd: Dp) = apply { this.paddingEnd = paddingEnd }
        override fun paddingTop(paddingTop: Dp) = apply { this.paddingTop = paddingTop }
        override fun paddingBottom(paddingBottom: Dp) = apply { this.paddingBottom = paddingBottom }
        override fun textPaddingStart(textPaddingStart: Dp) = apply { this.textPaddingStart = textPaddingStart }
        override fun textPaddingEnd(textPaddingEnd: Dp) = apply { this.textPaddingEnd = textPaddingEnd }
        override fun textPaddingTop(textPaddingTop: Dp) = apply { this.textPaddingTop = textPaddingTop }
        override fun textPaddingBottom(textPaddingBottom: Dp) = apply { this.textPaddingBottom = textPaddingBottom }
        override fun subtitlePadding(subtitlePadding: Dp) = apply { this.subtitlePadding = subtitlePadding }
        override fun dividerThickness(dividerThickness: Dp) = apply { this.dividerThickness = dividerThickness }

        override fun build(): AiHeaderDimensions = DefaultAiHeaderDimensions(
            paddingStart = paddingStart,
            paddingEnd = paddingEnd,
            paddingTop = paddingTop,
            paddingBottom = paddingBottom,
            textPaddingStart = textPaddingStart,
            textPaddingEnd = textPaddingEnd,
            textPaddingTop = textPaddingTop,
            textPaddingBottom = textPaddingBottom,
            subtitlePadding = subtitlePadding,
            dividerThickness = dividerThickness,
        )
    }
}
