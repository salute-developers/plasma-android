package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [SelectItemStyle] для компонента [SelectItem]
 */
val LocalSelectItemStyle: ProvidableCompositionLocal<SelectItemStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { SelectItemStyle.builder().style() }

/**
 * Стиль компонента SelectItem.
 * Определяет визуальное представление элемента выбора в списке.
 * Собственные реализации интерфейсов стиля и билдеров должны поддерживать StatefulValue-свойства.
 */
@Immutable
interface SelectItemStyle : Style {
    /**
     * Цвета компонента в различных состояниях.
     */
    val colors: SelectItemColors

    /**
     * Размеры и отступы компонента.
     */
    val dimensions: SelectItemDimensions

    /**
     * Тип элемента выбора (одиночный, множественный).
     */
    val itemType: SelectItemType

    /**
     * Прозрачность компонента в отключенном состоянии.
     * Значение от 0.0 до 1.0, где 1.0 - полностью непрозрачный.
     */
    val disableAlpha: Float

    /**
     * Стиль чекбокса для множественного выбора.
     */
    val checkBoxStyle: CheckBoxStyle

    /**
     * Стиль ячейки элемента.
     */
    val cellStyle: CellStyle

    /**
     * Форма элемента.
     */
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    val shape: Shape

    /**
     * Форма для состояний компонента; переключается без интерполяции.
     */
    val shapes: StatefulValue<Shape>

    /**
     * Иконка элемента.
     * @return ресурс иконки или null, если иконка не задана
     */
    @Deprecated("Use iconSource", replaceWith = ReplaceWith("iconSource"))
    @get:DrawableRes
    val icon: Int?
        get() = null

    /**
     * Источник изображения иконки элемента.
     * @return источник изображения иконки или null, если иконка не задана
     */
    val iconSource: ImageSource?
        get() = null

    companion object {
        /**
         * Создает новый экземпляр билдера стиля.
         * @return билдер для конфигурации стиля
         */
        fun builder(receiver: Any? = null): SelectItemStyleBuilder =
            DefaultSelectItemStyle.Builder()
    }
}

/**
 * Билдер для создания стиля [SelectItem].
 */
@ApiInfo
interface SelectItemStyleBuilder : StyleBuilder<SelectItemStyle> {

    /**
     * Устанавливает тип элемента Select.
     * @param itemType тип элемента (Multiple, Single)
     */
    fun itemType(itemType: SelectItemType): SelectItemStyleBuilder

    /**
     * Устанавливает прозрачность в отключенном состоянии.
     * @param disableAlpha значение прозрачности (0.0 - 1.0)
     */
    fun disableAlpha(disableAlpha: Float): SelectItemStyleBuilder

    /**
     * Устанавливает форму элемента.
     * @param shape форма
     */
    fun shape(shape: Shape): SelectItemStyleBuilder = shape(shape.asStatefulValue())

    /**
     * Устанавливает формы для состояний компонента.
     */
    fun shape(shape: StatefulValue<Shape>): SelectItemStyleBuilder

    /**
     * Устанавливает источник изображения иконки элемента.
     * @param icon источник изображения иконки
     */
    fun icon(icon: ImageSource): SelectItemStyleBuilder

    /**
     * Устанавливает иконку элемента.
     * @param icon ресурс иконки
     */
    @Deprecated(
        "Use icon with ImageSource",
        replaceWith = ReplaceWith("icon(icon)"),
        level = DeprecationLevel.ERROR,
    )
    fun icon(@DrawableRes icon: Int): SelectItemStyleBuilder = this

    /**
     * Устанавливает стиль чекбокса для множественного выбора.
     * @param checkBoxStyle стиль чекбокса
     */
    fun checkboxStyle(checkBoxStyle: CheckBoxStyle): SelectItemStyleBuilder

    /**
     * Устанавливает стиль ячейки элемента.
     * @param cellStyle стиль ячейки
     */
    fun cellStyle(cellStyle: CellStyle): SelectItemStyleBuilder

