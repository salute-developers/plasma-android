package com.sdds.playground.sandbox.notificationcontent.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.notificationcontent.NotificationContentUiState

/**
 * ViewModel для экранов с компонентом NotificationContent
 */
internal class NotificationContentParametersViewModel(
    defaultState: NotificationContentUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NotificationContentUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (NotificationContentPropertyName.values().find { it.value == name }) {
            NotificationContentPropertyName.Title -> updateTitle(value?.toString().orEmpty())
            NotificationContentPropertyName.Text -> updateText(value?.toString().orEmpty())
            NotificationContentPropertyName.HasActions -> updateHasActions((value as? Boolean) == true)
            else -> Unit
        }
    }

    private fun updateTitle(title: String) {
        internalUiState.value = internalUiState.value.copy(title = title)
    }

    private fun updateText(text: String) {
        internalUiState.value = internalUiState.value.copy(text = text)
    }

    private fun updateHasActions(hasActions: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasActions = hasActions)
    }

    override fun NotificationContentUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = NotificationContentPropertyName.Title.value,
                value = title,
            ),

            Property.StringProperty(
                name = NotificationContentPropertyName.Text.value,
                value = text,
            ),

            Property.BooleanProperty(
                name = NotificationContentPropertyName.HasActions.value,
                value = hasActions,
            ),
        )
    }

    private enum class NotificationContentPropertyName(val value: String) {
        Title("title"),
        Text("text"),
        HasActions("hasActions"),
    }
}

/**
 * Фабрика [NotificationContentParametersViewModel]
 */
internal class NotificationContentParametersViewModelFactory(
    private val defaultState: NotificationContentUiState = NotificationContentUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NotificationContentParametersViewModel(defaultState, componentKey) as T
    }
}
