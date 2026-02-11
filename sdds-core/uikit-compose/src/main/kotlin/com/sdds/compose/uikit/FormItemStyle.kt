package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [FormItemStyle] для компонента [FormItem]
 */
val LocalFormItemStyle: ProvidableCompositionLocal<FormItemStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { FormItemStyle.builder().style() }

/**
 * Стиль компонента [FormItem]
 */
@Immutable
interface FormItemStyle : Style {
    /**
     * Стиль заголовка
     */
    val titleStyle: TextStyle

    /**
     * Стиль optional-текста
     */
    val optionalStyle: TextStyle

    /**
     * Стиль дополнительного заголовка
     */
    val titleCaptionStyle: TextStyle

    /**
     * Стиль надписи
     */
    val captionStyle: TextStyle

    /**
     * Стиль счетчика
     */
    val counterStyle: TextStyle

    /**
     * Значение альфы в состоянии disabled
     */
    val disableAlpha: Float

    /**
     * Цвета компонента [FormItem]
     */
    val colors: FormItemColors

    /**
     * Размеры и отступы компонента [FormItem]
     */
    val dimensions: FormItemDimensions

    /**
     * Иконка кнопки подсказки
     */
    @get:DrawableRes
    val hintIcon: Int?

    /**
     * Расположение заголовка [FormTitlePlacement]
     */
    val titlePlacement: FormTitlePlacement

    /**
     * Тип формы [FormType]
     */
    val formItemType: FormType

    /**
     * Выравнивание нижнего текста [FormBottomTextAlignment]
     */
    val bottomTextAlignment: FormBottomTextAlignment

    /**
     * Режим выравнивания индикатора [IndicatorMode]
     */
    val indicatorAlignmentMode: IndicatorMode

    /**
     * Выравнивание индикатора [FormIndicatorAlignment]
     */
    val indicatorAlignment: FormIndicatorAlignment

    /**
     * Стиль индикатора
     */
    val indicatorStyle: IndicatorStyle

