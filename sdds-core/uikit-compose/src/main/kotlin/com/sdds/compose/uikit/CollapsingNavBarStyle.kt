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
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CollapsingNavBarStyle] для компонента [CollapsingNavBar]
 */
val LocalCollapsingNavBarStyle = compositionLocalOf { CollapsingNavBarStyle.builder().style() }

/**
 * Стиль компонента CollapsingNavBar
 */
@Immutable
interface CollapsingNavBarStyle : Style {

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
    val titleStyle: StatefulValue<TextStyle>
    val descriptionStyle: StatefulValue<TextStyle>

    /**
     * Тень компонента
     */
    val shadow: ShadowAppearance

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CollapsingNavBarDimensions

    /**
     * Цвета компонента
     */
    val colors: CollapsingNavBarColors

    /**
     * Стиль кнопки действия
     */
    val actionButtonStyle: ButtonStyle?

    companion object {
        /**
         * Возвращает экземпляр [CollapsingNavBarStyleBuilder]
         */
        fun builder(receiver: Any? = null): CollapsingNavBarStyleBuilder =
            DefaultCollapsingNavBarStyle.Builder()
    }
}

/**
 * Билдер стиля [CollapsingNavBarStyle]
 */
interface CollapsingNavBarStyleBuilder : StyleBuilder<CollapsingNavBarStyle> {

    fun titleStyle(titleStyle: StatefulValue<TextStyle>): CollapsingNavBarStyleBuilder

    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает иконку кнопки назад [backIcon]
     */
    fun backIcon(backIcon: Int?): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает форму нижних углов [bottomShape]
     */
    fun bottomShape(bottomShape: CornerBasedShape): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает тень [shadow] компонента
     */
    fun shadow(shadow: ShadowAppearance): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает цвета компонента при помощи [builder].
     */
    @Composable
    fun colors(builder: @Composable CollapsingNavBarColorsBuilder.() -> Unit): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder].
     */
    @Composable
    fun dimensions(builder: @Composable CollapsingNavBarDimensionsBuilder.() -> Unit): CollapsingNavBarStyleBuilder

    /**
     * Устанавливает стиль кнопок действия
     */
    fun actionButtonStyle(actionButtonStyle: ButtonStyle): CollapsingNavBarStyleBuilder
}

private class DefaultCollapsingNavBarStyle(
    override val backIcon: Int?,
    override val shadow: ShadowAppearance,
    override val dimensions: CollapsingNavBarDimensions,
    override val colors: CollapsingNavBarColors,
    override val bottomShape: CornerBasedShape,
    override val actionButtonStyle: ButtonStyle?,
    override val titleStyle: StatefulValue<TextStyle>,
    override val descriptionStyle: StatefulValue<TextStyle>,
) : CollapsingNavBarStyle {

    class Builder : CollapsingNavBarStyleBuilder {

        private var backIcon: Int? = null
        private var bottomShape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private val colorsBuilder = CollapsingNavBarColors.builder()
        private val dimensionsBuilder = CollapsingNavBarDimensions.builder()
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
        override fun colors(builder: @Composable (CollapsingNavBarColorsBuilder.() -> Unit)) = apply {
            this.colorsBuilder.builder()
        }

        @Composable
        override fun dimensions(builder: @Composable (CollapsingNavBarDimensionsBuilder.() -> Unit)) =
            apply {
                this.dimensionsBuilder.builder()
            }

        override fun actionButtonStyle(actionButtonStyle: ButtonStyle) = apply {
            this.actionButtonStyle = actionButtonStyle
        }

        override fun style(): CollapsingNavBarStyle {
            return DefaultCollapsingNavBarStyle(
                backIcon = backIcon,
                colors = colorsBuilder.build(),
                dimensions = dimensionsBuilder.build(),
                shadow = shadow ?: ShadowAppearance(),
                bottomShape = bottomShape ?: RoundedCornerShape(ZeroCornerSize),
                actionButtonStyle = actionButtonStyle,
                titleStyle = titleStyle ?: TextStyle().asStatefulValue(),
                descriptionStyle = descriptionStyle ?: TextStyle().asStatefulValue(),
            )
        }
    }
}

/**
 * Цвета компонента CollapsingNavBar
 */
@Immutable
interface CollapsingNavBarColors {

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
     * Цвет текста по умолчанию
     */
    val titleColor: StatefulValue<Color>
    val descriptionColor: StatefulValue<Color>

    companion object {

        /**
         * Создает экземпляр [CollapsingNavBarColorsBuilder]
         */
        fun builder(): CollapsingNavBarColorsBuilder = DefaultCollapsingNavBarColors.Builder()
    }
}

/**
 * Builder для [CollapsingNavBarColors]
 */
