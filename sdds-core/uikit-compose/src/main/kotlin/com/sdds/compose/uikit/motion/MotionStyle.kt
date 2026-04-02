package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.Stable
import com.sdds.compose.uikit.style.Style

@Stable
interface MotionStyle

interface MotionStyleBuilder<S: MotionStyle> {

    fun style(): S
}

@Composable
infix fun <S : MotionStyle> ProvidableCompositionLocal<S>.tryProvide(style: S?): ProvidedValue<S> {
    return if (style != null) {
        provides(style)
    } else {
        provides(current)
    }
}