package com.sdds.playground.sandbox.sdds.serv.integration

import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.SddsServAvatarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.group.SddsServAvatarGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.basic.SddsServBasicButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.icon.SddsServIconButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.button.link.SddsServLinkButtonVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.cell.vs.SddsServCellVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.SddsServCheckBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group.SddsServCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServChipVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.counter.SddsServCounterVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.indicator.SddsServIndicatorVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.progress.SddsServProgressBarVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.SddsServRadioBoxVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group.SddsServRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.SddsServSegmentVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.segment.item.SddsServSegmentItemVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.switcher.SddsServSwitchVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.SddsServTextAreaVariationsView
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.SddsServTextFieldVariationsView

/**
 * Провайдер стилей компонентов на ViewSystem для библиотеки SddsServ
 */
object SddsServViewStylesProvider : StylesProviderView {
    override val textField: ViewStyleProvider<String>
        get() = SddsServTextFieldVariationsView
    override val textArea: ViewStyleProvider<String>
        get() = SddsServTextAreaVariationsView
    override val basicButton: ViewStyleProvider<String>
        get() = SddsServBasicButtonVariationsView
    override val iconButton: ViewStyleProvider<String>
        get() = SddsServIconButtonVariationsView
    override val linkButton: ViewStyleProvider<String>
        get() = SddsServLinkButtonVariationsView
    override val chip: ViewStyleProvider<String>
        get() = SddsServChipVariationsView
    override val chipGroup: ViewStyleProvider<String>
        get() = SddsServChipGroupVariationsView
    override val checkBox: ViewStyleProvider<String>
        get() = SddsServCheckBoxVariationsView
    override val checkBoxGroup: ViewStyleProvider<String>
        get() = SddsServCheckBoxGroupVariationsView
    override val radioBox: ViewStyleProvider<String>
        get() = SddsServRadioBoxVariationsView
    override val radioBoxGroup: ViewStyleProvider<String>
        get() = SddsServRadioBoxGroupVariationsView
    override val avatar: ViewStyleProvider<String>
        get() = SddsServAvatarVariationsView
    override val avatarGroup: ViewStyleProvider<String>
        get() = SddsServAvatarGroupVariationsView
    override val switch: ViewStyleProvider<String>
        get() = SddsServSwitchVariationsView
    override val progress: ViewStyleProvider<String>
        get() = SddsServProgressBarVariationsView
    override val badge: ViewStyleProvider<String>
        get() = SddsServBadgeVariationsView
    override val iconBadge: ViewStyleProvider<String>
        get() = SddsServIconBadgeVariationsView
    override val cell: ViewStyleProvider<String>
        get() = SddsServCellVariationsView
    override val counter: ViewStyleProvider<String>
        get() = SddsServCounterVariationsView
    override val segmentItem: ViewStyleProvider<String>
        get() = SddsServSegmentItemVariationsView
    override val segment: ViewStyleProvider<String>
        get() = SddsServSegmentVariationsView
    override val indicator: ViewStyleProvider<String>
        get() = SddsServIndicatorVariationsView
}
