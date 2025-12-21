package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SliderStyle] для компонента [Slider]
 */
val LocalSliderStyle: ProvidableCompositionLocal<SliderStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { SliderStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface SliderStyle : Style {

    /**
     * Cтиль [Tooltip]
     */
    val tooltipStyle: TooltipStyle

    /**
     * Ориентация
     */
    val orientation: SliderOrientation

    /**
     * Расположение лэйбла с иконкой относительно Slider
     */
    val labelAlignment: LabelAlignment

    /**
     * Направление slide
     */
    val slideDirection: SlideDirection

    /**
     * Расположение текста установленного значения
     */
    val valuePlacement: ValuePlacement

    /**
     * Расположение лэйблов ограничений
     */
    val limitLabelAlignment: LimitLabelAlignment

    /**
     * Расположение текста в лэйбле
     */
    val titleAlignment: TitleAlignment

    /**
     * Выравнивание всего контента внутри Slider
     */
    val alignment: SliderAlignment

    /**
     * Форма трэка
     */
    val shape: CornerBasedShape

    /**
     * Форма индикатора
     */
    val indicatorShape: CornerBasedShape

    /**
     * Форма ползунка
     */
    val thumbShape: CornerBasedShape

    /**
     * Стиль заголовка
     */
    val titleStyle: TextStyle

    /**
     * Стиль текста в лэйблах граничных значений
     */
    val limitLabelStyle: TextStyle

    /**
     * Цвета компонента
     */
    val colors: SliderColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: SliderDimensions

    companion object {
        /**
         * Возвращает экземпляр [SliderStyleBuilder]
         */
        fun builder(receiver: Any? = null): SliderStyleBuilder =
            DefaultSliderStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface SliderStyleBuilder : StyleBuilder<SliderStyle> {
    /**
     * Устанавливает стиль компонента Tooltip
     */
    fun tooltipStyle(tooltipStyle: TooltipStyle): SliderStyleBuilder

    /**
     * Устанавливает ориентацию
     */
    fun orientation(orientation: SliderOrientation): SliderStyleBuilder

    /**
     * Устанавливает напрваление слайда
     */
    fun slideDirection(slideDirection: SlideDirection): SliderStyleBuilder

    /**
     * Устанавливает расположение лэйбла с иконкой относительно Slider
     */
    fun labelAlignment(labelAlignment: LabelAlignment): SliderStyleBuilder

    /**
     * Устанавливает расположение текста установленного значения
     */
    fun valuePlacement(valuePlacement: ValuePlacement): SliderStyleBuilder

    /**
     * Устанавливает расположение лэйблов ограничений
     */
    fun limitLabelAlignment(limitLabelAlignment: LimitLabelAlignment): SliderStyleBuilder

    /**
     * Устанавливает расположение текста в лэйбле
     */
    fun titleAlignment(titleAlignment: TitleAlignment): SliderStyleBuilder

    /**
     * Устанавливает выравнивание всего контента внутри Slider
     */
    fun alignment(alignment: SliderAlignment): SliderStyleBuilder

    /**
     * Устанавливает форму трэка
     */
    fun shape(shape: CornerBasedShape): SliderStyleBuilder

    /**
     * Устанавливает форму индикатора
     */
    fun indicatorShape(indicatorShape: CornerBasedShape): SliderStyleBuilder

    /**
     * Устанавливает форму ползунка
     */
    fun thumbShape(thumbShape: CornerBasedShape): SliderStyleBuilder

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): SliderStyleBuilder

    /**
     * Устанавливает стиль текста [limitLabelStyle] в лэйблах граничных значений
     */
    fun limitLabelStyle(limitLabelStyle: TextStyle): SliderStyleBuilder

    /**
     * Устанавливает цвета компонента
     */
    @Composable
    fun colors(builder: @Composable SliderColorsBuilder.() -> Unit): SliderStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable SliderDimensionsBuilder.() -> Unit): SliderStyleBuilder
}

private data class DefaultSliderStyle(
    override val shape: CornerBasedShape,
    override val indicatorShape: CornerBasedShape,
    override val thumbShape: CornerBasedShape,
    override val colors: SliderColors,
    override val dimensions: SliderDimensions,
    override val tooltipStyle: TooltipStyle,
    override val orientation: SliderOrientation,
    override val labelAlignment: LabelAlignment,
    override val slideDirection: SlideDirection,
    override val valuePlacement: ValuePlacement,
    override val limitLabelAlignment: LimitLabelAlignment,
    override val titleAlignment: TitleAlignment,
    override val alignment: SliderAlignment,
    override val titleStyle: TextStyle,
    override val limitLabelStyle: TextStyle,
) : SliderStyle {
    class Builder : SliderStyleBuilder {
        private var tooltipStyle: TooltipStyle? = null
        private var shape: CornerBasedShape? = null
        private var indicatorShape: CornerBasedShape? = null
        private var thumbShape: CornerBasedShape? = null
        private var orientation: SliderOrientation? = null
        private var labelAlignment: LabelAlignment? = null
        private var slideDirection: SlideDirection? = null
        private var valuePlacement: ValuePlacement? = null
        private var limitLabelAlignment: LimitLabelAlignment? = null
        private var titleAlignment: TitleAlignment? = null
        private var alignment: SliderAlignment? = null
        private var titleStyle: TextStyle? = null
        private var limitLabelStyle: TextStyle? = null
        private val colorsBuilder: SliderColorsBuilder = SliderColors.builder()
        private val dimensionsBuilder: SliderDimensionsBuilder = SliderDimensions.builder()

        override fun tooltipStyle(tooltipStyle: TooltipStyle): SliderStyleBuilder = apply {
            this.tooltipStyle = tooltipStyle
        }

        override fun orientation(orientation: SliderOrientation): SliderStyleBuilder = apply {
            this.orientation = orientation
        }

        override fun slideDirection(slideDirection: SlideDirection): SliderStyleBuilder = apply {
            this.slideDirection = slideDirection
        }

        override fun labelAlignment(labelAlignment: LabelAlignment): SliderStyleBuilder = apply {
            this.labelAlignment = labelAlignment
        }

        override fun valuePlacement(valuePlacement: ValuePlacement): SliderStyleBuilder = apply {
            this.valuePlacement = valuePlacement
        }

        override fun limitLabelAlignment(limitLabelAlignment: LimitLabelAlignment): SliderStyleBuilder = apply {
            this.limitLabelAlignment = limitLabelAlignment
        }

        override fun titleAlignment(titleAlignment: TitleAlignment): SliderStyleBuilder = apply {
            this.titleAlignment = titleAlignment
        }

        override fun alignment(alignment: SliderAlignment): SliderStyleBuilder = apply {
            this.alignment = alignment
        }

        override fun shape(shape: CornerBasedShape): SliderStyleBuilder = apply {
            this.shape = shape
        }

        override fun indicatorShape(indicatorShape: CornerBasedShape): SliderStyleBuilder = apply {
            this.indicatorShape = indicatorShape
        }

        override fun thumbShape(thumbShape: CornerBasedShape): SliderStyleBuilder = apply {
            this.thumbShape = thumbShape
        }

        override fun titleStyle(titleStyle: TextStyle): SliderStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun limitLabelStyle(limitLabelStyle: TextStyle): SliderStyleBuilder = apply {
            this.limitLabelStyle = limitLabelStyle
        }

        @Composable
        override fun colors(builder: @Composable SliderColorsBuilder.() -> Unit):
            SliderStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable SliderDimensionsBuilder.() -> Unit):
            SliderStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): SliderStyle = DefaultSliderStyle(
            tooltipStyle = tooltipStyle ?: TooltipStyle.builder().style(),
            shape = shape ?: CircleShape,
            indicatorShape = indicatorShape ?: CircleShape,
            thumbShape = thumbShape ?: CircleShape,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            orientation = orientation ?: SliderOrientation.Horizontal,
            labelAlignment = labelAlignment ?: LabelAlignment.Top,
            slideDirection = slideDirection ?: SlideDirection.Normal,
            valuePlacement = valuePlacement ?: ValuePlacement.Top,
            limitLabelAlignment = limitLabelAlignment ?: LimitLabelAlignment.End,
            titleAlignment = titleAlignment ?: TitleAlignment.End,
            alignment = alignment ?: SliderAlignment.Start,
            titleStyle = titleStyle ?: TextStyle.Default,
            limitLabelStyle = limitLabelStyle ?: TextStyle.Default,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface SliderColors {
    /**
     * Цвет ползунка
     */
    val thumbColor: InteractiveColor

    /**
     * Цвет трэка
     */
    val trackColor: InteractiveColor

    /**
     * Цвет (или градиент) индикатора [Slider]
     */
    val indicatorBrush: StatefulValue<Brush>?

    /**
     * Цвет индикатора [Slider]
     */
    val indicatorColor: InteractiveColor

    /**
     * Цвет (или градиент) бордера ползунка
     */
    val thumbStrokeColor: StatefulValue<Brush>?

    /**
     * Цвет иконки
     */
    val iconColor: InteractiveColor

    /**
     * Цвет заголовка
     */
    val titleColor: InteractiveColor

    /**
     * Цвет текта в лэйблах граничных значений
     */
    val limitLabelColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [SliderColorsBuilder]
         */
        fun builder(): SliderColorsBuilder = DefaultSliderColors.Builder()
    }
}

/**
 * Билдер для [SliderColors]
 */
interface SliderColorsBuilder {
    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [thumbColor]
     */
    fun thumbColor(thumbColor: Color): SliderColorsBuilder =
        thumbColor(thumbColor.asInteractive())

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [trackColor]
     */
    fun trackColor(trackColor: Color): SliderColorsBuilder =
        trackColor(trackColor.asInteractive())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Color): SliderColorsBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет (или градиент) [indicatorColor] индикатора компонента.
     * @see SliderColors.indicatorColor
     */
    fun indicatorColor(indicatorBrush: StatefulValue<Brush>): SliderColorsBuilder

    /**
     * Устанавливает цвет [thumbStrokeColor] индикатора компонента.
     * @see SliderColors.thumbStrokeColor
     */
    fun thumbStrokeColor(thumbStrokeColor: Color): SliderColorsBuilder =
        thumbStrokeColor(SolidColor(thumbStrokeColor))

    /**
     * Устанавливает цвет [thumbStrokeColor] индикатора компонента.
     * @see SliderColors.thumbStrokeColor
     */
    fun thumbStrokeColor(thumbStrokeColor: Brush): SliderColorsBuilder =
        thumbStrokeColor(thumbStrokeColor.asStatefulValue())

    /**
     * Устанавливает цвет (или градиент) [thumbStrokeColor] индикатора компонента.
     * @see SliderColors.thumbStrokeColor
     */
    fun thumbStrokeColor(thumbStrokeBrush: StatefulValue<Brush>): SliderColorsBuilder

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [iconColor]
     */
    fun iconColor(iconColor: Color): SliderColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет [titleColor]
     */
    fun titleColor(titleColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [titleColor]
     */
    fun titleColor(titleColor: Color): SliderColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет [limitLabelColor]
     */
    fun limitLabelColor(limitLabelColor: InteractiveColor): SliderColorsBuilder

    /**
     * Устанавливает цвет [limitLabelColor]
     */
    fun limitLabelColor(limitLabelColor: Color): SliderColorsBuilder =
        limitLabelColor(limitLabelColor.asInteractive())

    /**
     * Вернёт [SliderColors]
     */
    fun build(): SliderColors
}

private data class DefaultSliderColors(
    override val thumbColor: InteractiveColor,
    override val trackColor: InteractiveColor,
    override val indicatorColor: InteractiveColor,
    override val indicatorBrush: StatefulValue<Brush>?,
    override val thumbStrokeColor: StatefulValue<Brush>?,
    override val iconColor: InteractiveColor,
    override val titleColor: InteractiveColor,
    override val limitLabelColor: InteractiveColor,
) : SliderColors {
    class Builder : SliderColorsBuilder {
        private var thumbColor: InteractiveColor? = null
        private var trackColor: InteractiveColor? = null
        private var indicatorColor: InteractiveColor? = null
        private var indicatorBrush: StatefulValue<Brush>? = null
        private var thumbStrokeColor: InteractiveColor? = null
        private var thumbStrokeBrush: StatefulValue<Brush>? = null
        private var iconColor: InteractiveColor? = null
        private var titleColor: InteractiveColor? = null
        private var limitLabelColor: InteractiveColor? = null

        override fun thumbColor(thumbColor: InteractiveColor): SliderColorsBuilder = apply {
            this.thumbColor = thumbColor
        }

        override fun trackColor(trackColor: InteractiveColor): SliderColorsBuilder = apply {
            this.trackColor = trackColor
        }

        override fun indicatorColor(indicatorColor: InteractiveColor): SliderColorsBuilder = apply {
            this.indicatorColor = indicatorColor
        }

        override fun indicatorColor(indicatorBrush: StatefulValue<Brush>): SliderColorsBuilder = apply {
            this.indicatorBrush = indicatorBrush
        }

        override fun thumbStrokeColor(thumbStrokeBrush: StatefulValue<Brush>): SliderColorsBuilder = apply {
            this.thumbStrokeBrush = thumbStrokeBrush
        }

        override fun iconColor(iconColor: InteractiveColor): SliderColorsBuilder = apply {
            this.iconColor = iconColor
        }

        override fun titleColor(titleColor: InteractiveColor): SliderColorsBuilder = apply {
            this.titleColor = titleColor
        }

        override fun limitLabelColor(limitLabelColor: InteractiveColor): SliderColorsBuilder = apply {
            this.limitLabelColor = limitLabelColor
        }

        override fun build(): SliderColors = DefaultSliderColors(
            thumbColor = thumbColor ?: Color.DarkGray.asInteractive(),
            trackColor = trackColor ?: Color.LightGray.asInteractive(),
            indicatorColor = indicatorColor ?: Color.Green.asInteractive(),
            indicatorBrush = indicatorBrush,
            thumbStrokeColor = thumbStrokeBrush ?: SolidColor(Color.LightGray).asStatefulValue(),
            iconColor = iconColor ?: Color.Black.asInteractive(),
            titleColor = titleColor ?: Color.Black.asInteractive(),
            limitLabelColor = limitLabelColor ?: Color.Gray.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface SliderDimensions {

    /**
     * Толщина трэка
     */
    val trackThickness: Dp

    /**
     * Толщина индикатора
     */
    val indicatorThickness: Dp

    /**
     * Размер ползунка
     */
    val thumbSize: Dp

    /**
     * Размер иконки
     */
    val iconSize: Dp

    /**
     * Отступ Label от Slider
     */
    val labelMargin: Dp

    /**
     * Отступ limit label от Slider
     */
    val limitLabelMargin: Dp

    /**
     * Ширина бордера ползунка
     */
    val thumbStrokeWidth: Dp

    /**
     * Отступ заголовка от иконки
     */
    val titleMargin: Dp

    companion object {
        /**
         * Возвращает экземпляр [SliderDimensionsBuilder]
         */
        fun builder(): SliderDimensionsBuilder = DefaultSliderDimensions.Builder()
    }
}

/**
 * Билдер для [SliderDimensions]
 */
interface SliderDimensionsBuilder {

    /**
     * Устанавливает толщину трэка [trackThickness]
     */
    fun trackThickness(trackThickness: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает толщину линии индикатора [indicatorThickness]
     */
    fun indicatorThickness(indicatorThickness: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает размер ползунка [thumbSize]
     */
    fun thumbSize(thumbSize: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает ширину бордера у ползунка [thumbStrokeWidth]
     */
    fun thumbStrokeWidth(thumbStrokeWidth: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает размер иконки[iconSize]
     */
    fun iconSize(iconSize: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает отступ Label от Slider [labelMargin]
     */
    fun labelMargin(labelMargin: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает отступ limit label от Slider [limitLabelMargin]
     */
    fun limitLabelMargin(limitLabelMargin: Dp): SliderDimensionsBuilder

    /**
     * Устанавливает отступ заголовка от иконки[titleMargin]
     */
    fun titleMargin(titleMargin: Dp): SliderDimensionsBuilder

    /**
     * Вернёт [SliderDimensions]
     */
    fun build(): SliderDimensions
}

private data class DefaultSliderDimensions(
    override val trackThickness: Dp,
    override val indicatorThickness: Dp,
    override val thumbSize: Dp,
    override val thumbStrokeWidth: Dp,
    override val iconSize: Dp,
    override val labelMargin: Dp,
    override val limitLabelMargin: Dp,
    override val titleMargin: Dp,
) : SliderDimensions {
    class Builder : SliderDimensionsBuilder {
        private var trackThickness: Dp? = null
        private var indicatorThickness: Dp? = null
        private var thumbSize: Dp? = null
        private var thumbStrokeWidth: Dp? = null
        private var iconSize: Dp? = null
        private var labelMargin: Dp? = null
        private var limitLabelMargin: Dp? = null
        private var titleMargin: Dp? = null

        override fun trackThickness(trackThickness: Dp): SliderDimensionsBuilder = apply {
            this.trackThickness = trackThickness
        }

        override fun indicatorThickness(indicatorThickness: Dp): SliderDimensionsBuilder = apply {
            this.indicatorThickness = indicatorThickness
        }

        override fun thumbSize(thumbSize: Dp): SliderDimensionsBuilder = apply {
            this.thumbSize = thumbSize
        }

        override fun thumbStrokeWidth(thumbStrokeWidth: Dp): SliderDimensionsBuilder = apply {
            this.thumbStrokeWidth = thumbStrokeWidth
        }

        override fun iconSize(iconSize: Dp): SliderDimensionsBuilder = apply {
            this.iconSize = iconSize
        }

        override fun labelMargin(labelMargin: Dp): SliderDimensionsBuilder = apply {
            this.labelMargin = labelMargin
        }

        override fun limitLabelMargin(limitLabelMargin: Dp): SliderDimensionsBuilder = apply {
            this.limitLabelMargin = limitLabelMargin
        }

        override fun titleMargin(titleMargin: Dp): SliderDimensionsBuilder = apply {
            this.titleMargin = titleMargin
        }

        override fun build(): SliderDimensions = DefaultSliderDimensions(
            trackThickness = trackThickness ?: 4.dp,
            indicatorThickness = indicatorThickness ?: 4.dp,
            thumbSize = thumbSize ?: 20.dp,
            thumbStrokeWidth = thumbStrokeWidth ?: 1.dp,
            iconSize = iconSize ?: 20.dp,
            labelMargin = labelMargin ?: 10.dp,
            limitLabelMargin = limitLabelMargin ?: 10.dp,
            titleMargin = titleMargin ?: 4.dp,
        )
    }
}
