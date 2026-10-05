package com.sdds.plugin.themebuilder.internal.universal.compose

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ComposeComponentMeta(
    val componentName: String,
    val qualifiedName: String,
    val resolvedTypes: List<String>,
    val stateEnum: ComposeStateEnum? = null,
    val params: List<ComposePropertyMeta>,
    val packageName: String = "",
    val styleQualifiedName: String = "",
    val builderFunName: String = "",
)

@Serializable
internal data class ComposeStateEnum(
    val qualifiedName: String,
    val simpleName: String,
    val values: List<ComposeEnumValueInfo>,
)

@Serializable
internal data class ComposeEnumValueInfo(
    val name: String,
    val configName: String = name,
)

/**
 * Пометка свойства устаревшим (`@ApiDeprecated` на стороне Compose-API).
 *
 * @property message сообщение об устаревании; может быть пустым.
 */
@Serializable
internal data class ComposeDeprecatedMeta(
    val message: String,
)

@Serializable
internal sealed interface ComposePropertyMeta {
    val id: String
    val methodName: String
    val paramName: String
    val paramQualifiedType: String
    val paramSimpleType: String
    val group: String

    /** Пометка `@ApiDeprecated`; `null` — свойство актуально. Статус общий для всех перегрузок `id`. */
    val deprecated: ComposeDeprecatedMeta?
}

@Serializable
@SerialName("dimension")
internal data class ComposeDimensionPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("color")
internal data class ComposeColorPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    val valueQualifiedType: String = "",
    val hasInteractiveColorOverload: Boolean = false,
    val hasBrushOverload: Boolean = false,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("typography")
internal data class ComposeTypographyPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("shape")
internal data class ComposeShapePropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("shadow")
internal data class ComposeShadowPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("boolean")
internal data class ComposeBooleanPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("integer")
internal data class ComposeIntegerPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("float")
internal data class ComposeFloatPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("icon")
internal data class ComposeIconPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("component_style")
internal data class ComposeComponentPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("value")
internal data class ComposeValuePropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    val values: List<ComposeEnumValueInfo>,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta

@Serializable
@SerialName("unknown")
internal data class ComposeUnknownPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    override val deprecated: ComposeDeprecatedMeta? = null,
) : ComposePropertyMeta
