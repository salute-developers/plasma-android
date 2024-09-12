package com.sdds.playground.sandbox.switcher

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
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
    SwitchL(R.style.Theme_Sandbox_ComponentOverlays_SwitchL),
    SwitchM(R.style.Theme_Sandbox_ComponentOverlays_SwitchM),
    SwitchS(R.style.Theme_Sandbox_ComponentOverlays_SwitchS),
}
