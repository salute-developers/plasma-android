package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
    @Deprecated("use angleValues", ReplaceWith("angleValues"))
    val angle: Float

    /**
     * Углы дуги спиннера
     */
    val angleValues: StatefulValue<Float>

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
@ApiInfo
interface SpinnerStyleBuilder : StyleBuilder<SpinnerStyle> {

    /**
     * Устанавливает угол дуги спиннера [angle]
     */
    fun angle(angle: Float): SpinnerStyleBuilder =
        angle(angle.asStatefulValue())

    /**
     * Устанавливает углы дуги спиннера [angle]
     */
    fun angle(angle: StatefulValue<Float>): SpinnerStyleBuilder

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
    override val strokeCap: SpinnerStrokeCap,
    override val angleValues: StatefulValue<Float>,
) : SpinnerStyle {

    @Deprecated("use angleValues", ReplaceWith("angleValues"))
    override val angle: Float = angleValues.getDefaultValue()

    class Builder : SpinnerStyleBuilder {

        private var angleValues: StatefulValue<Float>? = null
        private var strokeCap: SpinnerStrokeCap? = null
        private var colorsBuilder: SpinnerColorsBuilder = SpinnerColors.builder()
        private var dimensionsBuilder: SpinnerDimensionsBuilder =
            SpinnerDimensions.builder()

        override fun angle(angle: StatefulValue<Float>) = apply {
            this.angleValues = angle
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
                angleValues = angleValues ?: 360f.asStatefulValue(),
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
    @Deprecated("use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисть фона трека спиннера
     */
    val backgroundBrush: StatefulValue<Brush>

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
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона трека спиннера
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SpinnerColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона трека спиннера
     */
    fun backgroundColor(backgroundColor: Brush): SpinnerColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает кисти фона трека спиннера
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): SpinnerColorsBuilder

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
    override val backgroundBrush: StatefulValue<Brush>,
) : SpinnerColors {

    @Deprecated("use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : SpinnerColorsBuilder {
        private var startColor: InteractiveColor? = null
        private var endColor: InteractiveColor? = null
        private var backgroundBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundBrush = backgroundColor
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
                backgroundBrush = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
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
    @Deprecated("use sizeValues", ReplaceWith("sizeValues"))
    val size: Dp

    /**
     * Размер спиннера
     */
    val sizeValues: StatefulValue<Dp>

    /**
     * Толщина линии спиннера
     */
    @Deprecated("use strokeWidthValues", ReplaceWith("strokeWidthValues"))
    val strokeWidth: Dp

    /**
     * Толщина линии спиннера
     */
    val strokeWidthValues: StatefulValue<Dp>

    /**
     * Отступ спиннера
     */
    @Deprecated("use paddingValues", ReplaceWith("paddingValues"))
    val padding: Dp

    /**
     * Отступ спиннера
     */
    val paddingValues: StatefulValue<Dp>

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
    fun size(size: Dp): SpinnerDimensionsBuilder =
        size(size.asStatefulValue())

    /**
     * Устанавливает размер спиннера
     */
    fun size(size: StatefulValue<Dp>): SpinnerDimensionsBuilder

    /**
     * Устанавливает толщину линии спиннера
     */
    fun strokeWidth(strokeWidth: Dp): SpinnerDimensionsBuilder =
        strokeWidth(strokeWidth.asStatefulValue())

    /**
     * Устанавливает толщину линии спиннера
     */
    fun strokeWidth(strokeWidth: StatefulValue<Dp>): SpinnerDimensionsBuilder

    /**
     * Устанавливает отступ спиннера
     */
    fun padding(padding: Dp): SpinnerDimensionsBuilder =
        padding(padding.asStatefulValue())

    /**
     * Устанавливает отступ спиннера
     */
    fun padding(padding: StatefulValue<Dp>): SpinnerDimensionsBuilder

    /**
     * Вернет [SpinnerDimensions]
     */
    fun build(): SpinnerDimensions
}

@Immutable
private class DefaultSpinnerDimensions(
    override val sizeValues: StatefulValue<Dp>,
    override val strokeWidthValues: StatefulValue<Dp>,
    override val paddingValues: StatefulValue<Dp>,

) : SpinnerDimensions {
    @Deprecated("use sizeValues", ReplaceWith("sizeValues"))
    override val size: Dp = sizeValues.getDefaultValue()

    @Deprecated("use strokeWidthValues", ReplaceWith("strokeWidthValues"))
    override val strokeWidth: Dp = strokeWidthValues.getDefaultValue()

    @Deprecated("use paddingValues", ReplaceWith("paddingValues"))
    override val padding: Dp = paddingValues.getDefaultValue()

    class Builder : SpinnerDimensionsBuilder {
        private var sizeValues: StatefulValue<Dp>? = null
        private var strokeWidthValues: StatefulValue<Dp>? = null
        private var paddingValues: StatefulValue<Dp>? = null

        override fun size(size: StatefulValue<Dp>) = apply {
            this.sizeValues = size
        }

        override fun strokeWidth(strokeWidth: StatefulValue<Dp>) = apply {
            this.strokeWidthValues = strokeWidth
        }

        override fun padding(padding: StatefulValue<Dp>) = apply {
            this.paddingValues = padding
        }

        override fun build(): SpinnerDimensions {
            return DefaultSpinnerDimensions(
                sizeValues = sizeValues ?: MIN_SPINNER_SIZE.dp.asStatefulValue(),
                strokeWidthValues = strokeWidthValues ?: Dp.Unspecified.asStatefulValue(),
                paddingValues = paddingValues ?: 2.dp.asStatefulValue(),
            )
        }
    }
}

private const val MIN_SPINNER_SIZE = 16f
