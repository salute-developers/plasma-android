package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewAssetType
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewWarning
import com.sdds.preview.contract.TokenValue

private const val STYLES_PATH = "$.styles"

/**
 * Проверяет ссылки на стили и ресурсы до построения стиля.
 * Бросает [PreviewPreparationException] с кодом `unknown_style_ref`, `style_ref_cycle`, `unknown_asset_ref`
 * или `invalid_state_entry` (запись состояния без имён).
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
            checkStateEntries(value, "$path.$name")
            value.sources().forEach { checkSource(it, "$path.$name", stack) }
        }
    }

    /** Запись состояния без имён (или с пустым именем) нарушает контракт и иначе перекрыла бы базовое значение. */
    private fun checkStateEntries(value: PreviewPropertyValue, path: String) {
        value.states.forEachIndexed { index, entry ->
            if (entry.states.isEmpty() || entry.states.any { it.isBlank() }) {
                throw PreviewPreparationException(
                    "invalid_state_entry",
                    "Запись states должна содержать непустые имена состояний",
                    "$path.states[$index]",
                )
            }
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

/** Правила предупреждений одного компонента: что он не умеет и что пропускает. */
public class PreviewWarningRules(
    /** Известно ли имя состояния. */ public val isStateSupported: (String) -> Boolean,
    /** Свойства, которые компонент пропускает (иконки и тени). */
    public val unsupportedProperties: Set<String> = emptySet(),
    /** Цветовые свойства без перегрузки с `Brush`: градиент для них игнорируется. */
    public val gradientUnsupportedProperties: Set<String> = emptySet(),
)

/**
 * Собирает предупреждения, не прерывающие render: состояния вне [supportedStates] и ресурсы SVG/PNG,
 * которые SDK пока не умеет превращать в painter.
 */
public fun PreviewPayload.collectWarnings(
    supportedStates: Set<String>,
    unsupportedProperties: Set<String> = emptySet(),
): List<PreviewWarning> = collectWarnings(PreviewWarningRules({ it in supportedStates }, unsupportedProperties))

/**
 * Собирает предупреждения по [root] для свойств компонента. Свойства вложенных стилей проверяются по правилам
 * компонента, которому принадлежит стиль ([nested] по `componentId`); `null` означает, что правил нет и свойства
 * не проверяются.
 * По умолчанию вложенные стили проверяются теми же правилами, что и корневой компонент.
 */
public fun PreviewPayload.collectWarnings(
    root: PreviewWarningRules,
    nested: (String) -> PreviewWarningRules? = { root },
): List<PreviewWarning> {
    val warnings = mutableListOf<PreviewWarning>()
    val imageAssets = assets.filter { it.type == PreviewAssetType.SVG || it.type == PreviewAssetType.PNG }
        .mapTo(HashSet()) { it.id }

    fun collect(properties: Map<String, PreviewPropertyValue>, path: String, rules: PreviewWarningRules) {
        for ((name, value) in properties) {
            if (name in rules.unsupportedProperties) {
                warnings += PreviewWarning(
                    "unsupported_property",
                    "Свойство $name не поддержано и пропущено",
                    "$path.$name",
                )
            }
            if (name in rules.gradientUnsupportedProperties && value.usesGradient(theme)) {
                warnings += PreviewWarning(
                    "unsupported_property",
                    "Свойство $name не принимает градиент, значение пропущено",
                    "$path.$name",
                )
            }
            value.states.forEachIndexed { index, entry ->
                entry.states.filterNot(rules.isStateSupported).forEach { unknown ->
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
    collect(component.properties, "$.component.properties", root)
    styles.forEach { (id, style) ->
        nested(style.component)?.let { collect(style.properties, "$STYLES_PATH.$id.properties", it) }
    }
    return warnings
}

private fun PreviewPropertyValue.usesGradient(theme: Map<String, TokenValue>): Boolean =
    sources().any { it is PreviewPropertySource.TokenReference && theme[it.tokenId] is TokenValue.Gradient }

internal fun PreviewPropertyValue.sources(): List<PreviewPropertySource> = listOf(base) + states.map { it.source }
