package com.sdds.compose.uikit.internal.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.sdds.compose.uikit.LocalTextBehaviour
import com.sdds.compose.uikit.LocalTextBrushProducer
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.TextSource
import com.sdds.compose.uikit.graphics.brush.BrushProducer

@Composable
internal fun BaseText(
    source: TextSource,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = LocalTextBehaviour.current.overflow,
    softWrap: Boolean = LocalTextBehaviour.current.softWrap,
    maxLines: Int = LocalTextBehaviour.current.maxLines,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    brushProducer: BrushProducer? = LocalTextBrushProducer.current,
) {
    val isSolidColor by remember(brushProducer) {
        derivedStateOf { brushProducer != null && brushProducer.invoke() is SolidColor }
    }
    val resolvedStyle by remember(style, brushProducer, isSolidColor) {
        derivedStateOf {
            if (brushProducer != null && !isSolidColor) {
                style.copy(brush = brushProducer.invoke())
            } else {
                style
            }
        }
    }

    val resolvedColorProducer = remember(brushProducer, isSolidColor) {
        if (brushProducer != null && isSolidColor) {
            ColorProducer { (brushProducer() as SolidColor).value }
        } else {
            null
        }
    }
    BasicText(
        text = source.text(),
        modifier = modifier,
        style = resolvedStyle,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
        color = resolvedColorProducer,
    )
}
