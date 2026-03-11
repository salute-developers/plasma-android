package com.sdds.compose.uikit.fixtures.stories.button

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.sandbox.ButtonUiStatePropertiesProducer
import com.sdds.sandbox.ButtonUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние пользовательского интерфейса для кнопки в сторибуке.
 *
 * Определяет все настраиваемые параметры кнопки, которые будут доступны
 * для изменения в панели управления. Аннотация [StoryUiState] позволяет
 * системе сторибука идентифицировать этот класс как состояние компонента.
 *
 * @param variant вариация кнопки. Помечена [StoryProperty] для автоматического отображения в UI.
 * @param appearance внешний вид кнопки.Помечена [StoryProperty] для автоматического отображения в UI.
 * @param label текстовая метка кнопки. Помечена [StoryProperty] для возможности
 * динамического изменения текста через панель управления.
 * @param value дополнительное значение кнопки. Помечена [StoryProperty] для
 * настройки через интерфейс.
 * @param spacing отступы внутри кнопки. Использует перечисление [ButtonSpacing]
 * для выбора предопределенных вариантов.
 *
 * @see UiState
 * @see StoryUiState
 * @see StoryProperty
 */
@StoryUiState
data class ButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "label",
    val value: String = "value",
    val spacing: ButtonSpacing = ButtonSpacing.SpaceBetween,
) : UiState {
    /**
     * Создает копию состояния с обновленными значениями внешнего вида и вариации.
     *
     * Вызывается системой сторибука при изменении соответствующих свойств
     * в панели управления.
     *
     * @param appearance новое значение внешнего вида
     * @param variant новое значение вариации
     * @return обновленная копия [ButtonUiState]
     */
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * История компонента BasicButton для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации базовой кнопки.
 *
 * @see Story
 * @see ComposeBaseStory
 * @see ComponentKey.BasicButton
 * @see ButtonStyle
 */
@Story
object BasicButtonStory : ComposeBaseStory<ButtonUiState, ButtonStyle>(
    ComponentKey.BasicButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer,
) {
    /**
     * Композируемая функция для отображения кнопки с заданными стилем и состоянием.
     *
     * @param style стиль кнопки, определяющий её внешний вид
     * @param state текущее состояние кнопки со всеми настраиваемыми параметрами
     */
    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: ButtonUiState) {
        Button(
            style = style,
            label = state.label,
            value = state.value,
            onClick = {}, // Пустой обработчик для демонстрационных целей
        )
    }
}
