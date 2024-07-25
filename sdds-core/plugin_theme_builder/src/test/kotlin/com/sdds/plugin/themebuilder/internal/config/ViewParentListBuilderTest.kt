package com.sdds.plugin.themebuilder.internal.config

import com.sdds.plugin.themebuilder.ViewParentListBuilder
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.ViewThemeType
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

/**
 * Unit-тесты [ViewParentListBuilder]
 */
class ViewParentListBuilderTest {

    private lateinit var underTest: ViewParentListBuilder

    @Before
    fun setup() {
        underTest = ViewParentListBuilder()
    }

    @Test
    fun `ViewParentListBuilder должен выбросить исключение`() {
        assertThrows(ThemeBuilderException::class.java) {
            underTest.customTheme("")
        }
    }

    @Test
    fun `ViewParentListBuilder должен вернуть корректный сет`() {
        underTest.materialComponentsTheme()
        underTest.materialComponentsTheme("DayNight.DarkActionBar")
        underTest.materialComponentsTheme("NoActionBar")
        underTest.materialComponentsTheme("Light.Bridge")
        underTest.appCompatTheme()
        underTest.appCompatTheme("Light")
        underTest.appCompatTheme("Light.NoDialog")
        underTest.customTheme("App.Theme.Custom")

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
                fullName = "Theme.MaterialComponents.DayNight.DarkActionBar",
                childSuffix = "MaterialComponents.DayNight.DarkActionBar",
                themeType = ViewThemeType.DARK_LIGHT,
            ),
            ViewThemeParent(
                fullName = "Theme.MaterialComponents.NoActionBar",
                childSuffix = "MaterialComponents.NoActionBar",
                themeType = ViewThemeType.DARK,
            ),
            ViewThemeParent(
                fullName = "Theme.MaterialComponents.Light.Bridge",
                childSuffix = "MaterialComponents.Light.Bridge",
                themeType = ViewThemeType.LIGHT,
            ),
            ViewThemeParent(
                fullName = "Theme.AppCompat",
                childSuffix = "AppCompat",
                themeType = ViewThemeType.DARK,
            ),
            ViewThemeParent(
                fullName = "Theme.AppCompat.Light",
                childSuffix = "AppCompat.Light",
                themeType = ViewThemeType.LIGHT,
            ),
            ViewThemeParent(
                fullName = "Theme.AppCompat.Light.NoDialog",
                childSuffix = "AppCompat.Light.NoDialog",
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
