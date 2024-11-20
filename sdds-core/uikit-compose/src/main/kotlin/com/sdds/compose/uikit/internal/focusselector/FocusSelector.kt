package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

/**
 * Применяет селектор фокуса.
 *
 * @param isFocused будет ли применен селектор фокуса
 * @param focusSelectorMode режим селектора фокуса
 * @param originalShape форма компонента, к которому применяется селектор фокуса
 *
 * @see FocusSelectorMode
 */
fun Modifier.applyFocusSelector(
    isFocused: Boolean,
    focusSelectorMode: FocusSelectorMode,
    originalShape: CornerBasedShape,
): Modifier =
    if (isFocused) {
        this.then(
            when (focusSelectorMode) {
                is FocusSelectorMode.Border ->
                    Modifier.drawBorder(
                        stroke = focusSelectorMode.borderStroke,
                        strokePadding = focusSelectorMode.strokePadding,
                        originalShape = originalShape,
                    )

                is FocusSelectorMode.Scale ->
                    Modifier.graphicsLayer {
                        scaleX = focusSelectorMode.scale
                        scaleY = focusSelectorMode.scale
                    }

                FocusSelectorMode.None -> Modifier
            },
        )
    } else {
        this
    }
