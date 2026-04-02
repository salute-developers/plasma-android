// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Компоненты
 */
object SddsSbcomComposeComponents : ComponentProvider() {

    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to SddsSbcomAvatarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to SddsSbcomBasicButtonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to SddsSbcomIconButtonVariationsCompose,
                    "IconButtonClear" to SddsSbcomIconButtonClearVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to SddsSbcomLinkButtonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to SddsSbcomModalBottomSheetVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to SddsSbcomCheckBoxVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to SddsSbcomChipVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroup" to SddsSbcomChipGroupVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to SddsSbcomCounterVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to SddsSbcomDividerVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to SddsSbcomIndicatorVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to SddsSbcomLoaderVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to SddsSbcomOverlayVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to SddsSbcomCircularProgressBarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Popover,
                mapOf(
                    "Popover" to SddsSbcomPopoverVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to SddsSbcomRadioBoxVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Segment,
                mapOf(
                    "Segment" to SddsSbcomSegmentVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.SegmentItem,
                mapOf(
                    "SegmentItem" to SddsSbcomSegmentItemVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to SddsSbcomSwitchVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to SddsSbcomTextFieldVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to SddsSbcomTooltipVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to SddsSbcomModalVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.RectSkeleton,
                mapOf(
                    "RectSkeleton" to SddsSbcomRectSkeletonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to SddsSbcomSpinnerVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.List,
                mapOf(
                    "DropdownMenuList" to SddsSbcomDropdownMenuListVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ListItem,
                mapOf(
                    "DropdownMenuItem" to SddsSbcomDropdownMenuItemVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenu" to SddsSbcomDropdownMenuVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to SddsSbcomScrollBarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to SddsSbcomBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to SddsSbcomIconButtonGroupVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TabBar,
                mapOf(
                    "TabBar" to SddsSbcomTabBarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItem" to SddsSbcomTabBarItemVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Tabs,
                mapOf(
                    "TabsFolder" to SddsSbcomTabsFolderVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TabItem,
                mapOf(
                    "TabItemFolder" to SddsSbcomTabItemFolderVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.CollapsingNavigationBar,
                mapOf(
                    "CollapsingNavigationBarMainPage" to SddsSbcomCollapsingNavigationBarMainPageVariationsCompose,
                    "CollapsingNavigationBarInternalPage" to SddsSbcomCollapsingNavigationBarInternalPageVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
