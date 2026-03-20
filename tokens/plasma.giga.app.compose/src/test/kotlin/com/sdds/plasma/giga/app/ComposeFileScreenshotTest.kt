package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.FileCircularProgressHasImageEnd
import com.sdds.compose.uikit.fixtures.testcases.FileCircularProgressIsLoadingEndLongText
import com.sdds.compose.uikit.fixtures.testcases.FileCircularProgressIsLoadingHasImageNoDesc
import com.sdds.compose.uikit.fixtures.testcases.FileCircularProgressIsLoadingStart
import com.sdds.compose.uikit.fixtures.testcases.FileLinearProgressIsLoadingHasImageEnd
import com.sdds.compose.uikit.fixtures.testcases.FileLinearProgressIsLoadingStart
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.file.Default
import com.sdds.plasma.giga.app.styles.file.FileCircularProgress
import com.sdds.plasma.giga.app.styles.file.FileLinearProgress
import com.sdds.plasma.giga.app.styles.file.L
import com.sdds.plasma.giga.app.styles.file.M
import com.sdds.plasma.giga.app.styles.file.Negative
import com.sdds.plasma.giga.app.styles.file.S
import com.sdds.plasma.giga.app.styles.file.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeFileScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testFileCircularProgressLDefaultIsLoadingStart() {
        composeTestRule.content {
            FileCircularProgressIsLoadingStart(FileCircularProgress.L.Default.style())
        }
    }

    @Test
    fun testFileLinearProgressMNegativeIsLoadingHasImageEnd() {
        composeTestRule.content {
            FileLinearProgressIsLoadingHasImageEnd(FileLinearProgress.M.Negative.style())
        }
    }

    @Test
    fun testFileCircularProgressSDefaultHasImageEnd() {
        composeTestRule.content {
            FileCircularProgressHasImageEnd(FileCircularProgress.S.Default.style())
        }
    }

    @Test
    fun testFileLinearProgressXsNegativeIsLoadingStart() {
        composeTestRule.content {
            FileLinearProgressIsLoadingStart(FileLinearProgress.Xs.Negative.style())
        }
    }

    @Test
    fun testFileCircularProgressLNegativeIsLoadingEndLongText() {
        composeTestRule.content {
            FileCircularProgressIsLoadingEndLongText(FileCircularProgress.L.Negative.style())
        }
    }

    @Test
    fun testFileCircularProgressLDefaultIsLoadingHasImageNoDesc() {
        composeTestRule.content {
            FileCircularProgressIsLoadingHasImageNoDesc(FileCircularProgress.L.Default.style())
        }
    }
}
