package com.sdds.playground.sandbox.stylessalute.integration

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
import com.sdds.playground.sandbox.stylessalute.integration.switcher.StylesSaluteSwitchVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.StylesSaluteTextAreaVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textarea.clear.StylesSaluteTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.StylesSaluteTextFieldVariationsCompose
import com.sdds.playground.sandbox.stylessalute.integration.textfield.clear.StylesSaluteTextFieldClearVariationsCompose

/**
 * Провайдер стилей компонентов на Compose для библиотеки StylesSalute
 */
object StylesSaluteComposeStylesProvider : StylesProviderCompose {

    override val textField: ComposeStyleProvider<String, TextFieldStyle>
        get() = StylesSaluteTextFieldVariationsCompose
    override val textFieldClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = StylesSaluteTextFieldClearVariationsCompose
    override val textArea: ComposeStyleProvider<String, TextFieldStyle>
        get() = StylesSaluteTextAreaVariationsCompose
    override val textAreaClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = StylesSaluteTextAreaClearVariationsCompose
    override val basicButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StylesSaluteBasicButtonVariationsCompose
    override val iconButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StylesSaluteIconButtonVariationsCompose
    override val linkButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StylesSaluteLinkButtonVariationsCompose
    override val chip: ComposeStyleProvider<String, ChipStyle>
        get() = StylesSaluteChipVariationsCompose
    override val chipGroup: ComposeStyleProvider<String, ChipGroupStyle>
        get() = StylesSaluteChipGroupVariationsCompose
    override val checkBox: ComposeStyleProvider<String, CheckBoxStyle>
        get() = StylesSaluteCheckBoxVariationsCompose
    override val checkBoxGroup: ComposeStyleProvider<String, CheckBoxGroupStyle>
        get() = StylesSaluteCheckBoxGroupVariationsCompose
    override val radioBox: ComposeStyleProvider<String, RadioBoxStyle>
        get() = StylesSaluteRadioBoxVariationsCompose
    override val radioBoxGroup: ComposeStyleProvider<String, RadioBoxGroupStyle>
        get() = StylesSaluteRadioBoxGroupVariationsCompose
    override val avatar: ComposeStyleProvider<String, AvatarStyle>
        get() = StylesSaluteAvatarVariationsCompose
    override val avatarGroup: ComposeStyleProvider<String, AvatarGroupStyle>
        get() = StylesSaluteAvatarGroupVariationsCompose
    override val switch: ComposeStyleProvider<String, SwitchStyle>
        get() = StylesSaluteSwitchVariationsCompose
    override val progress: ComposeStyleProvider<String, ProgressBarStyle>
        get() = StylesSaluteProgressVariationsCompose
    override val cell: ComposeStyleProvider<String, CellStyle>
        get() = StylesSaluteCellVariationsCompose
    override val indicator: ComposeStyleProvider<String, IndicatorStyle>
        get() = StylesSaluteIndicatorVariationsCompose
    override val badgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteBadgeSolidVariationsCompose
    override val badgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteBadgeClearVariationsCompose
    override val badgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteBadgeTransparentVariationsCompose
    override val iconBadgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteIconBadgeSolidVariationsCompose
    override val iconBadgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteIconBadgeClearVariationsCompose
    override val iconBadgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = StylesSaluteIconBadgeTransparentVariationsCompose
    override val counter: ComposeStyleProvider<String, CounterStyle>
        get() = StylesSaluteCounterVariationsCompose
}
