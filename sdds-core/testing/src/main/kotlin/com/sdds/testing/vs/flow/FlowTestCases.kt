package com.sdds.testing.vs.flow

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.FlowLayout
import java.util.concurrent.Flow

/**
 * Тест-кейсы для [Flow]
 */
@Suppress("UndocumentedPublicFunction")
abstract class FlowTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testFlowStartHorizontal()

    abstract fun testFlowCenterVertical()

    abstract fun testFlowEndHorizontal()

    abstract fun testFlowSpaceBetweenStartHorizontal()

    abstract fun testFlowSpaceAroundStartHorizontal()

    abstract fun testFlowItemsPerLineOne()

    /**
     * PLASMA-T1951
     */
    fun ComponentScope.flowStartHorizontal(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                variant = "Default",
                arrangement = FlowArrangement.START,
                alignment = FlowAlignment.START,
                orientation = FlowOrientation.HORIZONTAL,
                itemsPerLine = 2,
            ),
        )

    /**
     * PLASMA-T1952
     */
    fun ComponentScope.flowCenterVertical(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                arrangement = FlowArrangement.CENTER,
                alignment = FlowAlignment.CENTER,
                orientation = FlowOrientation.VERTICAL,
                itemsPerLine = 3,
            ),
        )

    /**
     * PLASMA-T1953
     */
    fun ComponentScope.flowEndHorizontal(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                arrangement = FlowArrangement.END,
                alignment = FlowAlignment.END,
                orientation = FlowOrientation.HORIZONTAL,
                itemsPerLine = 2,
            ),
        )

    /**
     * PLASMA-T1954
     */
    fun ComponentScope.flowSpaceBetweenStartHorizontal(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                arrangement = FlowArrangement.SPACE_BETWEEN,
                alignment = FlowAlignment.START,
                orientation = FlowOrientation.HORIZONTAL,
                itemsPerLine = 2,
            ),
        )

    /**
     * PLASMA-T1955
     */
    fun ComponentScope.flowSpaceAroundStartHorizontal(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                arrangement = FlowArrangement.SPACE_AROUND,
                alignment = FlowAlignment.START,
                orientation = FlowOrientation.HORIZONTAL,
                itemsPerLine = 2,
            ),
        )

    /**
     * PLASMA-T1956
     */
    fun ComponentScope.flowItemsPerLineOne(): FlowLayout =
        flowLayout(
            context,
            state = FlowUiState(
                arrangement = FlowArrangement.START,
                alignment = FlowAlignment.END,
                orientation = FlowOrientation.HORIZONTAL,
                itemsPerLine = 1,
            ),
        )
}
