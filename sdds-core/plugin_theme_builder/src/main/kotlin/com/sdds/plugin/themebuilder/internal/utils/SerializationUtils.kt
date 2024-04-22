package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.decodeFromStream
import java.io.File

/**
 * Парсит json-файл в [DTO] с помощью [Serializer.instance]
 */
@OptIn(ExperimentalSerializationApi::class)
internal inline fun <reified DTO> File.decode(): DTO =
    inputStream().use { stream ->
        Serializer.instance.decodeFromStream<DTO>(stream)
    }
