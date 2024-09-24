package com.sdds.plugin.themebuilder.internal.config

import com.sdds.plugin.themebuilder.ViewConfigBuilder
import com.sdds.plugin.themebuilder.ViewThemeParent
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit-тесты [ViewConfigBuilder]
 */
class ViewConfigBuilderTest {

    private lateinit var underTest: ViewConfigBuilder

    @Before
    fun setup() {
        underTest = ViewConfigBuilder()
    }

    @Test
    fun `ViewConfigBuilder должен вернуть пустой сет`() {
        underTest.themeParents {}
        assertEquals(emptySet<ViewThemeParent>(), underTest.themeParents)
    }

    @Test
    fun `ViewConfigBuilder должен вернуть корректный сет`() {
        underTest.themeParents {
            materialComponentsTheme()
            appCompatTheme("NoActionBar")
            customTheme("App.Theme.Custom")
        }
        assertEquals(validData, underTest.themeParents)
    }

    private companion object {
        val validData = setOf(
            ViewThemeParent(
                themePrefix = "Theme.MaterialComponents",
                childSuffix = "MaterialComponents",
            ),
            ViewThemeParent(
                themePrefix = "Theme.AppCompat",
                themeSuffix = "NoActionBar",
                childSuffix = "AppCompat.NoActionBar",
            ),
            ViewThemeParent(
                themePrefix = "App.Theme.Custom",
                childSuffix = "App.Theme.Custom",
            ),
        )
    }
}
