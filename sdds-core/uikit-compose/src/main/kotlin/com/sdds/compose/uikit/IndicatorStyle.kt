package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
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
    @Deprecated("use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы [Indicator]
     *  @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

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
    fun shape(shape: CornerBasedShape): IndicatorStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы компонента [shape]
     * @see IndicatorStyle.shape
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): IndicatorStyleBuilder

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
    @Deprecated("use background", ReplaceWith("background"))
    val backgroundColor: InteractiveColor?

    /**
     * Фон [Indicator]
     */
    @Deprecated("use background", ReplaceWith("background"))
    val backgroundBrush: StatefulValue<Brush>?

    /**
     * Кисти фона [Indicator]
     */
    val background: StatefulValue<Brush>
}

/**
 *  Размеры компонента [Indicator]
 */
@Stable
interface IndicatorDimensions {

    /**
     * height высота [Indicator]
     */
    @Deprecated("use heightValues", ReplaceWith("heightValues"))
    val height: Dp

    /**
     * height высота [Indicator]
     */
    val heightValues: StatefulValue<Dp>

    /**
     * width ширина [Indicator]
     */
    @Deprecated("use widthValues", ReplaceWith("widthValues"))
    val width: Dp

    /**
     * width ширина [Indicator]
     */
    val widthValues: StatefulValue<Dp>
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
    fun backgroundColor(backgroundColor: InteractiveColor): IndicatorColorBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть [backgroundBrush] в качестве фона компонента.
     * @see IndicatorColor.backgroundBrush
     */
    fun backgroundColor(backgroundBrush: Brush): IndicatorColorBuilder =
        backgroundColor(backgroundBrush.asStatefulValue())

    /**
     * Устанавливает кисти [backgroundBrush] в качестве фона компонента.
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
    fun height(height: Dp): IndicatorDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту кнопки
     */
    fun height(height: StatefulValue<Dp>): IndicatorDimensionsBuilder

    /**
     * Устанавливает высоту кнопки
     */
    fun width(width: Dp): IndicatorDimensionsBuilder =
        width(width.asStatefulValue())

    /**
     * Устанавливает высоту кнопки
     */
    fun width(width: StatefulValue<Dp>): IndicatorDimensionsBuilder

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
    override val color: IndicatorColor,
    override val dimensions: IndicatorDimensions,
    override val shapes: StatefulValue<CornerBasedShape>,
) : IndicatorStyle {

    @Deprecated("use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()
}

@Stable
private class IndicatorStyleBuilderImpl(override val receiver: Any?) : IndicatorStyleBuilder {
    private var shapes: StatefulValue<CornerBasedShape>? = null
    private var colorBuilder: IndicatorColorBuilder = IndicatorColorBuilder.builder()
    private var dimensionsBuilder: IndicatorDimensionsBuilder =
        IndicatorDimensionsBuilder.builder()

    override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
        this.shapes = shape
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
            shapes = shapes ?: RoundedCornerShape(50).asStatefulValue(),
            color = colorBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

@Immutable
private class DefaultIndicatorColor(
    override val background: StatefulValue<Brush>,
) : IndicatorColor {

    @Deprecated("use background", ReplaceWith("background"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use background", ReplaceWith("background"))
    override val backgroundBrush: StatefulValue<Brush>? = background
    class Builder : IndicatorColorBuilder {
        private var background: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>): IndicatorColorBuilder = apply {
            this.background = backgroundBrush
        }

        override fun build(): IndicatorColor = DefaultIndicatorColor(
            background = background ?: Color.Black.asStatefulBrush(),
        )
    }
}

@Immutable
private class DefaultIndicatorDimensions(
    override val heightValues: StatefulValue<Dp>,
    override val widthValues: StatefulValue<Dp>,
) : IndicatorDimensions {

    @Deprecated("use heightValues", ReplaceWith("heightValues"))
    override val height: Dp = heightValues.getDefaultValue()

    @Deprecated("use widthValues", ReplaceWith("widthValues"))
    override val width: Dp = widthValues.getDefaultValue()
    class Builder : IndicatorDimensionsBuilder {
        private var widthValues: StatefulValue<Dp>? = null
        private var heightValues: StatefulValue<Dp>? = null

        override fun height(height: StatefulValue<Dp>): IndicatorDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun width(width: StatefulValue<Dp>): IndicatorDimensionsBuilder = apply {
            this.widthValues = width
        }

        override fun build(): IndicatorDimensions = DefaultIndicatorDimensions(
            widthValues = widthValues ?: 12.dp.asStatefulValue(),
            heightValues = heightValues ?: 12.dp.asStatefulValue(),
        )
    }
}
