package com.sdds.compose.uikit.motion

import android.util.Log
import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.transform
import com.sdds.compose.uikit.internal.common.BrushFillStyle
import com.sdds.compose.uikit.internal.common.ColorFillStyle
import com.sdds.compose.uikit.internal.common.FillStyle
import com.sdds.compose.uikit.internal.common.VectorConverter

@Composable
fun StatefulValue<FillStyle>.getFillStyleAsState(
    context: MotionContext,
    motionProperty: MotionProperty<FillStyle>,
    defaultValue: FillStyle? = null,
): State<FillStyle> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val state = context.stateSnapshotProvider.provide()
    return when {
        isColorFillStyles -> {
            val values = remember(this) { transform { it as ColorFillStyle } }
            val colorSpace = (getValue(state.target) as ColorFillStyle).color.colorSpace
            val typeConverter = remember(colorSpace) { ColorFillStyle.VectorConverter(colorSpace) }
            values.getValueAsState(
                context = context,
                motionProperty = motionProperty,
                converter = typeConverter,
                defaultValue = defaultValue
            )
        }
        isBrushFillStyles -> {
            val values = remember(this) { transform { it as BrushFillStyle } }
            values.getValueAsState(
                context = context,
                motionProperty = motionProperty,
                converter = typeConverter,
                defaultValue = defaultValue
            )
        }
        else -> {

            rememberUpdatedState(getValue(state.target, defaultValue))
        }
    }
}

private val StatefulValue<FillStyle>.isColorFillStyles: Boolean
    get() = getValues().all { it is ColorFillStyle }

private val StatefulValue<FillStyle>.isBrushFillStyles: Boolean
    get() = getValues().all { it is BrushFillStyle }

@Composable
private fun StatefulValue<BrushFillStyle>.animateAsState(
    context: MotionContext,
    motionProperty: TransitionMotionProperty<BrushFillStyle>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: BrushFillStyle? = null,
): State<BrushFillStyle> {
    val channel = context.transitionChannel.provide(stateSnapshot)
    val fraction = channel.transition.animateFloat(
        transitionSpec = {
            val segment = motionProperty.resolve(stateSnapshot)
            segment.spec().animationSpec
        },
        label = motionProperty.label.orEmpty(),
    ) { states ->
        if (states == channel.transition.currentState) 0f else 1f
    }
    return remember {
        derivedStateOf {
            getValue(states, defaultValue).also {
                Log.d("StatefulValue", "getValueAsState: for $states")
            }
        }
    }
}

@Composable
private fun <T> StatefulValue<T>.interpolateAsState(
    context: MotionContext,
    motionProperty: InterpolationMotionProperty<T>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: T? = null,
): State<T> {
    val segment = motionProperty.resolve(stateSnapshot)
    val channel = context.interpolationChannels[segment.channelKey]
        ?.provide(stateSnapshot)
        ?: return rememberUpdatedState(getValue(stateSnapshot.target, defaultValue))
    val interpolationSpec = segment.spec()
    return remember(channel, interpolationSpec, defaultValue) {
        derivedStateOf {
            Log.e("StatefulValue", "interpolateAsState(${motionProperty.label}): $stateSnapshot")
            val fraction = channel.fractionProvider().coerceIn(0f, 1f)
            val vector = segment.vector.provide(stateSnapshot)
            val fromValue = getValue(vector.from, defaultValue)
            val toValue = getValue(vector.to, defaultValue)
            interpolationSpec.interpolator.interpolate(fromValue, toValue, fraction)
        }
    }
}

@Composable
private fun <T : Any, V : AnimationVector> StatefulValue<T>.getValueAsState(
    context: MotionContext,
    motionProperty: MotionProperty<T>,
    converter: TwoWayConverter<T, V>,
    stateSnapshot: MotionStateSnapshot? = null,
    defaultValue: T? = null,
): State<T> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val state = stateSnapshot ?: context.stateSnapshotProvider.provide()
    if (motionProperty.isEmpty) return rememberUpdatedState(getValue(state.target, defaultValue))
    return when (motionProperty) {
        is TransitionMotionProperty -> animateAsState(context, motionProperty, converter, state, defaultValue)
        is InterpolationMotionProperty -> interpolateAsState(context, motionProperty, state, defaultValue)
        else -> rememberUpdatedState(getValue(state.target, defaultValue))
    }
}
