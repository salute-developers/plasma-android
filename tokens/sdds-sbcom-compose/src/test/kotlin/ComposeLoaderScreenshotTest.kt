package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.LoaderForSandbox
import com.sdds.compose.uikit.fixtures.testcases.LoaderProgressWithIcon
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.loader.Loader
import com.sdds.sbcom.styles.loader.ModeColorAccent
import com.sdds.sbcom.styles.loader.ModeColorDanger
import com.sdds.sbcom.styles.loader.ModeColorGlobalWhite
import com.sdds.sbcom.styles.loader.ModeColorPrimary
import com.sdds.sbcom.styles.loader.ModeColorSecondary
import com.sdds.sbcom.styles.loader.Size16
import com.sdds.sbcom.styles.loader.Size24
import com.sdds.sbcom.styles.loader.Size32
import com.sdds.sbcom.styles.loader.Size40
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeLoaderScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testLoaderSpinnerSize40ModeColorPrimary() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Size40.ModeColorPrimary.style())
        }
    }

    @Test
    fun testLoaderSpinnerSize32ModeColorAccent() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Size32.ModeColorAccent.style())
        }
    }

    @Test
    fun testLoaderSpinnerSize24ModeColorDanger() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Size24.ModeColorDanger.style())
        }
    }

    @Test
    fun testLoaderSpinnerSize16ModeColorSecondary() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Size16.ModeColorSecondary.style())
        }
    }

    @Test
    fun testLoaderSpinnerSize40ModeColorGlobalWhite() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Size40.ModeColorGlobalWhite.style())
        }
    }

    @Test
    fun testLoaderProgressSize40ModeColorPrimary() {
        composeTestRule.content {
            LoaderProgressWithIcon(Loader.Size40.ModeColorPrimary.style())
        }
    }

    @Test
    fun testLoaderProgressSize32ModeColorAccent() {
        composeTestRule.content {
            LoaderProgressWithIcon(Loader.Size32.ModeColorAccent.style())
        }
    }

    @Test
    fun testLoaderProgressSize24ModeColorDanger() {
        composeTestRule.content {
            LoaderProgressWithIcon(Loader.Size24.ModeColorDanger.style())
        }
    }

    @Test
    fun testLoaderProgressSize16Secondary() {
        composeTestRule.content {
            LoaderProgressWithIcon(Loader.Size16.ModeColorSecondary.style())
        }
    }

    @Test
    fun testLoaderProgressSize40ModeColorGlobalWhite() {
        composeTestRule.content {
            LoaderProgressWithIcon(Loader.Size40.ModeColorGlobalWhite.style())
        }
    }
}
