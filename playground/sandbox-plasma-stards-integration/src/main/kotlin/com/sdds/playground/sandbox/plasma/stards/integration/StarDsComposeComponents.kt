package com.sdds.playground.sandbox.plasma.stards.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.StarDsAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.group.StarDsAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.basic.StarDsBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.icon.StarDsIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.link.StarDsLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.cell.compose.StarDsCellVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.StarDsCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group.StarDsCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.chip.StarDsChipVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.chip.group.StarDsChipGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.counter.StarDsCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.indicator.StarDsIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.progress.StarDsProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.StarDsRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group.StarDsRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.segment.item.StarDsSegmentItemVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.switcher.StarDsSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.StarDsTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.clear.StarDsTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.StarDsTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.clear.StarDsTextFieldClearVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object StarDsComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                StarDsAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                StarDsAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                StarDsBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                StarDsBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                StarDsIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                StarDsIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                StarDsBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                StarDsIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                StarDsLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                StarDsCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                StarDsCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                StarDsCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                StarDsChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                StarDsChipGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                StarDsCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                StarDsIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                StarDsProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                StarDsRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                StarDsRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                StarDsSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                StarDsTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                StarDsTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                StarDsTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                StarDsTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                StarDsSegmentItemVariationsCompose,
            ),
        ).associateBy { it.key }
}
