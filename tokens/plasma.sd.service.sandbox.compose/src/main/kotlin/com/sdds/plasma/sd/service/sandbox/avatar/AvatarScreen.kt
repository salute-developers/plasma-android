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
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.avatar
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.compose.R
import com.sdds.plasma.sd.service.sandbox.core.ComponentScaffold
import com.sdds.icons.R.drawable as Icons

/**
 * Экран с [Avatar]
 */
@Composable
internal fun AvatarScreen() {
    val avatarViewModel: AvatarParameterViewModel = viewModel(
        factory = AvatarParameterViewModelFactory(),
        key = "Avatar",
    )
    val avatarUiState by avatarViewModel.avatarUiState.collectAsState()

    ComponentScaffold(
        component = {
            val avatarStyle = avatarUiState.avatarStyle()
            val avatarModifier = Modifier.avatar(
                style = avatarStyle,
                status = avatarUiState.status,
                action = painterResource(id = Icons.ic_sber_24),
                actionEnabled = avatarUiState.actionEnabled,
                placeholder = avatarUiState.placeholder,
            )
            when (avatarUiState.exampleMode) {
                ExampleMode.Local -> Image(
                    modifier = avatarModifier,
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentDescription = "Avatar",
                )

                ExampleMode.Remote -> AsyncImage(
                    modifier = avatarModifier,
                    contentScale = ContentScale.Crop,
                    model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
                    contentDescription = "AsyncAvatar",
                )

                ExampleMode.Placeholder -> Avatar(
                    style = avatarStyle,
                    painter = null,
                    status = avatarUiState.status,
                    action = if (avatarUiState.actionEnabled) painterResource(id = Icons.ic_sber_24) else null,
                    actionEnabled = avatarUiState.actionEnabled,
                    placeholder = avatarUiState.placeholder,
                )
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