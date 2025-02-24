package com.sdds.playground.sandbox.plasma.stards.integration

import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.StarDsAvatarVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.group.StarDsAvatarGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.button.basic.StarDsBasicButtonVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.button.icon.StarDsIconButtonVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.button.link.StarDsLinkButtonVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.cell.vs.StarDsCellVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.StarDsCheckBoxVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group.StarDsCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.chip.StarDsChipVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.chip.group.StarDsChipGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.counter.StarDsCounterVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.indicator.StarDsIndicatorVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.progress.StarDsProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.StarDsRadioBoxVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group.StarDsRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.segment.StarDsSegmentVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.segment.item.StarDsSegmentItemVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.switcher.StarDsSwitchVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.StarDsTextAreaVariationsView
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.StarDsTextFieldVariationsView

/**
 * Провайдер стилей компонентов на ViewSystem для библиотеки StarDs
 */
object StarDsViewStylesProvider : StylesProviderView {
    override val textField: ViewStyleProvider<String>
        get() = StarDsTextFieldVariationsView
    override val textArea: ViewStyleProvider<String>
        get() = StarDsTextAreaVariationsView
    override val basicButton: ViewStyleProvider<String>
        get() = StarDsBasicButtonVariationsView
    override val iconButton: ViewStyleProvider<String>
        get() = StarDsIconButtonVariationsView
    override val linkButton: ViewStyleProvider<String>
        get() = StarDsLinkButtonVariationsView
    override val chip: ViewStyleProvider<String>
        get() = StarDsChipVariationsView
    override val chipGroup: ViewStyleProvider<String>
        get() = StarDsChipGroupVariationsView
    override val checkBox: ViewStyleProvider<String>
        get() = StarDsCheckBoxVariationsView
    override val checkBoxGroup: ViewStyleProvider<String>
        get() = StarDsCheckBoxGroupVariationsView
    override val radioBox: ViewStyleProvider<String>
        get() = StarDsRadioBoxVariationsView
    override val radioBoxGroup: ViewStyleProvider<String>
        get() = StarDsRadioBoxGroupVariationsView
    override val avatar: ViewStyleProvider<String>
        get() = StarDsAvatarVariationsView
    override val avatarGroup: ViewStyleProvider<String>
        get() = StarDsAvatarGroupVariationsView
    override val switch: ViewStyleProvider<String>
        get() = StarDsSwitchVariationsView
    override val progress: ViewStyleProvider<String>
        get() = StarDsProgressBarVariationsView
    override val badge: ViewStyleProvider<String>
        get() = StarDsBadgeVariationsView
    override val iconBadge: ViewStyleProvider<String>
        get() = StarDsIconBadgeVariationsView
    override val cell: ViewStyleProvider<String>
        get() = StarDsCellVariationsView
    override val counter: ViewStyleProvider<String>
        get() = StarDsCounterVariationsView
    override val segmentItem: ViewStyleProvider<String>
        get() = StarDsSegmentItemVariationsView
    override val segment: ViewStyleProvider<String>
        get() = StarDsSegmentVariationsView
    override val indicator: ViewStyleProvider<String>
        get() = StarDsIndicatorVariationsView
}
