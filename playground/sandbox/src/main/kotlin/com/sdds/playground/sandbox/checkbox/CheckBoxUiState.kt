package com.sdds.playground.sandbox.checkbox

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.themes.sdds.serv.tokens.R
import com.sdds.uikit.CheckBox
import kotlinx.parcelize.Parcelize

/**
 * Состояние checkbox
 * @property variant вариация компонента [CheckBox]
 * @property state состояние checkbox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
@Parcelize
internal data class CheckBoxUiState(
    val variant: CheckBoxVariant = CheckBoxVariant.CheckBoxM,
    val state: CheckBox.ToggleableState = CheckBox.ToggleableState.INDETERMINATE,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : Parcelable

/**
 * Стили вариаций компонента [CheckBox]
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class CheckBoxVariant(@StyleRes val styleRes: Int) : Parcelable {
    CheckBoxM(R.style.Serv_Sdds_ComponentOverlays_CheckBoxM),
    CheckBoxS(R.style.Serv_Sdds_ComponentOverlays_CheckBoxS),
}

/**
 * Стили вариаций компонента CheckBoxGroup
 * @property styleRes ресурс стиля
 */
internal enum class CheckBoxGroupVariant(@StyleRes val styleRes: Int) {
    CheckBoxGroupM(R.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupM),
    CheckBoxGroupS(R.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupS),
}

/**
 * Возвращает стили вариаций компонента CheckBoxGroup по [CheckBoxVariant]
 */
internal fun CheckBoxVariant.toGroupVariant() = when (this) {
    CheckBoxVariant.CheckBoxM -> CheckBoxGroupVariant.CheckBoxGroupM
    CheckBoxVariant.CheckBoxS -> CheckBoxGroupVariant.CheckBoxGroupS
}
