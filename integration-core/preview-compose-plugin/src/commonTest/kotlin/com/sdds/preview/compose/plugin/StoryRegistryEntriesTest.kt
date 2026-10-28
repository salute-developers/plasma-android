package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.registerStories
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.StoryRegistry
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

/** Проверяет записи реестра историй, сгенерированные `sandbox-ksp` для реальных историй `uikit-compose-fixtures`. */
class StoryRegistryEntriesTest {
    @BeforeTest
    fun register() {
        StoryRegistry.clear()
        registerStories()
    }

    @Test
    fun `entries are unique and ordered by component id`() {
        val ids = StoryRegistry.previewEntries().map { it.componentId }

        assertTrue(ids.isNotEmpty())
        assertEquals(ids.distinct(), ids)
        assertEquals(ids.sorted(), ids)
    }

    @Test
    fun `entry uses the api meta name and exposes the style class`() {
        val entries = StoryRegistry.previewEntries().associateBy { it.componentId }

        val checkBox = assertNotNull(entries["CheckBox"])
        assertEquals("com.sdds.compose.uikit.CheckBoxStyle", checkBox.styleQualifiedName)
        // ComponentKey.CheckBox.value это "Checkbox": идентификатор preview берётся из меты, а не из ключа.
        assertEquals("Checkbox", ComponentKey.CheckBox.value)
        assertEquals(ComponentKey.CheckBox, checkBox.story.component)
        assertEquals("com.sdds.compose.uikit.ButtonStyle", entries.getValue("BasicButton").styleQualifiedName)
    }

    @Test
    fun `stories without component id stay in the registry but are not preview entries`() {
        val ids = StoryRegistry.previewEntries().map { it.componentId }.toSet()

        listOf("Icon", "IconTabs", "Mask", "Text").forEach { id ->
            assertTrue(id !in ids, "$id не должна участвовать в preview")
        }
        assertNotNull(StoryRegistry.get(ComponentKey.Text))
        assertNotNull(StoryRegistry.get(ComponentKey.IconTabs))
        assertNull(StoryRegistry.previewEntries().firstOrNull { it.story === StoryRegistry.get(ComponentKey.Text) })
    }

    @Test
    fun `bottom sheet story is registered under the api meta name of its style`() {
        val entry = assertNotNull(StoryRegistry.previewEntries().firstOrNull { it.componentId == "ModalBottomSheet" })

        assertEquals("com.sdds.compose.uikit.ModalBottomSheetStyle", entry.styleQualifiedName)
        assertEquals(ComponentKey.BottomSheet, entry.story.component)
    }

    @Test
    fun `item components have their own stories`() {
        val ids = StoryRegistry.previewEntries().map { it.componentId }.toSet()

        listOf(
            "AccordionItem", "DropdownEmptyState", "DropdownLoadingState", "IconTabItem", "ListItem",
            "NavigationDrawerItem", "SelectItem", "TabBarItem", "TabItem",
        ).forEach { id -> assertTrue(id in ids, "Нет истории для $id") }
    }

    @Test
    fun `all stories with a component id are registered`() {
        assertEquals(79, StoryRegistry.previewEntries().size)
    }
}
