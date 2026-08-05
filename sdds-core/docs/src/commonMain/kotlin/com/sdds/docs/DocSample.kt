package com.sdds.docs

/**
 * Аннотация для функций с примерами кода.
 * @property id идентификатор примера
 * @property needScreenshot нужно ли генерировать скриншот
 */
@Retention(AnnotationRetention.SOURCE)
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
annotation class DocSample(val id: SampleId = "", val needScreenshot: Boolean = true)
