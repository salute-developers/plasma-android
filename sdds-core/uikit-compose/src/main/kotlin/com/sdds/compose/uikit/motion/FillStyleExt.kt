package com.sdds.compose.uikit.motion

import android.util.Log
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.SnapSpec
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.transform
import com.sdds.compose.uikit.internal.common.BrushFillStyle
import com.sdds.compose.uikit.internal.common.ColorFillStyle
import com.sdds.compose.uikit.internal.common.FillStyle
import com.sdds.compose.uikit.internal.common.MixedBrushFillStyle
import com.sdds.compose.uikit.internal.common.VectorConverter
import com.sdds.compose.uikit.internal.common.asFillStyle

fun StatefulValue<Color>.asFillStyle(): StatefulValue<FillStyle> =
    this.transform { it.asFillStyle() }

fun StatefulValue<Brush>.asFillStyle(): StatefulValue<FillStyle> =
    this.transform { it.asFillStyle() }

@Composable
fun StatefulValue<FillStyle>.getFillStyleAsState(
    context: MotionContext,
    motionProperty: MotionProperty<FillStyle>,
    defaultValue: FillStyle? = null,
): State<FillStyle> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val stateSnapshot = context.stateSnapshotProvider.provide()
    return when {
        isColorFillStyles -> evaluateColorFillStyles(this, context, motionProperty, stateSnapshot, defaultValue)
        isBrushFillStyles -> evaluateBrushFillStyles(this, context, motionProperty, stateSnapshot, defaultValue)
        else -> rememberUpdatedState(getValue(stateSnapshot.target, defaultValue))
    }
}

@Composable
private fun evaluateColorFillStyles(
    value: StatefulValue<FillStyle>,
    context: MotionContext,
    motionProperty: MotionProperty<FillStyle>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: FillStyle?,
): State<FillStyle> {
    val colorValues = remember(value) { value.transform { it as ColorFillStyle } }
    val colorSpace = colorValues.getValue(stateSnapshot.target).color.colorSpace
    val typeConverter = remember(colorSpace) { ColorFillStyle.VectorConverter(colorSpace) }
    @Suppress("UNCHECKED_CAST")
    return colorValues.getValueAsState(
        context = context,
        motionProperty = motionProperty as MotionProperty<ColorFillStyle>,
        converter = typeConverter,
        stateSnapshot = stateSnapshot,
        defaultValue = defaultValue as? ColorFillStyle,
    )
}

@Composable
private fun evaluateBrushFillStyles(
    value: StatefulValue<FillStyle>,
    context: MotionContext,
    motionProperty: MotionProperty<FillStyle>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: FillStyle?,
): State<FillStyle> {
    return when (motionProperty) {
        is TransitionMotionProperty -> evaluateBrushTransition(value, context, motionProperty, stateSnapshot, defaultValue)
        is InterpolationMotionProperty -> evaluateBrushInterpolation(value, context, motionProperty, stateSnapshot, defaultValue)
        else -> rememberUpdatedState(value.getValue(stateSnapshot.target, defaultValue))
    }
}

@Composable
private fun evaluateBrushTransition(
    value: StatefulValue<FillStyle>,
    context: MotionContext,
    motionProperty: TransitionMotionProperty<FillStyle>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: FillStyle?,
): State<FillStyle> {
    val from = value.getValue(stateSnapshot.initial, defaultValue) as? BrushFillStyle
        ?: return rememberUpdatedState(value.getValue(stateSnapshot.target, defaultValue))
    val to = value.getValue(stateSnapshot.target, defaultValue) as? BrushFillStyle
        ?: return rememberUpdatedState(value.getValue(stateSnapshot.target, defaultValue))
    val channel = context.transitionChannel.provide(stateSnapshot)
    val animatedIndex = channel.transition.animateFloat(
        label = motionProperty.label.orEmpty(),
        transitionSpec = { motionProperty.resolve(stateSnapshot).spec().animationSpec.toFloatAnimationSpec() }
    ) { states ->
        value.indexOfStateSet(states).toFloat()
    }
    val fromIndex = value.indexOfStateSet(stateSnapshot.initial).toFloat()
    val toIndex = value.indexOfStateSet(stateSnapshot.target).toFloat()
    return remember(from, to, animatedIndex, fromIndex, toIndex) {
        derivedStateOf {
            val fraction = if (fromIndex == toIndex) {
                1f
            } else {
                ((animatedIndex.value - fromIndex) / (toIndex - fromIndex)).coerceIn(0f, 1f)
            }
            Log.e("FillStyle", "evaluateBrushTransition: from($fromIndex) = ${stateSnapshot.initial}, to($toIndex) = ${stateSnapshot.target}, fraction = $fraction, animatableIndex = ${animatedIndex.value}", )
            MixedBrushFillStyle(
                from = from.brush,
                to = to.brush,
                fraction = fraction,
            )
        }
    }
}

@Composable
private fun evaluateBrushInterpolation(
    value: StatefulValue<FillStyle>,
    context: MotionContext,
    motionProperty: InterpolationMotionProperty<FillStyle>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: FillStyle?,
): State<FillStyle> {
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
            interpolationSpec.interpolator.interpolate(from, to, channel.fractionProvider().coerceIn(0f, 1f))
        }
    }
}

private val StatefulValue<FillStyle>.isColorFillStyles: Boolean
    get() = getValues().all { it is ColorFillStyle }

private val StatefulValue<FillStyle>.isBrushFillStyles: Boolean
    get() = getValues().all { it is BrushFillStyle }

private fun <T> FiniteAnimationSpec<T>.toFloatAnimationSpec(): FiniteAnimationSpec<Float> = when (this) {
    is TweenSpec -> tween(
        durationMillis = durationMillis,
        delayMillis = delay,
        easing = easing,
    )
    is SpringSpec -> SpringSpec(
        dampingRatio = dampingRatio,
        stiffness = stiffness,
    )
    is SnapSpec -> snap(delayMillis = delay)
    else -> snap()
}
