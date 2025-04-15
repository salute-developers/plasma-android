package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.avatar.AvatarTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemAvatarScreenshotTest : AvatarTestCases("+night") {

    @Test
    override fun testAvatarSizeXXL() {
        themedComponent {
            avatarSizeXXL(R.style.Sdkit_StarDs_ComponentOverlays_AvatarXxl)
        }
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    override fun testAvatarSizeL() {
        themedComponent {
            avatarSizeL(R.style.Sdkit_StarDs_ComponentOverlays_AvatarL)
        }
    }

    @Test
    override fun testAvatarSizeM() {
        themedComponent {
            avatarSizeM(R.style.Sdkit_StarDs_ComponentOverlays_AvatarM)
        }
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    override fun testAvatarSizeS() {
        themedComponent {
            avatarSizeS(R.style.Sdkit_StarDs_ComponentOverlays_AvatarS)
        }
    }

    @Test
    override fun testAvatarGroupSizeS() {
        themedComponent {
            avatarGroupSizeS(R.style.Sdkit_StarDs_ComponentOverlays_AvatarGroupS)
        }
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeXXLCounterTopStart() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeLCounterTopEnd() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeMCounterBottomEnd() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeSCounterBottomStart() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeXXLBadgeTopStart() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeXXLBadgeBottomEnd() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeLBadgeTopEnd() {
    }

    @Ignore("Not yet implemented")
    override fun testAvatarSizeMBadgeBottomStart() {
    }
}
