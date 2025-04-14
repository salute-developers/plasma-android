package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.avatar.Avatar
import com.sdds.serv.styles.avatar.L
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.avatar.Xxl
import com.sdds.serv.styles.avatargroup.AvatarGroup
import com.sdds.serv.styles.avatargroup.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.avatar.AvatarGroupSizeS
import com.sdds.testing.compose.avatar.AvatarSizeLBadgeTopEndContentStart
import com.sdds.testing.compose.avatar.AvatarSizeLCounterTopEnd
import com.sdds.testing.compose.avatar.AvatarSizeM
import com.sdds.testing.compose.avatar.AvatarSizeMBadgeBottomStart
import com.sdds.testing.compose.avatar.AvatarSizeMCounterBottomEnd
import com.sdds.testing.compose.avatar.AvatarSizeSCounterBottomStart
import com.sdds.testing.compose.avatar.AvatarSizeXxl
import com.sdds.testing.compose.avatar.AvatarSizeXxlBadgeBottomEndContentEnd
import com.sdds.testing.compose.avatar.AvatarSizeXxlBadgeTopStartContentStart
import com.sdds.testing.compose.avatar.AvatarSizeXxlCounterTopStart
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
    fun testAvatarGroupSizeS() {
        composeTestRule.content {
            AvatarGroupSizeS(style = AvatarGroup.S.style())
        }
    }

    @Test
    fun testAvatarSizeXxlCounterTopStart() {
        composeTestRule.content {
            AvatarSizeXxlCounterTopStart(style = Avatar.Xxl.style())
        }
    }

    @Test
    fun testAvatarSizeLCounterTopEnd() {
        composeTestRule.content {
            AvatarSizeLCounterTopEnd(style = Avatar.L.style())
        }
    }

    @Test
    fun testAvatarSizeMCounterBottomEnd() {
        composeTestRule.content {
            AvatarSizeMCounterBottomEnd(style = Avatar.M.style())
        }
    }

    @Test
    fun testAvatarSizeSCounterBottomStart() {
        composeTestRule.content {
            AvatarSizeSCounterBottomStart(style = Avatar.S.style())
        }
    }

    @Test
    fun testAvatarSizeXxlBadgeTopStartContentStart() {
        composeTestRule.content {
            AvatarSizeXxlBadgeTopStartContentStart(style = Avatar.Xxl.style())
        }
    }

    @Test
    fun testAvatarSizeXxlBadgeBottomEndContentEnd() {
        composeTestRule.content {
            AvatarSizeXxlBadgeBottomEndContentEnd(style = Avatar.Xxl.style())
        }
    }

    @Test
    fun testAvatarSizeLBadgeTopEndContentStart() {
        composeTestRule.content {
            AvatarSizeLBadgeTopEndContentStart(style = Avatar.L.style())
        }
    }

    @Test
    fun testAvatarSizeMBadgeBottomStart() {
        composeTestRule.content {
            AvatarSizeMBadgeBottomStart(style = Avatar.M.style())
        }
    }
}
