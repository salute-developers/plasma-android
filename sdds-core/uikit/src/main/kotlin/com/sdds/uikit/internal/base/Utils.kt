package com.sdds.uikit.internal.base

/**
 * Удобный вариант [lazy] с [LazyThreadSafetyMode.NONE]
 * @author Малышев Александр on 31.05.2024
 */
internal inline fun <T> unsafeLazy(noinline initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)
