package com.sdds.playground.sandbox.sdds.serv.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.SddsServAvatarVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.group.SddsServAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.bottomsheet.SddsServBottomSheetVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.basic.SddsServBasicButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.icon.SddsServIconButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.link.SddsServLinkButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.card.SddsServCardClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.card.SddsServCardSolidVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.cell.compose.SddsServCellVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.SddsServCheckBoxVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group.SddsServCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServChipVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServEmbeddedChipGroupDenseVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServEmbeddedChipGroupWideVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.circularprogress.SddsServCircularProgressBarVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.counter.SddsServCounterVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.divider.compose.SddsServDividerVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.dropdownmenu.SddsServDropdownMenuNormalVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.dropdownmenu.SddsServDropdownMenuTightVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.indicator.compose.SddsServIndicatorVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.list.SddsServListNormalVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.list.SddsServListTightVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.modal.SddsServModalVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.notification.SddsServNotificationCompactVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.notification.SddsServNotificationLooseVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.overlay.compose.SddsServOverlayVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.popover.SddsServPopoverVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.progress.SddsServProgressVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.SddsServRadioBoxVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group.SddsServRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.rectskeleton.SddsServRectSkeletonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.segment.SddsServSegmentVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.segment.item.SddsServSegmentItemVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.spinner.SddsServSpinnerVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.switcher.SddsServSwitchVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.SddsServTextAreaVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.clear.SddsServTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.SddsServTextFieldVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.clear.SddsServTextFieldClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textskeleton.SddsServTextSkeletonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.toast.SddsServToastVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.tooltip.SddsServTooltipVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object SddsServComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                SddsServAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                SddsServAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                SddsServBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                SddsServBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                SddsServBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                SddsServIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                SddsServIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                SddsServIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                SddsServBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                SddsServBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                SddsServIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                SddsServLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                SddsServCardClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                SddsServCardSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                SddsServCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                SddsServCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                SddsServCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                SddsServChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupDense", CoreComponent.CHIP_GROUP),
                SddsServChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ChipGroupWide", CoreComponent.CHIP_GROUP),
                SddsServChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupDense", CoreComponent.CHIP_GROUP),
                SddsServEmbeddedChipGroupDenseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("EmbeddedChipGroupWide", CoreComponent.CHIP_GROUP),
                SddsServEmbeddedChipGroupWideVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                SddsServCircularProgressBarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                SddsServCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                SddsServDividerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                SddsServIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                SddsServProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Popover,
                SddsServPopoverVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                SddsServTooltipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                SddsServRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                SddsServRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                SddsServSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                SddsServTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                SddsServTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                SddsServTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                SddsServTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                SddsServSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                SddsServSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                SddsServOverlayVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Toast,
                SddsServToastVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Modal,
                SddsServModalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationLoose", CoreComponent.NOTIFICATION),
                SddsServNotificationLooseVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("NotificationCompact", CoreComponent.NOTIFICATION),
                SddsServNotificationCompactVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                SddsServRectSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                SddsServTextSkeletonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                SddsServSpinnerVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListNormal", CoreComponent.LIST),
                SddsServListNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("ListTight", CoreComponent.LIST),
                SddsServListTightVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuNormal", CoreComponent.DROPDOWN_MENU),
                SddsServDropdownMenuNormalVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("DropdownMenuTight", CoreComponent.DROPDOWN_MENU),
                SddsServDropdownMenuTightVariationsCompose,
            ),
        ).associateBy { it.key }
}