    /**
     * Конфигурирует цвета компонента.
     * @param builder лямбда для настройки цветов
     */
    @Composable
    fun colors(builder: @Composable SelectItemColorsBuilder.() -> Unit): SelectItemStyleBuilder

    /**
     * Конфигурирует размеры и отступы компонента.
     * @param builder лямбда для настройки размеров
     */
    @Composable
    fun dimensions(builder: @Composable SelectItemDimensionsBuilder.() -> Unit): SelectItemStyleBuilder
}

/**
 * Реализация SelectItemStyle по умолчанию.
 */
private data class DefaultSelectItemStyle(
    override val colors: SelectItemColors,
    override val dimensions: SelectItemDimensions,
    override val itemType: SelectItemType,
    override val checkBoxStyle: CheckBoxStyle,
    override val cellStyle: CellStyle,
    override val iconSource: ImageSource?,
    override val disableAlpha: Float,
    override val shapes: StatefulValue<Shape>,
) : SelectItemStyle {
    @Deprecated("Use shapes", ReplaceWith("shapes"))
    override val shape: Shape = shapes.getDefaultValue()

    @Deprecated("Use iconSource", replaceWith = ReplaceWith("iconSource"))
    override val icon: Int? = null

    class Builder : SelectItemStyleBuilder {
        private var iconSource: ImageSource? = null
        private var itemType: SelectItemType? = null
        private var shape: StatefulValue<Shape>? = null
        private var disableAlpha: Float? = null
        private var checkBoxStyle: CheckBoxStyle? = null
        private var cellStyle: CellStyle? = null
        private val colorsBuilder: SelectItemColorsBuilder = SelectItemColors.builder()
        private val dimensionsBuilder: SelectItemDimensionsBuilder = SelectItemDimensions.builder()

        override fun itemType(itemType: SelectItemType): SelectItemStyleBuilder = apply {
            this.itemType = itemType
        }

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shape = shape
        }

        override fun icon(icon: ImageSource): SelectItemStyleBuilder = apply {
            this.iconSource = icon
        }

        override fun checkboxStyle(checkBoxStyle: CheckBoxStyle) = apply {
            this.checkBoxStyle = checkBoxStyle
        }

        override fun cellStyle(cellStyle: CellStyle) = apply {
            this.cellStyle = cellStyle
        }

        @Composable
        override fun colors(builder: @Composable SelectItemColorsBuilder.() -> Unit):
            SelectItemStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable SelectItemDimensionsBuilder.() -> Unit):
            SelectItemStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): SelectItemStyle = DefaultSelectItemStyle(
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            itemType = itemType ?: SelectItemType.Multiple,
            checkBoxStyle = checkBoxStyle ?: CheckBoxStyle.builder().style(),
            cellStyle = cellStyle ?: CellStyle.builder().style(),
            iconSource = iconSource,
            disableAlpha = disableAlpha ?: 0.4f,
            shapes = shape ?: RectangleShape.asStatefulValue(),
        )
    }
}

/**
 * Цветовая схема компонента SelectItem.
 * Определяет цвета для различных состояний и элементов.
 */
@Immutable
interface SelectItemColors {
    /**
     * Цвет иконки в различных состояниях.
     */
    @Deprecated("Use iconBrush", ReplaceWith("iconBrush"))
    val iconColor: InteractiveColor

    /**
     * Заливка для состояний компонента. Устаревший getter цвета возвращает Color.Transparent.
     */
    val iconBrush: StatefulValue<Brush>

    /**
     * Цвет фона в различных состояниях.
     */
    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Заливка для состояний компонента. Устаревший getter цвета возвращает Color.Transparent.
     */
    val backgroundBrush: StatefulValue<Brush>

    companion object {
        /**
         * Создает новый билдер для конфигурации цветов.
         * @return билдер цветов
         */
        fun builder(): SelectItemColorsBuilder = DefaultSelectItemColors.Builder()
    }
}

/**
 * Билдер для настройки цветовой схемы SelectItem.
 */
