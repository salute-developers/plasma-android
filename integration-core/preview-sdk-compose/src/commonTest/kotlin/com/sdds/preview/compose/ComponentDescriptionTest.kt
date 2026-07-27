package com.sdds.preview.compose

import com.sdds.preview.contract.PreviewExamplePropertyDescription
import com.sdds.sandbox.Property
import kotlin.test.Test
import kotlin.test.assertEquals

class ComponentDescriptionTest {
    @Test
    fun `sandbox properties preserve typed defaults and choices`() {
        val descriptions = listOf(
            Property.StringProperty("label", "Label"),
            Property.BooleanProperty("enabled", true),
            Property.IntProperty("count", 3),
            Property.FloatProperty("progress", 0.5f),
            Property.SingleChoiceProperty("icon", "Start", listOf("Start", "End", "No")),
        ).map(Property<*>::toPreviewDescription)

        assertEquals(
            listOf(
                PreviewExamplePropertyDescription.StringProperty("label", "Label"),
                PreviewExamplePropertyDescription.BooleanProperty("enabled", true),
                PreviewExamplePropertyDescription.IntProperty("count", 3),
                PreviewExamplePropertyDescription.FloatProperty("progress", 0.5f),
                PreviewExamplePropertyDescription.SingleChoiceProperty(
                    "icon",
                    "Start",
                    listOf("Start", "End", "No"),
                ),
            ),
            descriptions,
        )
    }
}
