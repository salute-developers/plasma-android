package com.sdds.preview.compose

import com.sdds.sandbox.UiState
import kotlin.test.Test
import kotlin.test.assertEquals

class PreviewStateOwnerTest {

    private data class TestState(val checked: Boolean) : UiState {
        override fun updateVariant(appearance: String, variant: String): UiState = this
    }

    @Test
    fun `starts from the prepared state`() {
        val owner = PreviewStateOwner(TestState(checked = false))

        assertEquals(TestState(checked = false), owner.uiState.value)
    }

    @Test
    fun `update replaces the state seen by the story`() {
        val owner = PreviewStateOwner(TestState(checked = false))

        owner.updateState(TestState(checked = true))

        assertEquals(TestState(checked = true), owner.uiState.value)
    }
}
