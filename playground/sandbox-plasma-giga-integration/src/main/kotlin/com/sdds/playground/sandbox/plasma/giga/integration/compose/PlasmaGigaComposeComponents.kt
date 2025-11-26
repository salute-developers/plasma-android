package com.sdds.playground.sandbox.plasma.giga.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object PlasmaGigaComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaGigaAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaGigaAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to PlasmaGigaBadgeClearVariationsCompose,
                    "BadgeSolid" to PlasmaGigaBadgeSolidVariationsCompose,
                    "BadgeTransparent" to PlasmaGigaBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to PlasmaGigaIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to PlasmaGigaIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to PlasmaGigaIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaGigaBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaGigaIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to PlasmaGigaLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to PlasmaGigaModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Card,
                mapOf(
                    "CardSolid" to PlasmaGigaCardSolidVariationsCompose,
                    "CardClear" to PlasmaGigaCardClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaGigaCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaGigaCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to PlasmaGigaCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaGigaChipVariationsCompose,
                    "EmbeddedChip" to PlasmaGigaEmbeddedChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaGigaChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to PlasmaGigaChipGroupWideVariationsCompose,
                    "EmbeddedChipGroupDense" to PlasmaGigaEmbeddedChipGroupDenseVariationsCompose,
                    "EmbeddedChipGroupWide" to PlasmaGigaEmbeddedChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaGigaCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaGigaDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaGigaIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to PlasmaGigaOverlayVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to PlasmaGigaProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaGigaCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to PlasmaGigaPopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaGigaRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaGigaRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to PlasmaGigaSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to PlasmaGigaSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaGigaSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaGigaTextFieldVariationsCompose,
                    "TextFieldClear" to PlasmaGigaTextFieldClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to PlasmaGigaTextAreaVariationsCompose,
                    "TextAreaClear" to PlasmaGigaTextAreaClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaGigaTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Toast,
                mapOf(
                    "Toast" to PlasmaGigaToastVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to PlasmaGigaModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to PlasmaGigaRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to PlasmaGigaNotificationCompactVariationsCompose,
                    "NotificationLoose" to PlasmaGigaNotificationLooseVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to PlasmaGigaNotificationContentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to PlasmaGigaListNormalVariationsCompose,
                    "ListTight" to PlasmaGigaListTightVariationsCompose,
                    "DropdownMenuListNormal" to PlasmaGigaDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to PlasmaGigaDropdownMenuListTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to PlasmaGigaListItemNormalVariationsCompose,
                    "ListItemTight" to PlasmaGigaListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to PlasmaGigaDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to PlasmaGigaDropdownMenuItemTightVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaGigaSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to PlasmaGigaTextSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaGigaLoaderVariationsCompose,
                    "Loader" to PlasmaGigaLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to PlasmaGigaDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to PlasmaGigaDropdownMenuNormalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AccordionItem,
                mapOf(
                    "AccordionItemSolidActionStart" to PlasmaGigaAccordionItemSolidActionStartVariationsCompose,
                    "AccordionItemSolidActionEnd" to PlasmaGigaAccordionItemSolidActionEndVariationsCompose,
                    "AccordionItemClearActionStart" to PlasmaGigaAccordionItemClearActionStartVariationsCompose,
                    "AccordionItemClearActionEnd" to PlasmaGigaAccordionItemClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Accordion,
                mapOf(
                    "AccordionSolidActionStart" to PlasmaGigaAccordionSolidActionStartVariationsCompose,
                    "AccordionSolidActionEnd" to PlasmaGigaAccordionSolidActionEndVariationsCompose,
                    "AccordionClearActionStart" to PlasmaGigaAccordionClearActionStartVariationsCompose,
                    "AccordionClearActionEnd" to PlasmaGigaAccordionClearActionEndVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to PlasmaGigaScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Image,
                mapOf(
                    "Image" to PlasmaGigaImageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaGigaBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to PlasmaGigaIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBarHasLabelClear" to PlasmaGigaTabBarHasLabelClearVariationsCompose,
                    "TabBarHasLabelSolid" to PlasmaGigaTabBarHasLabelSolidVariationsCompose,
                    "TabBarIslandHasLabelClear" to PlasmaGigaTabBarIslandHasLabelClearVariationsCompose,
                    "TabBarIslandHasLabelSolid" to PlasmaGigaTabBarIslandHasLabelSolidVariationsCompose,
                    "TabBarClear" to PlasmaGigaTabBarClearVariationsCompose,
                    "TabBarSolid" to PlasmaGigaTabBarSolidVariationsCompose,
                    "TabBarIslandClear" to PlasmaGigaTabBarIslandClearVariationsCompose,
                    "TabBarIslandSolid" to PlasmaGigaTabBarIslandSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItemClear" to PlasmaGigaTabBarItemClearVariationsCompose,
                    "TabBarItemSolid" to PlasmaGigaTabBarItemSolidVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeField,
                mapOf(
                    "CodeField" to PlasmaGigaCodeFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to PlasmaGigaCodeInputVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Drawer,
                mapOf(
                    "DrawerCloseNone" to PlasmaGigaDrawerCloseNoneVariationsCompose,
                    "DrawerCloseInner" to PlasmaGigaDrawerCloseInnerVariationsCompose,
                    "DrawerCloseOuter" to PlasmaGigaDrawerCloseOuterVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
