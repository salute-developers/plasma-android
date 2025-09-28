package com.sdds.playground.sandbox.plasma.homeds.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.homeds.integration.avatar.PlasmaHomeDsAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.avatar.group.PlasmaHomeDsAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.PlasmaHomeDsBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.PlasmaHomeDsBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.PlasmaHomeDsBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.icon.PlasmaHomeDsIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.icon.PlasmaHomeDsIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.badge.icon.PlasmaHomeDsIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.button.basic.PlasmaHomeDsBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.button.icon.PlasmaHomeDsIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.cell.PlasmaHomeDsCellVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.checkbox.PlasmaHomeDsCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.checkbox.group.PlasmaHomeDsCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.chip.PlasmaHomeDsChipVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.chip.group.PlasmaHomeDsChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.chip.group.PlasmaHomeDsChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.counter.PlasmaHomeDsCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.divider.PlasmaHomeDsDividerVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.indicator.PlasmaHomeDsIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.radiobox.PlasmaHomeDsRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.radiobox.group.PlasmaHomeDsRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.switcher.PlasmaHomeDsSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.tabbar.PlasmaHomeDsTabBarVariationsCompose
import com.sdds.playground.sandbox.plasma.homeds.integration.wheel.PlasmaHomeDsWheelVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaHomeDsComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                PlasmaHomeDsAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                PlasmaHomeDsAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaHomeDsBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaHomeDsBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaHomeDsBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaHomeDsIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaHomeDsIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaHomeDsIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                PlasmaHomeDsBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                PlasmaHomeDsIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                PlasmaHomeDsDividerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                PlasmaHomeDsCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                PlasmaHomeDsCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaHomeDsCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                PlasmaHomeDsChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaHomeDsChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaHomeDsChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                PlasmaHomeDsCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                PlasmaHomeDsIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                PlasmaHomeDsRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaHomeDsRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                PlasmaHomeDsSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                PlasmaHomeDsTabBarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Wheel,
                PlasmaHomeDsWheelVariationsCompose,
            ),
        ).associateBy { it.key }
}
