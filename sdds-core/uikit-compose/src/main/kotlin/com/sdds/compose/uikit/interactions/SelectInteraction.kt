package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.Role
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
 * Модификатор, позволяющий компоненту быть выбираемым,
 * т.е. уметь отправлять ивенты [SelectInteraction] в предоставленный [interactionSource].
 * Компонент, к которому применили этот модификатор, становится toggleable.
 *
 * @param selected выбран ли компонент
 * @param enabled включен или выключен компонент
 * @param indication объект [Indication]
 * @param role роль [Role]
 * @param interactionSource источник взаимодействий
 * @param onSelectedChanged слушатель событий select
 */
@Suppress("LongMethod")
internal fun Modifier.selectable(
    selected: Boolean,
    enabled: Boolean = true,
    indication: Indication? = null,
    role: Role? = null,
    interactionSource: MutableInteractionSource,
    onSelectedChanged: (selected: Boolean) -> Unit = {},
) = composed(
    inspectorInfo = debugInspectorInfo {
        name = "selectable"
        properties["selected"] = selected
        properties["enabled"] = enabled
        properties["indication"] = indication
        properties["role"] = role
        properties["interactionSource"] = interactionSource
    },
) {
    val scope = rememberCoroutineScope()
    val selectInteraction = remember { mutableStateOf<SelectInteraction.Select?>(null) }
    var isSelected by remember { mutableStateOf(selected) }
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
        this.toggleable(
            enabled = true,
            value = isSelected,
            role = role,
            indication = indication,
            interactionSource = interactionSource,
        ) { selected ->
            onSelectedChanged.invoke(selected)
            isSelected = selected
            if (isSelected) {
                scope.launch {
                    selectInteraction.deselect(interactionSource)
                    selectInteraction.select(interactionSource)
                }
            } else {
                scope.launch {
                    selectInteraction.deselect(interactionSource)
                }
            }
        }
    } else {
        this
    }
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
