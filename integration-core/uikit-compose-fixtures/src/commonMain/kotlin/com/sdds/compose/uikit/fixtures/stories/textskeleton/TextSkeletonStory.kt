package com.sdds.compose.uikit.fixtures.stories.textskeleton

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.LocalTextStyle
import com.sdds.compose.uikit.SkeletonLineWidthProvider
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextSkeleton
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.fixtures.stories.TextSkeletonUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.TextSkeletonUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class TextSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val lineCount: Int = 3,
    val text: String = "",
    val width: TextSkeletonWidth = TextSkeletonWidth.Random,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class TextSkeletonWidth {
    Random,
    FullWidth,
}

@Story
object TextSkeletonStory : ComposeBaseStory<TextSkeletonUiState, TextSkeletonStyle>(
    ComponentKey.TextSkeleton,
    TextSkeletonUiState(),
    TextSkeletonUiStatePropertiesProducer,
    TextSkeletonUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: TextSkeletonStyle,
        state: TextSkeletonUiState,
    ) {
        Box(contentAlignment = Alignment.TopStart) {
            val defaultTextStyle = if (style.textStyle == TextStyle.Default) {
                LocalTextStyle.current
            } else {
                style.textStyle.copy(color = LocalTextStyle.current.color)
            }
            Text(
                text = state.text,
                style = defaultTextStyle,
                maxLines = state.lineCount,
                modifier = Modifier.fillMaxWidth(),
            )
            TextSkeleton(
                lineCount = state.lineCount,
                textStyle = defaultTextStyle,
                lineWidthProvider = when (state.width) {
                    TextSkeletonWidth.Random -> SkeletonLineWidthProvider.RandomDeviation()
                    TextSkeletonWidth.FullWidth -> SkeletonLineWidthProvider.FillMaxWidth
                },
                modifier = Modifier.fillMaxWidth(),
                style = style,
            )
        }
    }

    @Composable
    override fun Preview(
        style: TextSkeletonStyle,
        key: ComponentKey,
    ) {
        val defaultTextStyle = if (style.textStyle == TextStyle.Default) {
            LocalTextStyle.current
        } else {
            style.textStyle.copy(color = LocalTextStyle.current.color)
        }
        TextSkeleton(
            style = style,
            textStyle = defaultTextStyle,
            lineCount = 3,
        )
    }
}
