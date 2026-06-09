package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.api.info.compose.ConfigName
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    val shape: Shape

    /**
     * Форма
     */
    val shapes: StatefulValue<Shape>

    /**
     * Стиль тайтла
     */
    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    val titleStyle: TextStyle

    /**
     * Стиль тайтла
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стиль сабтайтла
     */
    @Deprecated("Use subtitleStyles", replaceWith = ReplaceWith("subtitleStyles"))
    val subtitleStyle: TextStyle

    /**
     * Стили сабтайтла
     */
    val subtitleStyles: StatefulValue<TextStyle>

    /**
     * Стиль лэйбла
     */
    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
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

    /**
     * Режим выравнивания контента по вертикали
     */
    val gravity: CellGravity

    companion object {
        /**
         * Возвращает экземпляр [ListItemStyleBuilder]
         */
        fun builder(receiver: Any? = null): ListItemStyleBuilder = DefaultListItemStyle.Builder()
    }
}

@Immutable
private data class DefaultListItemStyle(
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
    override val shapes: StatefulValue<Shape>,
    override val gravity: CellGravity,
) : ListItemStyle {

    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    override val titleStyle: TextStyle get() = titleStyles.getDefaultValue()

    @Deprecated("Use subtitleStyles", replaceWith = ReplaceWith("subtitleStyles"))
    override val subtitleStyle: TextStyle get() = subtitleStyles.getDefaultValue()

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle get() = labelStyles.getDefaultValue()

    @Deprecated("Use shapes", replaceWith = ReplaceWith("shapes"))
    override val shape: Shape = shapes.getDefaultValue()

    class Builder : ListItemStyleBuilder {
        private var shapes: StatefulValue<Shape>? = null
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
        private var gravity: CellGravity? = null

        override fun shape(shape: StatefulValue<Shape>) = apply {
            this.shapes = shape
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

        override fun gravity(gravity: CellGravity) = apply {
            this.gravity = gravity
        }

        override fun style(): ListItemStyle {
            return DefaultListItemStyle(
                shapes = shapes ?: RectangleShape.asStatefulValue(),
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
                gravity = gravity ?: CellGravity.Center,
            )
        }
    }
}

/**
 * Билдер стиля [ListItemStyle]
 */
@ApiInfo
interface ListItemStyleBuilder : StyleBuilder<ListItemStyle> {

    /**
     * Устанавливает форму
     */
    fun shape(shape: Shape): ListItemStyleBuilder =
        shape(shape.asStatefulValue())

    /**
     * Устанавливает форму
     */
    fun shape(shape: StatefulValue<Shape>): ListItemStyleBuilder

    /**
     * Устанавливает стиль заголовка
     */
    fun titleStyle(titleStyle: TextStyle): ListItemStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стили заголовка
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает стиль подзаголовка
     */
    fun subtitleStyle(subtitleStyle: TextStyle): ListItemStyleBuilder =
        subtitleStyle(subtitleStyle.asStatefulValue())

    /**
     * Устанавливает стили подзаголовка
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает стиль лейбла
     */
    fun labelStyle(labelStyle: TextStyle): ListItemStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

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
    @ConfigName("disclosureStyle")
    fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>): ListItemStyleBuilder

    /**
     * Устанавливает стиль disclosure
     */
    @ConfigName("disclosureStyle")
    fun disclosureTextStyle(disclosureStyle: TextStyle): ListItemStyleBuilder =
        disclosureTextStyle(disclosureStyle.asStatefulValue())

    /**
     * Устанавливает выравнивание содержимого по вертикали
     */
    fun gravity(gravity: CellGravity): ListItemStyleBuilder
}

/**
 * Размеры и отступы компонента [ListItem]
 */
@Stable
interface ListItemDimensions {

    /**
     * Отступ между контентом в центре и контентом в конце
     */
    @Deprecated("use contentPaddingEndValues", replaceWith = ReplaceWith("contentPaddingEndValues"))
    val contentPaddingEnd: Dp

    /**
     * Отступы между контентом в центре и контентом в конце
     */
    val contentPaddingEndValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступы в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступы в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступы сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Оступ снизу
     */
    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Оступы снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Высота элемента
     */
    @Deprecated("use heightValues", replaceWith = ReplaceWith("heightValues"))
    val height: Dp

