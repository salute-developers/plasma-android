package com.sdds.playground.sandbox.plasma.sd.service.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.sd.service.integration.accordion.PlasmaSdServiceAccordionClearActionEndVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.accordion.PlasmaSdServiceAccordionClearActionStartVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.accordion.PlasmaSdServiceAccordionSolidActionEndVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.accordion.PlasmaSdServiceAccordionSolidActionStartVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.PlasmaSdServiceAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group.PlasmaSdServiceAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.bottomsheet.PlasmaSdServiceBottomSheetVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.basic.PlasmaSdServiceBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon.PlasmaSdServiceIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.link.PlasmaSdServiceLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.card.PlasmaSdServiceCardClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.card.PlasmaSdServiceCardSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.cell.compose.PlasmaSdServiceCellVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.PlasmaSdServiceCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.group.PlasmaSdServiceCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.PlasmaSdServiceChipVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceEmbeddedChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceEmbeddedChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.circularprogress.PlasmaSdServiceCircularProgressBarVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.counter.PlasmaSdServiceCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.divider.compose.PlasmaSdServiceDividerVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.dropdownmenu.PlasmaSdServiceDropdownMenuNormalVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.dropdownmenu.PlasmaSdServiceDropdownMenuTightVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.compose.PlasmaSdServiceIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.list.PlasmaSdServiceListNormalVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.list.PlasmaSdServiceListTightVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.modal.PlasmaSdServiceModalVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.notification.PlasmaSdServiceNotificationCompactVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.notification.PlasmaSdServiceNotificationLooseVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.overlay.compose.PlasmaSdServiceOverlayVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.popover.PlasmaSdServicePopoverVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.progress.PlasmaSdServiceProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.PlasmaSdServiceRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group.PlasmaSdServiceRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.rectskeleton.PlasmaSdServiceRectSkeletonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.scrollbar.PlasmaSdServiceScrollBarVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.PlasmaSdServiceSegmentVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item.PlasmaSdServiceSegmentItemVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.spinner.PlasmaSdServiceSpinnerVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.switcher.PlasmaSdServiceSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.PlasmaSdServiceTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.clear.PlasmaSdServiceTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.PlasmaSdServiceTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.clear.PlasmaSdServiceTextFieldClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textskeleton.PlasmaSdServiceTextSkeletonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.toast.PlasmaSdServiceToastVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.tooltip.PlasmaSdServiceTooltipVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaSdServiceComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                PlasmaSdServiceAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                PlasmaSdServiceAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaSdServiceBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaSdServiceBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaSdServiceBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaSdServiceIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                PlasmaSdServiceBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                PlasmaSdServiceBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                PlasmaSdServiceIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                PlasmaSdServiceLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                PlasmaSdServiceDividerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                PlasmaSdServiceCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                PlasmaSdServiceCardSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                PlasmaSdServiceCardClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                PlasmaSdServiceCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaSdServiceCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                PlasmaSdServiceChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaSdServiceChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaSdServiceChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaSdServiceEmbeddedChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaSdServiceEmbeddedChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                PlasmaSdServiceCircularProgressBarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                PlasmaSdServiceCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                PlasmaSdServiceIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                PlasmaSdServiceProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Popover,
                PlasmaSdServicePopoverVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                PlasmaSdServiceTooltipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                PlasmaSdServiceRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaSdServiceRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                PlasmaSdServiceSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                PlasmaSdServiceTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                PlasmaSdServiceTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                PlasmaSdServiceTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                PlasmaSdServiceTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                PlasmaSdServiceSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                PlasmaSdServiceSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                PlasmaSdServiceOverlayVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Toast,
                PlasmaSdServiceToastVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Modal,
                PlasmaSdServiceModalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                PlasmaSdServiceNotificationLooseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                PlasmaSdServiceNotificationCompactVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                PlasmaSdServiceRectSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                PlasmaSdServiceTextSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                PlasmaSdServiceSpinnerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListNormal", CoreComponent.LIST),
                PlasmaSdServiceListNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListTight", CoreComponent.LIST),
                PlasmaSdServiceListTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuNormal", CoreComponent.DROPDOWN_MENU),
                PlasmaSdServiceDropdownMenuNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuTight", CoreComponent.DROPDOWN_MENU),
                PlasmaSdServiceDropdownMenuTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionStart", CoreComponent.ACCORDION),
                PlasmaSdServiceAccordionClearActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionEnd", CoreComponent.ACCORDION),
                PlasmaSdServiceAccordionClearActionEndVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionStart", CoreComponent.ACCORDION),
                PlasmaSdServiceAccordionSolidActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionEnd", CoreComponent.ACCORDION),
                PlasmaSdServiceAccordionSolidActionEndVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                PlasmaSdServiceScrollBarVariationsCompose,
            ),
        ).associateBy { it.key }
}
