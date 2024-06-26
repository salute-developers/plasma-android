package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit тесты [ResourceReferenceProvider]
 * @author Малышев Александр on 15.03.2024
 */
class ResourceReferenceProviderTest {

    private lateinit var underTest: ResourceReferenceProvider

    @Before
    fun setUp() {
        underTest = ResourceReferenceProvider("thmbldr", "TestTheme")
    }

    @Test
    fun `ResourceReferenceProvider возвращает ссылку на dimen`() {
        val dimenData = mockk<DimenData>(relaxed = true) {
            every { name } returns "text_size"
        }

        assertEquals("@dimen/thmbldr_text_size", underTest.dimen(dimenData))
        assertEquals("@dimen/thmbldr_item_size", underTest.dimen("item_size"))
    }

    @Test
    fun `ResourceReferenceProvider возвращает ссылку на style`() {
        assertEquals("@style/TestTheme.Typography", underTest.style("Typography"))
    }

    @Test
    fun `ResourceReferenceProvider возвращает ссылку на font`() {
        assertEquals("@font/thmbldr_display", underTest.font("display"))
    }

    @Test
    fun `ResourceReferenceProvider возвращает ссылку на color`() {
        assertEquals("@color/thmbldr_dark_text_primary", underTest.color("dark_text_primary"))
    }
}
