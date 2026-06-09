package com.sdds.api.info.compose

/**
 * Аннотация для обозначения интерфейсов билдеров стилей компонентов
 *
 * @param components список имён компонентов, использующих этот билдер.
 * Если не указан, имя компонента выводится из имени интерфейса (MyStyleBuilder → My).
 * @param packageName имя пакета для генерируемых стилей.
 * Если не указан, пакет выводится из имени компонента. Используется для компонентов,
 * имя которых совпадает с зарезервированным словом Java (например, switch → switcher).
 * @param builderFunName имя функции-билдера стиля, генерируемой KSP.
 * Если не указан, используется имя по умолчанию.
 */
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class ApiInfo(
    val components: Array<String> = [],
    val packageName: String = "",
    val builderFunName: String = "",
)

/**
 * Аннотация для обозначения enum'ов кастомных состояний компонента
 *
 * @param components компоненты, для которых применим данный стэйт сет.
 * Если не указан, имя компонента выводится из имени enum-класса (MyStates → My, MyState → My, MyStateSet → My).
 */
@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention
annotation class StateSetInfo(val components: Array<String> = [])

/**
 * Аннотация для указания альтернативного имени в конфиге компонента.
 *
 * Используется для:
 * - значений enum'ов (CLASS/PROPERTY) — когда имя Kotlin-значения отличается от имени в конфиге
 * - методов билдеров (FUNCTION) — когда имя функции отличается от имени свойства в конфиге
 *
 * @param configName альтернативное имя, используемое в конфиге компонента
 */
@Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION])
@Retention
annotation class ConfigName(val configName: String)
