package com.sdds.compose.uikit.internal.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.Text

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
    textStyle: TextStyle,
    textColor: Color,
    maxLines: Int = Int.MAX_VALUE,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(color = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
    textStyle: TextStyle,
    textColor: Brush,
    maxLines: Int = Int.MAX_VALUE,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(brush = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    textColor: Color,
    maxLines: Int = Int.MAX_VALUE,
) {
    StyledText(modifier, AnnotatedString(text), textStyle, textColor, maxLines)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    textColor: Brush,
    maxLines: Int = Int.MAX_VALUE,
) {
    StyledText(modifier, AnnotatedString(text), textStyle, textColor, maxLines)
}
