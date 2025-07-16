package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.image.ImageTestCase
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.image.Image
import com.sdkit.star.designsystem.styles.image.Ratio16x9
import com.sdkit.star.designsystem.styles.image.Ratio1x1
import com.sdkit.star.designsystem.styles.image.Ratio1x2
import com.sdkit.star.designsystem.styles.image.Ratio2x1
import com.sdkit.star.designsystem.styles.image.Ratio3x4
import com.sdkit.star.designsystem.styles.image.Ratio4x3
import com.sdkit.star.designsystem.styles.image.Ratio9x16
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeImageScreenshotTest : RoborazziConfigCompose("+night") {

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
