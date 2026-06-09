package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderCenterStartEndButton
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderLongTitleSubtitleDividerCenter
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderNoTitleEndButton
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderTitleAlignmentEndStartEndButton
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderTitleHasDividerStartButton
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderTitleSubtitleCenter
import com.sdds.compose.uikit.fixtures.testcases.AiHeaderTitleSubtitleStartHasStartEndButton
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.aiheader.AiHeader
import com.sdds.serv.styles.aiheader.Clear
import com.sdds.serv.styles.aiheader.Default
import com.sdds.serv.styles.aiheader.H2
import com.sdds.serv.styles.aiheader.H3
import com.sdds.serv.styles.aiheader.H4
import com.sdds.serv.styles.aiheader.H5
import com.sdds.serv.styles.aiheader.L
import com.sdds.serv.styles.aiheader.M
import com.sdds.serv.styles.aiheader.S
import com.sdds.serv.styles.aiheader.Secondary
import com.sdds.serv.styles.aiheader.Xl
import com.sdds.serv.styles.aiheader.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAiHeaderScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAiHeaderXlDefaultTitleSubtitleStartHasStartEndButton() {
        composeTestRule.content {
            AiHeaderTitleSubtitleStartHasStartEndButton(AiHeader.Xl.Default.style())
        }
    }

    @Test
    fun testAiHeaderLSecondaryTitleSubtitleCenter() {
        composeTestRule.content {
            AiHeaderTitleSubtitleCenter(AiHeader.L.Secondary.style())
        }
    }

    @Test
    fun testAiHeaderMClearTitleHasDividerStartButton() {
        composeTestRule.content {
            AiHeaderTitleHasDividerStartButton(AiHeader.M.Clear.style())
        }
    }

    @Test
    fun testAiHeaderSDefaultNoTitleEndButton() {
        composeTestRule.content {
            AiHeaderNoTitleEndButton(AiHeader.S.Default.style())
        }
    }

    @Test
    fun testAiHeaderLongTitleSubtitleDividerCenter() {
        composeTestRule.content {
            AiHeaderLongTitleSubtitleDividerCenter(AiHeader.Xs.Secondary.style())
        }
    }

    @Test
    fun testAiHeaderH5ClearTitleAlignmentEndStartEndButton() {
        composeTestRule.content {
            AiHeaderTitleAlignmentEndStartEndButton(AiHeader.H5.Clear.style())
        }
    }

    @Test
    fun testAiHeaderH4DefaultTitleSubtitleStartHasStartEndButton() {
        composeTestRule.content {
            AiHeaderTitleSubtitleStartHasStartEndButton(AiHeader.H4.Default.style())
        }
    }

    @Test
    fun testAiHeaderH3DefaultCenterStartEndButton() {
        composeTestRule.content {
            AiHeaderCenterStartEndButton(AiHeader.H3.Default.style())
        }
    }

    @Test
    fun testAiHeaderH2DefaultTitleAlignmentEndStartEndButton() {
        composeTestRule.content {
            AiHeaderTitleAlignmentEndStartEndButton(AiHeader.H2.Default.style())
        }
    }
}
