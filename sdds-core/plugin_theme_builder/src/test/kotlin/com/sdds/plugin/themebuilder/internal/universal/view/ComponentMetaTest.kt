package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import kotlinx.serialization.decodeFromString
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Тесты контракта сериализации consumer-модели [ApiMeta].
 *
 * Фиксируют, что JSON в форме, которую пишет producer (Gson,
 * `tasks.viewapi.GenerateUikitApiMetaTask`), корректно десериализуется
 * consumer-моделью (kotlinx.serialization). JSON-строки ниже повторяют
 * реальный вывод producer'а: все поля присутствуют, включая дефолты.
 */
class ComponentMetaTest {

    private val json = Serializer.componentConfig

    @Test
    fun `decodes producer json into component with params and enum values`() {
        val producerJson = """
            {
              "components": [
                {
                  "componentNames": ["BasicButton"],
                  "styleableName": "Button",
                  "identity": {
                    "BasicButton": {
                      "coreName": "Button",
                      "defStyleAttr": "android:buttonStyle",
                      "parent": "Sdds.Components.Button"
                    }
                  },
                  "params": [
                    {
                      "id": "valuePadding",
                      "attrName": "sd_valuePadding",
                      "type": "dimension",
                      "resSuffix": "value_padding",
                      "placement": "style",
                      "values": [],
                      "stateValues": []
                    },
                    {
                      "id": "spacing",
                      "attrName": "sd_spacing",
                      "type": "value",
                      "resSuffix": "spacing",
                      "placement": "style",
                      "values": [
                        { "name": "packed", "value": "0", "configName": "packed" },
                        { "name": "spaceBetween", "value": "1", "configName": "space-between" }
                      ],
                      "stateValues": []
                    }
                  ],
                  "stateSets": []
                }
              ],
              "sharedStates": { "loading": "sd_state_loading", "readonly": "sd_state_readonly" }
            }
        """.trimIndent()

        val meta = json.decodeFromString<ApiMeta>(producerJson)
        val component = meta.components.single()

        assertEquals(listOf("BasicButton"), component.componentNames)
        assertEquals("Button", component.styleableName)
        assertEquals(
            ComponentIdentity("Button", "android:buttonStyle", "Sdds.Components.Button"),
            component.identity.getValue("BasicButton"),
        )
        assertEquals("value_padding", component.params.first { it.id == "valuePadding" }.resSuffix)
        assertEquals(
            listOf(
                EnumValue("packed", "0", "packed"),
                EnumValue("spaceBetween", "1", "space-between"),
            ),
            component.params.first { it.id == "spacing" }.values,
        )
        assertEquals(mapOf("loading" to "sd_state_loading", "readonly" to "sd_state_readonly"), meta.sharedStates)
    }

    @Test
    fun `decodes state bindings with flavor and negation`() {
        val producerJson = """
            {
              "components": [
                {
                  "componentNames": ["TextField"],
                  "styleableName": "TextField",
                  "identity": {},
                  "params": [],
                  "stateSets": [
                    {
                      "name": "TextFieldFocus",
                      "states": [
                        {
                          "configName": "focused", "drawableAttr": "android:state_focused",
                          "flavor": "android", "negated": false
                        },
                        {
                          "configName": "focused", "drawableAttr": "android:state_activated",
                          "flavor": "android", "negated": true
                        }
                      ]
                    }
                  ]
                }
              ],
              "sharedStates": {}
            }
        """.trimIndent()

        val stateSet = json.decodeFromString<ApiMeta>(producerJson).components.single().stateSets.single()

        assertEquals("TextFieldFocus", stateSet.name)
        assertEquals(
            listOf(
                StateInfo("focused", "android:state_focused", "android"),
                StateInfo("focused", "android:state_activated", "android", negated = true),
            ),
            stateSet.states,
        )
        // Составное состояние: обе привязки несут один и тот же ключ конфига
        assertEquals(setOf("focused"), stateSet.states.map { it.configName }.toSet())
    }

    @Test
    fun `decodes state values in both forms`() {
        val producerJson = """
            {
              "components": [
                {
                  "componentNames": ["TextField"],
                  "styleableName": "TextField",
                  "params": [
                    {
                      "id": "valueColor", "attrName": "sd_valueColor", "type": "color",
                      "resSuffix": "value_color", "placement": "style", "values": [],
                      "stateValues": [
                        { "state": "readonly", "configKey": "valueColorReadOnly", "kind": "alias" }
                      ]
                    },
                    {
                      "id": "labelColor", "attrName": "android:textColor", "type": "color",
                      "resSuffix": "text_color", "placement": "overlay", "values": [],
                      "stateValues": [
                        { "state": "loading", "configKey": "loadingAlpha", "kind": "alpha" }
                      ]
                    }
                  ],
                  "stateSets": []
                }
              ]
            }
        """.trimIndent()

        val params = json.decodeFromString<ApiMeta>(producerJson).components.single().params

        assertEquals(
            listOf(StateValue("readonly", "valueColorReadOnly", "alias")),
            params.first { it.id == "valueColor" }.stateValues,
        )
        assertEquals(
            listOf(StateValue("loading", "loadingAlpha", "alpha")),
            params.first { it.id == "labelColor" }.stateValues,
        )
        assertEquals(PLACEMENT_OVERLAY, params.first { it.id == "labelColor" }.placement)
    }

    @Test
    fun `tolerates unknown keys for forward compatibility`() {
        // componentConfig-сериализатор игнорирует незнакомые ключи —
        // producer может добавить новое поле без слома consumer'а.
        val producerJson = """
            {
              "components": [
                {
                  "componentNames": ["Button"],
                  "styleableName": "Button",
                  "params": [],
                  "stateSets": [],
                  "futureField": "ignored"
                }
              ],
              "futureSection": {}
            }
        """.trimIndent()

        val meta = json.decodeFromString<ApiMeta>(producerJson)

        assertEquals("Button", meta.components.single().styleableName)
        assertTrue(meta.sharedStates.isEmpty())
    }

    @Test
    fun `state binding model carries no ordinal`() {
        // Позиция привязки не является рантайм-контрактом: порядок enum-driven
        // состояний задаётся значениями <enum> соответствующего свойства.
        val fields = StateInfo::class.java.declaredFields.map { it.name }
        assertTrue("Модель привязки состояния не должна нести ordinal", "ordinal" !in fields)
    }
}
