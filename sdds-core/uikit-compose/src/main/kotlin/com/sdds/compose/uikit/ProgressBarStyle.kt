package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ProgressBarStyle] для компонента [ProgressBar]
 */
val LocalProgressBarStyle = compositionLocalOf { ProgressBarStyle.builder().style() }

/**
 * Стиль компонента [ProgressBar]
 */
@Stable
interface ProgressBarStyle : Style {

    /**
     * Цвета компонента
     * @see ProgressBarColors
     */
    val colors: ProgressBarColors

    /**
     * Размеры и отступы компонента
     * @see ProgressBarDimensions
     */
    val dimensions: ProgressBarDimensions

    companion object {

        /**
         * Возвращает экземпляр [ProgressBarStyleBuilder]
         */
        fun builder(): ProgressBarStyleBuilder = DefaultProgressBarStyle.Builder()
    }
}

/**
 * Builder для [ProgressBarStyle]
 */
@Stable
interface ProgressBarStyleBuilder : StyleBuilder<ProgressBarStyle> {

    /**
     * Устанавливает цвета компонента при помощи [builder].
     * @see ProgressBarColorsBuilder
     */
    @Composable
    fun colors(builder: @Composable ProgressBarColorsBuilder.() -> Unit): ProgressBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see ProgressBarDimensions
     */
    fun dimensions(dimensions: ProgressBarDimensions): ProgressBarStyleBuilder
}

/**
 * Цвета компонента [ProgressBar]
 */
@Stable
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
 * Builder для [ProgressBarColors]
 */
@Stable
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
data class ProgressBarDimensions(
    val backgroundHeight: Dp = 4.dp,
    val backgroundCornerRadius: Dp = backgroundHeight / 2,
    val indicatorHeight: Dp = 6.dp,
    val indicatorCornerRadius: Dp = indicatorHeight / 2,
)

@Immutable
private data class DefaultProgressBarStyle(
    override val colors: ProgressBarColors,
    override val dimensions: ProgressBarDimensions,
) : ProgressBarStyle {

    class Builder : ProgressBarStyleBuilder {

        private var colorsBuilder: ProgressBarColorsBuilder = ProgressBarColors.builder()
        private var dimensions: ProgressBarDimensions? = null

        @Composable
        override fun colors(builder: @Composable ProgressBarColorsBuilder.() -> Unit) = apply {
            this.colorsBuilder.builder()
        }

        override fun dimensions(dimensions: ProgressBarDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun style(): ProgressBarStyle =
            DefaultProgressBarStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensions ?: ProgressBarDimensions(),
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
