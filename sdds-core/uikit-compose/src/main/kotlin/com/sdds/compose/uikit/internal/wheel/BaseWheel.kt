package com.sdds.compose.uikit.internal.wheel

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListLayoutInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DataEdgePlacement
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextAfterMode
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sign

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Suppress("LongMethod", "CyclomaticComplexMethod")
internal fun BaseWheel(
    modifier: Modifier = Modifier,
    items: List<WheelItemData>,
    description: String?,
    textStyle: TextStyle,
    textAfterStyle: TextStyle,
    descriptionStyle: TextStyle,
    textAfterPadding: Dp,
    descriptionPadding: Dp,
    itemSpacing: Dp,
    textColor: InteractiveColor,
    textAfterColor: InteractiveColor,
    descriptionColor: InteractiveColor,
    hasControls: Boolean,
    iconUpColor: InteractiveColor,
    iconDownColor: InteractiveColor,
    alignment: WheelItemAlignment,
    dataEdgePlacement: DataEdgePlacement,
    initialIndex: Int,
    visibleItemsCount: Int,
    textAfterMode: TextAfterMode = TextAfterMode.EachItem,
    staticTextAfter: String? = null,
    @DrawableRes
    iconUp: Int? = null,
    @DrawableRes
    iconDown: Int? = null,
    onItemSelected: (Int) -> Unit = {},
    onLabelPositionCalculated: ((Float) -> Unit)? = null,
    onItemHeightCalculated: ((Int) -> Unit)? = null,
    interactionSource: InteractionSource,
) {
    require(visibleItemsCount % 2 == 1) { "visibleItemsCount must be odd" }

    val coroutineScope = rememberCoroutineScope()
    val state: LazyListState = rememberLazyListState(initialIndex)
    val middleIndex = visibleItemsCount / 2
    val extendedList = rememberExtendedList(items, dataEdgePlacement, middleIndex)

    LaunchedEffect(state.firstVisibleItemIndex) {
        val selectedIndex = state.firstVisibleItemIndex + middleIndex
        if (selectedIndex in extendedList.indices) {
            val dataIndex = when (dataEdgePlacement) {
                DataEdgePlacement.WheelCenter -> selectedIndex - middleIndex
                DataEdgePlacement.WheelEdge -> selectedIndex
            }
            if (dataIndex in items.indices) {
                onItemSelected(dataIndex)
            }
        }
    }

    val textMeasurer = rememberTextMeasurer()
    val maxDistanceFromCenter by remember { derivedStateOf { state.layoutInfo.viewportSize.height / 2f } }
    var itemHeight by remember(visibleItemsCount, description) { mutableIntStateOf(0) }
    var descriptionHeight by remember(description, descriptionStyle) { mutableIntStateOf(0) }
    val staticTextAfterText = remember(items, staticTextAfter) {
        staticTextAfter ?: items.firstOrNull { it.textAfter.isNotEmpty() }?.textAfter
    }
    val scaledWheelHeight = rememberCalculatedWheelHeight(itemHeight, descriptionHeight, visibleItemsCount)
    val labelOffsetFromCenter =
        calculateLabelOffset(scaledWheelHeight, itemHeight, itemSpacing.toPx())
    onLabelPositionCalculated?.invoke(labelOffsetFromCenter)
    onItemHeightCalculated?.invoke(itemHeight)

    SubcomposeLayout(
        modifier = modifier,
    ) { constraints ->
        fun measureDescriptionProbe(): Placeable? {
            return subcompose(WheelSubcomposeSlot.DescriptionProbe) {
                if (!description.isNullOrEmpty()) {
                    Description(
                        text = description,
                        descriptionPadding = descriptionPadding,
                        style = descriptionStyle,
                        interactionSource = interactionSource,
                    )
                }
            }
                .firstOrNull()
                ?.measure(constraints.probeConstraints())
        }

        fun measureItemProbe(): WheelItemProbe {
            if (extendedList.isEmpty()) return WheelItemProbe()

            val mostWideItem = findMostWideItem(
                items = extendedList,
                textAfterMode = textAfterMode,
                textAfterPadding = textAfterPadding.roundToPx(),
                textStyle = textStyle,
                textAfterStyle = textAfterStyle,
                measureText = { text, style -> textMeasurer.measure(text, style).size.width },
            )
            val placeable = subcompose(WheelSubcomposeSlot.ItemProbe) {
                Item(
                    title = mostWideItem.text,
                    textAfter = if (textAfterMode == TextAfterMode.Static) null else mostWideItem.textAfter,
                    description = description,
                    descriptionPadding = descriptionPadding,
                    textAfterPadding = textAfterPadding,
                    textStyle = textStyle,
                    textAfterStyle = textAfterStyle,
                    descriptionStyle = descriptionStyle,
                    textColor = textColor,
                    textAfterColor = textAfterColor,
                    alignment = alignment,
                    itemSpacing = itemSpacing,
                    interactionSource = interactionSource,
                )
            }[0].measure(constraints.probeConstraints())
            return WheelItemProbe(width = placeable.width, height = placeable.height)
        }

        fun measureViewport(width: Int, staticEndPadding: Dp): Placeable {
            val viewportHeight = scaledWheelHeight.roundToInt().coerceAtLeast(0)
            return subcompose(WheelSubcomposeSlot.LazyColumn) {
                WheelViewport(
                    height = viewportHeight.toDp(),
                    alignment = alignment,
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(itemHeight.toDp() * visibleItemsCount)
                            .padding(end = staticEndPadding),
                        state = state,
                        horizontalAlignment = alignment.getListAlignment(),
                        flingBehavior = rememberSnapFlingBehavior(lazyListState = state),
                    ) {
                        items(count = extendedList.size) { index ->
                            val distanceFromCenter by remember(visibleItemsCount) {
                                derivedStateOf {
                                    val viewIndex = index - state.firstVisibleItemIndex
                                    val itemsInfo = state.layoutInfo.visibleItemsInfo
                                    val distance =
                                        if (itemsInfo.isNotEmpty() && viewIndex in itemsInfo.indices) {
                                            val offset = itemsInfo[viewIndex].offset.toFloat()
                                            val itemSize = itemsInfo[viewIndex].size
                                            val d =
                                                abs(maxDistanceFromCenter - (offset + itemSize / 2f))
                                            d
                                        } else {
                                            Float.MAX_VALUE
                                        }
                                    distance
                                }
                            }
                            val factor = calculateDistanceFactor(distanceFromCenter, maxDistanceFromCenter)
                            val isEmptyItem = dataEdgePlacement == DataEdgePlacement.WheelCenter &&
                                (index < middleIndex || index > extendedList.lastIndex - middleIndex)
                            val alpha = if (isEmptyItem) 0f else getAlphaByDistanceFactor(factor)
                            val scale = getScaleByDistanceFactor(factor).coerceIn(0f, 1f)
                            var itemWidth by remember { mutableIntStateOf(0) }
                            val translation by remember(visibleItemsCount, alignment, descriptionHeight) {
                                derivedStateOf {
                                    val viewIndex = index - state.firstVisibleItemIndex
                                    val layoutInfo = state.layoutInfo
                                    val itemsInfo = state.layoutInfo.visibleItemsInfo
                                    if (itemsInfo.isNotEmpty() && viewIndex in itemsInfo.indices) {
                                        getItemTranslation(
                                            layoutInfo = layoutInfo,
                                            itemWidth = itemWidth,
                                            viewIndex = viewIndex,
                                            maxDescriptionCompensation = descriptionHeight,
                                            alignment = alignment,
                                        )
                                    } else {
                                        null
                                    }
                                }
                            }
                            Item(
                                modifier = Modifier
                                    .onSizeChanged { itemWidth = it.width }
                                    .debugBorder(Color.Green)
                                    .graphicsLayer {
                                        this.scaleX = scale
                                        this.scaleY = scale
                                        this.alpha = alpha
                                        this.translationY = translation?.itemTranslationY ?: 0f
                                        this.translationX = translation?.itemTranslationX ?: 0f
                                    }
                                    .debugBorder(Color.Red),
                                title = extendedList[index].text,
                                description = description,
                                textAfter = if (textAfterMode == TextAfterMode.Static) {
                                    null
                                } else {
                                    extendedList[index].textAfter
                                },
                                descriptionOffset = translation?.itemTitleTranslationY ?: 0f,
                                descriptionPadding = descriptionPadding,
                                descriptionStyle = descriptionStyle,
                                itemSpacing = itemSpacing,
                                alignment = alignment,
                                textStyle = textStyle,
                                textAfterStyle = textAfterStyle,
                                textColor = textColor,
                                textAfterColor = textAfterColor,
                                textAfterPadding = textAfterPadding,
                                interactionSource = interactionSource,
                            )
                        }
                    }
                }
            }[0].measure(
                constraints.copy(
                    minWidth = width,
                    maxWidth = width,
                    minHeight = 0,
                    maxHeight = viewportHeight,
                ),
            )
        }

        fun measureDescriptionOverlay(): Placeable? {
            return subcompose(WheelSubcomposeSlot.DescriptionOverlay) {
                if (!description.isNullOrEmpty()) {
                    Description(
                        text = description,
                        descriptionColor = descriptionColor,
                        style = descriptionStyle,
                        interactionSource = interactionSource,
                    )
                }
            }
                .firstOrNull()
                ?.measure(constraints.unconstrainedMin())
        }

        fun measureStaticTextAfter(): Placeable? {
            return subcompose(WheelSubcomposeSlot.StaticTextAfter) {
                if (textAfterMode == TextAfterMode.Static && !staticTextAfterText.isNullOrEmpty()) {
                    val staticColor = textAfterColor.colorForInteraction(interactionSource)
                    Text(
                        text = staticTextAfterText,
                        style = textAfterStyle.copy(staticColor),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
                .firstOrNull()
                ?.measure(constraints.unconstrainedMin())
        }

        fun measureControl(
            slot: WheelSubcomposeSlot,
            maxWidth: Int,
            content: @Composable () -> Unit,
        ): Placeable? {
            return subcompose(slot, content)
                .firstOrNull()
                ?.measure(constraints.copy(minWidth = 0, maxWidth = maxWidth, minHeight = 0))
        }

        if (descriptionHeight == 0 && extendedList.isNotEmpty()) {
            descriptionHeight = measureDescriptionProbe()?.height ?: 0
        }

        val itemProbe = measureItemProbe()
        if (extendedList.isNotEmpty()) {
            itemHeight = itemProbe.height
        }

        val staticTextAfterWidthPx = staticTextAfterText
            ?.takeIf { textAfterMode == TextAfterMode.Static && it.isNotEmpty() }
            ?.let { textMeasurer.measure(it, textAfterStyle).size.width }
            ?: 0
        val maxItemTextWidthPx = if (textAfterMode == TextAfterMode.Static) {
            calculateMaxItemTextWidth(
                items = items,
                textStyle = textStyle,
                measureText = { text, style -> textMeasurer.measure(text, style).size.width },
            )
        } else {
            0
        }
        val staticEndPaddingDp = calculateStaticEndPadding(
            staticTextAfterWidth = staticTextAfterWidthPx,
            textAfterPadding = textAfterPadding.roundToPx(),
            textAfterMode = textAfterMode,
            alignment = alignment,
        ).toDp()
        val lazyColumnWidth = calculateLazyColumnWidth(
            constraints = constraints,
            itemWidth = itemProbe.width,
            staticTextAfterWidth = staticTextAfterWidthPx,
            textAfterPadding = textAfterPadding.roundToPx(),
            textAfterMode = textAfterMode,
            alignment = alignment,
        )
        val staticTextAfterOffsetXPx = calculateStaticTextAfterOffset(
            lazyColumnWidth = lazyColumnWidth,
            maxItemTextWidth = maxItemTextWidthPx,
            staticTextAfterWidth = staticTextAfterWidthPx,
            textAfterPadding = textAfterPadding.roundToPx(),
            textAfterMode = textAfterMode,
            alignment = alignment,
        )

        val viewportPlaceable = measureViewport(lazyColumnWidth, staticEndPaddingDp)
        val viewportHeight = viewportPlaceable.height
        val descriptionPlaceable = measureDescriptionOverlay()
        val staticTextAfterPlaceable = measureStaticTextAfter()
        val topControlPlaceable = measureControl(WheelSubcomposeSlot.TopControl, lazyColumnWidth) {
            if (hasControls && iconUp != null && iconDown != null) {
                TopControl(iconUp, iconUpColor, state, coroutineScope)
            }
        }
        val bottomControlPlaceable = measureControl(WheelSubcomposeSlot.BottomControl, lazyColumnWidth) {
            if (hasControls && iconUp != null && iconDown != null) {
                BottomControl(iconDown, iconDownColor, state, coroutineScope)
            }
        }

        val topControlHeight = topControlPlaceable?.height ?: 0
        val layoutHeight = topControlHeight + viewportHeight + (bottomControlPlaceable?.height ?: 0)

        layout(
            width = lazyColumnWidth.coerceIn(constraints.minWidth, constraints.maxWidth),
            height = layoutHeight.coerceIn(constraints.minHeight, constraints.maxHeight),
        ) {
            topControlPlaceable?.place(
                x = alignment.getHorizontalOffset(lazyColumnWidth, topControlPlaceable.width),
                y = 0,
            )
            viewportPlaceable.place(0, topControlHeight)
            descriptionPlaceable?.place(
                x = alignment.getBoxContentHorizontalOffset(lazyColumnWidth, descriptionPlaceable.width),
                y = topControlHeight +
                    calculateCenterOffset(viewportHeight, descriptionPlaceable.height) +
                    calculateDescriptionOverlayOffset(
                        itemHeight = itemHeight,
                        descriptionHeight = descriptionHeight,
                        descriptionPadding = descriptionPadding.toPx(),
                        itemSpacing = itemSpacing.toPx(),
                    ),
            )
            staticTextAfterPlaceable?.place(
                x = staticTextAfterOffsetXPx,
                y = topControlHeight + calculateSelectedLabelTopOffset(
                    viewportHeight = viewportHeight,
                    itemHeight = itemHeight,
                    visibleItemsCount = visibleItemsCount,
                    selectedItemIndex = middleIndex,
                    itemSpacing = (itemSpacing / 2).roundToPx(),
                ),
            )
            bottomControlPlaceable?.place(
                x = alignment.getHorizontalOffset(lazyColumnWidth, bottomControlPlaceable.width),
                y = topControlHeight + viewportHeight,
            )
        }
    }
}

private enum class WheelSubcomposeSlot {
    DescriptionProbe,
    ItemProbe,
    LazyColumn,
    DescriptionOverlay,
    StaticTextAfter,
    TopControl,
    BottomControl,
}

@Immutable
private data class WheelItemProbe(
    val width: Int = 0,
    val height: Int = 0,
)

@Composable
private fun WheelViewport(
    height: Dp,
    alignment: WheelItemAlignment,
    content: @Composable () -> Unit,
) {
    Layout(
        modifier = Modifier
            .requiredHeight(height)
            .debugBorder(Color.Blue)
            .graphicsLayer { clip = true },
        content = content,
    ) { measurables, constraints ->
        val placeable = measurables.firstOrNull()?.measure(
            constraints.copy(minHeight = 0),
        )
        val layoutWidth = constraints.maxWidth
        val layoutHeight = constraints.maxHeight

        layout(layoutWidth, layoutHeight) {
            placeable?.place(
                x = alignment.getHorizontalOffset(layoutWidth, placeable.width),
                y = calculateCenterOffset(layoutHeight, placeable.height),
            )
        }
    }
}

private fun calculateCenterOffset(parentSize: Int, childSize: Int): Int =
    ((parentSize - childSize) / 2f).roundToInt()

private fun calculateSelectedLabelTopOffset(
    viewportHeight: Int,
    itemHeight: Int,
    visibleItemsCount: Int,
    selectedItemIndex: Int,
    itemSpacing: Int,
): Int {
    if (itemHeight == 0) return 0
    val lazyColumnHeight = itemHeight * visibleItemsCount
    return calculateCenterOffset(viewportHeight, lazyColumnHeight) +
        selectedItemIndex * itemHeight +
        itemSpacing
}

private fun Constraints.probeConstraints(): Constraints =
    copy(
        minWidth = 0,
        minHeight = 0,
        maxHeight = Constraints.Infinity,
    )

private fun Constraints.unconstrainedMin(): Constraints =
    copy(
        minWidth = 0,
        minHeight = 0,
    )

private fun findMostWideItem(
    items: List<WheelItemData>,
    textAfterMode: TextAfterMode,
    textAfterPadding: Int,
    textStyle: TextStyle,
    textAfterStyle: TextStyle,
    measureText: (String, TextStyle) -> Int,
): WheelItemData {
    return if (textAfterMode == TextAfterMode.Static) {
        items.maxBy { data ->
            measureText(data.text, textStyle)
        }
    } else {
        items.maxBy { data ->
            measureText(data.text, textStyle) +
                measureText(data.textAfter, textAfterStyle) +
                if (data.text.isNotEmpty() && data.textAfter.isNotEmpty()) {
                    textAfterPadding
                } else {
                    0
                }
        }
    }
}

private fun calculateMaxItemTextWidth(
    items: List<WheelItemData>,
    textStyle: TextStyle,
    measureText: (String, TextStyle) -> Int,
): Int {
    return items.maxOfOrNull { data -> measureText(data.text, textStyle) } ?: 0
}

private fun calculateStaticEndPadding(
    staticTextAfterWidth: Int,
    textAfterPadding: Int,
    textAfterMode: TextAfterMode,
    alignment: WheelItemAlignment,
): Int {
    return if (
        textAfterMode == TextAfterMode.Static &&
        staticTextAfterWidth > 0 &&
        alignment == WheelItemAlignment.End
    ) {
        staticTextAfterWidth + textAfterPadding
    } else {
        0
    }
}

private fun calculateLazyColumnWidth(
    constraints: Constraints,
    itemWidth: Int,
    staticTextAfterWidth: Int,
    textAfterPadding: Int,
    textAfterMode: TextAfterMode,
    alignment: WheelItemAlignment,
): Int {
    if (constraints.hasFixedWidth) return constraints.maxWidth
    if (textAfterMode != TextAfterMode.Static || staticTextAfterWidth == 0) return itemWidth

    val textAfterExtra = staticTextAfterWidth + textAfterPadding
    val base = itemWidth + textAfterExtra
    // Center: items are centered in the column, so the overlay overflows by
    // (P + T) / 2 on the right unless we add an equal margin on the left.
    return if (alignment == WheelItemAlignment.Center) base + textAfterExtra else base
}

private fun calculateStaticTextAfterOffset(
    lazyColumnWidth: Int,
    maxItemTextWidth: Int,
    staticTextAfterWidth: Int,
    textAfterPadding: Int,
    textAfterMode: TextAfterMode,
    alignment: WheelItemAlignment,
): Int {
    if (textAfterMode != TextAfterMode.Static || staticTextAfterWidth == 0) return 0
    return when (alignment) {
        WheelItemAlignment.Start -> maxItemTextWidth + textAfterPadding
        WheelItemAlignment.Center -> (lazyColumnWidth + maxItemTextWidth) / 2 + textAfterPadding
        WheelItemAlignment.End -> lazyColumnWidth - staticTextAfterWidth
    }
}

private fun calculateDistanceFactor(
    distanceFromCenter: Float,
    maxDistanceFromCenter: Float,
): Float =
    if (maxDistanceFromCenter > 0f) {
        distanceFromCenter / maxDistanceFromCenter
    } else {
        0f
    }

/**
 * Выравнивание колеса
 */
internal enum class WheelItemAlignment {
    Start, Center, End
}

@Composable
private fun TopControl(
    @DrawableRes icon: Int,
    color: InteractiveColor,
    state: LazyListState,
    coroutineScope: CoroutineScope,
) {
    val upInteractionSource = remember { MutableInteractionSource() }
    Icon(
        modifier = Modifier
            .testTag("top_control")
            .clickable(
                interactionSource = upInteractionSource,
                indication = LocalIndication.current,
            ) {
                coroutineScope.launch {
                    state.animateScrollToItem(
                        (state.firstVisibleItemIndex - 1).coerceAtLeast(0),
                    )
                }
            },
        contentDescription = null,
        painter = painterResource(icon),
        tint = color.colorForInteraction(upInteractionSource),
    )
}

@Composable
private fun BottomControl(
    @DrawableRes icon: Int,
    color: InteractiveColor,
    state: LazyListState,
    coroutineScope: CoroutineScope,
) {
    val downInteractionSource = remember { MutableInteractionSource() }
    Icon(
        modifier = Modifier
            .testTag("bottom_control")
            .clickable(
                interactionSource = downInteractionSource,
                indication = LocalIndication.current,
            ) {
                coroutineScope.launch {
                    state.animateScrollToItem((state.firstVisibleItemIndex + 1))
                }
            },
        contentDescription = null,
        painter = painterResource(icon),
        tint = color.colorForInteraction(downInteractionSource),
    )
}

@Composable
private fun rememberExtendedList(
    items: List<WheelItemData>,
    dataEdgePlacement: DataEdgePlacement,
    middleIndex: Int,
): List<WheelItemData> {
    return remember(dataEdgePlacement, items, middleIndex) {
        val dummyItems = List(middleIndex) { WheelItemData("Empty") }
        when (dataEdgePlacement) {
            DataEdgePlacement.WheelEdge -> items
            DataEdgePlacement.WheelCenter -> dummyItems + items + dummyItems
        }
    }
}

@Composable
private fun rememberMostWideItem(items: List<WheelItemData>): WheelItemData = remember(items) {
    items.maxBy { it.text.length + it.textAfter.length }
}

@Composable
private fun rememberCalculatedWheelHeight(itemHeight: Int, descriptionHeight: Int, visibleItemsCount: Int) =
    remember(itemHeight, descriptionHeight, visibleItemsCount) {
        calculateWheelHeight(itemHeight, descriptionHeight, visibleItemsCount)
    }

private fun calculateLabelOffset(
    scaledWheelHeight: Float,
    itemHeight: Int,
    itemSpacing: Float,
): Float =
    if (scaledWheelHeight > 0 && itemHeight > 0) {
        -itemHeight / 2f + itemSpacing / 2f
    } else {
        0f
    }

private fun calculateDescriptionOverlayOffset(
    itemHeight: Int,
    descriptionHeight: Int,
    descriptionPadding: Float,
    itemSpacing: Float,
): Int {
    val descriptionTextHeight = descriptionHeight - descriptionPadding
    return (itemHeight / 2f - descriptionTextHeight / 2f - itemSpacing / 2f).roundToInt()
}

@Composable
private fun Item(
    modifier: Modifier = Modifier,
    alignment: WheelItemAlignment,
    title: String,
    textAfter: String? = null,
    description: String? = null,
    textStyle: TextStyle,
    textAfterStyle: TextStyle,
    descriptionStyle: TextStyle,
    textAfterPadding: Dp,
    descriptionPadding: Dp,
    itemSpacing: Dp,
    textColor: InteractiveColor,
    textAfterColor: InteractiveColor,
    descriptionOffset: Float = 0f,
    interactionSource: InteractionSource,
) {
    Column(
        modifier = modifier
            .wrapContentSize()
            .padding(vertical = itemSpacing / 2),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = alignment.getListAlignment(),
    ) {
        Row(modifier = Modifier.offset(y = descriptionOffset.toDp())) {
            val textColor = textColor.colorForInteraction(interactionSource)
            Text(
                modifier = Modifier.debugBorder(Color.Magenta),
                text = title,
                style = textStyle.copy(textColor),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (!textAfter.isNullOrEmpty() && title.isNotEmpty()) {
                val textAfterColor = textAfterColor.colorForInteraction(interactionSource)
                Text(
                    modifier = Modifier.padding(start = textAfterPadding),
                    text = textAfter,
                    style = textAfterStyle.copy(textAfterColor),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }

        if (!description.isNullOrEmpty()) {
            val fakeStyle = remember(descriptionStyle) { descriptionStyle.copy(Color.Transparent) }
            Description(
                modifier = Modifier.debugBorder(Color.Gray),
                text = description,
                descriptionPadding = descriptionPadding,
                style = fakeStyle,
                interactionSource = interactionSource,
            )
        }
    }
}

@Composable
private fun Description(
    modifier: Modifier = Modifier,
    text: String,
    descriptionColor: InteractiveColor = Color.Transparent.asInteractive(),
    style: TextStyle,
    descriptionPadding: Dp = 0.dp,
    interactionSource: InteractionSource,
) {
    val descriptionColor = descriptionColor.colorForInteraction(interactionSource)
    Text(
        modifier = modifier.padding(top = descriptionPadding),
        text = text,
        style = style.copy(descriptionColor),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}

@Immutable
private data class ItemTranslation(
    val itemTranslationY: Float,
    val itemTitleTranslationY: Float,
    val itemTranslationX: Float,
)

@Composable
private fun Float.toDp() = with(LocalDensity.current) { toDp() }

@Composable
private fun Dp.toPx() = with(LocalDensity.current) { toPx() }

private fun WheelItemAlignment.getListAlignment(): Alignment.Horizontal {
    return when (this) {
        WheelItemAlignment.Start -> Alignment.Start
        WheelItemAlignment.Center -> Alignment.CenterHorizontally
        WheelItemAlignment.End -> Alignment.End
    }
}

private fun WheelItemAlignment.getHorizontalOffset(parentWidth: Int, childWidth: Int): Int {
    return when (this) {
        WheelItemAlignment.Start -> 0
        WheelItemAlignment.Center -> (parentWidth - childWidth) / 2
        WheelItemAlignment.End -> parentWidth - childWidth
    }
}

private fun WheelItemAlignment.getBoxContentHorizontalOffset(parentWidth: Int, childWidth: Int): Int {
    return when (this) {
        WheelItemAlignment.Start -> 0
        WheelItemAlignment.Center -> calculateCenterOffset(parentWidth, childWidth)
        WheelItemAlignment.End -> parentWidth - childWidth
    }
}

private fun getItemTranslation(
    layoutInfo: LazyListLayoutInfo,
    viewIndex: Int,
    maxDescriptionCompensation: Int,
    itemWidth: Int,
    alignment: WheelItemAlignment,
): ItemTranslation {
    val centerY = layoutInfo.viewportSize.height / 2f
    val descriptionCompensation: Float
    val widthDiff: Float
    val itemTranslationY = layoutInfo.visibleItemsInfo[viewIndex].let { item ->
        val childCenterY = item.offset + item.size / 2f
        val distance = centerY - childCenterY
        val factor = getDistanceFactor(distance = distance, maxDist = centerY)
        val scale = getScaleByDistanceFactor(factor)
        val itemHeight = item.size
        widthDiff = (itemWidth * scale - itemWidth) / 2f
        val direction = sign(distance).toInt()
        val indexFromCenter = (abs(distance) / itemHeight).roundToInt()

        descriptionCompensation = run {
            val descriptionCompensationFactor = (distance / itemHeight).coerceIn(0f, 1f)
            maxDescriptionCompensation * descriptionCompensationFactor
        }

        if (direction != 0) {
            val translateYGeneral = itemHeight * (1 - scale) / 2
            var allTranslation = 0f
            var neighbourCenter = childCenterY + direction * itemHeight
            var neighbourDistance = centerY - neighbourCenter
            var neighbourTranslation =
                getTranslationForDistance(
                    itemHeight = itemHeight,
                    distance = neighbourDistance,
                    maxDist = centerY,
                    maxDescriptionTranslation = maxDescriptionCompensation,
                )
            while (neighbourDistance.sign == distance.sign &&
                indexFromCenter <= layoutInfo.visibleItemsInfo.size / 2 + 1
            ) {
                allTranslation += neighbourTranslation
                neighbourCenter += direction * itemHeight
                neighbourDistance = centerY - neighbourCenter
                neighbourTranslation =
                    getTranslationForDistance(
                        itemHeight = itemHeight,
                        distance = neighbourDistance,
                        maxDist = centerY,
                        maxDescriptionTranslation = maxDescriptionCompensation,
                    )
            }
            direction * translateYGeneral + allTranslation * 2
        } else {
            0f
        }
    }

    val translationX = when (alignment) {
        WheelItemAlignment.Start -> widthDiff
        WheelItemAlignment.End -> -widthDiff
        else -> 0f
    }

    return ItemTranslation(
        itemTranslationY = itemTranslationY,
        itemTitleTranslationY = descriptionCompensation,
        itemTranslationX = translationX,
    )
}

private fun getTranslationForDistance(
    itemHeight: Int,
    distance: Float,
    maxDist: Float,
    maxDescriptionTranslation: Int,
): Float {
    val factor = getDistanceFactor(distance, maxDist)
    val scale = getScaleByDistanceFactor(factor)
    val direction = sign(distance).toInt()
    val descriptionCompensation = run {
        val descriptionCompensationFactor = (abs(distance) / itemHeight).coerceIn(0f, 1f)
        maxDescriptionTranslation * descriptionCompensationFactor
    }
    val translateYGeneral = (itemHeight * (1 - scale) / 2) + (descriptionCompensation * scale / 2)
    return direction * translateYGeneral
}

private fun calculateWheelHeight(
    itemHeight: Int,
    descriptionHeight: Int,
    visibleCount: Int,
): Float {
    if (itemHeight == 0) return 0f
    val maxDist = visibleCount * itemHeight / 2f
    var estimateHeight = 0f
    var childrenCenter = itemHeight / 2f
    var distance = maxDist - childrenCenter
    repeat(visibleCount) {
        val heightForDistance = getItemHeightForDistance(
            itemHeight = itemHeight,
            descriptionHeight = descriptionHeight,
            distance = distance,
            maxDist = maxDist,
        )
        estimateHeight += heightForDistance
        childrenCenter += itemHeight
        distance = maxDist - childrenCenter
    }
    return estimateHeight
}

private fun getItemHeightForDistance(
    itemHeight: Int,
    descriptionHeight: Int,
    distance: Float,
    maxDist: Float,
): Float {
    val factor = getDistanceFactor(distance, maxDist)
    val scale = getScaleByDistanceFactor(factor)
    val descriptionCompensation = if (factor == 0f) 0 else descriptionHeight
    return (itemHeight - descriptionCompensation) * scale
}

private fun getDistanceFactor(distance: Float, maxDist: Float): Float {
    if (maxDist == 0f) return 0f
    val absDistance = abs(distance)
    return (absDistance / maxDist).coerceAtMost(1.5f)
}

private fun getScaleByDistanceFactor(factor: Float): Float {
    return 1f - 0.3f * factor
}

private fun getAlphaByDistanceFactor(factor: Float): Float {
    return 1f - 0.8f * factor.coerceAtMost(1f)
}

@Composable
@Preview(showBackground = true)
private fun BaseWheelPreview() {
    BaseWheel(
        items = listOf(
            WheelItemData("First", textAfter = "Ta"),
            WheelItemData("Banana", textAfter = "Ta"),
            WheelItemData("Orange", textAfter = "Ta"),
            WheelItemData("Grape", textAfter = "Ta"),
            WheelItemData("Mango", textAfter = "Ta"),
            WheelItemData("Pineapple", textAfter = "Ta"),
            WheelItemData("Lemon", textAfter = "Ta"),
            WheelItemData("Text", textAfter = "Ta"),
            WheelItemData("Test", textAfter = "Ta"),
            WheelItemData("Last", textAfter = "Ta"),
        ),
        description = "description",
        textStyle = TextStyle(),
        textAfterStyle = TextStyle(),
        descriptionStyle = TextStyle(),
        textAfterPadding = 4.dp,
        descriptionPadding = 4.dp,
        itemSpacing = 8.dp,
        textColor = Color.DarkGray.asInteractive(),
        textAfterColor = Color.Gray.asInteractive(),
        descriptionColor = Color.Gray.asInteractive(),
        iconUpColor = Color.Black.asInteractive(),
        iconDownColor = Color.Black.asInteractive(),
        alignment = WheelItemAlignment.Start,
        dataEdgePlacement = DataEdgePlacement.WheelCenter,
        initialIndex = 0,
        visibleItemsCount = 5,
        onItemSelected = { index ->
            println("Selected at index $index")
        },
        interactionSource = remember { MutableInteractionSource() },
        hasControls = true,
    )
}

@Composable
@Preview(showBackground = true)
private fun BaseWheelStaticTextAfterPreview() {
    BaseWheel(
        items = listOf(
            WheelItemData("12"),
            WheelItemData("2"),
            WheelItemData("3"),
            WheelItemData("10"),
            WheelItemData("11"),
            WheelItemData("12"),
            WheelItemData("23"),
        ),
        description = null,
        textStyle = TextStyle(),
        textAfterStyle = TextStyle(),
        descriptionStyle = TextStyle(),
        textAfterPadding = 4.dp,
        descriptionPadding = 4.dp,
        itemSpacing = 8.dp,
        textColor = Color.DarkGray.asInteractive(),
        textAfterColor = Color.Gray.asInteractive(),
        descriptionColor = Color.Gray.asInteractive(),
        iconUpColor = Color.Black.asInteractive(),
        iconDownColor = Color.Black.asInteractive(),
        alignment = WheelItemAlignment.Start,
        dataEdgePlacement = DataEdgePlacement.WheelCenter,
        initialIndex = 0,
        visibleItemsCount = 5,
        textAfterMode = TextAfterMode.Static,
        staticTextAfter = "ч",
        onItemSelected = { index ->
            println("Selected at index $index")
        },
        interactionSource = remember { MutableInteractionSource() },
        hasControls = false,
    )
}

private fun Modifier.debugBorder(color: Color): Modifier =
    if (DEBUG_MODE) this.border(1.dp, color) else this

private const val DEBUG_MODE = false
