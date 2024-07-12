package com.sdds.compose.uikit.internal.checkable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * Создает [CheckBoxColors].
 *
 * @param idleColor цвет бордера CheckBox, когда checked = false и focused = false.
 * @param checkedColor цвет заполняющего прямоугольника CheckBox, когда checked = true.
 * @param focusedColor цвет бордера CheckBox, когда focused = true.
 * @param baseColor цвет отметки-индикатора CheckBox, когда checked = true
 */
@Composable
internal fun checkBoxColors(
    idleColor: Color,
    checkedColor: Color,
    focusedColor: Color,
    baseColor: Color,
): CheckBoxColors {
    return remember(
        idleColor,
        checkedColor,
        focusedColor,
        baseColor,
    ) {
        DefaultCheckBoxColors(idleColor, checkedColor, focusedColor, baseColor)
    }
}

/**
 * Цвета, которые использует CheckBox в различных состояниях.
 * @see [checkBoxColors]
 */
@Stable
internal interface CheckBoxColors {
    /**
     * Цвет заполняющего круга в зависимости от состояния
     * @param checked индикатор выбора
     */
    @Composable
    fun fillColor(checked: Boolean): State<Color>

    /**
     * Цвет основного круга
     */
    @Composable
    fun baseColor(): State<Color>

    /**
     * Цвет пограничной окружности в зависимости от состояния [checked] и [focused]
     * @param checked индикатор выбора
     * @param focused индикатор фокуса
     */
    @Composable
    fun borderColor(checked: Boolean, focused: Boolean): State<Color>
}

/**
 * Реализация [CheckBoxColors] по умолчанию
 */
@Immutable
private data class DefaultCheckBoxColors(
    private val idleColor: Color,
    private val checkedColor: Color,
    private val focusedColor: Color,
    private val baseColor: Color,
) : CheckBoxColors {

    @Composable
    override fun fillColor(checked: Boolean): State<Color> {
        return rememberUpdatedState(checkedColor)
    }

    @Composable
    override fun baseColor(): State<Color> {
        return rememberUpdatedState(baseColor)
    }

    @Composable
    override fun borderColor(checked: Boolean, focused: Boolean): State<Color> {
        val color = when {
            checked || focused -> focusedColor
            else -> idleColor
        }
        return rememberUpdatedState(color)
    }
}
