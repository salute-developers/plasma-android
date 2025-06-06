package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SpinnerStyle] для компонента [Spinner]
 */
val LocalSpinnerStyle =
    compositionLocalOf(structuralEqualityPolicy()) { SpinnerStyle.builder().style() }

/**
 * Стиль компонента [Spinner]
 */
@Immutable
interface SpinnerStyle : Style {

    /**
     * Угол дуги спиннера
     */
    val angle: Float

    /**
     * Вид концов спиннера
     */
    val strokeCap: SpinnerStrokeCap

    /**
     * Цвета компонента [Spinner]
     */
    val colors: SpinnerColors

    /**
     * Размеры и отступы компонента [Spinner]
     */
    val dimensions: SpinnerDimensions

    companion object {
        /**
         * Возвращает экземпляр [SpinnerStyleBuilder]
         */
        fun builder(receiver: Any? = null): SpinnerStyleBuilder =
            DefaultSpinnerStyle.Builder()
    }
}

/**
 * Билдер стиля [SpinnerStyle]
 */
interface SpinnerStyleBuilder : StyleBuilder<SpinnerStyle> {

    /**
     * Устанавливает угол дуги спиннера [angle]
     */
    fun angle(angle: Float): SpinnerStyleBuilder

    /**
     * Устанавливает вид концов спиннера [strokeCap]
     */
    fun strokeCap(strokeCap: SpinnerStrokeCap): SpinnerStyleBuilder

    /**
     * Устанавливает цвета компонента [Spinner]
     */
    @Composable
    fun colors(builder: @Composable SpinnerColorsBuilder.() -> Unit): SpinnerStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [Spinner]
     */
    @Composable
    fun dimensions(builder: @Composable SpinnerDimensionsBuilder.() -> Unit): SpinnerStyleBuilder
}

@Immutable
private class DefaultSpinnerStyle(
    override val colors: SpinnerColors,
    override val dimensions: SpinnerDimensions,
    override val angle: Float,
    override val strokeCap: SpinnerStrokeCap,
) : SpinnerStyle {

    class Builder : SpinnerStyleBuilder {
        private var angle: Float? = null
        private var strokeCap: SpinnerStrokeCap? = null
        private var colorsBuilder: SpinnerColorsBuilder = SpinnerColors.builder()
        private var dimensionsBuilder: SpinnerDimensionsBuilder =
            SpinnerDimensions.builder()

        override fun angle(angle: Float) = apply {
            this.angle = angle
        }

        override fun strokeCap(strokeCap: SpinnerStrokeCap) = apply {
            this.strokeCap = strokeCap
        }

        @Composable
        override fun colors(builder: @Composable (SpinnerColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (SpinnerDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun style(): SpinnerStyle {
            return DefaultSpinnerStyle(
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                angle = angle ?: 360f,
                strokeCap = strokeCap ?: SpinnerStrokeCap.Round,
            )
        }
    }
}

/**
 * Цвета компонента [Spinner]
 */
@Immutable
interface SpinnerColors {

    /**
     * Цвет фона трека спиннера
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет начала спиннера
     */
    val startColor: InteractiveColor

    /**
     * Цвет конца спиннера
     */
    val endColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [SpinnerColorsBuilder]
         */
        fun builder(): SpinnerColorsBuilder = DefaultSpinnerColors.Builder()
    }
}

/**
 * Билдер для [SpinnerColors]
 */
interface SpinnerColorsBuilder {

    /**
     * Устанавливает цвет фона трека спиннера
     */
    fun backgroundColor(backgroundColor: Color): SpinnerColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона трека спиннера
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SpinnerColorsBuilder

    /**
     * Устанавливает цвет начала спиннера
     */
    fun startColor(startColor: Color): SpinnerColorsBuilder =
        startColor(startColor.asInteractive())

    /**
     * Устанавливает цвет начала спиннера
     */
    fun startColor(startColor: InteractiveColor): SpinnerColorsBuilder

    /**
     * Устанавливает цвет конца спиннера
     */
    fun endColor(endColor: Color): SpinnerColorsBuilder =
        endColor(endColor.asInteractive())

    /**
     * Устанавливает цвет конца спиннера
     */
    fun endColor(endColor: InteractiveColor): SpinnerColorsBuilder

    /**
     * Возвращает [SpinnerColors]
     */
    fun build(): SpinnerColors
}

@Immutable
private class DefaultSpinnerColors(
    override val startColor: InteractiveColor,
    override val endColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
) : SpinnerColors {

    class Builder : SpinnerColorsBuilder {
        private var startColor: InteractiveColor? = null
        private var endColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun startColor(startColor: InteractiveColor) = apply {
            this.startColor = startColor
        }

        override fun endColor(endColor: InteractiveColor) = apply {
            this.endColor = endColor
        }

        override fun build(): SpinnerColors {
            return DefaultSpinnerColors(
                startColor = startColor ?: Color.Black.asInteractive(),
                endColor = endColor ?: Color.Black.copy(0f).asInteractive(),
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента [Spinner]
 */
@Immutable
interface SpinnerDimensions {

    /**
     * Размер спиннера
     */
    val size: Dp

    /**
     * Толщина линии спиннера
     */
    val strokeWidth: Dp

    /**
     * Отступ спиннера
     */
    val padding: Dp

    companion object {

        /**
         * Возвращает экземпляр [SpinnerDimensionsBuilder]
         */
        fun builder(): SpinnerDimensionsBuilder = DefaultSpinnerDimensions.Builder()
    }
}

/**
 * Билдер для [SpinnerDimensions]
 */
interface SpinnerDimensionsBuilder {

    /**
     * Устанавливает размер спиннера
     */
    fun size(size: Dp): SpinnerDimensionsBuilder

    /**
     * Устанавливает толщину линии спиннера
     */
    fun strokeWidth(strokeWidth: Dp): SpinnerDimensionsBuilder

    /**
     * Устанавливает отступ спиннера
     */
    fun padding(padding: Dp): SpinnerDimensionsBuilder

    /**
     * Вернет [SpinnerDimensions]
     */
    fun build(): SpinnerDimensions
}

@Immutable
private class DefaultSpinnerDimensions(
    override val size: Dp,
    override val strokeWidth: Dp,
    override val padding: Dp,
) : SpinnerDimensions {

    class Builder : SpinnerDimensionsBuilder {
        private var size: Dp? = null
        private var strokeWidth: Dp? = null
        private var padding: Dp? = null

        override fun size(size: Dp) = apply {
            this.size = size
        }

        override fun strokeWidth(strokeWidth: Dp) = apply {
            this.strokeWidth = strokeWidth
        }

        override fun padding(padding: Dp) = apply {
            this.padding = padding
        }

        private fun calculateThickness(): Dp {
            return (MIN_SPINNER_THICKNESS * (size?.value ?: MIN_SPINNER_SIZE) / MIN_SPINNER_SIZE).dp
        }

        override fun build(): SpinnerDimensions {
            return DefaultSpinnerDimensions(
                size = size ?: MIN_SPINNER_SIZE.dp,
                strokeWidth = strokeWidth ?: calculateThickness(),
                padding = padding ?: 2.dp,
            )
        }
    }
}

private const val MIN_SPINNER_THICKNESS = 1.5f
private const val MIN_SPINNER_SIZE = 16f
