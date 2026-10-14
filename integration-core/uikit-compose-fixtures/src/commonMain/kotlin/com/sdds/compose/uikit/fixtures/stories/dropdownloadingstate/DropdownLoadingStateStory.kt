package com.sdds.compose.uikit.fixtures.stories.dropdownloadingstate

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.DropdownFooterLoadingState
import com.sdds.compose.uikit.DropdownLoadingStateStyle
import com.sdds.compose.uikit.FooterLoadingState
import com.sdds.compose.uikit.fixtures.stories.DropdownLoadingStateUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.DropdownLoadingStateUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/** Состояние истории представления загрузки выпадающего меню. */
@StoryUiState
data class DropdownLoadingStateUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val loadingState: DropdownFooterLoadingState = DropdownFooterLoadingState.Loading,
    val loadingLabel: String = "Загрузка",
    val reloadLabel: String = "Не удалось загрузить",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story(componentId = "DropdownLoadingState")
object DropdownLoadingStateStory : ComposeBaseStory<DropdownLoadingStateUiState, DropdownLoadingStateStyle>(
    ComponentKey.DropdownLoadingState,
    DropdownLoadingStateUiState(),
    DropdownLoadingStateUiStatePropertiesProducer,
    DropdownLoadingStateUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: DropdownLoadingStateStyle,
        state: DropdownLoadingStateUiState,
    ) {
        FooterLoadingState(
            style = style,
            loadingState = state.loadingState,
            loadingLabel = state.loadingLabel,
            reloadIconSource = imageVectorSource(SddsIcons.Plasma24),
            reloadLabel = state.reloadLabel,
            onClick = {},
        )
    }

    @Composable
    override fun Preview(
        style: DropdownLoadingStateStyle,
        key: ComponentKey,
    ) {
        FooterLoadingState(style = style, loadingState = DropdownFooterLoadingState.Loading, loadingLabel = "Загрузка")
    }
}
