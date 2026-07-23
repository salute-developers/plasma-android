package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import kotlinx.serialization.json.JsonElement

/** Разрешает literal либо token reference; неизвестный token возвращает `null`. */
public fun <T> PreviewPropertySource.resolve(
    literal: (JsonElement) -> T?,
    token: (String) -> T?,
): T? = when (this) {
    is PreviewPropertySource.Literal -> literal(value)
    is PreviewPropertySource.TokenReference -> token(tokenId)
}

/** Разрешает base и известные interaction states, пропуская несовместимые значения. */
public fun <T> PreviewPropertyValue.resolveStates(
    literal: (JsonElement) -> T?,
    token: (String) -> T?,
): ResolvedProperty<T>? {
    val resolvedBase = base.resolve(literal, token) ?: return null
    return ResolvedProperty(
        resolvedBase,
        states.mapNotNull { (key, value) ->
            value.resolve(literal, token)?.let {
                key to it
            }
        }.toMap(),
    )
}

/** Разрешённое базовое значение и interaction-state overrides. */
public data class ResolvedProperty<T>(
    /** Базовое значение property. */ val base: T,
    /** Значения по идентификаторам interaction states. */ val states: Map<String, T>,
)
