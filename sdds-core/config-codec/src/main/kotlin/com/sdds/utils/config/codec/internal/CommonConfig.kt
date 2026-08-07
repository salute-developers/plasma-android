package com.sdds.utils.config.codec.internal

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
internal data class CommonConfig(
    val rootVariationId: String = "",
    val colorSchemeVariationId: String = "",
    val invariants: JsonObject? = null,
    val variations: List<Variation> = emptyList(),
    val defaults: Set<DefaultVariationValue> = emptySet(),
)

@Serializable
internal data class Variation(
    val id: String,
    val name: String,
    val values: Set<VariationValue>
)

@Serializable
internal data class VariationValue(
    val name: String,
    val targets: Set<VariationValueTarget>? = null,
    val props: JsonObject? = null,
)

@Serializable
internal data class VariationValueTarget(
    val properties: Set<TargetInfo>
)

@Serializable
internal data class TargetInfo(
    val id: String,
    val value: String,
)

@Serializable
internal data class DefaultVariationValue(
    val id: String,
    val value: String,
)