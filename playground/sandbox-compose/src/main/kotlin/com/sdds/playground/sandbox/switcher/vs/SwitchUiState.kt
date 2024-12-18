package com.sdds.playground.sandbox.switcher.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние switch
 *
 * @property variant стиль компонента
 * @property active состояние switch
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 */
@Parcelize
internal data class SwitchUiState(
    val variant: SwitchVariant = SwitchVariant.SwitchL,
    val active: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : Parcelable

/**
 * Стили вариаций компонента Switch
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class SwitchVariant(@StyleRes val styleRes: Int) : Parcelable {
    SwitchL(R.style.Serv_Sdds_ComponentOverlays_SwitchL),
    SwitchM(R.style.Serv_Sdds_ComponentOverlays_SwitchM),
    SwitchS(R.style.Serv_Sdds_ComponentOverlays_SwitchS),
}
