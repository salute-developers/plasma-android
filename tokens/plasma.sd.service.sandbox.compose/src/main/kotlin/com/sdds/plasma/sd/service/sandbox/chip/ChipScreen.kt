package com.sdds.plasma.sd.service.sandbox.chip

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.sandbox.core.ComponentScaffold

@Composable
internal fun ChipScreen() {
    val chipViewModel: ChipParametersViewModel =
        viewModel(ChipParametersViewModel::class.java)
    val chipUiState by chipViewModel.chipState.collectAsState()

    ComponentScaffold(
        component = {
            Chip(
                onClick = getOnClick(chipUiState.isClickable),
                style = chipUiState.chipStyle(),
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
