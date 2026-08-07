package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.ToastPilledPositiveCenterEndHasContentStartEndKmp
import com.sdds.compose.uikit.fixtures.kmp.testcases.ToastRoundedDefaultBottomStartHasContentEndKmp
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmToastScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2041
     */
    @Test
    fun testToastPilledPositiveCenterEndHasContentStartEnd() {
        content {
            ToastPilledPositiveCenterEndHasContentStartEndKmp(
                Toast.Pilled.Positive.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2042
     */
    @Test
    fun testToastRoundedDefaultBottomStartHasContentEnd() {
        content {
            ToastRoundedDefaultBottomStartHasContentEndKmp(
                Toast.Rounded.Default.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}
