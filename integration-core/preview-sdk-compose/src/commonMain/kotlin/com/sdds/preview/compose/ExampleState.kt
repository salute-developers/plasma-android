package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewExample
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.Property
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.UiState
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.floatOrNull
import kotlinx.serialization.json.intOrNull

/**
 * Применяет совместимые example props через существующие sandbox contracts.
 * Неизвестные или несовместимые значения сохраняют соответствующий default state.
 */
public fun <State : UiState> PreviewExample.applyToState(
    defaultState: State,
    propertiesProducer: PropertiesProducer<State>,
    stateTransformer: StateTransformer<State>,
): State {
    val known = propertiesProducer.getProperties(defaultState).associateBy { it.name }
    return props.entries.fold(defaultState) { state, (name, element) ->
        val property = known[name] ?: return@fold state
        val primitive = element as? JsonPrimitive ?: return@fold state
        val value: Any = when (property) {
            is Property.BooleanProperty -> primitive.booleanOrNull
            is Property.IntProperty -> primitive.intOrNull
            is Property.FloatProperty -> primitive.floatOrNull
            is Property.StringProperty -> primitive.content
            is Property.SingleChoiceProperty -> primitive.content.takeIf { it in property.variants }
        } ?: return@fold state
        runCatching { stateTransformer.transform(state, name, value) }.getOrDefault(state)
    }
}
