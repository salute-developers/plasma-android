package com.sdds.playground.sandbox.stylessalute.integration

import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.avatar.StylesSaluteAvatarVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.avatar.group.StylesSaluteAvatarGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.StylesSaluteBadgeVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.badge.icon.StylesSaluteIconBadgeVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.basic.StylesSaluteBasicButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.icon.StylesSaluteIconButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.button.link.StylesSaluteLinkButtonVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.cell.StylesSaluteCellVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.StylesSaluteCheckBoxVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.checkbox.group.StylesSaluteCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.StylesSaluteChipVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.chip.group.StylesSaluteChipGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.counter.StylesSaluteCounterVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.indicator.StylesSaluteIndicatorVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.progress.StylesSaluteProgressBarVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.StylesSaluteRadioBoxVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.radiobox.group.StylesSaluteRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.segment.StylesSaluteSegmentVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.segment.item.StylesSaluteSegmentItemVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.switcher.StylesSaluteSwitchVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.textarea.StylesSaluteTextAreaVariationsView
import com.sdds.playground.sandbox.stylessalute.integration.textfield.StylesSaluteTextFieldVariationsView

/**
 * Провайдер стилей компонентов на ViewSystem для библиотеки StylesSalute
 */
object StylesSaluteViewStylesProvider : StylesProviderView {
    override val textField: ViewStyleProvider<String>
        get() = StylesSaluteTextFieldVariationsView
    override val textArea: ViewStyleProvider<String>
        get() = StylesSaluteTextAreaVariationsView
    override val basicButton: ViewStyleProvider<String>
        get() = StylesSaluteBasicButtonVariationsView
    override val iconButton: ViewStyleProvider<String>
        get() = StylesSaluteIconButtonVariationsView
    override val linkButton: ViewStyleProvider<String>
        get() = StylesSaluteLinkButtonVariationsView
    override val chip: ViewStyleProvider<String>
        get() = StylesSaluteChipVariationsView
    override val chipGroup: ViewStyleProvider<String>
        get() = StylesSaluteChipGroupVariationsView
    override val checkBox: ViewStyleProvider<String>
        get() = StylesSaluteCheckBoxVariationsView
    override val checkBoxGroup: ViewStyleProvider<String>
        get() = StylesSaluteCheckBoxGroupVariationsView
    override val radioBox: ViewStyleProvider<String>
        get() = StylesSaluteRadioBoxVariationsView
    override val radioBoxGroup: ViewStyleProvider<String>
        get() = StylesSaluteRadioBoxGroupVariationsView
    override val avatar: ViewStyleProvider<String>
        get() = StylesSaluteAvatarVariationsView
    override val avatarGroup: ViewStyleProvider<String>
        get() = StylesSaluteAvatarGroupVariationsView
    override val switch: ViewStyleProvider<String>
        get() = StylesSaluteSwitchVariationsView
    override val progress: ViewStyleProvider<String>
        get() = StylesSaluteProgressBarVariationsView
    override val badge: ViewStyleProvider<String>
        get() = StylesSaluteBadgeVariationsView
    override val iconBadge: ViewStyleProvider<String>
        get() = StylesSaluteIconBadgeVariationsView
    override val cell: ViewStyleProvider<String>
        get() = StylesSaluteCellVariationsView
    override val counter: ViewStyleProvider<String>
        get() = StylesSaluteCounterVariationsView
    override val segmentItem: ViewStyleProvider<String>
        get() = StylesSaluteSegmentItemVariationsView
    override val segment: ViewStyleProvider<String>
        get() = StylesSaluteSegmentVariationsView
    override val indicator: ViewStyleProvider<String>
        get() = StylesSaluteIndicatorVariationsView
}
