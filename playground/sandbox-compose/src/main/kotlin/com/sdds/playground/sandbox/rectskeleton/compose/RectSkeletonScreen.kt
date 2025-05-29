package com.sdds.playground.sandbox.rectskeleton.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.RectSkeleton
import com.sdds.compose.uikit.interactions.asStatefulValue
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
                // удалить после починки токенов:
                brush = Brush.linearGradient(
                    0f to Color.Transparent,
                    0.5f to Color.LightGray,
                    1f to Color.Transparent,
                    start = Offset.Zero,
                    end = Offset(Float.POSITIVE_INFINITY, 0f),
                ).asStatefulValue(),
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
