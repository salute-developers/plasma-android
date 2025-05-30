package com.sdds.playground.sandbox.plasma.sd.service.integration

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.core.integration.component.ViewComponent
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.PlasmaSdServiceAvatarVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group.PlasmaSdServiceAvatarGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeClearVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeSolidVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeTransparentVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeClearVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeSolidVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeTransparentVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.basic.PlasmaSdServiceBasicButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon.PlasmaSdServiceIconButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.link.PlasmaSdServiceLinkButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.card.vs.PlasmaSdServiceCardClearVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.card.vs.PlasmaSdServiceCardSolidVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.cell.vs.PlasmaSdServiceCellVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.PlasmaSdServiceCheckBoxVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.group.PlasmaSdServiceCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.PlasmaSdServiceChipVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.PlasmaSdServiceEmbeddedChipVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceChipGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceEmbeddedChipGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.circularprogress.PlasmaSdServiceCircularProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.counter.PlasmaSdServiceCounterVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.divider.vs.PlasmaSdServiceDividerVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.vs.PlasmaSdServiceIndicatorVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.modal.PlasmaSdServiceModalVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.notification.PlasmaSdServiceNotificationCompactVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.notification.PlasmaSdServiceNotificationLooseVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.overlay.vs.PlasmaSdServiceOverlayVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.popover.vs.PlasmaSdServicePopoverVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.progress.PlasmaSdServiceProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.PlasmaSdServiceRadioBoxVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group.PlasmaSdServiceRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.rectskeleton.PlasmaSdServiceRectSkeletonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.PlasmaSdServiceSegmentVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item.PlasmaSdServiceSegmentItemVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.switcher.PlasmaSdServiceSwitchVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.PlasmaSdServiceTextAreaVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.PlasmaSdServiceTextFieldVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.toast.PlasmaSdServiceToastVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.tooltip.vs.PlasmaSdServiceTooltipVariationsView

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaSdServiceViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                PlasmaSdServiceAvatarVariationsView,
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                PlasmaSdServiceAvatarGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaSdServiceBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaSdServiceBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaSdServiceBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                PlasmaSdServiceBasicButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.IconButton,
                PlasmaSdServiceIconButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                PlasmaSdServiceLinkButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                PlasmaSdServiceCardSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                PlasmaSdServiceCardClearVariationsView,
            ),
            ViewComponent(
                ComponentKey.Divider,
                PlasmaSdServiceDividerVariationsView,
            ),
            ViewComponent(
                ComponentKey.Cell,
                PlasmaSdServiceCellVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                PlasmaSdServiceCheckBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaSdServiceCheckBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Chip,
                PlasmaSdServiceChipVariationsView,
            ),
            ViewComponent(
                ComponentKey("ChipEmbedded", CoreComponent.CHIP),
                PlasmaSdServiceEmbeddedChipVariationsView,
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                PlasmaSdServiceChipGroupVariationsView,
            ),

            ViewComponent(
                ComponentKey("ChipGroupEmbedded", CoreComponent.CHIP_GROUP),
                PlasmaSdServiceEmbeddedChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Counter,
                PlasmaSdServiceCounterVariationsView,
            ),
            ViewComponent(
                ComponentKey.Flow,
                ViewStyleProvider.Empty,
            ),
            ViewComponent(
                ComponentKey.Indicator,
                PlasmaSdServiceIndicatorVariationsView,
            ),
            ViewComponent(
                ComponentKey.Modal,
                PlasmaSdServiceModalVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                PlasmaSdServiceNotificationCompactVariationsView,
            ),
            ViewComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                PlasmaSdServiceNotificationLooseVariationsView,
            ),
            ViewComponent(
                ComponentKey.Overlay,
                PlasmaSdServiceOverlayVariationsView,
            ),
            ViewComponent(
                ComponentKey.Popover,
                PlasmaSdServicePopoverVariationsView,
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                PlasmaSdServiceProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                PlasmaSdServiceCircularProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                PlasmaSdServiceRadioBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaSdServiceRadioBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                PlasmaSdServiceRectSkeletonVariationsView,
            ),
            ViewComponent(
                ComponentKey.Segment,
                PlasmaSdServiceSegmentVariationsView,
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                PlasmaSdServiceSegmentItemVariationsView,
            ),
            ViewComponent(
                ComponentKey.Switch,
                PlasmaSdServiceSwitchVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextField,
                PlasmaSdServiceTextFieldVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextArea,
                PlasmaSdServiceTextAreaVariationsView,
            ),
            ViewComponent(
                ComponentKey.Toast,
                PlasmaSdServiceToastVariationsView,
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                PlasmaSdServiceTooltipVariationsView,
            ),
        ).associateBy { it.key }
}
