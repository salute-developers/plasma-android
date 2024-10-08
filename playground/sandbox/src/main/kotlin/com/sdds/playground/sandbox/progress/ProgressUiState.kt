package com.sdds.playground.sandbox.progress

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ProgressBar
 * @property variant вариация компонента
 * @property progress текущий прогресс
 */
@Parcelize
internal data class ProgressUiState(
    val variant: ProgressVariant = ProgressVariant.Default,
    val progress: Float = 0.5f,
) : Parcelable

/**
 * Стили компонента ProgressBar
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class ProgressVariant(@StyleRes val styleRes: Int) : Parcelable {
    Default(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarDefault),
    Secondary(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarSecondary),
    Accent(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarAccent),
    GradientAccent(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarGradientAccent),
    Positive(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarPositive),
    Warning(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarWarning),
    Negative(R.style.Theme_Sandbox_ComponentOverlays_ProgressBarNegative),
}
