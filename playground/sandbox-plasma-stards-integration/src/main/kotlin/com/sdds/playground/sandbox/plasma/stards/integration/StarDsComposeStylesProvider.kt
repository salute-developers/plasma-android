package com.sdds.playground.sandbox.plasma.stards.integration

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
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.StarDsAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.avatar.group.StarDsAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.StarDsBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.badge.icon.StarDsIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.basic.StarDsBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.icon.StarDsIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.button.link.StarDsLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.cell.compose.StarDsCellVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.StarDsCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group.StarDsCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.chip.StarDsChipVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.chip.group.StarDsChipGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.counter.StarDsCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.indicator.StarDsIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.progress.StarDsProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.StarDsRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group.StarDsRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.switcher.StarDsSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.StarDsTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textarea.clear.StarDsTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.StarDsTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.stards.integration.textfield.clear.StarDsTextFieldClearVariationsCompose

/**
 * Провайдер стилей компонентов на Compose для библиотеки StarDs
 */
object StarDsComposeStylesProvider : StylesProviderCompose {

    override val textField: ComposeStyleProvider<String, TextFieldStyle>
        get() = StarDsTextFieldVariationsCompose
    override val textFieldClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = StarDsTextFieldClearVariationsCompose
    override val textArea: ComposeStyleProvider<String, TextFieldStyle>
        get() = StarDsTextAreaVariationsCompose
    override val textAreaClear: ComposeStyleProvider<String, TextFieldStyle>
        get() = StarDsTextAreaClearVariationsCompose
    override val basicButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StarDsBasicButtonVariationsCompose
    override val iconButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StarDsIconButtonVariationsCompose
    override val linkButton: ComposeStyleProvider<String, ButtonStyle>
        get() = StarDsLinkButtonVariationsCompose
    override val chip: ComposeStyleProvider<String, ChipStyle>
        get() = StarDsChipVariationsCompose
    override val chipGroup: ComposeStyleProvider<String, ChipGroupStyle>
        get() = StarDsChipGroupVariationsCompose
    override val checkBox: ComposeStyleProvider<String, CheckBoxStyle>
        get() = StarDsCheckBoxVariationsCompose
    override val checkBoxGroup: ComposeStyleProvider<String, CheckBoxGroupStyle>
        get() = StarDsCheckBoxGroupVariationsCompose
    override val radioBox: ComposeStyleProvider<String, RadioBoxStyle>
        get() = StarDsRadioBoxVariationsCompose
    override val radioBoxGroup: ComposeStyleProvider<String, RadioBoxGroupStyle>
        get() = StarDsRadioBoxGroupVariationsCompose
    override val avatar: ComposeStyleProvider<String, AvatarStyle>
        get() = StarDsAvatarVariationsCompose
    override val avatarGroup: ComposeStyleProvider<String, AvatarGroupStyle>
        get() = StarDsAvatarGroupVariationsCompose
    override val switch: ComposeStyleProvider<String, SwitchStyle>
        get() = StarDsSwitchVariationsCompose
    override val progress: ComposeStyleProvider<String, ProgressBarStyle>
        get() = StarDsProgressVariationsCompose
    override val cell: ComposeStyleProvider<String, CellStyle>
        get() = StarDsCellVariationsCompose
    override val indicator: ComposeStyleProvider<String, IndicatorStyle>
        get() = StarDsIndicatorVariationsCompose
    override val badgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsBadgeSolidVariationsCompose
    override val badgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsBadgeClearVariationsCompose
    override val badgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsBadgeTransparentVariationsCompose
    override val iconBadgeSolid: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsIconBadgeSolidVariationsCompose
    override val iconBadgeClear: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsIconBadgeClearVariationsCompose
    override val iconBadgeTransparent: ComposeStyleProvider<String, BadgeStyle>
        get() = StarDsIconBadgeTransparentVariationsCompose
    override val counter: ComposeStyleProvider<String, CounterStyle>
        get() = StarDsCounterVariationsCompose
}
