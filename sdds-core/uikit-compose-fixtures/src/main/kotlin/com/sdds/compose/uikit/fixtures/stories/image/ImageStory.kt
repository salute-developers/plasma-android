package com.sdds.compose.uikit.fixtures.stories.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ImageStyle
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ImageUiStatePropertiesProducer
import com.sdds.sandbox.ImageUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Image
 * @property variant стиль компонента
 */
@StoryUiState
data class ImageUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ImageStory : ComposeBaseStory<ImageUiState, ImageStyle>(
    ComponentKey.Image,
    ImageUiState(),
    ImageUiStatePropertiesProducer,
    ImageUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ImageStyle,
        state: ImageUiState,
    ) {
        Image(
            painter = painterResource(R.drawable.ic_alarm_done_fill_36),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .background(Color.Gray),
            style = style,
        )
    }
}
