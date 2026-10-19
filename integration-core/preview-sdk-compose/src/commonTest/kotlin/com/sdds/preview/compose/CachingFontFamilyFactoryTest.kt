package com.sdds.preview.compose

import androidx.compose.ui.text.font.FontFamily
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class CachingFontFamilyFactoryTest {
    private var created = 0
    private val factory = CachingLoadedFontFamilyFactory { FontFamily.Default.also { created += 1 } }

    private fun face(
        identity: String = "font",
        bytes: ByteArray = byteArrayOf(1, 2, 3),
        weight: Int = 400,
        italic: Boolean = false,
    ) = LoadedFontFace(identity, bytes, weight, italic)

    @Test
    fun `the same faces build the family once`() {
        val first = factory.create(listOf(face(), face("bold", weight = 700)))
        val second = factory.create(listOf(face(), face("bold", weight = 700)))

        assertSame(first, second)
        assertEquals(1, created)
    }

    @Test
    fun `a different weight, style or content builds a new family`() {
        factory.create(listOf(face()))
        factory.create(listOf(face(weight = 700)))
        factory.create(listOf(face(italic = true)))
        factory.create(listOf(face(bytes = byteArrayOf(9, 9))))

        assertEquals(4, created)
    }

    @Test
    fun `a different set of faces builds a new family`() {
        factory.create(listOf(face()))
        factory.create(listOf(face(), face("bold", weight = 700)))

        assertEquals(2, created)
    }
}
