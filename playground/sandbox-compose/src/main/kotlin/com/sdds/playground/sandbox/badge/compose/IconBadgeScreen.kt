package com.sdds.playground.sandbox.badge.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun IconBadgeScreen(componentKey: ComponentKey = ComponentKey.IconBadge) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<IconBadgeParametersViewModel>(
            factory = IconBadgeParametersViewModelFactory(BadgeUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { badgeUiState, style ->
            IconBadge(
                style = style,
                content = startContent(badgeUiState.contentLeft),
            )
        },
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
