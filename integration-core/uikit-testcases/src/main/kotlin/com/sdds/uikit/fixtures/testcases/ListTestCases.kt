package com.sdds.uikit.fixtures.testcases

import android.view.View
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.list.ListUiState
import com.sdds.uikit.fixtures.stories.list.listView

/**
 * Тест-кейс для [List]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ListTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testListNormalXlHasDisclosure()

    abstract fun testListNormalL()

    abstract fun testListNormalM()

    abstract fun testListNormalS()

    abstract fun testListNormalXs()

    abstract fun testListTightXsHasDisclosure()

    fun ComponentScope.listNormalXlHasDisclosure(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 3,
                itemTitle = "Title",
                hasDisclosure = true,
            ),
        )

    fun ComponentScope.listNormalL(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 3,
                itemTitle = "Title",
                hasDisclosure = false,
            ),
        )

    fun ComponentScope.listNormalM(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 3,
                itemTitle = "Title",
                hasDisclosure = false,
            ),
        )

    fun ComponentScope.listNormalS(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 3,
                itemTitle = "Title",
                hasDisclosure = false,
            ),
        )

    fun ComponentScope.listNormalXs(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 20,
                itemTitle = "Title",
                hasDisclosure = false,
            ),
        )

    fun ComponentScope.listTightXsHasDisclosure(style: Int): View =
        listView(
            context = context,
            style = style,
            state = ListUiState(
                variant = "",
                amount = 3,
                itemTitle = "Title",
                hasDisclosure = true,
            ),
        )
}
