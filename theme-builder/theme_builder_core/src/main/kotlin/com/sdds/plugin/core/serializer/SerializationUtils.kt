package com.sdds.plugin.core.serializer

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

/**
 * Парсит json-файл в [DTO] с помощью [decoder]
 */
@OptIn(ExperimentalSerializationApi::class)
inline fun <reified DTO> File.decode(decoder: Json = Serializer.tokenValues): DTO =
    inputStream().use { stream ->
        decoder.decodeFromStream(stream)
    }
