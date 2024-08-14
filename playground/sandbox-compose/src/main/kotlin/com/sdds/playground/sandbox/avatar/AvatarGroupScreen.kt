package com.sdds.playground.sandbox.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.sdds.compose.uikit.Image
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold
import com.sdds.icons.R.drawable as Icons

/**
 * Экран с [SandboxAvatarGroup]
 */
@Composable
internal fun AvatarGroupScreen() {
    val avatarViewModel: SandboxAvatarParameterViewModel = viewModel(
        factory = SandboxAvatarParameterViewModelFactory(true),
        key = "AvatarGroup",
    )
    val avatarUiState by avatarViewModel.avatarUiState.collectAsState()

    ComponentScaffold(
        component = {
            val avatarModifier = Modifier.avatar(
                size = avatarUiState.size,
                status = avatarUiState.status,
                action = painterResource(id = Icons.ic_sber_24),
                actionEnabled = avatarUiState.actionEnabled,
                placeholder = avatarUiState.placeholder,
            )
            SandboxAvatarGroup(
                size = avatarUiState.size,
                threshold = avatarUiState.threshold,
            ) {
                avatars(3) { index ->
                    if (index % 2 == 0) {
                        SandboxAvatar(
                            size = avatarUiState.size,
                            status = avatarUiState.status,
                            action = if (avatarUiState.actionEnabled) painterResource(id = Icons.ic_sber_24) else null,
                            actionEnabled = avatarUiState.actionEnabled,
                            placeholder = avatarUiState.placeholder,
                        )
                    } else {
                        AsyncImage(
                            modifier = avatarModifier,
                            contentScale = ContentScale.Crop,
                            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                            contentDescription = "AsyncAvatar",
                        )
                    }
                }

                avatar {
                    Image(
                        modifier = avatarModifier,
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.il_avatar_test),
                        contentDescription = "Avatar",
                    )
                }

                counter {
                    SandboxAvatarCounter(
                        displayCount = it,
                        size = avatarUiState.size,
                    )
                }
            }
        },
        propertiesOwner = avatarViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun AvatarScreenPreview() {
    SandboxTheme {
        AvatarScreen()
    }
}
