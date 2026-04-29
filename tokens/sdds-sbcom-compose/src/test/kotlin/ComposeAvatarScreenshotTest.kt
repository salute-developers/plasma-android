package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AvatarContent
import com.sdds.compose.uikit.fixtures.testcases.AvatarGroupSizeS
import com.sdds.compose.uikit.fixtures.testcases.AvatarIconBadge
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.Size24
import com.sdds.sbcom.styles.avatar.Size32
import com.sdds.sbcom.styles.avatar.Size36
import com.sdds.sbcom.styles.avatar.Size40
import com.sdds.sbcom.styles.avatar.Size44
import com.sdds.sbcom.styles.avatar.Size56
import com.sdds.sbcom.styles.avatar.Size64
import com.sdds.sbcom.styles.avatar.Size72
import com.sdds.sbcom.styles.avatargroup.AvatarGroup
import com.sdds.sbcom.styles.avatargroup.Size24
import com.sdds.sbcom.styles.iconbadge.Size20
import com.sdds.sbcom.styles.iconbadge.VoiceChatBadge
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
    fun testAvatarSize72() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size72.style())
        }
    }

    @Test
    fun testAvatarSize64() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size64.style())
        }
    }

    @Test
    fun testAvatarSize56() {
        composeTestRule.content {
            AvatarIconBadge(
                style = Avatar.Size56.style(),
                iconBadgeStyle = VoiceChatBadge.Size20.style(),
            )
        }
    }

    @Test
    fun testAvatarSize44() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size44.style())
        }
    }

    @Test
    fun testAvatarSize40() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size40.style())
        }
    }

    @Test
    fun testAvatarSize36() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size36.style())
        }
    }

    @Test
    fun testAvatarSize32() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size32.style())
        }
    }

    @Test
    fun testAvatarSize24() {
        composeTestRule.content {
            AvatarContent(style = Avatar.Size24.style())
        }
    }

    @Test
    fun testAvatarGroupSize24() {
        composeTestRule.content {
            AvatarGroupSizeS(style = AvatarGroup.Size24.style())
        }
    }
}
