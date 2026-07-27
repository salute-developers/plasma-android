package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import kotlinx.serialization.decodeFromString
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Тесты контракта сериализации consumer-модели [ComponentMeta].
 *
 * Фиксируют, что JSON в форме, которую пишет producer (Gson,
 * `tasks.viewapi.GenerateUikitApiMetaTask`), корректно десериализуется
 * consumer-моделью (kotlinx.serialization). JSON-строки ниже повторяют
 * реальный вывод producer'а: все поля присутствуют (Gson пишет и дефолты),
 * порядок состояний фиксирован ordinal'ом.
 */
class ComponentMetaTest {

    private val json = Serializer.componentConfig

    @Test
    fun `decodes producer json into component with params and enum values`() {
        val producerJson = """
            [
              {
                "componentNames": ["Button"],
                "styleableName": "Button",
                "packageName": "",                "params": [
                  {
                    "id": "valuePadding",
                    "attrName": "sd_valuePadding",
                    "type": "dimension",
                    "values": []
                  },
                  {
                    "id": "icon",
                    "attrName": "sd_icon",
                    "type": "icon",
                    "values": []
                  },
                  {
                    "id": "spacing",
                    "attrName": "sd_spacing",
                    "type": "value",
                    "values": [
                      { "name": "packed", "value": "0", "configName": "packed" },
                      { "name": "spaceBetween", "value": "1", "configName": "space-between" }
                    ]
                  }
                ],
                "stateSets": []
              }
            ]
        """.trimIndent()

        val meta = json.decodeFromString<List<ComponentMeta>>(producerJson).single()

        assertEquals(listOf("Button"), meta.componentNames)
        assertEquals("Button", meta.styleableName)
        assertEquals(3, meta.params.size)

        val spacing = meta.params.first { it.id == "spacing" }
        assertEquals("value", spacing.type)
        assertEquals(
            listOf(
                EnumValue("packed", "0", "packed"),
                EnumValue("spaceBetween", "1", "space-between"),
            ),
            spacing.values,
        )
    }

    @Test
    fun `decodes custom state sets preserving ordinal and flavor`() {
        val producerJson = """
            [
              {
                "componentNames": ["Avatar"],
                "styleableName": "Avatar",
                "packageName": "",                "params": [],
                "stateSets": [
                  {
                    "name": "AvatarStatus",
                    "states": [
                      { "configName": "online", "ordinal": 0, "drawableAttr": "sd_state_online", "flavor": "scoped", "negated": false },
                      { "configName": "offline", "ordinal": 1, "drawableAttr": "sd_state_offline", "flavor": "scoped", "negated": false }
                    ]
                  }
                ]
              }
            ]
        """.trimIndent()

        val meta = json.decodeFromString<List<ComponentMeta>>(producerJson).single()
        val stateSet = meta.stateSets.single()

        assertEquals("AvatarStatus", stateSet.name)
        assertEquals(
            listOf(
                StateInfo("online", 0, "sd_state_online", "scoped"),
                StateInfo("offline", 1, "sd_state_offline", "scoped"),
            ),
            stateSet.states,
        )
    }

    @Test
    fun `tolerates unknown keys for forward compatibility`() {
        // componentConfig-сериализатор игнорирует незнакомые ключи —
        // producer может добавить новое поле без слома consumer'а.
        val producerJson = """
            [
              {
                "componentNames": ["Button"],
                "styleableName": "Button",
                "params": [],
                "stateSets": [],
                "futureField": "ignored"
              }
            ]
        """.trimIndent()

        val meta = json.decodeFromString<List<ComponentMeta>>(producerJson).single()

        assertEquals("Button", meta.styleableName)
    }
}
