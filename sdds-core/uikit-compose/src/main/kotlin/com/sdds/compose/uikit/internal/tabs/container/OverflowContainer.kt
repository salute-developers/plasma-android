package com.sdds.compose.uikit.internal.tabs.container

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

@Composable
internal fun OverflowRow(
    modifier: Modifier = Modifier,
    items: List<@Composable () -> Unit>,
    disclosure: @Composable () -> Unit,
    spacing: Dp,
    onOverflowIndex: (Int) -> Unit = {},
) {
    if (items.isEmpty()) return
    var firstOverflowIndex by remember { mutableIntStateOf(-1) }

    SubcomposeLayout(modifier) { constraints ->
        val measuredItems = items.mapIndexed { index, item ->
            subcompose(index) { item.invoke() }.firstOrNull()
        }.map { it?.measure(constraints.copy(minWidth = 0, minHeight = 0)) }

        val measuredDisclosure = subcompose("disclosure") { disclosure.invoke() }
            .firstOrNull()?.measure(constraints.copy(minWidth = 0, minHeight = 0))

        val spacingPx = spacing.roundToPx()
        var currentWidth = 0
        var fittingIndex = -1

        for (index in measuredItems.indices) {
            val placeable = measuredItems[index]
            if (currentWidth + placeable.widthOrZero() <= constraints.maxWidth) {
                currentWidth += placeable.widthOrZero() + spacingPx
                fittingIndex = index
            } else {
                while (currentWidth + measuredDisclosure.widthOrZero() > constraints.maxWidth) {
                    currentWidth -= measuredItems[fittingIndex].widthOrZero() + spacingPx
                    fittingIndex -= 1
                }
                break
            }
        }

        firstOverflowIndex = if (fittingIndex < items.lastIndex) {
            fittingIndex + 1
        } else {
            -1
        }
        val desiredHeight = maxOf(
            a = measuredItems.maxBy { it.heightOrZero() }.heightOrZero(),
            b = measuredDisclosure.heightOrZero(),
        )
        val height = minOf(desiredHeight, constraints.maxHeight)
        val fittingItems = measuredItems.take(fittingIndex + 1)
        val disclosureWidth =
            if (firstOverflowIndex != -1) measuredDisclosure.widthOrZero() + spacingPx else 0
        val width = minOf(
            currentWidth - spacingPx + disclosureWidth,
            constraints.maxWidth,
        )
        layout(width, height) {
            var x = 0
            fittingItems.forEach { placeable ->
                placeable?.placeRelative(x, 0)
                x += placeable.widthOrZero() + spacingPx
            }
            if (firstOverflowIndex != -1) {
                measuredDisclosure?.placeRelative(x, 0)
            }
        }
    }

    if (firstOverflowIndex > -1) {
        LaunchedEffect(firstOverflowIndex) {
            onOverflowIndex(firstOverflowIndex)
        }
    }
}

