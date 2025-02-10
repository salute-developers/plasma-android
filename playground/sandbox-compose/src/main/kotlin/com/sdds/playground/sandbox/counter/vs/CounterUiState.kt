package com.sdds.playground.sandbox.counter.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Counter
 * @property variant стиль варианта компонента
 * @property count число
 * @property enabled включен ли Counter
 */
@Parcelize
internal data class CounterUiState(
    val variant: CounterVariant = CounterVariant.CounterLDefault,
    val count: String = "1",
    val enabled: Boolean = true,
) : Parcelable

/**
 * Варианты компонента Counter
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class CounterVariant(@StyleRes val styleRes: Int) : Parcelable {
    CounterLDefault(R.style.Serv_Sdds_ComponentOverlays_CounterLDefault),
    CounterLAccent(R.style.Serv_Sdds_ComponentOverlays_CounterLAccent),
    CounterLPositive(R.style.Serv_Sdds_ComponentOverlays_CounterLPositive),
    CounterLWarning(R.style.Serv_Sdds_ComponentOverlays_CounterLWarning),
    CounterLNegative(R.style.Serv_Sdds_ComponentOverlays_CounterLNegative),
    CounterLBlack(R.style.Serv_Sdds_ComponentOverlays_CounterLBlack),
    CounterLWhite(R.style.Serv_Sdds_ComponentOverlays_CounterLWhite),
    CounterMDefault(R.style.Serv_Sdds_ComponentOverlays_CounterMDefault),
    CounterMAccent(R.style.Serv_Sdds_ComponentOverlays_CounterMAccent),
    CounterMPositive(R.style.Serv_Sdds_ComponentOverlays_CounterMPositive),
    CounterMWarning(R.style.Serv_Sdds_ComponentOverlays_CounterMWarning),
    CounterMNegative(R.style.Serv_Sdds_ComponentOverlays_CounterMNegative),
    CounterMBlack(R.style.Serv_Sdds_ComponentOverlays_CounterMBlack),
    CounterMWhite(R.style.Serv_Sdds_ComponentOverlays_CounterMWhite),
    CounterSDefault(R.style.Serv_Sdds_ComponentOverlays_CounterSDefault),
    CounterSAccent(R.style.Serv_Sdds_ComponentOverlays_CounterSAccent),
    CounterSPositive(R.style.Serv_Sdds_ComponentOverlays_CounterSPositive),
    CounterSWarning(R.style.Serv_Sdds_ComponentOverlays_CounterSWarning),
    CounterSNegative(R.style.Serv_Sdds_ComponentOverlays_CounterSNegative),
    CounterSBlack(R.style.Serv_Sdds_ComponentOverlays_CounterSBlack),
    CounterSWhite(R.style.Serv_Sdds_ComponentOverlays_CounterSWhite),
    CounterXsDefault(R.style.Serv_Sdds_ComponentOverlays_CounterXsDefault),
    CounterXsAccent(R.style.Serv_Sdds_ComponentOverlays_CounterXsAccent),
    CounterXsPositive(R.style.Serv_Sdds_ComponentOverlays_CounterXsPositive),
    CounterXsWarning(R.style.Serv_Sdds_ComponentOverlays_CounterXsWarning),
    CounterXsNegative(R.style.Serv_Sdds_ComponentOverlays_CounterXsNegative),
    CounterXsBlack(R.style.Serv_Sdds_ComponentOverlays_CounterXsBlack),
    CounterXsWhite(R.style.Serv_Sdds_ComponentOverlays_CounterXsWhite),
    CounterXxsDefault(R.style.Serv_Sdds_ComponentOverlays_CounterXxsDefault),
    CounterXxsAccent(R.style.Serv_Sdds_ComponentOverlays_CounterXxsAccent),
    CounterXxsPositive(R.style.Serv_Sdds_ComponentOverlays_CounterXxsPositive),
    CounterXxsWarning(R.style.Serv_Sdds_ComponentOverlays_CounterXxsWarning),
    CounterXxsNegative(R.style.Serv_Sdds_ComponentOverlays_CounterXxsNegative),
    CounterXxsBlack(R.style.Serv_Sdds_ComponentOverlays_CounterXxsBlack),
    CounterXxsWhite(R.style.Serv_Sdds_ComponentOverlays_CounterXxsWhite),
}
