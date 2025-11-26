package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object PlasmaGigaAppComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaGigaAppAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaGigaAppAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to PlasmaGigaAppBadgeClearVariationsCompose,
                    "BadgeSolid" to PlasmaGigaAppBadgeSolidVariationsCompose,
                    "BadgeTransparent" to PlasmaGigaAppBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to PlasmaGigaAppIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to PlasmaGigaAppIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to PlasmaGigaAppIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaGigaAppBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaGigaAppIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to PlasmaGigaAppLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to PlasmaGigaAppModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to PlasmaGigaAppCardSolidVariationsCompose,
                    "CardClear" to PlasmaGigaAppCardClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaGigaAppCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaGigaAppCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to PlasmaGigaAppCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaGigaAppChipVariationsCompose,
                    "EmbeddedChip" to PlasmaGigaAppEmbeddedChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaGigaAppChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to PlasmaGigaAppChipGroupWideVariationsCompose,
                    "EmbeddedChipGroupDense" to PlasmaGigaAppEmbeddedChipGroupDenseVariationsCompose,
                    "EmbeddedChipGroupWide" to PlasmaGigaAppEmbeddedChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaGigaAppCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaGigaAppDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaGigaAppIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to PlasmaGigaAppOverlayVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to PlasmaGigaAppProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaGigaAppCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to PlasmaGigaAppPopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaGigaAppRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaGigaAppRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to PlasmaGigaAppSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to PlasmaGigaAppSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaGigaAppSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaGigaAppTextFieldVariationsCompose,
                    "TextFieldClear" to PlasmaGigaAppTextFieldClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to PlasmaGigaAppTextAreaVariationsCompose,
                    "TextAreaClear" to PlasmaGigaAppTextAreaClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaGigaAppTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to PlasmaGigaAppToastVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to PlasmaGigaAppModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to PlasmaGigaAppRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to PlasmaGigaAppNotificationCompactVariationsCompose,
                    "NotificationLoose" to PlasmaGigaAppNotificationLooseVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to PlasmaGigaAppNotificationContentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to PlasmaGigaAppListNormalVariationsCompose,
                    "ListTight" to PlasmaGigaAppListTightVariationsCompose,
                    "DropdownMenuListNormal" to PlasmaGigaAppDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to PlasmaGigaAppDropdownMenuListTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to PlasmaGigaAppListItemNormalVariationsCompose,
                    "ListItemTight" to PlasmaGigaAppListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to PlasmaGigaAppDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to PlasmaGigaAppDropdownMenuItemTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaGigaAppSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to PlasmaGigaAppTextSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaGigaAppLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to PlasmaGigaAppDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to PlasmaGigaAppDropdownMenuNormalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to PlasmaGigaAppAccordionItemSolidActionStartVariationsCompose,
                    "AccordionItemSolidActionEnd" to PlasmaGigaAppAccordionItemSolidActionEndVariationsCompose,
                    "AccordionItemClearActionStart" to PlasmaGigaAppAccordionItemClearActionStartVariationsCompose,
                    "AccordionItemClearActionEnd" to PlasmaGigaAppAccordionItemClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to PlasmaGigaAppAccordionSolidActionStartVariationsCompose,
                    "AccordionSolidActionEnd" to PlasmaGigaAppAccordionSolidActionEndVariationsCompose,
                    "AccordionClearActionStart" to PlasmaGigaAppAccordionClearActionStartVariationsCompose,
                    "AccordionClearActionEnd" to PlasmaGigaAppAccordionClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to PlasmaGigaAppScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Image,
                mapOf(
                    "Image" to PlasmaGigaAppImageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaGigaAppBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to PlasmaGigaAppIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBarHasLabelClear" to PlasmaGigaAppTabBarHasLabelClearVariationsCompose,
                    "TabBarHasLabelSolid" to PlasmaGigaAppTabBarHasLabelSolidVariationsCompose,
                    "TabBarIslandHasLabelClear" to PlasmaGigaAppTabBarIslandHasLabelClearVariationsCompose,
                    "TabBarIslandHasLabelSolid" to PlasmaGigaAppTabBarIslandHasLabelSolidVariationsCompose,
                    "TabBarClear" to PlasmaGigaAppTabBarClearVariationsCompose,
                    "TabBarSolid" to PlasmaGigaAppTabBarSolidVariationsCompose,
                    "TabBarIslandClear" to PlasmaGigaAppTabBarIslandClearVariationsCompose,
                    "TabBarIslandSolid" to PlasmaGigaAppTabBarIslandSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItemClear" to PlasmaGigaAppTabBarItemClearVariationsCompose,
                    "TabBarItemSolid" to PlasmaGigaAppTabBarItemSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to PlasmaGigaAppCodeFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to PlasmaGigaAppCodeInputVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to PlasmaGigaAppDrawerCloseNoneVariationsCompose,
                    "DrawerCloseInner" to PlasmaGigaAppDrawerCloseInnerVariationsCompose,
                    "DrawerCloseOuter" to PlasmaGigaAppDrawerCloseOuterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NavigationBar,
                mapOf(
                    "NavigationBarMainPage" to PlasmaGigaAppNavigationBarMainPageVariationsCompose,
                    "NavigationBarInternalPage" to PlasmaGigaAppNavigationBarInternalPageVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
