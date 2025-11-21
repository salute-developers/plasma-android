package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [PaginationDotsStyle] для компонента [PaginationDots]
 */
val LocalPaginationDotsStyle: ProvidableCompositionLocal<PaginationDotsStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { PaginationDotsStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface PaginationDotsStyle : Style {
    /**
     * Значение коэффициента уменьшения точек
     */
    val edgeShrinkFactor: Float

    /**
     * Количество точек с каждого края, которые будут уменьшаться
     */
    val edgeCount: Int

    /**
     * Ориентация компонента
     */
    val orientation: PaginationDotsOrientation

    /**
     * Цвета компонента
     */
    val colors: PaginationDotsColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: PaginationDotsDimensions

    companion object {
        /**
         * Возвращает экземпляр [PaginationDotsStyleBuilder]
         */
        fun builder(receiver: Any? = null): PaginationDotsStyleBuilder =
            DefaultPaginationDotsStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface PaginationDotsStyleBuilder : StyleBuilder<PaginationDotsStyle> {

    /**
     * Устанавливает значение коэффициента уменьшения точек [edgeShrinkFactor]
     */
    fun edgeShrinkFactor(edgeShrinkFactor: Float): PaginationDotsStyleBuilder

    /**
     * Устанавливает количество точек с каждого края, которые будут уменьшаться [edgeCount]
     */
    fun edgeCount(edgeCount: Int): PaginationDotsStyleBuilder

    /**
     * Устанавливает ориентацию компонента [orientation]
     */
    fun orientation(orientation: PaginationDotsOrientation): PaginationDotsStyleBuilder

    /**
     * Устанавливает цвет
     */
    @Composable
    fun colors(builder: @Composable PaginationDotsColorsBuilder.() -> Unit): PaginationDotsStyleBuilder

    /**
     * Устанавливает
     */
    @Composable
    fun dimensions(builder: @Composable PaginationDotsDimensionsBuilder.() -> Unit): PaginationDotsStyleBuilder
}

private data class DefaultPaginationDotsStyle(
    override val edgeShrinkFactor: Float,
    override val edgeCount: Int,
    override val orientation: PaginationDotsOrientation,
    override val colors: PaginationDotsColors,
    override val dimensions: PaginationDotsDimensions,
) : PaginationDotsStyle {
    class Builder : PaginationDotsStyleBuilder {
        private var edgeShrinkFactor: Float? = null
        private var edgeCount: Int? = null
        private var orientation: PaginationDotsOrientation? = null

        private val colorsBuilder: PaginationDotsColorsBuilder = PaginationDotsColors.builder()

        private val dimensionsBuilder: PaginationDotsDimensionsBuilder =
            PaginationDotsDimensions.builder()

        override fun edgeShrinkFactor(edgeShrinkFactor: Float) = apply {
            this.edgeShrinkFactor = edgeShrinkFactor
        }

        override fun edgeCount(edgeCount: Int) = apply {
            this.edgeCount = edgeCount
        }

        override fun orientation(orientation: PaginationDotsOrientation) = apply {
            this.orientation = orientation
        }

        @Composable
        override fun colors(builder: @Composable PaginationDotsColorsBuilder.() -> Unit):
            PaginationDotsStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable PaginationDotsDimensionsBuilder.() -> Unit):
            PaginationDotsStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): PaginationDotsStyle = DefaultPaginationDotsStyle(
            edgeShrinkFactor = edgeShrinkFactor ?: 0.3f,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            edgeCount = edgeCount ?: 2,
            orientation = orientation ?: PaginationDotsOrientation.Horizontal,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface PaginationDotsColors {
    /**
     * Цвет фона точек
     */
    val dotBackgroundColor: StatefulValue<Color>

    companion object {
        /**
         * Возвращает экземпляр [PaginationDotsColorsBuilder]
         */
        fun builder(): PaginationDotsColorsBuilder = DefaultPaginationDotsColors.Builder()
    }
}

/**
 * Билдер для [PaginationDotsColors]
 */
interface PaginationDotsColorsBuilder {
    /**
     * Устанавливает цвет [dotBackgroundColor]
     */
    fun dotBackgroundColor(dotBackgroundColor: StatefulValue<Color>): PaginationDotsColorsBuilder

    /**
     * Устанавливает цвет [dotBackgroundColor]
     */
    fun dotBackgroundColor(dotBackgroundColor: Color): PaginationDotsColorsBuilder =
        dotBackgroundColor(dotBackgroundColor.asStatefulValue())

    /**
     * Вернёт [PaginationDotsColors]
     */
    fun build(): PaginationDotsColors
}

private data class DefaultPaginationDotsColors(
    override val dotBackgroundColor: StatefulValue<Color>,
) : PaginationDotsColors {
    class Builder : PaginationDotsColorsBuilder {
        private var dotBackgroundColor: StatefulValue<Color>? = null

        override fun dotBackgroundColor(dotBackgroundColor: StatefulValue<Color>):
            PaginationDotsColorsBuilder = apply { this.dotBackgroundColor = dotBackgroundColor }

        override fun build(): PaginationDotsColors =
            DefaultPaginationDotsColors(
                dotBackgroundColor = dotBackgroundColor ?: Color.Black.asStatefulValue(),
            )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface PaginationDotsDimensions {
    /**
     * Расстояние между точками
     */
    val gap: Dp

    /**
     * Ширина точки
     */
    val dotWidth: StatefulValue<Dp>

    /**
     * Высота точки
     */
    val dotHeight: StatefulValue<Dp>

    companion object {
        /**
         * Возвращает экземпляр [PaginationDotsDimensionsBuilder]
         */
        fun builder(): PaginationDotsDimensionsBuilder =
            DefaultPaginationDotsDimensions.Builder()
    }
}

/**
 * Билдер для [PaginationDotsDimensions]
 */
interface PaginationDotsDimensionsBuilder {
    /**
     * Устанавливает расстояние между точками [gap]
     */
    fun gap(gap: Dp): PaginationDotsDimensionsBuilder

    /**
     * Устанавливает ширину точки [dotWidth]
     */
    fun dotWidth(dotWidth: StatefulValue<Dp>): PaginationDotsDimensionsBuilder

    /**
     * Устанавливает ширину точки [dotWidth]
     */
    fun dotWidth(dotWidth: Dp): PaginationDotsDimensionsBuilder =
        dotWidth(dotWidth.asStatefulValue())

    /**
     * Устанавливает высоту точки [dotHeight]
     */
    fun dotHeight(dotHeight: StatefulValue<Dp>): PaginationDotsDimensionsBuilder

    /**
     * Устанавливает высоту точки [dotHeight]
     */
    fun dotHeight(dotHeight: Dp): PaginationDotsDimensionsBuilder =
        dotHeight(dotHeight.asStatefulValue())

    /**
     * Вернёт [PaginationDotsDimensions]
     */
    fun build(): PaginationDotsDimensions
}

private data class DefaultPaginationDotsDimensions(
    override val gap: Dp,
    override val dotWidth: StatefulValue<Dp>,
    override val dotHeight: StatefulValue<Dp>,
) : PaginationDotsDimensions {
    class Builder : PaginationDotsDimensionsBuilder {
        private var gap: Dp? = null

        private var dotWidth: StatefulValue<Dp>? = null

        private var dotHeight: StatefulValue<Dp>? = null

        override fun gap(gap: Dp): PaginationDotsDimensionsBuilder = apply { this.gap = gap }

        override fun dotWidth(dotWidth: StatefulValue<Dp>): PaginationDotsDimensionsBuilder =
            apply {
                this.dotWidth = dotWidth
            }

        override fun dotHeight(dotHeight: StatefulValue<Dp>): PaginationDotsDimensionsBuilder =
            apply {
                this.dotHeight = dotHeight
            }

        override fun build(): PaginationDotsDimensions = DefaultPaginationDotsDimensions(
            gap = gap ?: 4.dp,
            dotWidth = dotWidth ?: 10.dp.asStatefulValue(),
            dotHeight = dotHeight ?: 10.dp.asStatefulValue(),
        )
    }
}
