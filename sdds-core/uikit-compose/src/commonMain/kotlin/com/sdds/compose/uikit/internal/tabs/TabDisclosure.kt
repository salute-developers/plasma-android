package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger

@Composable
internal fun TabItemDisclosure(
    disclosureBtn: (@Composable () -> Unit)?,
    style: TabsStyle,
    dropdownTriggerInfo: MutableState<TriggerInfo>,
    enabled: Boolean,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val disclosureButton = disclosureBtn ?: { TabItemDisclosureDefault() }
    val color =
        style.colors.disclosureColor.colorForInteraction(interactionSource)
    val coloredStyle = style.disclosureTextStyle.copy(color = color)
    CompositionLocalProvider(
        LocalTextStyle provides coloredStyle,
        LocalTint provides color,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .popoverTrigger(dropdownTriggerInfo)
                .height(style.tabItemStyle.dimensions.minHeight)
                .padding(
                    start = style.tabItemStyle.dimensions.paddingStart,
                    end = style.tabItemStyle.dimensions.paddingEnd,
                )
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = interactionSource,
                ) {
                    onClick.invoke()
                },
        ) {
            disclosureButton.invoke()
        }
    }
}

@Composable
private fun TabItemDisclosureDefault(
    modifier: Modifier = Modifier,
    title: String = "ShowAll",
    titleStyle: TextStyle = LocalTextStyle.current,
) {
    Text(
        modifier = modifier,
        text = title,
        style = titleStyle,
    )
}
