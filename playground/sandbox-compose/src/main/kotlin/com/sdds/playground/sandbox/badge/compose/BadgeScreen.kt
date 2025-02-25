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
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

/**
 * Экран с [Badge]
 */
@Composable
internal fun BadgeScreen(
    theme: Theme.ThemeInfoCompose = Theme.SddsServ.compose,
) {
    val badgeViewModel: BadgeParametersViewModel = viewModel(
        factory = BadgeParametersViewModelFactory(BadgeUiState(), theme),
        key = theme.toString(),
    )
    val badgeUiState by badgeViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                Badge(
                    style = badgeViewModel
                        .getStyleProvider()
                        .style(badgeUiState.variant),
                    label = badgeUiState.label,
                    startContent = startContent(badgeUiState.contentLeft),
                    endContent = endContent(badgeUiState.contentRight),
                )
            }
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
