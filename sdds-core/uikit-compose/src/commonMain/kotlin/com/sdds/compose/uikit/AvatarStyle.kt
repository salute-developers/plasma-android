package com.sdds.compose.uikit

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ApiName
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.AvatarDefaults
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AvatarStyle] для компонента [Avatar]
 */
val LocalAvatarStyle = compositionLocalOf { AvatarStyle.builder().style() }

/**
 * Стиль компонента [Avatar]
 */
interface AvatarStyle : Style {

    /**
     * Форма компонента
     */
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: Shape

    /**
     * Формы компонента
     */
    val shapes: StatefulValue<Shape>

    /**
     * Цвета компонента
     */
    val colors: AvatarColors

    /**
     * Размеры и отступы компонента
     */
    @Deprecated("Use dimensionValues", ReplaceWith("dimensionValues"))
    val dimensions: AvatarDimensions

    /**
     * Стиль текста
     */
    @Deprecated("Use textStyles", ReplaceWith("textStyles"))
    val textStyle: TextStyle

    /**
     * Стили текста
     */
    val textStyles: StatefulValue<TextStyle>

    /**
     * Стиль бейджа
     */
    val badgeStyle: BadgeStyle?

    /**
     * Стиль счетчика
     */
    val counterStyle: CounterStyle?

    /**
     * Стиль индикатора статуса
     */
    val statusStyle: IndicatorStyle?

    /**
     * Размеры и отступы компонента
     */
    val dimensionValues: AvatarDimensionValues

    /**
     * Включен ли вырез под индикатор статуса
     */
    val statusCutoutEnabled: Boolean

    /**
     * Стиль бейджа с иконкой
     */
    val iconBadgeStyle: BadgeStyle?

    companion object {

        /**
         * Возвращает экземпляр [AvatarStyleBuilder]
         */
        fun builder(receiver: Any? = null): AvatarStyleBuilder = DefaultAvatarStyle.Builder(receiver)
    }
}

/**
 * Builder для [AvatarStyle]
 */
@ApiInfo
interface AvatarStyleBuilder : StyleBuilder<AvatarStyle> {

    /**
     * Устанавливает форму [shape] компоненту
     * @see AvatarStyle.shapes
     */
    fun shape(shape: Shape): AvatarStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает формы [shape] компоненту
     * @see AvatarStyle.shapes
     */
    fun shape(shape: StatefulValue<Shape>): AvatarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see AvatarStyle.colors
     */
    @Composable
    fun colors(builder: @Composable AvatarColorsBuilder.() -> Unit): AvatarStyleBuilder

    /**
     * Устанавливает размеры и отступы [dimensions]
     * @see AvatarStyle.dimensions
     */
    @Deprecated("Use dimensions(AvatarDimensionsBuilder)", ReplaceWith("dimensions { }"))
    fun dimensions(dimensions: AvatarDimensions): AvatarStyleBuilder

    /**
     * Устанавливает размеры и отступы [dimensions]
     * @see AvatarStyle.dimensionValues
     */
    @Composable
    fun dimensions(builder: @Composable AvatarDimensionsBuilder.() -> Unit): AvatarStyleBuilder

    /**
     * Устанавливает стиль текста [textStyle]
     * @see AvatarStyle.textStyles
     */
    fun textStyle(textStyle: TextStyle): AvatarStyleBuilder =
        textStyle(textStyle.asStatefulValue())

    /**
     * Устанавливает стили текста [textStyle]
     * @see AvatarStyle.textStyles
     */
    fun textStyle(textStyle: StatefulValue<TextStyle>): AvatarStyleBuilder

    /**
     * Устанавливает стиль индикатора статуса [statusStyle]
     */
    fun statusStyle(statusStyle: IndicatorStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль бейджа [badgeStyle]
     */
    fun badgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль бейджа [badgeStyle]
     */
    fun iconBadgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder

    /**
     * Устанавливает стиль счетчика [counterStyle]
     */
    fun counterStyle(counterStyle: CounterStyle): AvatarStyleBuilder

    /**
     * Включает/выключает вырез под индикатор статуса
     */
    fun statusCutoutEnabled(statusCutoutEnabled: Boolean): AvatarStyleBuilder
}

/**
 * Цвета компонента [Avatar]
 */
interface AvatarColors {

