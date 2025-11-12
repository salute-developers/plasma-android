package com.sdds.testing.vs.paginationdots

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

/**
 * Тест-кейсы для компонента [PaginationDots]
 */
@Suppress("UndocumentedPublicFunction")
abstract class PaginationDotsTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2354
     */
    abstract fun testPaginationDotsHorizontalMTwentyVisibleNine()

    /**
     * PLASMA-T2355
     */
    abstract fun testPaginationDotsVerticalMActiveTypeLineTenVisibleSeven()

    /**
     * PLASMA-T2356
     */
    abstract fun testPaginationDotsHorizontalSThreeVisibleThree()

    /**
     * PLASMA-T2357
     */
    abstract fun testPaginationDotsHorizontalSActiveTypeLineSevenVisibleFive()

    /**
     * PLASMA-T2358
     */
    abstract fun testPaginationDotsHorizontalMOneVisibleOne()

    /**
     * PLASMA-T2359
     */
    abstract fun testPaginationDotsWithControlsHorizontalM()

    /**
     * PLASMA-T2360
     */
    abstract fun testPaginationDotsWithControlsVerticalMActiveTypeLine()

    fun ComponentScope.paginationDotsHorizontalMTwentyVisibleNine(style: Int) =
        paginationDots(
            context = context,
            style = style,
            state = PaginationDotsUiState(
                variant = "",
                appearance = "",
                itemCount = 20,
                visibleItemCount = 9,
            ),
        ).apply {
            id = R.id.pagination_dots
        }

    fun ComponentScope.paginationDotsVerticalMActiveTypeLineTenVisibleSeven(style: Int) =
        paginationDots(
            context = context,
            style = style,
            state = PaginationDotsUiState(
                variant = "",
                appearance = "",
                itemCount = 10,
                visibleItemCount = 7,
            ),
        ).apply {
            id = R.id.pagination_dots
        }

    fun ComponentScope.paginationDotsHorizontalSThreeVisibleThree(style: Int) =
        paginationDots(
            context = context,
            style = style,
            state = PaginationDotsUiState(
                variant = "",
                appearance = "",
                itemCount = 3,
                visibleItemCount = 3,
            ),
        ).apply {
            id = R.id.pagination_dots
        }

    fun ComponentScope.paginationDotsHorizontalSActiveTypeLineSevenVisibleFive(style: Int) =
        paginationDots(
            context = context,
            style = style,
            state = PaginationDotsUiState(
                variant = "",
                appearance = "",
                itemCount = 7,
                visibleItemCount = 5,
            ),
        ).apply {
            id = R.id.pagination_dots
        }

    fun ComponentScope.paginationDotsHorizontalMOneVisibleOne(style: Int) =
        paginationDots(
            context = context,
            style = style,
            state = PaginationDotsUiState(
                variant = "",
                appearance = "",
                itemCount = 1,
                visibleItemCount = 1,
            ),
        ).apply {
            id = R.id.pagination_dots
        }
}
