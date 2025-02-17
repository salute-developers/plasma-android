package com.sdds.playground.sandbox.segment.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property

internal class SegmentItemViewModel(
    defaultState: SegmentUiState,
) : ComponentViewModel<SegmentUiState>(defaultState) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.segmentItem
    }

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
            PropertyName.Checked -> currentState.copy(checked = valueString.toBoolean())
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
                name = PropertyName.Checked.value,
                value = checked,
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
        Icon("icon"),
        Label("label"),
        Value("value"),
        Enabled("enabled"),
        Checked("checked"),
        Stretch("stretch"),
        Orientation("orientation"),
        Counter("counter"),
        Count("count"),
    }
}

internal class SegmentItemViewModelFactory(
    private val defaultState: SegmentUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SegmentItemViewModel(
            defaultState = defaultState,
        ) as T
    }
}
