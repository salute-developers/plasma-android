package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.universal.PropertyOwner
import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.PropertyValueDecoder
import com.sdds.plugin.themebuilder.internal.universal.Stateful
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject

@Serializable(with = UniversalPropertyOwnerSerializer::class)
internal class UniversalPropertyOwner(internal val jsonObject: JsonObject) : PropertyOwner {

    fun getValue(meta: ComposePropertyMeta): Stateful<*, *>? = getValue(meta.typeKey, meta.id)

    /**
     * Возвращает значение свойства [id], декодированное по семантическому типу [type].
     *
     * Вход для view-меты, которая несёт тип строкой; compose-путь приходит сюда же
     * через [ComposePropertyMeta.typeKey].
     */
    fun getValue(type: String, id: String): Stateful<*, *>? {
        val element = jsonObject[id] ?: return null
        return PropertyValueDecoder.decode(type, element)
    }

    override fun merge(parent: PropertyOwner): UniversalPropertyOwner {
        val parentOwner = parent as? UniversalPropertyOwner ?: return this
        val merged = buildJsonObject {
            parentOwner.jsonObject.forEach { (k, v) -> put(k, v) }
            jsonObject.forEach { (k, v) -> put(k, v) }
        }
        return UniversalPropertyOwner(merged)
    }
}

internal object UniversalPropertyOwnerSerializer : KSerializer<UniversalPropertyOwner> {
    override val descriptor: SerialDescriptor = JsonObject.serializer().descriptor

    override fun serialize(encoder: Encoder, value: UniversalPropertyOwner) {
        encoder.encodeSerializableValue(JsonObject.serializer(), value.jsonObject)
    }

    override fun deserialize(decoder: Decoder): UniversalPropertyOwner =
        UniversalPropertyOwner(decoder.decodeSerializableValue(JsonObject.serializer()))
}

/**
 * Строковый семантический тип compose-свойства — общий словарь с view-метой.
 *
 * Нужен, чтобы декодирование значения жило в одном месте ([PropertyValueDecoder]),
 * а не дублировалось для двух стеков.
 */
internal val ComposePropertyMeta.typeKey: String
    get() = when (this) {
        is ComposeColorPropertyMeta -> PropertyType.COLOR
        is ComposeDimensionPropertyMeta -> PropertyType.DIMENSION
        is ComposeTypographyPropertyMeta -> PropertyType.TYPOGRAPHY
        is ComposeShapePropertyMeta -> PropertyType.SHAPE
        is ComposeShadowPropertyMeta -> PropertyType.SHADOW
        is ComposeFloatPropertyMeta -> PropertyType.FLOAT
        is ComposeValuePropertyMeta -> PropertyType.VALUE
        is ComposeBooleanPropertyMeta -> PropertyType.BOOLEAN
        is ComposeIntegerPropertyMeta -> PropertyType.INTEGER
        is ComposeIconPropertyMeta -> PropertyType.ICON
        is ComposeComponentPropertyMeta -> PropertyType.COMPONENT_STYLE
        is ComposeUnknownPropertyMeta -> PropertyType.UNKNOWN
    }
