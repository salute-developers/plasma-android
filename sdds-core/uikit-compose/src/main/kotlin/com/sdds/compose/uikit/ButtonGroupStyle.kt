package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [ButtonGroupStyle] для компонента [ButtonGroup]
 */
val LocalButtonGroupStyle: ProvidableCompositionLocal<ButtonGroupStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { ButtonGroupStyle.builder().style() }

/**
 * Стиль компонента
 */
@Immutable
interface ButtonGroupStyle : Style {
    /**
     * Форма внутренних скруглений кнопок
     */
    val internalShape: CornerBasedShape

    /**
     * Форма внешних скруглений кнопок
     */
    val externalShape: CornerBasedShape

    /**
     * Размеры и отступы компонента
     */
    val dimensions: ButtonGroupDimensions

    /**
     * Стиль кнопок по умолчанию
     */
    val buttonStyle: ButtonStyle

    companion object {
        /**
         * Возвращает экземпляр [ButtonGroupStyleBuilder]
         */
        fun builder(receiver: Any? = null): ButtonGroupStyleBuilder =
            DefaultButtonGroupStyle.Builder()
    }
}

/**
 * Билдер стиля компонента
 */
interface ButtonGroupStyleBuilder : StyleBuilder<ButtonGroupStyle> {
    /**
     * Устанавливает форму внутренних скруглений
     */
    fun internalShape(internalShape: CornerBasedShape): ButtonGroupStyleBuilder

    /**
     * Устанавливает форму внешних скруглений
     */
    fun externalShape(externalShape: CornerBasedShape): ButtonGroupStyleBuilder

    /**
     * Устанавливает стиль кнопок поумолчанию
     */
    fun buttonStyle(buttonStyle: ButtonStyle): ButtonGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы
     */
    @Composable
    fun dimensions(builder: @Composable ButtonGroupDimensionsBuilder.() -> Unit): ButtonGroupStyleBuilder
}

private data class DefaultButtonGroupStyle(
    override val internalShape: CornerBasedShape,
    override val externalShape: CornerBasedShape,
    override val dimensions: ButtonGroupDimensions,
    override val buttonStyle: ButtonStyle,
) : ButtonGroupStyle {
    class Builder : ButtonGroupStyleBuilder {
        private var internalShape: CornerBasedShape? = null
        private var externalShape: CornerBasedShape? = null
        private var buttonStyle: ButtonStyle? = null
        private val dimensionsBuilder: ButtonGroupDimensionsBuilder =
            ButtonGroupDimensions.builder()

        override fun internalShape(internalShape: CornerBasedShape): ButtonGroupStyleBuilder = apply {
            this.internalShape = internalShape
        }

        override fun externalShape(externalShape: CornerBasedShape): ButtonGroupStyleBuilder = apply {
            this.externalShape = externalShape
        }

        override fun buttonStyle(buttonStyle: ButtonStyle): ButtonGroupStyleBuilder = apply {
            this.buttonStyle = buttonStyle
        }

        @Composable
        override fun dimensions(builder: @Composable ButtonGroupDimensionsBuilder.() -> Unit):
            ButtonGroupStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): ButtonGroupStyle = DefaultButtonGroupStyle(
            internalShape = internalShape ?: RoundedCornerShape(0),
            externalShape = externalShape ?: RoundedCornerShape(0),
            dimensions = dimensionsBuilder.build(),
            buttonStyle = buttonStyle ?: ButtonStyle.basicButtonBuilder().style(),
        )
    }
}

/**
 * Размеры и отступы компонента
 */
@Immutable
interface ButtonGroupDimensions {
    /**
     * Отступ между кнопками
     */
    val spacing: Dp

    companion object {
        /**
         * Возвращает экземпляр [ButtonGroupDimensionsBuilder]
         */
        fun builder(): ButtonGroupDimensionsBuilder = DefaultButtonGroupDimensions.Builder()
    }
}

/**
 * Билдер для [ButtonGroupDimensions]
 */
interface ButtonGroupDimensionsBuilder {
    /**
     * Устанавливает отступ между кнопками [spacing]
     */
    fun spacing(spacing: Dp): ButtonGroupDimensionsBuilder

    /**
     * Вернёт [ButtonGroupDimensions]
     */
    fun build(): ButtonGroupDimensions
}

private data class DefaultButtonGroupDimensions(
    override val spacing: Dp,
) : ButtonGroupDimensions {
    class Builder : ButtonGroupDimensionsBuilder {
        private var spacing: Dp? = null

        override fun spacing(spacing: Dp): ButtonGroupDimensionsBuilder = apply {
            this.spacing = spacing
        }

        override fun build(): ButtonGroupDimensions = DefaultButtonGroupDimensions(
            spacing = spacing ?: 8.dp,
        )
    }
}
