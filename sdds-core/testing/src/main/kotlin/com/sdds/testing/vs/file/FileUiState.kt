package com.sdds.testing.vs.file

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.File
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента File
 * @property variant вариация стиля
 * @property appearance вариация компонента
 * @property label лэйбл
 * @property description описание
 * @property isLoading состояние загрузки
 * @property hasContentStart отображение иконки или изображения (только для песочницы)
 * @property actionPlacement расположение экшн компонента
 * @property contentType тип контента (иконка или изображение)
 */
@Parcelize
data class FileUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val description: String = "Description",
    val isLoading: Boolean = false,
    val hasContentStart: Boolean = true,
    val actionPlacement: ActionPlacement = ActionPlacement.End,
    val contentType: FileContentType = FileContentType.Icon,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Расположение action в [File]
 */
@Parcelize
enum class ActionPlacement : Parcelable {
    Start,
    End,
}

/**
 * Преобразует [ActionPlacement] в [File].ACTION_PLACEMENT
 */
fun ActionPlacement.toFileActionPlacement(): Int {
    return when (this) {
        ActionPlacement.Start -> File.ACTION_PLACEMENT_START
        ActionPlacement.End -> File.ACTION_PLACEMENT_END
    }
}

/**
 * Тип контента в [File]
 */
@Parcelize
enum class FileContentType : Parcelable {
    Icon,
    Image,
}
