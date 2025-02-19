package com.sdds.playground.sandbox.badge.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun BadgeScreen() {
    val badgeViewModel: BadgeParametersViewModel = viewModel(
        factory = BadgeParametersViewModelFactory(BadgeType.Basic),
        key = "Badge",
    )
    val badgeUiState by badgeViewModel.badgeState.collectAsState()

    ComponentScaffold(
        component = {
            Badge(
                style = badgeUiState.badgeStyle(),
                label = badgeUiState.label,
                startContent = startContent(badgeUiState.contentLeft),
                endContent = endContent(badgeUiState.contentRight),
            )
        },
        propertiesOwner = badgeViewModel,
    )
}

private fun startContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = R.drawable.ic_plasma_16),
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
                painter = painterResource(id = R.drawable.ic_plasma_16),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
private fun BadgeScreenPreview() {
    SandboxTheme {
        BadgeScreen()
    }
}
