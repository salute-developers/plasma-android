package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class UniversalPropertyOwnerTest {

    @Test
    fun `возвращает null для отсутствующего свойства`() {
        val owner = UniversalPropertyOwner(JsonObject(emptyMap()))
        assertNull(owner.getValue(colorMeta("backgroundColor")))
    }

    @Test
    fun `декодирует SolidColor`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("backgroundColor") {
                    put("type", "color")
                    put("default", "surface.default.primary")
                }
            },
        )
        val value = owner.getValue(colorMeta("backgroundColor"))
        assertEquals(SolidColor("surface.default.primary"), value)
    }

    @Test
    fun `декодирует Gradient`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("background") {
                    put("type", "gradient")
                    put("default", "surface.default.solidCard")
                }
            },
        )
        val value = owner.getValue(colorMeta("background"))
        assertEquals(Gradient("surface.default.solidCard"), value)
    }

    @Test
    fun `декодирует Dimension`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("height") {
                    put("value", 32.0f)
                }
            },
        )
        val value = owner.getValue(dimensionMeta("height"))
        assertEquals(Dimension(32f), value)
    }

    @Test
    fun `декодирует Typography`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("labelStyle") {
                    put("value", "body.xs.normal")
                }
            },
        )
        val value = owner.getValue(typographyMeta("labelStyle"))
        assertEquals(Typography("body.xs.normal"), value)
    }

    @Test
    fun `декодирует Shape`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("shape") {
                    put("value", "shape.round.4")
                }
            },
        )
        val value = owner.getValue(shapeMeta("shape"))
        assertEquals(Shape("shape.round.4"), value)
    }

    @Test
    fun `декодирует Shadow`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("shadow") {
                    put("value", "shadow.down.m")
                }
            },
        )
        val value = owner.getValue(shadowMeta("shadow"))
        assertEquals(Shadow("shadow.down.m"), value)
    }

    @Test
    fun `декодирует FloatValue`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("opacity") {
                    put("value", 0.5f)
                }
            },
        )
        val value = owner.getValue(floatMeta("opacity"))
        assertEquals(FloatValue(0.5f), value)
    }

    @Test
    fun `декодирует BooleanValue как Value со строкой`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("enabled") {
                    put("value", true)
                }
            },
        )
        val value = owner.getValue(booleanMeta("enabled"))
        assertEquals(Value("true"), value)
    }

    @Test
    fun `декодирует Integer как Value`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                put("count", JsonPrimitive("5"))
            },
        )
        val value = owner.getValue(integerMeta("count"))
        assertEquals(Value("5"), value)
    }

    @Test
    fun `декодирует Icon как Value со строкой`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("icon") {
                    put("value", "ic.16.arrow")
                }
            },
        )
        val value = owner.getValue(iconMeta("icon"))
        assertEquals(Value("ic.16.arrow"), value)
    }

    @Test
    fun `декодирует Value напрямую`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("orientation") {
                    put("value", "horizontal")
                }
            },
        )
        val value = owner.getValue(valueMeta("orientation", listOf("horizontal", "vertical")))
        assertEquals(Value("horizontal"), value)
    }

    @Test
    fun `декодирует ComponentStyle как строку`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("buttonStyle") {
                    put("value", "basic-button.default")
                }
            },
        )
        val value = owner.getValue(componentMeta("buttonStyle"))
        val style = value as ComponentStyle<*>
        assertEquals("basic-button.default", style.value)
        assertNull(style.states)
    }

    @Test
    fun `декодирует ComponentStyle с состояниями`() {
        val owner = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("statusStyle") {
                    put("value", "avatar-status.l.inactive")
                    put(
                        "states",
                        kotlinx.serialization.json.JsonArray(
                            listOf(
                                buildJsonObject {
                                    put("value", "avatar-status.l.active")
                                    put(
                                        "state",
                                        kotlinx.serialization.json.JsonArray(
                                            listOf(kotlinx.serialization.json.JsonPrimitive("active")),
                                        ),
                                    )
                                },
                            ),
                        ),
                    )
                }
            },
        )
        val value = owner.getValue(componentMeta("statusStyle"))
        val style = value as ComponentStyle<*>
        assertEquals("avatar-status.l.inactive", style.value)
        val states = style.states
        assertEquals(1, states?.size)
        assertEquals(listOf("active"), states?.first()?.state)
        assertEquals("avatar-status.l.active", states?.first()?.value)
    }

    @Test
    fun `merge - свойства дочерней вариации перекрывают родительские`() {
        val parent = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("shape") { put("value", "shape.round.4") }
                putJsonObject("height") { put("value", 32.0f) }
            },
        )
        val child = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("height") { put("value", 48.0f) }
            },
        )

        val merged = child.merge(parent)

        val shape = merged.getValue(shapeMeta("shape")) as Shape
        assertEquals("shape.round.4", shape.value)

        val height = merged.getValue(dimensionMeta("height")) as Dimension
        assertEquals(48f, height.value)
    }

    @Test
    fun `merge - дочерняя вариация без свойств берет все от родителя`() {
        val parent = UniversalPropertyOwner(
            buildJsonObject {
                putJsonObject("height") { put("value", 32.0f) }
            },
        )
        val child = UniversalPropertyOwner(JsonObject(emptyMap()))

        val merged = child.merge(parent)
        val height = merged.getValue(dimensionMeta("height")) as Dimension
        assertEquals(32f, height.value)
    }

    private fun colorMeta(id: String) = ColorPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun dimensionMeta(id: String) = DimensionPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun typographyMeta(id: String) = TypographyPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun shapeMeta(id: String) = ShapePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun shadowMeta(id: String) = ShadowPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun floatMeta(id: String) = FloatPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun booleanMeta(id: String) = BooleanPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun integerMeta(id: String) = IntegerPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun iconMeta(id: String) = IconPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )

    private fun valueMeta(id: String, values: List<String> = emptyList()) = ValuePropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
        values = values.map { EnumValueInfo(name = it) },
    )

    private fun componentMeta(id: String) = ComponentPropertyMeta(
        id = id,
        methodName = id,
        paramName = id,
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
