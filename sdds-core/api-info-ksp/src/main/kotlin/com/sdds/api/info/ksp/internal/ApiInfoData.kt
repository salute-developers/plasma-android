package com.sdds.api.info.ksp.internal

import com.google.devtools.ksp.symbol.KSFile
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
internal data class ComposeComponentMeta(
    val componentName: String,
    val qualifiedName: String,
    val resolvedTypes: List<String>,
    val params: List<ComposeParameterMeta>,
    val stateEnum: ComposeStateEnum?,
    val packageName: String = "",
    val styleQualifiedName: String = "",
    val builderFunName: String = "",
    @Transient
    val sourceFile: KSFile? = null,
)

@Serializable
internal data class ComposeParameterMeta(
    val type: String,
    val id: String,
    val methodName: String,
    val paramName: String,
    val paramQualifiedType: String,
    val paramSimpleType: String,
    val valueQualifiedType: String,
    val group: String,
    val values: List<ComposeEnumValueInfo> = emptyList(),
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
