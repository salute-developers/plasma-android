package com.sdds.playground.sandbox.textfield.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.mask.MaskUiState
import com.sdds.testing.vs.mask.TextFieldMask
import com.sdds.testing.vs.mask.TextFieldMaskDisplayMode
import com.sdds.uikit.TextField

/**
 * [ViewModel] компонента [TextField] с маской
 */
internal class MaskViewModel(
    defaultState: MaskUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<MaskUiState>(defaultState, componentKey) {

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = MaskPropertyName.values().find { it.value == name }
        when (pName) {
            MaskPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            MaskPropertyName.Placeholder -> updatePlaceholder(value?.toString().orEmpty())
            MaskPropertyName.Icon -> updateStartIcon(value as Boolean)
            MaskPropertyName.Action -> updateEndIcon(value as Boolean)
            MaskPropertyName.Enabled -> updateEnabledState(value as Boolean)
            MaskPropertyName.ReadOnly -> updateReadOnlyState(value as Boolean)
            MaskPropertyName.Prefix -> updatePrefix(value?.toString())
            MaskPropertyName.Suffix -> updateSuffix(value?.toString())
            MaskPropertyName.Mask -> updateMask(value?.toString())
            MaskPropertyName.MaskDisplayMode -> updateMaskDisplayMode(value?.toString())
            else -> Unit
        }
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(
            labelText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholderText = text,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateReadOnlyState(readonly: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            readOnly = readonly,
        )
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            icon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            action = hasIcon,
        )
    }

    private fun updatePrefix(prefix: String?) {
        internalUiState.value = internalUiState.value.copy(
            prefix = prefix,
        )
    }

    private fun updateSuffix(suffix: String?) {
        internalUiState.value = internalUiState.value.copy(
            suffix = suffix?.takeIf { it.isNotBlank() },
        )
    }

    private fun updateMask(mask: String?) {
        internalUiState.value = internalUiState.value.copy(
            mask = mask?.let { TextFieldMask.valueOf(it) } ?: TextFieldMask.PHONE,
        )
    }

    private fun updateMaskDisplayMode(mask: String?) {
        internalUiState.value = internalUiState.value.copy(
            maskDisplayMode = mask?.let { TextFieldMaskDisplayMode.valueOf(it) }
                ?: TextFieldMaskDisplayMode.ALWAYS,
        )
    }

    @Suppress("LongMethod")
    override fun MaskUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = MaskPropertyName.Mask.value,
                value = mask,
            ),
            enumProperty(
                name = MaskPropertyName.MaskDisplayMode.value,
                value = maskDisplayMode,
            ),
            Property.StringProperty(
                name = MaskPropertyName.Label.value,
                value = labelText,
            ),
            Property.StringProperty(
                name = MaskPropertyName.Placeholder.value,
                value = placeholderText,
            ),
            Property.StringProperty(
                name = MaskPropertyName.Prefix.value,
                value = prefix.orEmpty(),
            ),
            Property.StringProperty(
                name = MaskPropertyName.Suffix.value,
                value = suffix.orEmpty(),
            ),
            Property.BooleanProperty(
                name = MaskPropertyName.Icon.value,
                value = icon,
            ),
            Property.BooleanProperty(
                name = MaskPropertyName.Action.value,
                value = action,
            ),
            Property.BooleanProperty(
                name = MaskPropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = MaskPropertyName.ReadOnly.value,
                value = readOnly,
            ),
        )
    }

    private enum class MaskPropertyName(val value: String) {
        Label("label"),
        Placeholder("placeholder"),
        Icon("icon"),
        Action("action"),
        Enabled("enabled"),
        ReadOnly("read only"),
        HasChips("has chips"),
        Prefix("prefix"),
        Suffix("suffix"),
        Mask("mask"),
        MaskDisplayMode("maskDisplayMode"),
    }
}

/**
 * Фабрика для [TextFieldViewModel]
 */
internal class MaskViewModelFactory(
    private val defaultState: MaskUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MaskViewModel(defaultState, componentKey) as T
    }
}
