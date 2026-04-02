package com.sdds.compose.uikit.motion

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.ValueStateSet
import com.sdds.compose.uikit.interactions.collectIsActivatedAsState
import com.sdds.compose.uikit.interactions.collectIsSelectedAsState

@Stable
interface MotionContext {

    val transitionChannel: MotionChannelProvider<TransitionMotionChannel>

    val interpolationChannels: Map<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>>

    val stateSnapshotProvider: MotionStateSnapshotProvider

    val interactionSource: MutableInteractionSource

}

fun interface MotionChannelProvider<T: MotionChannel> {

    @Composable
    fun provide(snapshot: MotionStateSnapshot): T
}

fun interface MotionStateSnapshotProvider {

    @Composable
    fun provide(): MotionStateSnapshot
}

@Immutable
data class MotionStateSnapshot(
    val initial: ValueStateSet,
    val target: ValueStateSet,
)

interface MotionContextBuilderScope {

    fun interpolationChannel(
        channelKey: MotionChannelKey = DefaultInterpolationChannelKey,
        channelProvider: MotionChannelProvider<InterpolationMotionChannel>
    )

    fun stateSnapshotProvider(
        stateSnapshotProvider: MotionStateSnapshotProvider
    )
}

@Composable
fun rememberMotionContext(
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    label: String? = null,
    builder: MotionContextBuilderScope.() -> Unit = {}
): MotionContext {
    return remember(interactionSource) {
        MotionContextBuilder(interactionSource) { state -> updateTransitionChannel(state.target, label) }
            .apply {
                stateSnapshotProvider { getStateSnapshot(interactionSource) }
            }
            .apply { builder() }
            .build()
    }
}


@Immutable
private class SimpleMotionContext(
    override val interpolationChannels: Map<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>>,
    override val stateSnapshotProvider: MotionStateSnapshotProvider,
    override val transitionChannel: MotionChannelProvider<TransitionMotionChannel>,
    override val interactionSource: MutableInteractionSource
) : MotionContext

private class MotionContextBuilder(
    private val interactionSource: MutableInteractionSource,
    private val transitionChannel: MotionChannelProvider<TransitionMotionChannel>,
) : MotionContextBuilderScope {

    private val channels: MutableMap<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>> =
        mutableMapOf()
    private var stateSnapshotProviders = mutableListOf<MotionStateSnapshotProvider>()


    override fun interpolationChannel(
        channelKey: MotionChannelKey,
        channelProvider: MotionChannelProvider<InterpolationMotionChannel>
    ) {
        channels[channelKey] = channelProvider
    }

    override fun stateSnapshotProvider(
        stateSnapshotProvider: MotionStateSnapshotProvider
    ) {
        this.stateSnapshotProviders.add(stateSnapshotProvider)
    }

    fun build(): MotionContext {
        return SimpleMotionContext(
            transitionChannel = transitionChannel,
            interpolationChannels = channels,
            interactionSource = interactionSource,
            stateSnapshotProvider = {
                stateSnapshotProviders
                    .map { it.provide() }
                    .fold(MotionStateSnapshot(emptySet(), emptySet())) { acc, snapshot ->
                        acc.merge(snapshot)
                    }
            }
        )
    }

}

private class SnapshotStateHolder(var state: ValueStateSet)

@Composable
private fun getStateSnapshot(
    interactionSource: InteractionSource,
    stateSet: Set<ValueState> = emptySet(),
): MotionStateSnapshot {
    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isActivated by interactionSource.collectIsActivatedAsState()
    val isSelected by interactionSource.collectIsSelectedAsState()
    val interactiveStateSet = remember(
        isPressed,
        isFocused,
        isHovered,
        isActivated,
        isSelected,
    ) {
        HashSet<InteractiveState>().apply {
            if (isPressed) add(InteractiveState.Pressed)
            if (isFocused) add(InteractiveState.Focused)
            if (isHovered) add(InteractiveState.Hovered)
            if (isActivated) add(InteractiveState.Activated)
            if (isSelected) add(InteractiveState.Selected)
        }
    }
    val combinedStateSet = remember(interactiveStateSet, stateSet) { interactiveStateSet + stateSet }
    val previousState = remember { SnapshotStateHolder(combinedStateSet) }
    val snapshot = remember(combinedStateSet) {
        MotionStateSnapshot(previousState.state, combinedStateSet)
    }
    previousState.state = combinedStateSet
    return snapshot
}

private fun MotionStateSnapshot.merge(other: MotionStateSnapshot): MotionStateSnapshot {
    return MotionStateSnapshot(
        initial = initial + other.initial,
        target = target + other.target,
    )
}
