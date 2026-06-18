package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.BooleanValue
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put

@Serializable(with = UniversalPropertyOwnerSerializer::class)
internal class UniversalPropertyOwner(internal val jsonObject: JsonObject) : PropertyOwner {

    @Suppress("CyclomaticComplexMethod")
    fun getValue(meta: PropertyMeta): Stateful<*, *>? {
        val element = jsonObject[meta.id] ?: return null
        return when (meta) {
            is ColorPropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Color.serializer(), element)
            is DimensionPropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Dimension.serializer(), element)
            is TypographyPropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Typography.serializer(), element)
            is ShapePropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Shape.serializer(), element)
            is ShadowPropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Shadow.serializer(), element)
            is FloatPropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(FloatValue.serializer(), element)
            is ValuePropertyMeta ->
                Serializer.componentConfig.decodeFromJsonElement(Value.serializer(), element)
            is BooleanPropertyMeta -> {
                val boolValue = Serializer.componentConfig.decodeFromJsonElement(BooleanValue.serializer(), element)
                Value(value = boolValue.value.toString())
            }
            is IntegerPropertyMeta -> {
                val intString = when {
                    element is JsonPrimitive -> element.content
                    element is JsonObject -> element["value"]?.jsonPrimitive?.content ?: "0"
                    else -> "0"
                }
                Value(value = intString)
            }
            is IconPropertyMeta -> {
                val icon = Serializer.componentConfig.decodeFromJsonElement(Icon.serializer(), element)
                Value(value = icon.value)
            }
            is ComponentPropertyMeta -> {
                val styleValue = when {
                    element is JsonPrimitive -> element.content
                    element is JsonObject -> element["value"]?.jsonPrimitive?.content ?: ""
                    else -> ""
                }
                val states = if (element is JsonObject) {
                    element["states"]?.let {
                        Serializer.componentConfig.decodeFromJsonElement(
                            ListSerializer(StringState.serializer()),
                            it,
                        )
                    }
                } else {
                    null
                }
                @Suppress("UNCHECKED_CAST")
                ComponentStyle<UniversalPropertyOwner>(value = styleValue, states = states) as Stateful<*, *>
            }
            is UnknownPropertyMeta -> null
        }
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
