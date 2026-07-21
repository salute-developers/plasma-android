package com.sdds.compose.uikit.fixtures.stories.file

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileProgressPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.fixtures.RemoteImage
import com.sdds.compose.uikit.fixtures.stories.FileUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.FileUiStateTransformer
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.icons.compose.Close16
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.Close36
import com.sdds.icons.compose.FileCheckFill36
import com.sdds.icons.compose.SddsIcons
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class FileUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val description: String = "Description",
    val isLoading: Boolean = false,
    val hasContentStart: Boolean = true,
    val contentType: FileContentType = FileContentType.Icon,
    val actionPlacement: FileActionPlacement = FileActionPlacement.End,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class FileContentType {
    Icon, Image
}

@Story
object FileStory : ComposeBaseStory<FileUiState, FileStyle>(
    ComponentKey.File,
    FileUiState(),
    FileUiStatePropertiesProducer,
    FileUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: FileStyle,
        state: FileUiState,
    ) {
        File(
            modifier = Modifier.width(240.dp),
            style = style,
            label = state.label,
            description = state.description,
            isLoading = state.isLoading,
            image = getImageContent(state),
            progress = when (style.progressPlacement) {
                FileProgressPlacement.Inner -> {
                    {
                        CircularProgressBar(
                            progress = 0.4f,
                            valueContent = {
                                Icon(
                                    painter = rememberVectorPainter(SddsIcons.Close16),
                                    contentDescription = "",
                                )
                            },
                        )
                    }
                }

                FileProgressPlacement.Outer -> {
                    { ProgressBar(0.4f) }
                }
            },
            action = {
                IconButton(
                    iconSource = imageVectorSource(SddsIcons.Close24),
                    onClick = {},
                )
            },
            actionPlacement = state.actionPlacement,
        )
    }

    @Composable
    override fun Preview(
        style: FileStyle,
        key: ComponentKey,
    ) {
        File(
            style = style,
            label = "image.png",
            description = "226 КБ",
            isLoading = true,
            image = {
                Icon(
                    rememberVectorPainter(SddsIcons.FileCheckFill36),
                    contentDescription = "",
                )
            },
            progress = {
                CircularProgressBar(
                    progress = 0.4f,
                    valueContent = {
                        Icon(
                            painter = rememberVectorPainter(SddsIcons.Close16),
                            contentDescription = "",
                        )
                    },
                )
            },
            action = {
                IconButton(
                    iconSource = imageVectorSource(SddsIcons.Close36),
                    onClick = {},
                )
            },
        )
    }
}

@Composable
private fun getImageContent(fileUiState: FileUiState): @Composable (() -> Unit)? =
    if (fileUiState.hasContentStart) {
        {
            when (fileUiState.contentType) {
                FileContentType.Icon -> Icon(
                    rememberVectorPainter(SddsIcons.FileCheckFill36),
                    contentDescription = "",
                )

                FileContentType.Image -> RemoteImage(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Crop,
                    model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                    contentDescription = "FileImage",
                )
            }
        }
    } else {
        null
    }