    /**
     * Цвет иконки действия
     */
    @Deprecated("Use actionBrushes", ReplaceWith("actionBrushes"))
    val actionColor: Color

    /**
     * Кисти иконки действия
     */
    val actionBrushes: StatefulValue<Brush>

    /**
     * Цвет фона иконки действия
     */
    @Deprecated("Use actionScrimBrushes", ReplaceWith("actionScrimBrushes"))
    val actionScrimColor: Color

    /**
     * Кисти фона иконки действия
     */
    val actionScrimBrushes: StatefulValue<Brush>

    /**
     * Цвет текста
     */
    @Deprecated("Use textBrushes", ReplaceWith("textBrushes"))
    val textColor: Brush

    /**
     * Кисти для отрисовки текста
     */
    val textBrushes: StatefulValue<Brush>?

    /**
     * Цвета текста
     */
    @Deprecated("Use textBrushes", ReplaceWith("textBrushes"))
    val textColors: InteractiveColor?

    /**
     * Цвет фона
     */
    @Deprecated("Use backgroundBrushes: StatefulValue<Brush>>")
    val backgroundColor: List<Brush>
        get() = emptyList()

    /**
     * Кисти фона
     */
    val backgroundBrushes: StatefulValue<Brush>?

    /**
     * Цвета фона. Используются, если [backgroundBrushes] == `null`
     */
    @Deprecated("Use backgroundBrushes", ReplaceWith("backgroundBrushes"))
    val backgroundColors: InteractiveColor?

    /**
     * Прозрачность фона
     */
    @Deprecated("The property backgroundAlpha is unused")
    val backgroundAlpha: Float
        get() = 1f

    /**
     * Возвращает цвет статуса [status]
     * @see AvatarStatus
     */
    @Composable
    @Deprecated("The results of this function is unused")
    fun statusColor(status: AvatarStatus): State<Color>

    companion object {

        /**
         * Возвращает экземпляр [AvatarColorsBuilder]
         */
        fun builder(): AvatarColorsBuilder = DefaultAvatarColors.Builder()
    }
}

/**
 * Builder для [AvatarColors]
 */
interface AvatarColorsBuilder {

