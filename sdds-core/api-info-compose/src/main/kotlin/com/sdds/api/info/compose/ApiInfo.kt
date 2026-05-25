package com.sdds.api.info.compose

/**
 * Аннотация для обозначения интерфейсов билдеров стилей компонентов
 */
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class ApiInfo

/**
 * Аннотация для обозначения enum'ов кастомных состояний компонента
 *
 * @param components компоненты, для которых применим данный стэйт сет
 */
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class StateSetInfo(val components: String)

/**
 * Аннотация для обозначения значений enum'ов кастомных состояний компонента
 *
 * @param configName альтернативное имя значения enum, используемое в конфиге компонента
 */
@Target(allowedTargets = [AnnotationTarget.PROPERTY])
@Retention
annotation class StateInfo(val configName: String = "")

/**
 * Аннотация, используемая для переопределения названия свойства (когда название свойства отличается от названия функции билдера)
 * @param name альтернативное название совйства
 */
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@Retention
annotation class Property(
    val name: String,
)
