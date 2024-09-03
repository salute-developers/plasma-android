package com.sdds.compose.uikit.internal.textfield.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField

@Composable
internal fun OuterLabel(
    modifier: Modifier,
    labelText: String,
    labelTextStyle: TextStyle,
    optional: TextField.FieldType.Optional? = null,
) {
    Row(modifier = modifier) {
        Text(
            text = labelText,
            style = labelTextStyle,
        )
        if (optional != null && optional.optionalText.isNotEmpty()) {
            Text(
                modifier = Modifier.padding(start = optional.startMargin),
                text = optional.optionalText,
                style = labelTextStyle.copy(
                    color = labelTextStyle.color.copy(alpha = optional.labelOptionalAlpha),
                ),
            )
        }
    }
}

internal fun innerLabel(
    labelType: TextField.LabelType,
    labelText: String,
    labelTextStyle: TextStyle,
    optional: TextField.FieldType.Optional?,
): @Composable (() -> Unit)? {
    if (labelType != TextField.LabelType.Inner || labelText.isEmpty()) return null
    return {
        Row {
            Text(
                text = labelText,
                style = labelTextStyle,
            )
            if (optional != null && optional.optionalText.isNotEmpty()) {
                Text(
                    modifier = Modifier.padding(start = optional.startMargin),
                    text = optional.optionalText,
                    style = labelTextStyle.copy(
                        color = labelTextStyle.color.copy(alpha = optional.labelOptionalAlpha),
                    ),
                )
            }
        }
    }
}