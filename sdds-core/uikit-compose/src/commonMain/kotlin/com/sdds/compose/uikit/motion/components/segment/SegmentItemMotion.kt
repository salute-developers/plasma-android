package com.sdds.compose.uikit.motion.components.segment

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Запоминает Motion для SegmentItem без анимации по умолчанию.
 *
 * @param style стиль переходов, по умолчанию из [LocalSegmentItemMotionStyle].
 * @param motionContext общий контекст взаимодействий и семантических состояний.
 */
@Composable
@NonRestartableComposable
fun rememberSegmentItemMotion(
    style: SegmentItemMotionStyle = LocalSegmentItemMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(label = "SegmentItem"),
): Motion<SegmentItemMotionStyle> = rememberMotion(style, motionContext)
