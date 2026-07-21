package com.sdds.compose.uikit.interactions

import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.platform.debugInspectorInfo

/**
 * Модификатор, позволяющий компоненту устанавливать событие [InteractiveState.Selected]
 * в предоставленный [semanticStateSource].
 * Используется в тех компонентах, чьи свойства [StatefulValue] имеют selected состояние.
 *
 * @param selected выбран ли компонент
 * @param semanticStateSource источник семантических состояний
 */
fun Modifier.selection(
    selected: Boolean,
    semanticStateSource: MutableSemanticStateSource,
) = composed(
    inspectorInfo = debugInspectorInfo {
        name = "selection"
        properties["selected"] = selected
        properties["semanticStateSource"] = semanticStateSource
    },
) {
    SideEffect {
        semanticStateSource.set(InteractiveState.Selected, selected)
    }
    this
}
