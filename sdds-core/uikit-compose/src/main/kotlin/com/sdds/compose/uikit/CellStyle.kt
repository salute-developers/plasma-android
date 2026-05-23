package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
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
    @Deprecated(
        "Use labelStyles",
        replaceWith = ReplaceWith(
            "labelStyles",
        ),
    )
    val labelStyle: TextStyle

    /**
     * Стили лэйбла
     */
    val labelStyles: StatefulValue<TextStyle>

    /**
     * Стиль тайтла
     */
    @Deprecated(
        "Use titleStyle",
        replaceWith = ReplaceWith(
            "titleStyle",
        ),
    )
    val titleStyle: TextStyle

    /**
     * Стили тайтла
     */
    val titleStyles: StatefulValue<TextStyle>

    /**
     * Стиль сабйтайтла
     */
    @Deprecated(
        "Use subtitleStyles",
        replaceWith = ReplaceWith(
            "subtitleStyles",
        ),
    )
    val subtitleStyle: TextStyle

    /**
     * Стили сабйтайтла
     */
    val subtitleStyles: StatefulValue<TextStyle>

    /**
     * Cтиль текста disclosure
     */
    @Deprecated(
        "Use disclosureTextStyles",
        replaceWith = ReplaceWith(
            "disclosureTextStyles",
        ),
    )
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

    /**
     * Стиль [Counter], используемых в [Cell]
     */
    val counterStyle: CounterStyle

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
    override val counterStyle: CounterStyle,
) : CellStyle {

    @Deprecated("Use labelStyles", replaceWith = ReplaceWith("labelStyles"))
    override val labelStyle: TextStyle get() = labelStyles.getDefaultValue()

    @Deprecated("Use titleStyles", replaceWith = ReplaceWith("titleStyles"))
    override val titleStyle: TextStyle get() = titleStyles.getDefaultValue()

    @Deprecated("Use subtitleStyles", replaceWith = ReplaceWith("subtitleStyles"))
    override val subtitleStyle: TextStyle get() = subtitleStyles.getDefaultValue()

    @Deprecated("Use disclosureTextStyles", replaceWith = ReplaceWith("disclosureTextStyles"))
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
        private var counterStyle: CounterStyle? = null

        override fun labelStyle(labelStyle: StatefulValue<TextStyle>) = apply {
            this.labelStyle = labelStyle
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>) = apply {
            this.subtitleStyle = subtitleStyle
        }

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

        override fun counterStyle(counterStyle: CounterStyle) = apply {
            this.counterStyle = counterStyle
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
                counterStyle = counterStyle ?: CounterStyle.builder().style(),
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
    fun labelStyle(labelStyle: TextStyle): CellStyleBuilder =
        labelStyle(labelStyle.asStatefulValue())

    /**
     * Устанавливает стили лэйбла
     */
    fun labelStyle(labelStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль тайтла
     */
    fun titleStyle(titleStyle: TextStyle): CellStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стили тайтла
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль сабтайтла
     */
    fun subtitleStyle(subtitleStyle: TextStyle): CellStyleBuilder =
        subtitleStyle(subtitleStyle.asStatefulValue())

    /**
     * Устанавливает стили сабтайтла
     */
    fun subtitleStyle(subtitleStyle: StatefulValue<TextStyle>): CellStyleBuilder

    /**
     * Устанавливает стиль текста disclosure
     */
    fun disclosureTextStyle(disclosureStyle: TextStyle): CellStyleBuilder =
        disclosureTextStyle(disclosureStyle.asStatefulValue())

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

    /**
     * Устанавливает стиль компонентов [Counter] в компоненте
     */
    fun counterStyle(counterStyle: CounterStyle): CellStyleBuilder
}

/**
 * Размеры и отступы компонента [Cell]
 */
@Stable
interface CellDimensions {

    /**
     * Отступ между контентом вначале и контентом по середине
     */
    @Deprecated(
        "Use contentPaddingStartValues",
        replaceWith = ReplaceWith("contentPaddingStartValues"),
    )
    val contentPaddingStart: Dp

    /**
     * Отступ между контентом вначале и контентом по середине
     */
    val contentPaddingStartValues: StatefulValue<Dp>

    /**
     * Отступ между контентом вначале и контентом в конце
     */
    @Deprecated(
        "Use contentPaddingEndValues",
        replaceWith = ReplaceWith("contentPaddingEndValues"),
    )
    val contentPaddingEnd: Dp

    /**
     * Отступ между контентом вначале и контентом в конце
     */
    val contentPaddingEndValues: StatefulValue<Dp>

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
    fun contentPaddingStart(contentPaddingStart: Dp): CellDimensionsBuilder =
        contentPaddingStart(contentPaddingStart.asStatefulValue())

    /**
     * Устанавливает отступ между контентом вначале и контентом по середине
     */
    fun contentPaddingStart(values: StatefulValue<Dp>): CellDimensionsBuilder

    /**
     * Устанавливает отступ между контентом по середине и контентом в конце
     */
    fun contentPaddingEnd(contentPaddingEnd: Dp): CellDimensionsBuilder =
        contentPaddingEnd(contentPaddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ между контентом по середине и контентом в конце
     */
    fun contentPaddingEnd(values: StatefulValue<Dp>): CellDimensionsBuilder

    /**
     * Создаёт экземпляр [CellDimensions]
     */
    fun build(): CellDimensions
}

@Immutable
private class DefaultCellDimensions(
    override val contentPaddingStartValues: StatefulValue<Dp>,
    override val contentPaddingEndValues: StatefulValue<Dp>,

) : CellDimensions {
    @Deprecated(
        "Use contentPaddingStartValues",
        replaceWith = ReplaceWith("contentPaddingStartValues"),
    )
    override val contentPaddingStart: Dp = 16.dp

    @Deprecated(
        "Use contentPaddingEndValues",
        replaceWith = ReplaceWith("contentPaddingEndValues"),
    )
    override val contentPaddingEnd: Dp = 16.dp

    class Builder : CellDimensionsBuilder {
        private var contentPaddingStart: StatefulValue<Dp>? = null
        private var contentPaddingEnd: StatefulValue<Dp>? = null

        override fun contentPaddingStart(values: StatefulValue<Dp>): CellDimensionsBuilder = apply {
            this.contentPaddingStart = values
        }

        override fun contentPaddingEnd(values: StatefulValue<Dp>): CellDimensionsBuilder = apply {
            this.contentPaddingEnd = values
        }

        override fun build(): CellDimensions {
            return DefaultCellDimensions(
                contentPaddingStartValues = contentPaddingStart ?: 16.dp.asStatefulValue(),
                contentPaddingEndValues = contentPaddingEnd ?: 16.dp.asStatefulValue(),
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
    @Deprecated(
        "Use titleBrush",
        replaceWith = ReplaceWith("titleBrush"),
    )
    val titleColor: InteractiveColor

    /**
     * Кисть тайтла
     */
    val titleBrush: StatefulValue<Brush>

    /**
     * Цвет лэйбла
     */
    @Deprecated(
        "Use labelBrush",
        replaceWith = ReplaceWith("labelBrush"),
    )
    val labelColor: InteractiveColor

    /**
     * Кистmь лэйбла
     */
    val labelBrush: StatefulValue<Brush>

    /**
     * Цвет сабтайтла
     */
    @Deprecated(
        "Use subtitleBrush",
        replaceWith = ReplaceWith("subtitleBrush"),
    )
    val subtitleColor: InteractiveColor

    /**
     * Кисть сабтайтла
     */
    val subtitleBrush: StatefulValue<Brush>

    /**
     * Цвет текста disclosure
     */
    @Deprecated(
        "Use disclosureTextBrush",
        replaceWith = ReplaceWith("disclosureTextBrush"),
    )
    val disclosureTextColor: InteractiveColor

    /**
     * Кисть текста disclosure
     */
    val disclosureTextBrush: StatefulValue<Brush>

    /**
     * Цвет иконки disclosure
     */
    @Deprecated(
        "Use disclosureIconBrush",
        replaceWith = ReplaceWith("disclosureIconBrush"),
    )
    val disclosureIconColor: InteractiveColor

    /**
     * Кисть иконки disclosure
     */
    val disclosureIconBrush: StatefulValue<Brush>

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
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает цвет тайтла
     */
    fun titleColor(titleColor: InteractiveColor): CellColorsBuilder =
        titleColor(titleColor.asStatefulBrush())

    /**
     * Устанавливает кисть тайтла компонента [brush]
     */
    fun titleColor(brush: Brush): CellColorsBuilder =
        titleColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти тайтла компонента [brush]
     */
    fun titleColor(brush: StatefulValue<Brush>): CellColorsBuilder

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: Color): CellColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает цвет лэйбла
     */
    fun labelColor(labelColor: InteractiveColor): CellColorsBuilder =
        labelColor(labelColor.asStatefulBrush())

    /**
     * Устанавливает кисть лэйбла компонента [brush]
     */
    fun labelColor(brush: Brush): CellColorsBuilder =
        labelColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти лэйбла компонента [brush]
     */
    fun labelColor(brush: StatefulValue<Brush>): CellColorsBuilder

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: Color): CellColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает цвет сабтайтла
     */
    fun subtitleColor(subtitleColor: InteractiveColor): CellColorsBuilder =
        subtitleColor(subtitleColor.asStatefulBrush())

    /**
     * Устанавливает кисть сабтайтла компонента [brush]
     */
    fun subtitleColor(brush: Brush): CellColorsBuilder =
        subtitleColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти сабтайтла компонента [brush]
     */
    fun subtitleColor(brush: StatefulValue<Brush>): CellColorsBuilder

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: Color): CellColorsBuilder =
        disclosureTextColor(disclosureTextColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста disclosure
     */
    fun disclosureTextColor(disclosureTextColor: InteractiveColor): CellColorsBuilder =
        disclosureTextColor(disclosureTextColor.asStatefulBrush())

    /**
     * Устанавливает кисть текста disclosure компонента [brush]
     */
    fun disclosureTextColor(brush: Brush): CellColorsBuilder =
        disclosureTextColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти текста disclosure компонента [brush]
     */
    fun disclosureTextColor(brush: StatefulValue<Brush>): CellColorsBuilder

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: Color): CellColorsBuilder =
        disclosureIconColor(disclosureIconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки disclosure
     */
    fun disclosureIconColor(disclosureIconColor: InteractiveColor): CellColorsBuilder =
        disclosureIconColor(disclosureIconColor.asStatefulBrush())

    /**
     * Устанавливает кисть иконки disclosure компонента [brush]
     */
    fun disclosureIconColor(brush: Brush): CellColorsBuilder =
        disclosureIconColor(brush.asStatefulValue())

    /**
     * Устанавливает кисти иконки disclosure компонента [brush]
     */
    fun disclosureIconColor(brush: StatefulValue<Brush>): CellColorsBuilder

    /**
     * Возвращает [CellColors]
     */
    fun build(): CellColors
}

@Immutable
private class DefaultCellColors(
    override val titleBrush: StatefulValue<Brush>,
    override val labelBrush: StatefulValue<Brush>,
    override val subtitleBrush: StatefulValue<Brush>,
    override val disclosureTextBrush: StatefulValue<Brush>,
    override val disclosureIconBrush: StatefulValue<Brush>,
) : CellColors {
    @Deprecated(
        "Use titleBrush",
        replaceWith = ReplaceWith("titleBrush"),
    )
    override val titleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use labelBrush",
        replaceWith = ReplaceWith("labelBrush"),
    )
    override val labelColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use subtitleBrush",
        replaceWith = ReplaceWith("subtitleBrush"),
    )
    override val subtitleColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use disclosureTextBrush",
        replaceWith = ReplaceWith("disclosureTextBrush"),
    )
    override val disclosureTextColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated(
        "Use disclosureIconBrush",
        replaceWith = ReplaceWith("disclosureIconBrush"),
    )
    override val disclosureIconColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : CellColorsBuilder {
        private var titleColor: StatefulValue<Brush>? = null
        private var labelColor: StatefulValue<Brush>? = null
        private var subtitleColor: StatefulValue<Brush>? = null
        private var disclosureTextColor: StatefulValue<Brush>? = null
        private var disclosureIconColor: StatefulValue<Brush>? = null

        override fun titleColor(brush: StatefulValue<Brush>) = apply {
            this.titleColor = brush
        }

        override fun labelColor(brush: StatefulValue<Brush>) = apply {
            this.labelColor = brush
        }

        override fun subtitleColor(brush: StatefulValue<Brush>) = apply {
            this.subtitleColor = brush
        }

        override fun disclosureTextColor(brush: StatefulValue<Brush>) = apply {
            this.disclosureTextColor = brush
        }

        override fun disclosureIconColor(brush: StatefulValue<Brush>) = apply {
            this.disclosureIconColor = brush
        }

        override fun build(): CellColors {
            return DefaultCellColors(
                titleBrush = titleColor ?: Color.Black.asStatefulBrush(),
                labelBrush = labelColor ?: Color.Black.asStatefulBrush(),
                subtitleBrush = subtitleColor ?: Color.Black.asStatefulBrush(),
                disclosureTextBrush = disclosureTextColor ?: Color.Black.asStatefulBrush(),
                disclosureIconBrush = disclosureIconColor ?: Color.Black.asStatefulBrush(),
            )
        }
    }
}
