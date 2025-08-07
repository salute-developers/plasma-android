package com.sdds.testing.vs.button

import android.os.Parcelable
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Button
import kotlinx.parcelize.Parcelize
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property variant вариация кнопки
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [Button.Spacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 * @property fixedSize режим фиксированного размера кнопки
 * @property orientation ориентация группы кнопок
 * @property amount количество кнопок в группе
 */
@Parcelize
data class ButtonUiState(
    override val variant: String = "",
    val icon: ButtonIcon = ButtonIcon.No,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: Button.Spacing = Button.Spacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
    val fixedSize: Boolean = false,
    val orientation: GroupOrientation = GroupOrientation.Horizontal,
    val amount: Int = 3,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return this.copy(variant = variant)
    }
}

/**
 * Иконка кнопки
 * @property iconId идентификатор ресурса кнопки
 */
@Parcelize
sealed class ButtonIcon(val iconId: Int = Icons.ic_plasma_24) : Parcelable {

    /**
     * Иконка вначале кнопки
     */
    object Start : ButtonIcon()

    /**
     * Иконка вконце кнопки
     */
    object End : ButtonIcon()

    /**
     * Отсутствие иконки
     */
    object No : ButtonIcon(0)
}

/**
 * Ориентация компонента ButtonGroup
 * @property orientationState значение ориентации
 */
@Parcelize
enum class GroupOrientation(val orientationState: Int) : Parcelable {
    Horizontal(HORIZONTAL),
    Vertical(VERTICAL),
}
