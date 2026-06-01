package com.sdds.compose.uikit.ai.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ai.AiAnswer
import com.sdds.compose.uikit.ai.AiAnswerState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для [AiAnswer].
 *
 * @param state текущее семантическое состояние [AiAnswer].
 * @param style стиль анимаций.
 * @param motionContext motion-контекст.
 */
@Composable
@NonRestartableComposable
fun rememberAiAnswerMotion(
    state: AiAnswerState = AiAnswerState.Default,
    style: AiAnswerMotionStyle = LocalAiAnswerMotionStyle.current,
    motionContext: MotionContext = rememberAiAnswerMotionContext(state),
): Motion<AiAnswerMotionStyle> {
    return rememberMotion(style, motionContext)
}

@Composable
private fun rememberAiAnswerMotionContext(state: AiAnswerState): MotionContext {
    val semanticStateSource = remember { MutableSemanticStateSource() }
    SideEffect {
        semanticStateSource.replace(state)
    }
    return rememberMotionContext(
        semanticStateSource = semanticStateSource,
        label = "AiAnswer",
    )
}
