package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ListItemStyle] для компонента [ListItem]
 */
val LocalListItemStyle =
    compositionLocalOf(structuralEqualityPolicy()) { ListItemStyle.builder().style() }

/**
 * Стиль компонента [ListItem]
 */
@Stable
interface ListItemStyle : Style {

    /**
     * Форма
     */
    val shape: Shape

    /**
     * Стиль тайтла
     */
    val titleStyle: TextStyle

    /**
     * Стиль тайтла
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стиль сабтайтла
     */
    val subtitleStyle: TextStyle

    /**
     * Стили сабтайтла
     */
    val subtitleStyles: StatefulValue<TextStyle>

    /**
     * Стиль лэйбла
     */
    val labelStyle: TextStyle

    /**
     * Стиль лэйбла
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Иконка disclosure
     */
    @Deprecated("Use disclosureIconRes instead")
    val disclosureIcon: Painter?

    /**
     * Иконка disclosure
     */
    @get:DrawableRes
    val disclosureIconRes: Int?

    /**
     * Стиль текста disclosure
     */
    val disclosureTextStyle: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     */
    val colors: ListItemColors

    /**
     * Отступы компонента
     */
    val dimensions: ListItemDimensions

    /**
     * Стиль [Avatar], используемых в [ListItem]
     */
    val avatarStyle: AvatarStyle?

    /**
     * Стиль [IconButton], используемых в [ListItem]
     */
    val iconButtonStyle: ButtonStyle?

    /**
     * Стиль [CheckBox], используемых в [ListItem]
     */
    val checkBoxStyle: CheckBoxStyle?

    /**
     * Стиль [RadioBox], используемых в [ListItem]
     */
    val radioBoxStyle: RadioBoxStyle?

    /**
     * Стиль [Switch], используемых в [ListItem]
     */
    val switchStyle: SwitchStyle?

    /**
     * Стиль [Counter], используемых в [ListItem]
     */
    val counterStyle: CounterStyle?

