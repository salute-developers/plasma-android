package com.sdds.compose.uikit.fixtures.stories.rectskeleton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.RectSkeletonUiStatePropertiesProducer
import com.sdds.sandbox.RectSkeletonUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class RectSkeletonUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object RectSkeletonStory : ComposeBaseStory<RectSkeletonUiState, RectSkeletonStyle>(
    ComponentKey.RectSkeleton,
    RectSkeletonUiState(),
    RectSkeletonUiStatePropertiesProducer,
    RectSkeletonUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: RectSkeletonStyle,
        state: RectSkeletonUiState,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            RectSkeleton(
                modifier = Modifier.size(60.dp),
                style = style,
                shape = CircleShape,
            )
            RectSkeleton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp),
                style = style,
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                RectSkeleton(
                    modifier = Modifier.size(60.dp),
                    style = style,
                )
                RectSkeleton(
                    modifier = Modifier.size(60.dp),
                    style = style,
                )
            }
        }
    }
}
