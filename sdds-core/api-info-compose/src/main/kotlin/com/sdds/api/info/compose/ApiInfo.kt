package com.sdds.api.info.compose

/**
 * Аннотация для обозначения интерфейсов билдеров стилей компонентов
 */
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class ApiInfo

/**
 * Аннотация, используемая для переопределения названия свойства (когда название свойства отличается от названия функции билдера)
 * @param name альтернативное название совйства
 */
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@Retention
annotation class Property(
    val name: String,
)
