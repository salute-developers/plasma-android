package com.sdds.playground.sandbox.sdds.serv.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object SddsServComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to SddsServAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to SddsServAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to SddsServBadgeClearVariationsCompose,
                    "BadgeSolid" to SddsServBadgeSolidVariationsCompose,
                    "BadgeTransparent" to SddsServBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to SddsServIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to SddsServIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to SddsServIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to SddsServBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to SddsServIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to SddsServLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to SddsServModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to SddsServCardSolidVariationsCompose,
                    "CardClear" to SddsServCardClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to SddsServCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to SddsServCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to SddsServCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to SddsServChipVariationsCompose,
                    "EmbeddedChip" to SddsServEmbeddedChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to SddsServChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to SddsServChipGroupWideVariationsCompose,
                    "EmbeddedChipGroupDense" to SddsServEmbeddedChipGroupDenseVariationsCompose,
                    "EmbeddedChipGroupWide" to SddsServEmbeddedChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to SddsServCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to SddsServDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to SddsServIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to SddsServLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to SddsServOverlayVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to SddsServProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to SddsServCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to SddsServPopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to SddsServRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to SddsServRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to SddsServSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to SddsServSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to SddsServSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to SddsServTextFieldVariationsCompose,
                    "TextFieldClear" to SddsServTextFieldClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to SddsServTextAreaVariationsCompose,
                    "TextAreaClear" to SddsServTextAreaClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to SddsServTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to SddsServToastVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to SddsServModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to SddsServRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Note,
                mapOf(
                    "Note" to SddsServNoteVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NoteCompact,
                mapOf(
                    "NoteCompact" to SddsServNoteCompactVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to SddsServNotificationCompactVariationsCompose,
                    "NotificationLoose" to SddsServNotificationLooseVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to SddsServNotificationContentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to SddsServListNormalVariationsCompose,
                    "ListTight" to SddsServListTightVariationsCompose,
                    "DropdownMenuListNormal" to SddsServDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to SddsServDropdownMenuListTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to SddsServListItemNormalVariationsCompose,
                    "ListItemTight" to SddsServListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to SddsServDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to SddsServDropdownMenuItemTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to SddsServSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to SddsServTextSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to SddsServDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to SddsServDropdownMenuNormalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to SddsServAccordionItemSolidActionStartVariationsCompose,
                    "AccordionItemSolidActionEnd" to SddsServAccordionItemSolidActionEndVariationsCompose,
                    "AccordionItemClearActionStart" to SddsServAccordionItemClearActionStartVariationsCompose,
                    "AccordionItemClearActionEnd" to SddsServAccordionItemClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to SddsServAccordionSolidActionStartVariationsCompose,
                    "AccordionSolidActionEnd" to SddsServAccordionSolidActionEndVariationsCompose,
                    "AccordionClearActionStart" to SddsServAccordionClearActionStartVariationsCompose,
                    "AccordionClearActionEnd" to SddsServAccordionClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to SddsServScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Image,
                mapOf(
                    "Image" to SddsServImageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to SddsServBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to SddsServIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBarHasLabelClear" to SddsServTabBarHasLabelClearVariationsCompose,
                    "TabBarHasLabelSolid" to SddsServTabBarHasLabelSolidVariationsCompose,
                    "TabBarIslandHasLabelClear" to SddsServTabBarIslandHasLabelClearVariationsCompose,
                    "TabBarIslandHasLabelSolid" to SddsServTabBarIslandHasLabelSolidVariationsCompose,
                    "TabBarClear" to SddsServTabBarClearVariationsCompose,
                    "TabBarSolid" to SddsServTabBarSolidVariationsCompose,
                    "TabBarIslandClear" to SddsServTabBarIslandClearVariationsCompose,
                    "TabBarIslandSolid" to SddsServTabBarIslandSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItemClear" to SddsServTabBarItemClearVariationsCompose,
                    "TabBarItemSolid" to SddsServTabBarItemSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to SddsServCodeFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to SddsServCodeInputVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to SddsServDrawerCloseNoneVariationsCompose,
                    "DrawerCloseInner" to SddsServDrawerCloseInnerVariationsCompose,
                    "DrawerCloseOuter" to SddsServDrawerCloseOuterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tabs,
                mapOf(
                    "TabsDefault" to SddsServTabsDefaultVariationsCompose,
                    "TabsHeader" to SddsServTabsHeaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconTabs,
                mapOf(
                    "IconTabs" to SddsServIconTabsVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabItem,
                mapOf(
                    "TabItemDefault" to SddsServTabItemDefaultVariationsCompose,
                    "TabItemHeader" to SddsServTabItemHeaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconTabItem,
                mapOf(
                    "IconTabItem" to SddsServIconTabItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NavigationBar,
                mapOf(
                    "NavigationBarMainPage" to SddsServNavigationBarMainPageVariationsCompose,
                    "NavigationBarInternalPage" to SddsServNavigationBarInternalPageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.PaginationDots,
                mapOf(
                    "PaginationDotsHorizontal" to SddsServPaginationDotsHorizontalVariationsCompose,
                    "PaginationDotsVertical" to SddsServPaginationDotsVerticalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Autocomplete,
                mapOf(
                    "AutocompleteTight" to SddsServAutocompleteTightVariationsCompose,
                    "AutocompleteNormal" to SddsServAutocompleteNormalVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
