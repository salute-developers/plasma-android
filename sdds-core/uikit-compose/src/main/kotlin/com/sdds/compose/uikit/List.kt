package com.sdds.compose.uikit

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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
 * @param content контент из [ListItem] либо произвольных элементов
 */
@Composable
fun List(
    modifier: Modifier = Modifier,
    style: ListStyle = LocalListStyle.current,
    state: LazyListState = rememberLazyListState(),
    reverseLayout: Boolean = false,
    verticalArrangement: Arrangement.Vertical =
        if (!reverseLayout) Arrangement.Top else Arrangement.Bottom,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    userScrollEnabled: Boolean = true,
    content: LazyListScope.() -> Unit,
) {
    CompositionLocalProvider(
        LocalListItemStyle provides style.listItemStyle,
        LocalDividerStyle provides style.dividerStyle,
    ) {
        LazyColumn(
            modifier = modifier,
            state = state,
            reverseLayout = reverseLayout,
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment,
            flingBehavior = flingBehavior,
            userScrollEnabled = userScrollEnabled,
            content = content,
        )
    }
}

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
