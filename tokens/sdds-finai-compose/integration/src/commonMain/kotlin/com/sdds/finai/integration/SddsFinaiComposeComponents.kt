// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Компоненты
 */
object SddsFinaiComposeComponents : ComponentProvider() {

    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                ComponentKey.Avatar,
                mapOf(
                    "Avatar" to SddsFinaiAvatarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.AvatarGroup,
                mapOf(
                    "AvatarGroup" to SddsFinaiAvatarGroupVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Indicator,
                mapOf(
                    "AvatarIndicator" to SddsFinaiAvatarIndicatorVariationsCompose,
                    "Indicator" to SddsFinaiIndicatorVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.BasicButton,
                mapOf(
                    "BasicButton" to SddsFinaiBasicButtonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.IconButton,
                mapOf(
                    "IconButton" to SddsFinaiIconButtonVariationsCompose,
                    "EmbeddedIconButton" to SddsFinaiEmbeddedIconButtonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.LinkButton,
                mapOf(
                    "LinkButton" to SddsFinaiLinkButtonVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.BottomSheet,
                mapOf(
                    "ModalBottomSheet" to SddsFinaiModalBottomSheetVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Cell,
                mapOf(
                    "Cell" to SddsFinaiCellVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.CheckBox,
                mapOf(
                    "CheckBox" to SddsFinaiCheckBoxVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Chip,
                mapOf(
                    "ChipSolid" to SddsFinaiChipSolidVariationsCompose,
                    "ChipTransparent" to SddsFinaiChipTransparentVariationsCompose,
                    "EmbeddedChip" to SddsFinaiEmbeddedChipVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ChipGroup,
                mapOf(
                    "EmbeddedChipGroup" to SddsFinaiEmbeddedChipGroupVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Counter,
                mapOf(
                    "Counter" to SddsFinaiCounterVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Divider,
                mapOf(
                    "Divider" to SddsFinaiDividerVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.DropdownEmptyState,
                mapOf(
                    "DropdownEmptyState" to SddsFinaiDropdownEmptyStateVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.DropdownMenu,
                mapOf(
                    "DropdownMenuTight" to SddsFinaiDropdownMenuTightVariationsCompose,
                    "DropdownMenuNormal" to SddsFinaiDropdownMenuNormalVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.List,
                mapOf(
                    "ListNormal" to SddsFinaiListNormalVariationsCompose,
                    "ListTight" to SddsFinaiListTightVariationsCompose,
                    "DropdownMenuListNormal" to SddsFinaiDropdownMenuListNormalVariationsCompose,
                    "DropdownMenuListTight" to SddsFinaiDropdownMenuListTightVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ListItem,
                mapOf(
                    "ListItemNormal" to SddsFinaiListItemNormalVariationsCompose,
                    "ListItemTight" to SddsFinaiListItemTightVariationsCompose,
                    "DropdownMenuItemNormal" to SddsFinaiDropdownMenuItemNormalVariationsCompose,
                    "DropdownMenuItemTight" to SddsFinaiDropdownMenuItemTightVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Modal,
                mapOf(
                    "Modal" to SddsFinaiModalVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Overlay,
                mapOf(
                    "Overlay" to SddsFinaiOverlayVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.RadioBox,
                mapOf(
                    "RadioBox" to SddsFinaiRadioBoxVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.ScrollBar,
                mapOf(
                    "ScrollBar" to SddsFinaiScrollBarVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Switch,
                mapOf(
                    "Switch" to SddsFinaiSwitchVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TabItem,
                mapOf(
                    "TabItemDefault" to SddsFinaiTabItemDefaultVariationsCompose,
                    "TabItemHeader" to SddsFinaiTabItemHeaderVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.Tabs,
                mapOf(
                    "TabsDefault" to SddsFinaiTabsDefaultVariationsCompose,
                    "TabsHeader" to SddsFinaiTabsHeaderVariationsCompose,
                ),
            ),
            Component(
                ComponentKey.TextField,
                mapOf(
                    "TextField" to SddsFinaiTextFieldVariationsCompose,
                    "TextFieldClear" to SddsFinaiTextFieldClearVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
