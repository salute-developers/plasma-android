package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.sdds.compose.uikit.fs.FocusSelectorScale

@Immutable
internal object FocusSelectorScaleNone : FocusSelectorScale {
    override val scaleFactor: Float = 0f
    override fun Modifier.applyScaleToModifier(isFocused: () -> Boolean): Modifier {
        return this
    }
}

@Immutable
internal data class FocusSelectorIncreaseScale(
    override val scaleFactor: Float,
) : FocusSelectorScale {
    override fun Modifier.applyScaleToModifier(isFocused: () -> Boolean): Modifier {
        if (!isFocused()) return this
        return this then Modifier.graphicsLayer {
            scaleX = (1f + scaleFactor)
            scaleY = (1f + scaleFactor)
        }
    }
}
