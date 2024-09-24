package com.sdds.plugin.themebuilder.internal.config

import com.sdds.plugin.themebuilder.ViewParentListBuilder
import com.sdds.plugin.themebuilder.ViewThemeParent
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
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
        underTest.materialComponentsTheme("DarkActionBar")
        underTest.materialComponentsTheme("NoActionBar")
        underTest.materialComponentsTheme("Bridge")
        underTest.appCompatTheme()
        underTest.appCompatTheme("NoDialog")
        underTest.customTheme("App.Theme.Custom")

        assertEquals(validData, underTest.themeParents)
    }

    @Test
    fun `ViewParentListBuilder не позволяет использовать суффикс Light для material`() {
        val result = runCatching {
            underTest.materialComponentsTheme("Light")
        }
        assertTrue(result.exceptionOrNull() is ThemeBuilderException)
    }

    @Test
    fun `ViewParentListBuilder не позволяет использовать суффикс DayNight для material`() {
        val result = runCatching {
            underTest.materialComponentsTheme("DayNight")
        }
        assertTrue(result.exceptionOrNull() is ThemeBuilderException)
    }

    @Test
    fun `ViewParentListBuilder не позволяет использовать суффикс Light для appcompat`() {
        val result = runCatching {
            underTest.appCompatTheme("Light")
        }
        assertTrue(result.exceptionOrNull() is ThemeBuilderException)
    }

    @Test
    fun `ViewParentListBuilder не позволяет использовать суффикс DayNight для appcompat`() {
        val result = runCatching {
            underTest.appCompatTheme("DayNight")
        }
        assertTrue(result.exceptionOrNull() is ThemeBuilderException)
    }

    private companion object {
        val validData = setOf(
            ViewThemeParent(
                themePrefix = "Theme.MaterialComponents",
                childSuffix = "MaterialComponents",
            ),
            ViewThemeParent(
                themePrefix = "Theme.MaterialComponents",
                themeSuffix = "DarkActionBar",
                childSuffix = "MaterialComponents.DarkActionBar",
            ),
            ViewThemeParent(
                themePrefix = "Theme.MaterialComponents",
                themeSuffix = "NoActionBar",
                childSuffix = "MaterialComponents.NoActionBar",
            ),
            ViewThemeParent(
                themePrefix = "Theme.MaterialComponents",
                themeSuffix = "Bridge",
                childSuffix = "MaterialComponents.Bridge",
            ),
            ViewThemeParent(
                themePrefix = "Theme.AppCompat",
                childSuffix = "AppCompat",
            ),
            ViewThemeParent(
                themePrefix = "Theme.AppCompat",
                themeSuffix = "NoDialog",
                childSuffix = "AppCompat.NoDialog",
            ),
            ViewThemeParent(
                themePrefix = "App.Theme.Custom",
                childSuffix = "App.Theme.Custom",
            ),
        )
    }
}
