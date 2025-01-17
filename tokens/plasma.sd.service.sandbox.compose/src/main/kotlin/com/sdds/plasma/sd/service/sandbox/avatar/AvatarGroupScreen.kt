package com.sdds.plasma.sd.service.sandbox.avatar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import com.sdds.plasma.sd.service.sandbox.compose.R
import com.sdds.plasma.sd.service.sandbox.core.ComponentScaffold
import com.sdds.plasma.sd.service.styles.avatar.S
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.icons.R.drawable as Icons

/**
 * Экран с [AvatarGroup]
 */
@Composable
internal fun AvatarGroupScreen() {
    val avatarViewModel: AvatarParameterViewModel = viewModel(
        factory = AvatarParameterViewModelFactory(true),
        key = "AvatarGroup",
    )
    val avatarUiState by avatarViewModel.avatarUiState.collectAsState()

    ComponentScaffold(
        component = {
            AvatarGroup(
                style = AvatarGroup.S.style(),
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
        propertiesOwner = avatarViewModel,
    )
}

@Preview(showBackground = true)
@Composable
private fun AvatarScreenPreview() {
    PlasmaSdServiceTheme {
        AvatarScreen()
    }
}
