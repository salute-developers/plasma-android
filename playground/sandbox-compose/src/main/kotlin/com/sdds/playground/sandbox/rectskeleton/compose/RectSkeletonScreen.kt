package com.sdds.playground.sandbox.rectskeleton.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [RectSkeleton]
 */
@Composable
internal fun RectSkeletonScreen(componentKey: ComponentKey = ComponentKey.RectSkeleton) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<RectSkeletonViewModel>(
            factory = RectSkeletonViewModelFactory(
                defaultState = RectSkeletonUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            RectSkeleton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp),
                style = style,
                duration = 5000,
            )
        },
    )
}

@Composable
@Preview(showBackground = true)
private fun RectSkeletonScreenPreview() {
    SandboxTheme {
        RectSkeletonScreen()
    }
}
