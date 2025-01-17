package com.sdds.playground.sandbox.radiobox.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние RadioBox
 * @property variant вариация компонента
 * @property checked состояние выбора RadioBox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли RadioBox
 */
@Parcelize
internal data class RadioBoxUiState(
    val variant: RadioBoxVariant = RadioBoxVariant.RadioBoxM,
    val checked: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : Parcelable

/**
 * Стили вариаций компонента RadioBox
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class RadioBoxVariant(@StyleRes val styleRes: Int) : Parcelable {
    RadioBoxM(R.style.Serv_Sdds_ComponentOverlays_RadioBoxM),
    RadioBoxS(R.style.Serv_Sdds_ComponentOverlays_RadioBoxS),
}

/**
 * Стили вариаций компонента RadioBoxGroup
 * @property styleRes ресурс стиля
 */
internal enum class RadioBoxGroupVariant(@StyleRes val styleRes: Int) {
    RadioBoxGroupM(R.style.Serv_Sdds_ComponentOverlays_RadioBoxGroupM),
    RadioBoxGroupS(R.style.Serv_Sdds_ComponentOverlays_RadioBoxGroupS),
}

/**
 * Возвращает стили вариаций компонента RadioBoxGroup по [RadioBoxVariant]
 */
internal fun RadioBoxVariant.toGroupVariant(): RadioBoxGroupVariant =
    when (this) {
        RadioBoxVariant.RadioBoxM -> RadioBoxGroupVariant.RadioBoxGroupM
        RadioBoxVariant.RadioBoxS -> RadioBoxGroupVariant.RadioBoxGroupS
    }
