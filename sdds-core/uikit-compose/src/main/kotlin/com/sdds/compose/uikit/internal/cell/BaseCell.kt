package com.sdds.compose.uikit.internal.cell

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.Text

@Composable
internal fun BaseCell(
    modifier: Modifier = Modifier,
    style: CellStyle,
    gravity: Cell.Gravity = Cell.Gravity.Center,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    centerContent: (@Composable ColumnScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CompositionLocalProvider(
        LocalAvatarStyle provides style.avatarStyle,
        LocalIconButtonStyle provides style.iconButtonStyle,
        LocalCheckBoxStyle provides style.checkBoxStyle,
        LocalRadioBoxStyle provides style.radioBoxStyle,
        LocalSwitchStyle provides style.switchStyle,
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = gravity.toVerticalAlignment(),
        ) {
            startContent?.let { it() }
            centerContent?.let {
                Column(
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .padding(
                            start = style.dimensions.contentPaddingStart,
                            end = style.dimensions.contentPaddingEnd,
                        ),
                    horizontalAlignment = Alignment.Start,
                ) {
                    it()
                }
            }
            endContent?.let { it() }
            disclosureContent?.let { it() }
        }
    }
}

private fun Cell.Gravity.toVerticalAlignment(): Alignment.Vertical {
    return when (this) {
        Cell.Gravity.Top -> Alignment.Top
        Cell.Gravity.Center -> Alignment.CenterVertically
        Cell.Gravity.Bottom -> Alignment.Bottom
    }
}

@Composable
internal fun ColumnScope.CellCenterContent(
    title: AnnotatedString = AnnotatedString(""),
    label: AnnotatedString = AnnotatedString(""),
    subtitle: AnnotatedString = AnnotatedString(""),
    style: CellStyle,
    interactionSource: InteractionSource,
) {
    val colors = style.colors
    StyledText(
        text = title,
        textStyle = style.titleStyle,
        textColor = colors.titleColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = label,
        textStyle = style.labelStyle,
        textColor = colors.labelColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = subtitle,
        textStyle = style.subtitleStyle,
        textColor = colors.subtitleColor.colorForInteraction(interactionSource),
    )
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
    textStyle: TextStyle,
    textColor: Color,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(color = textColor)
    Text(modifier = modifier, text = text, style = finalStyle)
}
