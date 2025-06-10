package com.sdds.testing.vs.list

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

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

    fun ComponentScope.listNormalXlHasDisclosure(style: Int): android.view.View =
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

    fun ComponentScope.listNormalL(style: Int): android.view.View =
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

    fun ComponentScope.listNormalM(style: Int): android.view.View =
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

    fun ComponentScope.listNormalS(style: Int): android.view.View =
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

    fun ComponentScope.listNormalXs(style: Int): android.view.View =
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

    fun ComponentScope.listTightXsHasDisclosure(style: Int): android.view.View =
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
