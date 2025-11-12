package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
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
 * CompositionLocal c [CellStyle] для компонента [Cell]
 */
val LocalCellStyle = compositionLocalOf(structuralEqualityPolicy()) { CellStyle.builder().style() }

/**
 * Стиль компонента [Cell]
 */
@Stable
interface CellStyle : Style {

    /**
     * Стиль лэйбла
     */
    val labelStyle: TextStyle

    /**
     * Стили лэйбла
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль тайтла
     */
    val titleStyle: TextStyle

    /**
     * Стили тайтла
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стиль сабйтайтла
     */
    val subtitleStyle: TextStyle

    /**
     * Стили сабйтайтла
     */
    val subtitleStyles: StatefulValue<TextStyle>

    /**
     * Cтиль текста disclosure
     */
    val disclosureTextStyle: TextStyle

    /**
     * Стили disclosure
     */
    val disclosureTextStyles: StatefulValue<TextStyle>

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
     * Цвета компонента
     */
    val colors: CellColors

    /**
     * Отступы компонента
     */
    val dimensions: CellDimensions

    /**
     * Стиль [Avatar], используемых в [Cell]
     */
    val avatarStyle: AvatarStyle

    /**
     * Стиль [IconButton], используемых в [Cell]
     */
    val iconButtonStyle: ButtonStyle

    /**
     * Стиль [CheckBox], используемых в [Cell]
     */
    val checkBoxStyle: CheckBoxStyle

    /**
     * Стиль [RadioBox], используемых в [Cell]
     */
    val radioBoxStyle: RadioBoxStyle

    /**
     * Стиль [Switch], используемых в [Cell]
     */
    val switchStyle: SwitchStyle

    companion object {
        /**
         * Возвращает экземпляр [CellStyleBuilder]
         */
        fun builder(receiver: Any? = null): CellStyleBuilder = DefaultCellStyle.Builder()
    }
}

@Immutable
private data class DefaultCellStyle(
    @Deprecated("Use disclosureIconRes instead")
    override val disclosureIcon: Painter?,
    override val disclosureIconRes: Int?,
    override val colors: CellColors,
    override val dimensions: CellDimensions,
    override val avatarStyle: AvatarStyle,
    override val iconButtonStyle: ButtonStyle,
    override val checkBoxStyle: CheckBoxStyle,
    override val radioBoxStyle: RadioBoxStyle,
    override val switchStyle: SwitchStyle,
    override val labelStyles: StatefulValue<TextStyle>,
    override val titleStyles: StatefulValue<TextStyle>,
    override val subtitleStyles: StatefulValue<TextStyle>,
    override val disclosureTextStyles: StatefulValue<TextStyle>,
) : CellStyle {

    override val labelStyle: TextStyle get() = labelStyles.getDefaultValue()
    override val titleStyle: TextStyle get() = titleStyles.getDefaultValue()
    override val subtitleStyle: TextStyle get() = subtitleStyles.getDefaultValue()
    override val disclosureTextStyle: TextStyle get() = disclosureTextStyles.getDefaultValue()

    class Builder : CellStyleBuilder {
        private var labelStyle: StatefulValue<TextStyle>? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var subtitleStyle: StatefulValue<TextStyle>? = null
        private var disclosureStyle: StatefulValue<TextStyle>? = null
        private var disclosureIcon: Painter? = null
        private var disclosureIconRes: Int? = null
        private var colorsBuilder: CellColorsBuilder = CellColors.builder()
        private var dimensionsBuilder: CellDimensionsBuilder = CellDimensions.builder()
        private var avatarStyle: AvatarStyle? = null
        private var iconButtonStyle: ButtonStyle? = null
        private var checkBoxStyle: CheckBoxStyle? = null
        private var radioBoxStyle: RadioBoxStyle? = null
        private var switchStyle: SwitchStyle? = null

        override fun labelStyle(labelStyle: TextStyle) =
            labelStyle(labelStyle.asStatefulValue())

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyle = labelStyle
        }

        override fun titleStyle(titleStyle: TextStyle): CellStyleBuilder =
            titleStyle(titleStyle.asStatefulValue())

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun subtitleStyle(subtitleStyle: TextStyle) =
            subtitleStyle(subtitleStyle.asStatefulValue())

        override fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>) = apply {
            this.subtitleStyle = subtitleStyle
        }

        override fun disclosureTextStyle(disclosureStyle: TextStyle) =
            disclosureTextStyle(disclosureStyle.asStatefulValue())

        override fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>) = apply {
            this.disclosureStyle = disclosureStyle
        }

        @Deprecated("Use disclosureIcon with drawable res")
        override fun disclosureIcon(disclosureIcon: Painter) = apply {
            this.disclosureIcon = disclosureIcon
        }

        override fun disclosureIcon(@DrawableRes disclosureIconRes: Int) = apply {
            this.disclosureIconRes = disclosureIconRes
        }

        @Composable
        override fun colors(builder: @Composable (CellColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (CellDimensionsBuilder.() -> Unit)) = apply {
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

        override fun style(): CellStyle {
            return DefaultCellStyle(
                labelStyles = labelStyle ?: TextStyle.Default.asStatefulValue(),
                titleStyles = titleStyle ?: TextStyle.Default.asStatefulValue(),
                subtitleStyles = subtitleStyle ?: TextStyle.Default.asStatefulValue(),
                disclosureTextStyles = disclosureStyle ?: TextStyle.Default.asStatefulValue(),
                disclosureIcon = disclosureIcon,
                disclosureIconRes = disclosureIconRes,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                avatarStyle = avatarStyle ?: AvatarStyle.builder().style(),
                iconButtonStyle = iconButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
                checkBoxStyle = checkBoxStyle ?: CheckBoxStyle.builder().style(),
                radioBoxStyle = radioBoxStyle ?: RadioBoxStyle.builder().style(),
                switchStyle = switchStyle ?: SwitchStyle.builder().style(),
            )
        }
    }
}