    companion object {
        /**
         * Возвращает экземпляр [ListItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): ListItemStyleBuilder = DefaultListItemStyle.Builder()
    }
}

@Immutable
private data class DefaultListItemStyle(
    override val shape: Shape,
    @Deprecated("Use disclosureIconRes instead")
    override val disclosureIcon: Painter?,
    override val disclosureIconRes: Int?,
    override val colors: ListItemColors,
    override val dimensions: ListItemDimensions,
    override val titleStyles: StatefulValue<TextStyle>,
    override val subtitleStyles: StatefulValue<TextStyle>,
    override val labelStyles: StatefulValue<TextStyle>,
    override val avatarStyle: AvatarStyle?,
    override val iconButtonStyle: ButtonStyle?,
    override val checkBoxStyle: CheckBoxStyle?,
    override val radioBoxStyle: RadioBoxStyle?,
    override val switchStyle: SwitchStyle?,
    override val counterStyle: CounterStyle?,
    override val disclosureTextStyle: StatefulValue<TextStyle>,
) : ListItemStyle {

    override val titleStyle: TextStyle get() = titleStyles.getDefaultValue()
    override val subtitleStyle: TextStyle get() = subtitleStyles.getDefaultValue()
    override val labelStyle: TextStyle get() = labelStyles.getDefaultValue()

    class Builder : ListItemStyleBuilder {
        private var shape: Shape? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var disclosureStyle: StatefulValue<TextStyle>? = null
        private var subtitleStyle: StatefulValue<TextStyle>? = null
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var disclosureIcon: Painter? = null
        private var disclosureIconRes: Int? = null
        private var colorsBuilder: ListItemColorsBuilder = ListItemColors.builder()
        private var dimensionsBuilder: ListItemDimensionsBuilder = ListItemDimensions.builder()
        private var avatarStyle: AvatarStyle? = null
        private var iconButtonStyle: ButtonStyle? = null
        private var checkBoxStyle: CheckBoxStyle? = null
        private var radioBoxStyle: RadioBoxStyle? = null
        private var switchStyle: SwitchStyle? = null
        private var counterStyle: CounterStyle? = null

        override fun shape(shape: Shape) = apply {
            this.shape = shape
        }

        override fun titleStyle(titleStyle: TextStyle): ListItemStyleBuilder =
            titleStyle(titleStyle.asStatefulValue())

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder = apply {
            this.titleStyle = titleStyle
        }

        override fun subtitleStyle(subtitleStyle: TextStyle): ListItemStyleBuilder =
            subtitleStyle(subtitleStyle.asStatefulValue())

        override fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder = apply {
            this.subtitleStyle = subtitleStyle
        }

        override fun labelStyle(labelStyle: TextStyle): ListItemStyleBuilder =
            labelStyle(labelStyle.asStatefulValue())

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>): ListItemStyleBuilder = apply {
            this.labelStyle = labelStyle
        }

        @Deprecated("Use disclosureIcon with drawable res")
        override fun disclosureIcon(disclosureIcon: Painter) = apply {
            this.disclosureIcon = disclosureIcon
        }

        override fun disclosureIcon(disclosureIconRes: Int) = apply {
            this.disclosureIconRes = disclosureIconRes
        }

        @Composable
        override fun colors(builder: @Composable (ListItemColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (ListItemDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun avatarStyle(avatarStyle: AvatarStyle) = apply {
            this.avatarStyle = avatarStyle
        }

        override fun iconButtonStyle(iconButtonStyle: ButtonStyle) = apply {
            this.iconButtonStyle = iconButtonStyle
        }

        override fun checkBoxStyle(checkBoxStyle: CheckBoxStyle) = apply {
            this.checkBoxStyle = checkBoxStyle
        }

        override fun radioBoxStyle(radioBoxStyle: RadioBoxStyle) = apply {
            this.radioBoxStyle = radioBoxStyle
        }

        override fun switchStyle(switchStyle: SwitchStyle) = apply {
            this.switchStyle = switchStyle
        }

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
        }

        override fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>) = apply {
            this.disclosureStyle = disclosureStyle
        }

        override fun style(): ListItemStyle {
            return DefaultListItemStyle(
                shape = shape ?: RectangleShape,
                titleStyles = titleStyle ?: TextStyle.Default.asStatefulValue(),
                subtitleStyles = subtitleStyle ?: TextStyle.Default.asStatefulValue(),
                labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
                disclosureIcon = disclosureIcon,
                disclosureIconRes = disclosureIconRes,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                avatarStyle = avatarStyle,
                iconButtonStyle = iconButtonStyle,
                checkBoxStyle = checkBoxStyle,
                radioBoxStyle = radioBoxStyle,
                switchStyle = switchStyle,
                counterStyle = counterStyle,
                disclosureTextStyle = disclosureStyle ?: TextStyle.Default.asStatefulValue(),
            )
        }
    }
}

/**
 * Билдер стиля [ListItemStyle]
 */
interface ListItemStyleBuilder : StyleBuilder<ListItemStyle> {

    /**
     * Устанавливает форму
     */
    fun shape(shape: Shape): ListItemStyleBuilder

    /**
     * Устанавливает стиль заголовка
     */
    fun titleStyle(titleStyle: TextStyle): ListItemStyleBuilder

    /**
     * Устанавливает стили заголовка
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает стиль подзаголовка
     */
    fun subtitleStyle(subtitleStyle: TextStyle): ListItemStyleBuilder

    /**
     * Устанавливает стили подзаголовка
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает стиль лейбла
     */
    fun labelStyle(labelStyle: TextStyle): ListItemStyleBuilder

    /**
     * Устанавливает стили лейбла
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает иконку disclosure
     */
    @Deprecated("Use disclosureIcon with drawable res")
    fun disclosureIcon(disclosureIcon: Painter): ListItemStyleBuilder

    /**
     * Устанавливает иконку disclosure
     */
    fun disclosureIcon(@DrawableRes disclosureIconRes: Int): ListItemStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable ListItemColorsBuilder.() -> Unit): ListItemStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable ListItemDimensionsBuilder.() -> Unit): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [Avatar] в компоненте
     */
    fun avatarStyle(avatarStyle: AvatarStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [IconButton] в компоненте
     */
    fun iconButtonStyle(iconButtonStyle: ButtonStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [CheckBox] в компоненте
     */
    fun checkBoxStyle(checkBoxStyle: CheckBoxStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [RadioBox] в компоненте
     */
    fun radioBoxStyle(radioBoxStyle: RadioBoxStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [Switch] в компоненте
     */
    fun switchStyle(switchStyle: SwitchStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль компонентов [Counter] в компоненте
     */
    fun counterStyle(counterStyle: CounterStyle): ListItemStyleBuilder

    /**
     * Устанавливает стиль disclosure
     */
    fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>): ListItemStyleBuilder
}

/**
 * Размеры и отступы компонента [ListItem]
 */
@Stable
interface ListItemDimensions {

    /**
     * Отступ между контентом в центре и контентом в конце
     */
    val contentPaddingEnd: Dp

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
     * Оступ снизу
     */
    val paddingBottom: Dp

    /**
     * Высота элемента
     */
    val height: Dp

    /**
     * Отступ между контентом в начале и контентом в центре
     */
    val contentPaddingStart: Dp

    companion object {

        /**
         * Возвращает экземпляр [ListItemDimensionsBuilder]
         */
        fun builder(): ListItemDimensionsBuilder = DefaultListItemDimensions.Builder()
    }
}

/**
 * Билдер для [ListItemDimensions]
 */
interface ListItemDimensionsBuilder {

    /**
     * Устанавливает отступ между контентом в центре и контентом в конце
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает высоту
     */
    fun height(height: Dp): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ между контентом в начале и контентом в центре
     */
    fun contentPaddingStart(contentPaddingStart: Dp): ListItemDimensionsBuilder

    /**
     * Создаёт экземпляр [ListItemDimensions]
     */
    fun build(): ListItemDimensions
}

@Immutable
private class DefaultListItemDimensions(
    override val contentPaddingEnd: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val height: Dp,
    override val contentPaddingStart: Dp,
) : ListItemDimensions {
    class Builder : ListItemDimensionsBuilder {
        private var contentPaddingEnd: Dp? = null
        private var contentPaddingStart: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var height: Dp? = null

        override fun contentPaddingEnd(contentPaddingEnd: Dp) = apply {
            this.contentPaddingEnd = contentPaddingEnd
        }

        override fun contentPaddingStart(contentPaddingStart: Dp) = apply {
            this.contentPaddingStart = contentPaddingStart
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

        override fun height(height: Dp) = apply {
            this.height = height
        }

        override fun build(): ListItemDimensions {
            return DefaultListItemDimensions(
                contentPaddingEnd = contentPaddingEnd ?: 0.dp,
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
                paddingTop = paddingTop ?: 0.dp,
                paddingBottom = paddingBottom ?: 0.dp,
                height = height ?: 0.dp,
                contentPaddingStart = contentPaddingStart ?: 0.dp,
            )
        }
    }
}

/**
 * Цвета компонента [ListItem]
 */
@Stable
interface ListItemColors {

    /**
     * Цвет тайтла
     */
    val titleColor: InteractiveColor

    /**
     * Цвет сабтайтла
     */
    val subtitleColor: InteractiveColor

    /**
     * Цвет лэйбла
     */
    val labelColor: InteractiveColor

    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет иконки disclosure
     */
    val disclosureIconColor: InteractiveColor

    /**
     * Цвет текста disclosure
     */
    val disclosureTextColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [ListItemColorsBuilder]
         */
        fun builder(): ListItemColorsBuilder = DefaultListItemColors.Builder()
    }
}

/**
 * Билдер для [ListItemColors]
 */
interface ListItemColorsBuilder {

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: Color): ListItemColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: Color): ListItemColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Устанавливает цвет тайтла
     */
    fun subtitleColor(subtitleColor: Color): ListItemColorsBuilder =
        subtitleColor(subtitleColor.asInteractive())

    /**
     * Устанавливает цвет тайтла
     */
    fun subtitleColor(subtitleColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Устанавливает цвет тайтла
     */
    fun labelColor(labelColor: Color): ListItemColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет тайтла
     */
    fun labelColor(labelColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: Color): ListItemColorsBuilder =
        disclosureIconColor(disclosureIconColor.asInteractive())

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: InteractiveColor): ListItemColorsBuilder

    /**
     * Возвращает [ListItemColors]
     */
    fun build(): ListItemColors
}

@Immutable
private class DefaultListItemColors(
    override val titleColor: InteractiveColor,
    override val disclosureIconColor: InteractiveColor,
    override val backgroundColor: InteractiveColor,
    override val subtitleColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val disclosureTextColor: InteractiveColor,
) : ListItemColors {
    class Builder : ListItemColorsBuilder {
        private var titleColor: InteractiveColor? = null
        private var subtitleColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var backgroundColor: InteractiveColor? = null
        private var disclosureIconColor: InteractiveColor? = null
        private var disclosureTextColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor) = apply {
            this.titleColor = titleColor
        }

        override fun subtitleColor(subtitleColor: InteractiveColor) = apply {
            this.subtitleColor = subtitleColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun disclosureIconColor(disclosureIconColor: InteractiveColor) = apply {
            this.disclosureIconColor = disclosureIconColor
        }

        override fun disclosureTextColor(disclosureTextColor: InteractiveColor) = apply {
            this.disclosureTextColor = disclosureTextColor
        }

        override fun build(): ListItemColors {
            return DefaultListItemColors(
                titleColor = titleColor ?: Color.Black.asInteractive(),
                subtitleColor = subtitleColor ?: Color.LightGray.asInteractive(),
                labelColor = labelColor ?: Color.LightGray.asInteractive(),
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
                disclosureIconColor = disclosureIconColor ?: Color.Black.asInteractive(),
                disclosureTextColor = disclosureTextColor ?: Color.Black.asInteractive(),
            )
        }
    }
}
