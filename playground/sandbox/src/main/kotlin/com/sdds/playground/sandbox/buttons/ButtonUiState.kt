package com.sdds.playground.sandbox.buttons

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import com.sdds.uikit.Button
import kotlinx.parcelize.Parcelize
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
@Parcelize
internal data class ButtonUiState(
    val variant: ButtonVariant,
    val icon: ButtonIcon = ButtonIcon.No,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: Button.Spacing = Button.Spacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
    val fixedSize: Boolean = false,
) : Parcelable

/**
 * Стили вариаций кнопки
 * @property styleRes ресурс стиля
 */
@Parcelize
internal sealed interface ButtonVariant : Parcelable {

    /**
     * Ресурс стиля
     */
    @get:StyleRes
    val styleRes: Int
}

/**
 * Стили вариаций BasicButton
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class BasicButtonVariant(@StyleRes override val styleRes: Int) : ButtonVariant {
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
 * Стили вариаций IconButton
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class IconButtonVariant(@StyleRes override val styleRes: Int) : ButtonVariant {
    IconButtonLDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLDefault),
    IconButtonLSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLSecondary),
    IconButtonLAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLAccent),
    IconButtonLPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPositive),
    IconButtonLWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLWarning),
    IconButtonLNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLNegative),
    IconButtonLDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLDark),
    IconButtonLBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLBlack),
    IconButtonLWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLWhite),
    IconButtonLClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLClear),

    IconButtonLPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledDefault),
    IconButtonLPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledSecondary),
    IconButtonLPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledAccent),
    IconButtonLPilledPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledPositive),
    IconButtonLPilledWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledWarning),
    IconButtonLPilledNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledNegative),
    IconButtonLPilledDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledDark),
    IconButtonLPilledBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledBlack),
    IconButtonLPilledWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledWhite),
    IconButtonLPilledClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonLPilledClear),

    IconButtonMDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMDefault),
    IconButtonMSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMSecondary),
    IconButtonMAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMAccent),
    IconButtonMPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPositive),
    IconButtonMWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMWarning),
    IconButtonMNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMNegative),
    IconButtonMDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMDark),
    IconButtonMBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMBlack),
    IconButtonMWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMWhite),
    IconButtonMClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMClear),

    IconButtonMPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledDefault),
    IconButtonMPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledSecondary),
    IconButtonMPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledAccent),
    IconButtonMPilledPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledPositive),
    IconButtonMPilledWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledWarning),
    IconButtonMPilledNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledNegative),
    IconButtonMPilledDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledDark),
    IconButtonMPilledBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledBlack),
    IconButtonMPilledWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledWhite),
    IconButtonMPilledClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonMPilledClear),

    IconButtonSDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSDefault),
    IconButtonSSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSSecondary),
    IconButtonSAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSAccent),
    IconButtonSPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPositive),
    IconButtonSWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSWarning),
    IconButtonSNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSNegative),
    IconButtonSDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSDark),
    IconButtonSBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSBlack),
    IconButtonSWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSWhite),
    IconButtonSClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSClear),

    IconButtonSPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledDefault),
    IconButtonSPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledSecondary),
    IconButtonSPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledAccent),
    IconButtonSPilledPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledPositive),
    IconButtonSPilledWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledWarning),
    IconButtonSPilledNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledNegative),
    IconButtonSPilledDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledDark),
    IconButtonSPilledBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledBlack),
    IconButtonSPilledWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledWhite),
    IconButtonSPilledClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonSPilledClear),

    IconButtonXSDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSDefault),
    IconButtonXSSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSSecondary),
    IconButtonXSAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSAccent),
    IconButtonXSPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPositive),
    IconButtonXSWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSWarning),
    IconButtonXSNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSNegative),
    IconButtonXSDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSDark),
    IconButtonXSBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSBlack),
    IconButtonXSWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSWhite),
    IconButtonXSClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSClear),

    IconButtonXSPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledDefault),
    IconButtonXSPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledSecondary),
    IconButtonXSPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledAccent),
    IconButtonXSPilledPositive(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledPositive),
    IconButtonXSPilledWarning(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledWarning),
    IconButtonXSPilledNegative(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledNegative),
    IconButtonXSPilledDark(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledDark),
    IconButtonXSPilledBlack(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledBlack),
    IconButtonXSPilledWhite(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledWhite),
    IconButtonXSPilledClear(R.style.Theme_Sandbox_ComponentOverlays_IconButtonXSPilledClear),
}

/**
 * Иконка кнопки
 */
@Parcelize
internal sealed class ButtonIcon(val iconId: Int = Icons.ic_plasma_24) : Parcelable {

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
