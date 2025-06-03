package com.sdds.testing.vs.list

import android.content.Context
import androidx.annotation.StyleRes
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.ListItem
import com.sdds.uikit.ListView
import com.sdds.uikit.SimpleListViewAdapter

/**
 * Создает [ListView]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun listView(
    context: Context,
    @StyleRes style: Int? = null,
    state: ListUiState = ListUiState(),
): ListView {
    return ListView(context.styleWrapper(style))
        .apply {
            adapter = SimpleListViewAdapter()
        }
        .applyState(state)
}

/**
 * Применяет [ListUiState] к [ListView]
 */
fun ListView.applyState(state: ListUiState): ListView = apply {
    (adapter as SimpleListViewAdapter).submitList(
        mutableListOf<ListItem>().apply {
            repeat(state.amount) {
                add(
                    ListItem.simpleItem(
                        id = it.toLong(),
                        title = state.itemTitle,
                        hasDisclosure = state.hasDisclosure,
                    ),
                )
            }
        },
    )
}
