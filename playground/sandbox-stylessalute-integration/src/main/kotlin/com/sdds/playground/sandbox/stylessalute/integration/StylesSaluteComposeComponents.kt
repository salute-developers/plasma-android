package com.sdds.playground.sandbox.stylessalute.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.stylessalute.integration.accordion.StylesSaluteAccordionClearActionEndVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.accordion.StylesSaluteAccordionClearActionStartVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.accordion.StylesSaluteAccordionSolidActionEndVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.accordion.StylesSaluteAccordionSolidActionStartVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.avatar.StylesSaluteAvatarVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.avatar.group.StylesSaluteAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.bottomsheet.StylesSaluteBottomSheetVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.basic.StylesSaluteBasicButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.icon.StylesSaluteIconButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.link.StylesSaluteLinkButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.buttongroup.StylesSaluteBasicButtonGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.buttongroup.StylesSaluteIconButtonGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.cell.compose.StylesSaluteCellVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.StylesSaluteCheckBoxVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.group.StylesSaluteCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.StylesSaluteChipVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteEmbeddedChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteEmbeddedChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.counter.StylesSaluteCounterVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.dropdownmenu.StylesSaluteDropdownMenuNormalVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.dropdownmenu.StylesSaluteDropdownMenuTightVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.indicator.compose.StylesSaluteIndicatorVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.list.StylesSaluteListNormalVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.list.StylesSaluteListTightVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.modal.StylesSaluteModalVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.notification.StylesSaluteNotificationCompactVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.notification.StylesSaluteNotificationLooseVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.popover.StylesSalutePopoverVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.progress.StylesSaluteProgressVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.StylesSaluteRadioBoxVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.group.StylesSaluteRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.rectskeleton.StylesSaluteRectSkeletonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.scrollbar.StylesSaluteScrollBarVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.segment.StylesSaluteSegmentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.segment.item.StylesSaluteSegmentItemVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.switcher.StylesSaluteSwitchVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.StylesSaluteTextAreaVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.clear.StylesSaluteTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.StylesSaluteTextFieldVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.clear.StylesSaluteTextFieldClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textskeleton.StylesSaluteTextSkeletonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.toast.StylesSaluteToastVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.tooltip.StylesSaluteTooltipVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object StylesSaluteComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                StylesSaluteAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                StylesSaluteAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                StylesSaluteBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                StylesSaluteBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                StylesSaluteBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                StylesSaluteBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                StylesSaluteBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                StylesSaluteIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                StylesSaluteLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                StylesSaluteCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                StylesSaluteCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                StylesSaluteCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                StylesSaluteChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                StylesSaluteChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                StylesSaluteChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupDense", CoreComponent.CHIP_GROUP),
                StylesSaluteEmbeddedChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupWide", CoreComponent.CHIP_GROUP),
                StylesSaluteEmbeddedChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                StylesSaluteCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                StylesSaluteIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                StylesSaluteProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Popover,
                StylesSalutePopoverVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                StylesSaluteTooltipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                StylesSaluteRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                StylesSaluteRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                StylesSaluteSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                StylesSaluteTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                StylesSaluteTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                StylesSaluteTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                StylesSaluteTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                StylesSaluteSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                StylesSaluteSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Toast,
                StylesSaluteToastVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Modal,
                StylesSaluteModalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                StylesSaluteNotificationLooseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                StylesSaluteNotificationCompactVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                StylesSaluteRectSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                StylesSaluteTextSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListNormal", CoreComponent.LIST),
                StylesSaluteListNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListTight", CoreComponent.LIST),
                StylesSaluteListTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuNormal", CoreComponent.DROPDOWN_MENU),
                StylesSaluteDropdownMenuNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuTight", CoreComponent.DROPDOWN_MENU),
                StylesSaluteDropdownMenuTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionStart", CoreComponent.ACCORDION),
                StylesSaluteAccordionClearActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionClearActionEnd", CoreComponent.ACCORDION),
                StylesSaluteAccordionClearActionEndVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionStart", CoreComponent.ACCORDION),
                StylesSaluteAccordionSolidActionStartVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("AccordionSolidActionEnd", CoreComponent.ACCORDION),
                StylesSaluteAccordionSolidActionEndVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                StylesSaluteScrollBarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BasicButtonGroup", CoreComponent.BUTTON_GROUP),
                StylesSaluteBasicButtonGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconButtonGroup", CoreComponent.BUTTON_GROUP),
                StylesSaluteIconButtonGroupVariationsCompose,
            ),
        ).associateBy { it.key }
}
