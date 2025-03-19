package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radiobox.S
import com.sdds.serv.styles.radiobox.group.M
import com.sdds.serv.styles.radiobox.group.RadioBoxGroup
import com.sdds.serv.styles.radiobox.group.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.radiobox.RadioBoxDisabled
import com.sdds.testing.compose.radiobox.RadioBoxGroupSizeM
import com.sdds.testing.compose.radiobox.RadioBoxGroupSizeMDescription
import com.sdds.testing.compose.radiobox.RadioBoxGroupSizeS
import com.sdds.testing.compose.radiobox.RadioBoxGroupSizeSLabel
import com.sdds.testing.compose.radiobox.RadioBoxSizeM
import com.sdds.testing.compose.radiobox.RadioBoxSizeMNoDescription
import com.sdds.testing.compose.radiobox.RadioBoxSizeS
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeRadioBoxScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testRadioBoxSizeM() {
        composeTestRule.content {
            RadioBoxSizeM(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxSizeS() {
        composeTestRule.content {
            RadioBoxSizeS(style = RadioBox.S.style())
        }
    }

    @Test
    fun testRadioBoxSizeMNoDescription() {
        composeTestRule.content {
            RadioBoxSizeMNoDescription(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxDisabled() {
        composeTestRule.content {
            RadioBoxDisabled(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        composeTestRule.content {
            RadioBoxGroupSizeM(style = RadioBoxGroup.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        composeTestRule.content {
            RadioBoxGroupSizeS(style = RadioBoxGroup.S.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeMDescription() {
        composeTestRule.content {
            RadioBoxGroupSizeMDescription(style = RadioBoxGroup.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeSLabel() {
        composeTestRule.content {
            RadioBoxGroupSizeSLabel(style = RadioBoxGroup.S.style())
        }
    }
}
