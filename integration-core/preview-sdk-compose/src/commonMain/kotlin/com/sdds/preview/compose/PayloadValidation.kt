package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewAssetType
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewWarning

private const val STYLES_PATH = "$.styles"

/**
 * Проверяет ссылки на стили и ресурсы до построения стиля.
 * Бросает [PreviewPreparationException] с кодом `unknown_style_ref`, `style_ref_cycle` или `unknown_asset_ref`.
 */
public fun PreviewPayload.validateReferences() {
    val validator = ReferenceValidator(this)
    validator.visit(component.properties, "$.component.properties", emptyList())
    styles.keys.forEach { validator.checkStyle(it, "$STYLES_PATH.$it", emptyList()) }
}

private class ReferenceValidator(private val payload: PreviewPayload) {
    private val assetIds = payload.assets.mapTo(HashSet()) { it.id }

    /** `false` — стиль в обходе, `true` — проверен. */
    private val state = HashMap<String, Boolean>()

    fun visit(properties: Map<String, PreviewPropertyValue>, path: String, stack: List<String>) {
        for ((name, value) in properties) {
            value.sources().forEach { checkSource(it, "$path.$name", stack) }
        }
    }

    private fun checkSource(source: PreviewPropertySource, path: String, stack: List<String>) {
        when (source) {
            is PreviewPropertySource.AssetReference -> checkAsset(source.assetId, path)
            is PreviewPropertySource.StyleReference -> checkStyle(source.styleId, path, stack)
            else -> Unit
        }
    }

    private fun checkAsset(assetId: String, path: String) {
        if (assetId !in assetIds) {
            throw PreviewPreparationException("unknown_asset_ref", "Ресурс $assetId не найден в assets", path)
        }
    }

    fun checkStyle(styleId: String, path: String, stack: List<String>) {
        val style = payload.styles[styleId]
            ?: throw PreviewPreparationException("unknown_style_ref", "Стиль $styleId не найден в styles", path)
        when (state[styleId]) {
            true -> Unit
            false -> throw PreviewPreparationException(
                "style_ref_cycle",
                "Цикл ссылок между стилями: ${(stack + styleId).joinToString(" -> ")}",
                "$STYLES_PATH.$styleId",
            )
            null -> {
                state[styleId] = false
                visit(style.properties, "$STYLES_PATH.$styleId.properties", stack + styleId)
                state[styleId] = true
            }
        }
    }
}

/**
 * Собирает предупреждения, не прерывающие render: состояния вне [supportedStates] и ресурсы SVG/PNG,
 * которые SDK пока не умеет превращать в painter.
 */
public fun PreviewPayload.collectWarnings(
    supportedStates: Set<String>,
    unsupportedProperties: Set<String> = emptySet(),
): List<PreviewWarning> = collectWarnings({ it in supportedStates }, unsupportedProperties)

/** То же, что [collectWarnings] по набору, но поддержка состояния определяется предикатом [isStateSupported]. */
public fun PreviewPayload.collectWarnings(
    isStateSupported: (String) -> Boolean,
    unsupportedProperties: Set<String> = emptySet(),
): List<PreviewWarning> {
    val warnings = mutableListOf<PreviewWarning>()
    val imageAssets = assets.filter { it.type == PreviewAssetType.SVG || it.type == PreviewAssetType.PNG }
        .mapTo(HashSet()) { it.id }

    fun collect(properties: Map<String, PreviewPropertyValue>, path: String) {
        for ((name, value) in properties) {
            if (name in unsupportedProperties) {
                warnings += PreviewWarning(
                    code = "unsupported_property",
                    message = "Свойство $name не поддержано и пропущено",
                    path = "$path.$name",
                )
            }
            value.states.forEachIndexed { index, entry ->
                entry.states.filterNot(isStateSupported).forEach { unknown ->
                    warnings += PreviewWarning(
                        code = "unknown_state",
                        message = "Состояние $unknown не поддерживается и запись пропущена",
                        path = "$path.$name.states[$index]",
                    )
                }
            }
            value.sources().filterIsInstance<PreviewPropertySource.AssetReference>()
                .filter { it.assetId in imageAssets }
                .forEach {
                    warnings += PreviewWarning(
                        code = "unsupported_asset",
                        message = "Ресурс ${it.assetId} не может быть отрисован",
                        path = "$path.$name",
                    )
                }
        }
    }
    collect(component.properties, "$.component.properties")
    styles.forEach { (id, style) -> collect(style.properties, "$STYLES_PATH.$id.properties") }
    return warnings
}

internal fun PreviewPropertyValue.sources(): List<PreviewPropertySource> = listOf(base) + states.map { it.source }
