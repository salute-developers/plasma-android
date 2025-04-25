package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ProgressBarStyle] для компонента [ProgressBar]
 */
val LocalProgressBarStyle = compositionLocalOf { ProgressBarStyle.builder().style() }

/**
 * Стиль компонента [ProgressBar]
 */
@Immutable
interface ProgressBarStyle : Style {

    /**
     * Форма индикатора компонента
     */
    val indicatorShape: CornerBasedShape

    /**
     * Форма фона компонента
     */
    val backgroundShape: CornerBasedShape

    /**
     * Цвета компонента
     * @see ProgressBarColors
     */
    @Deprecated("Use colorValues instead")
    val colors: ProgressBarColors

    /**
     * Цвета компонента
     * @see ProgressBarColors
     */
    val colorValues: ProgressBarColorValues

    /**
     * Размеры и отступы компонента
     * @see ProgressBarDimensions
     */
    @Deprecated("Use dimensionValues instead")
    val dimensions: ProgressBarDimensions

    /**
     * Размеры и отступы компонента
     * @see ProgressBarDimensionValues
     */
    val dimensionValues: ProgressBarDimensionValues

    companion object {

        /**
         * Возвращает экземпляр [ProgressBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): ProgressBarStyleBuilder = DefaultProgressBarStyle.Builder()
    }
}

/**
 * Builder для [ProgressBarStyle]
 */
interface ProgressBarStyleBuilder : StyleBuilder<ProgressBarStyle> {

    fun indicatorShape(indicatorShape: CornerBasedShape): ProgressBarStyleBuilder

    fun backgroundShape(backgroundShape: CornerBasedShape): ProgressBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     * @see ProgressBarColorsBuilder
     */
    @Composable
    @Deprecated("Use colorValues instead")
    fun colors(builder: @Composable ProgressBarColorsBuilder.() -> Unit): ProgressBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     * @see ProgressBarColorValuesBuilder
     */
    @Composable
    fun colorValues(builder: @Composable ProgressBarColorValuesBuilder.() -> Unit): ProgressBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see ProgressBarDimensions
     */
    @Deprecated("Use dimensionValues instead")
    fun dimensions(dimensions: ProgressBarDimensions): ProgressBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see ProgressBarDimensionValuesBuilder
     */
    @Composable
    fun dimensionValues(builder: @Composable ProgressBarDimensionValuesBuilder.() -> Unit): ProgressBarStyleBuilder
}

/**
 * Цвета компонента [ProgressBar]
 */
@Immutable
interface ProgressBarColorValues {

    /**
     * Цвет (или градиент) индикатора [ProgressBar]
     */
    val indicatorBrush: StatefulValue<Brush>?

    /**
     * Цвет (или градиент) индикатора [ProgressBar]
     */
    val indicatorColor: InteractiveColor?

    /**
     * Цвет (или градиент) фона [ProgressBar]
     */
    val backgroundBrush: StatefulValue<Brush>?

    /**
     * Цвет (или градиент) фона [ProgressBar]
     */
    val backgroundColor: InteractiveColor?

    companion object {

        /**
         * Возвращает экземпляр [ProgressBarColorsBuilder]
         */
        fun builder(): ProgressBarColorValuesBuilder = DefaultProgressBarColorValues.Builder()
    }
}

/**
 * Builder для [ProgressBarColors]
 */
interface ProgressBarColorValuesBuilder {

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Color): ProgressBarColorValuesBuilder =
        indicatorColor(indicatorColor.asInteractive())

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: InteractiveColor): ProgressBarColorValuesBuilder

    /**
     * Устанавливает цвет (или градиент) [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: StatefulValue<Brush>): ProgressBarColorValuesBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ProgressBarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ProgressBarColorValuesBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ProgressBarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ProgressBarColorValuesBuilder

    /**
     * Устанавливает цвет (или градиент) [backgroundColor] фона компонента.
     * @see ProgressBarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ProgressBarColorValuesBuilder

    /**
     * Создает экземпляр [ProgressBarColors]
     */
    fun build(): ProgressBarColorValues
}

/**
 * Цвета компонента [ProgressBar]
 */
@Immutable
@Deprecated("Use ProgressBarColorValues")
interface ProgressBarColors {

