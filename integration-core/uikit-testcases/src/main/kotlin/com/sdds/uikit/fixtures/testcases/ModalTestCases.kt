package com.sdds.uikit.fixtures.testcases

import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.modal.ModalGravity
import com.sdds.uikit.fixtures.stories.modal.ModalUiState
import com.sdds.uikit.fixtures.stories.modal.modalTrigger

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

    /**
     * PLASMA-2497
     */
    abstract fun testModalTopStart()

    /**
     * PLASMA-2498
     */
    abstract fun testModalTopCenter()

    /**
     * PLASMA-2499
     */
    abstract fun testModalTopEnd()

    /**
     * PLASMA-2500
     */
    abstract fun testModalCenterStart()

    /**
     * PLASMA-2501
     */
    abstract fun testModalCenter()

    /**
     * PLASMA-2502
     */
    abstract fun testModalCenterEnd()

    /**
     * PLASMA-2503
     */
    abstract fun testModalBottomStart()

    /**
     * PLASMA-2504
     */
    abstract fun testModalBottomCenter()

    /**
     * PLASMA-2505
     */
    abstract fun testModalBottomEnd()

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

    fun ComponentScope.modalTopStart(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = true,
                gravity = ModalGravity.TopStart,
                hasDimBackground = true,
                useNativeBlackout = false,
                edgeToEdge = true,
            ),
        )

    fun ComponentScope.modalTopCenter(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.TopCenter,
                hasDimBackground = true,
                useNativeBlackout = false,
                edgeToEdge = false,
            ),
        )

    fun ComponentScope.modalTopEnd(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.TopEnd,
                hasDimBackground = false,
                useNativeBlackout = false,
                edgeToEdge = true,
            ),
        )

    fun ComponentScope.modalCenterStart(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.CenterStart,
                hasDimBackground = true,
                useNativeBlackout = false,
                edgeToEdge = false,
            ),
        )

    fun ComponentScope.modalCenter(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.Center,
                hasDimBackground = false,
                useNativeBlackout = false,
                edgeToEdge = false,
            ),
        )

    fun ComponentScope.modalCenterEnd(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.CenterEnd,
                hasDimBackground = false,
                useNativeBlackout = false,
                edgeToEdge = false,
            ),
        )

    fun ComponentScope.modalBottomStart(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.BottomStart,
                hasDimBackground = true,
                useNativeBlackout = false,
                edgeToEdge = true,
            ),
        )

    fun ComponentScope.modalBottomCenter(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.BottomCenter,
                hasDimBackground = true,
                useNativeBlackout = false,
                edgeToEdge = true,
            ),
        )

    fun ComponentScope.modalBottomEnd(style: Int) =
        modalTrigger(
            context = context,
            style = style,
            state = ModalUiState(
                variant = "",
                hasClose = false,
                gravity = ModalGravity.BottomEnd,
                hasDimBackground = false,
                useNativeBlackout = false,
                edgeToEdge = true,
            ),
        )
}
