package com.sdds.playground.sandbox.stylessalute.integration

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.core.integration.component.ViewComponent
import com.sdds.playground.sandbox.stylessalute.integration.avatar.StylesSaluteAvatarVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.avatar.group.StylesSaluteAvatarGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeClearVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeSolidVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeTransparentVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeClearVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeSolidVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeTransparentVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.basic.StylesSaluteBasicButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.icon.StylesSaluteIconButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.link.StylesSaluteLinkButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.cell.vs.StylesSaluteCellVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.StylesSaluteCheckBoxVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.group.StylesSaluteCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.StylesSaluteChipVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.StylesSaluteEmbeddedChipVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteChipGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteEmbeddedChipGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.counter.StylesSaluteCounterVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.indicator.vs.StylesSaluteIndicatorVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.popover.vs.StylesSalutePopoverVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.progress.StylesSaluteProgressBarVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.StylesSaluteRadioBoxVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.group.StylesSaluteRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.segment.StylesSaluteSegmentVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.segment.item.StylesSaluteSegmentItemVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.switcher.StylesSaluteSwitchVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.textarea.StylesSaluteTextAreaVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.textfield.StylesSaluteTextFieldVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.toast.StylesSaluteToastVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.tooltip.vs.StylesSaluteTooltipVariationsView

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object StylesSaluteViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                StylesSaluteAvatarVariationsView,
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                StylesSaluteAvatarGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                StylesSaluteBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                StylesSaluteBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                StylesSaluteBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                StylesSaluteIconBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                StylesSaluteBasicButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.IconButton,
                StylesSaluteIconButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                StylesSaluteLinkButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.Cell,
                StylesSaluteCellVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                StylesSaluteCheckBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                StylesSaluteCheckBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Chip,
                StylesSaluteChipVariationsView,
            ),
            ViewComponent(
                ComponentKey("EmbeddedChip", CoreComponent.CHIP),
                StylesSaluteEmbeddedChipVariationsView,
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                StylesSaluteChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("EmbeddedChipGroup", CoreComponent.CHIP_GROUP),
                StylesSaluteEmbeddedChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Counter,
                StylesSaluteCounterVariationsView,
            ),
            ViewComponent(
                ComponentKey.Flow,
                ViewStyleProvider.Empty,
            ),
            ViewComponent(
                ComponentKey.Indicator,
                StylesSaluteIndicatorVariationsView,
            ),
            ViewComponent(
                ComponentKey.Popover,
                StylesSalutePopoverVariationsView,
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                StylesSaluteProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                StylesSaluteRadioBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                StylesSaluteRadioBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Segment,
                StylesSaluteSegmentVariationsView,
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                StylesSaluteSegmentItemVariationsView,
            ),
            ViewComponent(
                ComponentKey.Switch,
                StylesSaluteSwitchVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextField,
                StylesSaluteTextFieldVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextArea,
                StylesSaluteTextAreaVariationsView,
            ),
            ViewComponent(
                ComponentKey.Toast,
                StylesSaluteToastVariationsView,
            ),
            ViewComponent(
                ComponentKey.Tooltip,
                StylesSaluteTooltipVariationsView,
            ),
        ).associateBy { it.key }
}
