package com.sdds.playground.sandbox.sdds.serv.integration

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderView
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.core.integration.component.ViewComponent
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.SddsServAvatarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.group.SddsServAvatarGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeClearVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeSolidVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeTransparentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeClearVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeSolidVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeTransparentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.basic.SddsServBasicButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.icon.SddsServIconButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.link.SddsServLinkButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.cell.vs.SddsServCellVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.SddsServCheckBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group.SddsServCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServChipVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.counter.SddsServCounterVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.indicator.vs.SddsServIndicatorVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.progress.SddsServProgressBarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.SddsServRadioBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group.SddsServRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.SddsServSegmentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.item.SddsServSegmentItemVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.switcher.SddsServSwitchVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.SddsServTextAreaVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.SddsServTextFieldVariationsView

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object SddsServViewComponents : ComponentsProviderView {

    override val all: Map<ComponentKey, ViewComponent<String>> =
        listOf(
            ViewComponent(
                ComponentKey.Avatar,
                SddsServAvatarVariationsView,
            ),
            ViewComponent(
                ComponentKey.AvatarGroup,
                SddsServAvatarGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                SddsServBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                SddsServBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                SddsServBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                SddsServIconBadgeClearVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                SddsServIconBadgeSolidVariationsView,
            ),
            ViewComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                SddsServIconBadgeTransparentVariationsView,
            ),
            ViewComponent(
                ComponentKey.BasicButton,
                SddsServBasicButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.IconButton,
                SddsServIconButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.LinkButton,
                SddsServLinkButtonVariationsView,
            ),
            ViewComponent(
                ComponentKey.Cell,
                SddsServCellVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBox,
                SddsServCheckBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.CheckBoxGroup,
                SddsServCheckBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Chip,
                SddsServChipVariationsView,
            ),
            ViewComponent(
                ComponentKey.ChipGroup,
                SddsServChipGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Counter,
                SddsServCounterVariationsView,
            ),
            ViewComponent(
                ComponentKey.Indicator,
                SddsServIndicatorVariationsView,
            ),
            ViewComponent(
                ComponentKey.Flow,
                ViewStyleProvider.Empty,
            ),
            ViewComponent(
                ComponentKey.ProgressBar,
                SddsServProgressBarVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBox,
                SddsServRadioBoxVariationsView,
            ),
            ViewComponent(
                ComponentKey.RadioBoxGroup,
                SddsServRadioBoxGroupVariationsView,
            ),
            ViewComponent(
                ComponentKey.Segment,
                SddsServSegmentVariationsView,
            ),
            ViewComponent(
                ComponentKey.SegmentItem,
                SddsServSegmentItemVariationsView,
            ),
            ViewComponent(
                ComponentKey.Switch,
                SddsServSwitchVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextField,
                SddsServTextFieldVariationsView,
            ),
            ViewComponent(
                ComponentKey.TextArea,
                SddsServTextAreaVariationsView,
            ),
        ).associateBy { it.key }
}