    /**
     * Устанавливает цвет [activeStatusColor] для статуса [AvatarStatus.Active]
     * @see AvatarColors.statusColor
     */
    @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
    fun activeStatusColor(activeStatusColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет [inactiveStatusColor] для статуса [AvatarStatus.Inactive]
     * @see AvatarColors.statusColor
     */
    @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
    fun inactiveStatusColor(inactiveStatusColor: Color): AvatarColorsBuilder

    /**
     * Устанавливает цвет [actionColor] иконки действия
     * @see AvatarColors.actionBrushes
     */
    fun actionColor(actionColor: Color): AvatarColorsBuilder =
        actionColor(actionColor.asStatefulBrush())

    /**
     * Устанавливает цвет (или градиент) [actionColor] иконки действия
     * @see AvatarColors.actionBrushes
     */
    fun actionColor(actionColor: Brush): AvatarColorsBuilder =
        actionColor(actionColor.asStatefulValue())

    /**
     * Устанавливает цвета [actionColor] иконки действия
     * @see AvatarColors.actionBrushes
     */
    fun actionColor(actionColor: InteractiveColor): AvatarColorsBuilder =
        actionColor(actionColor.asStatefulBrush())

    /**
     * Устанавливает кисти [actionColor] иконки действия
     * @see AvatarColors.actionBrushes
     */
    fun actionColor(actionColor: StatefulValue<Brush>): AvatarColorsBuilder

    /**
     * Устанавливает цвет фона [actionScrimColor] иконки действия
     * @see AvatarColors.actionScrimBrushes
     */
    fun actionScrimColor(actionScrimColor: Color): AvatarColorsBuilder =
        actionScrimColor(actionScrimColor.asStatefulBrush())

    /**
     * Устанавливает цвет (или градиент) фона [actionScrimColor] иконки действия
     * @see AvatarColors.actionScrimBrushes
     */
    fun actionScrimColor(actionScrimColor: Brush): AvatarColorsBuilder =
        actionScrimColor(actionScrimColor.asStatefulValue())

    /**
     * Устанавливает цвета фона [actionScrimColor] иконки действия
     * @see AvatarColors.actionScrimBrushes
     */
    fun actionScrimColor(actionScrimColor: InteractiveColor): AvatarColorsBuilder =
        actionScrimColor(actionScrimColor.asStatefulBrush())

    /**
     * Устанавливает кисти фона [actionScrimColor] иконки действия
     * @see AvatarColors.actionScrimBrushes
     */
    fun actionScrimColor(actionScrimColor: StatefulValue<Brush>): AvatarColorsBuilder

    /**
     * Устанавливает цвет текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: Color): AvatarColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: Brush): AvatarColorsBuilder =
        textColor(textColor.asStatefulValue())

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: StatefulValue<Brush>): AvatarColorsBuilder

    /**
     * Устанавливает цвет (или градиент) текста [textColor]
     * @see AvatarColors.textColor
     */
    fun textColor(textColor: InteractiveColor): AvatarColorsBuilder =
        textColor(textColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    @ApiName(name = "background")
    fun backgroundColor(backgroundColor: Color): AvatarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    @ApiName(name = "background")
    fun backgroundColor(backgroundColor: Brush): AvatarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    @ApiName(name = "background")
    fun backgroundColor(backgroundColor: List<Brush>): AvatarColorsBuilder = this

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    @ApiName(name = "background")
    fun backgroundColor(backgroundColor: InteractiveColor): AvatarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона [backgroundColor]
     * @see AvatarColors.backgroundColor
     */
    @ApiName(name = "background")
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): AvatarColorsBuilder

    /**
     * Устанавливает прозрачность фона [alpha]
     * @see AvatarColors.backgroundAlpha
     */
    @Deprecated("Using backgroundAlpha has no effect")
    fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = this

    /**
     * Создает экземпляр [AvatarColors]
     */
    fun build(): AvatarColors
}

/**
 * Размеры и отступы [Avatar]
 * @property statusOffsetX
 * @property statusOffsetY
 * @property width ширина аватара
 * @property height высота аватара
 */
@Immutable
interface AvatarDimensionValues {
    /**
     * Смещение статуса по горизонтали
     */
    @Deprecated("Use statusOffsetXValues", ReplaceWith("statusOffsetXValues"))
    val statusOffsetX: Dp

    /**
     * Смещения статуса по горизонтали
     */
    val statusOffsetXValues: StatefulValue<Dp>

    /**
     * Смещение статуса по вертикали
     */
    @Deprecated("Use statusOffsetYValues", ReplaceWith("statusOffsetYValues"))
    val statusOffsetY: Dp

    /**
     * Смещения статуса по вертикали
     */
    val statusOffsetYValues: StatefulValue<Dp>

    /**
     * Ширина аватара
     */
    @Deprecated("Use widthValues", ReplaceWith("widthValues"))
    val width: Dp

    /**
     * Ширины аватара
     */
    val widthValues: StatefulValue<Dp>

    /**
     * Высота аватара
     */
    @Deprecated("Use heightValues", ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Высоты аватара
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Внутренний отступ выреза индикатора статуса
     */
    @Deprecated("Use statusCutoutPaddingValues", ReplaceWith("statusCutoutPaddingValues"))
    val statusCutoutPadding: Dp

    /**
     * Внутренние отступы выреза индикатора статуса
     */
    val statusCutoutPaddingValues: StatefulValue<Dp>
}

/**
 * Билдер для [AvatarDimensionValues]
 */
interface AvatarDimensionsBuilder {

    /**
     * Устанавливает смещение статуса по горизонтали [statusOffsetX]
     */
    fun statusOffsetX(statusOffsetX: Dp): AvatarDimensionsBuilder =
        statusOffsetX(statusOffsetX.asStatefulValue())

    /**
     * Устанавливает смещения статуса по горизонтали [statusOffsetX]
     */
    fun statusOffsetX(statusOffsetX: StatefulValue<Dp>): AvatarDimensionsBuilder

    /**
     * Устанавливает смещение статуса по вертикали [statusOffsetY]
     */
    fun statusOffsetY(statusOffsetY: Dp): AvatarDimensionsBuilder =
        statusOffsetY(statusOffsetY.asStatefulValue())

