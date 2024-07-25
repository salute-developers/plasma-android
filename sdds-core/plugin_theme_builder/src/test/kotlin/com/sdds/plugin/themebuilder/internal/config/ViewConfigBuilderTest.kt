package com.sdds.plugin.themebuilder.internal.config

import com.sdds.plugin.themebuilder.ViewConfigBuilder
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.ViewThemeType
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
            appCompatTheme("Light")
            customTheme("App.Theme.Custom")
        }
        assertEquals(validData, underTest.themeParents)
    }

    private companion object {
        val validData = setOf(
            ViewThemeParent(
                fullName = "Theme.MaterialComponents",
                childSuffix = "MaterialComponents",
                themeType = ViewThemeType.DARK,
            ),
            ViewThemeParent(
                fullName = "Theme.AppCompat.Light",
                childSuffix = "AppCompat.Light",
                themeType = ViewThemeType.LIGHT,
            ),
            ViewThemeParent(
                fullName = "App.Theme.Custom",
                childSuffix = "App.Theme.Custom",
                themeType = ViewThemeType.DARK_LIGHT,
            ),
        )
    }
}
