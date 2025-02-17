package com.sdds.playground.sandbox.progress.vs

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.core.vs.UiState
import com.sdds.serv.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ProgressBar
 * @property variant вариация компонента
 * @property progress текущий прогресс
 */
@Parcelize
internal data class ProgressUiState(
    override val variant: String = "",
    val progress: Float = 0.5f,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Стили компонента ProgressBar
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class ProgressVariant(@StyleRes val styleRes: Int) : Parcelable {
    Default(R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault),
    Secondary(R.style.Serv_Sdds_ComponentOverlays_ProgressBarSecondary),
    Accent(R.style.Serv_Sdds_ComponentOverlays_ProgressBarAccent),
    GradientAccent(R.style.Serv_Sdds_ComponentOverlays_ProgressBarGradientAccent),
    Positive(R.style.Serv_Sdds_ComponentOverlays_ProgressBarPositive),
    Warning(R.style.Serv_Sdds_ComponentOverlays_ProgressBarWarning),
    Negative(R.style.Serv_Sdds_ComponentOverlays_ProgressBarNegative),
}