interface SelectItemColorsBuilder {
    /**
     * Устанавливает цвет иконки как интерактивный цвет.
     * @param iconColor цвет с поддержкой различных состояний
     */
    fun iconColor(iconColor: InteractiveColor): SelectItemColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает заливки для состояний компонента.
     */
    fun iconColor(iconColor: StatefulValue<Brush>): SelectItemColorsBuilder

    /**
     * Устанавливает заливку компонента.
     */
    fun iconColor(iconColor: Brush): SelectItemColorsBuilder = iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки как обычный цвет.
     * Автоматически преобразуется в интерактивный цвет с одинаковыми значениями для всех состояний.
     * @param iconColor обычный цвет
     */
    fun iconColor(iconColor: Color): SelectItemColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет фона как интерактивный цвет.
     * @param backgroundColor цвет с поддержкой различных состояний
     */
    fun backgroundColor(backgroundColor: InteractiveColor): SelectItemColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает заливки для состояний компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Brush>): SelectItemColorsBuilder

    /**
     * Устанавливает заливку компонента.
     */
    fun backgroundColor(
        backgroundColor: Brush,
    ): SelectItemColorsBuilder = backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает цвет фона как обычный цвет.
     * Автоматически преобразуется в интерактивный цвет с одинаковыми значениями для всех состояний.
     * @param backgroundColor обычный цвет
     */
    fun backgroundColor(backgroundColor: Color): SelectItemColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Создает экземпляр SelectItemColors с настроенными параметрами.
     * @return готовый объект цветов
     */
    fun build(): SelectItemColors
}

/**
 * Реализация SelectItemColors по умолчанию.
 */
