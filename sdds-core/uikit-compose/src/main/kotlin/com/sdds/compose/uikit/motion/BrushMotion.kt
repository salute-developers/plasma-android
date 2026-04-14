package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.animateFloat
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.graphics.brush.SolidColorVectorConverter
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.transform

/**
 * Возвращает `State<Brush>` для [StatefulValue] с применением [motionProperty].
 *
 * Для `SolidColor` используется обычная value-анимация, для `ShaderBrush` -
 * специализированная интерполяция через [genericBrushEvaluator].
 */
@Composable
fun StatefulValue<Brush>.getBrushAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Brush>,
    defaultValue: Brush? = null,
): State<Brush> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val stateSnapshot = context.stateSnapshotProvider.provide()
    return when {
        isSolidColors -> evaluateSolidColors(this, context, motionProperty, stateSnapshot, defaultValue)
        iShaderBrushes -> evaluateBrushes(this, context, motionProperty, stateSnapshot, defaultValue)
        else -> rememberUpdatedState(getValue(stateSnapshot.target, defaultValue))
    }
}

@Composable
private fun evaluateSolidColors(
    value: StatefulValue<Brush>,
    context: MotionContext,
    motionProperty: MotionProperty<Brush>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: Brush?,
): State<Brush> {
    val solidColors = value.transform { it as SolidColor }
    val colorSpace = solidColors.getValue(stateSnapshot.target).value.colorSpace
    val typeConverter = remember(colorSpace) { SolidColorVectorConverter(colorSpace) }
    @Suppress("UNCHECKED_CAST")
    return solidColors.getValueAsState(
        context = context,
        motionProperty = motionProperty as MotionProperty<SolidColor>,
        converter = typeConverter,
        stateSnapshot = stateSnapshot,
        defaultValue = defaultValue as? SolidColor,
    )
}

@Composable
private fun evaluateBrushes(
    value: StatefulValue<Brush>,
    context: MotionContext,
    motionProperty: MotionProperty<Brush>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: Brush?,
): State<Brush> {
    return when (motionProperty) {
        is TransitionMotionProperty -> evaluateBrushTransition(
            value,
            context,
            motionProperty,
            stateSnapshot,
            defaultValue,
        )

        is InterpolationMotionProperty -> evaluateBrushInterpolation(
            value,
            context,
            motionProperty,
            stateSnapshot,
            defaultValue,
        )
        else -> rememberUpdatedState(value.getValue(stateSnapshot.target, defaultValue))
    }
}

@Composable
private fun evaluateBrushTransition(
    value: StatefulValue<Brush>,
    context: MotionContext,
    motionProperty: TransitionMotionProperty<Brush>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: Brush?,
): State<Brush> {
    val segment = motionProperty.resolve(stateSnapshot)
    val from = value.getValue(stateSnapshot.initial, defaultValue)
    val to = value.getValue(stateSnapshot.target, defaultValue)
    val channel = context.transitionChannel.provide(stateSnapshot)
    val animatedIndex = channel.transition.animateFloat(
        label = motionProperty.label.orEmpty(),
        transitionSpec = { segment.spec().animationSpec.toFloatAnimationSpec() },
    ) { states ->
        value.indexOfStateSet(states).toFloat()
    }
    val fromIndex = value.indexOfStateSet(stateSnapshot.initial).toFloat()
    val toIndex = value.indexOfStateSet(stateSnapshot.target).toFloat()
    val evaluator = genericBrushEvaluator()
    return remember(from, to, animatedIndex, fromIndex, toIndex) {
        derivedStateOf {
            val fraction = if (fromIndex == toIndex) {
                1f
            } else {
                ((animatedIndex.value - fromIndex) / (toIndex - fromIndex)).coerceIn(0f, 1f)
            }
            evaluator.evaluate(from, to, fraction)
        }
    }
}

@Composable
private fun evaluateBrushInterpolation(
    value: StatefulValue<Brush>,
    context: MotionContext,
    motionProperty: InterpolationMotionProperty<Brush>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: Brush?,
): State<Brush> {
    val segment = motionProperty.resolve(stateSnapshot)
    val channel = context.interpolationChannels[segment.channelKey]
        ?.provide(stateSnapshot)
        ?: return rememberUpdatedState(value.getValue(stateSnapshot.target, defaultValue))
    val interpolationSpec = segment.spec()
    return remember(value, channel, interpolationSpec, defaultValue, stateSnapshot) {
        derivedStateOf {
            val vector = segment.vector.provide(stateSnapshot)
            val from = value.getValue(vector.from, defaultValue)
            val to = value.getValue(vector.to, defaultValue)
            interpolationSpec.evaluator.evaluate(from, to, channel.fractionProvider().coerceIn(0f, 1f))
        }
    }
}

private val StatefulValue<Brush>.isSolidColors: Boolean
    get() = getValues().all { it is SolidColor }

private val StatefulValue<Brush>.iShaderBrushes: Boolean
    get() = getValues().all { it is ShaderBrush }
