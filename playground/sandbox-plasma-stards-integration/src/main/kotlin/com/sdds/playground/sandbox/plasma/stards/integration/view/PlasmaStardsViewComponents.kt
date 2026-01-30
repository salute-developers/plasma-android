package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.ViewComponent

/**
 *  Компоненты
 */
object PlasmaStardsViewComponents : ComponentsProviderView() {

    override val generated: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaStardsAvatarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaStardsAvatarGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeSolid" to PlasmaStardsBadgeSolidVariationsView,
                    "BadgeTransparent" to PlasmaStardsBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeSolid" to PlasmaStardsIconBadgeSolidVariationsView,
                    "IconBadgeTransparent" to PlasmaStardsIconBadgeTransparentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaStardsBasicButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaStardsIconButtonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Card,
                mapOf(
                    "Card" to PlasmaStardsCardVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaStardsCellVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaStardsCheckBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaStardsChipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaStardsChipGroupDenseVariationsView,
                    "ChipGroupWide" to PlasmaStardsChipGroupWideVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaStardsCounterVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaStardsDividerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaStardsIndicatorVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Overlay,
                mapOf(
                    "OverlayView" to PlasmaStardsOverlayViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                mapOf(
                    "ProgressBar" to PlasmaStardsProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaStardsCircularProgressBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to PlasmaStardsPopoverVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaStardsRadioBoxVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaStardsRadioBoxGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to PlasmaStardsSegmentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to PlasmaStardsSegmentItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaStardsSwitchVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaStardsTextFieldVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextArea,
                mapOf(
                    "TextArea" to PlasmaStardsTextAreaVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaStardsTooltipVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Notification,
                mapOf(
                    "NotificationCompact" to PlasmaStardsNotificationCompactVariationsView,
                    "NotificationLoose" to PlasmaStardsNotificationLooseVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.NotificationContent,
                mapOf(
                    "NotificationContent" to PlasmaStardsNotificationContentVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.List,
                mapOf(
                    "List" to PlasmaStardsListVariationsView,
                    "DropdownMenuList" to PlasmaStardsDropdownMenuListVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItem" to PlasmaStardsListItemVariationsView,
                    "DropdownMenuItem" to PlasmaStardsDropdownMenuItemVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaStardsSpinnerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaStardsLoaderVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenu" to PlasmaStardsDropdownMenuVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to PlasmaStardsScrollBarVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Wheel,
                mapOf(
                    "Wheel" to PlasmaStardsWheelVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Image,
                mapOf(
                    "ImageView" to PlasmaStardsImageViewVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaStardsBasicButtonGroupVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.CodeInput,
                mapOf(
                    "CodeInput" to PlasmaStardsCodeInputVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Drawer,
                mapOf(
                    "Drawer" to PlasmaStardsDrawerVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.PaginationDots,
                mapOf(
                    "PaginationDotsHorizontal" to PlasmaStardsPaginationDotsHorizontalVariationsView,
                    "PaginationDotsVertical" to PlasmaStardsPaginationDotsVerticalVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to PlasmaStardsRectSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.TextSkeleton,
                mapOf(
                    "TextSkeleton" to PlasmaStardsTextSkeletonVariationsView,
                ),
            ),
            ViewComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to PlasmaStardsModalVariationsView,
                ),
            ),
        ).associateBy { it.key }
}