    /**
     * Устанавливает смещения статуса по вертикали [statusOffsetY]
     */
    fun statusOffsetY(statusOffsetY: StatefulValue<Dp>): AvatarDimensionsBuilder

    /**
     * Устанавливает ширину аватара [width]
     */
    fun width(width: Dp): AvatarDimensionsBuilder =
        width(width.asStatefulValue())

    /**
     * Устанавливает ширины аватара [width]
     */
    fun width(width: StatefulValue<Dp>): AvatarDimensionsBuilder

    /**
     * Устанавливает высоту аватара [height]
     */
    fun height(height: Dp): AvatarDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоты аватара [height]
     */
    fun height(height: StatefulValue<Dp>): AvatarDimensionsBuilder

    /**
     * Устанавливает Внутренний отступ выреза индикатора статуса [statusCutoutPadding]
     */
    fun statusCutoutPadding(statusCutoutPadding: Dp): AvatarDimensionsBuilder =
        statusCutoutPadding(statusCutoutPadding.asStatefulValue())

    /**
     * Устанавливает Внутренние отступы выреза индикатора статуса [statusCutoutPadding]
     */
    fun statusCutoutPadding(statusCutoutPadding: StatefulValue<Dp>): AvatarDimensionsBuilder

    /**
     * Возвращает [AvatarDimensionValues]
     */
    fun build(): AvatarDimensionValues

