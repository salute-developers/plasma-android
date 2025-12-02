package com.sdds.compose.uikit

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
    val descriptionStyle: TextStyle

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
interface DropdownEmptyStateStyleBuilder : StyleBuilder<DropdownEmptyStateStyle> {
    /**
     * Устанавливает стиль текста описания [descriptionStyle]
     */
    fun descriptionStyle(descriptionStyle: TextStyle): DropdownEmptyStateStyleBuilder

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
    override val descriptionStyle: TextStyle,
    override val colors: EmptyStateColors,
    override val dimensions: EmptyStateDimensions,
    override val buttonStyle: ButtonStyle?,
) : DropdownEmptyStateStyle {
    class BuilderDropdown : DropdownEmptyStateStyleBuilder {
        private var descriptionStyle: TextStyle? = null

        private var buttonStyle: ButtonStyle? = null

        private val colorsBuilder: EmptyStateColorsBuilder = EmptyStateColors.builder()

        private val dimensionsBuilder: EmptyStateDimensionsBuilder = EmptyStateDimensions.builder()

        override fun descriptionStyle(descriptionStyle: TextStyle): DropdownEmptyStateStyleBuilder =
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
            descriptionStyle = descriptionStyle ?: TextStyle.Default,
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
    val iconColor: InteractiveColor

    /**
     * Цвет текста описания
     */
    val descriptionColor: InteractiveColor

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
    fun iconColor(iconColor: InteractiveColor): EmptyStateColorsBuilder

    /**
     * Устанавливает цвет иконки [iconColor]
     */
    fun iconColor(iconColor: Color): EmptyStateColorsBuilder =
        iconColor(iconColor.asInteractive())

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: InteractiveColor): EmptyStateColorsBuilder

    /**
     * Устанавливает цвет текста описания [descriptionColor]
     */
    fun descriptionColor(descriptionColor: Color): EmptyStateColorsBuilder =
        descriptionColor(descriptionColor.asInteractive())

    /**
     * Вернёт [EmptyStateColors]
     */
    fun build(): EmptyStateColors
}

private data class DefaultEmptyStateColors(
    override val iconColor: InteractiveColor,
    override val descriptionColor: InteractiveColor,
) : EmptyStateColors {
    class Builder : EmptyStateColorsBuilder {
        private var iconColor: InteractiveColor? = null
        private var descriptionColor: InteractiveColor? = null

        override fun iconColor(iconColor: InteractiveColor): EmptyStateColorsBuilder =
            apply {
                this.iconColor = iconColor
            }

        override fun descriptionColor(descriptionColor: InteractiveColor): EmptyStateColorsBuilder =
            apply {
                this.descriptionColor = descriptionColor
            }

        override fun build(): EmptyStateColors = DefaultEmptyStateColors(
            iconColor = iconColor ?: Color.Black.asInteractive(),
            descriptionColor = descriptionColor ?: Color.Black.asInteractive(),
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
    val descriptionPadding: Dp

    /**
     * Отступ сверху
     */
    val paddingTop: Dp

    /**
     * Отступ снизу
     */
    val paddingBottom: Dp

    /**
     * Отступ в начале
     */
    val paddingStart: Dp

    /**
     * Отступ в конце
     */
    val paddingEnd: Dp

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
    fun descriptionPadding(descriptionPadding: Dp): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ сверху [paddingTop]
     */
    fun paddingTop(paddingTop: Dp): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ снизу [paddingBottom]
     */
    fun paddingBottom(paddingBottom: Dp): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ в начале [paddingStart]
     */
    fun paddingStart(paddingStart: Dp): EmptyStateDimensionsBuilder

    /**
     * Устанавливает отступ в конце [paddingEnd]
     */
    fun paddingEnd(paddingEnd: Dp): EmptyStateDimensionsBuilder

    /**
     * Вернёт [EmptyStateDimensions]
     */
    fun build(): EmptyStateDimensions
}

private data class DefaultEmptyStateDimensions(
    override val descriptionPadding: Dp,
    override val paddingTop: Dp,
    override val paddingBottom: Dp,
    override val paddingStart: Dp,
    override val paddingEnd: Dp,
) : EmptyStateDimensions {
    class Builder : EmptyStateDimensionsBuilder {
        private var descriptionPadding: Dp? = null

        private var paddingTop: Dp? = null

        private var paddingBottom: Dp? = null

        private var paddingStart: Dp? = null

        private var paddingEnd: Dp? = null

        override fun descriptionPadding(descriptionPadding: Dp): EmptyStateDimensionsBuilder =
            apply { this.descriptionPadding = descriptionPadding }

        override fun paddingTop(paddingTop: Dp): EmptyStateDimensionsBuilder = apply {
            this.paddingTop = paddingTop
        }

        override fun paddingBottom(paddingBottom: Dp): EmptyStateDimensionsBuilder = apply {
            this.paddingBottom = paddingBottom
        }

        override fun paddingStart(paddingStart: Dp): EmptyStateDimensionsBuilder = apply {
            this.paddingStart = paddingStart
        }

        override fun paddingEnd(paddingEnd: Dp): EmptyStateDimensionsBuilder = apply {
            this.paddingEnd = paddingEnd
        }

        override fun build(): EmptyStateDimensions =
            DefaultEmptyStateDimensions(
                descriptionPadding = descriptionPadding ?: 8.dp,
                paddingTop = paddingTop ?: 0.dp,
                paddingBottom = paddingBottom ?: 0.dp,
                paddingStart = paddingStart ?: 0.dp,
                paddingEnd = paddingEnd ?: 0.dp,
            )
    }
}
