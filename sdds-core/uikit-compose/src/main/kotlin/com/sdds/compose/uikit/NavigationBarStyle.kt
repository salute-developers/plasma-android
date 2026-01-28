package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [NavigationBarStyle] для компонента [NavigationBar]
 */
val LocalNavigationBarStyle = compositionLocalOf { NavigationBarStyle.builder().style() }

/**
 * Стиль компонента NavigationBar
 */
@Immutable
interface NavigationBarStyle : Style {

    /**
     * Иконка кнопки назад
     */
    @get:DrawableRes
    val backIcon: Int?

    /**
     * Форма нижних углов компонента
     */
    val bottomShape: CornerBasedShape

    /**
     * Стиль текста по умолчанию
     */
    val textStyle: TextStyle

    /**
     * Стиль описания по умолчанию
     */
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Стиль основной надписи по умолчанию
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: NavigationBarDimensions

    /**
     * Цвета компонента
     */
    val colors: NavigationBarColors

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle?

    companion object {
        /**
         * Возвращает экземпляр [NavigationBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): NavigationBarStyleBuilder =
            DefaultNavigationBarStyle.Builder()
    }
}

/**
 * Билдер стиля [NavigationBarStyle]
 */
interface NavigationBarStyleBuilder : StyleBuilder<NavigationBarStyle> {

    /**
     * Устанавливает стиль текста по умолчанию [textStyle]
     */
    fun textStyle(textStyle: TextStyle): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль основной надписи по умолчанию [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль основной надписи по умолчанию [titleStyle]
     */
    fun titleStyle(titleStyle: TextStyle): NavigationBarStyleBuilder =
        titleStyle(titleStyle.asStatefulValue())

    /**
     * Устанавливает стиль описания по умолчанию [titleStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль описания по умолчанию [titleStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): NavigationBarStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает иконку кнопки назад [backIcon]
     */
    fun backIcon(backIcon: Int?): NavigationBarStyleBuilder

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: CornerBasedShape): NavigationBarStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): NavigationBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable NavigationBarColorsBuilder.() -> Unit): NavigationBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable NavigationBarDimensionsBuilder.() -> Unit): NavigationBarStyleBuilder

    /**
     * Устанавливает стиль кнопок действия
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): NavigationBarStyleBuilder
}

private class DefaultNavigationBarStyle(
    override val backIcon: Int?,
    override val shadow: ShadowAppearance,
    override val dimensions: NavigationBarDimensions,
    override val colors: NavigationBarColors,
    override val bottomShape: CornerBasedShape,
    override val textStyle: TextStyle,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
    override val actionButtonStyle: ButtonStyle?,
) : NavigationBarStyle {

    class Builder : NavigationBarStyleBuilder {

        private var backIcon: Int? = null
        private var bottomShape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = NavigationBarColors.builder()
        private val dimensionsBuilder = NavigationBarDimensions.builder()
        private var textStyle: TextStyle? = null
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var actionButtonStyle: ButtonStyle? = null

        override fun textStyle(textStyle: TextStyle) = apply {
            this.textStyle = textStyle
        }

        override fun titleStyle(titleStyle: StatefulValue<TextStyle>) = apply {
            this.titleStyle = titleStyle
        }

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>) = apply {
            this.descriptionStyle = descriptionStyle
        }

        override fun backIcon(backIcon: Int?) = apply {
            this.backIcon = backIcon
        }

        override fun bottomShape(bottomShape: CornerBasedShape) = apply {
            this.bottomShape = bottomShape
        }

        override fun shadow(shadow: ShadowAppearance) = apply {
            this.shadow = shadow
        }

        @Composable
        override fun colors(builder: @Composable (NavigationBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (NavigationBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun style(): NavigationBarStyle {
            return DefaultNavigationBarStyle(
                backIcon = backIcon,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shadow = shadow ?: ShadowAppearance(),
                bottomShape = bottomShape ?: RoundedCornerShape(ZeroCornerSize),
                textStyle = textStyle ?: TextStyle.Default,
                titleStyle = titleStyle ?: TextStyle.Default.asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
                actionButtonStyle = actionButtonStyle,
            )
        }
    }
}

/**
 * Цвета компонента NavigationBar
 */
@Immutable
interface NavigationBarColors {

    /**
     * Цвет фона
     */
    val backgroundColor: InteractiveColor

    /**
     * Цвет кнопки закрытия
     */
    val backIconColor: InteractiveColor

    /**
     * Цвет экшена в начале
     */
    val actionStartColor: InteractiveColor

    /**
     * Цвет экшена в конце
     */
    val actionEndColor: InteractiveColor

    /**
     * Цвет текста по умолчанию
     */
    val textColor: InteractiveColor

    /**
     * Цвет основной надписи по умолчанию
     */
    val titleColor: InteractiveColor

    /**
     * Цвет описания по умолчанию
     */
    val descriptionColor: InteractiveColor

    companion object {

        /**
         * Создает экземпляр [NavigationBarColorsBuilder]
         */
        fun builder(): NavigationBarColorsBuilder = DefaultNavigationBarColors.Builder()
    }
}

/**
 * Builder для [NavigationBarColors]
 */