    companion object {
        /**
         * Возвращает экземпляр [FormItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): FormItemStyleBuilder =
            DefaultFormItemStyle.Builder()
    }
}

/**
 * Билдер стиля компонента [FormItem]
 */
interface FormItemStyleBuilder : StyleBuilder<FormItemStyle> {

    /**
     * Устанавливает значение альфы в disable состоянии
     *
     * @param disableAlpha значение альфы в disable состоянии
     */
    fun disableAlpha(disableAlpha: Float): FormItemStyleBuilder

    /**
     * Устанавливает стиль индикатора
     *
     * @param indicatorStyle стиль индикатора
     */
    fun indicatorStyle(indicatorStyle: IndicatorStyle): FormItemStyleBuilder

    /**
     * Устанавливает расположение заголовка
     *
     * @param titlePlacement расположение заголовка [FormTitlePlacement]
     */
    fun titlePlacement(titlePlacement: FormTitlePlacement): FormItemStyleBuilder

    /**
     * Устанавливает тип формы
     *
     * @param formItemType тип формы [FormType]
     */
    fun formItemType(formItemType: FormType): FormItemStyleBuilder

    /**
     * Устанавливает выравнивание нижнего текста
     *
     * @param bottomTextAlignment выравнивание нижнего текста [FormBottomTextAlignment]
     */
    fun bottomTextAlignment(bottomTextAlignment: FormBottomTextAlignment): FormItemStyleBuilder

    /**
     * Устанавливает режим выравнивания индикатора
     *
     * @param indicatorAlignmentMode режим выравнивания индикатора [IndicatorMode]
     */
    fun indicatorAlignmentMode(indicatorAlignmentMode: IndicatorMode): FormItemStyleBuilder

    /**
     * Устанавливает выравнивание индикатора
     *
     * @param indicatorAlignment выравнивание индикатора [FormIndicatorAlignment]
     */
    fun indicatorAlignment(indicatorAlignment: FormIndicatorAlignment): FormItemStyleBuilder

    /**
     * Устанавливает иконку кнопки подсказки
     *
     * @param hintIcon идентификатор ресурса иконки кнопки подсказки
     */
    fun hintIcon(@DrawableRes hintIcon: Int): FormItemStyleBuilder

    /**
     * Устанавливает стиль заголовка
     *
     * @param titleStyle стиль заголовка
     */
    fun titleStyle(titleStyle: TextStyle): FormItemStyleBuilder

    /**
     * Устанавливает стиль optional-текста
     *
     * @param optionalStyle стиль optional-текста
     */
    fun optionalStyle(optionalStyle: TextStyle): FormItemStyleBuilder

    /**
     * Устанавливает стиль дополнительного заголовка
     *
     * @param titleCaptionStyle стиль дополнительного заголовка
     */
    fun titleCaptionStyle(titleCaptionStyle: TextStyle): FormItemStyleBuilder

    /**
     * Устанавливает стиль надписи
     *
     * @param captionStyle стиль надписи
     */
    fun captionStyle(captionStyle: TextStyle): FormItemStyleBuilder

    /**
     * Устанавливает стиль счетчика
     *
     * @param counterStyle стиль счетчика
     */
    fun counterStyle(counterStyle: TextStyle): FormItemStyleBuilder

    /**
     * Устанавливает цвета компонента [FormItem] с помощью DSL-билдера
     *
     * @param builder лямбда для настройки цветов через [FormItemColorsBuilder]
     */
    @Composable
    fun colors(builder: @Composable FormItemColorsBuilder.() -> Unit): FormItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [FormItem] с помощью DSL-билдера
     *
     * @param builder лямбда для настройки размеров через [FormItemDimensionsBuilder]
     */
    @Composable
    fun dimensions(builder: @Composable FormItemDimensionsBuilder.() -> Unit): FormItemStyleBuilder
}

private data class DefaultFormItemStyle(
    override val titleStyle: TextStyle,
    override val optionalStyle: TextStyle,
    override val titleCaptionStyle: TextStyle,
    override val captionStyle: TextStyle,
    override val counterStyle: TextStyle,
    override val disableAlpha: Float,
    override val colors: FormItemColors,
    override val dimensions: FormItemDimensions,
    override val titlePlacement: FormTitlePlacement,
    override val formItemType: FormType,
    override val bottomTextAlignment: FormBottomTextAlignment,
    override val indicatorAlignmentMode: IndicatorMode,
    override val indicatorAlignment: FormIndicatorAlignment,
    override val hintIcon: Int?,
    override val indicatorStyle: IndicatorStyle,
) : FormItemStyle {
    class Builder : FormItemStyleBuilder {
        private var indicatorStyle: IndicatorStyle? = null
        private var titlePlacement: FormTitlePlacement? = null
        private var formItemType: FormType? = null
        private var indicatorAlignmentMode: IndicatorMode? = null
        private var indicatorAlignment: FormIndicatorAlignment? = null
        private var bottomTextAlignment: FormBottomTextAlignment? = null
        private var titleStyle: TextStyle? = null
        private var optionalStyle: TextStyle? = null
        private var titleCaptionStyle: TextStyle? = null
        private var captionStyle: TextStyle? = null
        private var counterStyle: TextStyle? = null
        private var disableAlpha: Float? = null
        private val colorsBuilder: FormItemColorsBuilder = FormItemColors.builder()
        private val dimensionsBuilder: FormItemDimensionsBuilder = FormItemDimensions.builder()

        private var hintIcon: Int? = null

        override fun disableAlpha(disableAlpha: Float) = apply {
            this.disableAlpha = disableAlpha
        }

        override fun indicatorStyle(indicatorStyle: IndicatorStyle) = apply {
            this.indicatorStyle = indicatorStyle
        }

        override fun titlePlacement(titlePlacement: FormTitlePlacement) = apply {
            this.titlePlacement = titlePlacement
        }

        override fun formItemType(formItemType: FormType) = apply {
            this.formItemType = formItemType
        }

        override fun bottomTextAlignment(bottomTextAlignment: FormBottomTextAlignment) = apply {
            this.bottomTextAlignment = bottomTextAlignment
        }

        override fun indicatorAlignmentMode(indicatorAlignmentMode: IndicatorMode) =
            apply {
                this.indicatorAlignmentMode = indicatorAlignmentMode
            }

        override fun indicatorAlignment(indicatorAlignment: FormIndicatorAlignment) = apply {
            this.indicatorAlignment = indicatorAlignment
        }

        override fun hintIcon(hintIcon: Int) = apply {
            this.hintIcon = hintIcon
        }

        override fun titleStyle(titleStyle: TextStyle): FormItemStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun optionalStyle(optionalStyle: TextStyle): FormItemStyleBuilder = apply {
            this.optionalStyle = optionalStyle
        }

        override fun titleCaptionStyle(titleCaptionStyle: TextStyle): FormItemStyleBuilder =
            apply { this.titleCaptionStyle = titleCaptionStyle }

        override fun captionStyle(captionStyle: TextStyle): FormItemStyleBuilder = apply {
            this.captionStyle = captionStyle
        }

        override fun counterStyle(counterStyle: TextStyle): FormItemStyleBuilder = apply {
            this.counterStyle = counterStyle
        }

        @Composable
        override fun colors(builder: @Composable FormItemColorsBuilder.() -> Unit):
            FormItemStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable FormItemDimensionsBuilder.() -> Unit):
            FormItemStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): FormItemStyle = DefaultFormItemStyle(
            titleStyle = titleStyle ?: TextStyle.Default,
            optionalStyle = optionalStyle ?: TextStyle.Default,
            titleCaptionStyle = titleCaptionStyle ?: TextStyle.Default,
            captionStyle = captionStyle ?: TextStyle.Default,
            counterStyle = counterStyle ?: TextStyle.Default,
            disableAlpha = disableAlpha ?: 0.4f,
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            titlePlacement = titlePlacement ?: FormTitlePlacement.Top,
            bottomTextAlignment = bottomTextAlignment ?: FormBottomTextAlignment.Edge,
            formItemType = formItemType ?: FormType.Optional,
            indicatorAlignmentMode = indicatorAlignmentMode ?: IndicatorMode.Inner,
            indicatorAlignment = indicatorAlignment ?: FormIndicatorAlignment.CenterEnd,
            hintIcon = hintIcon,
            indicatorStyle = indicatorStyle ?: IndicatorStyle.builder().style(),
        )
    }
}

