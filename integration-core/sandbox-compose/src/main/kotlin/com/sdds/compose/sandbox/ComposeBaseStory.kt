package com.sdds.compose.sandbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.sandbox.internal.ComponentScaffold
import com.sdds.compose.sandbox.internal.ComponentViewModel
import com.sdds.compose.sandbox.internal.ComponentViewModelFactory
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.BaseStory
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.UiState
import com.sdds.sandbox.producer
import com.sdds.sandbox.transformer

/**
 * Абстрактный базовый класс для создания историй компонентов в Compose-сторибуке.
 *
 * Предоставляет инфраструктуру для управления состоянием, стилями и отображением
 * компонентов в интерактивной среде разработки. Автоматически интегрируется с
 * ViewModel и системой Scaffold для обеспечения работы панели управления свойствами.
 *
 * @param State тип состояния пользовательского интерфейса, который должен реализовывать [UiState]
 * @param S тип стиля компонента, должен наследоваться от [Style]
 *
 * @param component уникальный ключ компонента для идентификации в сторибуке
 * @param defaultState начальное состояние истории
 * @param propertiesProducer провайдер свойств для генерации настраиваемых параметров
 *                          в панели управления. По умолчанию создается из [defaultState]
 * @param stateTransformer трансформер для обработки изменений состояния.
 *                         По умолчанию создается из [defaultState]
 *
 * @see BaseStory
 * @see ComponentScaffold
 * @see ComponentViewModel
 */
abstract class ComposeBaseStory<State : UiState, S : Style>(
    override val component: ComponentKey,
    override val defaultState: State,
    override val propertiesProducer: PropertiesProducer<State> = defaultState.producer(),
    override val stateTransformer: StateTransformer<State> = defaultState.transformer(),
) : BaseStory<State> {

    /**
     * Composable функция для отображения содержимого истории компонента.
     *
     * Должна быть реализована в наследниках для определения конкретного
     * отображения компонента с заданными стилем и состоянием. Вызывается внутри
     * [ComponentScaffold] и получает доступ к контексту [BoxScope] для позиционирования.
     *
     * @param style стиль компонента, влияющий на его внешний вид
     * @param state текущее состояние компонента
     */
    @Composable
    abstract fun BoxScope.Content(
        style: S,
        state: State,
    )

    /**
     * Composable функция для отображения содержимого превью компонента.
     *
     * Должна быть реализована в наследниках для определения превью в списке навигации по компонентам.
     *
     * @param style стиль компонента, влияющий на его внешний вид
     */
    @Composable
    open fun Preview(style: S, key: ComponentKey) {
        Text("empty preview, key=$key")
    }

    /**
     * Внутренняя композируемая функция, интегрирующая историю с инфраструктурой сторибука.
     *
     * Создает [ComponentScaffold] с ViewModel, который обеспечивает:
     * - Управление жизненным циклом истории
     * - Интеграцию с панелью управления свойствами
     * - Автоматическое обновление состояния при изменении свойств
     * - Сохранение состояния при рекомпозиции
     *
     * Не предназначена для прямого вызова из клиентского кода.
     */
    @Composable
    internal fun Story() {
        ComponentScaffold(
            key = component,
            viewModel = viewModel<ComponentViewModel<State, S>>(
                factory = ComponentViewModelFactory<State, S>(
                    defaultState = defaultState,
                    propertiesProducer = propertiesProducer,
                    stateTransformer = stateTransformer,
                    componentKey = component,
                ),
                key = component.toString(),
            ),
            component = { state, style ->
                Content(style, state)
            },
        )
    }
}
