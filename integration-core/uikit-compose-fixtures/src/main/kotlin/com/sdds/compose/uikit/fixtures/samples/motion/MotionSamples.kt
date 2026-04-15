package com.sdds.compose.uikit.fixtures.samples.motion

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.MotionChannelKey
import com.sdds.compose.uikit.motion.MotionEvaluator
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.changesFrom
import com.sdds.compose.uikit.motion.changesTo
import com.sdds.compose.uikit.motion.colorEvaluator
import com.sdds.compose.uikit.motion.dpEvaluator
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.getColorAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.interpolation
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.motion.pointTo
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.motion.transition
import com.sdds.compose.uikit.motion.updateInterpolationChannel
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet

@DocSample(needScreenshot = false)
@Composable
fun Motion_Remember() {
    val motionStyle = object : MotionStyle {}
    composableCodeSnippet {
        val interactionSource = remember { MutableInteractionSource() }
        val motion = rememberMotion(
            style = motionStyle,
            context = rememberMotionContext(interactionSource = interactionSource),
        )
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_Context() {
    composableCodeSnippet {
        val interactionSource = remember { MutableInteractionSource() }
        val motionContext = rememberMotionContext(
            interactionSource = interactionSource,
            label = "ButtonMotion",
        )
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_InterpolationChannel() {
    composableCodeSnippet {
        placeholder(Unit, "object IconProgressChannelKey : MotionChannelKey")
        var expanded by remember { mutableStateOf(false) }
        val progress by animateFloatAsState(targetValue = if (expanded) 1f else 0f)

        val motionContext = rememberMotionContext {
            interpolationChannel(placeholder(DummyChannelKey, "IconProgressChannelKey")) {
                updateInterpolationChannel { progress }
            }
        }
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_TransitionProp() {
    composableCodeSnippet {
        val containerColorMotion = transition<Color>(label = "ContainerColor") {
            segment {
                condition { it changesTo InteractiveState.Pressed }
            } changesWith { finite(tween(durationMillis = 120)) }

            segment {
                condition { it changesFrom InteractiveState.Pressed }
            } changesWith { finite(tween(durationMillis = 180)) }
        }
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_InterpolationProp() {
    composableCodeSnippet {
        placeholder(Unit, "object ThumbProgressKey : MotionChannelKey")

        val thumbOffsetMotion = interpolation<Dp>(
            channelKey = placeholder(DummyChannelKey, "ThumbProgressKey"),
            label = "ThumbOffset",
        ) {
            segment {
                condition { it changes InteractiveState.Selected }
            } evaluatesBy { dpEvaluator() }
        }
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_InterpolationVector() {
    val thumbOffsetMotion = interpolation(channelKey = DummyChannelKey) {
        codeSnippet {
            segment {
                condition { it changes InteractiveState.Selected }
                vector { snapshot -> snapshot pointTo InteractiveState.Selected }
            } evaluatesBy {
                colorEvaluator()
            }
        }
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_InterpolationEvaluator() {
    codeSnippet {
        val angleMotion = interpolation<Float> {
            segment { } evaluatesBy {
                MotionEvaluator { from, to, fraction ->
                    from + (to - from) * fraction
                }
            }
        }
    }
}

@DocSample(needScreenshot = false)
@Composable
fun Motion_ValueAsState() {
    val colors = DummyStyle()
    val dimensions = DummyStyle()
    val motionStyle = DummyMotionStyle()
    val motion = rememberMotion(motionStyle)
    composableCodeSnippet {
        val containerColor by colors.container.getColorAsState(
            context = motion.context,
            motionProperty = motion.style.container,
        )

        val contentColor by colors.content.getColorAsState(
            context = motion.context,
            motionProperty = motion.style.content,
        )

        val elevation by dimensions.elevation.getDpAsState(
            context = motion.context,
            motionProperty = motion.style.elevation,
        )
    }
}

private val DummyChannelKey = object : MotionChannelKey {}

private class DummyStyle {
    val container: StatefulValue<Color> = Color.Transparent.asStatefulValue()
    val content: StatefulValue<Color> = Color.Transparent.asStatefulValue()
    val elevation: StatefulValue<Dp> = 0.dp.asStatefulValue()
}

private class DummyMotionStyle : MotionStyle {
    val container: MotionProperty<Color> = noMotion()
    val content: MotionProperty<Color> = noMotion()
    val elevation: MotionProperty<Dp> = noMotion()
}
