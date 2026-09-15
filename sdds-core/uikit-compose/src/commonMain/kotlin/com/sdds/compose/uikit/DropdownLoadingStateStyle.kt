package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [DropdownLoadingStateStyle] для компонента [EmptyState]
 */
val LocalDropdownLoadingStateStyle: ProvidableCompositionLocal<DropdownLoadingStateStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { DropdownLoadingStateStyle.builder().style() }

/**
 * Стиль компонента [EmptyState]
 */
@Immutable
interface DropdownLoadingStateStyle : Style {

    /**
     * Стиль кнопки действия
     */
    val buttonStyle: ButtonStyle

    /**
     * Стиль текста label
     */
    val labelStyle: StatefulValue<TextStyle>

    /**
     * Стиль спиннера
     */
    val spinnerStyle: SpinnerStyle?

    /**
     * Цвета компонента
     */
    val colors: LoadingStateColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: LoadingStateDimensions

    companion object {
        /**
         * Возвращает экземпляр [DropdownLoadingStateStyleBuilder]
         */
        fun builder(receiver: Any? = null): DropdownLoadingStateStyleBuilder =
            DefaultDropdownLoadingStateStyle.BuilderDropdown()
    }
}

/**
 * Билдер стиля компонента
 */
@ApiInfo
interface DropdownLoadingStateStyleBuilder : StyleBuilder<DropdownLoadingStateStyle> {
    /**
     * Устанавливает стиль текста label [labelStyle]
     */
    fun labelStyle(labelStyle: TextStyle): DropdownLoadingStateStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста label [labelStyle]
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): DropdownLoadingStateStyleBuilder

    /**
     * Устанавливает стиль кнопки действия [buttonStyle]
     */
    fun buttonStyle(buttonStyle: ButtonStyle): DropdownLoadingStateStyleBuilder

    /**
     * Устанавливает стиль спиннера [buttonStyle]
     */
    fun spinnerStyle(spinnerStyle: SpinnerStyle): DropdownLoadingStateStyleBuilder

    /**
     * Устанавливает цвета компонента
     */
    @Composable
    fun colors(builder: @Composable LoadingStateColorsBuilder.() -> Unit): DropdownLoadingStateStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable LoadingStateDimensionsBuilder.() -> Unit): DropdownLoadingStateStyleBuilder
}

