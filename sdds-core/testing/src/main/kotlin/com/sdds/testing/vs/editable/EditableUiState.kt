package com.sdds.testing.vs.editable

import android.os.Parcelable
import android.view.Gravity
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Editable
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента File
 * @property variant вариация стиля
 * @property appearance вариация компонента
 * @property enabled разрешает взаимодействие с компонентом
 * @property singleLine только однострочный текст
 * @property readonly запрещает ввод текста
 * @property iconPlacement расположение иконки (в границах компонента или за ними)
 * @property textAlignment выравнивание текста
 */
@Parcelize
data class EditableUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val enabled: Boolean = true,
    val singleLine: Boolean = true,
    val readonly: Boolean = false,
    val iconPlacement: IconPlacement = IconPlacement.Relative,
    val textAlignment: TextAlign = TextAlign.Start,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Расположжение иконки относительно границ компонента
 */
@Parcelize
enum class IconPlacement : Parcelable {
    Absolute,
    Relative,
}

/**
 * Преобразует [IconPlacement] в [Editable] IconPlacement
 */
fun IconPlacement.toEditableIconPlacement(): Int = when (this) {
    IconPlacement.Absolute -> Editable.ICON_PLACEMENT_ABSOLUTE
    IconPlacement.Relative -> Editable.ICON_PLACEMENT_RELATIVE
}

/**
 * Выравнивание текста
 */
@Parcelize
enum class TextAlign : Parcelable {
    Start,
    Center,
    End,
}

/**
 * Преобразует [TextAlign] в [Editable] textAlignment
 */
fun TextAlign.toEditableTextAlignment(): Int = when (this) {
    TextAlign.Start -> Gravity.START or Gravity.CENTER_VERTICAL
    TextAlign.Center -> Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL
    TextAlign.End -> Gravity.END or Gravity.CENTER_VERTICAL
}
