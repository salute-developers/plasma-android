package com.sdds.playground.sandbox.plasma.sd.service.integration

import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.PlasmaSdServiceAvatarVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group.PlasmaSdServiceAvatarGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.basic.PlasmaSdServiceBasicButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon.PlasmaSdServiceIconButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.link.PlasmaSdServiceLinkButtonVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.cell.PlasmaSdServiceCellVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.PlasmaSdServiceCheckBoxVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.group.PlasmaSdServiceCheckBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.PlasmaSdServiceChipVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceChipGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.counter.PlasmaSdServiceCounterVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.PlasmaSdServiceIndicatorVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.progress.PlasmaSdServiceProgressBarVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.PlasmaSdServiceRadioBoxVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group.PlasmaSdServiceRadioBoxGroupVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.PlasmaSdServiceSegmentVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item.PlasmaSdServiceSegmentItemVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.switcher.PlasmaSdServiceSwitchVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.PlasmaSdServiceTextAreaVariationsView
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.PlasmaSdServiceTextFieldVariationsView

/**
 * Провайдер стилей компонентов на ViewSystem для библиотеки PlasmaSdService
 */
object PlasmaSdServiceViewStylesProvider : StylesProviderView {
    override val textField: ViewStyleProvider<String>
        get() = PlasmaSdServiceTextFieldVariationsView
    override val textArea: ViewStyleProvider<String>
        get() = PlasmaSdServiceTextAreaVariationsView
    override val basicButton: ViewStyleProvider<String>
        get() = PlasmaSdServiceBasicButtonVariationsView
    override val iconButton: ViewStyleProvider<String>
        get() = PlasmaSdServiceIconButtonVariationsView
    override val linkButton: ViewStyleProvider<String>
        get() = PlasmaSdServiceLinkButtonVariationsView
    override val chip: ViewStyleProvider<String>
        get() = PlasmaSdServiceChipVariationsView
    override val chipGroup: ViewStyleProvider<String>
        get() = PlasmaSdServiceChipGroupVariationsView
    override val checkBox: ViewStyleProvider<String>
        get() = PlasmaSdServiceCheckBoxVariationsView
    override val checkBoxGroup: ViewStyleProvider<String>
        get() = PlasmaSdServiceCheckBoxGroupVariationsView
    override val radioBox: ViewStyleProvider<String>
        get() = PlasmaSdServiceRadioBoxVariationsView
    override val radioBoxGroup: ViewStyleProvider<String>
        get() = PlasmaSdServiceRadioBoxGroupVariationsView
    override val avatar: ViewStyleProvider<String>
        get() = PlasmaSdServiceAvatarVariationsView
    override val avatarGroup: ViewStyleProvider<String>
        get() = PlasmaSdServiceAvatarGroupVariationsView
    override val switch: ViewStyleProvider<String>
        get() = PlasmaSdServiceSwitchVariationsView
    override val progress: ViewStyleProvider<String>
        get() = PlasmaSdServiceProgressBarVariationsView
    override val badge: ViewStyleProvider<String>
        get() = PlasmaSdServiceBadgeVariationsView
    override val iconBadge: ViewStyleProvider<String>
        get() = PlasmaSdServiceIconBadgeVariationsView
    override val cell: ViewStyleProvider<String>
        get() = PlasmaSdServiceCellVariationsView
    override val counter: ViewStyleProvider<String>
        get() = PlasmaSdServiceCounterVariationsView
    override val segmentItem: ViewStyleProvider<String>
        get() = PlasmaSdServiceSegmentItemVariationsView
    override val segment: ViewStyleProvider<String>
        get() = PlasmaSdServiceSegmentVariationsView
    override val indicator: ViewStyleProvider<String>
        get() = PlasmaSdServiceIndicatorVariationsView
}
