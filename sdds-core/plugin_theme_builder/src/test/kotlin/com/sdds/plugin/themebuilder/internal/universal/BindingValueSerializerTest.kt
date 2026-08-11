package com.sdds.plugin.themebuilder.internal.universal

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.junit.Assert.assertEquals
import org.junit.Test

class BindingValueSerializerTest {

    @Test
    fun `BindingValueSerializer читает string boolean и number значения`() {
        val json = Json {
            ignoreUnknownKeys = true
        }

        val stringBinding = json.decodeFromString<Binding>(
            """
                {
                "name": "size",
                "value": "large"
                }
            """.trimIndent(),
        )
        val booleanBinding = json.decodeFromString<Binding>(
            """
            {
              "name": "enabled",
              "value": true
            }
            """.trimIndent(),
        )
        val numberBinding = json.decodeFromString<Binding>(
            """
            {
              "name": "count",
              "value": 10
            }
            """.trimIndent(),
        )

        assertEquals("large", stringBinding.value)
        assertEquals("true", booleanBinding.value)
        assertEquals("10", numberBinding.value)
    }

    @Test
    fun `BindingValueSerializer сериализирует value как строку`() {
        val json = Json

        val result = json.encodeToString(
            Binding.serializer(),
            Binding(
                name = "size",
                value = "large",
            ),
        )

        val jsonObject = json.parseToJsonElement(result).jsonObject

        assertEquals("large", jsonObject.getValue("value").jsonPrimitive.content)
    }

    @Test
    fun `BindingValueSerializer читает boolean defaultValue в Bindings`() {
        val result = Json.decodeFromString<Bindings>(
            """
                {
                "name": "enabled",
                "type": "boolean",
                "defaultValue": "true"
                }
            """.trimIndent(),
        )
        assertEquals("enabled", result.name)
        assertEquals(BindingType.BOOLEAN, result.type)
        assertEquals("true", result.defaultValue)
    }

    @Test
    fun `BindingValueSerializer читает null value как строку null`() {
        val result = Json.decodeFromString<Binding>(
            """
                {
                  "name": "optional",
                  "value": null
                }
            """.trimIndent(),
        )

        assertEquals("optional", result.name)
        assertEquals("null", result.value)
    }
}
