package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [DividerStyle] для компонента [Divider]
 */
val LocalDividerStyle = compositionLocalOf { DividerStyle.builder().style() }

/**
 * Стиль компонента [Divider]
 */
@Stable
interface DividerStyle : Style {

    /**
     * Форма [Divider]
     *  @see CornerBasedShape
     */
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Формы [Divider]
     *  @see CornerBasedShape
     */
    val shapes: StatefulValue<CornerBasedShape>

    /**
     * Цвета компонента
     * @see DividerColor
     */
    val color: DividerColor

    /**
     * Размеры
     */
    val dimensions: DividerDimensions

    companion object {
        /**
         * Возвращает экземпляр [DividerStyleBuilder]
         */
        fun builder(receiver: Any? = null): DividerStyleBuilder =
            DividerStyleBuilderImpl(receiver)
    }
}

/**
 * Builder стиля [Divider].
 */
@Stable
@ApiInfo
interface DividerStyleBuilder : StyleBuilder<DividerStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see DividerStyleBuilder.shape
     */
    fun shape(shape: CornerBasedShape): DividerStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму компонента [shape]
     * @see DividerStyle.shapes
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): DividerStyleBuilder

    /**
     * Устанавливает цвет компонента при помощи [builder].
     * @see DividerColorBuilder
     */
    @Composable
    fun color(builder: @Composable DividerColorBuilder.() -> Unit): DividerStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     */
    @Composable
    fun dimensions(builder: @Composable DividerDimensionsBuilder.() -> Unit): DividerStyleBuilder
}

/**
 * Цвета компонента [Divider]
 */
@Stable
interface DividerColor {

    /**
     * Цвет фона [Divider]
     */
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона [Divider]
     */
    val backgroundBrush: StatefulValue<Brush>
}

/**
 *  Размеры компонента [Divider]
 */
@Stable
interface DividerDimensions {

    /**
     * Толщина [Divider]
     */
    @Deprecated("Use thicknessValues", ReplaceWith("thicknessValues"))
    val thickness: Dp

    /**
     * Толщина [Divider]
     */
    val thicknessValues: StatefulValue<Dp>
}

/**
 * Builder цвета для [Divider]
 */
@Stable
interface DividerColorBuilder {
    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColorBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): DividerColorBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColorBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): DividerColorBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColorBuilder.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): DividerColorBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColor.backgroundBrush
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): DividerColorBuilder

    /**
     * Создает экземпляр [DividerColor]
     */
    fun build(): DividerColor

    companion object {

        /**
         * Возвращает экземпляр [DividerColorBuilder]
         */
        fun builder(): DividerColorBuilder = DefaultDividerColor.Builder()
    }
}

/**
 * Билдер размеров для [Divider]
 */
@Stable
interface DividerDimensionsBuilder {

    /**
     * Устанавливает толщину разделительной линии
     */
    fun thickness(thickness: Dp): DividerDimensionsBuilder =
        thickness(thickness.asStatefulValue())

    /**
     * Устанавливает толщину разделительной линии
     */
    fun thickness(thickness: StatefulValue<Dp>): DividerDimensionsBuilder

    /**
     * Возвращает [DividerDimensions]
     */
    fun build(): DividerDimensions

    companion object {

        /**
         * Возвращает экземпляр [DividerDimensionsBuilder]
         */
        fun builder(): DividerDimensionsBuilder = DefaultDividerDimensions.Builder()
    }
}

@Immutable
internal class DefaultDividerStyle(
    override val color: DividerColor,
    override val dimensions: DividerDimensions,
    override val shapes: StatefulValue<CornerBasedShape>,
) : DividerStyle {

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()
}

@Stable
private class DividerStyleBuilderImpl(override val receiver: Any?) : DividerStyleBuilder {
    private var shapes: StatefulValue<CornerBasedShape>? = null
    private var colorBuilder: DividerColorBuilder = DividerColorBuilder.builder()
    private var dimensionsBuilder: DividerDimensionsBuilder =
        DividerDimensionsBuilder.builder()

    override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
        this.shapes = shape
    }

    @Composable
    override fun color(builder: @Composable (DividerColorBuilder.() -> Unit)) =
        apply {
            this.colorBuilder.builder()
        }

    @Composable
    override fun dimensions(builder: @Composable (DividerDimensionsBuilder.() -> Unit)) =
        apply {
            this.dimensionsBuilder.builder()
        }

    override fun style(): DividerStyle {
        return DefaultDividerStyle(
            shapes = shapes ?: CircleShape.asStatefulValue(),
            color = colorBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

@Immutable
private class DefaultDividerColor(
    override val backgroundBrush: StatefulValue<Brush>,
) : DividerColor {

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : DividerColorBuilder {

        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): DividerColorBuilder = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun build(): DividerColor = DefaultDividerColor(
            backgroundBrush = backgroundBrush ?: Color.Black.asStatefulBrush(),
        )
    }
}

@Immutable
private class DefaultDividerDimensions(
    override val thicknessValues: StatefulValue<Dp>,
) : DividerDimensions {

    @Deprecated("Use thicknessValues", ReplaceWith("thicknessValues"))
    override val thickness: Dp = thicknessValues.getDefaultValue()

    class Builder : DividerDimensionsBuilder {
        private var thicknessValues: StatefulValue<Dp>? = null

        override fun thickness(thickness: StatefulValue<Dp>): DividerDimensionsBuilder = apply {
            this.thicknessValues = thickness
        }

        override fun build(): DividerDimensions = DefaultDividerDimensions(
            thicknessValues = thicknessValues ?: Dp.Hairline.asStatefulValue(),
        )
    }
}
