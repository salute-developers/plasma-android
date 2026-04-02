package com.sdds.compose.uikit.components.counter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

@Composable
@NonRestartableComposable
inline fun rememberCounterMotion(
    motionContext: MotionContext = rememberMotionContext(),
    style: CounterMotionStyle = LocalCounterMotionStyle.current,
): Motion<CounterMotionStyle> {
    return rememberMotion(style, motionContext)
}
