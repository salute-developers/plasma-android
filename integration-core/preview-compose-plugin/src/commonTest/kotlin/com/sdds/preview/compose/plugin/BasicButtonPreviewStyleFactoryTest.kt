package com.sdds.preview.compose.plugin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class BasicButtonPreviewStyleFactoryTest {
    @Test
    fun `supported mapping matches mvp metadata subset`() {
        assertEquals(20, BasicButtonPreviewStyleFactory.supportedPropertyIds.size)
        assertFalse("unknown" in BasicButtonPreviewStyleFactory.supportedPropertyIds)
    }
}
