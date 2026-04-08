package com.sdds.compose.uikit.fixtures.stories.text

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.sandbox.NoStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.TextUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TextUiStateTransformer
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.stringSource
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.StateValueTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryProperty
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class TextUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val text: String = LARGE_TEXT,
    @StoryProperty(transformedBy = MaxLinesTransformer::class)
    val maxLines: Int = 5,
    val softWrap: Boolean = true,
    val overflow: TextOverflowMode = TextOverflowMode.Ellipsis,
    val colorMode: TextColorMode = TextColorMode.FillColor,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TextOverflowMode {
    Clip,
    Ellipsis,
}

enum class TextColorMode {
    FillColor,
    FillBrush,
}

@Story
object TextStory : ComposeBaseStory<TextUiState, NoStyle>(
    ComponentKey.Text,
    TextUiState(),
    TextUiStatePropertiesProducer,
    TextUiStateTransformer,
) {

    private val ExampleFillColor = Color(0xFF27AE60).asBrush()
    private val ExampleFillBrush = Brush.linearGradient(
        colors = listOf(Color(0xFF11994A), Color(0xFFff5757)),
    )

    @Composable
    override fun BoxScope.Content(
        style: NoStyle,
        state: TextUiState,
    ) {
        Text(
            source = stringSource(state.text),
            modifier = Modifier.wrapContentSize(),
            maxLines = state.maxLines,
            softWrap = state.softWrap,
            overflow = when (state.overflow) {
                TextOverflowMode.Clip -> TextOverflow.Clip
                TextOverflowMode.Ellipsis -> TextOverflow.Ellipsis
            },
            brush = {
                when (state.colorMode) {
                    TextColorMode.FillColor -> ExampleFillColor
                    TextColorMode.FillBrush -> ExampleFillBrush
                }
            },
        )
    }

    @Composable
    override fun Preview(
        style: NoStyle,
        key: ComponentKey,
    ) {
        Text(
            source = stringSource(LARGE_TEXT),
            modifier = Modifier.width(240.dp),
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

private const val LARGE_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
    "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
    "in reprehenderit in voluptate velit esse cillum dolore"

internal object MaxLinesTransformer : StateValueTransformer<Int, Int> {
    override fun transform(input: Int): Int {
        return input.coerceAtLeast(1)
    }
}
