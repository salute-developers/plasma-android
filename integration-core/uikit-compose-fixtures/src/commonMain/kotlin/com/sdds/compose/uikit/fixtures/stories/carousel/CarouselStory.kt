package com.sdds.compose.uikit.fixtures.stories.carousel

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.Carousel
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.CarouselUiStatePropertiesProducer
import com.sdds.compose.uikit.fixtures.stories.CarouselUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class CarouselUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemCount: Int = 10,
    val alignment: CarouselPageAlignment = CarouselPageAlignment.Center,
    val controlsEnabled: Boolean = true,
    val indicatorEnabled: Boolean = true,
    val indicatorVisibleItemCount: Int = 5,
    val withGap: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

enum class CarouselPageAlignment(val snapPosition: SnapPosition) {
    Start(SnapPosition.Start),
    Center(SnapPosition.Center),
    End(SnapPosition.End),
}

@Story
object CarouselStory : ComposeBaseStory<CarouselUiState, CarouselStyle>(
    ComponentKey.Carousel,
    CarouselUiState(),
    CarouselUiStatePropertiesProducer,
    CarouselUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: CarouselStyle,
        state: CarouselUiState,
    ) {
        val carouselState = rememberPagerState { state.itemCount }
        Carousel(
            style = style,
            state = carouselState,
            pageSize = PageSize.Fixed(230.dp),
            hasControls = state.controlsEnabled,
            hasIndicator = state.indicatorEnabled,
            snapPosition = state.alignment.snapPosition,
            gap = if (state.withGap) {
                style.dimensions.gap
            } else {
                0.dp
            },
            indicatorVisibleCount = state.indicatorVisibleItemCount,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = carouselCardBackground(isSystemInDarkTheme()),
                        shape = carouselCardShape,
                    )
                    .height(250.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = it.toString(),
                    style = carouselCardTextStyle,
                    color = { Color.White },
                )
            }
        }
    }

    @Composable
    override fun Preview(
        style: CarouselStyle,
        key: ComponentKey,
    ) {
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
                        color = carouselCardBackground(isSystemInDarkTheme()),
                        shape = carouselCardShape,
                    )
                    .height(250.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = it.toString(),
                    style = carouselCardTextStyle,
                    color = { Color.White },
                )
            }
        }
    }
}

private val carouselCardShape = RoundedCornerShape(12.dp)
private val carouselCardTextStyle = TextStyle.Default.copy(fontSize = 20.sp)

private fun carouselCardBackground(dark: Boolean): Color {
    return if (dark) Color(0x33118CDF) else Color(0x1F118CDF)
}
