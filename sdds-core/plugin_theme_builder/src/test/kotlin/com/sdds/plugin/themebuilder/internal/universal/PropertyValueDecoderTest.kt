package com.sdds.plugin.themebuilder.internal.universal

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class PropertyValueDecoderTest {

    @Test
    fun `integer value декодируется из primitive и object форм`() {
        val primitive = Json.parseToJsonElement("4")
        val objectValue = buildJsonObject {
            put("value", "8")
        }

        val primitiveResult = PropertyValueDecoder.decode(PropertyType.INTEGER, primitive)
        val objectResult = PropertyValueDecoder.decode(PropertyType.INTEGER, objectValue)

        assertTrue(primitiveResult is Value)
        assertEquals("4", (primitiveResult as Value).value)
        assertTrue(objectResult is Value)
        assertEquals("8", (objectResult as Value).value)
    }

    @Test
    fun `integer value возвращает zero если scalar отсутствует`() {
        val result = PropertyValueDecoder.decode(
            type = PropertyType.INTEGER,
            element = buildJsonObject { put("other", "ignored") },
        )

        assertTrue(result is Value)
        assertEquals("0", (result as Value).value)
    }

    @Test
    fun `component style декодирует value и states`() {
        val result = PropertyValueDecoder.decode(
            type = PropertyType.COMPONENT_STYLE,
            element = buildJsonObject {
                put("value", "basic-button.m.default")
                putJsonArray("states") {
                    add(
                        buildJsonObject {
                            putJsonArray("state") { add("pressed") }
                            put("value", "basic-button.m.secondary")
                        },
                    )
                }
            },
        )

        assertTrue(result is ComponentStyle<*>)
        result as ComponentStyle<*>
        assertEquals("basic-button.m.default", result.value)
        assertEquals("basic-button.m.secondary", result.states?.single()?.value)
        assertEquals(listOf("pressed"), result.states?.single()?.state)
    }

    @Test
    fun `неизвестный property type возвращает null`() {
        val result = PropertyValueDecoder.decode(
            type = PropertyType.UNKNOWN,
            element = buildJsonObject { put("value", "ignored") },
        )

        assertNull(result)
    }
}
