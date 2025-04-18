package com.sdds.playground.sandbox.avatar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.avatar.AvatarExtra
import com.sdds.testing.vs.avatar.AvatarExtraPlacement
import com.sdds.testing.vs.avatar.AvatarUiState
import com.sdds.testing.vs.avatar.ExampleMode
import com.sdds.uikit.Avatar

/**
 * ViewModel для экранов с компонентом [Avatar]
 */
internal class AvatarViewModel(
    defaultState: AvatarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AvatarUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = AvatarPropertyName.values().find { it.value == name }
        val valueString = value?.toString() ?: return
        when (pName) {
            AvatarPropertyName.ExampleMode -> updateDisplayType(ExampleMode.valueOf(valueString))
            AvatarPropertyName.Status -> updateStatus(Avatar.Status.valueOf(valueString))
            AvatarPropertyName.Placeholder -> updatePlaceholder(valueString)
            AvatarPropertyName.Threshold -> updateThreshold(valueString.toIntOrNull() ?: 0)
            AvatarPropertyName.Extra -> updateExtra(AvatarExtra.valueOf(valueString))
            AvatarPropertyName.ExtraPlacement -> updateExtraPlacement(AvatarExtraPlacement.valueOf(valueString))
            AvatarPropertyName.BadgeText -> updateBadgeText(valueString)
            AvatarPropertyName.BadgeContentStart -> updateBadgeContentStart(valueString.toBoolean())
            AvatarPropertyName.BadgeContentEnd -> updateBadgeContentEnd(valueString.toBoolean())
            AvatarPropertyName.CounterText -> updateCounterText(valueString)
            null -> Unit
        }
    }

    private fun updateDisplayType(type: ExampleMode) {
        internalUiState.value = internalUiState.value.copy(exampleMode = type)
    }

    private fun updateStatus(status: Avatar.Status) {
        internalUiState.value = internalUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String?) {
        internalUiState.value = internalUiState.value.copy(fullName = text)
    }

    private fun updateThreshold(threshold: Int) {
        internalUiState.value = internalUiState.value.copy(threshold = threshold)
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

    @Suppress("LongMethod")
    override fun AvatarUiState.toProps(): List<Property<*>> {
        return mutableListOf<Property<*>>().apply {
            add(
                enumProperty(
                    name = AvatarPropertyName.ExampleMode.value,
                    value = exampleMode,
                ),
            )
            add(
                enumProperty(
                    name = AvatarPropertyName.Status.value,
                    value = status,
                ),
            )
            add(
                Property.StringProperty(
                    name = AvatarPropertyName.Placeholder.value,
                    value = fullName.orEmpty(),
                ),
            )
            add(
                enumProperty(
                    name = AvatarPropertyName.Extra.value,
                    value = extra,
                ),
            )
            if (extra != AvatarExtra.None) {
                add(
                    enumProperty(
                        name = AvatarPropertyName.ExtraPlacement.value,
                        value = extraPlacement,
                    ),
                )
            }
            if (extra == AvatarExtra.Badge) {
                add(
                    Property.StringProperty(
                        name = AvatarPropertyName.BadgeText.value,
                        value = badgeText,
                    ),
                )
                add(
                    Property.BooleanProperty(
                        name = AvatarPropertyName.BadgeContentStart.value,
                        value = badgeContentStart,
                    ),
                )
                add(
                    Property.BooleanProperty(
                        name = AvatarPropertyName.BadgeContentEnd.value,
                        value = badgeContentEnd,
                    ),
                )
            }
            if (extra == AvatarExtra.Counter) {
                add(
                    Property.StringProperty(
                        name = AvatarPropertyName.CounterText.value,
                        value = counterText,
                    ),
                )
            }
        }
    }

    private enum class AvatarPropertyName(val value: String) {
        ExampleMode("exampleMode"),
        Status("status"),
        Placeholder("placeholder"),
        Threshold("threshold"),
        Extra("extra"),
        ExtraPlacement("extraPlacement"),
        BadgeText("badgeText"),
        BadgeContentStart("badgeContentStart"),
        BadgeContentEnd("badgeContentEnd"),
        CounterText("counterText"),
    }
}

/**
 * Фабрика [AvatarGroupViewModel]
 * @param groupMode режим группы аватаров
 */
internal class AvatarViewModelFactory(
    private val defaultState: AvatarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
