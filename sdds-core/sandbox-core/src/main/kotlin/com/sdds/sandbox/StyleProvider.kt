package com.sdds.sandbox

interface StyleReference<out S> {

    fun get(): S
}

abstract class StyleProvider<SR: StyleReference<*>> {

    protected abstract val variations: Map<String, SR>

    /**
     * Список возможных вариаций компонента
     */
    val variants: List<String>
        get() = variations.keys.toList()

    /**
     * Дефолтная вариация
     */
    val defaultVariant: String
        get() = variations.entries.first().key

    /**
     * Вернёт стиль компонента [S] для ключа вариации [key]
     */
    fun styleReference(key: String): SR = variations[key]
        ?: variations[defaultVariant]
        ?: throw IllegalStateException("Style $key not found")

}