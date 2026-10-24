package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [DropdownEmptyStateStyle] для компонента [EmptyState]
 */
val LocalDropdownEmptyStateStyle: ProvidableCompositionLocal<DropdownEmptyStateStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { DropdownEmptyStateStyle.builder().style() }

/**
 * Стиль компонента [EmptyState]
 */
@Immutable
interface DropdownEmptyStateStyle : Style {

    /**
     * Стиль кнопки действия
     */
    val buttonStyle: ButtonStyle?

    /**
     * Стиль текста описания
     */
    @Deprecated("use descriptionStyles", replaceWith = ReplaceWith("descriptionStyles"))
    val descriptionStyle: TextStyle

    /**
     * Стиль текста описания
     */
    val descriptionStyles: StatefulValue<TextStyle>

    /**
     * Цвета компонента
     */
    val colors: EmptyStateColors

    /**
     * Размеры и отступы компонента
     */
    val dimensions: EmptyStateDimensions

    companion object {
        /**
         * Возвращает экземпляр [DropdownEmptyStateStyleBuilder]
         */
        fun builder(receiver: Any? = null): DropdownEmptyStateStyleBuilder =
            DefaultDropdownEmptyStateStyle.BuilderDropdown()
    }
}

/**
 * Билдер стиля компонента
 */
@ApiInfo
interface DropdownEmptyStateStyleBuilder : StyleBuilder<DropdownEmptyStateStyle> {
    /**
     * Устанавливает стиль текста описания [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): DropdownEmptyStateStyleBuilder =
        descriptionStyle(descriptionStyle.asStatefulValue())

    /**
     * Устанавливает стиль текста описания [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): DropdownEmptyStateStyleBuilder

    /**
     * Устанавливает стиль кнопки действия [buttonStyle]
     */
    fun buttonStyle(buttonStyle: ButtonStyle): DropdownEmptyStateStyleBuilder

    /**
     * Устанавливает цвета компонента
     */
    @Composable
    fun colors(builder: @Composable EmptyStateColorsBuilder.() -> Unit): DropdownEmptyStateStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента
     */
    @Composable
    fun dimensions(builder: @Composable EmptyStateDimensionsBuilder.() -> Unit): DropdownEmptyStateStyleBuilder
}

private data class DefaultDropdownEmptyStateStyle(
    override val colors: EmptyStateColors,
    override val dimensions: EmptyStateDimensions,
    override val buttonStyle: ButtonStyle?,
    override val descriptionStyles: StatefulValue<TextStyle>,
) : DropdownEmptyStateStyle {
    @Deprecated("use descriptionStyles", replaceWith = ReplaceWith("descriptionStyles"))
    override val descriptionStyle: TextStyle = descriptionStyles.getDefaultValue()

    class BuilderDropdown : DropdownEmptyStateStyleBuilder {
        private var descriptionStyle: StatefulValue<TextStyle>? = null

        private var buttonStyle: ButtonStyle? = null

        private val colorsBuilder: EmptyStateColorsBuilder = EmptyStateColors.builder()

        private val dimensionsBuilder: EmptyStateDimensionsBuilder = EmptyStateDimensions.builder()

        override fun descriptionStyle(descriptionStyle: StatefulValue<TextStyle>): DropdownEmptyStateStyleBuilder =
            apply { this.descriptionStyle = descriptionStyle }

        override fun buttonStyle(buttonStyle: ButtonStyle): DropdownEmptyStateStyleBuilder =
            apply { this.buttonStyle = buttonStyle }

        @Composable
        override fun colors(builder: @Composable EmptyStateColorsBuilder.() -> Unit):
            DropdownEmptyStateStyleBuilder = apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(builder: @Composable EmptyStateDimensionsBuilder.() -> Unit):
            DropdownEmptyStateStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): DropdownEmptyStateStyle = DefaultDropdownEmptyStateStyle(
            descriptionStyles = descriptionStyle ?: TextStyle.Default.asStatefulValue(),
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            buttonStyle = buttonStyle,
        )
    }
}

