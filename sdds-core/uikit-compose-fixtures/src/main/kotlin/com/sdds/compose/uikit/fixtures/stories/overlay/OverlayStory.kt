package com.sdds.compose.uikit.fixtures.stories.overlay

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.fixtures.stories.OverlayUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.OverlayUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

/**
 * Состояние компонента Overlay
 * @property variant вариант компонента
 */
@StoryUiState
data class OverlayUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object OverlayStory : ComposeBaseStory<OverlayUiState, OverlayStyle>(
    ComponentKey.Overlay,
    OverlayUiState(),
    OverlayUiStatePropertiesProducer,
    OverlayUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: OverlayStyle,
        state: OverlayUiState,
    ) {
        var showOverlay by remember { mutableStateOf(false) }
        Button(
            label = "Show overlay",
            onClick = {
                showOverlay = true
            },
        )
        if (showOverlay) {
            Overlay(
                modifier = Modifier.fillMaxSize(),
                style = style,
            ) {
                IconButton(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(end = 8.dp, top = 8.dp),
                    icon = painterResource(id = R.drawable.ic_close_24),
                    onClick = { showOverlay = false },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: OverlayStyle,
        key: ComponentKey,
    ) {
        var showOverlay by remember { mutableStateOf(false) }
        Button(
            label = "Show Overlay",
            onClick = {
                showOverlay = true
            },
        )
        if (showOverlay) {
            Overlay(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(),
                style = style,
            ) {
                IconButton(
                    modifier = Modifier
                        .align(Alignment.CenterEnd),
                    icon = painterResource(id = R.drawable.ic_close_24),
                    onClick = { showOverlay = false },
                )
            }
        }
    }
}
