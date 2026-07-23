package com.sdds.compose.sandbox

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.BaseStory
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.PropertiesProducer
import com.sdds.sandbox.StateOwner
import com.sdds.sandbox.StateTransformer
import com.sdds.sandbox.UiState
import com.sdds.sandbox.producer
import com.sdds.sandbox.transformer
import kotlinx.coroutines.flow.StateFlow

/**
 * Общий Compose-контракт story, доступный demo UI и preview runtime.
 *
 * Класс содержит только модель story и типизированный renderer [Content]. Demo lifecycle
 * подключает [StateOwner] через [attachStateOwner] и [detachStateOwner].
 */
public abstract class ComposeBaseStory<State : UiState, S : Style>(
    override val component: ComponentKey,
    override val defaultState: State,
    override val propertiesProducer: PropertiesProducer<State> = defaultState.producer(),
    override val stateTransformer: StateTransformer<State> = defaultState.transformer(),
) : BaseStory<State>, StateOwner<State> {
    private var stateOwner: StateOwner<State>? = null

    override val uiState: StateFlow<State>
        get() = checkNotNull(stateOwner) { "StateOwner не подключен к ${this::class.simpleName}" }.uiState

    /** Отображает компонент с явно подготовленными стилем и состоянием. */
    @Composable
    public abstract fun BoxScope.Content(style: S, state: State)

    /** Отображает компактное превью story в demo navigation. */
    @Composable
    public open fun Preview(style: S, key: ComponentKey) {
        Text("empty preview, key=$key")
    }

    override fun updateState(state: State) {
        checkNotNull(stateOwner) { "StateOwner не подключен к ${this::class.simpleName}" }.updateState(state)
    }

    /** Подключает owner, управляющий состоянием в demo lifecycle. */
    public fun attachStateOwner(owner: StateOwner<State>) {
        stateOwner = owner
    }

    /** Отключает owner, если он всё ещё принадлежит текущему lifecycle. */
    public fun detachStateOwner(owner: StateOwner<State>) {
        if (stateOwner === owner) stateOwner = null
    }
}