private data class DefaultSelectItemColors(
    override val iconBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
) : SelectItemColors {
    @Deprecated("Use iconBrush", ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("Use backgroundBrush", ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : SelectItemColorsBuilder {
        private var iconColor: StatefulValue<Brush>? = null
        private var backgroundColor: StatefulValue<Brush>? = null

        override fun iconColor(iconColor: StatefulValue<Brush>): SelectItemColorsBuilder =
            apply { this.iconColor = iconColor }

        override fun backgroundColor(backgroundColor: StatefulValue<Brush>): SelectItemColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun build(): SelectItemColors = DefaultSelectItemColors(
            iconBrush = iconColor ?: Color.Gray.asInteractive().asStatefulBrush(),
            backgroundBrush = backgroundColor ?: Color.Transparent.asInteractive(
                focused = Color.LightGray,
            ).asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента SelectItem.
 * Определяет геометрические параметры элемента.
 */
@Immutable
interface SelectItemDimensions {
    /**
     * Размер элемента управления (чекбокс, радио-кнопка).
     */
    @Deprecated("Use controlSizeValues", ReplaceWith("controlSizeValues"))
    val controlSize: Dp

    /**
     * Значения [controlSize] для состояний компонента.
     */
    val controlSizeValues: StatefulValue<Dp>

    /**
     * Отступ от элемента управления до контента.
     */
    @Deprecated("Use controlMarginValues", ReplaceWith("controlMarginValues"))
    val controlMargin: Dp

    /**
     * Значения [controlMargin] для состояний компонента.
     */
    val controlMarginValues: StatefulValue<Dp>

    /**
     * Внутренний отступ слева.
     */
    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Значения [paddingStart] для состояний компонента.
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Внутренний отступ справа.
     */
    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Значения [paddingEnd] для состояний компонента.
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Внутренний отступ сверху.
     */
    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Значения [paddingTop] для состояний компонента.
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Внутренний отступ снизу.
     */
    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Значения [paddingBottom] для состояний компонента.
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Минимальная высота элемента.
     */
    @Deprecated("Use heightValues", ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Значения [height] для состояний компонента.
     */
    val heightValues: StatefulValue<Dp>

    companion object {
        /**
         * Создает новый билдер для конфигурации размеров.
         * @return билдер размеров
         */
        fun builder(): SelectItemDimensionsBuilder = DefaultSelectItemDimensions.Builder()
    }
}

/**
 * Билдер для настройки размеров и отступов SelectItem.
 */
interface SelectItemDimensionsBuilder {
    /**
     * Устанавливает размер элемента управления.
     * @param controlSize размер в dp
     */
    fun controlSize(controlSize: Dp): SelectItemDimensionsBuilder = controlSize(controlSize.asStatefulValue())

    /**
     * Устанавливает [controlSize] для состояний компонента.
     */
    fun controlSize(controlSize: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает отступ от элемента управления.
     * @param controlMargin отступ в dp
     */
    fun controlMargin(controlMargin: Dp): SelectItemDimensionsBuilder = controlMargin(controlMargin.asStatefulValue())

    /**
     * Устанавливает [controlMargin] для состояний компонента.
     */
    fun controlMargin(controlMargin: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ слева.
     * @param paddingStart отступ в dp
     */
    fun paddingStart(paddingStart: Dp): SelectItemDimensionsBuilder = paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает [paddingStart] для состояний компонента.
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ справа.
     * @param paddingEnd отступ в dp
     */
    fun paddingEnd(paddingEnd: Dp): SelectItemDimensionsBuilder = paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает [paddingEnd] для состояний компонента.
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху.
     * @param paddingTop отступ в dp
     */
    fun paddingTop(paddingTop: Dp): SelectItemDimensionsBuilder = paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает [paddingTop] для состояний компонента.
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу.
     * @param paddingBottom отступ в dp
     */
    fun paddingBottom(paddingBottom: Dp): SelectItemDimensionsBuilder = paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает [paddingBottom] для состояний компонента.
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Устанавливает минимальную высоту элемента.
     * @param height высота в dp
     */
    fun height(height: Dp): SelectItemDimensionsBuilder = height(height.asStatefulValue())

    /**
     * Устанавливает [height] для состояний компонента.
     */
    fun height(height: StatefulValue<Dp>): SelectItemDimensionsBuilder

    /**
     * Создает экземпляр [SelectItemDimensions] с настроенными параметрами.
     * @return готовый объект размеров
     */
    fun build(): SelectItemDimensions
}

/**
 * Реализация SelectItemDimensions по умолчанию.
 */
private data class DefaultSelectItemDimensions(
    override val controlSizeValues: StatefulValue<Dp>,
    override val controlMarginValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val heightValues: StatefulValue<Dp>,
) : SelectItemDimensions {
    @Deprecated("Use controlSizeValues", ReplaceWith("controlSizeValues"))
    override val controlSize: Dp = controlSizeValues.getDefaultValue()

    @Deprecated("Use controlMarginValues", ReplaceWith("controlMarginValues"))
    override val controlMargin: Dp = controlMarginValues.getDefaultValue()

    @Deprecated("Use paddingStartValues", ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("Use paddingEndValues", ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    @Deprecated("Use paddingTopValues", ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("Use paddingBottomValues", ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("Use heightValues", ReplaceWith("heightValues"))
    override val height: Dp = heightValues.getDefaultValue()

    class Builder : SelectItemDimensionsBuilder {
        private var controlSize: StatefulValue<Dp>? = null
        private var controlMargin: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var height: StatefulValue<Dp>? = null

        override fun controlSize(controlSize: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.controlSize = controlSize
        }

        override fun controlMargin(controlMargin: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.controlMargin = controlMargin
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): SelectItemDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun height(height: StatefulValue<Dp>) = apply {
            this.height = height
        }

        override fun build(): SelectItemDimensions = DefaultSelectItemDimensions(
            controlSizeValues = controlSize ?: 24.dp.asStatefulValue(),
            controlMarginValues = controlMargin ?: 8.dp.asStatefulValue(),
            paddingStartValues = paddingStart ?: 8.dp.asStatefulValue(),
            paddingEndValues = paddingEnd ?: 8.dp.asStatefulValue(),
            paddingTopValues = paddingTop ?: 8.dp.asStatefulValue(),
            paddingBottomValues = paddingBottom ?: 8.dp.asStatefulValue(),
            heightValues = height ?: 48.dp.asStatefulValue(),
        )
    }
}
