package com.sdds.playground.sandbox.plasma.giga.app.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.giga.app.integration.accordion.PlasmaGigaAppAccordionClearActionEndVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.accordion.PlasmaGigaAppAccordionClearActionStartVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.accordion.PlasmaGigaAppAccordionSolidActionEndVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.accordion.PlasmaGigaAppAccordionSolidActionStartVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.avatar.PlasmaGigaAppAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.avatar.group.PlasmaGigaAppAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.bottomsheet.PlasmaGigaAppBottomSheetVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.basic.PlasmaGigaAppBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.icon.PlasmaGigaAppIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.link.PlasmaGigaAppLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.card.PlasmaGigaAppCardClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.card.PlasmaGigaAppCardSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.cell.compose.PlasmaGigaAppCellVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox.PlasmaGigaAppCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox.group.PlasmaGigaAppCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.PlasmaGigaAppChipVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group.PlasmaGigaAppChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group.PlasmaGigaAppChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group.PlasmaGigaAppEmbeddedChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group.PlasmaGigaAppEmbeddedChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.circularprogress.PlasmaGigaAppCircularProgressBarVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.counter.PlasmaGigaAppCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.divider.compose.PlasmaGigaAppDividerVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.dropdownmenu.PlasmaGigaAppDropdownMenuNormalVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.dropdownmenu.PlasmaGigaAppDropdownMenuTightVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.indicator.compose.PlasmaGigaAppIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.list.PlasmaGigaAppListNormalVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.list.PlasmaGigaAppListTightVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.modal.PlasmaGigaAppModalVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.notification.PlasmaGigaAppNotificationCompactVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.notification.PlasmaGigaAppNotificationLooseVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.overlay.compose.PlasmaGigaAppOverlayVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.popover.PlasmaGigaAppPopoverVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.progress.PlasmaGigaAppProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.radiobox.PlasmaGigaAppRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.radiobox.group.PlasmaGigaRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.rectskeleton.PlasmaGigaAppRectSkeletonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.segment.PlasmaGigaAppSegmentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.segment.item.PlasmaGigaAppSegmentItemVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.spinner.PlasmaGigaAppSpinnerVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.switcher.PlasmaGigaAppSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textarea.PlasmaGigaAppTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textarea.clear.PlasmaGigaAppTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textfield.PlasmaGigaAppTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textfield.clear.PlasmaGigaAppTextFieldClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textskeleton.PlasmaGigaAppTextSkeletonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.toast.PlasmaGigaAppToastVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.tooltip.PlasmaGigaAppTooltipVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaGigaAppComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                PlasmaGigaAppAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                PlasmaGigaAppAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaGigaAppBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaGigaAppBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaGigaAppBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                PlasmaGigaAppBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                PlasmaGigaAppIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                PlasmaGigaAppLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                PlasmaGigaAppCardClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                PlasmaGigaAppCardSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                PlasmaGigaAppCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                PlasmaGigaAppCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaGigaAppCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                PlasmaGigaAppChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaGigaAppChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaGigaAppChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupDense", CoreComponent.CHIP_GROUP),
                PlasmaGigaAppEmbeddedChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupWide", CoreComponent.CHIP_GROUP),
                PlasmaGigaAppEmbeddedChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                PlasmaGigaAppCircularProgressBarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                PlasmaGigaAppCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                PlasmaGigaAppIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                PlasmaGigaAppProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Popover,
                PlasmaGigaAppPopoverVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                PlasmaGigaAppTooltipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                PlasmaGigaAppRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaGigaRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                PlasmaGigaAppSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                PlasmaGigaAppTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                PlasmaGigaAppTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                PlasmaGigaAppTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                PlasmaGigaAppTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                PlasmaGigaAppSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                PlasmaGigaAppSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                PlasmaGigaAppBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                PlasmaGigaAppDividerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                PlasmaGigaAppOverlayVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Toast,
                PlasmaGigaAppToastVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Modal,
                PlasmaGigaAppModalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                PlasmaGigaAppNotificationLooseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                PlasmaGigaAppNotificationCompactVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                PlasmaGigaAppRectSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                PlasmaGigaAppTextSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                PlasmaGigaAppSpinnerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListNormal", CoreComponent.LIST),
                PlasmaGigaAppListNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListTight", CoreComponent.LIST),
                PlasmaGigaAppListTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuNormal", CoreComponent.DROPDOWN_MENU),
                PlasmaGigaAppDropdownMenuNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuTight", CoreComponent.DROPDOWN_MENU),
                PlasmaGigaAppDropdownMenuTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionStart", CoreComponent.ACCORDION),
                PlasmaGigaAppAccordionClearActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionEnd", CoreComponent.ACCORDION),
                PlasmaGigaAppAccordionClearActionEndVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionStart", CoreComponent.ACCORDION),
                PlasmaGigaAppAccordionSolidActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionEnd", CoreComponent.ACCORDION),
                PlasmaGigaAppAccordionSolidActionEndVariationsCompose,
            ),
        ).associateBy { it.key }
}
