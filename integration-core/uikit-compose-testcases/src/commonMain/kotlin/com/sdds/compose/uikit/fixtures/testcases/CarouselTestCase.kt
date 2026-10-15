package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.Carousel
import com.sdds.compose.uikit.CarouselStyle
import com.sdds.compose.uikit.Text

/**
 * Тест-кейсы для [Carousel]
 */

/**
 * PLASMA-T2437
 */
@Composable
fun CarouselAlignmentStartControlsInner(
    style: CarouselStyle,
    color: Color,
    shape: Shape,
    textStyle: TextStyle,
) {
    CarouselCommon(
        style = style,
        color = color,
        shape = shape,
        textStyle = textStyle,
        gap = 10.dp,
    )
}

/**
 * PLASMA-T2438
 */
@Composable
fun CarouselAlignmentCenterOuterControls(
    style: CarouselStyle,
    color: Color,
    shape: Shape,
    textStyle: TextStyle,
) {
    CarouselCommon(
        style = style,
        color = color,
        shape = shape,
        textStyle = textStyle,
        snapPosition = SnapPosition.Center,
        hasIndicator = false,
        indicatorVisibleCount = 0,
        gap = 0.dp,
        initialPage = 1,
    )
}

/**
 * PLASMA-T2439
 */
@Composable
fun CarouselAlignmentEndInnerControlsIndicator(
    style: CarouselStyle,
    color: Color,
    shape: Shape,
    textStyle: TextStyle,
) {
    CarouselCommon(
        style = style,
        color = color,
        shape = shape,
        textStyle = textStyle,
        indicatorVisibleCount = 10,
        gap = 10.dp,
        snapPosition = SnapPosition.End,
        initialPage = 1,
    )
}

/**
 * PLASMA-T2440
 */
@Composable
fun CarouselCenterInnerGapNoIndicatorNoControls(
    style: CarouselStyle,
    color: Color,
    shape: Shape,
    textStyle: TextStyle,
) {
    CarouselCommon(
        style = style,
        color = color,
        shape = shape,
        textStyle = textStyle,
        hasControls = false,
        hasIndicator = false,
        indicatorVisibleCount = 0,
        gap = 10.dp,
        snapPosition = SnapPosition.Center,
        initialPage = 1,
    )
}

/**
 * Общий метод для всех тест-кейсов
 */
@Composable
fun CarouselCommon(
    style: CarouselStyle,
    color: Color,
    shape: Shape,
    textStyle: TextStyle,
    hasControls: Boolean = true,
    hasIndicator: Boolean = true,
    indicatorVisibleCount: Int = 5,
    snapPosition: SnapPosition = SnapPosition.Start,
    gap: Dp = style.dimensions.gap,
    initialPage: Int = 0,
) {
    val carouselList = (1..12).map { it.toString() }
    val state = rememberPagerState(initialPage = initialPage) { carouselList.size }
    Carousel(
        modifier = Modifier.testTag("carousel"),
        style = style,
        state = state,
        pageSize = PageSize.Fixed(230.dp),
        hasControls = hasControls,
        hasIndicator = hasIndicator,
        gap = gap,
        indicatorVisibleCount = indicatorVisibleCount,
        snapPosition = snapPosition,
        pageContent = {
            Box(contentAlignment = Alignment.Center) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = color,
                            shape = shape,
                        )
                        .height(250.dp),
                ) {
                    Text(
                        text = it.toString(),
                        style = textStyle,
                        color = { Color.White },
                    )
                }
            }
        },
    )
}
