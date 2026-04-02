package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember

interface Motion<S : MotionStyle> {

    val context: MotionContext

    val style: S
}


@Composable
fun <S : MotionStyle> rememberMotion(
    style: S,
    context: MotionContext = rememberMotionContext(),
): Motion<S> {
   return remember(style, context) { MotionImpl(context, style) }
}

@Immutable
private class MotionImpl<S: MotionStyle>(
    override val context: MotionContext,
    override val style: S,
) : Motion<S>