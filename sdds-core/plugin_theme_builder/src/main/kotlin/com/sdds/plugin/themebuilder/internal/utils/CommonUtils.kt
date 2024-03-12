package com.sdds.plugin.themebuilder.internal.utils

/**
 * Создает экземпляр [Lazy] с [LazyThreadSafetyMode.NONE]
 * @author malilex on 12.03.2024
 */
internal fun <T> unsafeLazy(initializer: () -> T): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE, initializer)