/**
 * Цвета компонента
 */
@Immutable
interface EmptyStateColors {
    /**
     * Цвет иконки
     */
    @Deprecated("use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    val iconColor: InteractiveColor

    /**
     * Цвет иконки
     */
    val iconBrush: StatefulValue<Brush>

    /**
     * Цвет текста описания
     */
    @Deprecated("use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    val descriptionColor: InteractiveColor

    /**
     * Цвет текста описания
     */
    val descriptionBrush: StatefulValue<Brush>

    companion object {
        /**
         * Возвращает экземпляр [EmptyStateColorsBuilder]
         */
        fun builder(): EmptyStateColorsBuilder = DefaultEmptyStateColors.Builder()
    }
}

/**
 * Билдер для [EmptyStateColors]
 */
interface EmptyStateColorsBuilder {
    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: InteractiveColor): EmptyStateColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): EmptyStateColorsBuilder =
        iconColor(iconColor.asStatefulBrush())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Brush): EmptyStateColorsBuilder =
        iconColor(iconColor.asStatefulValue())

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: StatefulValue<Brush>): EmptyStateColorsBuilder

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): EmptyStateColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): EmptyStateColorsBuilder =
        descriptionColor(descriptionColor.asStatefulBrush())

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Brush): EmptyStateColorsBuilder =
        descriptionColor(descriptionColor.asStatefulValue())

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: StatefulValue<Brush>): EmptyStateColorsBuilder

    /**
     * Вернёт [EmptyStateColors]
     */
    fun build(): EmptyStateColors
}

private data class DefaultEmptyStateColors(
    override val iconBrush: StatefulValue<Brush>,
    override val descriptionBrush: StatefulValue<Brush>,

) : EmptyStateColors {
    @Deprecated("use iconBrush", replaceWith = ReplaceWith("iconBrush"))
    override val iconColor: InteractiveColor = Color.Transparent.asInteractive()

    @Deprecated("use descriptionBrush", replaceWith = ReplaceWith("descriptionBrush"))
    override val descriptionColor: InteractiveColor = Color.Transparent.asInteractive()

    class Builder : EmptyStateColorsBuilder {
        private var iconColor: StatefulValue<Brush>? = null
        private var descriptionColor: StatefulValue<Brush>? = null

        override fun iconColor(iconColor: StatefulValue<Brush>): EmptyStateColorsBuilder =
            apply {
                this.iconColor = iconColor
            }

        override fun descriptionColor(descriptionColor: StatefulValue<Brush>): EmptyStateColorsBuilder =
            apply {
                this.descriptionColor = descriptionColor
            }

        override fun build(): EmptyStateColors = DefaultEmptyStateColors(
            iconBrush = iconColor ?: Color.Black.asStatefulBrush(),
            descriptionBrush = descriptionColor ?: Color.Black.asStatefulBrush(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface EmptyStateDimensions {
    /**
     * Отступ описания
     */
    @Deprecated("use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
    val descriptionPadding: Dp

    /**
     * Отступ описания
     */
    val descriptionPaddingValues: StatefulValue<Dp>

    /**
     * Отступ сверху
     */
    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    val paddingTop: Dp

    /**
     * Отступ сверху
     */
    val paddingTopValues: StatefulValue<Dp>

    /**
     * Отступ снизу
     */
    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    val paddingBottom: Dp

    /**
     * Отступ снизу
     */
    val paddingBottomValues: StatefulValue<Dp>

    /**
     * Отступ в начале
     */
    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    val paddingStart: Dp

    /**
     * Отступ в начале
     */
    val paddingStartValues: StatefulValue<Dp>

    /**
     * Отступ в конце
     */
    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    val paddingEnd: Dp

    /**
     * Отступ в конце
     */
    val paddingEndValues: StatefulValue<Dp>

    companion object {
        /**
         * Возвращает экземпляр [EmptyStateDimensionsBuilder]
         */
        fun builder(): EmptyStateDimensionsBuilder = DefaultEmptyStateDimensions.Builder()
    }
}

/**
 * Билдер для [EmptyStateDimensions]
 */
interface EmptyStateDimensionsBuilder {
    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: Dp): EmptyStateDimensionsBuilder =
        descriptionPadding(descriptionPadding.asStatefulValue())

    /**
     * Устанавливает отступ описания [descriptionPadding]
     */
    fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): EmptyStateDimensionsBuilder =
        paddingTop(paddingTop.asStatefulValue())

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: StatefulValue<Dp>): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): EmptyStateDimensionsBuilder =
        paddingBottom(paddingBottom.asStatefulValue())

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: StatefulValue<Dp>): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): EmptyStateDimensionsBuilder =
        paddingStart(paddingStart.asStatefulValue())

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: StatefulValue<Dp>): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): EmptyStateDimensionsBuilder =
        paddingEnd(paddingEnd.asStatefulValue())

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: StatefulValue<Dp>): EmptyStateDimensionsBuilder

    /**
     * Вернёт [EmptyStateDimensions]
     */
    fun build(): EmptyStateDimensions
}

