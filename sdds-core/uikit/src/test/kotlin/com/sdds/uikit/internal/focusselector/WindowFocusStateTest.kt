package com.sdds.uikit.internal.focusselector

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit-тесты [WindowFocusState]: обе функции чистые, выполняются на JVM без Android-инфраструктуры.
 */
class WindowFocusStateTest {

    @Test
    fun `окно в фокусе - массив возвращается без изменений`() {
        val state = intArrayOf(ENABLED, FOCUSED)
        assertSame(state, state.withoutFocusedIfWindowUnfocused(isInEditMode = false, hasWindowFocus = true))
    }

    @Test
    fun `режим редактирования - массив возвращается без изменений`() {
        val state = intArrayOf(ENABLED, FOCUSED)
        assertSame(state, state.withoutFocusedIfWindowUnfocused(isInEditMode = true, hasWindowFocus = false))
    }

    @Test
    fun `окно без фокуса - state_focused удаляется, резервные нули сохраняются`() {
        val state = intArrayOf(ENABLED, FOCUSED, 0, 0)
        val result = state.withoutFocusedIfWindowUnfocused(isInEditMode = false, hasWindowFocus = false)
        assertArrayEquals(intArrayOf(ENABLED, 0, 0), result)
    }

    @Test
    fun `merge после фильтра пишет в резервные нули и не выходит за границу массива`() {
        // Регрессия: вариант фильтра, удалявший хвостовые нули, ронял классы, мержащие состояния
        // после фильтрующего родителя (Avatar, Note, SegmentItem, ListView и др.),
        // с ArrayIndexOutOfBoundsException
        val state = intArrayOf(ENABLED, FOCUSED, 0, 0)
        val filtered = state.withoutFocusedIfWindowUnfocused(isInEditMode = false, hasWindowFocus = false)
        val merged = mergeIntoReservedSlots(filtered, intArrayOf(CHECKED))
        assertArrayEquals(intArrayOf(ENABLED, CHECKED, 0), merged)
    }

    @Test
    fun `state_focused отсутствует - возвращается тот же массив`() {
        val state = intArrayOf(ENABLED, 0, 0)
        assertSame(state, state.withoutFocusedIfWindowUnfocused(isInEditMode = false, hasWindowFocus = false))
    }

    @Test
    fun `эффективный фокус - реактивность выключена, состояние пробрасывается как раньше`() {
        assertTrue(effectiveFocus(windowFocusResponsive = false, hasWindowFocus = false, focused = true))
        assertFalse(effectiveFocus(windowFocusResponsive = false, hasWindowFocus = false, focused = false))
    }

    @Test
    fun `эффективный фокус - реактивность включена, требует фокуса окна`() {
        assertTrue(effectiveFocus(windowFocusResponsive = true, hasWindowFocus = true, focused = true))
        assertFalse(effectiveFocus(windowFocusResponsive = true, hasWindowFocus = false, focused = true))
        assertFalse(effectiveFocus(windowFocusResponsive = true, hasWindowFocus = true, focused = false))
    }

    /**
     * Реплика контракта android.view.View.mergeDrawableStates (View.java): новые состояния
     * пишутся в-плейс сразу за последним ненулевым элементом — в хвостовые нули,
     * зарезервированные onCreateDrawableState(extraSpace).
     */
    private fun mergeIntoReservedSlots(base: IntArray, additional: IntArray): IntArray {
        var i = base.size - 1
        while (i >= 0 && base[i] == 0) {
            i--
        }
        additional.copyInto(base, destinationOffset = i + 1)
        return base
    }

    private companion object {
        val ENABLED = android.R.attr.state_enabled
        val FOCUSED = android.R.attr.state_focused
        val CHECKED = android.R.attr.state_checked
    }
}
