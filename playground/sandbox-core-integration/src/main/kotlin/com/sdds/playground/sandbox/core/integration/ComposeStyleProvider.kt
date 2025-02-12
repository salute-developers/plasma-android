package com.sdds.playground.sandbox.core.integration

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.style.Style

/**
 * Базовый класс провайдера стилей компонента на Compose
 */
abstract class ComposeStyleProvider<K : Any, S : Style> {
    protected abstract val variations: Map<K, @Composable () -> S>

    /**
     * Список возможных вариаций компонента
     */
    val variants: List<K>
        get() = variations.keys.toList()

    /**
     * Дефолтная вариация
     */
    val defaultVariant: K
        get() = variations.entries.first().key

    /**
     * Вернёт стиль компонента [S] для ключа вариации [key]
     */
    @Composable
    fun style(key: K): S = variations[key]?.invoke()
        ?: variations[defaultVariant]?.invoke()
        ?: throw IllegalStateException("Style $key not found")
}
