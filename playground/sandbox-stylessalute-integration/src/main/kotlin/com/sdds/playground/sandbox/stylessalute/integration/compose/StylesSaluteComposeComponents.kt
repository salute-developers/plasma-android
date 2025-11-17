package com.sdds.playground.sandbox.stylessalute.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object StylesSaluteComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to StylesSaluteAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to StylesSaluteAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to StylesSaluteBadgeClearVariationsCompose,
                    "BadgeSolid" to StylesSaluteBadgeSolidVariationsCompose,
                    "BadgeTransparent" to StylesSaluteBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to StylesSaluteIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to StylesSaluteIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to StylesSaluteIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to StylesSaluteBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to StylesSaluteIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to StylesSaluteLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to StylesSaluteModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to StylesSaluteCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to StylesSaluteCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to StylesSaluteCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to StylesSaluteChipVariationsCompose,
                    "EmbeddedChip" to StylesSaluteEmbeddedChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to StylesSaluteChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to StylesSaluteChipGroupWideVariationsCompose,
                    "EmbeddedChipGroupDense" to StylesSaluteEmbeddedChipGroupDenseVariationsCompose,
                    "EmbeddedChipGroupWide" to StylesSaluteEmbeddedChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to StylesSaluteCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to StylesSaluteDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to StylesSaluteIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to StylesSaluteProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to StylesSalutePopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to StylesSaluteRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to StylesSaluteRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to StylesSaluteSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to StylesSaluteSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to StylesSaluteSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to StylesSaluteTextFieldVariationsCompose,
                    "TextFieldClear" to StylesSaluteTextFieldClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to StylesSaluteTextAreaVariationsCompose,
                    "TextAreaClear" to StylesSaluteTextAreaClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to StylesSaluteTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to StylesSaluteToastVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to StylesSaluteModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to StylesSaluteRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to StylesSaluteNotificationCompactVariationsCompose,
                    "NotificationLoose" to StylesSaluteNotificationLooseVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to StylesSaluteNotificationContentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to StylesSaluteListNormalVariationsCompose,
                    "ListTight" to StylesSaluteListTightVariationsCompose,
                    "DropdownMenuListNormal" to StylesSaluteDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to StylesSaluteDropdownMenuListTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to StylesSaluteListItemNormalVariationsCompose,
                    "ListItemTight" to StylesSaluteListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to StylesSaluteDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to StylesSaluteDropdownMenuItemTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to StylesSaluteTextSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to StylesSaluteDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to StylesSaluteDropdownMenuNormalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to StylesSaluteAccordionItemSolidActionStartVariationsCompose,
                    "AccordionItemSolidActionEnd" to StylesSaluteAccordionItemSolidActionEndVariationsCompose,
                    "AccordionItemClearActionStart" to StylesSaluteAccordionItemClearActionStartVariationsCompose,
                    "AccordionItemClearActionEnd" to StylesSaluteAccordionItemClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to StylesSaluteAccordionSolidActionStartVariationsCompose,
                    "AccordionSolidActionEnd" to StylesSaluteAccordionSolidActionEndVariationsCompose,
                    "AccordionClearActionStart" to StylesSaluteAccordionClearActionStartVariationsCompose,
                    "AccordionClearActionEnd" to StylesSaluteAccordionClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to StylesSaluteScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to StylesSaluteBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to StylesSaluteIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to StylesSaluteCodeInputVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
