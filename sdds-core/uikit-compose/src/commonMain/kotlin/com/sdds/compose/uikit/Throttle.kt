package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import kotlin.time.TimeSource

private val throttleTimeOrigin = TimeSource.Monotonic.markNow()

private fun throttleTimeMillis(): Long = throttleTimeOrigin.elapsedNow().inWholeMilliseconds

/**
 * Локальный CompositionLocal, задающий интервал троттлинга в миллисекундах.
 * По умолчанию - 300 мс.
 */
val LocalThrottleIntervalMs = staticCompositionLocalOf { 300L }

/**
 * Возвращает версию callback без аргументов, ограниченную по частоте вызовов (throttle).
 *
 * @param intervalMs Интервал троттлинга в миллисекундах. Значение берется из [LocalThrottleIntervalMs], если не указано.
 */
@Composable
inline fun (() -> Unit).throttled(intervalMs: Long = LocalThrottleIntervalMs.current): () -> Unit =
    throttledCallback(intervalMs, this)

/**
 * Возвращает версию callback с одним аргументом, ограниченную по частоте вызовов (throttle).
 *
 * @param intervalMs Интервал троттлинга в миллисекундах. Значение берется из [LocalThrottleIntervalMs], если не указано.
 */
@Composable
inline fun <T> ((T) -> Unit).throttled(intervalMs: Long = LocalThrottleIntervalMs.current): (T) -> Unit =
    throttledCallback(intervalMs, this)

/**
 * Возвращает версию callback с двумя аргументами, ограниченную по частоте вызовов (throttle).
 *
 * @param intervalMs Интервал троттлинга в миллисекундах. Значение берется из [LocalThrottleIntervalMs], если не указано.
 */
@Composable
inline fun <A, B> ((A, B) -> Unit).throttled(intervalMs: Long = LocalThrottleIntervalMs.current): (A, B) -> Unit =
    throttledCallback(intervalMs, this)

/**
 * Создает троттлинг-обертку над callback без аргументов.
 *
 * @param intervalMs Интервал троттлинга.
 * @param onEvent Исходный callback.
 */
@Composable
fun throttledCallback(
    intervalMs: Long = LocalThrottleIntervalMs.current,
    onEvent: () -> Unit,
): () -> Unit {
    val currentOnEvent by rememberUpdatedState(onEvent)
    var lastTime by remember { mutableLongStateOf(Long.MIN_VALUE) }

    return remember(intervalMs) {
        {
            val now = throttleTimeMillis()
            if (lastTime == Long.MIN_VALUE || now - lastTime >= intervalMs) {
                lastTime = now
                currentOnEvent()
            }
        }
    }
}

/**
 * Создает троттлинг-обертку над callback с одним аргументом.
 *
 * @param intervalMs Интервал троттлинга.
 * @param onEvent Исходный callback.
 */
@Composable
fun <T> throttledCallback(
    intervalMs: Long = LocalThrottleIntervalMs.current,
    onEvent: (T) -> Unit,
): (T) -> Unit {
    val currentOnEvent by rememberUpdatedState(onEvent)
    var lastTime by remember { mutableLongStateOf(Long.MIN_VALUE) }

    return remember(intervalMs) {
        {
                value: T ->
            val now = throttleTimeMillis()
            if (lastTime == Long.MIN_VALUE || now - lastTime >= intervalMs) {
                lastTime = now
                currentOnEvent(value)
            }
        }
    }
}

/**
 * Создает троттлинг-обертку над callback с двумя аргументами.
 *
 * @param intervalMs Интервал троттлинга.
 * @param onEvent Исходный callback.
 */
@Composable
fun <A, B> throttledCallback(
    intervalMs: Long = LocalThrottleIntervalMs.current,
    onEvent: (A, B) -> Unit,
): (A, B) -> Unit {
    val currentOnEvent by rememberUpdatedState(onEvent)
    var lastTime by remember { mutableLongStateOf(Long.MIN_VALUE) }

    return remember(intervalMs) {
        {
                a: A, b: B ->
            val now = throttleTimeMillis()
            if (lastTime == Long.MIN_VALUE || now - lastTime >= intervalMs) {
                lastTime = now
                currentOnEvent(a, b)
            }
        }
    }
}
