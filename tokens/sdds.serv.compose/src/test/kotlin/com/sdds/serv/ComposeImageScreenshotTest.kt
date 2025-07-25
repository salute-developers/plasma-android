package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.image.Image
import com.sdds.serv.styles.image.Ratio16x9
import com.sdds.serv.styles.image.Ratio1x1
import com.sdds.serv.styles.image.Ratio1x2
import com.sdds.serv.styles.image.Ratio2x1
import com.sdds.serv.styles.image.Ratio3x4
import com.sdds.serv.styles.image.Ratio4x3
import com.sdds.serv.styles.image.Ratio9x16
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.image.ImageTestCase
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeImageScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testImageRatio1x1() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio1x1.style())
        }
    }

    @Test
    fun testImageRatio3x4() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio3x4.style())
        }
    }

    @Test
    fun testImageRatio4x3() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio4x3.style())
        }
    }

    @Test
    fun testImageRatio9x16() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio9x16.style())
        }
    }

    @Test
    fun testImageRatio16x9() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio16x9.style())
        }
    }

    @Test
    fun testImageRatio1x2() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio1x2.style())
        }
    }

    @Test
    fun testImageRatio2x1() {
        composeTestRule.content {
            ImageTestCase(style = Image.Ratio2x1.style())
        }
    }
}
