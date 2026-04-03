package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.Card
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.card.CardOrientation
import com.sdds.uikit.fixtures.stories.card.CardUiState
import com.sdds.uikit.fixtures.stories.card.card

/**
 * Тест-кейсы для [com.sdds.uikit.Card]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CardTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T1945
     */
    abstract fun testCardSizeLSolidHorizontal()

    /**
     * PLASMA-T1946
     */
    abstract fun testCardSizeMSolidVertical()

    /**
     * PLASMA-T1947
     */
    abstract fun testCardSizeSSolidHorizontal()

    /**
     * PLASMA-T1948
     */
    abstract fun testCardSizeLClearVertical()

    /**
     * PLASMA-T1949
     */
    abstract fun testCardSizeMClearHorizontal()

    /**
     * PLASMA-T1950
     */
    abstract fun testCardSizeSClearVertical()

    fun ComponentScope.cardHorizontal(style: Int): Card =
        card(
            context,
            style,
            CardUiState(
                orientation = CardOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.cardVertical(style: Int): Card =
        card(
            context,
            style,
            CardUiState(
                orientation = CardOrientation.VERTICAL,
            ),
        )
}
