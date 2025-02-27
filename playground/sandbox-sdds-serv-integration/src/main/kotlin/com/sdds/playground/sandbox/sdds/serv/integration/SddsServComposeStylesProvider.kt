package com.sdds.playground.sandbox.sdds.serv.integration

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
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderCompose
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.SddsServAvatarVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.avatar.group.SddsServAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.SddsServBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.badge.icon.SddsServIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.basic.SddsServBasicButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.icon.SddsServIconButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.button.link.SddsServLinkButtonVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.cell.compose.SddsServCellVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.SddsServCheckBoxVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group.SddsServCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.SddsServChipVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.chip.group.SddsServChipGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.counter.SddsServCounterVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.indicator.compose.SddsServIndicatorVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.progress.SddsServProgressVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.SddsServRadioBoxVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group.SddsServRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.segment.item.SddsServSegmentItemVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.switcher.SddsServSwitchVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.SddsServTextAreaVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textarea.clear.SddsServTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.SddsServTextFieldVariationsCompose
import com.sdds.playground.sandbox.sdds.serv.integration.textfield.clear.SddsServTextFieldClearVariationsCompose

/**
 * Провайдер стилей компонентов на Compose для библиотеки SddsServ
 */
object SddsServComposeStylesProvider : StylesProviderCompose {

    override val textField: ComposeStyleProvider<String, TextFieldStyle>
        get() = SddsServTextFieldVariationsCompose
    override val textFieldClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = SddsServTextFieldClearVariationsCompose
    override val textArea: ComposeStyleProvider<String, TextFieldStyle>
        get() = SddsServTextAreaVariationsCompose
    override val textAreaClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = SddsServTextAreaClearVariationsCompose
    override val basicButton: ComposeStyleProvider<String, ButtonStyle>
        get() = SddsServBasicButtonVariationsCompose
    override val iconButton: ComposeStyleProvider<String, ButtonStyle>
        get() = SddsServIconButtonVariationsCompose
    override val linkButton: ComposeStyleProvider<String, ButtonStyle>
        get() = SddsServLinkButtonVariationsCompose
    override val chip: ComposeStyleProvider<String, ChipStyle>
        get() = SddsServChipVariationsCompose
    override val chipGroup: ComposeStyleProvider<String, ChipGroupStyle>
        get() = SddsServChipGroupVariationsCompose
    override val checkBox: ComposeStyleProvider<String, CheckBoxStyle>
        get() = SddsServCheckBoxVariationsCompose
    override val checkBoxGroup: ComposeStyleProvider<String, CheckBoxGroupStyle>
        get() = SddsServCheckBoxGroupVariationsCompose
    override val radioBox: ComposeStyleProvider<String, RadioBoxStyle>
        get() = SddsServRadioBoxVariationsCompose
    override val radioBoxGroup: ComposeStyleProvider<String, RadioBoxGroupStyle>
        get() = SddsServRadioBoxGroupVariationsCompose
    override val avatar: ComposeStyleProvider<String, AvatarStyle>
        get() = SddsServAvatarVariationsCompose
    override val avatarGroup: ComposeStyleProvider<String, AvatarGroupStyle>
        get() = SddsServAvatarGroupVariationsCompose
    override val switch: ComposeStyleProvider<String, SwitchStyle>
        get() = SddsServSwitchVariationsCompose
    override val progress: ComposeStyleProvider<String, ProgressBarStyle>
        get() = SddsServProgressVariationsCompose
    override val cell: ComposeStyleProvider<String, CellStyle>
        get() = SddsServCellVariationsCompose
    override val indicator: ComposeStyleProvider<String, IndicatorStyle>
        get() = SddsServIndicatorVariationsCompose
    override val counter: ComposeStyleProvider<String, CounterStyle>
        get() = SddsServCounterVariationsCompose
    override val segmentItem: ComposeStyleProvider<String, SegmentItemStyle>
        get() = SddsServSegmentItemVariationsCompose
    override val badgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServBadgeSolidVariationsCompose
    override val badgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServBadgeClearVariationsCompose
    override val badgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServBadgeTransparentVariationsCompose
    override val iconBadgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServIconBadgeSolidVariationsCompose
    override val iconBadgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServIconBadgeClearVariationsCompose
    override val iconBadgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = SddsServIconBadgeTransparentVariationsCompose
}
