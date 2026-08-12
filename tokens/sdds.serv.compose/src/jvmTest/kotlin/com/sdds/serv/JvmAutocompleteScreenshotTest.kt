package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteBottomStart
import com.sdds.compose.uikit.fixtures.testcases.AutoCompleteTopEnd
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.AutocompleteTight
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.Xl
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmAutocompleteScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2429
     */
    @Test
    fun testAutocompleteBottomStart() {
        content(capture = { captureLastRootRoboImage(it) }) {
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
        content(capture = { captureLastRootRoboImage(it) }) {
            AutoCompleteTopEnd(
                style = AutocompleteNormal.Xl.style(),
                initialShowDropdown = true,
            )
        }
    }
}
