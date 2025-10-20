package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent

/**
 *  Компоненты
 */
object PlasmaHomedsComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to PlasmaHomedsAvatarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to PlasmaHomedsAvatarGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Badge,
                mapOf(
                    "BadgeClear" to PlasmaHomedsBadgeClearVariationsCompose,
                    "BadgeSolid" to PlasmaHomedsBadgeSolidVariationsCompose,
                    "BadgeTransparent" to PlasmaHomedsBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconBadge,
                mapOf(
                    "IconBadgeClear" to PlasmaHomedsIconBadgeClearVariationsCompose,
                    "IconBadgeSolid" to PlasmaHomedsIconBadgeSolidVariationsCompose,
                    "IconBadgeTransparent" to PlasmaHomedsIconBadgeTransparentVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to PlasmaHomedsCheckBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                mapOf(
                    "CheckBoxGroup" to PlasmaHomedsCheckBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to PlasmaHomedsRadioBoxVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                mapOf(
                    "RadioBoxGroup" to PlasmaHomedsRadioBoxGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to PlasmaHomedsSwitchVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBar,
                mapOf(
                    "TabBar" to PlasmaHomedsTabBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TabBarItem,
                mapOf(
                    "TabBarItem" to PlasmaHomedsTabBarItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to PlasmaHomedsBasicButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to PlasmaHomedsIconButtonVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ButtonGroup,
                mapOf(
                    "BasicButtonGroup" to PlasmaHomedsBasicButtonGroupVariationsCompose,
                    "IconButtonGroup" to PlasmaHomedsIconButtonGroupVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Card,
                mapOf(
                    "Card" to PlasmaHomedsCardVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to PlasmaHomedsCellVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.CircularProgressBar,
                mapOf(
                    "CircularProgressBar" to PlasmaHomedsCircularProgressBarVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Chip,
                mapOf(
                    "Chip" to PlasmaHomedsChipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                mapOf(
                    "ChipGroupDense" to PlasmaHomedsChipGroupDenseVariationsCompose,
                    "ChipGroupWide" to PlasmaHomedsChipGroupWideVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to PlasmaHomedsCounterVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to PlasmaHomedsDividerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                mapOf(
                    "Indicator" to PlasmaHomedsIndicatorVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Image,
                mapOf(
                    "Image" to PlasmaHomedsImageVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.List,
                mapOf(
                    "List" to PlasmaHomedsListVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.ListItem,
                mapOf(
                    "ListItem" to PlasmaHomedsListItemVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Loader,
                mapOf(
                    "Loader" to PlasmaHomedsLoaderVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Spinner,
                mapOf(
                    "Spinner" to PlasmaHomedsSpinnerVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to PlasmaHomedsTextFieldVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Tooltip,
                mapOf(
                    "Tooltip" to PlasmaHomedsTooltipVariationsCompose,
                ),
            ),
            ComposeComponent(
                ComponentKey.Wheel,
                mapOf(
                    "Wheel" to PlasmaHomedsWheelVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
