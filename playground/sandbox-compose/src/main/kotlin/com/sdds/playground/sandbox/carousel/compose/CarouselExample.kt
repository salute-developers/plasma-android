package com.sdds.playground.sandbox.carousel.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.Carousel
import com.sdds.compose.uikit.CarouselButtonsPlacement
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.paginationdots.M
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.playground.sandbox.SandboxTheme

@Composable
@Preview(showBackground = true)
private fun CarouselExamplePreview() {
    SandboxTheme {
        val data = listOf(
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
        val state = rememberPagerState(1) { data.size }
        Carousel(
            state = state,
            style = CarouselStyle.builder()
                .prevButtonIcon(com.sdds.icons.R.drawable.ic_chevron_left_16)
                .nextButtonIcon(com.sdds.icons.R.drawable.ic_chevron_right_16)
                .buttonsPlacement(CarouselButtonsPlacement.Inner)
                .indicatorStyle(PaginationDotsHorizontal.M.style())
                .dimensions {
                    indicatorPadding(8.dp)
                    prevButtonPadding(8.dp)
                    nextButtonPadding(8.dp)
                }
                .style(),
            pageSize = PageSize.Fixed(250.dp),
            hasIndicator = true,
            hasControls = true,
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            ) {
                Text(text = data[it])
            }
        }
    }
}
