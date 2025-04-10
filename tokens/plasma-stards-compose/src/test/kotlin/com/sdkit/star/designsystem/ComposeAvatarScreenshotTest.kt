package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.avatar.AvatarGroupSizeS
import com.sdds.testing.compose.avatar.AvatarSizeM
import com.sdds.testing.compose.avatar.AvatarSizeXxl
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.Xxl
import com.sdkit.star.designsystem.styles.avatargroup.AvatarGroup
import com.sdkit.star.designsystem.styles.avatargroup.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeAvatarScreenshotTest : RoborazziConfigCompose("+night") {

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
