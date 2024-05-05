package com.sdds.plugin.core.utils

/**
 * Создает экземпляр [Lazy] с [LazyThreadSafetyMode.NONE]
 * @author malilex on 12.03.2024
 */
fun <T> unsafeLazy(initializer: () -> T): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE, initializer)
