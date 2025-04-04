package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.giga.app.styles.avatar.Avatar
import com.sdds.plasma.giga.app.styles.avatar.AvatarGroup
import com.sdds.plasma.giga.app.styles.avatar.M
import com.sdds.plasma.giga.app.styles.avatar.S
import com.sdds.plasma.giga.app.styles.avatar.Xxl
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.avatar.AvatarGroupSizeS
import com.sdds.testing.compose.avatar.AvatarSizeM
import com.sdds.testing.compose.avatar.AvatarSizeXxl
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAvatarScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAvatarSizeXxl() {
        composeTestRule.content {
            AvatarSizeXxl(style = Avatar.Xxl.style())
        }
    }

    @Test
    fun testAvatarSizeM() {
        composeTestRule.content {
            AvatarSizeM(style = Avatar.M.style())
        }
    }

    @Test
    fun testAvatarGroupSizeS() {
        composeTestRule.content {
            AvatarGroupSizeS(style = AvatarGroup.S.style())
        }
    }
}
