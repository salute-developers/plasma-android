package com.sdds.preview.compose.plugin

import androidx.compose.runtime.AbstractApplier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.Recomposer
import kotlin.coroutines.EmptyCoroutineContext

private class UnitApplier : AbstractApplier<Unit>(Unit) {
    override fun insertTopDown(index: Int, instance: Unit) = Unit
    override fun insertBottomUp(index: Int, instance: Unit) = Unit
    override fun remove(index: Int, count: Int) = Unit
    override fun move(from: Int, to: Int, count: Int) = Unit
    override fun onClear() = Unit
}

/** Выполняет composable один раз без UI и возвращает его результат. */
internal fun <T> composeOnce(content: @Composable () -> T): T {
    var result: Any? = null
    val recomposer = Recomposer(EmptyCoroutineContext)
    val composition = Composition(UnitApplier(), recomposer)
    try {
        composition.setContent { result = content() }
    } finally {
        composition.dispose()
        recomposer.cancel()
    }
    @Suppress("UNCHECKED_CAST")
    return result as T
}
