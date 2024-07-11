package com.sdds.playground.sandbox.core.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Значения по умолчанию используемые в RadioBox.
 */
@Immutable
internal object RadioBoxDefaults {

    /**
     * Длительность анимации перехода между checked состояниями
     */
    const val RadioAnimationDuration = 200

    /**
     * Ширина линии в состоянии checked = false
     */
    val RadioStrokeWidth = 2.dp

    /**
     * Отступ в состоянии checked = true
     */
    val RadioCheckedPadding = 2.dp

    /**
     * Ширина линии в состоянии checked = true
     */
    val CheckedRadioStrokeWidth = 1.dp

    /**
     * Создает [RadioBoxColors].
     *
     * @param idleColor цвет бордера RadioButton, когда checked = false и focused = false.
     * @param checkedColor цвет заполняющего круга RadioButton, когда checked = true.
     * @param focusedColor цвет бордера RadioButton, когда focused = true.
     * @param baseColor цвет основного круга RadioButton, когда checked = true
     */
    @Composable
    fun colors(
        idleColor: Color = DefaultTheme.colors.textDefaultSecondary,
        checkedColor: Color = DefaultTheme.colors.surfaceDefaultAccent,
        focusedColor: Color = DefaultTheme.colors.surfaceDefaultSolidDefault,
        baseColor: Color = DefaultTheme.colors.textOnDarkPrimary,
    ): RadioBoxColors {
        return remember(
            idleColor,
            checkedColor,
            focusedColor,
            baseColor,
        ) {
            DefaultRadioBoxColors(idleColor, checkedColor, focusedColor, baseColor)
        }
    }
}

/**
 * Цвета, которые использует RadioBox в различных состояниях.
 * @see [RadioBoxDefaults.colors]
 */
@Stable
internal interface RadioBoxColors {
    /**
     * Цвет заполняющего круга в зависимости от состояния
     * @param checked индикатор выбора
     */
    @Composable
    fun radioColorFill(checked: Boolean): State<Color>

    /**
     * Цвет основного круга
     */
    @Composable
    fun radioColorBase(): State<Color>

    /**
     * Цвет пограничной окружности в зависимости от состояния [checked] и [focused]
     * @param checked индикатор выбора
     * @param focused индикатор фокуса
     */
    @Composable
    fun borderColor(checked: Boolean, focused: Boolean): State<Color>
}

/**
 * Реализация [RadioBoxColors] по умолчанию
 */
@Immutable
private data class DefaultRadioBoxColors(
    private val idleColor: Color,
    private val checkedColor: Color,
    private val focusedColor: Color,
    private val baseColor: Color,
) : RadioBoxColors {

    @Composable
    override fun radioColorFill(checked: Boolean): State<Color> {
        return rememberUpdatedState(checkedColor)
    }

    @Composable
    override fun borderColor(checked: Boolean, focused: Boolean): State<Color> {
        val color = when {
            checked || focused -> focusedColor
            else -> idleColor
        }
        return rememberUpdatedState(color)
    }

    @Composable
    override fun radioColorBase(): State<Color> {
        return rememberUpdatedState(baseColor)
    }
}
