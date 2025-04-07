package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.avatar.AvatarTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemAvatarScreenshotTest(
    theme: String,
) : AvatarTestCases(theme) {

    @Test
    override fun testAvatarSizeXXL() {
        themedComponent {
            avatarSizeXXL(R.style.Salute_StylesSalute_ComponentOverlays_AvatarXxl)
        }
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    override fun testAvatarSizeL() {
        themedComponent {
            avatarSizeL(R.style.Salute_StylesSalute_ComponentOverlays_AvatarL)
        }
    }

    @Test
    override fun testAvatarSizeM() {
        themedComponent {
            avatarSizeM(R.style.Salute_StylesSalute_ComponentOverlays_AvatarM)
        }
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    override fun testAvatarSizeS() {
        themedComponent {
            avatarSizeS(R.style.Salute_StylesSalute_ComponentOverlays_AvatarS)
        }
    }

    @Test
    override fun testAvatarGroupSizeS() {
        themedComponent {
            avatarGroupSizeS(R.style.Salute_StylesSalute_ComponentOverlays_AvatarGroupS)
        }
    }
}
