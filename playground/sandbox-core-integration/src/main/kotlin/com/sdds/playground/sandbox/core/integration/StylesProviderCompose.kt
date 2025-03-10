package com.sdds.playground.sandbox.core.integration

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

/**
 * Провайдер стилей для компонентов.
 * Интерфейс расширяется при разработке новых компонентов.
 */
@Suppress("UndocumentedPublicProperty")
interface StylesProviderCompose {
    val textField: ComposeStyleProvider<String, TextFieldStyle>
    val textFieldClear: ComposeStyleProvider<String, TextFieldStyle>
    val textArea: ComposeStyleProvider<String, TextFieldStyle>
    val textAreaClear: ComposeStyleProvider<String, TextFieldStyle>

    val basicButton: ComposeStyleProvider<String, ButtonStyle>
    val iconButton: ComposeStyleProvider<String, ButtonStyle>
    val linkButton: ComposeStyleProvider<String, ButtonStyle>

    val chip: ComposeStyleProvider<String, ChipStyle>
    val chipGroup: ComposeStyleProvider<String, ChipGroupStyle>

    val checkBox: ComposeStyleProvider<String, CheckBoxStyle>
    val checkBoxGroup: ComposeStyleProvider<String, CheckBoxGroupStyle>

    val radioBox: ComposeStyleProvider<String, RadioBoxStyle>
    val radioBoxGroup: ComposeStyleProvider<String, RadioBoxGroupStyle>

    val avatar: ComposeStyleProvider<String, AvatarStyle>
    val avatarGroup: ComposeStyleProvider<String, AvatarGroupStyle>

    val switch: ComposeStyleProvider<String, SwitchStyle>

    val progress: ComposeStyleProvider<String, ProgressBarStyle>
    val cell: ComposeStyleProvider<String, CellStyle>
    val indicator: ComposeStyleProvider<String, IndicatorStyle>

    val badgeSolid: ComposeStyleProvider<String, BadgeStyle>
    val badgeClear: ComposeStyleProvider<String, BadgeStyle>
    val badgeTransparent: ComposeStyleProvider<String, BadgeStyle>

    val iconBadgeSolid: ComposeStyleProvider<String, BadgeStyle>
    val iconBadgeClear: ComposeStyleProvider<String, BadgeStyle>
    val iconBadgeTransparent: ComposeStyleProvider<String, BadgeStyle>

    val counter: ComposeStyleProvider<String, CounterStyle>
}
