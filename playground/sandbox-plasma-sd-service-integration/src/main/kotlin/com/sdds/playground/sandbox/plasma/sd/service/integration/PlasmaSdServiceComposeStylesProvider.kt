package com.sdds.playground.sandbox.plasma.sd.service.integration

import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.PlasmaSdServiceAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group.PlasmaSdServiceAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.PlasmaSdServiceBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.badge.icon.PlasmaSdServiceIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.basic.PlasmaSdServiceBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.icon.PlasmaSdServiceIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.button.link.PlasmaSdServiceLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.cell.compose.PlasmaSdServiceCellVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.PlasmaSdServiceCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.group.PlasmaSdServiceCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.PlasmaSdServiceChipVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group.PlasmaSdServiceChipGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.counter.PlasmaSdServiceCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.compose.PlasmaSdServiceIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.progress.PlasmaSdServiceProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.PlasmaSdServiceRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group.PlasmaSdServiceRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.switcher.PlasmaSdServiceSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.PlasmaSdServiceTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textarea.clear.PlasmaSdServiceTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.PlasmaSdServiceTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.sd.service.integration.textfield.clear.PlasmaSdServiceTextFieldClearVariationsCompose

/**
 * Провайдер стилей компонентов на Compose для библиотеки PlasmaSdService
 */
object PlasmaSdServiceComposeStylesProvider : StylesProviderCompose {

    override val textField: ComposeStyleProvider<String, TextFieldStyle>
        get() = PlasmaSdServiceTextFieldVariationsCompose
    override val textFieldClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = PlasmaSdServiceTextFieldClearVariationsCompose
    override val textArea: ComposeStyleProvider<String, TextFieldStyle>
        get() = PlasmaSdServiceTextAreaVariationsCompose
    override val textAreaClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = PlasmaSdServiceTextAreaClearVariationsCompose
    override val basicButton: ComposeStyleProvider<String, ButtonStyle>
        get() = PlasmaSdServiceBasicButtonVariationsCompose
    override val iconButton: ComposeStyleProvider<String, ButtonStyle>
        get() = PlasmaSdServiceIconButtonVariationsCompose
    override val linkButton: ComposeStyleProvider<String, ButtonStyle>
        get() = PlasmaSdServiceLinkButtonVariationsCompose
    override val chip: ComposeStyleProvider<String, ChipStyle>
        get() = PlasmaSdServiceChipVariationsCompose
    override val chipGroup: ComposeStyleProvider<String, ChipGroupStyle>
        get() = PlasmaSdServiceChipGroupVariationsCompose
    override val checkBox: ComposeStyleProvider<String, CheckBoxStyle>
        get() = PlasmaSdServiceCheckBoxVariationsCompose
    override val checkBoxGroup: ComposeStyleProvider<String, CheckBoxGroupStyle>
        get() = PlasmaSdServiceCheckBoxGroupVariationsCompose
    override val radioBox: ComposeStyleProvider<String, RadioBoxStyle>
        get() = PlasmaSdServiceRadioBoxVariationsCompose
    override val radioBoxGroup: ComposeStyleProvider<String, RadioBoxGroupStyle>
        get() = PlasmaSdServiceRadioBoxGroupVariationsCompose
    override val avatar: ComposeStyleProvider<String, AvatarStyle>
        get() = PlasmaSdServiceAvatarVariationsCompose
    override val avatarGroup: ComposeStyleProvider<String, AvatarGroupStyle>
        get() = PlasmaSdServiceAvatarGroupVariationsCompose
    override val switch: ComposeStyleProvider<String, SwitchStyle>
        get() = PlasmaSdServiceSwitchVariationsCompose
    override val progress: ComposeStyleProvider<String, ProgressBarStyle>
        get() = PlasmaSdServiceProgressVariationsCompose
    override val cell: ComposeStyleProvider<String, CellStyle>
        get() = PlasmaSdServiceCellVariationsCompose
    override val indicator: ComposeStyleProvider<String, IndicatorStyle>
        get() = PlasmaSdServiceIndicatorVariationsCompose
    override val badgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceBadgeSolidVariationsCompose
    override val badgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceBadgeClearVariationsCompose
    override val badgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceBadgeTransparentVariationsCompose
    override val iconBadgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceIconBadgeSolidVariationsCompose
    override val iconBadgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceIconBadgeClearVariationsCompose
    override val iconBadgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = PlasmaSdServiceIconBadgeTransparentVariationsCompose
    override val counter: ComposeStyleProvider<String, CounterStyle>
        get() = PlasmaSdServiceCounterVariationsCompose
}
