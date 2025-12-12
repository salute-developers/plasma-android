package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileCircularProgress
import com.sdds.serv.styles.file.FileLinearProgress
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.file.FileCircularProgressHasImageEnd
import com.sdds.testing.compose.file.FileCircularProgressIsLoadingEndLongText
import com.sdds.testing.compose.file.FileCircularProgressIsLoadingHasImageNoDesc
import com.sdds.testing.compose.file.FileCircularProgressIsLoadingStart
import com.sdds.testing.compose.file.FileLinearProgressIsLoadingHasImageEnd
import com.sdds.testing.compose.file.FileLinearProgressIsLoadingStart
import com.sdds.testing.vs.SDK_NUMBER
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
