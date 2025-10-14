package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.ViewComponent

/**
 *  Компоненты
 */
object StylesSaluteViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to StylesSaluteAvatarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to StylesSaluteAvatarGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to StylesSaluteBadgeClearVariationsView,
                    "BadgeSolid" to StylesSaluteBadgeSolidVariationsView,
                    "BadgeTransparent" to StylesSaluteBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to StylesSaluteIconBadgeClearVariationsView,
                    "IconBadgeSolid" to StylesSaluteIconBadgeSolidVariationsView,
                    "IconBadgeTransparent" to StylesSaluteIconBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to StylesSaluteBasicButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to StylesSaluteIconButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to StylesSaluteLinkButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to StylesSaluteCellVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to StylesSaluteCheckBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to StylesSaluteCheckBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to StylesSaluteChipVariationsView,
                    "EmbeddedChip" to StylesSaluteEmbeddedChipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to StylesSaluteChipGroupDenseVariationsView,
                    "ChipGroupWide" to StylesSaluteChipGroupWideVariationsView,
                    "EmbeddedChipGroupDense" to StylesSaluteEmbeddedChipGroupDenseVariationsView,
                    "EmbeddedChipGroupWide" to StylesSaluteEmbeddedChipGroupWideVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to StylesSaluteCounterVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to StylesSaluteDividerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to StylesSaluteIndicatorVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to StylesSaluteProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to StylesSalutePopoverVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to StylesSaluteRadioBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to StylesSaluteRadioBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to StylesSaluteSegmentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to StylesSaluteSegmentItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to StylesSaluteSwitchVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to StylesSaluteTextFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to StylesSaluteTextAreaVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to StylesSaluteTooltipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to StylesSaluteToastVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to StylesSaluteModalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to StylesSaluteRectSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to StylesSaluteNotificationCompactVariationsView,
                    "NotificationLoose" to StylesSaluteNotificationLooseVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to StylesSaluteNotificationContentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to StylesSaluteListNormalVariationsView,
                    "ListTight" to StylesSaluteListTightVariationsView,
                    "DropdownMenuListNormal" to StylesSaluteDropdownMenuListNormalVariationsView,
                    "DropdownMenuListTight" to StylesSaluteDropdownMenuListTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to StylesSaluteListItemNormalVariationsView,
                    "ListItemTight" to StylesSaluteListItemTightVariationsView,
                    "DropdownMenuItemNormal" to StylesSaluteDropdownMenuItemNormalVariationsView,
                    "DropdownMenuItemTight" to StylesSaluteDropdownMenuItemTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to StylesSaluteTextSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to StylesSaluteDropdownMenuTightVariationsView,
                    "DropdownMenuNormal" to StylesSaluteDropdownMenuNormalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to StylesSaluteAccordionItemSolidActionStartVariationsView,
                    "AccordionItemSolidActionEnd" to StylesSaluteAccordionItemSolidActionEndVariationsView,
                    "AccordionItemClearActionStart" to StylesSaluteAccordionItemClearActionStartVariationsView,
                    "AccordionItemClearActionEnd" to StylesSaluteAccordionItemClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to StylesSaluteAccordionSolidActionStartVariationsView,
                    "AccordionSolidActionEnd" to StylesSaluteAccordionSolidActionEndVariationsView,
                    "AccordionClearActionStart" to StylesSaluteAccordionClearActionStartVariationsView,
                    "AccordionClearActionEnd" to StylesSaluteAccordionClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to StylesSaluteScrollBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to StylesSaluteBasicButtonGroupVariationsView,
                    "IconButtonGroup" to StylesSaluteIconButtonGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to StylesSaluteCodeInputVariationsView,
                ),
            ),
        ).associateBy { it.key }
}
