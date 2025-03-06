package com.sdds.compose.uikit.style

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.SegmentItem

interface SegmentScope {
    fun segmentItem(content: @Composable () -> Unit)
}

@Composable
fun SegmentHorizontal(
    modifier: Modifier = Modifier,
//    style: SegmentStyle = LocalSegmentStyle.current,
    stretch: Boolean = true,
    hasBackground: Boolean = false,
    content: @Composable SegmentScope.() -> Unit,
) {
    val segmentScope = remember { SegmentScopeImpl() }
    val stretchModifier = if (stretch) Modifier.fillMaxWidth() else Modifier
    Row(
        modifier = modifier
            .then(stretchModifier),
    ) {
        val itemBoxModifier = if (stretch) {
            Modifier.weight(1f)
        } else {
            Modifier
        }
        segmentScope.content()
        segmentScope.segmentItems.forEach {
            Box(
                modifier = itemBoxModifier,
                propagateMinConstraints = true,
            ) {
                it.invoke()
            }
        }
        segmentScope.reset()
    }
}

@Composable
fun SegmentVertical(
    modifier: Modifier = Modifier,
//    style: SegmentStyle = LocalSegmentStyle.current,
    hasBackground: Boolean = false,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
    ) { content() }
}

private class SegmentScopeImpl : SegmentScope {
    private val _segmentItems = mutableListOf<@Composable () -> Unit>()
    val segmentItems: List<@Composable () -> Unit>
        get() = _segmentItems

    override fun segmentItem(content: @Composable () -> Unit) {
        _segmentItems.add(content)
    }

    fun reset() {
        _segmentItems.clear()
    }
}

@Composable
@Preview
fun SegmentPreview() {
    SegmentHorizontal {
        segmentItem { SegmentItem(label = "Label 1") }
        segmentItem { SegmentItem(label = "Label 2") }
        segmentItem { SegmentItem(label = "Label 3") }
    }
}