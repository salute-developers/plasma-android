package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.debugInspectorInfo
import kotlinx.coroutines.launch

/**
 * Событие, описывающее активное состояние компонента.
 * Это такое состояние, при котором сам компонент уходит из фокуса, но его потомки принимают фокус.
 */
interface ActivateInteraction : Interaction {

    /**
     * Событие, делающее компонент активным
     */
    class Activate : ActivateInteraction

    /**
     * Событие, отменяющее событие [Activate]
     *
     * @property activate событие [Activate], которое должно быть отменено
     */
    class Deactivate(val activate: Activate) : ActivateInteraction
}

/**
 * Вернет [State], описывающий состояние компонента activated.
 */
@Composable
fun InteractionSource.collectIsActivatedAsState(): State<Boolean> {
    val isActivated = remember { mutableStateOf(false) }
    LaunchedEffect(this) {
        val activateInteractions = mutableListOf<ActivateInteraction.Activate>()
        interactions.collect { interaction ->
            when (interaction) {
                is ActivateInteraction.Activate -> activateInteractions.add(interaction)
                is ActivateInteraction.Deactivate -> activateInteractions.remove(interaction.activate)
            }
            isActivated.value = activateInteractions.isNotEmpty()
        }
    }
    return isActivated
}

/**
 * Модификатор, позволяющий компоненту быть активным,
 * т.е. уметь отправлять ивенты [ActivateInteraction] в предоставленный [interactionSource].
 * Компонент, к которому применили этот модификатор, становится focusable.
 *
 * @param enabled включен или выключен компонент
 * @param interactionSource источник взаимодействий
 * @param onFocusChanged слушатель событий фокуса
 */
@Suppress("LongMethod")
fun Modifier.activatable(
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    onFocusChanged: (focusState: FocusState) -> Unit = {},
) = composed(
    inspectorInfo = debugInspectorInfo {
        name = "activatable"
        properties["enabled"] = enabled
        properties["interactionSource"] = interactionSource
    },
) {
    val scope = rememberCoroutineScope()
    val activateInteraction = remember { mutableStateOf<ActivateInteraction.Activate?>(null) }
    var isActivated by remember { mutableStateOf(false) }
    DisposableEffect(interactionSource) {
        onDispose {
            activateInteraction.value?.let { oldValue ->
                val interaction = ActivateInteraction.Deactivate(oldValue)
                interactionSource?.tryEmit(interaction)
                activateInteraction.value = null
            }
        }
    }
    DisposableEffect(enabled) {
        if (!enabled) {
            scope.launch {
                activateInteraction.value?.let { oldValue ->
                    val interaction = ActivateInteraction.Deactivate(oldValue)
                    interactionSource?.emit(interaction)
                    activateInteraction.value = null
                }
            }
        }
        onDispose { }
    }

    if (enabled) {
        this.onFocusChanged {
            isActivated = !it.isFocused && it.hasFocus
            onFocusChanged.invoke(it)
            if (isActivated) {
                scope.launch {
                    activateInteraction.value?.let { oldValue ->
                        val interaction = ActivateInteraction.Deactivate(oldValue)
                        interactionSource?.emit(interaction)
                        activateInteraction.value = null
                    }
                    val interaction = ActivateInteraction.Activate()
                    interactionSource?.emit(interaction)
                    activateInteraction.value = interaction
                }
            } else {
                scope.launch {
                    activateInteraction.value?.let { oldValue ->
                        val interaction = ActivateInteraction.Deactivate(oldValue)
                        interactionSource?.emit(interaction)
                        activateInteraction.value = null
                    }
                }
            }
        }
    } else {
        this
    }
        .focusable(enabled, interactionSource)
}