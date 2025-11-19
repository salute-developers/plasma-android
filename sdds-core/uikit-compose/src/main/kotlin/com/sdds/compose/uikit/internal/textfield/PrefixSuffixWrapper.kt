package com.sdds.compose.uikit.internal.textfield

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import kotlin.math.roundToInt

@Composable
internal fun PrefixSuffixWrapper(
    modifier: Modifier = Modifier,
    mainContent: @Composable () -> Unit,
    prefix: (@Composable () -> Unit)?,
    suffix: (@Composable () -> Unit)?,
    textLayoutResult: TextLayoutResult? = null,
) {
    Layout(
        modifier = modifier,
        measurePolicy = remember(textLayoutResult?.getSuffixCoordinates()) {
            PrefixSuffixMeasurePolicy(textLayoutResult)
        },
        content = {
            Box(
                modifier = Modifier
                    .widthIn(20.dp)
                    .then(if (textLayoutResult != null) Modifier.width(IntrinsicSize.Min) else Modifier)
                    .layoutId(MAIN_CONTENT_ID),
            ) {
                mainContent.invoke()
            }
            val prefixSuffixPadding = PREFIX_SUFFIX_PADDING_DP.dp
            prefix?.let {
                Box(
                    modifier = Modifier
                        .layoutId(PREFIX_ID)
                        .padding(end = prefixSuffixPadding),
                ) { prefix.invoke() }
            }
            suffix?.let {
                Box(
                    modifier = Modifier
                        .layoutId(SUFFIX_ID)
                        .padding(start = prefixSuffixPadding),
                ) { suffix.invoke() }
            }
        },
    )
}

private class PrefixSuffixMeasurePolicy(
    private val textLayoutResult: TextLayoutResult?,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val prefixPlaceable = measurables
            .firstOrNull { it.layoutId == PREFIX_ID }
            ?.measure(constraints.copy(minWidth = 0, minHeight = 0))
        val suffixPlaceable = measurables
            .firstOrNull { it.layoutId == SUFFIX_ID }
            ?.measure(constraints.copy(minWidth = 0, minHeight = 0))

        val prefixSuffixWidth = prefixPlaceable.widthOrZero() + suffixPlaceable.widthOrZero()
        val contentConstraints = constraints
            .copy(minHeight = 0, minWidth = 0)
            .offset(horizontal = -prefixSuffixWidth)
        val contentPlaceable = measurables
            .firstOrNull { it.layoutId == MAIN_CONTENT_ID }
            ?.measure(contentConstraints)

        val width = prefixPlaceable.widthOrZero() +
            suffixPlaceable.widthOrZero() +
            contentPlaceable.widthOrZero()
        val height = maxOf(
            prefixPlaceable.heightOrZero(),
            contentPlaceable.heightOrZero(),
            suffixPlaceable.heightOrZero(),
        )

        return layout(
            width = constraints.constrainWidth(width),
            height = constraints.constrainHeight(height),
        ) {
            // Размещаем prefix
            val prefixY = textLayoutResult?.getPrefixY()
                ?: ((height - prefixPlaceable.heightOrZero()) / 2)
            prefixPlaceable?.placeRelative(0, prefixY)

            // Размещаем центральный контент
            val contentX = prefixPlaceable.widthOrZero()
            val contentY = (height - contentPlaceable.heightOrZero()) / 2
            contentPlaceable?.placeRelative(contentX, contentY)

            // Размещаем suffix
            val suffixX: Int
            val suffixY: Int
            if (textLayoutResult != null) {
                val coordinates = textLayoutResult.getSuffixCoordinates()
                suffixX = prefixPlaceable.widthOrZero() + coordinates.x
                suffixY = coordinates.y
            } else {
                suffixX = width - suffixPlaceable.widthOrZero()
                suffixY = (height - suffixPlaceable.heightOrZero()) / 2
            }
            suffixPlaceable?.placeRelative(suffixX, suffixY)
        }
    }
}

private fun TextLayoutResult.getSuffixCoordinates(): IntOffset {
    val lastLine = this.lineCount - 1
    val x = this.getLineRight(lastLine)
    val y = this.getLineTop(lastLine)

    return IntOffset(x.roundToInt(), y.roundToInt())
}

private fun TextLayoutResult.getPrefixY(): Int {
    val y = this.getLineTop(0)
    return y.roundToInt()
}

private const val PREFIX_ID = "Prefix"
private const val SUFFIX_ID = "Suffix"
private const val MAIN_CONTENT_ID = "OriginalTextField"
private const val PREFIX_SUFFIX_PADDING_DP = 4