    /**
     * Цвет (или градиент) индикатора [ProgressBar]
     */
    val indicatorColor: List<Brush>

    /**
     * Цвет (или градиент) фона [ProgressBar]
     */
    val backgroundColor: Brush

    companion object {

        /**
         * Возвращает экземпляр [ProgressBarColorsBuilder]
         */
        fun builder(): ProgressBarColorsBuilder = DefaultProgressBarColors.Builder()
    }
}

/**
 * Цвета компонента [ProgressBar]
 */
@Immutable
interface ProgressBarDimensionValues {

    /**
     * Высота индикатора [ProgressBar]
     */
    val indicatorHeight: Dp

    /**
     * Высота фона [ProgressBar]
     */
    val backgroundHeight: Dp

    companion object {

        /**
         * Возвращает экземпляр [ProgressBarDimensionValues]
         */
        fun builder(): ProgressBarDimensionValuesBuilder = DefaultProgressBarDimensionValues.Builder()
    }
}

interface ProgressBarDimensionValuesBuilder {
    fun indicatorHeight(indicatorHeight: Dp): ProgressBarDimensionValuesBuilder
    fun backgroundHeight(backgroundHeight: Dp): ProgressBarDimensionValuesBuilder

    fun build(): ProgressBarDimensionValues
}

@Immutable
private class DefaultProgressBarDimensionValues(
    override val indicatorHeight: Dp,
    override val backgroundHeight: Dp,
) : ProgressBarDimensionValues {

    class Builder : ProgressBarDimensionValuesBuilder {
        private var indicatorHeight: Dp? = null
        private var backgroundHeight: Dp? = null

        override fun indicatorHeight(indicatorHeight: Dp) = apply {
            this.indicatorHeight = indicatorHeight
        }

        override fun backgroundHeight(backgroundHeight: Dp) = apply {
            this.backgroundHeight = backgroundHeight
        }

        override fun build(): ProgressBarDimensionValues {
            return DefaultProgressBarDimensionValues(
                indicatorHeight = indicatorHeight ?: 3.dp,
                backgroundHeight = backgroundHeight ?: 2.dp,
            )
        }
    }
}

/**
 * Builder для [ProgressBarColors]
 */
@Deprecated("Use ProgressBarColorValuesBuilder")
interface ProgressBarColorsBuilder {

    /**
     * Устанавливает цвет [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Color): ProgressBarColorsBuilder

    /**
     * Устанавливает композитный градиент [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: List<Brush>): ProgressBarColorsBuilder

    /**
     * Устанавливает цвет (или градиент) [indicatorColor] индикатора компонента.
     * @see ProgressBarColors.indicatorColor
     */
    fun indicatorColor(indicatorColor: Brush): ProgressBarColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see ProgressBarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Color): ProgressBarColorsBuilder

    /**
     * Устанавливает цвет (или градиент) [backgroundColor] фона компонента.
     * @see ProgressBarColors.backgroundColor
     */
    fun backgroundColor(backgroundColor: Brush): ProgressBarColorsBuilder

    /**
     * Создает экземпляр [ProgressBarColors]
     */
    fun build(): ProgressBarColors
}

/**
 * Размеры и отступы компонента [ProgressBar]
 * @property backgroundHeight высота фона
 * @property backgroundCornerRadius радиус скругления фона
 * @property indicatorHeight высота индикатора
 * @property indicatorCornerRadius радиус скругления индикатора
 */
@Immutable
@Deprecated("Use ProgressBarDimensionValues instead")
data class ProgressBarDimensions(
    val backgroundHeight: Dp = 4.dp,
    val backgroundCornerRadius: Dp = backgroundHeight / 2,
    val indicatorHeight: Dp = 6.dp,
    val indicatorCornerRadius: Dp = indicatorHeight / 2,
)

