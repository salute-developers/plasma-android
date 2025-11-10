package com.sdds.plugin.themebuilder.internal.components

import com.squareup.kotlinpoet.ClassName
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
    val variations: List<VariationInfo>,
)

@Serializable
internal data class VariationInfo(
    val name: String,
    val composeReference: VariationReference? = null,
    val viewReference: VariationReference? = null,
    val viewOverlayReference: VariationReference? = null,
)

@Serializable
@JvmInline
internal value class VariationReference(val value: String)
