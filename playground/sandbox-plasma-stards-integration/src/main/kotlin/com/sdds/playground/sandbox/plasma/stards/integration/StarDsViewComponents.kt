package com.sdds.playground.sandbox.plasma.stards.integration

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.core.integration.component.ViewComponent
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.StarDsAvatarVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.group.StarDsAvatarGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeSolidVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeTransparentVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeSolidVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeTransparentVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.button.basic.StarDsBasicButtonVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.button.icon.StarDsIconButtonVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.card.vs.StarDsCardVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.cell.vs.StarDsCellVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.StarDsCheckBoxVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group.StarDsCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.chip.StarDsChipVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.chip.group.StarDsChipGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.circularprogress.StarDsCircularProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.counter.StarDsCounterVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.divider.StarDsDividerVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.dropdownmenu.StarDsDropdownMenuVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.indicator.StarDsIndicatorVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.list.StarDsListVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.navdrawer.StarDsNavDrawerVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.notification.StarDsNotificationCompactVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.notification.StarDsNotificationLooseVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.overlay.vs.StarDsOverlayVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.popover.vs.StarDsPopoverVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.progress.StarDsProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.StarDsRadioBoxVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group.StarDsRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.segment.StarDsSegmentVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.segment.item.StarDsSegmentItemVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.switcher.StarDsSwitchVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.StarDsTextAreaVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.StarDsTextFieldVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.tooltip.vs.StarDsTooltipVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.wheel.StarDsWheelVariationsView

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object StarDsViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                StarDsAvatarVariationsView,
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                StarDsAvatarGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                StarDsBasicButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                StarDsBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                StarDsBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                StarDsIconBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                StarDsIconBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey.IconButton,
                StarDsIconButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.Card,
                StarDsCardVariationsView,
            ),
            ViewComponent(
                ComponentKey.Cell,
                StarDsCellVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                StarDsCheckBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                StarDsCheckBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Chip,
                StarDsChipVariationsView,
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                StarDsChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Counter,
                StarDsCounterVariationsView,
            ),
            ViewComponent(
                ComponentKey.Divider,
                StarDsDividerVariationsView,
            ),
            ViewComponent(
                ComponentKey.DropdownMenu,
                StarDsDropdownMenuVariationsView,
            ),
            ViewComponent(
                ComponentKey.Flow,
                ViewStyleProvider.Empty,
            ),
            ViewComponent(
                ComponentKey.Indicator,
                StarDsIndicatorVariationsView,
            ),
            ViewComponent(
                ComponentKey.List,
                StarDsListVariationsView,
            ),
            ViewComponent(
                ComponentKey.NavigationDrawer,
                StarDsNavDrawerVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                StarDsNotificationCompactVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                StarDsNotificationLooseVariationsView,
            ),
            ViewComponent(
                ComponentKey.Overlay,
                StarDsOverlayVariationsView,
            ),
            ViewComponent(
                ComponentKey.Popover,
                StarDsPopoverVariationsView,
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                StarDsProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                StarDsCircularProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                StarDsRadioBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                StarDsRadioBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Switch,
                StarDsSwitchVariationsView,
            ),
            ViewComponent(
                ComponentKey.Segment,
                StarDsSegmentVariationsView,
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                StarDsSegmentItemVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextField,
                StarDsTextFieldVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextArea,
                StarDsTextAreaVariationsView,
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                StarDsTooltipVariationsView,
            ),
            ViewComponent(
                ComponentKey.Wheel,
                StarDsWheelVariationsView,
            ),
        ).associateBy { it.key }
}
