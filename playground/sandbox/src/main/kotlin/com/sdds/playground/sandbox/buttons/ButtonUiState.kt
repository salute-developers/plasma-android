package com.sdds.playground.sandbox.buttons

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
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
    BasicButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault),
    BasicButtonLSecondary(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLSecondary),
    BasicButtonLAccent(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLAccent),
    BasicButtonLPositive(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLPositive),
    BasicButtonLWarning(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLWarning),
    BasicButtonLNegative(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLNegative),
    BasicButtonLDark(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDark),
    BasicButtonLBlack(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLBlack),
    BasicButtonLWhite(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLWhite),
    BasicButtonLClear(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLClear),

    BasicButtonMDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMDefault),
    BasicButtonMSecondary(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMSecondary),
    BasicButtonMAccent(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMAccent),
    BasicButtonMPositive(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMPositive),
    BasicButtonMWarning(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMWarning),
    BasicButtonMNegative(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMNegative),
    BasicButtonMDark(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMDark),
    BasicButtonMBlack(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMBlack),
    BasicButtonMWhite(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMWhite),
    BasicButtonMClear(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMClear),

    BasicButtonSDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSDefault),
    BasicButtonSSecondary(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSSecondary),
    BasicButtonSAccent(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSAccent),
    BasicButtonSPositive(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSPositive),
    BasicButtonSWarning(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSWarning),
    BasicButtonSNegative(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSNegative),
    BasicButtonSDark(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSDark),
    BasicButtonSBlack(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSBlack),
    BasicButtonSWhite(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSWhite),
    BasicButtonSClear(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSClear),

    BasicButtonXSDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSDefault),
    BasicButtonXSSecondary(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSSecondary),
    BasicButtonXSAccent(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSAccent),
    BasicButtonXSPositive(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSPositive),
    BasicButtonXSWarning(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSWarning),
    BasicButtonXSNegative(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSNegative),
    BasicButtonXSDark(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSDark),
    BasicButtonXSBlack(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSBlack),
    BasicButtonXSWhite(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSWhite),
    BasicButtonXSClear(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXSClear),
}

@Parcelize
internal enum class LinkButtonVariant(@StyleRes override val styleRes: Int) : ButtonVariant {
    LinkButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLDefault),
    LinkButtonLSecondary(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLSecondary),
    LinkButtonLAccent(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLAccent),
    LinkButtonLPositive(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLPositive),
    LinkButtonLWarning(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLWarning),
    LinkButtonLNegative(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLNegative),

    LinkButtonMDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMDefault),
    LinkButtonMSecondary(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMSecondary),
    LinkButtonMAccent(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMAccent),
    LinkButtonMPositive(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMPositive),
    LinkButtonMWarning(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMWarning),
    LinkButtonMNegative(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMNegative),

    LinkButtonSDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSDefault),
    LinkButtonSSecondary(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSSecondary),
    LinkButtonSAccent(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSAccent),
    LinkButtonSPositive(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSPositive),
    LinkButtonSWarning(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSWarning),
    LinkButtonSNegative(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSNegative),

    LinkButtonXSDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsDefault),
    LinkButtonXSSecondary(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsSecondary),
    LinkButtonXSAccent(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsAccent),
    LinkButtonXSPositive(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsPositive),
    LinkButtonXSWarning(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsWarning),
    LinkButtonXSNegative(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsNegative),
}

/**
 * Стили вариаций IconButton
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class IconButtonVariant(@StyleRes override val styleRes: Int) : ButtonVariant {
    IconButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonLDefault),
    IconButtonLSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonLSecondary),
    IconButtonLAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonLAccent),
    IconButtonLPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPositive),
    IconButtonLWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonLWarning),
    IconButtonLNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonLNegative),
    IconButtonLDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonLDark),
    IconButtonLBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonLBlack),
    IconButtonLWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonLWhite),
    IconButtonLClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonLClear),

    IconButtonLPilledDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledDefault),
    IconButtonLPilledSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledSecondary),
    IconButtonLPilledAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledAccent),
    IconButtonLPilledPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledPositive),
    IconButtonLPilledWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledWarning),
    IconButtonLPilledNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledNegative),
    IconButtonLPilledDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledDark),
    IconButtonLPilledBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledBlack),
    IconButtonLPilledWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledWhite),
    IconButtonLPilledClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledClear),

    IconButtonMDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonMDefault),
    IconButtonMSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonMSecondary),
    IconButtonMAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonMAccent),
    IconButtonMPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPositive),
    IconButtonMWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonMWarning),
    IconButtonMNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonMNegative),
    IconButtonMDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonMDark),
    IconButtonMBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonMBlack),
    IconButtonMWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonMWhite),
    IconButtonMClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonMClear),

    IconButtonMPilledDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledDefault),
    IconButtonMPilledSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledSecondary),
    IconButtonMPilledAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledAccent),
    IconButtonMPilledPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledPositive),
    IconButtonMPilledWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledWarning),
    IconButtonMPilledNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledNegative),
    IconButtonMPilledDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledDark),
    IconButtonMPilledBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledBlack),
    IconButtonMPilledWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledWhite),
    IconButtonMPilledClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonMPilledClear),

    IconButtonSDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonSDefault),
    IconButtonSSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonSSecondary),
    IconButtonSAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonSAccent),
    IconButtonSPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPositive),
    IconButtonSWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonSWarning),
    IconButtonSNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonSNegative),
    IconButtonSDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonSDark),
    IconButtonSBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonSBlack),
    IconButtonSWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonSWhite),
    IconButtonSClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonSClear),

    IconButtonSPilledDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledDefault),
    IconButtonSPilledSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledSecondary),
    IconButtonSPilledAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledAccent),
    IconButtonSPilledPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledPositive),
    IconButtonSPilledWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledWarning),
    IconButtonSPilledNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledNegative),
    IconButtonSPilledDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledDark),
    IconButtonSPilledBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledBlack),
    IconButtonSPilledWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledWhite),
    IconButtonSPilledClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPilledClear),

    IconButtonXSDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSDefault),
    IconButtonXSSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSSecondary),
    IconButtonXSAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSAccent),
    IconButtonXSPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPositive),
    IconButtonXSWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSWarning),
    IconButtonXSNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSNegative),
    IconButtonXSDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSDark),
    IconButtonXSBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSBlack),
    IconButtonXSWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSWhite),
    IconButtonXSClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSClear),

    IconButtonXSPilledDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledDefault),
    IconButtonXSPilledSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledSecondary),
    IconButtonXSPilledAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledAccent),
    IconButtonXSPilledPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledPositive),
    IconButtonXSPilledWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledWarning),
    IconButtonXSPilledNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledNegative),
    IconButtonXSPilledDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledDark),
    IconButtonXSPilledBlack(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledBlack),
    IconButtonXSPilledWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledWhite),
    IconButtonXSPilledClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonXSPilledClear),
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
