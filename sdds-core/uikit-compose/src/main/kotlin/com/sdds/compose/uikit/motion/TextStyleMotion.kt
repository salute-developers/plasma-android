package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.interactions.StatefulValue

/**
 * Возвращает `State<TextStyle>` для [StatefulValue] с применением [motionProperty].
 */
@Composable
fun StatefulValue<TextStyle>.getTextStyleAsState(
    context: MotionContext,
    motionProperty: MotionProperty<TextStyle>,
    defaultValue: TextStyle? = null,
): State<TextStyle> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val stateSnapshot = context.stateSnapshotProvider.provide()
    return when (motionProperty) {
        is TransitionMotionProperty -> evaluateTransition(
            evaluator = genericTextStyleEvaluator(),
            context = context,
            motionProperty = motionProperty,
            stateSnapshot = stateSnapshot,
            defaultValue = defaultValue,
        )
        is InterpolationMotionProperty -> interpolateAsState(context, motionProperty, stateSnapshot, defaultValue)
        else -> rememberUpdatedState(getValue(stateSnapshot.target, defaultValue))
    }
}
