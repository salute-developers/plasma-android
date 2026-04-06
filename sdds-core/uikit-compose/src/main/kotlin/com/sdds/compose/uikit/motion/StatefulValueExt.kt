package com.sdds.compose.uikit.motion

import android.util.Log
import androidx.compose.animation.VectorConverter
import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.interactions.StatefulValue

@Composable
fun StatefulValue<Color>.getColorAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Color>,
    defaultValue: Color? = null,
): State<Color> {
    if (!isStateful()) return rememberUpdatedState(getDefaultValue())
    val stateSnapshot = context.stateSnapshotProvider.provide()
    val colorSpace = getValue(stateSnapshot.target).colorSpace
    val typeConverter = remember(colorSpace) { Color.VectorConverter(colorSpace) }
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = typeConverter,
        defaultValue = defaultValue,
        stateSnapshot = stateSnapshot,
    )
}

@Composable
fun StatefulValue<Dp>.getDpAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Dp>,
    defaultValue: Dp = Dp.Unspecified,
): State<Dp> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Dp.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<Float>.getFloatAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Float>,
    defaultValue: Float = 0f,
): State<Float> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Float.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<Int>.getIntAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Int>,
    defaultValue: Int = 0,
): State<Int> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Int.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<Offset>.getOffsetAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Offset>,
    defaultValue: Offset = Offset.Zero,
): State<Offset> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Offset.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<IntOffset>.getIntOffsetAsState(
    context: MotionContext,
    motionProperty: MotionProperty<IntOffset>,
    defaultValue: IntOffset = IntOffset.Zero,
): State<IntOffset> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = IntOffset.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<Size>.getSizeAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Size>,
    defaultValue: Size = Size.Zero,
): State<Size> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Size.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<IntSize>.getIntSizeAsState(
    context: MotionContext,
    motionProperty: MotionProperty<IntSize>,
    defaultValue: IntSize = IntSize.Zero,
): State<IntSize> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = IntSize.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
fun StatefulValue<Rect>.getRectAsState(
    context: MotionContext,
    motionProperty: MotionProperty<Rect>,
    defaultValue: Rect = Rect.Zero,
): State<Rect> {
    return getValueAsState(
        context = context,
        motionProperty = motionProperty,
        converter = Rect.VectorConverter,
        defaultValue = defaultValue
    )
}

@Composable
private fun <T : Any, V : AnimationVector> StatefulValue<T>.animateAsState(
    context: MotionContext,
    motionProperty: TransitionMotionProperty<T>,
    converter: TwoWayConverter<T, V>,
    stateSnapshot: MotionStateSnapshot,
    defaultValue: T? = null,
): State<T> {
    val channel = context.transitionChannel.provide(stateSnapshot)
    return channel.transition.animateValue(
        typeConverter = converter,
        transitionSpec = {
            val segment = motionProperty.resolve(stateSnapshot)
            segment.spec().animationSpec
        },
        label = motionProperty.label.orEmpty(),
    ) { states ->
        getValue(states, defaultValue).also {
            Log.d("StatefulValue", "getValueAsState: for $states")
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
internal fun <T : Any, V : AnimationVector> StatefulValue<T>.getValueAsState(
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
