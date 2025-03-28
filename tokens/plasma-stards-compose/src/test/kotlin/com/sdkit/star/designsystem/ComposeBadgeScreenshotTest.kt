package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.badge.BadgeCommon
import com.sdds.testing.compose.badge.BadgeSizeLDefaultContentLeft
import com.sdds.testing.compose.badge.BadgeSizeMAccentContentRight
import com.sdds.testing.compose.badge.IconBadgeCommon
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.badge.Accent
import com.sdkit.star.designsystem.styles.badge.BadgeSolid
import com.sdkit.star.designsystem.styles.badge.BadgeTransparent
import com.sdkit.star.designsystem.styles.badge.Dark
import com.sdkit.star.designsystem.styles.badge.Default
import com.sdkit.star.designsystem.styles.badge.L
import com.sdkit.star.designsystem.styles.badge.Light
import com.sdkit.star.designsystem.styles.badge.M
import com.sdkit.star.designsystem.styles.badge.Negative
import com.sdkit.star.designsystem.styles.badge.Pilled
import com.sdkit.star.designsystem.styles.badge.Positive
import com.sdkit.star.designsystem.styles.badge.S
import com.sdkit.star.designsystem.styles.badge.Warning
import com.sdkit.star.designsystem.styles.badge.Xs
import com.sdkit.star.designsystem.styles.badge.icon.Accent
import com.sdkit.star.designsystem.styles.badge.icon.Dark
import com.sdkit.star.designsystem.styles.badge.icon.Default
import com.sdkit.star.designsystem.styles.badge.icon.IconBadgeSolid
import com.sdkit.star.designsystem.styles.badge.icon.IconBadgeTransparent
import com.sdkit.star.designsystem.styles.badge.icon.L
import com.sdkit.star.designsystem.styles.badge.icon.M
import com.sdkit.star.designsystem.styles.badge.icon.Negative
import com.sdkit.star.designsystem.styles.badge.icon.Pilled
import com.sdkit.star.designsystem.styles.badge.icon.Warning
import com.sdkit.star.designsystem.styles.badge.icon.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeBadgeScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testBadgeSizeLDefaultContentLeft() {
        composeTestRule.content {
            BadgeSizeLDefaultContentLeft(style = BadgeSolid.L.Default.style())
        }
    }

    @Test
    fun testBadgeSizeMAccentContentRight() {
        composeTestRule.content {
            BadgeSizeMAccentContentRight(style = BadgeSolid.M.Accent.style())
        }
    }

    @Test
    fun testBadgeSizeSPositivePilled() {
        composeTestRule.content {
            BadgeCommon(style = BadgeSolid.S.Pilled.Positive.style())
        }
    }

    @Test
    fun testBadgeSizeXsWarning() {
        composeTestRule.content {
            BadgeCommon(style = BadgeSolid.Xs.Warning.style())
        }
    }

    @Test
    fun testBadgeSizeLNegative() {
        composeTestRule.content {
            BadgeCommon(style = BadgeSolid.L.Negative.style())
        }
    }

    @Test
    fun testBadgeSizeMDark() {
        composeTestRule.content {
            BadgeCommon(style = BadgeSolid.M.Dark.style())
        }
    }

    @Test
    fun testBadgeSizeSLight() {
        composeTestRule.content {
            BadgeCommon(style = BadgeSolid.S.Light.style())
        }
    }

    @Test
    fun testBadgeSizeLDefaultTransparent() {
        composeTestRule.content {
            BadgeCommon(style = BadgeTransparent.L.Default.style())
        }
    }

    @Test
    fun testBadgeSizeSWarningTransparentPilled() {
        composeTestRule.content {
            BadgeCommon(style = BadgeTransparent.S.Pilled.Warning.style())
        }
    }

    @Test
    fun testIconBadgeSizeLDefault() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeSolid.L.Default.style())
        }
    }

    @Test
    fun testIconBadgeSizeMAccentPilled() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeSolid.M.Pilled.Accent.style())
        }
    }

    @Test
    fun testIconBadgeSizeXsWarningTransparent() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeTransparent.Xs.Warning.style())
        }
    }

    @Test
    fun testIconBadgeSizeLNegative() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeSolid.L.Negative.style())
        }
    }

    @Test
    fun testIconBadgeSizeMBlack() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeSolid.M.Dark.style())
        }
    }
}
