package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [RadioBoxGroupStyle] для компонента [RadioBoxGroup]
 */
val LocalRadioBoxGroupStyle = compositionLocalOf { RadioBoxGroupStyle.builder().style() }

/**
 * Стиль компонента [RadioBoxGroup]
 * @author Малышев Александр on 24.10.2024
 */
@Stable
interface RadioBoxGroupStyle : Style {

    /**
     * Стиль [RadioBox] в группе
     * @see RadioBoxStyle
     */
    val radioBoxStyle: RadioBoxStyle

    /**
     * Расположение элементов по вертикали
     * @see Arrangement.Vertical
     */
    @Deprecated("Use dimensions.itemSpacing instead")
    val verticalArrangement: Arrangement.Vertical

    /**
     * Размеры и отступы компонента
     */
    val dimensions: RadioBoxGroupDimensions

    companion object {

        /**
         * Возвращает экземпляр [RadioBoxGroupStyleBuilder]
         */
        fun builder(receiver: Any? = null): RadioBoxGroupStyleBuilder =
            DefaultRadioBoxGroupStyle.Builder()
    }
}

/**
 * Размеры и отступы компонента RadioBoxGroup
 */
@Immutable
interface RadioBoxGroupDimensions {
    /**
     * Расстояние между элементами
     */
    val itemSpacing: Dp

    companion object {

        /**
         * Возвращает экземпляр [RadioBoxGroupDimensionsBuilder]
         */
        fun builder(): RadioBoxGroupDimensionsBuilder = DefaultRadioBoxGroupDimensions.Builder()
    }
}

/**
 * Билдер для [RadioBoxGroupDimensions]
 */
interface RadioBoxGroupDimensionsBuilder {

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): RadioBoxGroupDimensionsBuilder

    /**
     * Создаёт экземпляр [RadioBoxGroupDimensions]
     */
    fun build(): RadioBoxGroupDimensions
}

@Immutable
private class DefaultRadioBoxGroupDimensions(
    override val itemSpacing: Dp,
) : RadioBoxGroupDimensions {

    class Builder : RadioBoxGroupDimensionsBuilder {
        private var itemSpacing: Dp? = null

        override fun itemSpacing(itemSpacing: Dp) = apply {
            this.itemSpacing = itemSpacing
        }

        override fun build(): RadioBoxGroupDimensions {
            return DefaultRadioBoxGroupDimensions(
                itemSpacing = itemSpacing ?: DefaultArrangementSize,
            )
        }
    }
}

/**
 * Builder стиля [RadioBoxGroup]
 */
@Stable
interface RadioBoxGroupStyleBuilder : StyleBuilder<RadioBoxGroupStyle> {

    /**
     * Устанавливает стиль компонентов [RadioBox] в группе [RadioBoxGroup]
     * @see RadioBoxGroupStyle.radioBoxStyle
     * @see RadioBoxStyle
     */
    fun radioBoxStyle(radioBoxStyle: RadioBoxStyle): RadioBoxGroupStyleBuilder

    /**
     * Устанавливает расположение элементов по вертикали [verticalArrangement]
     * @see RadioBoxGroupStyle.verticalArrangement
     * @see Arrangement.Vertical
     */
    @Deprecated("Use dimensions.itemSpacing instead")
    fun verticalArrangement(verticalArrangement: Arrangement.Vertical): RadioBoxGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable RadioBoxGroupDimensionsBuilder.() -> Unit): RadioBoxGroupStyleBuilder
}

@Immutable
private class DefaultRadioBoxGroupStyle(
    override val radioBoxStyle: RadioBoxStyle,
    @Deprecated("Use dimensions.itemSpacing instead")
    override val verticalArrangement: Arrangement.Vertical,
    override val dimensions: RadioBoxGroupDimensions,
) : RadioBoxGroupStyle {

    class Builder : RadioBoxGroupStyleBuilder {
        private var radioBoxStyle: RadioBoxStyle? = null
        private var verticalArrangement: Arrangement.Vertical? = null
        private val dimensionsBuilder = RadioBoxGroupDimensions.builder()

        override fun radioBoxStyle(radioBoxStyle: RadioBoxStyle) = apply {
            this.radioBoxStyle = radioBoxStyle
        }

        @Deprecated("Use dimensions.itemSpacing instead")
        override fun verticalArrangement(verticalArrangement: Arrangement.Vertical) = apply {
            this.verticalArrangement = verticalArrangement
            this.dimensionsBuilder.itemSpacing(verticalArrangement.spacing)
        }

        @Composable
        override fun dimensions(builder: @Composable (RadioBoxGroupDimensionsBuilder.() -> Unit)) = apply {
            this.dimensionsBuilder.builder()
        }

        override fun style(): RadioBoxGroupStyle {
            return DefaultRadioBoxGroupStyle(
                radioBoxStyle = radioBoxStyle ?: RadioBoxStyle.builder().style(),
                verticalArrangement = verticalArrangement ?: Arrangement.spacedBy(
                    DefaultArrangementSize,
                ),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

private val DefaultArrangementSize = 12.dp
