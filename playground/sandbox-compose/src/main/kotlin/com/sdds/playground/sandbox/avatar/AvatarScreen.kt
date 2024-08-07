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
 * Экран с [SandboxAvatar]
 */
@Composable
internal fun AvatarScreen() {
    val avatarViewModel: SandboxAvatarParameterViewModel = viewModel(
        factory = SandboxAvatarParameterViewModelFactory(),
        key = "Avatar",
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

                ExampleMode.Placeholder -> SandboxAvatar(
                    size = avatarUiState.size,
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
