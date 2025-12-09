package com.sdds.playground.sandbox.file

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileProgressPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.style.style
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.styles.circularprogressbar.CircularProgressBar
import com.sdds.serv.styles.circularprogressbar.Default
import com.sdds.serv.styles.circularprogressbar.Xs
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.theme.SddsServTheme

/**
 * Экран с компонентом [File]
 */
@Composable
internal fun FileScreen(componentKey: ComponentKey = ComponentKey.File) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<FileViewModel>(
            factory = FileViewModelFactory(
                defaultState = FileUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { fileUiState, style ->
            File(
                modifier = Modifier.width(240.dp),
                style = style,
                label = fileUiState.label,
                description = fileUiState.description,
                isLoading = fileUiState.isLoading,
                image = if (fileUiState.hasImage) {
                    {
                        Icon(
                            painterResource(R.drawable.ic_file_check_fill_36),
                            contentDescription = "",
                        )
                    }
                } else {
                    null
                },
                progress = when (style.progressPlacement) {
                    FileProgressPlacement.Inline -> {
                        {
                            CircularProgressBar(
                                progress = 0.4f,
                                valueContent = {
                                    Icon(
                                        modifier = Modifier.size(12.dp),
                                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
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
                        iconRes = com.sdds.icons.R.drawable.ic_close_24,
                        onClick = {},
                    )
                },
                actionPlacement = fileUiState.actionPlacement,
            )
        },
    )
}

@Composable
internal fun FilePreview(style: FileStyle) {
    File(
        style = style,
        label = "image.png",
        description = "226 КБ",
        isLoading = true,
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_36),
                contentDescription = "",
            )
        },
        progress = {
            CircularProgressBar(
                progress = 0.4f,
                valueContent = {
                    Icon(
                        modifier = Modifier.size(12.dp),
                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
            )
        },
        action = {
            IconButton(
                iconRes = com.sdds.icons.R.drawable.ic_close_36,
                onClick = {},
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun FileScreenPreview() {
    SandboxTheme {
        FileScreen()
    }
}

@Composable
@Preview(showBackground = true)
private fun FilePreview() {
    SandboxTheme {
        File(
            modifier = Modifier.fillMaxWidth(),
            style = FileStyle.builder()
                .colors {
                    iconColor(Color.Cyan)
                    descriptionColor(Color.Gray)
                    labelColor(Color.Black)
                }
                .dimensions {
                    descriptionPadding(2.dp)
                    startContentPadding(12.dp)
                    endContentPadding(12.dp)
                    bottomContentPadding(12.dp)
                }
                .labelStyle(SddsServTheme.typography.bodyMNormal)
                .descriptionStyle(SddsServTheme.typography.bodySNormal)
                .actionButtonStyle(IconButton.Xs.Clear.style())
                .circularProgressBarStyle(CircularProgressBar.Xs.Default.style())
                .style(),
            isLoading = false,
            label = "some_image.png",
            description = "286 КБ",
            actionPlacement = FileActionPlacement.End,
            image = {
                Icon(
                    painter = painterResource(R.drawable.ic_file_check_fill_36),
                    contentDescription = "",
                )
            },
            progress = {
                CircularProgressBar(
                    progress = 0.75f,
                    valueContent = null,
                )
            },
            action = {
                IconButton(iconRes = R.drawable.ic_refresh_24) { }
            },
        )
    }
}
