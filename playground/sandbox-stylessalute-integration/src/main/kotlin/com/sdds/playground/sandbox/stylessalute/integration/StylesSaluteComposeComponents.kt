package com.sdds.playground.sandbox.stylessalute.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.stylessalute.integration.avatar.StylesSaluteAvatarVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.avatar.group.StylesSaluteAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.basic.StylesSaluteBasicButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.icon.StylesSaluteIconButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.button.link.StylesSaluteLinkButtonVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.cell.compose.StylesSaluteCellVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.StylesSaluteCheckBoxVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.group.StylesSaluteCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.StylesSaluteChipVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteChipGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.counter.StylesSaluteCounterVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.indicator.compose.StylesSaluteIndicatorVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.progress.StylesSaluteProgressVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.StylesSaluteRadioBoxVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.group.StylesSaluteRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.segment.StylesSaluteSegmentVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.segment.item.StylesSaluteSegmentItemVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.switcher.StylesSaluteSwitchVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.StylesSaluteTextAreaVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.clear.StylesSaluteTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.StylesSaluteTextFieldVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.clear.StylesSaluteTextFieldClearVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object StylesSaluteComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                StylesSaluteAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                StylesSaluteAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                StylesSaluteBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                StylesSaluteBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                StylesSaluteBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                StylesSaluteBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                StylesSaluteIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                StylesSaluteLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                StylesSaluteCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                StylesSaluteCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                StylesSaluteCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                StylesSaluteChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                StylesSaluteChipGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                StylesSaluteCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                StylesSaluteIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                StylesSaluteProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                StylesSaluteRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                StylesSaluteRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                StylesSaluteSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                StylesSaluteTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                StylesSaluteTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                StylesSaluteTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                StylesSaluteTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                StylesSaluteSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                StylesSaluteSegmentVariationsCompose,
            ),
        ).associateBy { it.key }
}
