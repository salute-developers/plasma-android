package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.image.ImageTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemImageScreenshotTest : ImageTestCases("+night") {

    @Test
    override fun testImageRatio1x1() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_1_1)
        }
    }

    @Test
    override fun testImageRatio3x4() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_3_4)
        }
    }

    @Test
    override fun testImageRatio4x3() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_4_3)
        }
    }

    @Test
    override fun testImageRatio9x16() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_9_16)
        }
    }

    @Test
    override fun testImageRatio16x9() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_16_9)
        }
    }

    @Test
    override fun testImageRatio1x2() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_1_2)
        }
    }

    @Test
    override fun testImageRatio2x1() {
        themedComponent {
            imageTest(R.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_2_1)
        }
    }
}
