package com.sdds.uikit.fixtures.stories.accordion

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import kotlinx.parcelize.Parcelize

/**
 * UI-состояние для компонента аккордеона.
 *
 * @property variant Вариант отображения компонента (например, цветовая схема или стиль).
 * @property amount Количество отображаемых элементов или повторений.
 * @property title Заголовок аккордеона.
 * @property contentText Основной текст содержимого.
 * @property animation Указывает, должна ли использоваться анимация.
 * @property hasDivider Показывать ли разделитель под элементом.
 */
@Parcelize
@StoryUiState
data class AccordionUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val amount: Int = 3,
    val title: String = "Title",
    val contentText: String = "Content text",
    val animation: Boolean = true,
    val hasDivider: Boolean = false,
) : Parcelable, UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
