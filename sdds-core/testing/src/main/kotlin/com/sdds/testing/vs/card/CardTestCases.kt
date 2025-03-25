package com.sdds.testing.vs.card

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Card

/**
 * Тест-кейсы для [Card]
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
