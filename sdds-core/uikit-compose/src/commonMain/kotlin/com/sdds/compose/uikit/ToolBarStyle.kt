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
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    val shape: CornerBasedShape

    /**
     * Форма компонента
     */
    val shapes: StatefulValue<CornerBasedShape>

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
@ApiInfo
interface ToolBarStyleBuilder : StyleBuilder<ToolBarStyle> {

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: CornerBasedShape): ToolBarStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму [shape] компонента
     */
    fun shape(shape: StatefulValue<CornerBasedShape>): ToolBarStyleBuilder

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
    override val shapes: StatefulValue<CornerBasedShape>,
    override val shadow: ShadowAppearance,
    override val dimensions: ToolBarDimensions,
    override val colors: ToolBarColors,
    override val dividerStyle: DividerStyle,
    override val orientation: ToolBarOrientation,
) : ToolBarStyle {

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: CornerBasedShape = shapes.getDefaultValue()
    class Builder : ToolBarStyleBuilder {
        private var shape: StatefulValue<CornerBasedShape>? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = ToolBarColors.builder()
        private val dimensionsBuilder = ToolBarDimensions.builder()
        private var dividerStyle: DividerStyle? = null
        private var orientation: ToolBarOrientation? = null

        override fun shape(shape: StatefulValue<CornerBasedShape>) = apply {
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
                shapes = shape ?: RoundedCornerShape(15).asStatefulValue(),
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
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ToolBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

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
    @Deprecated("Use sectionPaddingValues", replaceWith = ReplaceWith("sectionPaddingValues"))
    val sectionPadding: Dp

    /**
     * Падинг между слотами (устанавливается в конце текущего слота
     * и в начале следующего)
     */
    val sectionPaddingValues: StatefulValue<Dp>

    /**
     *  Отступ от краев Divider в горизонтальной ориентации marginTop и
     *  marginBottom в вертикальной - marginStart и marginEnd
     */
    @Deprecated("Use dividerMarginValues", replaceWith = ReplaceWith("dividerMarginValues"))
    val dividerMargin: Dp

    /**
     *  Отступ от краев Divider в горизонтальной ориентации marginTop и
     *  marginBottom в вертикальной - marginStart и marginEnd
     */
    val dividerMarginValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

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
    @ApiName(name = "slotPadding")
    fun sectionPadding(sectionPadding: Dp): ToolBarDimensionsBuilder =
        sectionPadding(sectionPadding.asStatefulValue())

    /**
     * Устанавливает отступ между слотами [sectionPadding]
     */
    @ApiName(name = "slotPadding")
    fun sectionPadding(sectionPadding: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ от краев Divider [dividerMargin]
     */
    fun dividerMargin(dividerMargin: Dp): ToolBarDimensionsBuilder =
        dividerMargin(dividerMargin.asStatefulValue())

    /**
     * Устанавливает отступ от краев Divider [dividerMargin]
     */
    fun dividerMargin(dividerMargin: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): ToolBarDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): ToolBarDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): ToolBarDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): ToolBarDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): ToolBarDimensionsBuilder

    /**
     * Создает экземпляр [ToolBarDimensions]
     */
    fun build(): ToolBarDimensions
}

private class DefaultToolBarDimensions(
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val sectionPaddingValues: StatefulValue<Dp>,
    override val dividerMarginValues: StatefulValue<Dp>,

) : ToolBarDimensions {
    @Deprecated("Use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("Use sectionPaddingValues", replaceWith = ReplaceWith("sectionPaddingValues"))
    override val sectionPadding: Dp = sectionPaddingValues.getDefaultValue()

    @Deprecated("Use dividerMarginValues", replaceWith = ReplaceWith("dividerMarginValues"))
    override val dividerMargin: Dp = dividerMarginValues.getDefaultValue()

    class Builder : ToolBarDimensionsBuilder {
        private var sectionPadding: StatefulValue<Dp>? = null
        private var dividerMargin: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null

        override fun sectionPadding(sectionPadding: StatefulValue<Dp>) = apply {
            this.sectionPadding = sectionPadding
        }

        override fun dividerMargin(dividerMargin: StatefulValue<Dp>) = apply {
            this.dividerMargin = dividerMargin
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun build(): ToolBarDimensions {
            return DefaultToolBarDimensions(
                paddingStartValues = paddingStart ?: 8.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 8.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 10.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 10.dp.asStatefulValue(),
                sectionPaddingValues = sectionPadding ?: 8.dp.asStatefulValue(),
                dividerMarginValues = dividerMargin ?: 4.dp.asStatefulValue(),
            )
        }
    }
}
