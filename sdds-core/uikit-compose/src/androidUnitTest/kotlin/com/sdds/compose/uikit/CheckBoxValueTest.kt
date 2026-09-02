package com.sdds.compose.uikit

import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.internal.checkable.checkbox.checked
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class CheckBoxValueTest {

    @Test
    fun `ToggleableState maps to the matching CheckBoxValue`() {
        assertEquals(CheckBoxValue.On, ToggleableState.On.toCheckBoxValue())
        assertEquals(CheckBoxValue.Off, ToggleableState.Off.toCheckBoxValue())
        assertEquals(CheckBoxValue.Indeterminate, ToggleableState.Indeterminate.toCheckBoxValue())
    }

    @Test
    fun `Off is the only CheckBoxValue that is not checked`() {
        assertFalse(CheckBoxValue.Off.checked)
        assertTrue(CheckBoxValue.On.checked)
        assertTrue(CheckBoxValue.Indeterminate.checked)
        assertTrue(CheckBoxValue.Error.checked)
    }

    @Test
    fun `CheckBoxStates has an Error entry for styling Error value`() {
        assertTrue(CheckBoxStates.entries.contains(CheckBoxStates.Error))
    }
}
