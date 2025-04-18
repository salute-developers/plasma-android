package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.badge.Accent
import com.sdds.plasma.sd.service.styles.badge.BadgeClear
import com.sdds.plasma.sd.service.styles.badge.BadgeSolid
import com.sdds.plasma.sd.service.styles.badge.BadgeTransparent
import com.sdds.plasma.sd.service.styles.badge.Dark
import com.sdds.plasma.sd.service.styles.badge.Default
import com.sdds.plasma.sd.service.styles.badge.L
import com.sdds.plasma.sd.service.styles.badge.Light
import com.sdds.plasma.sd.service.styles.badge.M
import com.sdds.plasma.sd.service.styles.badge.Negative
import com.sdds.plasma.sd.service.styles.badge.Pilled
import com.sdds.plasma.sd.service.styles.badge.Positive
import com.sdds.plasma.sd.service.styles.badge.S
import com.sdds.plasma.sd.service.styles.badge.Warning
import com.sdds.plasma.sd.service.styles.badge.Xs
import com.sdds.plasma.sd.service.styles.iconbadge.Accent
import com.sdds.plasma.sd.service.styles.iconbadge.Dark
import com.sdds.plasma.sd.service.styles.iconbadge.Default
import com.sdds.plasma.sd.service.styles.iconbadge.IconBadgeClear
import com.sdds.plasma.sd.service.styles.iconbadge.IconBadgeSolid
import com.sdds.plasma.sd.service.styles.iconbadge.IconBadgeTransparent
import com.sdds.plasma.sd.service.styles.iconbadge.L
import com.sdds.plasma.sd.service.styles.iconbadge.M
import com.sdds.plasma.sd.service.styles.iconbadge.Negative
import com.sdds.plasma.sd.service.styles.iconbadge.Pilled
import com.sdds.plasma.sd.service.styles.iconbadge.Positive
import com.sdds.plasma.sd.service.styles.iconbadge.S
import com.sdds.plasma.sd.service.styles.iconbadge.Warning
import com.sdds.plasma.sd.service.styles.iconbadge.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.badge.BadgeCommon
import com.sdds.testing.compose.badge.BadgeSizeLDefaultContentLeft
import com.sdds.testing.compose.badge.BadgeSizeMAccentContentRight
import com.sdds.testing.compose.badge.IconBadgeCommon
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeBadgeScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

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
    fun testBadgeSizeLDefaultClear() {
        composeTestRule.content {
            BadgeCommon(style = BadgeClear.L.Default.style())
        }
    }

    @Test
    fun testBadgeSizeLDefaultTransparent() {
        composeTestRule.content {
            BadgeCommon(style = BadgeTransparent.L.Default.style())
        }
    }

    @Test
    fun testBadgeSizeMNegativeClear() {
        composeTestRule.content {
            BadgeCommon(style = BadgeClear.M.Negative.style())
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
    fun testIconBadgeSizeSPositiveClear() {
        composeTestRule.content {
            IconBadgeCommon(style = IconBadgeClear.S.Positive.style())
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
