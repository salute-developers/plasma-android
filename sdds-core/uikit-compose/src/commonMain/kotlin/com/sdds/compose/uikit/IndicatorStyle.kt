package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [IndicatorStyle] для компонента [Indicator]
 */
val LocalIndicatorStyle = compositionLocalOf { IndicatorStyle.builder().style() }

/**
 * Стиль компонента [Indicator]
 */
@Stable
interface IndicatorStyle : Style {

    /**
     * Форма [Indicator]
     *  @see CornerBasedShape
     */
    val shape: CornerBasedShape

    /**
     * Цвета компонента
     * @see IndicatorColor
     */
    val color: IndicatorColor

    /**
     * Размеры
     */
    val dimensions: IndicatorDimensions

    companion object {
        /**
         * Возвращает экземпляр [IndicatorStyleBuilder]
         */
        fun builder(receiver: Any? = null): IndicatorStyleBuilder = IndicatorStyleBuilderImpl(receiver)
    }
}

/**
 * Builder стиля [Indicator].
 */
@Stable
interface IndicatorStyleBuilder : StyleBuilder<IndicatorStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see IndicatorStyle.shape
     */
    fun shape(shape: CornerBasedShape): IndicatorStyleBuilder

    /**
     * Устанавливает цвет компонента при помощи [builder].
     * @see IndicatorColorBuilder
     */
    @Composable
    fun color(builder: @Composable IndicatorColorBuilder.() -> Unit): IndicatorStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable IndicatorDimensionsBuilder.() -> Unit): IndicatorStyleBuilder
}

/**
 * Цвета компонента [Indicator]
 */
@Stable
interface IndicatorColor {

    /**
     * Цвет фона [Indicator]
     */
    val backgroundColor: InteractiveColor?

    /**
     * Фон [Indicator]
     */
    val backgroundBrush: StatefulValue<Brush>?
}

/**
 *  Размеры компонента [Indicator]
 */
@Stable
interface IndicatorDimensions {

    /**
     * height высота [Indicator]
     */
    val height: Dp

    /**
     * width ширина [Indicator]
     */
    val width: Dp
}

/**
 * Builder цвета для [Indicator]
 */
@Stable
interface IndicatorColorBuilder {
    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see IndicatorColor.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): IndicatorColorBuilder

    /**
     * Устанавливает кисть [backgroundBrush] в качестве фона компонента.
     * @see IndicatorColor.backgroundBrush
     */
    fun backgroundColor(backgroundBrush: StatefulValue<Brush>): IndicatorColorBuilder

    /**
     * Создает экземпляр [IndicatorColor]
     */
    fun build(): IndicatorColor

    companion object {

        /**
         * Возвращает экземпляр [IndicatorColorBuilder]
         */
        fun builder(): IndicatorColorBuilder = DefaultIndicatorColor.Builder()
    }
}

/**
 * Билдер размеров для [Indicator]
 */
@Stable
interface IndicatorDimensionsBuilder {

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: Dp): IndicatorDimensionsBuilder

    /**
     * Устанавливает высоту кнопки
     */
    fun width(width: Dp): IndicatorDimensionsBuilder

    /**
     * Возвращает [IndicatorDimensions]
     */
    fun build(): IndicatorDimensions

    companion object {

        /**
         * Возвращает экземпляр [IndicatorDimensionsBuilder]
         */
        fun builder(): IndicatorDimensionsBuilder = DefaultIndicatorDimensions.Builder()
    }
}

@Immutable
internal class DefaultIndicatorStyle(
    override val shape: CornerBasedShape,
    override val color: IndicatorColor,
    override val dimensions: IndicatorDimensions,
) : IndicatorStyle

@Stable
private class IndicatorStyleBuilderImpl(override val receiver: Any?) : IndicatorStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorBuilder: IndicatorColorBuilder = IndicatorColorBuilder.builder()
    private var dimensionsBuilder: IndicatorDimensionsBuilder =
        IndicatorDimensionsBuilder.builder()

    override fun shape(shape: CornerBasedShape) = apply {
        this.shape = shape
    }

    @Composable
    override fun color(builder: @Composable (IndicatorColorBuilder.() -> Unit)) =
        apply {
            this.colorBuilder.builder()
        }

    @Composable
    override fun dimensions(builder: @Composable (IndicatorDimensionsBuilder.() -> Unit)) =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun style(): IndicatorStyle {
        return DefaultIndicatorStyle(
            shape = shape ?: RoundedCornerShape(50),
            color = colorBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

@Immutable
private class DefaultIndicatorColor(
    override val backgroundColor: InteractiveColor?,
    override val backgroundBrush: StatefulValue<Brush>?,
) : IndicatorColor {

    class Builder : IndicatorColorBuilder {

        private var backgroundColor: InteractiveColor? = null
        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): IndicatorColorBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>): IndicatorColorBuilder = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun build(): IndicatorColor = DefaultIndicatorColor(
            backgroundColor = backgroundColor,
            backgroundBrush = backgroundBrush,
        )
    }
}

@Immutable
private class DefaultIndicatorDimensions(
    override val height: Dp,
    override val width: Dp,
) : IndicatorDimensions {
    class Builder : IndicatorDimensionsBuilder {
        private var width: Dp? = null
        private var height: Dp? = null

        override fun height(height: Dp): IndicatorDimensionsBuilder = apply {
            this.height = height
        }

        override fun width(width: Dp): IndicatorDimensionsBuilder = apply {
            this.width = width
        }

        override fun build(): IndicatorDimensions = DefaultIndicatorDimensions(
            width = width ?: 12.dp,
            height = height ?: 12.dp,
        )
    }
}
