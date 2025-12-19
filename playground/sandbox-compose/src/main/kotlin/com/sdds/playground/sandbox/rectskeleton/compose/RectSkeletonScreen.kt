package com.sdds.playground.sandbox.rectskeleton.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                RectSkeleton(
                    modifier = Modifier.size(60.dp),
                    style = style,
                    shape = CircleShape,
                )
                RectSkeleton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp),
                    style = style,
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    RectSkeleton(
                        modifier = Modifier.size(60.dp),
                        style = style,
                    )
                    RectSkeleton(
                        modifier = Modifier.size(60.dp),
                        style = style,
                    )
                }
            }
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
