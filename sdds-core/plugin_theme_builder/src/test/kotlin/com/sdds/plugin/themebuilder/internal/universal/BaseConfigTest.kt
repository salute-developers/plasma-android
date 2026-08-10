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
                    alpha = 0.8f
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
                    value = "secondaryHoverd"
                ),
                ColorState(
                    state = listOf("disabled"),
                    value = "secondary",
                    alpha = 0.5f
                ),
                ColorState(
                    state = listOf("pressed"),
                    value = "primaryPressed"
                ),
            ),
            result.states
        )
    }

    @Test
    fun `Dimension combine добавляет states из other и текущего dimension`() {
        val dimension = Dimension(
            value = 12f,
            states = listOf(
                FloatState(
                    state = listOf("pressed"),
                    value = 10f
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
                    value = 20f
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
                    value = 1.5f
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
}
