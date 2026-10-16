package com.sdds.sandbox.ksp.internal

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ComponentIdValidationTest {
    @Test
    fun `unique and empty identifiers are valid`() {
        val errors = validateComponentIds(
            listOf(
                StoryDeclaration("a.ButtonStory", "BasicButton"),
                StoryDeclaration("a.CheckBoxStory", "CheckBox"),
                StoryDeclaration("a.TextStory", ""),
                StoryDeclaration("a.IconStory", ""),
            ),
        )

        assertEquals(emptyList(), errors)
    }

    @Test
    fun `duplicate identifier lists every story`() {
        val errors = validateComponentIds(
            listOf(
                StoryDeclaration("a.TabsStory", "Tabs"),
                StoryDeclaration("a.IconTabsStory", "Tabs"),
                StoryDeclaration("a.OtherStory", "Other"),
            ),
        )

        assertEquals(1, errors.size)
        val message = errors.single()
        assertTrue("Tabs" in message && "a.TabsStory" in message && "a.IconTabsStory" in message)
    }

    @Test
    fun `identifier with surrounding spaces is rejected`() {
        val errors = validateComponentIds(listOf(StoryDeclaration("a.ButtonStory", " BasicButton")))

        assertEquals(1, errors.size)
        assertTrue("a.ButtonStory" in errors.single())
    }

    @Test
    fun `empty identifiers never count as duplicates`() {
        val errors = validateComponentIds(
            listOf(StoryDeclaration("a.One", ""), StoryDeclaration("a.Two", ""), StoryDeclaration("a.Three", "  ")),
        )

        // Строка из пробелов считается незаданной по краям, но не дубликатом.
        assertEquals(1, errors.size)
        assertTrue("a.Three" in errors.single())
    }
}
