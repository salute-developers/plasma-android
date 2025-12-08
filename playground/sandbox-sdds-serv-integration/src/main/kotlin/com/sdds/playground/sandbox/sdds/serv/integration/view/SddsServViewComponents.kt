package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.ViewComponent

/**
 *  Компоненты
 */
object SddsServViewComponents : ComponentsProviderView() {

    override val generated: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to SddsServAvatarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to SddsServAvatarGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to SddsServBadgeClearVariationsView,
                    "BadgeSolid" to SddsServBadgeSolidVariationsView,
                    "BadgeTransparent" to SddsServBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to SddsServIconBadgeClearVariationsView,
                    "IconBadgeSolid" to SddsServIconBadgeSolidVariationsView,
                    "IconBadgeTransparent" to SddsServIconBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to SddsServBasicButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to SddsServIconButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to SddsServLinkButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to SddsServCardSolidVariationsView,
                    "CardClear" to SddsServCardClearVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to SddsServCellVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to SddsServCheckBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to SddsServCheckBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to SddsServChipVariationsView,
                    "EmbeddedChip" to SddsServEmbeddedChipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to SddsServChipGroupDenseVariationsView,
                    "ChipGroupWide" to SddsServChipGroupWideVariationsView,
                    "EmbeddedChipGroupDense" to SddsServEmbeddedChipGroupDenseVariationsView,
                    "EmbeddedChipGroupWide" to SddsServEmbeddedChipGroupWideVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to SddsServCounterVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to SddsServDividerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to SddsServIndicatorVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to SddsServLoaderVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Overlay,
                mapOf(
                    "OverlayView" to SddsServOverlayViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to SddsServProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to SddsServCircularProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to SddsServPopoverVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to SddsServRadioBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to SddsServRadioBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to SddsServSegmentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to SddsServSegmentItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to SddsServSwitchVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to SddsServTextFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to SddsServTextAreaVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to SddsServTooltipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Toolbar,
                mapOf(
                    "ToolbarHorizontal" to SddsServToolbarHorizontalVariationsView,
                    "ToolbarVertical" to SddsServToolbarVerticalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to SddsServToastVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to SddsServModalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to SddsServRectSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Note,
                mapOf(
                    "Note" to SddsServNoteVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.NoteCompact,
                mapOf(
                    "NoteCompact" to SddsServNoteCompactVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to SddsServNotificationCompactVariationsView,
                    "NotificationLoose" to SddsServNotificationLooseVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to SddsServNotificationContentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to SddsServListNormalVariationsView,
                    "ListTight" to SddsServListTightVariationsView,
                    "DropdownMenuListNormal" to SddsServDropdownMenuListNormalVariationsView,
                    "DropdownMenuListTight" to SddsServDropdownMenuListTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to SddsServListItemNormalVariationsView,
                    "ListItemTight" to SddsServListItemTightVariationsView,
                    "DropdownMenuItemNormal" to SddsServDropdownMenuItemNormalVariationsView,
                    "DropdownMenuItemTight" to SddsServDropdownMenuItemTightVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to SddsServSpinnerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to SddsServTextSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to SddsServDropdownMenuTightVariationsView,
                    "DropdownMenuNormal" to SddsServDropdownMenuNormalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to SddsServAccordionItemSolidActionStartVariationsView,
                    "AccordionItemSolidActionEnd" to SddsServAccordionItemSolidActionEndVariationsView,
                    "AccordionItemClearActionStart" to SddsServAccordionItemClearActionStartVariationsView,
                    "AccordionItemClearActionEnd" to SddsServAccordionItemClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to SddsServAccordionSolidActionStartVariationsView,
                    "AccordionSolidActionEnd" to SddsServAccordionSolidActionEndVariationsView,
                    "AccordionClearActionStart" to SddsServAccordionClearActionStartVariationsView,
                    "AccordionClearActionEnd" to SddsServAccordionClearActionEndVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to SddsServScrollBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Image,
                mapOf(
                    "ImageView" to SddsServImageViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to SddsServBasicButtonGroupVariationsView,
                    "IconButtonGroup" to SddsServIconButtonGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to SddsServCodeFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to SddsServCodeInputVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to SddsServDrawerCloseNoneVariationsView,
                    "DrawerCloseInner" to SddsServDrawerCloseInnerVariationsView,
                    "DrawerCloseOuter" to SddsServDrawerCloseOuterVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Tabs,
                mapOf(
                    "TabsDefault" to SddsServTabsDefaultVariationsView,
                    "TabsHeader" to SddsServTabsHeaderVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconTabs,
                mapOf(
                    "IconTabs" to SddsServIconTabsVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TabItem,
                mapOf(
                    "TabItemDefault" to SddsServTabItemDefaultVariationsView,
                    "TabItemHeader" to SddsServTabItemHeaderVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconTabItem,
                mapOf(
                    "IconTabItem" to SddsServIconTabItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.PaginationDots,
                mapOf(
                    "PaginationDotsHorizontal" to SddsServPaginationDotsHorizontalVariationsView,
                    "PaginationDotsVertical" to SddsServPaginationDotsVerticalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Autocomplete,
                mapOf(
                    "AutocompleteTight" to SddsServAutocompleteTightVariationsView,
                    "AutocompleteNormal" to SddsServAutocompleteNormalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.DropdownEmptyState,
                mapOf(
                    "DropdownEmptyState" to SddsServDropdownEmptyStateVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Carousel,
                mapOf(
                    "Carousel" to SddsServCarouselVariationsView,
                ),
            ),
        ).associateBy { it.key }
}