private data class DefaultDropdownLoadingStateStyle(
    override val labelStyle: StatefulValue<TextStyle>,
    override val colors: LoadingStateColors,
    override val dimensions: LoadingStateDimensions,
    override val buttonStyle: ButtonStyle,
    override val spinnerStyle: SpinnerStyle?,
) : DropdownLoadingStateStyle {
    class BuilderDropdown : DropdownLoadingStateStyleBuilder {
        private var labelStyle: StatefulValue<TextStyle>? = null

        private var buttonStyle: ButtonStyle? = null
        private var spinnerStyle: SpinnerStyle? = null

        private val colorsBuilder: LoadingStateColorsBuilder = LoadingStateColors.builder()

        private val dimensionsBuilder: LoadingStateDimensionsBuilder = LoadingStateDimensions.builder()

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>): DropdownLoadingStateStyleBuilder =
            apply { this.labelStyle = labelStyle }

        override fun buttonStyle(buttonStyle: ButtonStyle): DropdownLoadingStateStyleBuilder =
            apply { this.buttonStyle = buttonStyle }

        override fun spinnerStyle(spinnerStyle: SpinnerStyle): DropdownLoadingStateStyleBuilder =
            apply { this.spinnerStyle = spinnerStyle }

        @Composable
        override fun colors(builder: @Composable LoadingStateColorsBuilder.() -> Unit):
            DropdownLoadingStateStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable LoadingStateDimensionsBuilder.() -> Unit):
            DropdownLoadingStateStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): DropdownLoadingStateStyle = DefaultDropdownLoadingStateStyle(
            labelStyle = labelStyle ?: TextStyle.Default.asStatefulValue(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            buttonStyle = buttonStyle ?: ButtonStyle.basicButtonBuilder().style(),
            spinnerStyle = spinnerStyle,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface LoadingStateColors {

    /**
     * Цвет текста label
     */
    val labelColor: StatefulValue<Brush>

    companion object {
        /**
         * Возвращает экземпляр [LoadingStateColorsBuilder]
         */
        fun builder(): LoadingStateColorsBuilder = DefaultLoadingStateColors.Builder()
    }
}

/**
 * Билдер для [LoadingStateColors]
 */
interface LoadingStateColorsBuilder {

    /**
     * Устанавливает цвет текста label [labelColor]
     */
    fun labelColor(labelColor: StatefulValue<Brush>): LoadingStateColorsBuilder

    /**
     * Устанавливает цвет текста label [labelColor]
     */
    fun labelColor(labelColor: Brush): LoadingStateColorsBuilder =
        labelColor(labelColor.asStatefulValue())

    /**
     * Устанавливает цвет текста label [labelColor]
     */
    fun labelColor(labelColor: InteractiveColor): LoadingStateColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста label [labelColor]
     */
    fun labelColor(labelColor: Color): LoadingStateColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Вернёт [LoadingStateColors]
     */
    fun build(): LoadingStateColors
}

private data class DefaultLoadingStateColors(
    override val labelColor: StatefulValue<Brush>,
) : LoadingStateColors {
    class Builder : LoadingStateColorsBuilder {
        private var labelColor: StatefulValue<Brush>? = null

        override fun labelColor(labelColor: StatefulValue<Brush>): LoadingStateColorsBuilder =
            apply {
                this.labelColor = labelColor
            }

        override fun build(): LoadingStateColors = DefaultLoadingStateColors(
            labelColor = labelColor ?: Color.Black.asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface LoadingStateDimensions {
    /**
     * Отступ Label
     */
    val gap: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    val paddingBottom: StatefulValue<Dp>

    companion object {
        /**
         * Возвращает экземпляр [LoadingStateDimensionsBuilder]
         */
        fun builder(): LoadingStateDimensionsBuilder = DefaultLoadingStateDimensions.Builder()
    }
}

/**
 * Билдер для [LoadingStateDimensions]
 */
interface LoadingStateDimensionsBuilder {
    /**
     * Устанавливает отступ Label от Spinner в Loading  [gap]
     */
    fun gap(gap: Dp): LoadingStateDimensionsBuilder = gap(gap.asStatefulValue())

    /**
     * Устанавливает отступ Label от Spinner в Loading  [gap]
     */
    fun gap(gap: StatefulValue<Dp>): LoadingStateDimensionsBuilder

    /**
     * Устанавливает отступ сверху в Loading [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): LoadingStateDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху в Loading [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): LoadingStateDimensionsBuilder

    /**
     * Устанавливает отступ снизу в Loading [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): LoadingStateDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу в Loading [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): LoadingStateDimensionsBuilder

    /**
     * Вернёт [LoadingStateDimensions]
     */
    fun build(): LoadingStateDimensions
}

private data class DefaultLoadingStateDimensions(
    override val gap: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
) : LoadingStateDimensions {
    class Builder : LoadingStateDimensionsBuilder {
        private var gap: StatefulValue<Dp>? = null

        private var paddingTop: StatefulValue<Dp>? = null

        private var paddingBottom: StatefulValue<Dp>? = null

        override fun gap(gap: StatefulValue<Dp>): LoadingStateDimensionsBuilder =
            apply { this.gap = gap }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): LoadingStateDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): LoadingStateDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): LoadingStateDimensions =
            DefaultLoadingStateDimensions(
                gap = gap ?: 8.dp.asStatefulValue(),
                paddingTop = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottom = paddingBottom ?: 0.dp.asStatefulValue(),
            )
    }
}
