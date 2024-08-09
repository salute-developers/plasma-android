package com.sdds.playground.sandbox.buttons

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import com.sdds.uikit.Button
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property variant вариация кнопки
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [Button.Spacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 * @property fixedSize режим фиксированного размера кнопки
 */
internal data class ButtonUiState(
    val variant: ButtonVariant = ButtonVariant.BasicButtonLDefault,
    val icon: ButtonIcon = ButtonIcon.No,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: Button.Spacing = Button.Spacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
    val fixedSize: Boolean = false,
)

/**
 * Стили вариаций кнопки
 * @property styleRes ресурс стиля
 */
internal enum class ButtonVariant(@StyleRes val styleRes: Int) {
    BasicButtonLDefault(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLDefault),
    BasicButtonLSecondary(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLSecondary),
    BasicButtonLAccent(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLAccent),
    BasicButtonLPositive(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLPositive),
    BasicButtonLWarning(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLWarning),
    BasicButtonLNegative(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLNegative),
    BasicButtonLDark(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLDark),
    BasicButtonLBlack(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLBlack),
    BasicButtonLWhite(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLWhite),
    BasicButtonLClear(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonLClear),

    BasicButtonMDefault(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMDefault),
    BasicButtonMSecondary(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMSecondary),
    BasicButtonMAccent(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMAccent),
    BasicButtonMPositive(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMPositive),
    BasicButtonMWarning(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMWarning),
    BasicButtonMNegative(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMNegative),
    BasicButtonMDark(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMDark),
    BasicButtonMBlack(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMBlack),
    BasicButtonMWhite(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMWhite),
    BasicButtonMClear(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonMClear),

    BasicButtonSDefault(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSDefault),
    BasicButtonSSecondary(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSSecondary),
    BasicButtonSAccent(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSAccent),
    BasicButtonSPositive(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSPositive),
    BasicButtonSWarning(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSWarning),
    BasicButtonSNegative(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSNegative),
    BasicButtonSDark(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSDark),
    BasicButtonSBlack(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSBlack),
    BasicButtonSWhite(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSWhite),
    BasicButtonSClear(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonSClear),

    BasicButtonXSDefault(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSDefault),
    BasicButtonXSSecondary(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSSecondary),
    BasicButtonXSAccent(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSAccent),
    BasicButtonXSPositive(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSPositive),
    BasicButtonXSWarning(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSWarning),
    BasicButtonXSNegative(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSNegative),
    BasicButtonXSDark(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSDark),
    BasicButtonXSBlack(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSBlack),
    BasicButtonXSWhite(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSWhite),
    BasicButtonXSClear(R.style.Theme_Sandbox_ComponentOverlays_BasicButtonXSClear),
}

/**
 * Иконка кнопки
 */
internal sealed class ButtonIcon(val iconId: Int = Icons.ic_plasma_24) {

    /**
     * Иконка вначале кнопки
     */
    object Start : ButtonIcon()

    /**
     * Иконка вконце кнопки
     */
    object End : ButtonIcon()

    /**
     * Отсутствие иконки
     */
    object No : ButtonIcon(0)
}
