package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.ViewComponent

/**
 *  Компоненты
 */
object PlasmaB2cViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaB2cAvatarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaB2cAvatarGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to PlasmaB2cBadgeClearVariationsView,
                    "BadgeSolid" to PlasmaB2cBadgeSolidVariationsView,
                    "BadgeTransparent" to PlasmaB2cBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to PlasmaB2cIconBadgeClearVariationsView,
                    "IconBadgeSolid" to PlasmaB2cIconBadgeSolidVariationsView,
                    "IconBadgeTransparent" to PlasmaB2cIconBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaB2cBasicButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaB2cIconButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to PlasmaB2cLinkButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to PlasmaB2cCardSolidVariationsView,
                    "CardClear" to PlasmaB2cCardClearVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaB2cCellVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaB2cCheckBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to PlasmaB2cCheckBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaB2cChipVariationsView,
                    "EmbeddedChip" to PlasmaB2cEmbeddedChipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaB2cChipGroupDenseVariationsView,
                    "ChipGroupWide" to PlasmaB2cChipGroupWideVariationsView,
                    "EmbeddedChipGroupDense" to PlasmaB2cEmbeddedChipGroupDenseVariationsView,
                    "EmbeddedChipGroupWide" to PlasmaB2cEmbeddedChipGroupWideVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaB2cCounterVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaB2cDividerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaB2cIndicatorVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Overlay,
                mapOf(
                    "OverlayView" to PlasmaB2cOverlayViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to PlasmaB2cProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaB2cCircularProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to PlasmaB2cPopoverVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaB2cRadioBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaB2cRadioBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to PlasmaB2cSegmentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to PlasmaB2cSegmentItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaB2cSwitchVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaB2cTextFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to PlasmaB2cTextAreaVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaB2cTooltipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to PlasmaB2cToastVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to PlasmaB2cModalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to PlasmaB2cRectSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to PlasmaB2cNotificationCompactVariationsView,
                    "NotificationLoose" to PlasmaB2cNotificationLooseVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to PlasmaB2cNotificationContentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to PlasmaB2cListNormalVariationsView,
                    "ListTight" to PlasmaB2cListTightVariationsView,
                    "DropdownMenuListNormal" to PlasmaB2cDropdownMenuListNormalVariationsView,
                    "DropdownMenuListTight" to PlasmaB2cDropdownMenuListTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to PlasmaB2cListItemNormalVariationsView,
                    "ListItemTight" to PlasmaB2cListItemTightVariationsView,
                    "DropdownMenuItemNormal" to PlasmaB2cDropdownMenuItemNormalVariationsView,
                    "DropdownMenuItemTight" to PlasmaB2cDropdownMenuItemTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaB2cSpinnerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to PlasmaB2cTextSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaB2cLoaderVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to PlasmaB2cDropdownMenuTightVariationsView,
                    "DropdownMenuNormal" to PlasmaB2cDropdownMenuNormalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to PlasmaB2cAccordionItemSolidActionStartVariationsView,
                    "AccordionItemSolidActionEnd" to PlasmaB2cAccordionItemSolidActionEndVariationsView,
                    "AccordionItemClearActionStart" to PlasmaB2cAccordionItemClearActionStartVariationsView,
                    "AccordionItemClearActionEnd" to PlasmaB2cAccordionItemClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to PlasmaB2cAccordionSolidActionStartVariationsView,
                    "AccordionSolidActionEnd" to PlasmaB2cAccordionSolidActionEndVariationsView,
                    "AccordionClearActionStart" to PlasmaB2cAccordionClearActionStartVariationsView,
                    "AccordionClearActionEnd" to PlasmaB2cAccordionClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to PlasmaB2cScrollBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Image,
                mapOf(
                    "ImageView" to PlasmaB2cImageViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaB2cBasicButtonGroupVariationsView,
                    "IconButtonGroup" to PlasmaB2cIconButtonGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to PlasmaB2cCodeFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to PlasmaB2cCodeInputVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to PlasmaB2cDrawerCloseNoneVariationsView,
                    "DrawerCloseInner" to PlasmaB2cDrawerCloseInnerVariationsView,
                    "DrawerCloseOuter" to PlasmaB2cDrawerCloseOuterVariationsView,
                ),
            ),
        ).associateBy { it.key }
}
