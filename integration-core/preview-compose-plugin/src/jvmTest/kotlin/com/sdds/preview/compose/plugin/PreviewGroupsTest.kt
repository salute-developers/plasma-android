package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.sandbox.StoryRegistry
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PreviewGroupsTest {
    private val entries get() = StoryRegistry.previewEntries()

    @BeforeTest
    fun register() {
        StoryRegistry.clear()
        registerStories()
    }

    @Test
    fun `every component of the registry is in exactly one group`() {
        val grouped = previewComponentGroups(entries).flatMap { it.components }

        assertEquals(entries.map { it.componentId }.sorted(), grouped.sorted())
        assertEquals(grouped.distinct().size, grouped.size)
    }

    @Test
    fun `components follow the sandbox groups`() {
        val byComponent = previewComponentGroups(
            entries,
        ).flatMap { group -> group.components.map { it to group.name } }.toMap()

        assertEquals("Data Display", byComponent["CircularProgressBar"])
        assertEquals("Data Display", byComponent["ProgressBar"])
        assertEquals("Navigation", byComponent["DropdownMenu"])
        assertEquals("Data Entry", byComponent["BasicButton"])
        assertEquals("Overlay", byComponent["ModalBottomSheet"])
    }

    @Test
    fun `groups keep the sandbox order and components are sorted`() {
        val groups = previewComponentGroups(entries)

        assertEquals(
            entries.map {
                it.story.component.group
            }.distinct().sortedBy { it.ordinal }.map { it.displayName },
            groups.map { it.name },
        )
        assertTrue(groups.all { it.components == it.components.sorted() })
    }

    @Test
    fun `the manifest json lists groups with their components`() {
        val json = listOf(PreviewComponentGroup("Data Display", listOf("Avatar", "Badge"))).toManifestJson()

        assertTrue("\"name\": \"Data Display\"" in json)
        assertTrue("\"Avatar\"" in json && "\"Badge\"" in json)
    }
}
