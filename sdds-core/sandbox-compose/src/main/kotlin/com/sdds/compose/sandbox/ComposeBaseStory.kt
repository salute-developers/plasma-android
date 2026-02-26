package com.sdds.compose.sandbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.sandbox.internal.ComponentScaffold
import com.sdds.compose.sandbox.internal.ComponentViewModel
import com.sdds.compose.sandbox.internal.ComponentViewModelFactory
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.BaseStory
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.UiState
import com.sdds.sandbox.producer
import com.sdds.sandbox.transformer

abstract class ComposeBaseStory<State : UiState, S : Style>(
    override val component: ComponentKey,
    override val defaultState: State,
    override val propertiesProducer: PropertiesProducer<State> = defaultState.producer(),
    override val stateTransformer: StateTransformer<State> = defaultState.transformer()
) : BaseStory<State> {

    @Composable
    abstract fun BoxScope.Content(
        style: S,
        state: State,
    )

    @Composable
    internal fun Story() {
        ComponentScaffold(
            key = component,
            viewModel = viewModel<ComponentViewModel<State, S>>(
                factory = ComponentViewModelFactory<State, S>(
                    defaultState = defaultState,
                    propertiesProducer = propertiesProducer,
                    stateTransformer = stateTransformer,
                    componentKey = component,
                ),
                key = component.toString(),
            ),
            component = { state, style ->
                Content(style, state)
            },
        )
    }
}

