package com.sdds.plugin.themebuilder.internal.universal

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertSame
import org.junit.Test

class BaseConfigTest {

    @Test
    fun `color combine с null возвращает исходный color`() {
        val color = SolidColor(
            default = "primary",
            alpha = 0.5f,
            states = listOf(
                ColorState(
                    state = listOf("pressed"),
                    value = "primaryPressed",
                    alpha = 0.8f,
                ),
            ),
        )

        val result = color.combine(
            other = null,
            withState = "disabled",
        )
        assertSame(color, result)
    }

    @Test
    fun `color combine добавляет states из other и текущего color`() {
        val color = SolidColor(
            default = "primary",
            states = listOf(
                ColorState(
                    state = listOf("pressed"),
                    value = "primaryPressed",
                ),
            ),
        )
        val other = SolidColor(
            default = "secondary",
            alpha = 0.5f,
            states = listOf(
                ColorState(
                    state = listOf("hovered"),
                    value = "secondaryHoverd",
                ),
            ),
        )

        val result = color.combine(
            other = other,
            withState = "disabled",
        )

        assertEquals("primary", result.default)
        assertEquals(
            listOf(
                ColorState(
                    state = listOf("hovered", "disabled"),
                    value = "secondaryHoverd",
                ),
                ColorState(
                    state = listOf("disabled"),
                    value = "secondary",
                    alpha = 0.5f,
                ),
                ColorState(
                    state = listOf("pressed"),
                    value = "primaryPressed",
                ),
            ),
            result.states,
        )
    }

    @Test
    fun `Dimension combine добавляет states из other и текущего dimension`() {
        val dimension = Dimension(
            value = 12f,
            states = listOf(
                FloatState(
                    state = listOf("pressed"),
                    value = 10f,
                ),
            ),
        )
        val other = Dimension(
            value = 24f,
            states = listOf(
                FloatState(
                    state = listOf("hovered"),
                    value = 20f,
                ),
            ),
        )

        val result = dimension.combine(
            other = other,
            withState = "disabled",
        )

        assertEquals(12f, result.value)
        assertEquals(
            listOf(
                FloatState(
                    state = listOf("hovered", "disabled"),
                    value = 20f,
                ),
                FloatState(
                    state = listOf("disabled"),
                    value = 24f,
                ),
                FloatState(
                    state = listOf("pressed"),
                    value = 10f,
                ),
            ).toString(),
            result.states.toString(),
        )
    }

    @Test
    fun `FloatValue combine добавляет states из other и текущего value`() {
        val value = FloatValue(
            value = 1f,
            states = listOf(
                FloatState(
                    state = listOf("pressed"),
                    value = 0.8f,
                ),
            ),
        )
        val other = FloatValue(
            value = 2f,
            states = listOf(
                FloatState(
                    state = listOf("hovered"),
                    value = 1.5f,
                ),
            ),
        )
        val result = value.combine(
            other = other,
            withState = "disabled",
        )
        assertEquals(1f, result.value)
        assertEquals(
            listOf(
                FloatState(
                    state = listOf("hovered", "disabled"),
                    value = 1.5f,
                ),
                FloatState(
                    state = listOf("disabled"),
                    value = 2f,
                ),
                FloatState(
                    state = listOf("pressed"),
                    value = 0.8f,
                ),
            ).toString(),
            result.states.toString(),
        )
    }

    @Test
    fun `Dimension combine работает когда states равны null`() {
        val dimension = Dimension(
            value = 12f,
            states = null,
        )
        val other = Dimension(
            value = 24f,
            states = null,
        )
        val result = dimension.combine(other = other, withState = "disabled")

        assertEquals(12f, result.value)
        assertEquals(
            listOf(
                FloatState(
                    state = listOf("disabled"),
                    value = 24f,
                ),
            ).toString(),
            result.states.toString(),
        )
    }

    @Test
    fun `stateful clone replaces value and states but keeps extra data`() {
        val stringStates = listOf(StringState(state = listOf("pressed"), value = "pressedValue"))

        val shape = Shape(value = "round.m", adjustment = 2f)
            .clone(value = "round.l", states = stringStates) as Shape
        val shadow = Shadow(value = "soft.s")
            .clone(value = "hard.m", states = stringStates) as Shadow
        val typography = Typography(value = "body.m")
            .clone(value = "body.l", states = stringStates) as Typography
        val value = Value(value = "default")
            .clone(value = "selected", states = stringStates)
        val componentStyle = ComponentStyle<PropertyOwner>(value = "button.default")
            .clone(value = "button.accent", states = stringStates) as ComponentStyle<*>

        assertEquals("round.l", shape.value)
        assertEquals(2f, shape.adjustment)
        assertEquals("pressedValue", shape.states?.single()?.value)
        assertEquals("hard.m", shadow.value)
        assertEquals("body.l", typography.value)
        assertEquals("selected", value.value)
        assertEquals("button.accent", componentStyle.value)
    }

    @Test
    fun `stateful clone заменяет value и states но сохраняет extra data`() {
        val stringStates = listOf(StringState(state = listOf("pressed"), value = "pressedValue"))

        val shape = Shape(value = "round.m", adjustment = 2f)
            .clone(value = "round.l", states = stringStates) as Shape
        val shadow = Shadow(value = "soft.s")
            .clone(value = "hard.m", states = stringStates) as Shadow
        val typography = Typography(value = "body.m")
            .clone(value = "body.l", states = stringStates) as Typography
        val value = Value(value = "default")
            .clone(value = "selected", states = stringStates)
        val componentStyle = ComponentStyle<PropertyOwner>(value = "button.default")
            .clone(value = "button.accent", states = stringStates) as ComponentStyle<*>

        assertEquals("round.l", shape.value)
        assertEquals(2f, shape.adjustment)
        assertEquals("pressedValue", shape.states?.single()?.value)
        assertEquals("hard.m", shadow.value)
        assertEquals("body.l", typography.value)
        assertEquals("selected", value.value)
        assertEquals("button.accent", componentStyle.value)
    }
}
