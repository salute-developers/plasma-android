@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.serv

import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.ScreenshotCaptureRoot
import com.sdds.compose.uikit.fixtures.content
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteBottomStart
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.AutocompleteTight
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.Xl
import kotlin.test.Test

internal class ComposeAutocompleteKmpScreenshotTest : RoborazziConfigCompose(
    screenshotTheme = SddsServScreenshotTheme,
) {

    /**
     * PLASMA-T2429
     */
    @Test
    fun testAutocompleteBottomStart() {
        content(::testAutocompleteBottomStart, captureRoot = ScreenshotCaptureRoot.Last) {
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
        content(::testAutocompleteTopEnd, captureRoot = ScreenshotCaptureRoot.Last) {
            AutoCompleteTopEnd(
                style = AutocompleteNormal.Xl.style(),
                initialShowDropdown = true,
            )
        }
    }
}
