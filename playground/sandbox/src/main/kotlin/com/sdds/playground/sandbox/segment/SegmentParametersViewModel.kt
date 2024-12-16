package com.sdds.playground.sandbox.segment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal class SegmentParametersViewModel(
    private val groupMode: Boolean,
    private val defaultState: SegmentUiState,
) : ViewModel(), PropertiesOwner {

    private val _segmentItemState = MutableStateFlow(defaultState)

    val segmentItemState: StateFlow<SegmentUiState>
        get() = _segmentItemState.asStateFlow()

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _segmentItemState
            .mapLatest { if (groupMode) it.toSegmentProps() else it.toItemProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = _segmentItemState.value
        var stretch = currentState.stretch
        _segmentItemState.value = when (propertyName) {
            PropertyName.Variant -> currentState.copy(
                variant = when (groupMode) {
                    true -> SegmentVariant.valueOf(valueString)
                    else -> SegmentItemVariant.valueOf(valueString)
                },
            )

            PropertyName.Amount -> currentState.copy(amount = valueString.toInt())
            PropertyName.Icon -> currentState.copy(
                icon = when (valueString) {
                    SegmentItemIcon.Start::class.simpleName -> SegmentItemIcon.Start
                    SegmentItemIcon.End::class.simpleName -> SegmentItemIcon.End
                    else -> SegmentItemIcon.No
                },
            )

            PropertyName.Label -> currentState.copy(segmentItemLabel = valueString)
            PropertyName.Value -> currentState.copy(segmentItemValue = valueString)
            PropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
            PropertyName.Stretch -> {
                if (currentState.orientation == SegmentOrientation.HORIZONTAL) {
                    stretch = valueString.toBoolean()
                }
                currentState.copy(stretch = stretch)
            }
            PropertyName.Orientation -> {
                if (SegmentOrientation.valueOf(valueString) == SegmentOrientation.VERTICAL) {
                    stretch = false
                }
                currentState.copy(
                    orientation = SegmentOrientation.valueOf(valueString),
                    stretch = stretch,
                )
            }
        }
    }

    override fun resetToDefault() {
        _segmentItemState.value = defaultState
    }

    private fun SegmentUiState.toItemProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant as SegmentItemVariant,
            ),

            Property.SingleChoiceProperty(
                name = PropertyName.Icon.value,
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    SegmentItemIcon.Start::class.simpleName.orEmpty(),
                    SegmentItemIcon.End::class.simpleName.orEmpty(),
                    SegmentItemIcon.No::class.simpleName.orEmpty(),
                ),
            ),
            Property.StringProperty(
                name = PropertyName.Label.value,
                value = segmentItemLabel,
            ),
            Property.StringProperty(
                name = PropertyName.Value.value,
                value = segmentItemValue.orEmpty(),
            ),
            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private fun SegmentUiState.toSegmentProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant as SegmentVariant,
            ),
            Property.IntProperty(
                name = PropertyName.Amount.value,
                value = amount,
            ),

            Property.SingleChoiceProperty(
                name = PropertyName.Icon.value,
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    SegmentItemIcon.Start::class.simpleName.orEmpty(),
                    SegmentItemIcon.End::class.simpleName.orEmpty(),
                    SegmentItemIcon.No::class.simpleName.orEmpty(),
                ),
            ),
            Property.StringProperty(
                name = PropertyName.Label.value,
                value = segmentItemLabel,
            ),
            Property.StringProperty(
                name = PropertyName.Value.value,
                value = segmentItemValue.orEmpty(),
            ),
            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = PropertyName.Stretch.value,
                value = stretch,
            ),
            enumProperty(
                name = PropertyName.Orientation.value,
                value = orientation,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Variant("variant"),
        Amount("amount"),
        Icon("icon"),
        Label("label"),
        Value("value"),
        Enabled("enabled"),
        Stretch("stretch"),
        Orientation("orientation"),
    }
}

internal class SegmentParametersViewModelFactory(
    private val groupMode: Boolean = false,
    private val defaultState: SegmentUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentParametersViewModel(
            groupMode = groupMode,
            defaultState = defaultState,
        ) as T
    }
}
