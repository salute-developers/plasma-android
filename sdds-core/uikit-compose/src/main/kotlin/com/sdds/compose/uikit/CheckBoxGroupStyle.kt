package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
    val startIndent: Dp

    /**
     * Расположение элементов по вертикали
     * @see Arrangement.Vertical
     */
    val verticalArrangement: Arrangement.Vertical

    companion object {

        /**
         * Возвращает экземпляр [CheckBoxGroupStyleBuilder]
         */
        fun builder(): CheckBoxGroupStyleBuilder = DefaultCheckBoxGroupStyle.Builder()
    }
}

/**
 * Builder стиля [CheckBoxGroup]
 */
@Stable
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
    fun startIndent(startIndent: Dp): CheckBoxGroupStyleBuilder

    /**
     * Устанавливает расположение элементов по вертикали [verticalArrangement]
     * @see CheckBoxGroupStyle.verticalArrangement
     * @see Arrangement.Vertical
     */
    fun verticalArrangement(verticalArrangement: Arrangement.Vertical): CheckBoxGroupStyleBuilder
}

@Immutable
private class DefaultCheckBoxGroupStyle(
    override val checkBoxStyle: CheckBoxStyle,
    override val startIndent: Dp,
    override val verticalArrangement: Arrangement.Vertical,
) : CheckBoxGroupStyle {

    class Builder : CheckBoxGroupStyleBuilder {
        private var checkBoxStyle: CheckBoxStyle? = null
        private var startIndent: Dp? = null
        private var verticalArrangement: Arrangement.Vertical? = null

        override fun checkBoxStyle(checkBoxStyle: CheckBoxStyle) = apply {
            this.checkBoxStyle = checkBoxStyle
        }

        override fun startIndent(startIndent: Dp) = apply {
            this.startIndent = startIndent
        }

        override fun verticalArrangement(verticalArrangement: Arrangement.Vertical) = apply {
            this.verticalArrangement = verticalArrangement
        }

        override fun style(): CheckBoxGroupStyle {
            return DefaultCheckBoxGroupStyle(
                checkBoxStyle = checkBoxStyle ?: CheckBoxStyle.builder().style(),
                startIndent = startIndent ?: DefaultStartIndent,
                verticalArrangement = verticalArrangement ?: Arrangement.spacedBy(DefaultArrangementSize),
            )
        }
    }
}

private val DefaultStartIndent = 36.dp
private val DefaultArrangementSize = 12.dp
