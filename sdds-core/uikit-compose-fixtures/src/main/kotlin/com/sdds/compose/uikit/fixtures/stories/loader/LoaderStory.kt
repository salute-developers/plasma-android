package com.sdds.compose.uikit.fixtures.stories.loader

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Loader
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderType
import com.sdds.compose.uikit.fixtures.stories.LoaderUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.LoaderUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class LoaderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val progress: Float = 0.5f,
    val trackEnabled: Boolean = true,
    val loaderType: LoaderType = LoaderType.Progress,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object LoaderStory : ComposeBaseStory<LoaderUiState, LoaderStyle>(
    ComponentKey.Loader,
    LoaderUiState(),
    LoaderUiStatePropertiesProducer,
    LoaderUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: LoaderStyle,
        state: LoaderUiState,
    ) {
        Loader(
            style = style,
            progress = state.progress,
            trackEnabled = state.trackEnabled,
            valueContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                    contentDescription = "",
                )
            },
            loaderType = state.loaderType,
        )
    }

    @Composable
    override fun Preview(
        style: LoaderStyle,
        key: ComponentKey,
    ) {
        Loader(
            style = style,
            progress = 0.5f,
            trackEnabled = true,
            loaderType = LoaderType.Spinner,
        )
    }
}