@Composable
internal fun OverflowColumn(
    modifier: Modifier = Modifier,
    items: List<@Composable () -> Unit>,
    disclosure: @Composable () -> Unit,
    spacing: Dp,
    onOverflowIndex: (Int) -> Unit = {},
) {
    if (items.isEmpty()) return
    var firstOverflowIndex by remember { mutableIntStateOf(-1) }

    SubcomposeLayout(modifier) { constraints ->
        val measuredItems = items.mapIndexed { index, item ->
            subcompose(index) { item.invoke() }.firstOrNull()
        }.map { it?.measure(constraints.copy(minWidth = 0, minHeight = 0)) }

        val measuredDisclosure = subcompose("disclosure") { disclosure.invoke() }
            .firstOrNull()?.measure(constraints.copy(minWidth = 0, minHeight = 0))

        val spacingPx = spacing.roundToPx()
        var currentHeight = 0
        var fittingIndex = -1

        for (index in measuredItems.indices) {
            val placeable = measuredItems[index]
            if (currentHeight + placeable.heightOrZero() <= constraints.maxHeight) {
                currentHeight += placeable.heightOrZero() + spacingPx
                fittingIndex = index
            } else {
                while (currentHeight + measuredDisclosure.heightOrZero() > constraints.maxHeight) {
                    currentHeight -= measuredItems[fittingIndex].heightOrZero() + spacingPx
                    fittingIndex -= 1
                }
                break
            }
        }

        firstOverflowIndex = if (fittingIndex < items.lastIndex) {
            fittingIndex + 1
        } else {
            -1
        }
        val desiredWidth = maxOf(
            a = measuredItems.maxBy { it.widthOrZero() }.widthOrZero(),
            b = measuredDisclosure.widthOrZero(),
        )
        val width = minOf(desiredWidth, constraints.maxWidth)
        val fittingItems = measuredItems.take(fittingIndex + 1)
        val disclosureHeight =
            if (firstOverflowIndex != -1) measuredDisclosure.heightOrZero() + spacingPx else 0
        val height = minOf(
            currentHeight - spacingPx + disclosureHeight,
            constraints.maxHeight,
        )
        layout(width, height) {
            var y = 0
            fittingItems.forEach { placeable ->
                placeable?.placeRelative(0, y)
                y += placeable.heightOrZero() + spacingPx
            }
            if (firstOverflowIndex != -1) {
                measuredDisclosure?.placeRelative(0, y)
            }
        }
    }

    if (firstOverflowIndex > -1) {
        LaunchedEffect(firstOverflowIndex) {
            onOverflowIndex(firstOverflowIndex)
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun FittingRowPreview() {
    var overflowIndex by remember { mutableIntStateOf(-1) }

    Column {
        OverflowRow(
            items = listOf(
                { Text("Text0", Modifier.background(Color.Yellow)) },
                { Text("Text1", Modifier.background(Color.Yellow)) },
                { Text("Text2", Modifier.background(Color.Yellow)) },
                { Text("Text3", Modifier.background(Color.Yellow)) },
                { Text("Text4", Modifier.background(Color.Yellow)) },
                { Text("Text5", Modifier.background(Color.Yellow)) },
                { Text("Text6", Modifier.background(Color.Yellow)) },
                { Text("Text7", Modifier.background(Color.Yellow)) },
                { Text("Text8", Modifier.background(Color.Yellow)) },
                { Text("Text9", Modifier.background(Color.Yellow)) },
                { Text("Text10", Modifier.background(Color.Yellow)) },
            ),
            modifier = Modifier,
            onOverflowIndex = { index ->
                overflowIndex = index
            },
            disclosure = {
                Text("Show All", Modifier.background(Color.Blue.copy(0.2f)))
            },
            spacing = 8.dp,
        )
        Text("overflowIndex=$overflowIndex")
    }
}

@Composable
@Preview(showBackground = true)
private fun FittingColumnPreview() {
    var overflowIndex by remember { mutableIntStateOf(-1) }
    Row {
        OverflowColumn(
            items = listOf(
                { Text("Text0", Modifier.background(Color.Yellow)) },
                { Text("Text1", Modifier.background(Color.Yellow)) },
                { Text("Text2", Modifier.background(Color.Yellow)) },
                { Text("Text3", Modifier.background(Color.Yellow)) },
                { Text("Text4", Modifier.background(Color.Yellow)) },
                { Text("Text5", Modifier.background(Color.Yellow)) },
                { Text("Text6", Modifier.background(Color.Yellow)) },
                { Text("Text7", Modifier.background(Color.Yellow)) },
                { Text("Text8", Modifier.background(Color.Yellow)) },
                { Text("Text9", Modifier.background(Color.Yellow)) },
                { Text("Text10", Modifier.background(Color.Yellow)) },
            ),
            onOverflowIndex = { index ->
                overflowIndex = index
            },
            disclosure = {
                Text("Show", Modifier.background(Color.Blue.copy(0.2f)))
            },
            spacing = 8.dp,
        )
        Text("overflowIndex=$overflowIndex")
    }
}
