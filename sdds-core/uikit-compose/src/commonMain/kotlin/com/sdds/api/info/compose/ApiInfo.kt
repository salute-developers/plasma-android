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
@Retention(AnnotationRetention.SOURCE)
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
@Retention(AnnotationRetention.SOURCE)
annotation class ApiStateSet(val components: Array<String> = [])

/**
 * Аннотация для указания альтернативного имени в конфиге компонента.
 *
 * Используется для:
 * - значений enum'ов (CLASS/PROPERTY) — когда имя Kotlin-значения отличается от имени в конфиге
 * - методов билдеров (FUNCTION) — когда имя функции отличается от имени свойства в конфиге
 *
 * @param name альтернативное имя, используемое в конфиге компонента
 */
@Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION])
@Retention(AnnotationRetention.SOURCE)
annotation class ApiName(val name: String)

/**
 * Помечает метод билдера стиля устаревшим **в API-мете** (`uikit-compose-api-meta.json`).
 *
 * Это разметка меты, а не замена [Deprecated]: аннотация не влияет на компиляцию и не создаёт
 * предупреждений. Нативная депрекация кода по-прежнему выражается через [Deprecated], и обе
 * аннотации независимы:
 * - метод только с [Deprecated] из меты исключается, как и раньше;
 * - метод с [ApiDeprecated] попадает в мету с полем `deprecated` (вне зависимости от
 *   наличия [Deprecated]);
 * - если нужны и предупреждение компилятора, и пометка в мете — ставятся обе аннотации.
 *
 * Статус относится к свойству целиком. Свойство определяется своим `id` — это значение
 * [ApiName] либо имя метода. Если [ApiDeprecated] стоит хотя бы на одной перегрузке, в мете
 * `deprecated` получают **все** записи с тем же `id`, в том числе перегрузки без аннотации.
 * `message` берётся у первой помеченной перегрузки в порядке объявления; различие сообщений
 * у перегрузок ошибкой не является.
 *
 * Генератор стилей пропускает свойства с `deprecated`, поэтому они не попадают в
 * сгенерированный код.
 *
 * Пример: пометка одной перегрузки делает устаревшими обе записи `color` в мете.
 * ```
 * @ApiDeprecated("Use InteractiveColor")
 * fun color(color: Color): Builder
 * fun color(color: InteractiveColor): Builder
 * ```
 *
 * @param message сообщение об устаревании; пустое значение допустимо — сам факт аннотации
 * означает, что свойство устарело
 */
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@Retention(AnnotationRetention.SOURCE)
annotation class ApiDeprecated(val message: String = "")
