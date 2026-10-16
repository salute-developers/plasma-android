package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import kotlinx.serialization.json.JsonElement

/**
 * Разрешает literal либо token reference; неизвестный token, [PreviewPropertySource.StyleReference]
 * и [PreviewPropertySource.AssetReference] возвращают `null`. [applyAlpha] накладывает прозрачность источника.
 */
public fun <T> PreviewPropertySource.resolve(
    literal: (JsonElement) -> T?,
    token: (String) -> T?,
    applyAlpha: (T, Float) -> T = { value, _ -> value },
    tokenWithAlpha: ((String, Float) -> T?)? = null,
): T? = when (this) {
    is PreviewPropertySource.Literal -> literal(value)?.withAlpha(alpha, applyAlpha)
    is PreviewPropertySource.TokenReference -> {
        // Значение, которое нельзя изменить после построения (градиент), строится сразу с прозрачностью.
        val withAlpha = alpha?.let { factor -> tokenWithAlpha?.invoke(tokenId, factor.toFloat()) }
        withAlpha ?: token(tokenId)?.withAlpha(alpha, applyAlpha)
    }
    is PreviewPropertySource.StyleReference, is PreviewPropertySource.AssetReference -> null
}

private fun <T> T.withAlpha(alpha: Double?, applyAlpha: (T, Float) -> T): T =
    if (alpha == null) this else applyAlpha(this, alpha.toFloat())

/** Разрешает base и записи состояний, пропуская несовместимые значения. */
public fun <T> PreviewPropertyValue.resolveStates(
    literal: (JsonElement) -> T?,
    token: (String) -> T?,
    applyAlpha: (T, Float) -> T = { value, _ -> value },
    tokenWithAlpha: ((String, Float) -> T?)? = null,
): ResolvedProperty<T>? {
    val resolvedBase = base.resolve(literal, token, applyAlpha, tokenWithAlpha) ?: return null
    return ResolvedProperty(
        resolvedBase,
        states.mapNotNull { entry ->
            entry.source.resolve(
                literal,
                token,
                applyAlpha,
                tokenWithAlpha,
            )?.let { ResolvedState(entry.states.toSet(), it) }
        },
    )
}

/** Разрешённое значение для набора одновременно активных состояний. */
public data class ResolvedState<out T>(
    /** Имена состояний, которые должны быть активны одновременно. */ val names: Set<String>,
    /** Значение для этого набора. */ val value: T,
)

/** Разрешённое базовое значение и значения для наборов состояний в порядке payload. */
public data class ResolvedProperty<out T>(
    /** Базовое значение property. */ val base: T,
    /** Значения для наборов состояний. */ val states: List<ResolvedState<T>>,
) {
    /**
     * Выбирает значение для набора активных состояний [active]: побеждает запись с наибольшим числом
     * имён, при равенстве последняя в payload; без подходящих записей возвращается [base].
     */
    public fun select(active: Set<String>): T {
        var best: ResolvedState<T>? = null
        for (state in states) {
            if (active.containsAll(state.names) && (best == null || state.names.size >= best.names.size)) {
                best = state
            }
        }
        return best?.value ?: base
    }
}
