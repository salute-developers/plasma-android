package com.sdds.sandbox

import kotlin.reflect.KClass

interface BaseStory<State: UiState> {
    val component: ComponentKey

    val defaultState: State

    val propertiesProducer: PropertiesProducer<State>

    val stateTransformer: StateTransformer<State>

}

@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class Story

@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class StoryUiState


@Target(allowedTargets = [AnnotationTarget.FIELD, AnnotationTarget.PROPERTY])
@Retention
annotation class StoryProperty(
    val displayName: String = "",
    val producedBy: KClass<*> = Unit::class,
    val transformedBy: KClass<*> = Unit::class,
)