package com.sdds.playground.sandbox.carousel.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Carousel
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme

/**
 * Экран с компонентом [Carousel]
 */
@Composable
internal fun CarouselScreen(componentKey: ComponentKey = ComponentKey.Carousel) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CarouselViewModel>(
            factory = CarouselViewModelFactory(
                defaultState = CarouselUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { carouselUiState, style ->
            val state = rememberPagerState { carouselUiState.itemCount }
            Carousel(
                style = style,
                state = state,
                pageSize = PageSize.Fixed(230.dp),
                hasControls = carouselUiState.controlsEnabled,
                hasIndicator = carouselUiState.indicatorEnabled,
                snapPosition = carouselUiState.alignment.snapPosition,
                gap = if (carouselUiState.withGap) {
                    style.dimensions.gap
                } else {
                    0.dp
                },
                indicatorVisibleCount = carouselUiState.indicatorVisibleItemCount,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = SddsServTheme.colors.surfaceDefaultTransparentInfo,
                            shape = SddsServTheme.shapes.roundM,
                        )
                        .height(250.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = it.toString(),
                        style = SddsServTheme.typography.displayMBold,
                        color = { Color.White },
                    )
                }
            }
        },
    )
}

@Composable
internal fun CarouselPreview(style: CarouselStyle) {
    val previewData = listOf(
        "Слайд 1",
        "Слайд 2",
        "Слайд 3",
        "Слайд 4",
        "Слайд 5",
        "Слайд 6",
        "Слайд 7",
        "Слайд 8",
        "Слайд 9",
        "Слайд 10",
        "Слайд 11",
        "Слайд 12",
    )
    val state = rememberPagerState { previewData.size }
    Carousel(
        style = style,
        state = state,
        pageSize = PageSize.Fixed(250.dp),
        hasControls = true,
        hasIndicator = true,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = SddsServTheme.colors.surfaceDefaultTransparentInfo,
                    shape = SddsServTheme.shapes.roundM,
                )
                .height(250.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = it.toString(),
                style = SddsServTheme.typography.displayMBold,
                color = { Color.White },
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun CarouselScreenPreview() {
    SandboxTheme {
        CarouselScreen()
    }
}
