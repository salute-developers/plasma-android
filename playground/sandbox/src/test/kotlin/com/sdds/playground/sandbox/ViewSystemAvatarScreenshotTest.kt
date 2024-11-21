package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.avatar.AvatarUiState
import com.sdds.playground.sandbox.avatar.AvatarVariant
import com.sdds.playground.sandbox.avatar.ExampleMode
import com.sdds.uikit.Avatar
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
) : RoborazziConfig(theme) {

    @Test
    fun testAvatarSizeXXL() {
        launchScreen(
            R.id.nav_avatar,
            AvatarUiState(
                variant = AvatarVariant.AvatarXXL,
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                actionEnabled = false,
            ),
        )
        onView(withId(R.id.avatar))
            .captureRoboImage()
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    fun testAvatarSizeL() {
        launchScreen(
            R.id.nav_avatar,
            AvatarUiState(
                variant = AvatarVariant.AvatarL,
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Remote,
                fullName = "Michael Scott",
                actionEnabled = true,
            ),
        )
        onView(withId(R.id.avatar))
            .captureRoboImage()
    }

    @Test
    fun testAvatarSizeM() {
        launchScreen(
            R.id.nav_avatar,
            AvatarUiState(
                variant = AvatarVariant.AvatarM,
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Placeholder,
                fullName = "Michael Scott",
                actionEnabled = false,
            ),
        )
        onView(withId(R.id.avatar))
            .captureRoboImage()
    }

    @Ignore("Avatar picture does not downloads before taking screenshot")
    @Test
    fun testAvatarSizeS() {
        launchScreen(
            R.id.nav_avatar,
            AvatarUiState(
                variant = AvatarVariant.AvatarS,
                status = Avatar.Status.INACTIVE,
                exampleMode = ExampleMode.Remote,
                fullName = "Michael Scott",
                actionEnabled = false,
            ),
        )
        onView(withId(R.id.avatar))
            .captureRoboImage()
    }

    @Test
    fun testAvatarGroupSizeS() {
        launchScreen(
            R.id.nav_avatargroup,
            AvatarUiState(
                variant = AvatarVariant.AvatarS,
                fullName = "Michael Scott",
                threshold = 1,
            ),
        )
        onView(withId(R.id.avatar_group))
            .captureRoboImage()
    }
}
