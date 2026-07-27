package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.fixtures.stories.button.BasicButtonStory
import com.sdds.preview.compose.previewComponent
import com.sdds.preview.contract.PreviewExamplePropertyDescription
import kotlin.test.Test
import kotlin.test.assertEquals

class BasicButtonDescriptionTest {
    @Test
    fun `BasicButton description exactly matches generated story properties`() {
        val description = previewComponent(BasicButtonStory, BasicButtonPreviewStyleFactory).description

        assertEquals("BasicButton", description.componentId)
        assertEquals("BasicButton", description.storyId)
        assertEquals(
            listOf(
                PreviewExamplePropertyDescription.StringProperty("label", "label"),
                PreviewExamplePropertyDescription.StringProperty("value", ""),
                PreviewExamplePropertyDescription.SingleChoiceProperty(
                    "icon",
                    "Start",
                    listOf("Start", "End", "No"),
                ),
                PreviewExamplePropertyDescription.SingleChoiceProperty(
                    "spacing",
                    "Packed",
                    listOf("Packed", "SpaceBetween"),
                ),
                PreviewExamplePropertyDescription.BooleanProperty("hasFixedWidth", false),
                PreviewExamplePropertyDescription.BooleanProperty("enabled", true),
                PreviewExamplePropertyDescription.BooleanProperty("loading", false),
            ),
            description.properties,
        )
    }
}
