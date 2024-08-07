package com.sdds.playground.sandbox.chip

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Image
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.ComponentScaffold

@Composable
internal fun ChipScreen() {
    val chipViewModel: ChipParametersViewModel =
        viewModel(ChipParametersViewModel::class.java)
    val chipUiState by chipViewModel.chipState.collectAsState()

    ComponentScaffold(
        component = {
            SandboxChip(
                onClick = getOnClick(chipUiState.isClickable),
                state = chipUiState.state,
                size = chipUiState.size,
                shape = chipUiState.shape,
                label = chipUiState.label,
                enabled = chipUiState.enabled,
                startContent = startContent(chipUiState.hasStartIcon),
                endContent = endContent(chipUiState.hasEndIcon),
            )
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

private fun startContent(hasContent: Boolean): (@Composable (Color) -> Unit)? {
    return if (hasContent) {
        {
            Image(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
                contentDescription = "",
                colorFilter = ColorFilter.tint(color = it),
            )
        }
    } else {
        null
    }
}

private fun endContent(hasContent: Boolean): (@Composable (Color) -> Unit)? {
    return if (hasContent) {
        {
            Image(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                contentDescription = "",
                colorFilter = ColorFilter.tint(color = it),
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
