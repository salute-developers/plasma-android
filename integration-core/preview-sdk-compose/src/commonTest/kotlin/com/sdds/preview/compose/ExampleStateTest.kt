package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewExample
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.Property
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.UiState
import kotlinx.serialization.json.JsonPrimitive
import kotlin.test.Test
import kotlin.test.assertEquals

class ExampleStateTest {
    @Test
    fun `known props update while incompatible and unknown preserve defaults`() {
        val example =
            PreviewExample(
                "default",
                mapOf("label" to JsonPrimitive("new"), "enabled" to JsonPrimitive("bad"), "other" to JsonPrimitive(1)),
            )
        val result = example.applyToState(State(), producer, transformer)
        assertEquals(State(label = "new", enabled = true), result)
    }

    private data class State(val label: String = "old", val enabled: Boolean = true) : UiState {
        override val variant: String = ""
        override val appearance: String = ""
        override fun updateVariant(appearance: String, variant: String): UiState = this
    }

    private val producer = object : PropertiesProducer<State> {
        override fun getProperties(state: State): List<Property<*>> = listOf(
            Property.StringProperty("label", state.label),
            Property.BooleanProperty("enabled", state.enabled),
        )
    }
    private val transformer = object : StateTransformer<State> {
        override fun transform(state: State, name: String, value: Any): State = when (name) {
            "label" -> state.copy(label = value.toString())
            "enabled" -> state.copy(enabled = value as Boolean)
            else -> state
        }
    }
}
