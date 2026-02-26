package com.sdds.sandbox

/**
 * Состояние компонента с вариацией [variant]
 */
interface UiState {

    /**
     * Вариация компонента
     */
    @StoryProperty
    val variant: String
        get() = ""

    /**
     * Внешний вид компонента
     */
    @StoryProperty
    val appearance: String
        get() = ""

    /**
     * Создает копию состояния с новым [variant]
     */
    fun updateVariant(appearance: String, variant: String): UiState
}

interface StateTransformer<State: UiState> {

    fun transform(state: State, name: String, value: Any): State
}

interface StateValueTransformer<Input, Output> {

    fun transform(input: Input): Output
}

fun <State: UiState> UiState.producer(): PropertiesProducer<State> = object : PropertiesProducer<State> {
    override fun getProperties(state: State): List<Property<*>> {
        return emptyList()
    }
}

fun <State: UiState> UiState.transformer(): StateTransformer<State> = object : StateTransformer<State> {
    override fun transform(state: State, name: String, value: Any): State {
        return state
    }
}