/**
 * Билдер стиля [CellStyle]
 */
interface CellStyleBuilder : StyleBuilder<CellStyle> {

    /**
     * Устанавливает стиль лэйбла
     */
    fun labelStyle(labelStyle: TextStyle): CellStyleBuilder

    /**
     * Устанавливает стили лэйбла
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль тайтла
     */
    fun titleStyle(titleStyle: TextStyle): CellStyleBuilder

    /**
     * Устанавливает стили тайтла
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль сабтайтла
     */
    fun subtitleStyle(subtitleStyle: TextStyle): CellStyleBuilder

    /**
     * Устанавливает стили сабтайтла
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль текста disclosure
     */
    fun disclosureTextStyle(disclosureStyle: TextStyle): CellStyleBuilder

    /**
     * Устанавливает стили текста disclosure
     */
    fun disclosureTextStyle(disclosureStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает иконку disclosure
     */
    @Deprecated("Use disclosureIcon with drawable res")
    fun disclosureIcon(disclosureIcon: Painter): CellStyleBuilder

    /**
     * Устанавливает иконку disclosure
     */
    fun disclosureIcon(@DrawableRes disclosureIconRes: Int): CellStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder]
     */
    @Composable
    fun colors(builder: @Composable CellColorsBuilder.() -> Unit): CellStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable CellDimensionsBuilder.() -> Unit): CellStyleBuilder

    /**
     * Устанавливает стиль компонентов [Avatar] в компоненте
     */
    fun avatarStyle(avatarStyle: AvatarStyle): CellStyleBuilder

    /**
     * Устанавливает стиль компонентов [IconButton] в компоненте
     */
    fun iconButtonStyle(iconButtonStyle: ButtonStyle): CellStyleBuilder

    /**
     * Устанавливает стиль компонентов [CheckBox] в компоненте
     */
    fun checkBoxStyle(checkBoxStyle: CheckBoxStyle): CellStyleBuilder

    /**
     * Устанавливает стиль компонентов [RadioBox] в компоненте
     */
    fun radioBoxStyle(radioBoxStyle: RadioBoxStyle): CellStyleBuilder

    /**
     * Устанавливает стиль компонентов [Switch] в компоненте
     */
    fun switchStyle(switchStyle: SwitchStyle): CellStyleBuilder
}

/**
 * Размеры и отступы компонента [Cell]
 */
@Stable
interface CellDimensions {

    /**
     * Отступ между контентом вначале и контентом по середине
     */
    val contentPaddingStart: Dp

    /**
     * Отступ между контентом вначале и контентом в конце
     */
    val contentPaddingEnd: Dp

    companion object {

        /**
         * Возвращает экземпляр [CellDimensionsBuilder]
         */
        fun builder(): CellDimensionsBuilder = DefaultCellDimensions.Builder()
    }
}

/**
 * Билдер для [CellDimensions]
 */
interface CellDimensionsBuilder {

