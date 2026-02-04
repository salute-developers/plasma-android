package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CollapsingNavigationBarStyle] для компонента [CollapsingNavigationBar]
 */
val LocalCollapsingNavigationBarStyle = compositionLocalOf { CollapsingNavigationBarStyle.builder().style() }

/**
 * Стиль компонента CollapsingNavigationBar
 */
@Immutable
interface CollapsingNavigationBarStyle : Style {

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
     * Стиль заголовка по умолчанию
     */
    val titleStyle: StatefulValue<TextStyle>

    /**
     * Стиль описания по умолчанию
     */
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CollapsingNavigationBarDimensions

    /**
     * Цвета компонента
     */
    val colors: CollapsingNavigationBarColors

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle?

    companion object {
        /**
         * Возвращает экземпляр [CollapsingNavigationBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): CollapsingNavigationBarStyleBuilder =
            DefaultCollapsingNavigationBarStyle.Builder()
    }
}

/**
 * Билдер стиля [CollapsingNavigationBarStyle]
 */
interface CollapsingNavigationBarStyleBuilder : StyleBuilder<CollapsingNavigationBarStyle> {

    /**
     * Устанавливает стиль заголовка [titleStyle]
     */
    fun titleStyle(titleStyle: StatefulValue<TextStyle>): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает стиль описания [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает иконку кнопки назад [backIcon]
     */
    fun backIcon(backIcon: Int?): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: CornerBasedShape): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(
        builder: @Composable CollapsingNavigationBarColorsBuilder.() -> Unit,
    ): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(
        builder: @Composable CollapsingNavigationBarDimensionsBuilder.() -> Unit,
    ): CollapsingNavigationBarStyleBuilder

    /**
     * Устанавливает стиль кнопок действия
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): CollapsingNavigationBarStyleBuilder
}

private class DefaultCollapsingNavigationBarStyle(
    override val backIcon: Int?,
    override val shadow: ShadowAppearance,
    override val dimensions: CollapsingNavigationBarDimensions,
    override val colors: CollapsingNavigationBarColors,
    override val bottomShape: CornerBasedShape,
    override val actionButtonStyle: ButtonStyle?,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
) : CollapsingNavigationBarStyle {

    class Builder : CollapsingNavigationBarStyleBuilder {

        private var backIcon: Int? = null
        private var bottomShape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = CollapsingNavigationBarColors.builder()
        private val dimensionsBuilder = CollapsingNavigationBarDimensions.builder()
        private var titleStyle: StatefulValue<TextStyle>? = null
        private var descriptionStyle: StatefulValue<TextStyle>? = null
        private var actionButtonStyle: ButtonStyle? = null

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
        override fun colors(builder: @Composable (CollapsingNavigationBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (CollapsingNavigationBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun style(): CollapsingNavigationBarStyle {
            return DefaultCollapsingNavigationBarStyle(
                backIcon = backIcon,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shadow = shadow ?: ShadowAppearance(),
                bottomShape = bottomShape ?: RoundedCornerShape(16.dp),
                actionButtonStyle = actionButtonStyle,
                titleStyle = titleStyle ?: TextStyle().asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle().asStatefulValue(),
            )
        }
    }
}

/**
 * Цвета компонента CollapsingNavigationBar
 */
@Immutable
interface CollapsingNavigationBarColors {

    /**
     * Цвет фона
     */
    val backgroundColor: StatefulValue<Color>

    /**
     * Цвет кнопки закрытия
     */
    val backIconColor: StatefulValue<Color>

    /**
     * Цвет экшена в начале
     */
    val actionStartColor: StatefulValue<Color>

    /**
     * Цвет экшена в конце
     */
    val actionEndColor: StatefulValue<Color>

    /**
     * Цвет заголовка
     */
    val titleColor: StatefulValue<Color>

    /**
     * Цвет описания
     */
    val descriptionColor: StatefulValue<Color>

    companion object {

        /**
         * Создает экземпляр [CollapsingNavigationBarColorsBuilder]
         */
        fun builder(): CollapsingNavigationBarColorsBuilder = DefaultCollapsingNavigationBarColors.Builder()
    }
}

/**
 * Builder для [CollapsingNavigationBarColors]
 */
interface CollapsingNavigationBarColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): CollapsingNavigationBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Color): CollapsingNavigationBarColorsBuilder =
        backIconColor(backIconColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Color): CollapsingNavigationBarColorsBuilder =
        actionStartColor(actionStartColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Color): CollapsingNavigationBarColorsBuilder =
        actionEndColor(actionEndColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет заголовка [titleColor].
     */
    fun titleColor(titleColor: Color): CollapsingNavigationBarColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет заголовка [titleColor].
     */
    fun titleColor(titleColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): CollapsingNavigationBarColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает цвет описания [descriptionColor].
     */
    fun descriptionColor(descriptionColor: StatefulValue<Color>): CollapsingNavigationBarColorsBuilder

    /**
     * Создает экземпляр [CollapsingNavigationBarColors]
     */
    fun build(): CollapsingNavigationBarColors
}

@Immutable
private data class DefaultCollapsingNavigationBarColors(
    override val backgroundColor: StatefulValue<Color>,
    override val backIconColor: StatefulValue<Color>,
    override val actionStartColor: StatefulValue<Color>,
    override val actionEndColor: StatefulValue<Color>,
    override val titleColor: StatefulValue<Color>,
    override val descriptionColor: StatefulValue<Color>,
) : CollapsingNavigationBarColors {

    class Builder : CollapsingNavigationBarColorsBuilder {
        private var backgroundColor: StatefulValue<Color>? = null
        private var backIconColor: StatefulValue<Color>? = null
        private var actionStartColor: StatefulValue<Color>? = null
        private var actionEndColor: StatefulValue<Color>? = null
        private var titleColor: StatefulValue<Color>? = null
        private var descriptionColor: StatefulValue<Color>? = null

        override fun backgroundColor(backgroundColor: StatefulValue<Color>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun backIconColor(backIconColor: StatefulValue<Color>) = apply {
            this.backIconColor = backIconColor
        }

        override fun actionStartColor(actionStartColor: StatefulValue<Color>) = apply {
            this.actionStartColor = actionStartColor
        }

        override fun actionEndColor(actionEndColor: StatefulValue<Color>) = apply {
            this.actionEndColor = actionEndColor
        }

        override fun titleColor(titleColor: StatefulValue<Color>) = apply {
            this.titleColor = titleColor
        }

        override fun descriptionColor(descriptionColor: StatefulValue<Color>) = apply {
            this.descriptionColor = descriptionColor
        }

        override fun build(): CollapsingNavigationBarColors {
            return DefaultCollapsingNavigationBarColors(
                backgroundColor = backgroundColor ?: Color.Transparent.asStatefulValue(),
                backIconColor = backIconColor ?: Color.Black.asStatefulValue(),
                actionStartColor = actionStartColor ?: Color.Black.asStatefulValue(),
                actionEndColor = actionEndColor ?: Color.Black.asStatefulValue(),
                titleColor = titleColor ?: Color.White.asStatefulValue(
                    setOf(CollapsingNavigationBarStates.Collapsed) to Color.Black,
                ),
                descriptionColor = descriptionColor ?: Color.LightGray.asStatefulValue(
                    setOf(CollapsingNavigationBarStates.Collapsed) to Color.DarkGray,
                ),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface CollapsingNavigationBarDimensions {

    /**
     * Отступ иконки назад
     */
    val backIconMargin: Dp

    /**
     * Горизонтальный отступ между элементами основного блока
     */
    val horizontalSpacing: Dp

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

    /**
     * Отступ сверху от текстового блока в сотстоянии expanded
     */
    val textBlockTopMargin: Dp

    companion object {
        /**
         * Создает экземпляр [CollapsingNavigationBarDimensionsBuilder]
         */
        fun builder(): CollapsingNavigationBarDimensionsBuilder = DefaultCollapsingNavigationBarDimensions.Builder()
    }
}

/**
 * Builder для [CollapsingNavigationBarDimensions]
 */
interface CollapsingNavigationBarDimensionsBuilder {
    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху от текстового блока в состоянии expanded [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): CollapsingNavigationBarDimensionsBuilder

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): CollapsingNavigationBarDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Создает экземпляр [CollapsingNavigationBarDimensions]
     */
    fun build(): CollapsingNavigationBarDimensions
}

private class DefaultCollapsingNavigationBarDimensions(
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val backIconMargin: Dp,
    override val horizontalSpacing: Dp,
    override val descriptionPadding: StatefulValue<Dp>,
    override val textBlockTopMargin: Dp,
) : CollapsingNavigationBarDimensions {

    class Builder : CollapsingNavigationBarDimensionsBuilder {

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

        override fun build(): CollapsingNavigationBarDimensions {
            return DefaultCollapsingNavigationBarDimensions(
                paddingStart = paddingStart ?: 16.dp,
                paddingEnd = paddingEnd ?: 16.dp,
                paddingTop = paddingTop ?: 16.dp,
                paddingBottom = paddingBottom ?: 16.dp,
                backIconMargin = backIconMargin ?: 4.dp,
                horizontalSpacing = horizontalSpacing ?: 16.dp,
                descriptionPadding = descriptionPadding ?: 2.dp.asStatefulValue(),
                textBlockTopMargin = textBlockTopMargin ?: 64.dp,
            )
        }
    }
}