interface NavigationBarColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): NavigationBarColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Color): NavigationBarColorsBuilder =
        backIconColor(backIconColor.asInteractive())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Color): NavigationBarColorsBuilder =
        actionStartColor(actionStartColor.asInteractive())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Color): NavigationBarColorsBuilder =
        actionEndColor(actionEndColor.asInteractive())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: Color): NavigationBarColorsBuilder =
        textColor(textColor.asInteractive())

    /**
     * Устанавливает цвет текста по умолчанию [textColor].
     */
    fun textColor(textColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: Color): NavigationBarColorsBuilder =
        titleColor(titleColor.asInteractive())

    /**
     * Устанавливает цвет основной надписи по умолчанию [titleColor].
     */
    fun titleColor(titleColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): NavigationBarColorsBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Устанавливает цвет описания по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: InteractiveColor): NavigationBarColorsBuilder

    /**
     * Создает экземпляр [NavigationBarColors]
     */
    fun build(): NavigationBarColors
}

@Immutable
private data class DefaultNavigationBarColors(
    override val backgroundColor: InteractiveColor,
    override val backIconColor: InteractiveColor,
    override val actionStartColor: InteractiveColor,
    override val actionEndColor: InteractiveColor,
    override val textColor: InteractiveColor,
    override val titleColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
) : NavigationBarColors {

    class Builder : NavigationBarColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var backIconColor: InteractiveColor? = null
        private var actionStartColor: InteractiveColor? = null
        private var actionEndColor: InteractiveColor? = null
        private var textColor: InteractiveColor? = null
        private var titleColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backIconColor(backIconColor: InteractiveColor) = apply {
            this.backIconColor = backIconColor
        }

        override fun actionStartColor(actionStartColor: InteractiveColor) = apply {
            this.actionStartColor = actionStartColor
        }

        override fun actionEndColor(actionEndColor: InteractiveColor) = apply {
            this.actionEndColor = actionEndColor
        }

        override fun textColor(textColor: InteractiveColor) = apply {
            this.textColor = textColor
        }

        override fun titleColor(titleColor: InteractiveColor) = apply {
            this.titleColor = titleColor
        }

        override fun descriptionColor(descriptionColor: InteractiveColor) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun build(): NavigationBarColors {
            return DefaultNavigationBarColors(
                backgroundColor = backgroundColor ?: Color.Transparent.asInteractive(),
                backIconColor = backIconColor ?: Color.Black.asInteractive(),
                actionStartColor = actionStartColor ?: Color.Black.asInteractive(),
                actionEndColor = actionEndColor ?: Color.Black.asInteractive(),
                textColor = textColor ?: Color.Black.asInteractive(),
                titleColor = titleColor ?: Color.Black.asInteractive(),
                descriptionColor = descriptionColor ?: Color.Gray.asInteractive(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface NavigationBarDimensions {

    /**
     * Отступ иконки назад
     */
    val backIconMargin: Dp

    /**
     * Горизонтальный отступ между элементами основного блока
     */
    val horizontalSpacing: Dp

    /**
     * Отступ сверху от внешнего (не встроенного) текстового блока
     */
    val textBlockTopMargin: Dp

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

    /**
     * Отступ описания
     */
    val descriptionPadding: StatefulValue<Dp>

    companion object {
        /**
         * Создает экземпляр [NavigationBarDimensionsBuilder]
         */
        fun builder(): NavigationBarDimensionsBuilder = DefaultNavigationBarDimensions.Builder()
    }
}

/**
 * Builder для [NavigationBarDimensions]
 */
interface NavigationBarDimensionsBuilder {
    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): NavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): NavigationBarDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): NavigationBarDimensionsBuilder

    /**
     * Создает экземпляр [NavigationBarDimensions]
     */
    fun build(): NavigationBarDimensions
}

private class DefaultNavigationBarDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val backIconMargin: Dp,
    override val horizontalSpacing: Dp,
    override val textBlockTopMargin: Dp,
    override val descriptionPadding: StatefulValue<Dp>,
) : NavigationBarDimensions {

    class Builder : NavigationBarDimensionsBuilder {

        private var backIconMargin: Dp? = null
        private var horizontalSpacing: Dp? = null
        private var textBlockTopMargin: Dp? = null
        private var paddingStart: Dp? = null
        private var paddingEnd: Dp? = null
        private var paddingTop: Dp? = null
        private var paddingBottom: Dp? = null
        private var descriptionPadding: StatefulValue<Dp>? = null

        override fun backIconMargin(backIconMargin: Dp) = apply {
            this.backIconMargin = backIconMargin
        }

        override fun textBlockTopMargin(textBlockTopMargin: Dp) = apply {
            this.textBlockTopMargin = textBlockTopMargin
        }

        override fun horizontalSpacing(horizontalSpacing: Dp) = apply {
            this.horizontalSpacing = horizontalSpacing
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

        override fun descriptionPadding(descriptionPadding: StatefulValue<Dp>) = apply {
            this.descriptionPadding = descriptionPadding
        }

        override fun build(): NavigationBarDimensions {
            return DefaultNavigationBarDimensions(
                paddingStart = paddingStart ?: 16.dp,
                paddingEnd = paddingEnd ?: 16.dp,
                paddingTop = paddingTop ?: 16.dp,
                paddingBottom = paddingBottom ?: 16.dp,
                backIconMargin = backIconMargin ?: 4.dp,
                horizontalSpacing = horizontalSpacing ?: 16.dp,
                textBlockTopMargin = textBlockTopMargin ?: 16.dp,
                descriptionPadding = descriptionPadding ?: 2.dp.asStatefulValue(),
            )
        }
    }
}