/**
 * Цвета компонента [FormItem]
 *
 * Определяет цветовую схему для различных элементов компонента формы
 */
@Immutable
interface FormItemColors {
    /**
     * Цвет заголовка
     */
    val titleColor: InteractiveColor

    /**
     * Цвет optional-текста (необязательного текста)
     */
    val optionalColor: InteractiveColor

    /**
     * Цвет дополнительного заголовка
     */
    val titleCaptionColor: InteractiveColor

    /**
     * Цвет надписи (подсказки или пояснительного текста)
     */
    val captionColor: InteractiveColor

    /**
     * Цвет счетчика (например, количества символов)
     */
    val counterColor: InteractiveColor

    /**
     * Цвет иконки подсказки
     */
    val hintColor: InteractiveColor

    companion object {
        /**
         * Возвращает экземпляр [FormItemColorsBuilder] для создания пользовательских цветов
         */
        fun builder(): FormItemColorsBuilder = DefaultFormItemColors.Builder()
    }
}

/**
 * Билдер для создания пользовательских [FormItemColors]
 *
 * Позволяет настроить цвета компонента [FormItem] через методы-сеттеры
 * Каждый цвет может быть установлен как [InteractiveColor] или как обычный [Color]
 */
interface FormItemColorsBuilder {
    /**
     * Устанавливает цвет заголовка
     *
     * @param titleColor цвет заголовка как [InteractiveColor]
     */
    fun titleColor(titleColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет заголовка
     *
     * @param titleColor цвет заголовка как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun titleColor(titleColor: Color): FormItemColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет optional-текста
     *
     * @param optionalColor цвет optional-текста как [InteractiveColor]
     */
    fun optionalColor(optionalColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет optional-текста
     *
     * @param optionalColor цвет optional-текста как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun optionalColor(optionalColor: Color): FormItemColorsBuilder =
        optionalColor(optionalColor.asInteractive())

    /**
     * Устанавливает цвет дополнительного заголовка
     *
     * @param titleCaptionColor цвет дополнительного заголовка как [InteractiveColor]
     */
    fun titleCaptionColor(titleCaptionColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет дополнительного заголовка
     *
     * @param titleCaptionColor цвет дополнительного заголовка как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun titleCaptionColor(titleCaptionColor: Color): FormItemColorsBuilder =
        titleCaptionColor(titleCaptionColor.asInteractive())

    /**
     * Устанавливает цвет надписи (подсказки или пояснительного текста)
     *
     * @param captionColor цвет надписи как [InteractiveColor]
     */
    fun captionColor(captionColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет надписи (подсказки или пояснительного текста)
     *
     * @param captionColor цвет надписи как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun captionColor(captionColor: Color): FormItemColorsBuilder =
        captionColor(captionColor.asInteractive())

    /**
     * Устанавливает цвет счетчика (например, количества символов)
     *
     * @param counterColor цвет счетчика как [InteractiveColor]
     */
    fun counterColor(counterColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет счетчика (например, количества символов)
     *
     * @param counterColor цвет счетчика как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun counterColor(counterColor: Color): FormItemColorsBuilder =
        counterColor(counterColor.asInteractive())

    /**
     * Устанавливает цвет иконки подсказки
     *
     * @param hintColor цвет иконки подсказки как [InteractiveColor]
     */
    fun hintColor(hintColor: InteractiveColor): FormItemColorsBuilder

    /**
     * Устанавливает цвет иконки подсказки
     *
     * @param hintColor цвет иконки подсказки как [Color] (будет автоматически преобразован в [InteractiveColor])
     */
    fun hintColor(hintColor: Color): FormItemColorsBuilder =
        hintColor(hintColor.asInteractive())

    /**
     * Создаёт и возвращает экземпляр [FormItemColors] с настроенными цветами
     *
     * @return настроенный экземпляр цветов компонента
     */
    fun build(): FormItemColors
}

private data class DefaultFormItemColors(
    override val titleColor: InteractiveColor,
    override val optionalColor: InteractiveColor,
    override val titleCaptionColor: InteractiveColor,
    override val captionColor: InteractiveColor,
    override val counterColor: InteractiveColor,
    override val hintColor: InteractiveColor,
) : FormItemColors {
    class Builder : FormItemColorsBuilder {
        private var titleColor: InteractiveColor? = null

        private var optionalColor: InteractiveColor? = null

        private var titleCaptionColor: InteractiveColor? = null

        private var captionColor: InteractiveColor? = null

        private var counterColor: InteractiveColor? = null

        private var hintColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor): FormItemColorsBuilder =
            apply {
                this.titleColor = titleColor
            }

        override fun optionalColor(optionalColor: InteractiveColor): FormItemColorsBuilder =
            apply { this.optionalColor = optionalColor }

        override fun titleCaptionColor(titleCaptionColor: InteractiveColor):
            FormItemColorsBuilder = apply { this.titleCaptionColor = titleCaptionColor }

        override fun captionColor(captionColor: InteractiveColor): FormItemColorsBuilder =
            apply { this.captionColor = captionColor }

        override fun counterColor(counterColor: InteractiveColor): FormItemColorsBuilder =
            apply { this.counterColor = counterColor }

        override fun hintColor(hintColor: InteractiveColor) = apply {
            this.hintColor = hintColor
        }

        override fun build(): FormItemColors = DefaultFormItemColors(
            titleColor = titleColor ?: Color.Black.asInteractive(),
            optionalColor = optionalColor ?: Color.Black.asInteractive(),
            titleCaptionColor = titleCaptionColor ?: Color.Black.asInteractive(),
            captionColor = captionColor ?: Color.Black.asInteractive(),
            counterColor = counterColor ?: Color.Black.asInteractive(),
            hintColor = hintColor ?: Color.Black.asInteractive(),
        )
    }
}

/**
 * Размеры и отступы компонента [FormItem]
 *
 * Определяет пространственные параметры для расположения элементов компонента формы
 */
@Immutable
interface FormItemDimensions {
    /**
     * Отступ вокруг блока заголовка (внешний отступ)
     */
    val titleBlockPadding: Dp

    /**
     * Отступ между элементами внутри блока заголовка
     */
    val titleBlockSpacing: Dp

    /**
     * Ширина блока заголовка
     */
    val titleBlockWidth: Dp

    /**
     * Отступ дополнительного заголовка
     */
    val titleCaptionPadding: Dp

    /**
     * Отступ надписи (caption)
     */
    val captionPadding: Dp

    /**
     * Смещение индикатора по горизонтальной оси (X)
     */
    val indicatorOffsetX: Dp

    /**
     * Смещение индикатора по вертикальной оси (Y)
     */
    val indicatorOffsetY: Dp

    /**
     * Ширина иконки подсказки
     */
    val hintWidth: Dp

    /**
     * Высота иконки подсказки
     */
    val hintHeight: Dp

    /**
     * Отступ счетчика
     */
    val counterPadding: Dp

    companion object {
        /**
         * Возвращает экземпляр [FormItemDimensionsBuilder] для создания пользовательских размеров и отступов
         */
        fun builder(): FormItemDimensionsBuilder = DefaultFormItemDimensions.Builder()
    }
}

/**
 * Билдер для создания пользовательских [FormItemDimensions]
 *
 * Позволяет настроить размеры и отступы компонента [FormItem]
 */
interface FormItemDimensionsBuilder {
    /**
     * Устанавливает отступ вокруг блока заголовка
     *
     * @param titleBlockPadding внешний отступ блока заголовка в [Dp]
     */
    fun titleBlockPadding(titleBlockPadding: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает ширину блока заголовка
     *
     * @param titleBlockWidth ширина блока заголовка в [Dp]
     */
    fun titleBlockWidth(titleBlockWidth: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает отступ между элементами внутри блока заголовка
     *
     * @param titleBlockSpacing внутренний отступ между элементами блока заголовка в [Dp]
     */
    fun titleBlockSpacing(titleBlockSpacing: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает отступ между заголовком и дополнительным заголовком
     *
     * @param titleCaptionPadding отступ между основным и дополнительным заголовком в [Dp]
     */
    fun titleCaptionPadding(titleCaptionPadding: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает отступ надписи (caption)
     *
     * @param captionPadding отступ текста надписи в [Dp]
     */
    fun captionPadding(captionPadding: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает отступ счетчика
     *
     * @param counterPadding отступ счетчика символов в [Dp]
     */
    fun counterPadding(counterPadding: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает смещение индикатора по горизонтальной оси
     *
     * @param indicatorOffsetX горизонтальное смещение индикатора в [Dp]
     */
    fun indicatorOffsetX(indicatorOffsetX: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает смещение индикатора по вертикальной оси
     *
     * @param indicatorOffsetY вертикальное смещение индикатора в [Dp]
     */
    fun indicatorOffsetY(indicatorOffsetY: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает ширину иконки подсказки
     *
     * @param hintWidth ширина иконки подсказки в [Dp]
     */
    fun hintWidth(hintWidth: Dp): FormItemDimensionsBuilder

    /**
     * Устанавливает высоту иконки подсказки
     *
     * @param hintHeight высота иконки подсказки в [Dp]
     */
    fun hintHeight(hintHeight: Dp): FormItemDimensionsBuilder

    /**
     * Создаёт и возвращает экземпляр [FormItemDimensions] с настроенными размерами и отступами
     *
     * @return настроенный экземпляр размеров и отступов компонента
     */
    fun build(): FormItemDimensions
}

private data class DefaultFormItemDimensions(
    override val titleBlockPadding: Dp,
    override val titleBlockSpacing: Dp,
    override val titleBlockWidth: Dp,
    override val titleCaptionPadding: Dp,
    override val captionPadding: Dp,
    override val indicatorOffsetX: Dp,
    override val indicatorOffsetY: Dp,
    override val hintWidth: Dp,
    override val hintHeight: Dp,
    override val counterPadding: Dp,
) : FormItemDimensions {
    class Builder : FormItemDimensionsBuilder {
        private var titleBlockPadding: Dp? = null
        private var titleBlockWidth: Dp? = null

        private var titleBlockSpacing: Dp? = null

        private var titleCaptionPadding: Dp? = null

        private var captionPadding: Dp? = null

        private var indicatorOffsetX: Dp? = null

        private var indicatorOffsetY: Dp? = null
        private var hintWidth: Dp? = null
        private var hintHeight: Dp? = null
        private var counterPadding: Dp? = null

        override fun titleBlockPadding(titleBlockPadding: Dp): FormItemDimensionsBuilder = apply {
            this.titleBlockPadding = titleBlockPadding
        }

        override fun titleBlockWidth(titleBlockWidth: Dp) = apply {
            this.titleBlockWidth = titleBlockWidth
        }

        override fun titleBlockSpacing(titleBlockSpacing: Dp): FormItemDimensionsBuilder =
            apply { this.titleBlockSpacing = titleBlockSpacing }

        override fun titleCaptionPadding(titleCaptionPadding: Dp): FormItemDimensionsBuilder =
            apply { this.titleCaptionPadding = titleCaptionPadding }

        override fun captionPadding(captionPadding: Dp): FormItemDimensionsBuilder = apply {
            this.captionPadding = captionPadding
        }

        override fun counterPadding(counterPadding: Dp) = apply {
            this.counterPadding = counterPadding
        }

        override fun indicatorOffsetX(indicatorOffsetX: Dp): FormItemDimensionsBuilder =
            apply {
                this.indicatorOffsetX = indicatorOffsetX
            }

        override fun indicatorOffsetY(indicatorOffsetY: Dp): FormItemDimensionsBuilder =
            apply {
                this.indicatorOffsetY = indicatorOffsetY
            }

        override fun hintWidth(hintWidth: Dp) = apply {
            this.hintWidth = hintWidth
        }

        override fun hintHeight(hintHeight: Dp) = apply {
            this.hintHeight = hintHeight
        }

        override fun build(): FormItemDimensions = DefaultFormItemDimensions(
            titleBlockPadding = titleBlockPadding ?: 8.dp,
            titleBlockSpacing = titleBlockSpacing ?: 4.dp,
            titleCaptionPadding = titleCaptionPadding ?: 4.dp,
            captionPadding = captionPadding ?: 4.dp,
            counterPadding = counterPadding ?: 4.dp,
            indicatorOffsetX = indicatorOffsetX ?: 0.dp,
            indicatorOffsetY = indicatorOffsetY ?: 0.dp,
            hintWidth = hintWidth ?: 16.dp,
            hintHeight = hintHeight ?: 14.dp,
            titleBlockWidth = titleBlockWidth ?: Dp.Unspecified,
        )
    }
}
