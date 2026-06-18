package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CheckBoxGroupStyle] для компонента [CheckBoxGroup]
 */
val LocalCheckBoxGroupStyle = compositionLocalOf { CheckBoxGroupStyle.builder().style() }

/**
 * Стиль компонента [CheckBoxGroup]
 * @author Малышев Александр on 24.10.2024
 */
@Stable
interface CheckBoxGroupStyle : Style {

    /**
     * Стиль [CheckBox] в группе
     * @see CheckBoxStyle
     */
    val checkBoxStyle: CheckBoxStyle

    /**
     * Отступ для дочерних checkbox. Если рутовый [CheckBox] отсутствует, отступ игнорируется (не применяется к дочерним).
     */
    @Deprecated("Use dimensions.itemOffset instead")
    val startIndent: Dp

    /**
     * Расположение элементов по вертикали
     * @see Arrangement.Vertical
     */
    @Deprecated("Use dimensions.itemSpacing instead")
    val verticalArrangement: Arrangement.Vertical

    /**
     * Размеры и отступы компонента
     */
    val dimensions: CheckBoxGroupDimensions

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxGroupStyleBuilder]
         */
        fun builder(receiver: Any? = null): CheckBoxGroupStyleBuilder = DefaultCheckBoxGroupStyle.Builder()
    }
}

/**
 * Builder стиля [CheckBoxGroup]
 */
@Stable
@ApiInfo
interface CheckBoxGroupStyleBuilder : StyleBuilder<CheckBoxGroupStyle> {

    /**
     * Устанавливает стиль компонентов [CheckBox] в группе [CheckBoxGroup]
     * @see CheckBoxGroupStyle.checkBoxStyle
     * @see CheckBoxStyle
     */
    fun checkBoxStyle(checkBoxStyle: CheckBoxStyle): CheckBoxGroupStyleBuilder

    /**
     * Устанавливает отступ [startIndent] для дочерних [CheckBox]
     * @see CheckBoxGroupStyle.startIndent
     */
    @Deprecated("Use dimensions.itemOffset instead")
    fun startIndent(startIndent: Dp): CheckBoxGroupStyleBuilder

    /**
     * Устанавливает расположение элементов по вертикали [verticalArrangement]
     * @see CheckBoxGroupStyle.verticalArrangement
     * @see Arrangement.Vertical
     */
    @Deprecated("Use dimensions.itemSpacing instead")
    fun verticalArrangement(verticalArrangement: Arrangement.Vertical): CheckBoxGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     */
    @Composable
    fun dimensions(builder: @Composable CheckBoxGroupDimensionsBuilder.() -> Unit): CheckBoxGroupStyleBuilder
}

/**
 * Размеры и отступы компонента CheckBoxGroup
 */
@Immutable
interface CheckBoxGroupDimensions {
    /**
     * Расстояние между элементами
     */
    @Deprecated("Use itemSpacingValues", ReplaceWith("itemSpacingValues"))
    val itemSpacing: Dp

    /**
     * Расстояние между элементами
     */
    val itemSpacingValues: StatefulValue<Dp>

    /**
     * Смещение дочерних элементов
     */
    @Deprecated("Use itemOffsetValues", ReplaceWith("itemOffsetValues"))
    val itemOffset: Dp

    /**
     * Смещение дочерних элементов
     */
    val itemOffsetValues: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxGroupDimensionsBuilder]
         */
        fun builder(): CheckBoxGroupDimensionsBuilder = DefaultCheckBoxGroupDimensions.Builder()
    }
}

/**
 * Билдер для [CheckBoxGroupDimensions]
 */
