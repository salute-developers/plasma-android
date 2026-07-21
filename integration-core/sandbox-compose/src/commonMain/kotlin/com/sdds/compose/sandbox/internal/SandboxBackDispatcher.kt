package com.sdds.compose.sandbox.internal

import androidx.compose.runtime.compositionLocalOf

internal class SandboxBackDispatcher {
    private val handlers = mutableListOf<() -> Unit>()

    fun register(handler: () -> Unit): () -> Unit {
        handlers += handler
        return { handlers.remove(handler) }
    }

    fun handleBack(fallback: () -> Unit) {
        handlers.lastOrNull()?.invoke() ?: fallback()
    }
}

internal val LocalSandboxBackDispatcher = compositionLocalOf { SandboxBackDispatcher() }
