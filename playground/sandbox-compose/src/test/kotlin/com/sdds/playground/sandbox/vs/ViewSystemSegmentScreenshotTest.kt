package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.segment.vs.SegmentItemIcon
import com.sdds.playground.sandbox.segment.vs.SegmentItemVariant
import com.sdds.playground.sandbox.segment.vs.SegmentOrientation
import com.sdds.playground.sandbox.segment.vs.SegmentUiState
import com.sdds.playground.sandbox.segment.vs.SegmentVariant
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
) : RoborazziConfig(theme) {

    @Test
    fun testSegmentSizeL() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentL,
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.segment))
            .captureRoboImage()
    }

    @Test
    fun testSegmentSizeMPilled() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentMPilled,
                amount = 3,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "Value",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.segment))
            .captureRoboImage()
    }

    @Test
    fun testSegmentSizeS() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentS,
                amount = 3,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.segment))
            .captureRoboImage()
    }

    @Test
    fun testSegmentSizeXS() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentXs,
                amount = 3,
                icon = SegmentItemIcon.End,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.segment))
            .captureRoboImage()
    }

    @Test
    fun testSegmentOrientationVertical() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentL,
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.VERTICAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testSegmentDisabled() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentL,
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = false,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(R.id.component_container))
            .captureRoboImage()
    }

    @Test
    fun testSegmentSizeSStretch() {
        launchScreen(
            R.id.nav_segment,
            SegmentUiState(
                variant = SegmentVariant.SegmentS,
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = true,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.segment))
            .captureRoboImage()
    }

    @Test
    fun testSegmentItemSizeLDefault() {
        launchScreen(
            R.id.nav_segment_item,
            SegmentUiState(
                variant = SegmentItemVariant.SegmentItemLDefault,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
            ),
        )
        onView(withId(R.id.segment_item))
            .captureRoboImage()
    }

    @Test
    fun testSegmentItemSizeMSecondary() {
        launchScreen(
            R.id.nav_segment_item,
            SegmentUiState(
                variant = SegmentItemVariant.SegmentItemMSecondaryPilled,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "Value",
                enabled = true,
            ),
        )
        onView(withId(R.id.segment_item))
            .captureRoboImage()
    }

    @Test
    fun testSegmentItemSizeSClear() {
        launchScreen(
            R.id.nav_segment_item,
            SegmentUiState(
                variant = SegmentItemVariant.SegmentItemSClear,
                icon = SegmentItemIcon.End,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
            ),
        )
        onView(withId(R.id.segment_item))
            .captureRoboImage()
    }

    @Test
    fun testSegmentItemSizeXSDefaultPilled() {
        launchScreen(
            R.id.nav_segment_item,
            SegmentUiState(
                variant = SegmentItemVariant.SegmentItemXsDefaultPilled,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "Value",
                enabled = true,
            ),
        )
        onView(withId(R.id.segment_item))
            .captureRoboImage()
    }

    @Test
    fun testSegmentItemDisabled() {
        launchScreen(
            R.id.nav_segment_item,
            SegmentUiState(
                variant = SegmentItemVariant.SegmentItemLDefault,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = false,
            ),
        )
        onView(withId(R.id.segment_item))
            .captureRoboImage()
    }
}
