package com.sdds.playground.sandbox.badge.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Badge и IconBadge
 * @param badgeType тип кнопки (см. [BadgeType])
 * @param defaultState состояние по-умолчанию
 */
internal class BadgeParametersViewModel(
    private val badgeType: BadgeType,
    private val defaultState: BadgeUiState,
) : ViewModel(), PropertiesOwner {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }
    private val _badgeState = MutableStateFlow(defaultState)

    /**
     * Состояние Badge
     */
    val badgeState: StateFlow<BadgeUiState>
        get() = _badgeState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _badgeState
            .mapLatest { state ->
                when (badgeType) {
                    BadgeType.Badge -> state.toProps()
                    BadgeType.IconBadge -> state.toIconProps()
                }
            }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentName = _badgeState.value
        _badgeState.value = when (propertyName) {
            PropertyName.Variant -> {
                when (badgeType) {
                    BadgeType.Badge -> currentName.copy(variant = BadgeVariant.valueOf(valueString))
                    BadgeType.IconBadge -> currentName.copy(variant = IconBadgeVariant.valueOf(valueString))
                }
            }
            PropertyName.Label -> currentName.copy(label = valueString)
            PropertyName.ContentLeft -> currentName.copy(contentLeft = valueString.toBoolean())
            PropertyName.ContentRight -> currentName.copy(contentRight = valueString.toBoolean())
        }
    }

    override fun resetToDefault() {
        _badgeState.value = defaultState
    }

    private fun BadgeUiState.toIconProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant as IconBadgeVariant,
            ),
        )
    }

    private fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant as BadgeVariant,
            ),
            Property.StringProperty(
                name = PropertyName.Label.value,
                value = label,
            ),
            Property.BooleanProperty(
                name = PropertyName.ContentLeft.value,
                value = contentLeft,
            ),
            Property.BooleanProperty(
                name = PropertyName.ContentRight.value,
                value = contentRight,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Variant("Variant"),
        Label("Label"),
        ContentLeft("ContentLeft"),
        ContentRight("ContentRight"),
    }
}

/**
 * Тип кнопки
 */
internal enum class BadgeType {

    /**
     * Компонент BasicButton
     */
    Badge,

    /**
     * Компонент IconButton
     */
    IconBadge,
}

/**
 * Фабрика [BadgeParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class BadgeParametersViewModelFactory(
    private val type: BadgeType,
    private val defaultState: BadgeUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BadgeParametersViewModel(badgeType = type, defaultState = defaultState) as T
    }
}