    companion object {

        /**
         * Возвращает [AvatarDimensionsBuilder]
         */
        fun builder(): AvatarDimensionsBuilder = DefaultAvatarDimensionValues.Builder()
    }
}

/**
 * Размеры и отступы компонента [Avatar]
 * @property statusSize размера статуса
 * @property statusOffset смещение статуса относительно нижнего правого угла
 * @property actionSize размер иконки действия
 * @property size размер компонента [Avatar]
 */
@Immutable
@Deprecated("Use AvatarDimensionBuilder and AvatarDimensionsHolder")
data class AvatarDimensions(
    val statusSize: Dp = 8.dp,
    val statusOffset: Offset = Offset.Zero,
    val actionSize: Size? = null,
    val size: Dp? = null,
)

@Immutable
private data class DefaultAvatarStyle(
    override val shapes: StatefulValue<Shape>,
    override val colors: AvatarColors,
    override val textStyles: StatefulValue<TextStyle>,
    override val badgeStyle: BadgeStyle?,
    override val counterStyle: CounterStyle?,
    override val statusStyle: IndicatorStyle?,
    override val dimensionValues: AvatarDimensionValues,
    override val statusCutoutEnabled: Boolean,
    override val iconBadgeStyle: BadgeStyle?,
) : AvatarStyle {

    @Suppress("OVERRIDE_DEPRECATION")
    override val dimensions: AvatarDimensions = AvatarDimensions()

    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: Shape
        get() = shapes.getDefaultValue()

    @Deprecated("Use textStyles", ReplaceWith("textStyles"))
    override val textStyle: TextStyle
        get() = textStyles.getDefaultValue()

    class Builder(override val receiver: Any?) : AvatarStyleBuilder {
        private var shapes: StatefulValue<Shape>? = null
        private var colorsBuilder: AvatarColorsBuilder = AvatarColors.builder()
        private var dimensionsBuilder: AvatarDimensionsBuilder = AvatarDimensionsBuilder.builder()
        private var textStyles: StatefulValue<TextStyle>? = null
        private var badgeStyle: BadgeStyle? = null
        private var iconBadgeStyle: BadgeStyle? = null
        private var counterStyle: CounterStyle? = null
        private var statusStyle: IndicatorStyle? = null
        private var statusCutoutEnabled: Boolean? = null

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shapes = shape
        }

        @Composable
        override fun colors(
            builder:
            @Composable()
            (AvatarColorsBuilder.() -> Unit),
        ) = apply {
            this.colorsBuilder.builder()
        }

        @Deprecated("Use dimensions(AvatarDimensionsBuilder)", replaceWith = ReplaceWith("dimensions { }"))
        override fun dimensions(dimensions: AvatarDimensions) = apply {
            dimensionsBuilder.apply {
                width(dimensions.size ?: 0.dp)
                height(dimensions.size ?: 0.dp)
            }
        }

        @Composable
        override fun dimensions(builder: @Composable AvatarDimensionsBuilder.() -> Unit): AvatarStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply {
            this.textStyles = textStyle
        }

        override fun statusStyle(statusStyle: IndicatorStyle): AvatarStyleBuilder = apply {
            this.statusStyle = statusStyle
        }

        override fun badgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder = apply {
            this.badgeStyle = badgeStyle
        }

        override fun iconBadgeStyle(badgeStyle: BadgeStyle): AvatarStyleBuilder = apply {
            this.iconBadgeStyle = badgeStyle
        }

        override fun counterStyle(counterStyle: CounterStyle): AvatarStyleBuilder = apply {
            this.counterStyle = counterStyle
        }

        override fun statusCutoutEnabled(statusCutoutEnabled: Boolean) = apply {
            this.statusCutoutEnabled = statusCutoutEnabled
        }

        override fun style(): AvatarStyle =
            DefaultAvatarStyle(
                shapes = shapes ?: RoundedCornerShape(50).asStatefulValue(),
                colors = colorsBuilder.build(),
                textStyles = textStyles ?: TextStyle.Default.asStatefulValue(),
                badgeStyle = badgeStyle,
                counterStyle = counterStyle,
                statusStyle = statusStyle,
                dimensionValues = dimensionsBuilder.build(),
                statusCutoutEnabled = statusCutoutEnabled ?: false,
                iconBadgeStyle = iconBadgeStyle,
            )
    }
}

@Immutable
private data class DefaultAvatarColors(
    private val activeStatusColor: Color,
    private val inactiveStatusColor: Color,
    override val actionBrushes: StatefulValue<Brush>,
    override val actionScrimBrushes: StatefulValue<Brush>,
    override val textBrushes: StatefulValue<Brush>?,
    override val backgroundBrushes: StatefulValue<Brush>?,
) : AvatarColors {

    @Deprecated("Use actionBrushes", ReplaceWith("actionBrushes"))
    override val actionColor: Color
        get() = (actionBrushes.getDefaultValue() as? SolidColor)?.value ?: Color.White

    @Deprecated("Use actionScrimBrushes", ReplaceWith("actionScrimBrushes"))
    override val actionScrimColor: Color
        get() = (actionScrimBrushes.getDefaultValue() as? SolidColor)?.value ?: AvatarDefaults.DefaultScrimColor

    @Deprecated("Use backgroundBrushes", ReplaceWith("backgroundBrushes"))
    override val backgroundColor: List<Brush> = emptyList()

    @Deprecated("Use backgroundBrushes", ReplaceWith("backgroundBrushes"))
    override val backgroundColors: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("The property backgroundAlpha is unused")
    override val backgroundAlpha: Float = 0.2f

    @Deprecated("Use textBrushes", ReplaceWith("textBrushes"))
    override val textColor: Brush = textBrushes?.getDefaultValue() ?: AvatarDefaults.defaultBrush

    @Deprecated("Use textBrushes", ReplaceWith("textBrushes"))
    override val textColors: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("The results of this function is unused")
    @Composable
    override fun statusColor(status: AvatarStatus): State<Color> {
        val color = when (status) {
            AvatarStatus.None -> Color.Transparent
            AvatarStatus.Active -> activeStatusColor
            AvatarStatus.Inactive -> inactiveStatusColor
        }
        return rememberUpdatedState(newValue = color)
    }

    class Builder : AvatarColorsBuilder {

        private var activeStatusColor: Color? = null
        private var inactiveStatusColor: Color? = null
        private var actionBrushes: StatefulValue<Brush>? = null
        private var actionScrimBrushes: StatefulValue<Brush>? = null
        private var textBrush: StatefulValue<Brush>? = AvatarDefaults.defaultBrush.asStatefulValue()
        private var backgroundBrushes: StatefulValue<Brush>? = AvatarDefaults.defaultBrush.asStatefulValue()

        private var backgroundAlpha: Float? = null

        override fun backgroundColor(backgroundColor: List<Brush>): AvatarColorsBuilder =
            backgroundColor(backgroundColor.filterIsInstance<ShaderBrush>().asLayered())

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.backgroundBrushes = backgroundColor
        }

        @Deprecated("Using backgroundAlpha has no effect")
        override fun backgroundAlpha(alpha: Float): AvatarColorsBuilder = this

        @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
        override fun activeStatusColor(activeStatusColor: Color) = apply {
            this.activeStatusColor = activeStatusColor
        }

        @Deprecated("Use statusStyle", replaceWith = ReplaceWith("statusStyle()"))
        override fun inactiveStatusColor(inactiveStatusColor: Color) = apply {
            this.inactiveStatusColor = inactiveStatusColor
        }

        override fun actionColor(actionColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.actionBrushes = actionColor
        }

        override fun actionScrimColor(actionScrimColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.actionScrimBrushes = actionScrimColor
        }

        override fun textColor(textColor: StatefulValue<Brush>): AvatarColorsBuilder = apply {
            this.textBrush = textColor
        }

        override fun build(): AvatarColors =
            DefaultAvatarColors(
                activeStatusColor = activeStatusColor ?: Color.Green,
                inactiveStatusColor = inactiveStatusColor ?: Color.DarkGray,
                actionBrushes = actionBrushes ?: Color.White.asStatefulBrush(),
                actionScrimBrushes = actionScrimBrushes ?: AvatarDefaults.DefaultScrimColor.asStatefulBrush(),
                textBrushes = textBrush,
                backgroundBrushes = backgroundBrushes,
            )
    }
}

@Immutable
private data class DefaultAvatarDimensionValues(
    override val statusOffsetXValues: StatefulValue<Dp>,
    override val statusOffsetYValues: StatefulValue<Dp>,
    override val widthValues: StatefulValue<Dp>,
    override val heightValues: StatefulValue<Dp>,
    override val statusCutoutPaddingValues: StatefulValue<Dp>,
) : AvatarDimensionValues {

    @Deprecated("Use statusOffsetXValues", ReplaceWith("statusOffsetXValues"))
    override val statusOffsetX: Dp
        get() = statusOffsetXValues.getDefaultValue()

    @Deprecated("Use statusOffsetYValues", ReplaceWith("statusOffsetYValues"))
    override val statusOffsetY: Dp
        get() = statusOffsetYValues.getDefaultValue()

    @Deprecated("Use widthValues", ReplaceWith("widthValues"))
    override val width: Dp
        get() = widthValues.getDefaultValue()

    @Deprecated("Use heightValues", ReplaceWith("heightValues"))
    override val height: Dp
        get() = heightValues.getDefaultValue()

    @Deprecated("Use statusCutoutPaddingValues", ReplaceWith("statusCutoutPaddingValues"))
    override val statusCutoutPadding: Dp
        get() = statusCutoutPaddingValues.getDefaultValue()

    class Builder : AvatarDimensionsBuilder {
        private var statusOffsetXValues: StatefulValue<Dp> = 0.dp.asStatefulValue()
        private var statusOffsetYValues: StatefulValue<Dp> = 0.dp.asStatefulValue()
        private var widthValues: StatefulValue<Dp> = 0.dp.asStatefulValue()
        private var heightValues: StatefulValue<Dp> = 0.dp.asStatefulValue()
        private var statusCutoutPaddingValues: StatefulValue<Dp> = 3.dp.asStatefulValue()

        override fun statusOffsetX(statusOffsetX: StatefulValue<Dp>): AvatarDimensionsBuilder = apply {
            this.statusOffsetXValues = statusOffsetX
        }

        override fun statusOffsetY(statusOffsetY: StatefulValue<Dp>): AvatarDimensionsBuilder = apply {
            this.statusOffsetYValues = statusOffsetY
        }

        override fun width(width: StatefulValue<Dp>): AvatarDimensionsBuilder = apply {
            this.widthValues = width
        }

        override fun height(height: StatefulValue<Dp>): AvatarDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun statusCutoutPadding(statusCutoutPadding: StatefulValue<Dp>): AvatarDimensionsBuilder = apply {
            this.statusCutoutPaddingValues = statusCutoutPadding
        }

        override fun build(): AvatarDimensionValues {
            return DefaultAvatarDimensionValues(
                statusOffsetXValues,
                statusOffsetYValues,
                widthValues,
                heightValues,
                statusCutoutPaddingValues,
            )
        }
    }
}
