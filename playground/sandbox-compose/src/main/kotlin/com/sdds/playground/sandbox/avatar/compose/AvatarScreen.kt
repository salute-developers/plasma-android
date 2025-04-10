package com.sdds.playground.sandbox.avatar.compose

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Image
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с [Avatar]
 */
@Composable
internal fun AvatarScreen(componentKey: ComponentKey = ComponentKey.Avatar) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<AvatarViewModel>(
            factory = AvatarViewModelFactory(AvatarUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { avatarUiState, avatarStyle ->
            Avatar(
                style = avatarStyle,
                status = avatarUiState.status,
                placeholder = avatarUiState.placeholder,
                extra = { AvatarExtra(avatarUiState, avatarStyle) },
            ) {
                AvatarContent(avatarUiState)
            }
        },
    )
}

@Composable
private fun BoxScope.AvatarExtra(avatarUiState: AvatarUiState, avatarStyle: AvatarStyle) {
    if (avatarUiState.extra == AvatarExtra.Badge && avatarStyle.badgeStyle != null) {
        Badge(
            modifier = Modifier.align(avatarUiState.extraPlacement.alignment),
            label = avatarUiState.badgeText,
            startContent = startContent(avatarUiState.badgeContentStart),
            endContent = endContent(avatarUiState.badgeContentEnd),
        )
    } else if (avatarUiState.extra == AvatarExtra.Counter && avatarStyle.counterStyle != null) {
        Counter(
            modifier = Modifier.align(avatarUiState.extraPlacement.alignment),
            count = avatarUiState.counterText,
        )
    }
}

@Composable
private fun BoxScope.AvatarContent(avatarUiState: AvatarUiState) {
    when (avatarUiState.exampleMode) {
        ExampleMode.Local -> Image(
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.il_avatar_test),
            contentDescription = "Avatar",
        )

        ExampleMode.Remote -> AsyncImage(
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop,
            model = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg",
            contentDescription = "AsyncAvatar",
        )
        ExampleMode.Placeholder -> {}
    }
}

private fun startContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

private fun endContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Preview(showBackground = true)
@Composable
private fun AvatarScreenPreview() {
    SandboxTheme {
        AvatarScreen()
    }
}
