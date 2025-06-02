package com.sdds.testing.vs.modal

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

/**
 * Тест-кейсы для компонента [Modal]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ModalTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-2046
     */
    abstract fun testModalUseNativeBlackoutHasClose()

    /**
     * PLASMA-2047
     */
    abstract fun testModalNoCloseNoBlackout()

    fun ComponentScope.modalUseNativeBlackoutHasClose(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                useNativeBlackout = true,
                hasClose = true,
            ),
        )

    fun ComponentScope.modalNoValues(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                useNativeBlackout = false,
                hasClose = false,
            ),
        )
}
