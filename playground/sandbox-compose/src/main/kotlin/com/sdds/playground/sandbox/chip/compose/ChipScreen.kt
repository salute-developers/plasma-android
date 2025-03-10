package com.sdds.playground.sandbox.chip.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun ChipScreen(componentKey: ComponentKey = ComponentKey.Chip) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ChipViewModel>(
            factory = ChipViewModelFactory(ChipUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { chipUiState, style ->
            Chip(
                onClick = getOnClick(chipUiState.isClickable),
                style = style,
                label = chipUiState.label,
                enabled = chipUiState.enabled,
                startContent = startContent(chipUiState.hasStartIcon),
                endContent = endContent(chipUiState.hasEndIcon),
            )
        },
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
