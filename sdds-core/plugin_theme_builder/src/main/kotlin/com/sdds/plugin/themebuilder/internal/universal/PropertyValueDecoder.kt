package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.compose.UniversalPropertyOwner
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonPrimitive

/**
 * Декодирует значение свойства из токен-конфига по **строковому семантическому типу**.
 *
 * Один резолвер на оба стека: compose-мета несёт тип в sealed-иерархии
 * `ComposePropertyMeta`, view-мета — строкой в `PropertyMeta.type`, но словарь типов у
 * них общий (см. [PropertyType]). Держать две копии `decodeFromJsonElement`-логики
 * означало бы расхождение при добавлении нового типа.
 */
internal object PropertyValueDecoder {

    /**
     * Декодирует [element] в типизированное значение свойства.
     *
     * @param type семантический тип свойства (см. [PropertyType])
     * @return значение либо `null`, если тип неизвестен
     */
    @Suppress("CyclomaticComplexMethod")
    fun decode(type: String, element: JsonElement): Stateful<*, *>? {
        val json = Serializer.componentConfig
        return when (type) {
            PropertyType.COLOR -> json.decodeFromJsonElement(Color.serializer(), element)
            PropertyType.DIMENSION -> json.decodeFromJsonElement(Dimension.serializer(), element)
            PropertyType.TYPOGRAPHY -> json.decodeFromJsonElement(Typography.serializer(), element)
            PropertyType.SHAPE -> json.decodeFromJsonElement(Shape.serializer(), element)
            PropertyType.SHADOW -> json.decodeFromJsonElement(Shadow.serializer(), element)
            PropertyType.FLOAT -> json.decodeFromJsonElement(FloatValue.serializer(), element)
            PropertyType.VALUE -> json.decodeFromJsonElement(Value.serializer(), element)
            PropertyType.BOOLEAN -> {
                val boolValue = json.decodeFromJsonElement(BooleanValue.serializer(), element)
                Value(value = boolValue.value.toString())
            }
            PropertyType.INTEGER -> Value(value = element.scalarOrNull() ?: "0")
            PropertyType.ICON -> Value(value = json.decodeFromJsonElement(Icon.serializer(), element).value)
            PropertyType.COMPONENT_STYLE -> componentStyle(element)
            else -> null
        }
    }

    private fun componentStyle(element: JsonElement): Stateful<*, *> {
        val json = Serializer.componentConfig
        val styleValue = element.scalarOrNull().orEmpty()
        val states = (element as? JsonObject)?.get("states")?.let {
            json.decodeFromJsonElement(ListSerializer(StringState.serializer()), it)
        }
        @Suppress("UNCHECKED_CAST")
        return ComponentStyle<UniversalPropertyOwner>(value = styleValue, states = states) as Stateful<*, *>
    }

    /** Значение примитива либо поля `value` объекта — форма, в которой конфиг несёт скаляры. */
    private fun JsonElement.scalarOrNull(): String? = when (this) {
        is JsonPrimitive -> content
        is JsonObject -> get("value")?.jsonPrimitive?.content
        else -> null
    }
}

/**
 * Семантические типы свойств, общие для compose- и view-меты.
 *
 * Значения совпадают с `@SerialName` в `ComposePropertyMeta` и с `sdds:api_type`
 * во view-разметке.
 */
internal object PropertyType {
    const val COLOR = "color"
    const val DIMENSION = "dimension"
    const val TYPOGRAPHY = "typography"
    const val SHAPE = "shape"
    const val SHADOW = "shadow"
    const val ICON = "icon"
    const val COMPONENT_STYLE = "component_style"
    const val BOOLEAN = "boolean"
    const val INTEGER = "integer"
    const val FLOAT = "float"
    const val VALUE = "value"
    const val UNKNOWN = "unknown"
}
