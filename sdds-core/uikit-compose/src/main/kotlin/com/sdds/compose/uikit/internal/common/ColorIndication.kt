package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.ContentDrawScope

internal class ColorIndication(private val pressedColor: Brush) : Indication {

    constructor(pressedColor: Color) : this(SolidColor(pressedColor))

    private inner class DefaultIndicationInstance(
        private val isPressed: State<Boolean>,
    ) : IndicationInstance {

        override fun ContentDrawScope.drawIndication() {
            drawContent()
            when {
                isPressed.value -> drawRect(brush = pressedColor, size = size)
            }
        }
    }

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {
        val isPressed = interactionSource.collectIsPressedAsState()
        return remember(interactionSource) {
            DefaultIndicationInstance(isPressed)
        }
    }
}

@Composable
internal fun rememberIndication(pressedColor: Brush): Indication {
    return remember { ColorIndication(pressedColor) }
}

@Composable
internal fun rememberIndication(pressedColor: Color): Indication {
    return remember { ColorIndication(pressedColor) }
}