    /**
     * Устанавливает отступ между контентом вначале и контентом по середине
     */
    fun contentPaddingStart(contentPaddingStart: Dp): CellDimensionsBuilder

    /**
     * Устанавливает отступ между контентом по середине и контентом в конце
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): CellDimensionsBuilder

    /**
     * Создаёт экземпляр [CellDimensions]
     */
    fun build(): CellDimensions
}

@Immutable
private class DefaultCellDimensions(
    override val contentPaddingStart: Dp,
    override val contentPaddingEnd: Dp,
) : CellDimensions {
    class Builder : CellDimensionsBuilder {
        private var contentPaddingStart: Dp? = null
        private var contentPaddingEnd: Dp? = null

        override fun contentPaddingStart(contentPaddingStart: Dp) = apply {
            this.contentPaddingStart = contentPaddingStart
        }

        override fun contentPaddingEnd(contentPaddingEnd: Dp) = apply {
            this.contentPaddingEnd = contentPaddingEnd
        }

        override fun build(): CellDimensions {
            return DefaultCellDimensions(
                contentPaddingStart = contentPaddingStart ?: 16.dp,
                contentPaddingEnd = contentPaddingEnd ?: 16.dp,
            )
        }
    }
}

/**
 * Цвета компонента [Cell]
 */
@Stable
interface CellColors {

    /**
     * Цвет тайтла
     */
    val titleColor: InteractiveColor

    /**
     * Цвет лэйбла
     */
    val labelColor: InteractiveColor

    /**
     * Цвет сабтайтла
     */
    val subtitleColor: InteractiveColor

    /**
     * Цвет текста disclosure
     */
    val disclosureTextColor: InteractiveColor

    /**
     * Цвет иконки disclosure
     */
    val disclosureIconColor: InteractiveColor

    companion object {

        /**
         * Возвращает экземпляр [CellColorsBuilder]
         */
        fun builder(): CellColorsBuilder = DefaultCellColors.Builder()
    }
}

/**
 * Билдер для [CellColors]
 */
interface CellColorsBuilder {

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: Color): CellColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: InteractiveColor): CellColorsBuilder

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: Color): CellColorsBuilder =
        labelColor(labelColor.asInteractive())

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: InteractiveColor): CellColorsBuilder

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: Color): CellColorsBuilder =
        subtitleColor(subtitleColor.asInteractive())

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: InteractiveColor): CellColorsBuilder

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: Color): CellColorsBuilder =
        disclosureTextColor(disclosureTextColor.asInteractive())

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: InteractiveColor): CellColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: Color): CellColorsBuilder =
        disclosureIconColor(disclosureIconColor.asInteractive())

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: InteractiveColor): CellColorsBuilder

    /**
     * Возвращает [CellColors]
     */
    fun build(): CellColors
}

@Immutable
private class DefaultCellColors(
    override val titleColor: InteractiveColor,
    override val labelColor: InteractiveColor,
    override val subtitleColor: InteractiveColor,
    override val disclosureTextColor: InteractiveColor,
    override val disclosureIconColor: InteractiveColor,
) : CellColors {
    class Builder : CellColorsBuilder {
        private var titleColor: InteractiveColor? = null
        private var labelColor: InteractiveColor? = null
        private var subtitleColor: InteractiveColor? = null
        private var disclosureTextColor: InteractiveColor? = null
        private var disclosureIconColor: InteractiveColor? = null

        override fun titleColor(titleColor: InteractiveColor) = apply {
            this.titleColor = titleColor
        }

        override fun labelColor(labelColor: InteractiveColor) = apply {
            this.labelColor = labelColor
        }

        override fun subtitleColor(subtitleColor: InteractiveColor) = apply {
            this.subtitleColor = subtitleColor
        }

        override fun disclosureTextColor(disclosureTextColor: InteractiveColor) = apply {
            this.disclosureTextColor = disclosureTextColor
        }

        override fun disclosureIconColor(disclosureIconColor: InteractiveColor) = apply {
            this.disclosureIconColor = disclosureIconColor
        }

        override fun build(): CellColors {
            return DefaultCellColors(
                titleColor = titleColor ?: Color.Black.asInteractive(),
                labelColor = labelColor ?: Color.Black.asInteractive(),
                subtitleColor = subtitleColor ?: Color.Black.asInteractive(),
                disclosureTextColor = disclosureTextColor ?: Color.Black.asInteractive(),
                disclosureIconColor = disclosureIconColor ?: Color.Black.asInteractive(),
            )
        }
    }
}
