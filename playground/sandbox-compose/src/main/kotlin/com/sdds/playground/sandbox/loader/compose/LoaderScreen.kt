package com.sdds.playground.sandbox.loader.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Loader
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

@Composable
internal fun LoaderScreen(componentKey: ComponentKey = ComponentKey.Loader) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<LoaderViewModel>(
            factory = LoaderViewModelFactory(LoaderUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { uiState, style ->
            Loader(
                style = style,
                progress = uiState.progress,
                trackEnabled = uiState.trackEnabled,
                valueContent = {
                    Icon(
                        painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
                loaderType = uiState.loaderType,
            )
        },
    )
}

@Preview
@Composable
internal fun LoaderPreview() {
    SandboxTheme {
        LoaderScreen()
    }
}
