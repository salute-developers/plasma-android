package com.sdds.compose.uikit.fixtures.stories.aiheader

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiHeader
import com.sdds.compose.uikit.ai.AiHeaderSeparationType
import com.sdds.compose.uikit.ai.AiHeaderStyle
import com.sdds.compose.uikit.ai.AiHeaderTitleAlignment
import com.sdds.compose.uikit.fixtures.stories.AiHeaderUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.AiHeaderUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.AiOutline24
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.PanelSidebarLOutline24
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

enum class AiHeaderTitleAlign { Start, Center }

@StoryUiState
data class AiHeaderUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val subtitle: String = "Subtitle",
    val separationType: AiHeaderSeparationType = AiHeaderSeparationType.None,
    val titleAlign: AiHeaderTitleAlign = AiHeaderTitleAlign.Start,
    val hasActionBefore: Boolean = true,
    val hasActionAfter: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object AiHeaderStory : ComposeBaseStory<AiHeaderUiState, AiHeaderStyle>(
    ComponentKey.AiHeader,
    AiHeaderUiState(),
    AiHeaderUiStatePropertiesProducer,
    AiHeaderUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: AiHeaderStyle,
        state: AiHeaderUiState,
    ) {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            separationType = state.separationType,
            titleAlignment = when (state.titleAlign) {
                AiHeaderTitleAlign.Start -> AiHeaderTitleAlignment.Start
                AiHeaderTitleAlign.Center -> AiHeaderTitleAlignment.Center
            },
            actionBefore = if (state.hasActionBefore) {
                {
                    ButtonGroup {
                        button {
                            IconButton(
                                iconSource = imageVectorSource(
                                    SddsIcons.PanelSidebarLOutline24,
                                ),
                                onClick = {
                                },
                            )
                        }
                        button {
                            IconButton(
                                iconSource = imageVectorSource(
                                    SddsIcons.AiOutline24,
                                ),
                                onClick = {},
                            )
                        }
                    }
                }
            } else {
                null
            },
            actionAfter = if (state.hasActionAfter) {
                {
                    IconButton(
                        iconSource = imageVectorSource(SddsIcons.Close24),
                        onClick = {},
                    )
                }
            } else {
                null
            },
            titleContent = {
                Text(text = state.title)
            },
            subtitleContent = state.subtitle.takeIf { it.isNotEmpty() }?.let {
                {
                    Text(text = it)
                }
            },
        )
    }

    @Composable
    override fun Preview(style: AiHeaderStyle, key: ComponentKey) {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            style = style,
            actionBefore = {
                IconButton(
                    iconSource = imageVectorSource(
                        SddsIcons.PanelSidebarLOutline24,
                    ),
                    onClick = {
                    },
                )
            },
            actionAfter = {
                IconButton(
                    iconSource = imageVectorSource(SddsIcons.Close24),
                    onClick = {},
                )
            },
            titleContent = { Text(text = "Title") },
            subtitleContent = { Text(text = "Subtitle") },
        )
    }
}
