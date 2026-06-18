package com.sdds.api.info.ksp.internal

import com.google.devtools.ksp.symbol.KSFile
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
internal data class ComponentMeta(
    val componentName: String,
    val qualifiedName: String,
    val resolvedTypes: List<String>,
    val params: List<ParameterMeta>,
    val stateEnum: StateEnum?,
    val packageName: String = "",
    val styleQualifiedName: String = "",
    val builderFunName: String = "",
    @Transient
    val sourceFile: KSFile? = null,
)

@Serializable
internal data class ParameterMeta(
    val type: String,
    val id: String,
    val methodName: String,
    val paramName: String,
    val paramQualifiedType: String,
    val paramSimpleType: String,
    val valueQualifiedType: String,
    val group: String,
    val values: List<EnumValueInfo> = emptyList(),
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
