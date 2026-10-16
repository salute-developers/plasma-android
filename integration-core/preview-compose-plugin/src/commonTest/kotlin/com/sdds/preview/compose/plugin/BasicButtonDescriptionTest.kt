package com.sdds.preview.compose.plugin

import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.fixtures.stories.button.BasicButtonStory
import com.sdds.preview.compose.GeneratedStyleFactory
import com.sdds.preview.compose.generated.GeneratedPreviewStyleFactories
import com.sdds.preview.compose.previewComponent
import com.sdds.preview.contract.PreviewExamplePropertyDescription
import kotlin.test.Test
import kotlin.test.assertEquals

class BasicButtonDescriptionTest {
    @Suppress("UNCHECKED_CAST")
    @Test
    fun `BasicButton description exactly matches generated story properties`() {
        val description = previewComponent(
            BasicButtonStory,
            GeneratedPreviewStyleFactories.all.getValue("BasicButton") as GeneratedStyleFactory<ButtonStyle>,
        ).description

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
