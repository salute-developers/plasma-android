package com.sdds.playground.sandbox.image.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.ImageStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Image]
 */
@Composable
internal fun ImageScreen(componentKey: ComponentKey = ComponentKey.Image) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<ImageViewModel>(
            factory = ImageViewModelFactory(
                defaultState = ImageUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { _, style ->
            Image(
                painter = painterResource(R.drawable.ic_alarm_done_fill_36),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .background(Color.Gray),
                style = style,
            )
        },
    )
}

@Composable
internal fun ImageScreenPreview(style: ImageStyle) {
    SandboxTheme {
        Image(
            painter = painterResource(R.drawable.ic_alarm_done_fill_36),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .background(Color.Gray),
            style = style,
        )
    }
}
