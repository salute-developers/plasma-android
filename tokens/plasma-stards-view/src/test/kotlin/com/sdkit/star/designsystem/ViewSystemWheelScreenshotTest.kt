package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.wheel.WheelTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemWheelScreenshotTest : WheelTestCases("+night") {

    @Test
    override fun testWheelH1MixedAlignLabelHasControlsWheelCount3() {
        themedComponent {
            wheelH1MixedAlignLabelHasControlsWheelCount3(
                style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1MixedAlign,
            )
        }
    }

    @Test
    override fun testWheelH1LeftAlignLabelHasInfiniteScrollWheelCount2Divider() {
        themedComponent {
            wheelH1LeftAlignLabelHasInfiniteScrollWheelCount2Divider(
                style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1LeftAlign,
            )
        }
    }

    @Test
    override fun testWheelCenterAlignDescriptionHasControlsWheelCount2Dots() {
        themedComponent {
            wheelCenterAlignDescriptionHasControlsWheelCount2Dots(
                style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1CenterAlign,
            )
        }
    }

    @Test
    override fun testwheelH1RightAlignLabelTAHasControlsWheelCount1() {
        themedComponent {
            wheelH1RightAlignLabelTAHasControlsWheelCount1(
                style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1RightAlign,
            )
        }
    }

    @Test
    override fun testWheelCenterAlignHasInfiniteScrollWheelCount4EntriesCount0() {
        themedComponent {
            margins {
                wheelCenterAlignHasInfiniteScrollWheelCount4EntriesCount0(
                    style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1CenterAlign,
                )
            }
        }
    }

    @Test
    override fun testWheelH1CenterAlignLabelsHasInfiniteScrollWheelCount3() {
        themedComponent {
            wheelH1CenterAlignLabelsHasInfiniteScrollWheelCount3(
                style = R.style.Sdkit_StarDs_ComponentOverlays_WheelH1CenterAlign,
            )
        }
    }
}
