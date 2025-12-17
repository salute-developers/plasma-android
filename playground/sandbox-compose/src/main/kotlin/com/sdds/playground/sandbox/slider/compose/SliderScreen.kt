package com.sdds.playground.sandbox.slider.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderStyle
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Slider]
 */
@Composable
internal fun SliderScreen(componentKey: ComponentKey = ComponentKey.Slider) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<SliderViewModel>(
            factory = SliderViewModelFactory(
                defaultState = SliderUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { sliderUiState, style ->
            val horizontal = sliderUiState.appearance.contains("Horizontal", true)
            Slider(
                modifier = Modifier,
                value = 0f,
                title = sliderUiState.title,
                labelContent = {
                    Icon(
                        painter = painterResource(R.drawable.ic_salute_outline_36),
                        contentDescription = null,
                    )
                },
                style = style,
                onValueChange = {},
                labelEnabled = sliderUiState.labelEnabled,
                thumbEnabled = sliderUiState.thumbEnabled,
                limitLabelEnabled = sliderUiState.limitLabelEnabled,
                slideDirection = sliderUiState.slideDirection,
                valueRange =
                (sliderUiState.minLabel.toFloatOrNull() ?: 0f)..(sliderUiState.maxLabel.toFloatOrNull() ?: 0f),
                valueFormatTransformer = { progress ->
                    val totalSeconds = progress.toInt()
                    val minutes = totalSeconds / 60
                    val seconds = totalSeconds % 60
                    "%02d:%02d".format(minutes, seconds)
                },
                alignment = if (horizontal) sliderUiState.alignment else style.alignment,
            )
        },
    )
}

@Composable
internal fun SliderPreview(style: SliderStyle) {
    Slider(
        style = style,
        title = "Title",
        labelContent = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_36),
                contentDescription = null,
            )
        },
        value = 0.5f,
        valueFormatTransformer = { progress ->
            "%.2f".format(progress)
        },
        onValueChange = {},
    )
}

@Composable
@Preview(showBackground = true)
private fun SliderScreenPreview() {
    SandboxTheme {
        SliderScreen()
    }
}
