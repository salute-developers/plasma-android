package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.segement.SegmentTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemSegmentScreenshotTest(
    theme: String,
) : SegmentTestCases(theme) {

    @Test
    override fun testSegmentSizeL() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeL(R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimary)
        }
    }

    @Test
    override fun testSegmentSizeMPilled() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeMPilled(R.style.Plasma_SdService_ComponentOverlays_SegmentMPrimaryPilled)
        }
    }

    @Test
    override fun testSegmentSizeS() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeS(R.style.Plasma_SdService_ComponentOverlays_SegmentSPrimary)
        }
    }

    @Test
    override fun testSegmentSizeXS() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeXS(R.style.Plasma_SdService_ComponentOverlays_SegmentXsPrimary)
        }
    }

    @Test
    override fun testSegmentOrientationVertical() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentOrientationVertical(R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimary)
        }
    }

    @Test
    override fun testSegmentDisabled() {
        themedComponent {
            segmentDisabled(R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimary)
        }
    }

    @Test
    override fun testSegmentSizeSStretch() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeSStretch(R.style.Plasma_SdService_ComponentOverlays_SegmentSPrimary)
        }
    }

    @Test
    override fun testSegmentSizeLCounter() {
        themedComponent(
            action = {
                onView(withId(0))
                    .perform(click())
            },
        ) {
            segmentSizeLCounter(R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimary)
        }
    }

    @Test
    override fun testSegmentItemSizeLPrimary() {
        themedComponent {
            segmentItemSizeLPrimary(R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimary)
        }
    }

    @Test
    override fun testSegmentItemSizeMSecondary() {
        themedComponent {
            segmentItemSizeMSecondary(R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MSecondaryPilled)
        }
    }

    @Test
    override fun testSegmentItemSizeSDefault() {
        themedComponent {
            segmentItemSizeSDefault(R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SDefault)
        }
    }

    @Test
    override fun testSegmentItemSizeXSPrimaryCounter() {
        themedComponent {
            segmentItemSizeXSPrimaryCounter(R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsPrimaryPilled)
        }
    }

    @Test
    override fun testSegmentItemDisabled() {
        themedComponent {
            segmentItemDisabled(R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimary)
        }
    }
}