@Immutable
private data class DefaultProgressBarStyle(
    @Deprecated("Use colorValues instead")
    override val colors: ProgressBarColors,
    @Deprecated("Use dimensionValues instead")
    override val dimensions: ProgressBarDimensions,
    override val indicatorShape: CornerBasedShape,
    override val backgroundShape: CornerBasedShape,
    override val colorValues: ProgressBarColorValues,
    override val dimensionValues: ProgressBarDimensionValues,
) : ProgressBarStyle {

    class Builder : ProgressBarStyleBuilder {

        private var colorsBuilder: ProgressBarColorsBuilder = ProgressBarColors.builder()
        private var dimensions: ProgressBarDimensions? = null
        private val dimensionValuesBuilder = ProgressBarDimensionValues.builder()
        private val colorValuesBuilder = ProgressBarColorValues.builder()
        private var indicatorShape: CornerBasedShape? = null
        private var backgroundShape: CornerBasedShape? = null

        override fun indicatorShape(indicatorShape: CornerBasedShape) = apply {
            this.indicatorShape = indicatorShape
        }

        override fun backgroundShape(backgroundShape: CornerBasedShape) = apply {
            this.backgroundShape = backgroundShape
        }

        @Deprecated("Use colorValues instead")
        @Composable
        override fun colors(builder: @Composable ProgressBarColorsBuilder.() -> Unit) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun colorValues(builder: @Composable (ProgressBarColorValuesBuilder.() -> Unit)) = apply {
            this.colorValuesBuilder.builder()
        }

        @Deprecated("Use dimensionValues instead")
        override fun dimensions(dimensions: ProgressBarDimensions) = apply {
            this.dimensions = dimensions
            this.dimensionValuesBuilder.apply {
                indicatorHeight(dimensions.indicatorHeight)
                backgroundHeight(dimensions.backgroundHeight)
                indicatorShape(RoundedCornerShape(dimensions.indicatorCornerRadius))
                backgroundShape(RoundedCornerShape(dimensions.backgroundCornerRadius))
            }
        }

        @Composable
        override fun dimensionValues(builder: @Composable (ProgressBarDimensionValuesBuilder.() -> Unit)) = apply {
            this.dimensionValuesBuilder.builder()
        }

        override fun style(): ProgressBarStyle {
            val dimensionValues = dimensionValuesBuilder.build()

            return DefaultProgressBarStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: ProgressBarDimensions(),
                dimensionValues = dimensionValues,
                colorValues = colorValuesBuilder.build(),
                indicatorShape = indicatorShape ?: CircleShape,
                backgroundShape = backgroundShape ?: CircleShape,
            )
        }
    }
}

@Immutable
private data class DefaultProgressBarColorValues(
    override val indicatorColor: InteractiveColor?,
    override val backgroundColor: InteractiveColor?,
    override val indicatorBrush: StatefulValue<Brush>?,
    override val backgroundBrush: StatefulValue<Brush>?,
) : ProgressBarColorValues {

    class Builder : ProgressBarColorValuesBuilder {

        private var indicatorColor: InteractiveColor? = null
        private var indicatorBrush: StatefulValue<Brush>? = null
        private var backgroundColor: InteractiveColor? = null
        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun indicatorColor(indicatorColor: InteractiveColor) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun indicatorColor(indicatorColor: StatefulValue<Brush>) = apply {
            this.indicatorBrush = indicatorColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
        }

        override fun build(): ProgressBarColorValues =
            DefaultProgressBarColorValues(
                indicatorColor = indicatorColor,
                indicatorBrush = indicatorBrush,
                backgroundColor = backgroundColor,
                backgroundBrush = backgroundBrush,
            )
    }
}

@Immutable
private data class DefaultProgressBarColors(
    override val indicatorColor: List<Brush>,
    override val backgroundColor: Brush,
) : ProgressBarColors {

    class Builder : ProgressBarColorsBuilder {

        private var indicatorColor: List<Brush>? = null
        private var backgroundColor: Brush? = null

        override fun indicatorColor(indicatorColor: Color) =
            this.indicatorColor(SolidColor(indicatorColor))

        override fun indicatorColor(indicatorColor: Brush) =
            this.indicatorColor(listOf(indicatorColor))

        override fun indicatorColor(indicatorColor: List<Brush>) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun backgroundColor(backgroundColor: Color) =
            this.backgroundColor(SolidColor(backgroundColor))

        override fun backgroundColor(backgroundColor: Brush) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): ProgressBarColors =
            DefaultProgressBarColors(
                indicatorColor = indicatorColor ?: listOf(SolidColor(Color.Green)),
                backgroundColor = backgroundColor ?: SolidColor(Color.Gray),
            )
    }
}
