package com.sdds.compose.uikit

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.DefaultVerticalArrangement
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.list.ListMotionStyle
import com.sdds.compose.uikit.motion.components.list.rememberListMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент List
 * Представляет собой список [ListItem] либо произвольных элементов.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param state [LazyListState]
 * @param reverseLayout меняет порядок скролла и расположения
 * @param verticalArrangement расположение дочерних элементов по вертикали
 * @param horizontalAlignment выравнивание элементов по горизонтали
 * @param flingBehavior [FlingBehavior]
 * @param userScrollEnabled включен ли скролл
 * @param contentPadding отступы вокруг контента
 * @param content контент из [ListItem] либо произвольных элементов
 */
@Composable
fun List(
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    state: LazyListState = rememberLazyListState(),
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean = true,
    contentPadding: PaddingValues = UnspecifiedPaddingValues,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: LazyListScope.() -> Unit,
) {
    List(
        motion = rememberListMotion(
            motionContext = rememberMotionContext(interactionSource),
        ),
        modifier = modifier,
        style = style,
        state = state,
        reverseLayout = reverseLayout,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        flingBehavior = flingBehavior,
        userScrollEnabled = userScrollEnabled,
        contentPadding = contentPadding,
        content = content,
    )
}

/**
 * Компонент List
 * Представляет собой список [ListItem] либо произвольных элементов.
 *
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента
 * @param state [LazyListState]
 * @param reverseLayout меняет порядок скролла и расположения
 * @param verticalArrangement расположение дочерних элементов по вертикали
 * @param horizontalAlignment выравнивание элементов по горизонтали
 * @param flingBehavior [FlingBehavior]
 * @param userScrollEnabled включен ли скролл
 * @param contentPadding отступы вокруг контента
 * @param content контент из [ListItem] либо произвольных элементов
 */
@Composable
fun List(
    motion: Motion<ListMotionStyle>,
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    state: LazyListState = rememberLazyListState(),
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical = DefaultVerticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean = true,
    contentPadding: PaddingValues = UnspecifiedPaddingValues,
    content: LazyListScope.() -> Unit,
) {
    val interactionSource = motion.context.interactionSource
    val resolvedArrangement = if (verticalArrangement == DefaultVerticalArrangement) {
        val gap by style.dimensions.gapValues.getValueAsState(interactionSource)
        getVerticalArrangement(gap, reverseLayout)
    } else {
        verticalArrangement
    }
    val resolvedPaddings = if (contentPadding == UnspecifiedPaddingValues) {
        style.dimensions.getContentPaddings(interactionSource)
    } else {
        contentPadding
    }
    val shape = style.shapes.getValue(interactionSource)
    CompositionLocalProvider(
        LocalListItemStyle provides style.listItemStyle,
        LocalDividerStyle provides style.dividerStyle,
    ) {
        val background = style.colors.backgroundBrush.getBrushAsState(
            motion.context,
            motion.style.backgroundColor,
        )
        LazyColumn(
            modifier = modifier
                .backgroundBrush(
                    brushProducer = { background.value },
                    shape = shape,
                ),
            state = state,
            contentPadding = resolvedPaddings,
            reverseLayout = reverseLayout,
            verticalArrangement = resolvedArrangement,
            horizontalAlignment = horizontalAlignment,
            flingBehavior = flingBehavior,
            userScrollEnabled = userScrollEnabled,
            content = content,
        )
    }
}

private fun getVerticalArrangement(
    gap: Dp,
    reverseLayout: Boolean,
): Arrangement.Vertical {
    return if (gap.isSpecified) {
        Arrangement.spacedBy(gap)
    } else if (reverseLayout) {
        Arrangement.Bottom
    } else {
        Arrangement.Top
    }
}

@Composable
private fun ListDimensions.getContentPaddings(
    interactionSource: MutableInteractionSource,
) = PaddingValues(
    paddingStartValues.getValue(interactionSource),
    paddingTopValues.getValue(interactionSource),
    paddingEndValues.getValue(interactionSource),
    paddingBottomValues.getValue(interactionSource),
)

private val UnspecifiedPaddingValues = PaddingValues(0.dp)

@Preview(showBackground = true)
@Composable
private fun ListPreview() {
    List {
        items(3) {
            ListItem(text = "Title $it")
        }
        item {
            Divider()
        }
        items(2) {
            ListItem(text = "Title $it")
        }
    }
}
