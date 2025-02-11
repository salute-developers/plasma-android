package com.sdds.playground.sandbox.cell.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty

/**
 * ViewModel компонента Cell
 * @author Малышев Александр on 14.10.2024
 */
internal class CellParametersViewModel(
    defaultState: CellUiState,
) : ComponentViewModel<CellUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.cell
    }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = CellPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            CellPropertyName.Label -> currentState.copy(label = valueString)
            CellPropertyName.Title -> currentState.copy(title = valueString)
            CellPropertyName.Subtitle -> currentState.copy(subtitle = valueString)
            CellPropertyName.DisclosureText -> currentState.copy(disclosureText = valueString)
            CellPropertyName.HasDisclosure -> currentState.copy(hasDisclosure = valueString.toBoolean())
            CellPropertyName.StartContent -> currentState.copy(
                startContent = CellContent.valueOf(valueString),
            )

            CellPropertyName.EndContent -> currentState.copy(
                endContent = CellContent.valueOf(valueString),
            )

            else -> currentState
        }
    }

    override fun CellUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = CellPropertyName.Label.value,
                value = label,
            ),
            Property.StringProperty(
                name = CellPropertyName.Title.value,
                value = title,
            ),
            Property.StringProperty(
                name = CellPropertyName.Subtitle.value,
                value = subtitle,
            ),
            Property.StringProperty(
                name = CellPropertyName.DisclosureText.value,
                value = disclosureText,
            ),
            Property.BooleanProperty(
                name = CellPropertyName.HasDisclosure.value,
                value = hasDisclosure,
            ),
            enumProperty(
                name = CellPropertyName.StartContent.value,
                value = startContent,
            ),
            enumProperty(
                name = CellPropertyName.EndContent.value,
                value = endContent,
            ),
        )
    }

    private enum class CellPropertyName(val value: String) {
        Label("label"),
        Title("title"),
        Subtitle("subtitle"),
        DisclosureText("disclosureText"),
        HasDisclosure("hasDisclosure"),
        StartContent("startContent"),
        EndContent("endContent"),
    }
}

/**
 * Фабрика для [CellParametersViewModel]
 */
internal class CellParametersViewModelFactory(
    private val defaultState: CellUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CellParametersViewModel(defaultState) as T
    }
}
