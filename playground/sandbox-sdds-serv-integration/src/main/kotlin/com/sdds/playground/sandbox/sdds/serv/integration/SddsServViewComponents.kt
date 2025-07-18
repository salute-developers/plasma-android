package com.sdds.playground.sandbox.sdds.serv.integration

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.core.integration.component.ViewComponent
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.SddsServAvatarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.group.SddsServAvatarGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeClearVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeSolidVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeTransparentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeClearVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeSolidVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeTransparentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.basic.SddsServBasicButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.icon.SddsServIconButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.link.SddsServLinkButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.card.vs.SddsServCardClearVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.card.vs.SddsServCardSolidVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.cell.vs.SddsServCellVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.SddsServCheckBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group.SddsServCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServChipVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServEmbeddedChipVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServEmbeddedChipGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.circularprogress.SddsServCircularProgressBarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.counter.SddsServCounterVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.divider.vs.SddsServDividerVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.dropdownmenu.SddsServDropdownMenuNormalVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.dropdownmenu.SddsServDropdownMenuTightVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.image.SddsServImageVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.indicator.vs.SddsServIndicatorVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.list.SddsServListNormalVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.list.SddsServListTightVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.modal.SddsServModalVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.notification.SddsServNotificationCompactVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.notification.SddsServNotificationLooseVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.overlay.vs.SddsServOverlayVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.popover.vs.SddsServPopoverVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.progress.SddsServProgressBarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.SddsServRadioBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group.SddsServRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.rectskeleton.SddsServRectSkeletonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.SddsServSegmentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.item.SddsServSegmentItemVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.spinner.SddsServSpinnerVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.switcher.SddsServSwitchVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.SddsServTextAreaVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.SddsServTextFieldVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textskeleton.SddsServTextSkeletonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.toast.SddsServToastVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.tooltip.vs.SddsServTooltipVariationsView

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object SddsServViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                SddsServAvatarVariationsView,
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                SddsServAvatarGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                SddsServBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                SddsServBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                SddsServBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                SddsServIconBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                SddsServIconBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                SddsServIconBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                SddsServBasicButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.IconButton,
                SddsServIconButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                SddsServLinkButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                SddsServCardSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                SddsServCardClearVariationsView,
            ),
            ViewComponent(
                ComponentKey.Cell,
                SddsServCellVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                SddsServCheckBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                SddsServCheckBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Chip,
                SddsServChipVariationsView,
            ),
            ViewComponent(
                ComponentKey("ChipEmbedded", CoreComponent.CHIP),
                SddsServEmbeddedChipVariationsView,
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                SddsServChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("ChipGroupEmbedded", CoreComponent.CHIP_GROUP),
                SddsServEmbeddedChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Counter,
                SddsServCounterVariationsView,
            ),
            ViewComponent(
                ComponentKey.Divider,
                SddsServDividerVariationsView,
            ),
            ViewComponent(
                ComponentKey("DropdownMenuNormal", CoreComponent.DROPDOWN_MENU),
                SddsServDropdownMenuNormalVariationsView,
            ),
            ViewComponent(
                ComponentKey("DropdownMenuTight", CoreComponent.DROPDOWN_MENU),
                SddsServDropdownMenuTightVariationsView,
            ),
            ViewComponent(
                ComponentKey.Indicator,
                SddsServIndicatorVariationsView,
            ),
            ViewComponent(
                ComponentKey.Image,
                SddsServImageVariationsView,
            ),
            ViewComponent(
                ComponentKey.Flow,
                ViewStyleProvider.Empty,
            ),
            ViewComponent(
                ComponentKey("ListNormal", CoreComponent.LIST),
                SddsServListNormalVariationsView,
            ),
            ViewComponent(
                ComponentKey("ListTight", CoreComponent.LIST),
                SddsServListTightVariationsView,
            ),
            ViewComponent(
                ComponentKey.Modal,
                SddsServModalVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                SddsServNotificationCompactVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                SddsServNotificationLooseVariationsView,
            ),
            ViewComponent(
                ComponentKey.Overlay,
                SddsServOverlayVariationsView,
            ),
            ViewComponent(
                ComponentKey.Popover,
                SddsServPopoverVariationsView,
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                SddsServProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                SddsServCircularProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                SddsServRadioBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                SddsServRadioBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                SddsServRectSkeletonVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextSkeleton,
                SddsServTextSkeletonVariationsView,
            ),
            ViewComponent(
                ComponentKey.Segment,
                SddsServSegmentVariationsView,
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                SddsServSegmentItemVariationsView,
            ),
            ViewComponent(
                ComponentKey.Switch,
                SddsServSwitchVariationsView,
            ),
            ViewComponent(
                ComponentKey.Spinner,
                SddsServSpinnerVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextField,
                SddsServTextFieldVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextArea,
                SddsServTextAreaVariationsView,
            ),
            ViewComponent(
                ComponentKey.Toast,
                SddsServToastVariationsView,
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                SddsServTooltipVariationsView,
            ),
        ).associateBy { it.key }
}
