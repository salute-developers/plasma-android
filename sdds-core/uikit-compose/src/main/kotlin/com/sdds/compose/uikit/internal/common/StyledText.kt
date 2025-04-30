package com.sdds.compose.uikit.internal.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.sdds.compose.uikit.Text

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
    textStyle: TextStyle,
    textColor: Color,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(color = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines, overflow = overflow)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
    textStyle: TextStyle,
    textColor: Brush,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(brush = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines, overflow = overflow)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    textColor: Color,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(color = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines, overflow = overflow)
}

@Composable
internal fun StyledText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle,
    textColor: Brush,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    if (text.isEmpty()) return
    val finalStyle = textStyle.copy(brush = textColor)
    Text(modifier = modifier, text = text, style = finalStyle, maxLines = maxLines, overflow = overflow)
}
