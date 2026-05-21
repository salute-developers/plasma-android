package com.sdds.plugin.themebuilder.internal.universal

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ComponentMeta(
    val componentName: String,
    val qualifiedName: String,
    val resolvedTypes: List<String>,
    val stateEnum: StateEnum? = null,
    val params: List<PropertyMeta>,
)

@Serializable
internal data class StateEnum(
    val qualifiedName: String,
    val simpleName: String,
    val values: List<EnumValueInfo>,
)

@Serializable
internal data class EnumValueInfo(
    val name: String,
    val configName: String = name,
)

@Serializable
internal sealed interface PropertyMeta {
    val id: String
    val methodName: String
    val paramName: String
    val paramQualifiedType: String
    val paramSimpleType: String
    val group: String
}

@Serializable
@SerialName("dimension")
internal data class DimensionPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("color")
internal data class ColorPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("typography")
internal data class TypographyPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("shape")
internal data class ShapePropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("shadow")
internal data class ShadowPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("boolean")
internal data class BooleanPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("integer")
internal data class IntegerPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("float")
internal data class FloatPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("icon")
internal data class IconPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("component_style")
internal data class ComponentPropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
) : PropertyMeta

@Serializable
@SerialName("value")
internal data class ValuePropertyMeta(
    override val id: String,
    override val methodName: String,
    override val paramName: String,
    override val paramQualifiedType: String,
    override val paramSimpleType: String,
    override val group: String,
    val values: List<String>,
) : PropertyMeta
