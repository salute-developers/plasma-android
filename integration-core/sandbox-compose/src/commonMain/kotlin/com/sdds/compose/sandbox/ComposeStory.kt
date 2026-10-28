package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.sandbox.internal.ComponentScaffold
import com.sdds.compose.sandbox.internal.ComponentViewModel
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.UiState

/** Подключает common story contract к lifecycle и UI demo-приложения. */
@Composable
internal fun <State : UiState, S : Style> ComposeBaseStory<State, S>.Story() {
    val stateController: ComponentViewModel<State, S> = viewModel(key = component.value) {
        ComponentViewModel(
            defaultState = defaultState,
            propertiesProducer = propertiesProducer,
            stateTransformer = stateTransformer,
            componentKey = component,
        )
    }
    DisposableEffect(stateController) {
        attachStateOwner(stateController)
        onDispose { detachStateOwner(stateController) }
    }
    ComponentScaffold(
        key = component,
        stateController = stateController,
        component = { state, style -> Content(style, state) },
    )
}
