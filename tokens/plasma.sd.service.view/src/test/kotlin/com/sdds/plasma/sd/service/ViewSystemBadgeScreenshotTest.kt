package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.badge.BadgeTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemBadgeScreenshotTest(
    theme: String,
) : BadgeTestCases(theme) {

    @Test
    override fun testBadgeSizeLDefaultContentLeft() {
        themedComponent {
            badgeSizeLDefaultContentLeft(R.style.Plasma_SdService_ComponentOverlays_BadgeLDefault)
        }
    }

    @Test
    override fun testBadgeSizeMAccentContentRight() {
        themedComponent {
            badgeSizeMAccentContentRight(R.style.Plasma_SdService_ComponentOverlays_BadgeMAccent)
        }
    }

    @Test
    override fun testBadgeSizeSPositivePilled() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeSPilledPositive)
        }
    }

    @Test
    override fun testBadgeSizeXsWarning() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeXsWarning)
        }
    }

    @Test
    override fun testBadgeSizeLNegative() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeLNegative)
        }
    }

    @Test
    override fun testBadgeSizeMDark() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeMBlack)
        }
    }

    @Test
    override fun testBadgeSizeSLight() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeSWhite)
        }
    }

    @Test
    override fun testBadgeSizeLDefaultClear() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeClearLDefault)
        }
    }

    @Test
    override fun testBadgeSizeLDefaultTransparent() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeTransparentLDefault)
        }
    }

    @Test
    override fun testBadgeSizeMNegativeClear() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeClearMNegative)
        }
    }

    @Test
    override fun testBadgeSizeSWarningPilledTransparent() {
        themedComponent {
            badgeCommon(R.style.Plasma_SdService_ComponentOverlays_BadgeTransparentSPilledWarning)
        }
    }

    @Test
    override fun testIconBadgeSizeLDefault() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeLDefault)
        }
    }

    @Test
    override fun testIconBadgeSizeMAccentPilled() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeMPilledAccent)
        }
    }

    @Test
    override fun testIconBadgeSizeSPositiveClear() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeClearSPositive)
        }
    }

    @Test
    override fun testIconBadgeSizeXsWarningTransparent() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeTransparentXsWarning)
        }
    }

    @Test
    override fun testIconBadgeSizeLNegative() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeLNegative)
        }
    }

    @Test
    override fun testIconBadgeSizeMBlack() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeMBlack)
        }
    }

    @Test
    override fun testIconBadgeSizeSWhite() {
        themedComponent {
            iconBadgeCommon(R.style.Plasma_SdService_ComponentOverlays_IconBadgeSWhite)
        }
    }
}
