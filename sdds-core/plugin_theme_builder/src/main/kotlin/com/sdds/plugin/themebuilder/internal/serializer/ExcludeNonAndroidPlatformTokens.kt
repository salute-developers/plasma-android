package com.sdds.plugin.themebuilder.internal.serializer

import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TokenPlatform
import com.sdds.plugin.themebuilder.internal.token.TokenValue
import kotlinx.serialization.KSerializer
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * Сериализатор-фильтр токенов для платформы Android
 * @author Малышев Александр on 05.03.2024
 */
internal object ExcludeNonAndroidPlatformTokens : KSerializer<List<Token<TokenValue>>> by FilteringListSerializer(
    PolymorphicSerializer(Token::class),
)

private class FilteringListSerializer<E>(private val elementSerializer: KSerializer<E>) : KSerializer<List<E>> {
    private val listSerializer = ListSerializer(elementSerializer)
    override val descriptor: SerialDescriptor = listSerializer.descriptor

    override fun serialize(encoder: Encoder, value: List<E>) {
        listSerializer.serialize(encoder, value)
    }

    override fun deserialize(decoder: Decoder): List<E> = with(decoder as JsonDecoder) {
        decodeJsonElement().jsonArray.mapNotNull {
            val currentPlatform = it.getPlatform()
            if (currentPlatform == null || currentPlatform != TokenPlatform.ANDROID) {
                return@mapNotNull null
            }
            json.decodeFromJsonElement(elementSerializer, it)
        }
    }

    private fun JsonElement.getPlatform(): TokenPlatform? {
        val platformValue = if (this is JsonObject) {
            jsonObject["platform"]?.jsonPrimitive?.content
        } else {
            null
        }
        return TokenPlatform.fromString(platformValue)
    }
}
