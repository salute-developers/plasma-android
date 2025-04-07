package com.sdds.testing.vs.avatar

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Avatar
import com.sdds.uikit.AvatarGroup

/**
 * Тест-кейсы для [Avatar] и [AvatarGroup]
 * @author Малышев Александр on 13.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class AvatarTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testAvatarSizeXXL()
    abstract fun testAvatarSizeL()
    abstract fun testAvatarSizeM()
    abstract fun testAvatarSizeS()
    abstract fun testAvatarGroupSizeS()

    fun ComponentScope.avatarSizeXXL(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
            ),
        )

    fun ComponentScope.avatarSizeL(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Remote,
                fullName = "Michael Scott",
            ),
        )

    fun ComponentScope.avatarSizeM(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Placeholder,
                fullName = "Michael Scott",
            ),
        )

    fun ComponentScope.avatarSizeS(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.INACTIVE,
                exampleMode = ExampleMode.Remote,
                fullName = "Michael Scott",
            ),
        )

    fun ComponentScope.avatarGroupSizeS(style: Int): AvatarGroup =
        avatarGroup(
            context,
            style,
            AvatarUiState(
                fullName = "Michael Scott",
                threshold = 1,
            ),
        )
}
