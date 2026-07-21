package com.sdds.compose.sandbox.internal

import kotlin.test.Test
import kotlin.test.assertEquals

class SandboxBackDispatcherTest {

    @Test
    fun propertyEditorConsumesFirstBackAndRouteConsumesNextBack() {
        val events = mutableListOf<String>()
        val dispatcher = SandboxBackDispatcher()
        val unregisterEditor = dispatcher.register { events += "editor" }

        dispatcher.handleBack { events += "route" }
        unregisterEditor()
        dispatcher.handleBack { events += "route" }

        assertEquals(listOf("editor", "route"), events)
    }

    @Test
    fun routeFallbackRunsWithoutNestedHandlers() {
        val events = mutableListOf<String>()
        val dispatcher = SandboxBackDispatcher()

        dispatcher.handleBack { events += "route" }

        assertEquals(listOf("route"), events)
    }
}
