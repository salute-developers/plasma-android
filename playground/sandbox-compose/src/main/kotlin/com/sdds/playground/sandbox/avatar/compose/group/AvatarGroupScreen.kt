package com.sdds.playground.sandbox.avatar.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.avatar
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.avatar.compose.AvatarScreen
import com.sdds.playground.sandbox.avatar.compose.AvatarUiState
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.icons.R.drawable as Icons

/**
 * Экран с [AvatarGroup]
 */
@Composable
internal fun AvatarGroupScreen(componentKey: ComponentKey = ComponentKey.AvatarGroup) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<AvatarGroupViewModel>(
            factory = AvatarGroupViewModelFactory(AvatarUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { avatarUiState, style ->
            AvatarGroup(
                style = style,
                threshold = avatarUiState.threshold,
            ) {
                avatars(3) { index ->
                    if (index % 2 == 0) {
                        Avatar(placeholder = avatarUiState.placeholder)
                    } else {
                        AsyncImage(
                            modifier = Modifier.avatar(
                                status = avatarUiState.status,
                                action = painterResource(id = Icons.ic_sber_24),
                                actionEnabled = avatarUiState.actionEnabled,
                                placeholder = avatarUiState.placeholder,
                            ),
                            contentScale = ContentScale.Crop,
                            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                            contentDescription = "AsyncAvatar",
                        )
                    }
                }

                avatar {
                    Image(
                        modifier = Modifier.avatar(
                            status = avatarUiState.status,
                            action = painterResource(id = Icons.ic_sber_24),
                            actionEnabled = avatarUiState.actionEnabled,
                            placeholder = avatarUiState.placeholder,
                        ),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.il_avatar_test),
                        contentDescription = "Avatar",
                    )
                }

                counter {
                    AvatarCounter(displayCount = it)
                }
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun AvatarScreenPreview() {
    SandboxTheme {
        AvatarScreen()
    }
}