private data class DefaultEmptyStateDimensions(
    override val descriptionPaddingValues: StatefulValue<Dp>,
    override val paddingTopValues: StatefulValue<Dp>,
    override val paddingBottomValues: StatefulValue<Dp>,
    override val paddingStartValues: StatefulValue<Dp>,
    override val paddingEndValues: StatefulValue<Dp>,
) : EmptyStateDimensions {
    @Deprecated("use descriptionPaddingValues", replaceWith = ReplaceWith("descriptionPaddingValues"))
    override val descriptionPadding: Dp = descriptionPaddingValues.getDefaultValue()

    @Deprecated("use paddingTopValues", replaceWith = ReplaceWith("paddingTopValues"))
    override val paddingTop: Dp = paddingTopValues.getDefaultValue()

    @Deprecated("use paddingBottomValues", replaceWith = ReplaceWith("paddingBottomValues"))
    override val paddingBottom: Dp = paddingBottomValues.getDefaultValue()

    @Deprecated("use paddingStartValues", replaceWith = ReplaceWith("paddingStartValues"))
    override val paddingStart: Dp = paddingStartValues.getDefaultValue()

    @Deprecated("use paddingEndValues", replaceWith = ReplaceWith("paddingEndValues"))
    override val paddingEnd: Dp = paddingEndValues.getDefaultValue()

    class Builder : EmptyStateDimensionsBuilder {
        private var descriptionPadding: StatefulValue<Dp>? = null

        private var paddingTop: StatefulValue<Dp>? = null

        private var paddingBottom: StatefulValue<Dp>? = null

        private var paddingStart: StatefulValue<Dp>? = null

        private var paddingEnd: StatefulValue<Dp>? = null

        override fun descriptionPadding(descriptionPadding: StatefulValue<Dp>): EmptyStateDimensionsBuilder =
            apply { this.descriptionPadding = descriptionPadding }

        override fun paddingTop(paddingTop: StatefulValue<Dp>): EmptyStateDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: StatefulValue<Dp>): EmptyStateDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun paddingStart(paddingStart: StatefulValue<Dp>): EmptyStateDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: StatefulValue<Dp>): EmptyStateDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun build(): EmptyStateDimensions =
            DefaultEmptyStateDimensions(
                descriptionPaddingValues = descriptionPadding ?: 8.dp.asStatefulValue(),
                paddingTopValues = paddingTop ?: 0.dp.asStatefulValue(),
                paddingBottomValues = paddingBottom ?: 0.dp.asStatefulValue(),
                paddingStartValues = paddingStart ?: 0.dp.asStatefulValue(),
                paddingEndValues = paddingEnd ?: 0.dp.asStatefulValue(),
            )
    }
}
