package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.skeleton.TextSkeletonTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemTextSkeletonScreenshotTest : TextSkeletonTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonBodyL() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonBodyM() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonBodyS() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonBodyXs() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyXs)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonBodyXxs() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyXxs)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonDisplayL() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonDisplayL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonDisplayM() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonDisplayM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonDisplayS() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonDisplayS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testTextSkeletonH1() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH1)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonH2() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH2)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonH3() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH3)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonH4() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH4)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonH5() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH5)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonTextL() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextL)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonTextM() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextM)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonTextS() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextS)
        }
        captureScreenRoboImage()
    }

    @Test
    fun testTextSkeletonTextXs() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            textSkeletonLineCountThreeNoTextRandom(R.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextXs)
        }
        captureScreenRoboImage()
    }

    @Ignore("Not for StarDS")
    override fun testTextSkeletonDefaultNoTextRandom() {
        TODO("Not yet implemented")
    }

    @Ignore("Not for StarDS")
    override fun testTextSkeletonDefaultFullWidth() {
        TODO("Not yet implemented")
    }

    @Ignore("Not for StarDS")
    override fun testTextSkeletonLighterNoTextRandom() {
        TODO("Not yet implemented")
    }

    @Ignore("Not for StarDS")
    override fun testTextSkeleton() {
        TODO("Not yet implemented")
    }
}
