package com.sdds.uikit.fixtures.stories.loader

import android.os.Parcelable
import com.sdds.uikit.Loader
import com.sdds.uikit.fixtures.UiState
import com.sdds.uikit.fixtures.stories.loader.LoaderType.Progress
import com.sdds.uikit.fixtures.stories.loader.LoaderType.Spinner
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
