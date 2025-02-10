package com.sdds.playground.sandbox.indicator.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Indicator
 * @property variant вариация компонента
 */
@Parcelize
internal data class IndicatorUiState(
    val variant: IndicatorVariant = IndicatorVariant.DefaultL,
) : Parcelable

/**
 * Стили компонента Indicator
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class IndicatorVariant(@StyleRes val styleRes: Int) : Parcelable {
    DefaultL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLDefault),
    InactiveL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLInactive),
    AccentL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLAccent),
    PositiveL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLPositive),
    NegativeL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLNegative),
    WarningL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLWarning),
    DarkL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLDark),
    BlackL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLBlack),
    WhiteL(R.style.Serv_Sdds_ComponentOverlays_IndicatorLWhite),

    DefaultM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMDefault),
    InactiveM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMInactive),
    AccentM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMAccent),
    PositiveM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMPositive),
    NegativeM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMNegative),
    WarningM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMWarning),
    DarkM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMDark),
    BlackM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMBlack),
    WhiteM(R.style.Serv_Sdds_ComponentOverlays_IndicatorMWhite),

    DefaultS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSDefault),
    InactiveS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSInactive),
    AccentS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSAccent),
    PositiveS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSPositive),
    NegativeS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSNegative),
    WarningS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSWarning),
    DarkS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSDark),
    BlackS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSBlack),
    WhiteS(R.style.Serv_Sdds_ComponentOverlays_IndicatorSWhite),
}
