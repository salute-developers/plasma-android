package com.sdds.utils.config.codec.internal

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
internal data class CommonConfig(
    val rootPropertyId: String = "",
    val commonValues: JsonObject? = null,
    val properties: List<ConfigProperty> = emptyList(),
)

@Serializable
internal data class ConfigProperty(
    val id: String,
    val name: String,
    val values: Set<ConfigPropertyValue>
)

@Serializable
internal data class ConfigPropertyValue(
    val name: String,
    val targets: Set<ConfigPropertyTarget>? = null,
    val props: JsonObject? = null,
)

@Serializable
internal data class ConfigPropertyTarget(
    val properties: Set<ConfigPropertyTargetInfo>
)

@Serializable
internal data class ConfigPropertyTargetInfo(
    val id: String,
    val value: String,
)