package com.sdds.compose.uikit.fixtures.samples.carousel

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.Carousel
import com.sdds.compose.uikit.CarouselButtonsPlacement
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Carousel_Simple() {
    val carouselData = listOf(
        "Slide 1",
        "Slide 2",
        "Slide 3",
        "Slide 4",
        "Slide 5",
        "Slide 6",
        "Slide 7",
        "Slide 8",
        "Slide 9",
        "Slide 10",
    )
    composableCodeSnippet {
        val carouselState = rememberPagerState { carouselData.size }
        Carousel(
            state = carouselState,
            pageSize = PageSize.Fixed(250.dp),
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            ) {
                Text(carouselData[it])
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Carousel_NoControls() {
    val carouselData = listOf(
        "Slide 1",
        "Slide 2",
        "Slide 3",
        "Slide 4",
        "Slide 5",
        "Slide 6",
        "Slide 7",
        "Slide 8",
        "Slide 9",
        "Slide 10",
    )
    composableCodeSnippet {
        val carouselState = rememberPagerState { carouselData.size }
        Carousel(
            state = carouselState,
            hasControls = false,
            pageSize = PageSize.Fixed(250.dp),
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            ) {
                Text(carouselData[it])
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Carousel_NoIndicator() {
    val carouselData = listOf(
        "Slide 1",
        "Slide 2",
        "Slide 3",
        "Slide 4",
        "Slide 5",
        "Slide 6",
        "Slide 7",
        "Slide 8",
        "Slide 9",
        "Slide 10",
    )
    composableCodeSnippet {
        val carouselState = rememberPagerState { carouselData.size }
        Carousel(
            state = carouselState,
            hasIndicator = false,
            pageSize = PageSize.Fixed(250.dp),
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            ) {
                Text(carouselData[it])
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Carousel_ContentSnapToCenter() {
    val carouselData = listOf(
        "Slide 1",
        "Slide 2",
        "Slide 3",
        "Slide 4",
        "Slide 5",
        "Slide 6",
        "Slide 7",
        "Slide 8",
        "Slide 9",
        "Slide 10",
    )
    composableCodeSnippet {
        val carouselState = rememberPagerState { carouselData.size }
        Carousel(
            state = carouselState,
            snapPosition = SnapPosition.Center,
            pageSize = PageSize.Fixed(250.dp),
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            ) {
                Text(carouselData[it])
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Carousel_Style() {
    composableCodeSnippet {
        CarouselStyle.builder()
            .dimensions {
                nextButtonPadding(8.0.dp)
                prevButtonPadding(8.0.dp)
                indicatorPadding(8.0.dp)
                gap(8.dp)
            }
            .prevButtonStyle(
                placeholder(
                    ButtonStyle.iconButtonBuilder().style(),
                    "/** Стиль компонента IconButton */",
                ),
            )
            .nextButtonStyle(
                placeholder(
                    ButtonStyle.iconButtonBuilder().style(),
                    "/** Стиль компонента IconButton */",
                ),
            )
            .indicatorStyle(
                placeholder(
                    PaginationDotsStyle.builder().style(),
                    "/** Стиль компонента PaginationDots */",
                ),
            )
            .prevButtonIcon(R.drawable.ic_chevron_left_36)
            .nextButtonIcon(R.drawable.ic_chevron_right_36)
            .buttonsPlacement(CarouselButtonsPlacement.Inner)
            .style()
    }
}
