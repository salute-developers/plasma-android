package com.sdds.compose.uikit.motion.components.select

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Запоминает Motion для SelectItem без анимации по умолчанию.
 *
 * @param style стиль переходов, по умолчанию из [LocalSelectItemMotionStyle].
 * @param motionContext общий контекст взаимодействий и семантических состояний.
 */
@Composable
@NonRestartableComposable
fun rememberSelectItemMotion(
    style: SelectItemMotionStyle = LocalSelectItemMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(label = "SelectItem"),
): Motion<SelectItemMotionStyle> = rememberMotion(style, motionContext)
