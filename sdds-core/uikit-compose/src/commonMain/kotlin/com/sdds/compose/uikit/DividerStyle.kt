package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
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
    val shape: CornerBasedShape

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
interface DividerStyleBuilder : StyleBuilder<DividerStyle> {

    /**
     * Устанавливает форму компонента [shape]
     * @see DividerStyle.shape
     */
    fun shape(shape: CornerBasedShape): DividerStyleBuilder

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
    val backgroundColor: InteractiveColor
}

/**
 *  Размеры компонента [Divider]
 */
@Stable
interface DividerDimensions {

    /**
     * Толщина [Divider]
     */
    val thickness: Dp
}

/**
 * Builder цвета для [Divider]
 */
@Stable
interface DividerColorBuilder {
    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColor.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): DividerColorBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DividerColor.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): DividerColorBuilder

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
     * Устанавливает высоту кнопки
     */
    fun thickness(thickness: Dp): DividerDimensionsBuilder

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
    override val shape: CornerBasedShape,
    override val color: DividerColor,
    override val dimensions: DividerDimensions,
) : DividerStyle

@Stable
private class DividerStyleBuilderImpl(override val receiver: Any?) : DividerStyleBuilder {
    private var shape: CornerBasedShape? = null
    private var colorBuilder: DividerColorBuilder = DividerColorBuilder.builder()
    private var dimensionsBuilder: DividerDimensionsBuilder =
        DividerDimensionsBuilder.builder()

    override fun shape(shape: CornerBasedShape) = apply {
        this.shape = shape
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
            shape = shape ?: CircleShape,
            color = colorBuilder.build(),
            dimensions = dimensionsBuilder.build(),
        )
    }
}

@Immutable
private class DefaultDividerColor(
    override val backgroundColor: InteractiveColor,
) : DividerColor {
    class Builder : DividerColorBuilder {

        private var backgroundColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: Color): DividerColorBuilder {
            return backgroundColor(backgroundColor.asInteractive())
        }

        override fun backgroundColor(backgroundColor: InteractiveColor): DividerColorBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): DividerColor = DefaultDividerColor(
            backgroundColor = backgroundColor ?: Color.Black.asInteractive(),
        )
    }
}

@Immutable
private class DefaultDividerDimensions(
    override val thickness: Dp,
) : DividerDimensions {
    class Builder : DividerDimensionsBuilder {
        private var thickness: Dp? = null

        override fun thickness(thickness: Dp): DividerDimensionsBuilder = apply {
            this.thickness = thickness
        }

        override fun build(): DividerDimensions = DefaultDividerDimensions(
            thickness = thickness ?: Dp.Hairline,
        )
    }
}
