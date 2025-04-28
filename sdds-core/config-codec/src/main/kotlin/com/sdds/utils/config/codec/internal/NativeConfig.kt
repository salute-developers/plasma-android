package com.sdds.utils.config.codec.internal

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
internal data class NativeConfig(
    var view: Map<String, NativeViewVariation> = emptyMap(),
    var props: JsonObject? = null,
    var variations: List<NativeVariation> = emptyList()
)

@Serializable
internal data class NativeViewVariation(
    val props: JsonObject?
)

@Serializable
internal data class NativeVariation(
    val id: String,
    val kind: String,
    val parent: String? = null,
    val view: Map<String, NativeViewVariation> = emptyMap(),
    val props: JsonObject? = null
)