package com.sdds.plugin.themebuilder.internal.components

import com.squareup.kotlinpoet.ClassName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * Класс содержит данные о вариациях всех компонентов в пределах одного конфига
 *
 * @property name название библиотеки
 * @property components список данных о компонентах [ComponentInfo]
 */
@Serializable
internal data class ConfigInfo(
    val name: String,
    val packageName: String,
    val components: List<ComponentInfo>,
)

/**
 * Класс содержит данные о компоненте из конфига
 *
 * @property coreName название кор-компонента
 * @property styleName названия конфигурации компонента
 * @property variations список вариаций компонента
 */
@Serializable
internal data class ComponentInfo(
    val key: String,
    @Transient val appearance: String = "",
    @Transient val styleClassName: ClassName? = null,
    @Transient val styleBuilderClassName: ClassName? = null,
    @Transient val componentPackage: String = "",
    val coreName: String,
    val styleName: String,
    val props: List<VariationProp> = emptyList(),
    val styleApi: ComposeStyleApiInfo? = null,
    val variations: List<VariationInfo>,
)

@Serializable
internal data class VariationInfo(
    val name: String,
    val composeReference: VariationReference? = null,
    val viewReference: VariationReference? = null,
    val viewOverlayReference: VariationReference? = null,
    val props: List<VariationProp> = emptyList(),
)

@Serializable
internal data class VariationProp(
    val name: String,
    val value: String? = null,
    val values: Set<String>? = null,
    val defaultValue: String? = null,
)

@Serializable
internal data class ComposeStyleApiInfo(
    val packageName: String,
    val stylesClassName: String,
    val stylesClassQualifiedName: String,
    val receiverClassName: String,
    val receiverClassQualifiedName: String,
    val functionName: String = "style",
    val returnTypeName: String,
    val returnTypeQualifiedName: String,
    val modifyReceiverTypeName: String,
    val modifyReceiverTypeQualifiedName: String,
    val holderName: String? = null,
    val params: List<ComposeStyleApiParam> = emptyList(),
)

@Serializable
internal data class ComposeStyleApiParam(
    val name: String,
    val type: ComposeStyleApiParamType,
    val required: Boolean,
    val typeName: String,
    val typeQualifiedName: String,
    val defaultValue: ComposeStyleApiValue? = null,
    val values: List<ComposeStyleApiValue>? = null,
)

@Serializable
internal data class ComposeStyleApiValue(
    val value: String,
    val codeName: String,
)

@Serializable
internal enum class ComposeStyleApiParamType {
    @SerialName("boolean")
    BOOLEAN,

    @SerialName("enum")
    ENUM,
}

@Serializable
@JvmInline
internal value class VariationReference(val value: String)
