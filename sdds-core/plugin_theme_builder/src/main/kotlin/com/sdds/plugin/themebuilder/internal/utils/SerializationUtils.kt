package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

/**
 * Парсит json-файл в [DTO] с помощью [decoder]
 */
@OptIn(ExperimentalSerializationApi::class)
internal inline fun <reified DTO> File.decode(decoder: Json = Serializer.tokenValues): DTO =
    inputStream().use { stream ->
        decoder.decodeFromStream(stream)
    }
