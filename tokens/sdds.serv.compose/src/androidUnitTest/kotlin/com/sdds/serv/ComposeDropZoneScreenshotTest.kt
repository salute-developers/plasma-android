package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.DropZoneDisabled
import com.sdds.compose.uikit.fixtures.testcases.DropZoneDraggingOver
import com.sdds.compose.uikit.fixtures.testcases.DropZoneIconPlacementStart
import com.sdds.compose.uikit.fixtures.testcases.DropZoneIconPlacementTop
import com.sdds.compose.uikit.fixtures.testcases.DropZoneNoDescriptionIconPlacementTop
import com.sdds.compose.uikit.fixtures.testcases.DropZoneNoTitleIconPlacementStart
import com.sdds.compose.uikit.fixtures.testcases.DropZoneNoTitleNoDescriptionIconPlacementStart
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.dropzone.Default
import com.sdds.serv.styles.dropzone.DropZone
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDropZoneScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testDropZoneIconPlacementTop() {
        composeTestRule.content {
            DropZoneIconPlacementTop(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneNoTitleIconPlacementStart() {
        composeTestRule.content {
            DropZoneNoTitleIconPlacementStart(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneNoDescriptionIconPlacementTop() {
        composeTestRule.content {
            DropZoneNoDescriptionIconPlacementTop(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneNoTitleNoDescriptionIconPlacementStart() {
        composeTestRule.content {
            DropZoneNoTitleNoDescriptionIconPlacementStart(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneDisabled() {
        composeTestRule.content {
            DropZoneDisabled(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneIconPlacementStart() {
        composeTestRule.content {
            DropZoneIconPlacementStart(DropZone.Default.style())
        }
    }

    @Test
    fun testDropZoneDraggingOver() {
        composeTestRule.content {
            DropZoneDraggingOver(DropZone.Default.style())
        }
    }
}
