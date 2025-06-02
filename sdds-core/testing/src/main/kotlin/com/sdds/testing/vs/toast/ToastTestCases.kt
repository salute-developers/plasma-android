package com.sdds.testing.vs.toast

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.overlays.OverlayPosition

/**
 * Тест-кейсы для компонента [Toast]
 */
@Suppress("UndocumentedPublicFunction")
abstract class ToastTestCases(mode: String) : RoborazziConfig(mode) {
    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedDefaultTopStart()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedNegativeTopCenter()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedPositiveTopEnd()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastPilledDefaultCenterStart()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastPilledNegativeCenter()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastPilledPositiveCenterEnd()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedDefaultBottomStart()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedDefaultBottomCenter()

    /**
     * PLASMA-T2026
     */
    abstract fun testToastRoundedDefaultBottomEnd()

    fun ComponentScope.toastRoundedDefaultTopStart(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.TopStart,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastRoundedNegativeTopCenter(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = false,
                position = OverlayPosition.TopCenter,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastRoundedPositiveTopEnd(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.TopCenter,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastPilledDefaultCenterStart(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = false,
                hasContentEnd = false,
                position = OverlayPosition.CenterStart,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastPilledNegativeCenter(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.Center,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastPilledPositiveCenterEnd(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.CenterEnd,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastRoundedDefaultBottomStart(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = false,
                hasContentEnd = true,
                position = OverlayPosition.BottomStart,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastRoundedDefaultBottomCenter(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.BottomCenter,
                autoDismiss = false,
            ),
        )

    fun ComponentScope.toastRoundedDefaultBottomEnd(style: Int) =
        toastTrigger(
            context = context,
            style = style,
            state = ToastUiState(
                variant = "",
                text = "Toast text",
                hasContentStart = true,
                hasContentEnd = true,
                position = OverlayPosition.BottomEnd,
                autoDismiss = false,
            ),
        )
}
