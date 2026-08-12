package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteBottomStart
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.AutocompleteTight
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.Xl
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
abstract class IosMobileAutocompleteScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2429
     */
    @Test
    fun testAutocompleteBottomStart() {
        content(
            testMethod = ::testAutocompleteBottomStart,
            capture = { captureLastRootRoboImage(it) },
        ) {
            AutoCompleteBottomStart(
                style = AutocompleteTight.M.style(),
                initialShowDropdown = true,
            )
        }
    }

    /**
     * PLASMA-T2433
     */
    @Test
    fun testAutocompleteTopEnd() {
        content(
            testMethod = ::testAutocompleteTopEnd,
            capture = { captureLastRootRoboImage(it) },
        ) {
            AutoCompleteTopEnd(
                style = AutocompleteNormal.Xl.style(),
                initialShowDropdown = true,
            )
        }
    }
}

class IosMobileAutocompleteScreenshotTestLight : IosMobileAutocompleteScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileAutocompleteScreenshotTestDark : IosMobileAutocompleteScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