interface CheckBoxGroupDimensionsBuilder {

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: Dp): CheckBoxGroupDimensionsBuilder =
        itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояние между элементами [itemSpacing]
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): CheckBoxGroupDimensionsBuilder

    /**
     * Устанавливает смещение элементов [itemOffset]
     */
    fun itemOffset(itemOffset: Dp): CheckBoxGroupDimensionsBuilder =
        itemOffset(itemOffset.asStatefulValue())

    /**
     * Устанавливает смещение элементов [itemOffset]
     */
    fun itemOffset(itemOffset: StatefulValue<Dp>): CheckBoxGroupDimensionsBuilder

    /**
     * Создаёт экземпляр [CheckBoxGroupDimensions]
     */
    fun build(): CheckBoxGroupDimensions
}

@Immutable
private class DefaultCheckBoxGroupDimensions(
    override val itemSpacingValues: StatefulValue<Dp>,
    override val itemOffsetValues: StatefulValue<Dp>,

) : CheckBoxGroupDimensions {

    @Deprecated("Use itemSpacingValues", ReplaceWith("itemSpacingValues"))
    override val itemSpacing: Dp = itemSpacingValues.getDefaultValue()

    @Deprecated("Use itemOffsetValues", ReplaceWith("itemOffsetValues"))
    override val itemOffset: Dp = itemOffsetValues.getDefaultValue()
    class Builder : CheckBoxGroupDimensionsBuilder {
        private var itemSpacingValues: StatefulValue<Dp>? = null
        private var itemOffsetValues: StatefulValue<Dp>? = null

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>) = apply {
            this.itemSpacingValues = itemSpacing
        }

        override fun itemOffset(itemOffset: StatefulValue<Dp>) = apply {
            this.itemOffsetValues = itemOffset
        }

        override fun build(): CheckBoxGroupDimensions {
            return DefaultCheckBoxGroupDimensions(
                itemSpacingValues = itemSpacingValues ?: DefaultArrangementSize.asStatefulValue(),
                itemOffsetValues = itemOffsetValues ?: DefaultStartIndent.asStatefulValue(),
            )
        }
    }
}

@Immutable
private class DefaultCheckBoxGroupStyle(
    override val checkBoxStyle: CheckBoxStyle,
    @Deprecated("Use dimensions.itemOffset instead")
    override val startIndent: Dp,
    @Deprecated("Use dimensions.itemSpacing instead")
    override val verticalArrangement: Arrangement.Vertical,
    override val dimensions: CheckBoxGroupDimensions,
) : CheckBoxGroupStyle {

    class Builder : CheckBoxGroupStyleBuilder {
        private var checkBoxStyle: CheckBoxStyle? = null
        private var startIndent: Dp? = null
        private var verticalArrangement: Arrangement.Vertical? = null
        private val dimensionsBuilder = CheckBoxGroupDimensions.builder()

        override fun checkBoxStyle(checkBoxStyle: CheckBoxStyle) = apply {
            this.checkBoxStyle = checkBoxStyle
        }

        @Deprecated("Use dimensions.itemOffset instead")
        override fun startIndent(startIndent: Dp) = apply {
            this.startIndent = startIndent
            this.dimensionsBuilder.apply {
                itemOffset(startIndent)
            }
        }

        @Deprecated("Use dimensions.itemSpacing instead")
        override fun verticalArrangement(verticalArrangement: Arrangement.Vertical) = apply {
            this.verticalArrangement = verticalArrangement
            this.dimensionsBuilder.apply {
                itemSpacing(verticalArrangement.spacing)
            }
        }

        @Composable
        override fun dimensions(builder: @Composable (CheckBoxGroupDimensionsBuilder.() -> Unit)) = apply {
            this.dimensionsBuilder.builder()
        }

        override fun style(): CheckBoxGroupStyle {
            return DefaultCheckBoxGroupStyle(
                checkBoxStyle = checkBoxStyle ?: CheckBoxStyle.builder().style(),
                startIndent = startIndent ?: DefaultStartIndent,
                verticalArrangement = verticalArrangement ?: Arrangement.spacedBy(DefaultArrangementSize),
                dimensions = dimensionsBuilder.build(),
            )
        }
    }
}

private val DefaultStartIndent = 36.dp
private val DefaultArrangementSize = 12.dp
