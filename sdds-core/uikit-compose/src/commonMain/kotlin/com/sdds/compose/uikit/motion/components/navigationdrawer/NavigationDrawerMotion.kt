package com.sdds.compose.uikit.motion.components.navigationdrawer

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.NavigationDrawerState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Создаёт [Motion] для [com.sdds.compose.uikit.NavigationDrawer].
 *
 * @param state состояние [com.sdds.compose.uikit.NavigationDrawer].
 * @param style стиль анимаций.
 * @param motionContext внешний motion-контекст.
 */
@Composable
@NonRestartableComposable
fun rememberNavigationDrawerMotion(
    state: NavigationDrawerState,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    semanticStateSource: MutableSemanticStateSource = remember { MutableSemanticStateSource() },
    style: NavigationDrawerMotionStyle = LocalNavigationDrawerMotionStyle.current,
    motionContext: MotionContext = rememberMotionContext(
        label = "NavigationDrawer",
        interactionSource = interactionSource,
        semanticStateSource = semanticStateSource,
    ),
): Motion<NavigationDrawerMotionStyle> {
    return rememberMotion(style, motionContext)
}
