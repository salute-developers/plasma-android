package com.sdds.compose.uikit.fixtures.stories.slider

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.fixtures.stories.SliderUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.SliderUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlin.math.roundToInt

@StoryUiState
data class SliderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val limitLabelEnabled: Boolean = true,
    val labelEnabled: Boolean = true,
    val minLabel: String = "0",
    val maxLabel: String = "100",
    val title: String = "Title",
    val thumbEnabled: Boolean = true,
    val slideDirection: SlideDirection = SlideDirection.Normal,
    val alignment: SliderAlignment = SliderAlignment.Start,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object SliderStory : ComposeBaseStory<SliderUiState, SliderStyle>(
    ComponentKey.Slider,
    SliderUiState(),
    SliderUiStatePropertiesProducer,
    SliderUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: SliderStyle,
        state: SliderUiState,
    ) {
        val horizontal = state.appearance.contains("Horizontal", true)
        Slider(
            modifier = Modifier,
            value = 0f,
            title = state.title,
            labelContent = {
                Icon(
                    painter = painterResource(R.drawable.ic_salute_outline_36),
                    contentDescription = null,
                )
            },
            style = style,
            onValueChange = {},
            labelEnabled = state.labelEnabled,
            thumbEnabled = state.thumbEnabled,
            limitLabelEnabled = state.limitLabelEnabled,
            slideDirection = state.slideDirection,
            valueRange =
            (state.minLabel.toFloatOrNull() ?: 0f)..(state.maxLabel.toFloatOrNull() ?: 1f),
            valueFormatTransformer = { progress ->
                progress.roundToInt().toString()
            },
            alignment = if (horizontal) state.alignment else style.alignment,
        )
    }

    @Composable
    override fun Preview(
        style: SliderStyle,
        key: ComponentKey,
    ) {
        Slider(
            style = style,
            title = "Title",
            labelContent = {
                Icon(
                    painter = painterResource(R.drawable.ic_salute_outline_36),
                    contentDescription = null,
                )
            },
            value = 0.5f,
            valueFormatTransformer = { progress ->
                "%.2f".format(progress)
            },
            onValueChange = {},
        )
    }
}
