package com.sdds.playground.sandbox.chip.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold

@Composable
internal fun ChipScreen(theme: Theme.ThemeInfoCompose = Theme.composeDefault) {
    val chipViewModel: ChipViewModel =
        viewModel(
            factory = ChipViewModelFactory(ChipUiState(), theme),
            key = theme.toString(),
        )
    val chipUiState by chipViewModel.uiState.collectAsState()

    ComponentScaffold(
        component = {
            theme.themeWrapper {
                Chip(
                    onClick = getOnClick(chipUiState.isClickable),
                    style = chipViewModel
                        .getStyleProvider()
                        .style(chipUiState.variant),
                    label = chipUiState.label,
                    enabled = chipUiState.enabled,
                    startContent = startContent(chipUiState.hasStartIcon),
                    endContent = endContent(chipUiState.hasEndIcon),
                )
            }
        },
        propertiesOwner = chipViewModel,
    )
}

private fun getOnClick(isClickable: Boolean): (() -> Unit)? {
    return if (isClickable) {
        {}
    } else {
        null
    }
}

private fun startContent(hasContent: Boolean): (@Composable () -> Unit)? {
    return if (hasContent) {
        {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
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
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                contentDescription = "",
            )
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
internal fun ChipScreenPreview() {
    SandboxTheme {
        ChipScreen()
    }
}
