package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object PlasmaB2cComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaB2cAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaB2cAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to PlasmaB2cBadgeClearVariationsCompose,
                    "BadgeSolid" to PlasmaB2cBadgeSolidVariationsCompose,
                    "BadgeTransparent" to PlasmaB2cBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to PlasmaB2cIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to PlasmaB2cIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to PlasmaB2cIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaB2cBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaB2cIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to PlasmaB2cLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to PlasmaB2cModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to PlasmaB2cCardSolidVariationsCompose,
                    "CardClear" to PlasmaB2cCardClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaB2cCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaB2cCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to PlasmaB2cCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaB2cChipVariationsCompose,
                    "EmbeddedChip" to PlasmaB2cEmbeddedChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaB2cChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to PlasmaB2cChipGroupWideVariationsCompose,
                    "EmbeddedChipGroupDense" to PlasmaB2cEmbeddedChipGroupDenseVariationsCompose,
                    "EmbeddedChipGroupWide" to PlasmaB2cEmbeddedChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaB2cCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaB2cDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaB2cIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to PlasmaB2cOverlayVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to PlasmaB2cProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaB2cCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to PlasmaB2cPopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaB2cRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaB2cRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to PlasmaB2cSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to PlasmaB2cSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaB2cSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaB2cTextFieldVariationsCompose,
                    "TextFieldClear" to PlasmaB2cTextFieldClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to PlasmaB2cTextAreaVariationsCompose,
                    "TextAreaClear" to PlasmaB2cTextAreaClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaB2cTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to PlasmaB2cToastVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to PlasmaB2cModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to PlasmaB2cRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to PlasmaB2cNotificationCompactVariationsCompose,
                    "NotificationLoose" to PlasmaB2cNotificationLooseVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to PlasmaB2cNotificationContentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to PlasmaB2cListNormalVariationsCompose,
                    "ListTight" to PlasmaB2cListTightVariationsCompose,
                    "DropdownMenuListNormal" to PlasmaB2cDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to PlasmaB2cDropdownMenuListTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to PlasmaB2cListItemNormalVariationsCompose,
                    "ListItemTight" to PlasmaB2cListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to PlasmaB2cDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to PlasmaB2cDropdownMenuItemTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaB2cSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to PlasmaB2cTextSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaB2cLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to PlasmaB2cDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to PlasmaB2cDropdownMenuNormalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to PlasmaB2cAccordionItemSolidActionStartVariationsCompose,
                    "AccordionItemSolidActionEnd" to PlasmaB2cAccordionItemSolidActionEndVariationsCompose,
                    "AccordionItemClearActionStart" to PlasmaB2cAccordionItemClearActionStartVariationsCompose,
                    "AccordionItemClearActionEnd" to PlasmaB2cAccordionItemClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to PlasmaB2cAccordionSolidActionStartVariationsCompose,
                    "AccordionSolidActionEnd" to PlasmaB2cAccordionSolidActionEndVariationsCompose,
                    "AccordionClearActionStart" to PlasmaB2cAccordionClearActionStartVariationsCompose,
                    "AccordionClearActionEnd" to PlasmaB2cAccordionClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to PlasmaB2cScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Image,
                mapOf(
                    "Image" to PlasmaB2cImageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaB2cBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to PlasmaB2cIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBarHasLabelClear" to PlasmaB2cTabBarHasLabelClearVariationsCompose,
                    "TabBarHasLabelSolid" to PlasmaB2cTabBarHasLabelSolidVariationsCompose,
                    "TabBarIslandHasLabelClear" to PlasmaB2cTabBarIslandHasLabelClearVariationsCompose,
                    "TabBarIslandHasLabelSolid" to PlasmaB2cTabBarIslandHasLabelSolidVariationsCompose,
                    "TabBarClear" to PlasmaB2cTabBarClearVariationsCompose,
                    "TabBarSolid" to PlasmaB2cTabBarSolidVariationsCompose,
                    "TabBarIslandClear" to PlasmaB2cTabBarIslandClearVariationsCompose,
                    "TabBarIslandSolid" to PlasmaB2cTabBarIslandSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItemClear" to PlasmaB2cTabBarItemClearVariationsCompose,
                    "TabBarItemSolid" to PlasmaB2cTabBarItemSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to PlasmaB2cCodeFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to PlasmaB2cCodeInputVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to PlasmaB2cDrawerCloseNoneVariationsCompose,
                    "DrawerCloseInner" to PlasmaB2cDrawerCloseInnerVariationsCompose,
                    "DrawerCloseOuter" to PlasmaB2cDrawerCloseOuterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NavigationBar,
                mapOf(
                    "NavigationBarMainPage" to PlasmaB2cNavigationBarMainPageVariationsCompose,
                    "NavigationBarInternalPage" to PlasmaB2cNavigationBarInternalPageVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
