package com.sdds.compose.uikit.ai.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ai.Answer
import com.sdds.compose.uikit.ai.AnswerState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для [Answer].
 *
 * @param state текущее семантическое состояние [Answer].
 * @param style стиль анимаций.
 * @param motionContext motion-контекст.
 */
@Composable
@NonRestartableComposable
fun rememberAnswerMotion(
    state: AnswerState = AnswerState.Default,
    style: AnswerMotionStyle = LocalAnswerMotionStyle.current,
    motionContext: MotionContext = rememberAnswerMotionContext(state),
): Motion<AnswerMotionStyle> {
    return rememberMotion(style, motionContext)
}

@Composable
private fun rememberAnswerMotionContext(state: AnswerState): MotionContext {
    val semanticStateSource = remember { MutableSemanticStateSource() }
    SideEffect {
        semanticStateSource.replace(state)
    }
    return rememberMotionContext(
        semanticStateSource = semanticStateSource,
        label = "Answer",
    )
}
