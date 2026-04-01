package com.sdds.compose.uikit.fixtures.stories.toolbar

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ToolBar
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.fixtures.stories.ToolBarUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.ToolBarUiStateTransformer
import com.sdds.icons.R
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class ToolBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasDivider: Boolean = true,
    val sections: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object ToolBarStory : ComposeBaseStory<ToolBarUiState, ToolBarStyle>(
    ComponentKey.ToolBar,
    ToolBarUiState(),
    ToolBarUiStatePropertiesProducer,
    ToolBarUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ToolBarStyle,
        state: ToolBarUiState,
    ) {
        val scrollModifier = when (style.orientation) {
            ToolBarOrientation.Vertical -> Modifier.verticalScroll(rememberScrollState())
            ToolBarOrientation.Horizontal -> Modifier.horizontalScroll(rememberScrollState())
        }
        Box(modifier = scrollModifier) {
            ToolBar(
                hasDivider = state.hasDivider,
                style = style,
            ) {
                for (section in 0 until state.sections) {
                    if (section % 2 == 0) {
                        section {
                            ContainerAccordingOrientation(style.orientation) {
                                IconButton(R.drawable.ic_plasma_24) { }
                                Spacer(modifier = Modifier.size(4.dp))
                                IconButton(R.drawable.ic_salute_outline_24) { }
                            }
                        }
                    } else {
                        section { Button("Label", {}) }
                    }
                }
            }
        }
    }

    @Composable
    override fun Preview(
        style: ToolBarStyle,
        key: ComponentKey,
    ) {
        ToolBar(
            hasDivider = true,
            style = style,
        ) {
            for (item in 0..2) {
                if (item % 2 == 0) {
                    section {
                        Row {
                            IconButton(R.drawable.ic_plasma_24) { }
                            Spacer(modifier = Modifier.size(4.dp))
                            IconButton(R.drawable.ic_salute_outline_24) { }
                        }
                    }
                } else {
                    section {
                        Button("Label", {})
                    }
                }
            }
        }
    }
}

@Composable
private fun ContainerAccordingOrientation(
    orientation: ToolBarOrientation,
    content: @Composable () -> Unit,
) {
    if (orientation == ToolBarOrientation.Horizontal) {
        Row { content() }
    } else {
        Column { content() }
    }
}
