package com.sdds.playground.sandbox.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента FormItem
 */
internal class FormItemViewModel(
    defaultState: FormItemUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<FormItemUiState, FormItemStyle>(defaultState, componentKey) {

    override fun FormItemUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "hasHint",
                value = hasHint,
                onApply = { internalUiState.value = internalUiState.value.copy(hasHint = it) },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { internalUiState.value = internalUiState.value.copy(enabled = it) },
            ),
            Property.BooleanProperty(
                name = "hasCaptionIcon",
                value = hasCaptionIcon,
                onApply = { internalUiState.value = internalUiState.value.copy(hasCaptionIcon = it) },
            ),
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = { internalUiState.value = internalUiState.value.copy(title = it) },
            ),
            Property.StringProperty(
                name = "titleCaption",
                value = titleCaption,
                onApply = { internalUiState.value = internalUiState.value.copy(titleCaption = it) },
            ),
            Property.StringProperty(
                name = "content",
                value = content,
                onApply = { internalUiState.value = internalUiState.value.copy(content = it) },
            ),
            Property.StringProperty(
                name = "caption",
                value = caption,
                onApply = { internalUiState.value = internalUiState.value.copy(caption = it) },
            ),
            Property.StringProperty(
                name = "counter",
                value = counter,
                onApply = { internalUiState.value = internalUiState.value.copy(counter = it) },
            ),
            Property.StringProperty(
                name = "optional",
                value = optional,
                onApply = { internalUiState.value = internalUiState.value.copy(counter = it) },
            ),
            enumProperty(
                name = "bottomTextAlignment",
                value = bottomTextAlignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(bottomTextAlignment = it)
                },
            ),
        )
    }
}

internal class FormItemViewModelFactory(
    private val defaultState: FormItemUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FormItemViewModel(defaultState, componentKey) as T
    }
}
