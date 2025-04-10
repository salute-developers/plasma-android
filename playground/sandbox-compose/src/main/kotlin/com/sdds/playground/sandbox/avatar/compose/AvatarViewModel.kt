package com.sdds.playground.sandbox.avatar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class AvatarViewModel(
    defaultState: AvatarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AvatarUiState, AvatarStyle>(defaultState, componentKey) {

    private fun updateDisplayType(type: ExampleMode) {
        internalUiState.value = internalUiState.value.copy(exampleMode = type)
    }

    private fun updateStatus(status: AvatarStatus) {
        internalUiState.value = internalUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                AvatarPlaceholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateExtra(extra: AvatarExtra) {
        internalUiState.value = internalUiState.value.copy(extra = extra)
    }

    private fun updateExtraPlacement(extraPlacement: AvatarExtraPlacement) {
        internalUiState.value = internalUiState.value.copy(extraPlacement = extraPlacement)
    }

    private fun updateBadgeText(badgeText: String) {
        internalUiState.value = internalUiState.value.copy(badgeText = badgeText)
    }

    private fun updateBadgeContentStart(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(badgeContentStart = enabled)
    }

    private fun updateBadgeContentEnd(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(badgeContentEnd = enabled)
    }

    private fun updateCounterText(counterText: String) {
        internalUiState.value = internalUiState.value.copy(counterText = counterText)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return mutableListOf<Property<*>>().apply {
            enumProperty(
                name = "exampleMode",
                value = exampleMode,
                onApply = { updateDisplayType(it) },
            ).let(::add)

            enumProperty(
                name = "status",
                value = status,
                onApply = { updateStatus(it) },
            ).let(::add)

            Property.StringProperty(
                name = "placeholder",
                value = placeholder?.name.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ).let(::add)

            enumProperty(
                name = "extra",
                value = extra,
                onApply = { updateExtra(it) },
            ).let(::add)

            if (extra != AvatarExtra.None) {
                enumProperty(
                    name = "extraPlacement",
                    value = extraPlacement,
                    onApply = { updateExtraPlacement(it) },
                ).let(::add)
            }

            if (extra == AvatarExtra.Badge) {
                Property.StringProperty(
                    name = "badgeText",
                    value = badgeText,
                    onApply = { updateBadgeText(it) },
                ).let(::add)

                Property.BooleanProperty(
                    name = "badgeContentStart",
                    value = badgeContentStart,
                    onApply = { updateBadgeContentStart(it) },
                ).let(::add)

                Property.BooleanProperty(
                    name = "badgeContentEnd",
                    value = badgeContentEnd,
                    onApply = { updateBadgeContentEnd(it) },
                ).let(::add)
            }

            if (extra == AvatarExtra.Counter) {
                Property.StringProperty(
                    name = "counterText",
                    value = counterText,
                    onApply = { updateCounterText(it) },
                ).let(::add)
            }
        }
    }

    companion object {

        val AvatarPlaceholder.name get() = (this as? AvatarPlaceholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarViewModel]
 */
internal class AvatarViewModelFactory(
    private val defaultState: AvatarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarViewModel(defaultState, componentKey) as T
    }
}
