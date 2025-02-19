package com.sdds.playground.sandbox.badge.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun IconBadgeScreen() {
    val badgeViewModel: BadgeParametersViewModel = viewModel(
        factory = BadgeParametersViewModelFactory(BadgeType.Icon),
        key = "iconBadge",
    )
    val badgeUiState by badgeViewModel.badgeState.collectAsState()

    ComponentScaffold(
        component = {
            IconBadge(
                style = badgeUiState.iconBadgeStyle(),
                content = startContent(badgeUiState.contentLeft),
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

@Composable
@Preview(showBackground = true)
private fun IconBadgeScreenPreview() {
    SandboxTheme {
        IconBadgeScreen()
    }
}
