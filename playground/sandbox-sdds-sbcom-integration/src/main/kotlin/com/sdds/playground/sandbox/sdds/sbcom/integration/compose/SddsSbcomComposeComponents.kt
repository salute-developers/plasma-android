package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object SddsSbcomComposeComponents : ComponentsProviderCompose() {

    override val generated: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to SddsSbcomAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to SddsSbcomBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to SddsSbcomIconButtonVariationsCompose,
                    "IconButtonClear" to SddsSbcomIconButtonClearVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to SddsSbcomLinkButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to SddsSbcomModalBottomSheetVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to SddsSbcomCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to SddsSbcomChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroup" to SddsSbcomChipGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to SddsSbcomCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to SddsSbcomDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to SddsSbcomIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to SddsSbcomLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to SddsSbcomOverlayVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to SddsSbcomCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to SddsSbcomPopoverVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to SddsSbcomRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to SddsSbcomSegmentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to SddsSbcomSegmentItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to SddsSbcomSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to SddsSbcomTextFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to SddsSbcomTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to SddsSbcomModalVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to SddsSbcomRectSkeletonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to SddsSbcomSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "DropdownMenuList" to SddsSbcomDropdownMenuListVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "DropdownMenuItem" to SddsSbcomDropdownMenuItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenu" to SddsSbcomDropdownMenuVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to SddsSbcomScrollBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to SddsSbcomBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to SddsSbcomIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBar" to SddsSbcomTabBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItem" to SddsSbcomTabBarItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tabs,
                mapOf(
                    "TabsFolder" to SddsSbcomTabsFolderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabItem,
                mapOf(
                    "TabItemFolder" to SddsSbcomTabItemFolderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CollapsingNavigationBar,
                mapOf(
                    "CollapsingNavigationBarMainPage" to SddsSbcomCollapsingNavigationBarMainPageVariationsCompose,
                    "CollapsingNavigationBarInternalPage" to SddsSbcomCollapsingNavigationBarInternalPageVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
