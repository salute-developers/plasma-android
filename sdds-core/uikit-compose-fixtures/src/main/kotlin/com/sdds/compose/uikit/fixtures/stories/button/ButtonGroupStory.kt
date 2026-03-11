package com.sdds.compose.uikit.fixtures.stories.button

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.sandbox.ButtonGroupUiStatePropertiesProducer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Property
import com.sdds.sandbox.PropertyProducer
import com.sdds.sandbox.StateValueTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import com.sdds.sandbox.enumProperty

/**
 * Состояние пользовательского интерфейса для группы кнопок в сторибуке.
 *
 * Определяет настраиваемые параметры группы кнопок, которые будут доступны
 * для изменения в панели управления. Демонстрирует использование кастомных
 * провайдеров свойств и трансформеров значений.
 *
 * @param variant вариация группы кнопок
 * @param appearance внешний вид кнопок внутри группы
 * @param orientation ориентация группы (горизонтальная/вертикальная).
 * Использует кастомный провайдер [ButtonGroupOrientationProperty]
 * для генерации свойства с отображаемым именем "orient"
 * @param amount количество кнопок в группе.
 * Использует кастомный трансформер [ButtonGroupAmountTransformer]
 * для валидации значения (неотрицательное число)
 *
 * @see StoryUiState
 * @see StoryProperty
 * @see ButtonGroupOrientation
 */
@StoryUiState
data class ButtonGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    @StoryProperty("orient", producedBy = ButtonGroupOrientationProperty::class)
    val orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    @StoryProperty(transformedBy = ButtonGroupAmountTransformer::class)
    val amount: Int = 3,
) : UiState {
    /**
     * Создает копию состояния с обновленными значениями внешнего вида и вариации.
     *
     * @param appearance новое значение внешнего вида
     * @param variant новое значение вариации
     * @return обновленная копия [ButtonGroupUiState]
     */
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * История компонента ButtonGroup для сторибука.
 *
 * @see Story
 * @see ComposeBaseStory
 * @see ComponentKey.ButtonGroup
 * @see ButtonGroupStyle
 */
@Story
object ButtonGroupStory : ComposeBaseStory<ButtonGroupUiState, ButtonGroupStyle>(
    ComponentKey.ButtonGroup,
    ButtonGroupUiState(),
    ButtonGroupUiStatePropertiesProducer,
) {
    /**
     * Композируемая функция для отображения группы кнопок.
     *
     * Автоматически добавляет прокрутку в зависимости от ориентации группы
     * и отступы для лучшей визуализации.
     *
     * @param style стиль группы кнопок
     * @param state текущее состояние с параметрами настройки
     */
    @Composable
    override fun BoxScope.Content(style: ButtonGroupStyle, state: ButtonGroupUiState) {
        val scrollModifier = when (state.orientation) {
            ButtonGroupOrientation.Vertical -> Modifier.verticalScroll(rememberScrollState())
            ButtonGroupOrientation.Horizontal -> Modifier.horizontalScroll(rememberScrollState())
        }
        Box(modifier = scrollModifier) {
            ButtonGroup(
                style = style,
                modifier = Modifier.padding(12.dp),
                orientation = state.orientation,
            ) {
                repeat(state.amount) {
                    buttonContent(state.appearance)
                }
            }
        }
    }

    /**
     * Вспомогательная функция для создания содержимого кнопки в группе.
     *
     * @param appearance внешний вид, определяющий тип кнопки:
     *                   - содержит "Icon" -> отображается иконка
     *                   - иначе -> отображается текстовая кнопка
     */
    private fun ButtonGroupScope.buttonContent(appearance: String = "") {
        if (appearance.contains("Icon")) {
            button { IconButton(painterResource(R.drawable.ic_plasma_24), {}) }
        } else {
            button {
                Button(
                    label = "label",
                    value = "value",
                    onClick = {},
                )
            }
        }
    }
}

/**
 * Провайдер свойства для ориентации группы кнопок.
 *
 * Генерирует свойство с выбором из предопределенных значений перечисления
 * [ButtonGroupOrientation]. Используется вместе с аннотацией [StoryProperty]
 * для кастомизации отображения в панели управления.
 *
 * @see PropertyProducer
 * @see enumProperty
 */
object ButtonGroupOrientationProperty : PropertyProducer<ButtonGroupUiState> {

    /**
     * Создает свойство выбора ориентации на основе текущего состояния.
     *
     * @param state текущее состояние группы кнопок
     * @return [Property.SingleChoiceProperty] с вариантами ориентации
     */
    override fun produce(state: ButtonGroupUiState): Property<*> {
        return enumProperty(
            name = "orientation",
            value = state.orientation,
        )
    }
}

/**
 * Трансформер значения для количества кнопок в группе.
 *
 * Обеспечивает валидацию вводимого значения: гарантирует, что количество
 * кнопок не может быть отрицательным. Применяется автоматически при изменении
 * свойства amount в панели управления.
 *
 * @see StateValueTransformer
 */
object ButtonGroupAmountTransformer : StateValueTransformer<Int, Int> {
    /**
     * Преобразует входное значение, обеспечивая его неотрицательность.
     *
     * @param input исходное значение (может быть любым целым числом)
     * @return значение, приведенное к диапазону [0, +∞)
     */
    override fun transform(input: Int): Int {
        return input.coerceAtLeast(0)
    }
}
