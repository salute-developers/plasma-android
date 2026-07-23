@file:OptIn(ExperimentalComposeUiApi::class)

package com.sdds.compose.uikit.internal.popover

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.window.PopupProperties

private object SkikoPopoverAnchor : PopoverAnchor

@Composable
internal actual fun rememberPopoverAnchor(): PopoverAnchor = SkikoPopoverAnchor

@Composable
internal actual fun rememberPopoverRootSize(anchor: PopoverAnchor): IntSize {
    return LocalWindowInfo.current.containerSize
}

@Composable
internal actual fun rememberDeferredConstraintsUpdater(
    apply: (IntSize) -> Unit,
): DeferredConstraintsUpdater {
    val currentApply = rememberUpdatedState(apply)
    return remember { SkikoDeferredConstraintsUpdater { currentApply.value.invoke(it) } }
}

@Composable
internal actual fun PlatformPopupContentEffects(
    anchor: PopoverAnchor,
    popupProperties: PopupProperties,
) = Unit

/**
 * PopoverPositionProvider uses window coordinates and applies safe-area constraints itself.
 * Skiko Popup otherwise converts the provider to safe-area-relative coordinates and adds the
 * platform insets to the result, shifting a position obtained from positionInWindow twice on iOS.
 */
internal actual fun PopupProperties.ensureCorrectPopoverProperties(): PopupProperties {
    if (!usePlatformInsets) return this
    return PopupProperties(
        focusable = focusable,
        dismissOnBackPress = dismissOnBackPress,
        dismissOnClickOutside = dismissOnClickOutside,
        clippingEnabled = clippingEnabled,
        usePlatformDefaultWidth = usePlatformDefaultWidth,
        usePlatformInsets = false,
    )
}

internal actual val DefaultPopupProperties = PopupProperties(
    clippingEnabled = false,
    focusable = true,
    usePlatformInsets = false,
)

private class SkikoDeferredConstraintsUpdater(
    private val apply: (IntSize) -> Unit,
) : DeferredConstraintsUpdater {
    override fun request(value: IntSize) {
        apply(value)
    }

    override fun reset() = Unit
}