interface CollapsingNavBarColorsBuilder {
    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: Color): CollapsingNavBarColorsBuilder =
        backgroundColor(backgroundColor.asStatefulValue())

    /**
     * Устанавливает фон [backgroundColor] компонента.
     */
    fun backgroundColor(backgroundColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: Color): CollapsingNavBarColorsBuilder =
        backIconColor(backIconColor.asStatefulValue())

    /**
     * Устанавливает цвет кнопки закрытия [backIconColor].
     */
    fun backIconColor(backIconColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: Color): CollapsingNavBarColorsBuilder =
        actionStartColor(actionStartColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в начале [actionStartColor].
     */
    fun actionStartColor(actionStartColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: Color): CollapsingNavBarColorsBuilder =
        actionEndColor(actionEndColor.asStatefulValue())

    /**
     * Устанавливает цвет экшена в конце [actionEndColor].
     */
    fun actionEndColor(actionEndColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Устанавливает цвет текста по умолчанию [titleColor].
     */
    fun titleColor(titleColor: Color): CollapsingNavBarColorsBuilder =
        titleColor(titleColor.asStatefulValue())

    /**
     * Устанавливает цвет текста по умолчанию [titleColor].
     */
    fun titleColor(titleColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Устанавливает цвет текста по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: Color): CollapsingNavBarColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает цвет текста по умолчанию [descriptionColor].
     */
    fun descriptionColor(descriptionColor: StatefulValue<Color>): CollapsingNavBarColorsBuilder

    /**
     * Создает экземпляр [CollapsingNavBarColors]
     */
    fun build(): CollapsingNavBarColors
}

@Immutable
private data class DefaultCollapsingNavBarColors(
    override val backgroundColor: StatefulValue<Color>,
    override val backIconColor: StatefulValue<Color>,
    override val actionStartColor: StatefulValue<Color>,
    override val actionEndColor: StatefulValue<Color>,
    override val titleColor: StatefulValue<Color>,
    override val descriptionColor: StatefulValue<Color>,
) : CollapsingNavBarColors {

    class Builder : CollapsingNavBarColorsBuilder {
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

        override fun build(): CollapsingNavBarColors {
            return DefaultCollapsingNavBarColors(
                backgroundColor = backgroundColor ?: Color.LightGray.asStatefulValue(
                    setOf(CollapsingNavBarState.Collapsed) to Color.Gray.copy(0.6f)
                ),
                backIconColor = backIconColor ?: Color.Black.asStatefulValue(),
                actionStartColor = actionStartColor ?: Color.Black.asStatefulValue(),
                actionEndColor = actionEndColor ?: Color.Black.asStatefulValue(),
                titleColor = titleColor ?: Color.Black.asStatefulValue(),
                descriptionColor = descriptionColor ?: Color.DarkGray.asStatefulValue(),
            )
        }
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface CollapsingNavBarDimensions {

    val height: StatefulValue<Dp>

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
    val paddingStart: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    val paddingEnd: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    val paddingTop: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    val paddingBottom: StatefulValue<Dp>

    companion object {
        /**
         * Создает экземпляр [CollapsingNavBarDimensionsBuilder]
         */
        fun builder(): CollapsingNavBarDimensionsBuilder = DefaultCollapsingNavBarDimensions.Builder()
    }
}

/**
 * Builder для [CollapsingNavBarDimensions]
 */
interface CollapsingNavBarDimensionsBuilder {
    /**
     * Устанавливает отступ иконки назад [backIconMargin]
     */
    fun backIconMargin(backIconMargin: Dp): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху от внешнего (не встроенного) текстового блока [textBlockTopMargin]
     */
    fun textBlockTopMargin(textBlockTopMargin: Dp): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает горизонтальный отступ между элементами основного блока [horizontalSpacing]
     */
    fun horizontalSpacing(horizontalSpacing: Dp): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): CollapsingNavBarDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): CollapsingNavBarDimensionsBuilder
    fun height(height: StatefulValue<Dp>): CollapsingNavBarDimensionsBuilder

    /**
     * Создает экземпляр [CollapsingNavBarDimensions]
     */
    fun build(): CollapsingNavBarDimensions
}

private class DefaultCollapsingNavBarDimensions(
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val backIconMargin: Dp,
    override val horizontalSpacing: Dp,
    override val height: StatefulValue<Dp>,
) : CollapsingNavBarDimensions {

    class Builder : CollapsingNavBarDimensionsBuilder {

        private var backIconMargin: Dp? = null
        private var height: StatefulValue<Dp>? = null
        private var horizontalSpacing: Dp? = null
        private var textBlockTopMargin: Dp? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null

        override fun backIconMargin(backIconMargin: Dp) = apply {
            this.backIconMargin = backIconMargin
        }

        override fun textBlockTopMargin(textBlockTopMargin: Dp) = apply {
            this.textBlockTopMargin = textBlockTopMargin
        }

        override fun horizontalSpacing(horizontalSpacing: Dp) = apply {
            this.horizontalSpacing = horizontalSpacing
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>) = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>) = apply {
            this.paddingEnd = paddingEnd
        }

        override fun paddingTop(paddingTop: StatefulValue<Dp>) = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>) = apply {
            this.paddingBottom = paddingBottom
        }

        override fun height(height: StatefulValue<Dp>) = apply {
            this.height = height
        }

        override fun build(): CollapsingNavBarDimensions {
            return DefaultCollapsingNavBarDimensions(
                paddingStart = paddingStart ?: 16.dp.asStatefulValue(),
                paddingEnd = paddingEnd ?: 16.dp.asStatefulValue(),
                paddingTop = paddingTop ?: 16.dp.asStatefulValue(),
                paddingBottom = paddingBottom ?: 16.dp.asStatefulValue(),
                backIconMargin = backIconMargin ?: 4.dp,
                horizontalSpacing = horizontalSpacing ?: 16.dp,
                height = height ?: 256.dp.asStatefulValue(
                    setOf(CollapsingNavBarState.Collapsed) to 64.dp
                ),
            )
        }
    }
}
