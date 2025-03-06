package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.platform.debugInspectorInfo
import kotlinx.coroutines.launch

/**
 * Событие, описывающее выбранное состояние компонента.
 */
interface SelectInteraction : Interaction {

    /**
     * Событие, делающее компонент выбранным
     */
    class Select : SelectInteraction

    /**
     * Событие, отменяющее событие [Select]
     *
     * @property select событие [Select], которое должно быть отменено
     */
    class Deselect(val select: Select) : SelectInteraction
}

/**
 * Вернет [State], описывающий selected состояние компонента.
 */
@Composable
fun InteractionSource.collectIsSelectedAsState(): State<Boolean> {
    val isSelected = remember { mutableStateOf(false) }
    LaunchedEffect(this) {
        val selectInteractions = mutableListOf<SelectInteraction.Select>()
        interactions.collect { interaction ->
            when (interaction) {
                is SelectInteraction.Select -> selectInteractions.add(interaction)
                is SelectInteraction.Deselect -> selectInteractions.remove(interaction.select)
            }
            isSelected.value = selectInteractions.isNotEmpty()
        }
    }
    return isSelected
}

/**
 * Модификатор, позволяющий компоненту отправлять ивенты [SelectInteraction]
 * в предоставленный [interactionSource].
 * Используется в тех компонентах, чьи цвета [InteractiveColor] имеют selected состояние.
 *
 * @param selected выбран ли компонент
 * @param enabled включен или выключен компонент
 * @param interactionSource источник взаимодействий
 */
@Suppress("LongMethod")
fun Modifier.selection(
    selected: Boolean,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource,
) = composed(
    inspectorInfo = debugInspectorInfo {
        name = "selection"
        properties["selected"] = selected
        properties["enabled"] = enabled
        properties["interactionSource"] = interactionSource
    },
) {
    val scope = rememberCoroutineScope()
    val selectInteraction = remember { mutableStateOf<SelectInteraction.Select?>(null) }
    DisposableEffect(interactionSource) {
        onDispose {
            selectInteraction.tryDeselect(interactionSource)
        }
    }
    DisposableEffect(enabled) {
        if (!enabled) {
            scope.launch {
                selectInteraction.deselect(interactionSource)
            }
        }
        onDispose { }
    }
    if (enabled) {
        LaunchedEffect(interactionSource, selected) {
            if (selected) {
                launch {
                    selectInteraction.deselect(interactionSource)
                    selectInteraction.select(interactionSource)
                }
            } else {
                launch {
                    selectInteraction.deselect(interactionSource)
                }
            }
        }
    }
    this
}

private fun MutableState<SelectInteraction.Select?>.tryDeselect(
    interactionSource: MutableInteractionSource?,
) {
    value?.let { oldValue ->
        val interaction = SelectInteraction.Deselect(oldValue)
        interactionSource?.tryEmit(interaction)
        value = null
    }
}

private suspend fun MutableState<SelectInteraction.Select?>.deselect(
    interactionSource: MutableInteractionSource?,
) {
    value?.let { oldValue ->
        val interaction = SelectInteraction.Deselect(oldValue)
        interactionSource?.emit(interaction)
        value = null
    }
}

private suspend fun MutableState<SelectInteraction.Select?>.select(
    interactionSource: MutableInteractionSource?,
) {
    val interaction = SelectInteraction.Select()
    interactionSource?.emit(interaction)
    value = interaction
}
