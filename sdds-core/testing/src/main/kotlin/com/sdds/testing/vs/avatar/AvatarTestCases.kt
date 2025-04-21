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
    abstract fun testAvatarSizeXXLCounterTopStart()
    abstract fun testAvatarSizeLCounterTopEnd()
    abstract fun testAvatarSizeMCounterBottomEnd()
    abstract fun testAvatarSizeSCounterBottomStart()
    abstract fun testAvatarSizeXXLBadgeTopStart()
    abstract fun testAvatarSizeXXLBadgeBottomEnd()
    abstract fun testAvatarSizeLBadgeTopEnd()
    abstract fun testAvatarSizeMBadgeBottomStart()

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

    fun ComponentScope.avatarSizeXXLCounterTopStart(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Placeholder,
                fullName = "Michael Scott",
                extra = AvatarExtra.Counter,
                extraPlacement = AvatarExtraPlacement.TOP_START,
                counterText = "1",
            ),
        )

    fun ComponentScope.avatarSizeLCounterTopEnd(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                extra = AvatarExtra.Counter,
                extraPlacement = AvatarExtraPlacement.TOP_END,
                counterText = "123",
            ),
        )

    fun ComponentScope.avatarSizeMCounterBottomEnd(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                extra = AvatarExtra.Counter,
                extraPlacement = AvatarExtraPlacement.BOTTOM_END,
                counterText = "1",
            ),
        )

    fun ComponentScope.avatarSizeSCounterBottomStart(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Placeholder,
                fullName = "Michael Scott",
                extra = AvatarExtra.Counter,
                extraPlacement = AvatarExtraPlacement.BOTTOM_START,
                counterText = "1",
            ),
        )

    fun ComponentScope.avatarSizeXXLBadgeTopStart(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                extra = AvatarExtra.Badge,
                badgeText = "Label",
                badgeContentStart = true,
                badgeContentEnd = false,
                extraPlacement = AvatarExtraPlacement.TOP_START,
            ),
        )

    fun ComponentScope.avatarSizeXXLBadgeBottomEnd(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                extra = AvatarExtra.Badge,
                badgeText = "Label",
                badgeContentStart = false,
                badgeContentEnd = true,
                extraPlacement = AvatarExtraPlacement.BOTTOM_END,
            ),
        )

    fun ComponentScope.avatarSizeLBadgeTopEnd(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.ACTIVE,
                exampleMode = ExampleMode.Placeholder,
                fullName = "Michael Scott",
                extra = AvatarExtra.Badge,
                badgeText = "",
                badgeContentStart = true,
                badgeContentEnd = false,
                extraPlacement = AvatarExtraPlacement.TOP_END,
            ),
        )

    fun ComponentScope.avatarSizeMBadgeBottomStart(style: Int): Avatar =
        avatar(
            context,
            style,
            AvatarUiState(
                status = Avatar.Status.NONE,
                exampleMode = ExampleMode.Local,
                fullName = "Michael Scott",
                extra = AvatarExtra.Badge,
                badgeText = "Label",
                badgeContentStart = false,
                badgeContentEnd = false,
                extraPlacement = AvatarExtraPlacement.BOTTOM_START,
            ),
        )
}
