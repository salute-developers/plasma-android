package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.previewComponentsFrom
import com.sdds.sandbox.StoryEntry
import com.sdds.sandbox.StoryRegistry
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class PreviewComponentsFromTest {
    @BeforeTest
    fun register() {
        StoryRegistry.clear()
        registerStories()
    }

    private val entries get() = StoryRegistry.previewEntries()
    private val factories = GeneratedPreviewStyleFactories.all

    @Test
    fun `every registry entry becomes a component with its api meta id`() {
        val components = previewComponentsFrom(entries, factories)

        assertEquals(entries.map { it.componentId }, components.map { it.componentId })
        assertTrue(components.any { it.componentId == "CheckBox" })
    }

    @Test
    fun `entry without a factory is skipped instead of failing`() {
        val orphan = entries.first().copy(componentId = "NoSuchComponent")

        val components = previewComponentsFrom(entries + orphan, factories)

        assertEquals(entries.size, components.size)
    }

    @Test
    fun `style class of the story must match the style class of the factory`() {
        val wrong = StoryEntry("CheckBox", entries.first { it.componentId == "CheckBox" }.story, "ui.WrongStyle")

        val error = assertFailsWith<IllegalStateException> { previewComponentsFrom(listOf(wrong), factories) }

        assertTrue("CheckBox" in error.message.orEmpty() && "ui.WrongStyle" in error.message.orEmpty())
    }

    @Test
    fun `entry whose style class was not resolved is rejected`() {
        val unresolved = entries.first { it.componentId == "CheckBox" }.copy(styleQualifiedName = "")

        assertFailsWith<IllegalStateException> { previewComponentsFrom(listOf(unresolved), factories) }
    }
}
