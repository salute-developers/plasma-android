package com.sdds.plugin.themebuilder.internal.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Сериализатор для неизвестных типов.
 * Бросает контролируемое исключение [UnknownTypeException].
 * @author Малышев Александр on 04.04.2024
 */
internal class UnknownTypeSerializer<T> : KSerializer<T> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Nothing")
    override fun deserialize(decoder: Decoder): T = throw UnknownTypeException("unknown type")
    override fun serialize(encoder: Encoder, value: T) = throw UnknownTypeException("unknown type")
}

/**
 * Исключение "Неизвестный тип"
 * @param message сообщение
 */
internal class UnknownTypeException(message: String) : Throwable(message)
