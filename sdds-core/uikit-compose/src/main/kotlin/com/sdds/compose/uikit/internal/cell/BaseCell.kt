package com.sdds.compose.uikit.internal.cell

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.CellGravity
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.internal.common.StyledText

@Composable
internal fun BaseCell(
    modifier: Modifier = Modifier,
    style: CellStyle,
    gravity: CellGravity = CellGravity.Center,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureEnabled: Boolean = false,
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
            startContent?.let {
                startContent()
                Spacer(Modifier.width(style.dimensions.contentPaddingStart))
            }
            Column(
                modifier = Modifier
                    .weight(1f, fill = false)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start,
            ) {
                centerContent?.invoke(this)
            }
            endContent?.let {
                Spacer(Modifier.width(style.dimensions.contentPaddingEnd))
                endContent()
            }
            if (disclosureEnabled && disclosureContent != null) { disclosureContent() }
        }
    }
}

private fun CellGravity.toVerticalAlignment(): Alignment.Vertical {
    return when (this) {
        CellGravity.Top -> Alignment.Top
        CellGravity.Center -> Alignment.CenterVertically
        CellGravity.Bottom -> Alignment.Bottom
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
        text = label,
        textStyle = style.labelStyle,
        textColor = colors.labelColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = title,
        textStyle = style.titleStyle,
        textColor = colors.titleColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = subtitle,
        textStyle = style.subtitleStyle,
        textColor = colors.subtitleColor.colorForInteraction(interactionSource),
    )
}
