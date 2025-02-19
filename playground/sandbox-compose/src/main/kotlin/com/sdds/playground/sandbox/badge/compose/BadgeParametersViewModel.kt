package com.sdds.playground.sandbox.badge.compose

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Badhe
 */
internal class BadgeParametersViewModel(
    private val badgeType: BadgeType,
) : ViewModel(), PropertiesOwner {

    private val _badgeState = MutableStateFlow(BadgeUiState())

    /**
     * Состояние_badge
     */
    val badgeState: StateFlow<BadgeUiState>
        get() = _badgeState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _badgeState
            .mapLatest { state ->
                when (badgeType) {
                    BadgeType.Basic -> state.toProps()
                    BadgeType.Icon -> state.toIconProps()
                }
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _badgeState.value = BadgeUiState()
    }

    private fun updateVariant(variant: BadgeVariant) {
        _badgeState.value = _badgeState.value.copy(variant = variant)
    }

    private fun updateLabel(text: String) {
        _badgeState.value = _badgeState.value.copy(label = text)
    }

    private fun updateState(state: State) {
        _badgeState.value = _badgeState.value.copy(state = state)
    }

    private fun updateView(view: BadgeView) {
        _badgeState.value = _badgeState.value.copy(view = view)
    }

    private fun updateContentLeft(contentLeft: Boolean) {
        _badgeState.value = _badgeState.value.copy(contentLeft = contentLeft)
    }

    private fun updateContentRight(contentRight: Boolean) {
        _badgeState.value = _badgeState.value.copy(contentRight = contentRight)
    }

    private fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "view",
                value = view,
                onApply = { updateView(it) },
            ),
            enumProperty(
                name = "state",
                value = state,
                onApply = { updateState(it) },
            ),

            enumProperty(
                name = "variant",
                value = variant,
                onApply = { updateVariant(it) },
            ),

            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { updateLabel(it) },
            ),

            Property.BooleanProperty(
                name = "left content",
                value = contentLeft,
                onApply = { updateContentLeft(it) },
            ),

            Property.BooleanProperty(
                name = "right content",
                value = contentRight,
                onApply = { updateContentRight(it) },
            ),

        )
    }

    private fun BadgeUiState.toIconProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "view",
                value = view,
                onApply = { updateView(it) },
            ),
            enumProperty(
                name = "state",
                value = state,
                onApply = { updateState(it) },
            ),

            enumProperty(
                name = "variant",
                value = variant,
                onApply = { updateVariant(it) },
            ),
        )
    }
}

/**
 * Тип Badge
 */
internal enum class BadgeType {

    /**
     * Компонент Badge
     */
    Basic,

    /**
     * Компонент IconBadge
     */
    Icon,
}

/**
 * Фабрика [BadgeParametersViewModel]
 * @param type тип кнопки
 */
internal class BadgeParametersViewModelFactory(
    private val type: BadgeType,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        Log.e("BadgeParametersViewModelFactory", "create: type $type")
        return BadgeParametersViewModel(badgeType = type) as T
    }
}
