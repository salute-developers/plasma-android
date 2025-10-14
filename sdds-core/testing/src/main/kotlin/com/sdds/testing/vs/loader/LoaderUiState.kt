package com.sdds.testing.vs.loader

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.testing.vs.loader.LoaderType.Progress
import com.sdds.testing.vs.loader.LoaderType.Spinner
import com.sdds.uikit.Loader
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента ListView
 * @property variant вариация
 * @property loaderType тип прогресса загрузки
 */
data class LoaderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val loaderType: LoaderType = Spinner,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Тип отображаемого прогресса, конечный [Progress] или бесконечный [Spinner]
 */
@Parcelize
enum class LoaderType : Parcelable {
    Spinner,
    Progress,
}

/**
 * Преобразует [LoaderType] в [Loader] type
 */
fun LoaderType.toType(): Int = when (this) {
    Spinner -> Loader.SPINNER
    Progress -> Loader.PROGRESS
}