    /**
     * Высота элемента
     */
    val heightValues: StatefulValue<Dp>

    /**
     * Отступ между контентом в начале и контентом в центре
     */
    @Deprecated("use contentPaddingStartValues", replaceWith = ReplaceWith("contentPaddingStartValues"))
    val contentPaddingStart: Dp

    /**
     * Отступы между контентом в начале и контентом в центре
     */
    val contentPaddingStartValues: StatefulValue<Dp>

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
    fun contentPaddingEnd(contentPaddingEnd: Dp): ListItemDimensionsBuilder =
        contentPaddingEnd(contentPaddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы между контентом в центре и контентом в конце
     */
    fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ в начале
     */
    fun paddingStart(paddingStart: Dp): ListItemDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступы в начале
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ в конце
     */
    fun paddingEnd(paddingEnd: Dp): ListItemDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступы в конце
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ сверху
     */
    fun paddingTop(paddingTop: Dp): ListItemDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступы сверху
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ снизу
     */
    fun paddingBottom(paddingBottom: Dp): ListItemDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступы снизу
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает высоту
     */
    fun height(height: Dp): ListItemDimensionsBuilder =
        height(height.asStatefulValue())

    /**
     * Устанавливает высоту
     */
    fun height(height: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Устанавливает отступ между контентом в начале и контентом в центре
     */
    fun contentPaddingStart(contentPaddingStart: Dp): ListItemDimensionsBuilder =
        contentPaddingStart(contentPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступы между контентом в начале и контентом в центре
     */
    fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>): ListItemDimensionsBuilder

    /**
     * Создаёт экземпляр [ListItemDimensions]
     */
    fun build(): ListItemDimensions
}

@Immutable
private class DefaultListItemDimensions(
    override val contentPaddingEndValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val heightValues: StatefulValue<Dp>,
    override val contentPaddingStartValues: StatefulValue<Dp>,

) : ListItemDimensions {
    @Deprecated("use contentPaddingEndValues", replaceWith = ReplaceWith("contentPaddingEndValues"))
    override val contentPaddingEnd: Dp = 0.dp

    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = 0.dp

    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = 0.dp

    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = 0.dp

    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = 0.dp

    @Deprecated("use heightValues", replaceWith = ReplaceWith("heightValues"))
    override val height: Dp = 0.dp

    @Deprecated("use contentPaddingStartValues", replaceWith = ReplaceWith("contentPaddingStartValues"))
    override val contentPaddingStart: Dp = 0.dp

    class Builder : ListItemDimensionsBuilder {
        private var contentPaddingEndValues: StatefulValue<Dp>? = null
        private var contentPaddingStartValues: StatefulValue<Dp>? = null
        private var paddingStartValues: StatefulValue<Dp>? = null
        private var paddingEndValues: StatefulValue<Dp>? = null
        private var paddingTopValues: StatefulValue<Dp>? = null
        private var paddingBottomValues: StatefulValue<Dp>? = null
        private var heightValues: StatefulValue<Dp>? = null
        override fun contentPaddingEnd(contentPaddingEnd: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.contentPaddingEndValues = contentPaddingEnd
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.paddingStartValues = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.paddingEndValues = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.paddingTopValues = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.paddingBottomValues = paddingBottom
        }

        override fun height(height: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.heightValues = height
        }

        override fun contentPaddingStart(contentPaddingStart: StatefulValue<Dp>): ListItemDimensionsBuilder = apply {
            this.contentPaddingStartValues = contentPaddingStart
        }

        override fun build(): ListItemDimensions {
            return DefaultListItemDimensions(
                contentPaddingEndValues = contentPaddingEndValues ?: 0.dp.asStatefulValue(),
                paddingStartValues = paddingStartValues ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEndValues ?: 0.dp.asStatefulValue(),
                paddingTopValues = paddingTopValues ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottomValues ?: 0.dp.asStatefulValue(),
                heightValues = heightValues ?: 0.dp.asStatefulValue(),
                contentPaddingStartValues = contentPaddingStartValues ?: 0.dp.asStatefulValue(),
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
    @Deprecated("use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    val titleColor: InteractiveColor

    /**
     * Кисти тайтла
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Цвет сабтайтла
     */
    @Deprecated("use subtitleBrush", replaceWith = ReplaceWith("subtitleBrush"))
    val subtitleColor: InteractiveColor

    /**
     * Кисти сабтайтла
     */
    val subtitleBrush: StatefulValue<Brush>

    /**
     * Цвет лэйбла
     */
    @Deprecated("use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    val labelColor: InteractiveColor

    /**
     * Кисти лэйбла
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет фона
     */
    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    val backgroundColor: InteractiveColor

    /**
     * Кисти фона
     */
    val backgroundBrush: StatefulValue<Brush>

    /**
     * Цвет иконки disclosure
     */
    @Deprecated("use disclosureIconBrush", replaceWith = ReplaceWith("disclosureIconBrush"))
    val disclosureIconColor: InteractiveColor

    /**
     * Кисти иконки disclosure
     */
    val disclosureIconBrush: StatefulValue<Brush>

    /**
     * Цвет текста disclosure
     */
    @Deprecated("use disclosureTextBrush", replaceWith = ReplaceWith("disclosureTextBrush"))
    val disclosureTextColor: InteractiveColor

    /**
     * Кисти текста disclosure
     */
    val disclosureTextBrush: StatefulValue<Brush>

    /**
     * Кисть контента в начале
     */
    val contentStartColor: StatefulValue<Brush>

    /**
     * Кисть контента в конце
     */
    val contentEndColor: StatefulValue<Brush>

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
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает цвет фона
     */
    fun backgroundColor(backgroundColor: InteractiveColor): ListItemColorsBuilder =
        backgroundColor(backgroundColor.asStatefulBrush())

    /**
     * Устанавливает кисть фона
     */
    fun backgroundColor(backgroundBrush: Brush): ListItemColorsBuilder =
        backgroundColor(backgroundBrush.asStatefulValue())

    /**
     * Устанавливает кисти фона
     */
    fun backgroundColor(backgroundBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: Color): ListItemColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: InteractiveColor): ListItemColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает кисть тайтла
     */
    fun titleColor(titleBrush: Brush): ListItemColorsBuilder =
        titleColor(titleBrush.asStatefulValue())

    /**
     * Устанавливает кисти тайтла
     */
    fun titleColor(titleBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: Color): ListItemColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: InteractiveColor): ListItemColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает кисть сабтайтла
     */
    fun subtitleColor(subtitleBrush: Brush): ListItemColorsBuilder =
        subtitleColor(subtitleBrush.asStatefulValue())

    /**
     * Устанавливает кисти сабтайтла
     */
    fun subtitleColor(subtitleBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: Color): ListItemColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: InteractiveColor): ListItemColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть лэйбла
     */
    fun labelColor(labelBrush: Brush): ListItemColorsBuilder =
        labelColor(labelBrush.asStatefulValue())

    /**
     * Устанавливает кисти лэйбла
     */
    fun labelColor(labelBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: Color): ListItemColorsBuilder =
        disclosureIconColor(disclosureIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: InteractiveColor): ListItemColorsBuilder =
        disclosureIconColor(disclosureIconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки disclosure
     */
    fun disclosureIconColor(disclosureIconBrush: Brush): ListItemColorsBuilder =
        disclosureIconColor(disclosureIconBrush.asStatefulValue())

    /**
     * Устанавливает кисти иконки disclosure
     */
    fun disclosureIconColor(disclosureIconBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: Color): ListItemColorsBuilder =
        disclosureTextColor(disclosureTextColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: InteractiveColor): ListItemColorsBuilder =
        disclosureTextColor(disclosureTextColor.asStatefulBrush())

    /**
     * Устанавливает кисть текста disclosure
     */
    fun disclosureTextColor(disclosureTextBrush: Brush): ListItemColorsBuilder =
        disclosureTextColor(disclosureTextBrush.asStatefulValue())

    /**
     * Устанавливает кисти текста disclosure
     */
    fun disclosureTextColor(disclosureTextBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет контента в начале
     */
    fun contentStartColor(contentStartColor: Color): ListItemColorsBuilder =
        contentStartColor(contentStartColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в начале
     */
    fun contentStartColor(contentStartColor: InteractiveColor): ListItemColorsBuilder =
        contentStartColor(contentStartColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в начале
     */
    fun contentStartColor(contentStartBrush: Brush): ListItemColorsBuilder =
        contentStartColor(contentStartBrush.asStatefulValue())

    /**
     * Устанавливает кисти контента в начале
     */
    fun contentStartColor(contentStartBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Устанавливает цвет контента в конце
     */
    fun contentEndColor(contentEndColor: Color): ListItemColorsBuilder =
        contentEndColor(contentEndColor.asStatefulBrush())

    /**
     * Устанавливает цвет контента в конце
     */
    fun contentEndColor(contentEndColor: InteractiveColor): ListItemColorsBuilder =
        contentEndColor(contentEndColor.asStatefulBrush())

    /**
     * Устанавливает кисть контента в конце
     */
    fun contentEndColor(contentEndBrush: Brush): ListItemColorsBuilder =
        contentEndColor(contentEndBrush.asStatefulValue())

    /**
     * Устанавливает кисти контента в конце
     */
    fun contentEndColor(contentEndBrush: StatefulValue<Brush>): ListItemColorsBuilder

    /**
     * Возвращает [ListItemColors]
     */
    fun build(): ListItemColors
}

@Immutable
private class DefaultListItemColors(
    override val titleBrush: StatefulValue<Brush>,
    override val disclosureIconBrush: StatefulValue<Brush>,
    override val backgroundBrush: StatefulValue<Brush>,
    override val subtitleBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val disclosureTextBrush: StatefulValue<Brush>,
    override val contentStartColor: StatefulValue<Brush>,
    override val contentEndColor: StatefulValue<Brush>,

) : ListItemColors {
    @Deprecated("use titleBrush", replaceWith = ReplaceWith("titleBrush"))
    override val titleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use disclosureIconBrush", replaceWith = ReplaceWith("disclosureIconBrush"))
    override val disclosureIconColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use backgroundBrush", replaceWith = ReplaceWith("backgroundBrush"))
    override val backgroundColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use subtitleBrush", replaceWith = ReplaceWith("subtitleBrush"))
    override val subtitleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use labelBrush", replaceWith = ReplaceWith("labelBrush"))
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use disclosureTextBrush", replaceWith = ReplaceWith("disclosureTextBrush"))
    override val disclosureTextColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : ListItemColorsBuilder {
        private var titleBrush: StatefulValue<Brush>? = null
        private var subtitleBrush: StatefulValue<Brush>? = null
        private var labelBrush: StatefulValue<Brush>? = null
        private var backgroundBrush: StatefulValue<Brush>? = null
        private var disclosureIconBrush: StatefulValue<Brush>? = null
        private var disclosureTextBrush: StatefulValue<Brush>? = null
        private var contentStartBrush: StatefulValue<Brush>? = null
        private var contentEndBrush: StatefulValue<Brush>? = null

        override fun backgroundColor(backgroundBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.backgroundBrush = backgroundBrush
        }

        override fun titleColor(titleBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.titleBrush = titleBrush
        }

        override fun subtitleColor(subtitleBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.subtitleBrush = subtitleBrush
        }

        override fun labelColor(labelBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.labelBrush = labelBrush
        }

        override fun disclosureIconColor(disclosureIconBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.disclosureIconBrush = disclosureIconBrush
        }

        override fun disclosureTextColor(disclosureTextBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.disclosureTextBrush = disclosureTextBrush
        }

        override fun contentStartColor(contentStartBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.contentStartBrush = contentStartBrush
        }

        override fun contentEndColor(contentEndBrush: StatefulValue<Brush>): ListItemColorsBuilder = apply {
            this.contentEndBrush = contentEndBrush
        }

        override fun build(): ListItemColors {
            val defaultTitleBrush = titleBrush ?: Color.Black.asStatefulBrush()
            return DefaultListItemColors(
                titleBrush = defaultTitleBrush,
                subtitleBrush = subtitleBrush ?: Color.LightGray.asStatefulBrush(),
                labelBrush = labelBrush ?: Color.LightGray.asStatefulBrush(),
                backgroundBrush = backgroundBrush ?: Color.Transparent.asStatefulBrush(),
                disclosureIconBrush = disclosureIconBrush ?: Color.Black.asStatefulBrush(),
                disclosureTextBrush = disclosureTextBrush ?: Color.Black.asStatefulBrush(),
                contentStartColor = contentStartBrush ?: defaultTitleBrush,
                contentEndColor = contentEndBrush ?: defaultTitleBrush,
            )
        }
    }
}
