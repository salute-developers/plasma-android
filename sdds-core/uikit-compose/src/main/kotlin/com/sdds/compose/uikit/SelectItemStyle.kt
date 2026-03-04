package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
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
    val shape: Shape

    /**
     * Иконка элемента.
     * @return ресурс иконки или null, если иконка не задана
     */
    @get:DrawableRes
    val icon: Int?

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
    fun shape(shape: Shape): SelectItemStyleBuilder

    /**
     * Устанавливает иконку элемента.
     * @param icon ресурс иконки
     */
    fun icon(@DrawableRes icon: Int): SelectItemStyleBuilder

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
    override val icon: Int?,
    override val disableAlpha: Float,
    override val shape: Shape,
) : SelectItemStyle {
    class Builder : SelectItemStyleBuilder {
        private var icon: Int? = null
        private var itemType: SelectItemType? = null
        private var shape: Shape? = null
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

        override fun shape(shape: Shape) = apply {
            this.shape = shape
        }

        override fun icon(icon: Int): SelectItemStyleBuilder = apply {
            this.icon = icon
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
            disableAlpha = disableAlpha ?: 0.4f,
            shape = shape ?: RectangleShape,
            icon = icon,
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
    val iconColor: InteractiveColor

    /**
     * Цвет фона в различных состояниях.
     */
    val backgroundColor: InteractiveColor

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
    fun iconColor(iconColor: InteractiveColor): SelectItemColorsBuilder

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
    fun backgroundColor(backgroundColor: InteractiveColor): SelectItemColorsBuilder

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
    override val iconColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
) : SelectItemColors {
    class Builder : SelectItemColorsBuilder {
        private var iconColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null

        override fun iconColor(iconColor: InteractiveColor): SelectItemColorsBuilder =
            apply { this.iconColor = iconColor }

        override fun backgroundColor(backgroundColor: InteractiveColor): SelectItemColorsBuilder =
            apply { this.backgroundColor = backgroundColor }

        override fun build(): SelectItemColors = DefaultSelectItemColors(
            iconColor = iconColor ?: Color.Gray.asInteractive(),
            backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(
                focused = Color.LightGray,
            ),
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
    val controlSize: Dp

    /**
     * Отступ от элемента управления до контента.
     */
    val controlMargin: Dp

    /**
     * Внутренний отступ слева.
     */
    val paddingStart: Dp

    /**
     * Внутренний отступ справа.
     */
    val paddingEnd: Dp

    /**
     * Внутренний отступ сверху.
     */
    val paddingTop: Dp

    /**
     * Внутренний отступ снизу.
     */
    val paddingBottom: Dp

    /**
     * Минимальная высота элемента.
     */
    val height: Dp

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
    fun controlSize(controlSize: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает отступ от элемента управления.
     * @param controlMargin отступ в dp
     */
    fun controlMargin(controlMargin: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ слева.
     * @param paddingStart отступ в dp
     */
    fun paddingStart(paddingStart: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ справа.
     * @param paddingEnd отступ в dp
     */
    fun paddingEnd(paddingEnd: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху.
     * @param paddingTop отступ в dp
     */
    fun paddingTop(paddingTop: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу.
     * @param paddingBottom отступ в dp
     */
    fun paddingBottom(paddingBottom: Dp): SelectItemDimensionsBuilder

    /**
     * Устанавливает минимальную высоту элемента.
     * @param height высота в dp
     */
    fun height(height: Dp): SelectItemDimensionsBuilder

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
    override val controlSize: Dp,
    override val controlMargin: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val height: Dp,
) : SelectItemDimensions {
    class Builder : SelectItemDimensionsBuilder {
        private var controlSize: Dp? = null
        private var controlMargin: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var height: Dp? = null

        override fun controlSize(controlSize: Dp): SelectItemDimensionsBuilder = apply {
            this.controlSize = controlSize
        }

        override fun controlMargin(controlMargin: Dp): SelectItemDimensionsBuilder = apply {
            this.controlMargin = controlMargin
        }

        override fun paddingStart(paddingStart: Dp): SelectItemDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp): SelectItemDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: Dp): SelectItemDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp): SelectItemDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun height(height: Dp) = apply {
            this.height = height
        }

        override fun build(): SelectItemDimensions = DefaultSelectItemDimensions(
            controlSize = controlSize ?: 24.dp,
            controlMargin = controlMargin ?: 8.dp,
            paddingStart = paddingStart ?: 8.dp,
            paddingEnd = paddingEnd ?: 8.dp,
            paddingTop = paddingTop ?: 8.dp,
            paddingBottom = paddingBottom ?: 8.dp,
            height = height ?: 48.dp,
        )
    }
}
