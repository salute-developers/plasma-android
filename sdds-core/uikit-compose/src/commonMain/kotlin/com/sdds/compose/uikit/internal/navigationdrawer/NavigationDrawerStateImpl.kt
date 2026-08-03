package com.sdds.compose.uikit.internal.navigationdrawer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.setValue
import com.sdds.compose.uikit.NavigationDrawerState
import com.sdds.compose.uikit.NavigationDrawerValue

internal class NavigationDrawerStateImpl(
    initialValue: NavigationDrawerValue,
) : NavigationDrawerState {

    override var currentValue: NavigationDrawerValue by mutableStateOf(initialValue)
        private set

    override var targetValue: NavigationDrawerValue by mutableStateOf(initialValue)
        private set

    override var progress: Float by mutableFloatStateOf(initialValue.progress)
        private set

    override val isExpanded: Boolean
        get() = currentValue == NavigationDrawerValue.Expanded

    override val isCollapsed: Boolean
        get() = currentValue == NavigationDrawerValue.Collapsed

    override val isAnimationRunning: Boolean
        get() = currentValue != targetValue || progress != currentValue.progress

    override suspend fun expand() {
        snapTo(NavigationDrawerValue.Expanded)
    }

    override suspend fun collapse() {
        snapTo(NavigationDrawerValue.Collapsed)
    }

    override suspend fun snapTo(targetValue: NavigationDrawerValue) {
        this.targetValue = targetValue
        currentValue = targetValue
        progress = targetValue.progress
    }

    internal fun updateProgress(progress: Float) {
        this.progress = progress.coerceIn(0f, 1f)
    }

    companion object {
        val Saver: Saver<NavigationDrawerState, Int> = Saver(
            save = { it.currentValue.ordinal },
            restore = { NavigationDrawerStateImpl(NavigationDrawerValue.entries[it]) },
        )
    }
}

private val NavigationDrawerValue.progress: Float
    get() = when (this) {
        NavigationDrawerValue.Expanded -> 1f
        NavigationDrawerValue.Collapsed -> 0f
    }
