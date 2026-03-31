package com.sdds.compose.uikit

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
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ToolBarStyle] для компонента [ToolBar]
 */
val LocalToolBarStyle = compositionLocalOf { ToolBarStyle.builder().style() }

/**
 * Стиль компонента ToolBar
 */
@Immutable
interface ToolBarStyle : Style {

    /**
     * Форма компонента
     */
    val shape: CornerBasedShape

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Стиль [Divider]
     */
    val dividerStyle: DividerStyle

    /**
     * Размеры и отступы компонента
     */
    val dimensions: ToolBarDimensions

    /**
     * Цвета компонента
     */
    val colors: ToolBarColors

    /**
     * Ориентация
     */
    val orientation: ToolBarOrientation

    companion object {
        /**
         * Возвращает экземпляр [ToolBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): ToolBarStyleBuilder = DefaultToolBarStyle.Builder()
    }
}

/**
 * Билдер стиля [ToolBarStyle]
 */
interface ToolBarStyleBuilder : StyleBuilder<ToolBarStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): ToolBarStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): ToolBarStyleBuilder

    /**
     * Устанавливает стиль разделителей [dividerStyle]
     */
    fun dividerStyle(dividerStyle: DividerStyle): ToolBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable ToolBarColorsBuilder.() -> Unit): ToolBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable ToolBarDimensionsBuilder.() -> Unit): ToolBarStyleBuilder

    /**
     * Устанавливает ориентацию
     */
    fun orientation(orientation: ToolBarOrientation): ToolBarStyleBuilder
}

private class DefaultToolBarStyle(
    override val shape: CornerBasedShape,
    override val shadow: ShadowAppearance,
    override val dimensions: ToolBarDimensions,
    override val colors: ToolBarColors,
    override val dividerStyle: DividerStyle,
    override val orientation: ToolBarOrientation,
) : ToolBarStyle {

    class Builder : ToolBarStyleBuilder {
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = ToolBarColors.builder()
        private val dimensionsBuilder = ToolBarDimensions.builder()
        private var dividerStyle: DividerStyle? = null
        private var orientation: ToolBarOrientation? = null

        override fun shape(shape: CornerBasedShape) = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        override fun dividerStyle(dividerStyle: DividerStyle) = apply {
            this.dividerStyle = dividerStyle
        }

        @Composable
        override fun colors(builder: @Composable (ToolBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (ToolBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun orientation(orientation: ToolBarOrientation) = apply {
            this.orientation = orientation
        }

        override fun style(): ToolBarStyle {
            return DefaultToolBarStyle(
                shape = shape ?: RoundedCornerShape(15),
                shadow = shadow ?: ShadowAppearance(),
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                dividerStyle = dividerStyle ?: DividerStyle.builder().style(),
                orientation = orientation ?: ToolBarOrientation.Horizontal,
            )
        }
    }
}

/**
 * Цвета компонента ToolBar
 */
@Immutable
interface ToolBarColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Brush>

    companion object {

        /**
         * Создает экземпляр [ToolBarColorsBuilder]
         */
        fun builder(): ToolBarColorsBuilder = DefaultToolBarColors.Builder()
    }
}

/**
 * Builder для [ToolBarColors]
 */
interface ToolBarColorsBuilder {

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): ToolBarColorsBuilder =
        backgroundColor(SolidColor(backgroundColor))

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Brush): ToolBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): ToolBarColorsBuilder

    /**
     * Создает экземпляр [ToolBarColors]
     */
    fun build(): ToolBarColors
}

@Immutable
private data class DefaultToolBarColors(
    override val backgroundColor: StatefulValue<Brush>,
) : ToolBarColors {

    class Builder : ToolBarColorsBuilder {
        private var backgroundColor: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun build(): ToolBarColors {
            return DefaultToolBarColors(
                backgroundColor = backgroundColor ?: SolidColor(Color.LightGray).asStatefulValue(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface ToolBarDimensions {

    /**
     * Падинг между слотами (устанавливается в конце текущего слота
     * и в начале следующего)
     */
    val sectionPadding: Dp

    /**
     *  Отступ от краев Divider в горизонтальной ориентации marginTop и
     *  marginBottom в вертикальной - marginStart и marginEnd
     */
    val dividerMargin: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    companion object {
        /**
         * Создает экземпляр [ToolBarDimensionsBuilder]
         */
        fun builder(): ToolBarDimensionsBuilder = DefaultToolBarDimensions.Builder()
    }
}

/**
 * Builder для [ToolBarDimensions]
 */
interface ToolBarDimensionsBuilder {

    /**
     * Устанавливает отступ между слотами [sectionPadding]
     */
    fun sectionPadding(sectionPadding: Dp): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ от краев Divider [dividerMargin]
     */
    fun dividerMargin(dividerMargin: Dp): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): ToolBarDimensionsBuilder

    /**
     * Создает экземпляр [ToolBarDimensions]
     */
    fun build(): ToolBarDimensions
}

private class DefaultToolBarDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val sectionPadding: Dp,
    override val dividerMargin: Dp,
) : ToolBarDimensions {

    class Builder : ToolBarDimensionsBuilder {
        private var sectionPadding: Dp? = null
        private var dividerMargin: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null

        override fun sectionPadding(sectionPadding: Dp) = apply {
            this.sectionPadding = sectionPadding
        }

        override fun dividerMargin(dividerMargin: Dp) = apply {
            this.dividerMargin = dividerMargin
        }

        override fun paddingStart(paddingStart: Dp) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): ToolBarDimensions {
            return DefaultToolBarDimensions(
                paddingStart = paddingStart ?: 8.dp,
                paddingEnd = paddingEnd ?: 8.dp,
                paddingTop = paddingTop ?: 10.dp,
                paddingBottom = paddingBottom ?: 10.dp,
                sectionPadding = sectionPadding ?: 8.dp,
                dividerMargin = dividerMargin ?: 4.dp,
            )
        }
    }
}
