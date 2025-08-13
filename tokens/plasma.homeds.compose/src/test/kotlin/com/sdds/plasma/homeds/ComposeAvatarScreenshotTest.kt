package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatar.Pilled
import com.sdds.plasma.homeds.styles.avatar.Xxl
import com.sdds.plasma.homeds.styles.avatargroup.AvatarGroup
import com.sdds.plasma.homeds.styles.avatargroup.S
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

    /**
     * Запуск скриншот тестов
     */
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
    fun testAvatarSizeMPilled() {
        composeTestRule.content {
            AvatarSizeM(style = Avatar.M.Pilled.style())
        }
    }

    @Test
    fun testAvatarGroupSizeS() {
        composeTestRule.content {
            AvatarGroupSizeS(style = AvatarGroup.S.style())
        }
    }
}
