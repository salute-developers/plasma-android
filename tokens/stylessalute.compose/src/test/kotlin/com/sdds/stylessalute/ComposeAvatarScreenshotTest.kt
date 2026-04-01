package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AvatarGroupSizeS
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeLBadgeTopEndContentStart
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeLCounterTopEnd
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeM
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeMBadgeBottomStart
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeMCounterBottomEnd
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeSCounterBottomStart
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeXxl
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeXxlBadgeBottomEndContentEnd
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeXxlBadgeTopStartContentStart
import com.sdds.compose.uikit.fixtures.testcases.AvatarSizeXxlCounterTopStart
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.avatar.Avatar
import com.sdds.stylessalute.styles.avatar.L
import com.sdds.stylessalute.styles.avatar.M
import com.sdds.stylessalute.styles.avatar.S
import com.sdds.stylessalute.styles.avatar.Xxl
import com.sdds.stylessalute.styles.avatargroup.AvatarGroup
import com.sdds.stylessalute.styles.avatargroup.S
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
