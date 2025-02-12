package com.sdds.playground.sandbox.core.integration

import androidx.annotation.StyleRes
import com.sdds.uikit.colorstate.ColorState

/**
 * Базовый класс провайдера стилей компонента на ViewSystem
 */
abstract class ViewStyleProvider<K : Any> {
    protected abstract val variations: Map<K, Int>
    protected open val colorVariations: Map<K, ColorState> = emptyMap()

    /**
     * Список всех возможных вариаций компонента
     */
    val variants: List<K>
        get() = variations.keys.toList()

    /**
     * Список всех возможных цветовых вариаций компонента
     */
    val colorVariants: List<K>
        get() = colorVariations.keys.toList()

    /**
     * Дефолтная вариация
     */
    val defaultVariant: K
        get() = variations.entries.first().key

    /**
     * Дефолтная вариация цвета
     */
    val defaultColorVariant: K
        get() = colorVariations.entries.first().key

    /**
     * Вернёт ресурс стиля компонента для ключа вариации [key]
     */
    @StyleRes
    fun styleRes(key: K): Int = variations[key]
        ?: variations[defaultVariant]
        ?: throw IllegalStateException("Style $key not found")

    /**
     * Вернёт [ColorState] компонента для ключа вариации [key]
     */
    fun colorState(key: K): ColorState = colorVariations[key]
        ?: colorVariations[defaultColorVariant]
        ?: throw IllegalStateException("ColorState $key not found")
}
