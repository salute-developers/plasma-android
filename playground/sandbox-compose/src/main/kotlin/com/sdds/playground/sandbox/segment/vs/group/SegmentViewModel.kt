package com.sdds.playground.sandbox.segment.vs.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.segement.SegmentItemIcon
import com.sdds.testing.vs.segement.SegmentOrientation
import com.sdds.testing.vs.segement.SegmentUiState

internal class SegmentViewModel(
    defaultState: SegmentUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SegmentUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        var stretch = currentState.stretch
        var counter = currentState.counter
        var icon = currentState.icon
        internalUiState.value = when (propertyName) {
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
            PropertyName.Icon -> currentState.copy(
                icon = when {
                    valueString == SegmentItemIcon.Start::class.simpleName -> SegmentItemIcon.Start
                    valueString == SegmentItemIcon.End::class.simpleName && counter -> {
                        counter = false
                        SegmentItemIcon.End
                    }
                    valueString == SegmentItemIcon.End::class.simpleName && !counter -> {
                        SegmentItemIcon.End
                    }
                    else -> SegmentItemIcon.No
                },
                counter = counter,
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
                if (SegmentOrientation.valueOf(valueString) == SegmentOrientation.VERTICAL) stretch = false
                currentState.copy(
                    orientation = SegmentOrientation.valueOf(valueString),
                    stretch = stretch,
                )
            }

            PropertyName.Counter -> {
                if (currentState.icon == SegmentItemIcon.End) icon = SegmentItemIcon.No
                counter = valueString.toBoolean()
                currentState.copy(counter = counter, icon = icon)
            }

            PropertyName.Count -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(count = valueString)
            } else {
                currentState
            }
        }
    }

    override fun SegmentUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
            Property.BooleanProperty(
                name = PropertyName.Counter.value,
                value = counter,
            ),
            Property.StringProperty(
                name = PropertyName.Count.value,
                value = count,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        Icon("icon"),
        Label("label"),
        Value("value"),
        Enabled("enabled"),
        Stretch("stretch"),
        Orientation("orientation"),
        Counter("counter"),
        Count("count"),
    }
}

internal class SegmentViewModelFactory(
    private val defaultState: SegmentUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
