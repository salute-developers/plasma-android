package com.sdds.uikit.fixtures.samples.carousel

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.carousel.CarouselContentAlignment
import com.sdds.uikit.fixtures.stories.carousel.CarouselUiState
import com.sdds.uikit.fixtures.stories.carousel.carousel

@DocSample
fun Carousel_Simple(context: Context): View {
    return carousel(
        context,
        state = CarouselUiState(
            variant = "",
            appearance = "",
            itemCount = 10,
            alignment = CarouselContentAlignment.START,
            controlsEnabled = true,
            indicatorEnabled = true,
            indicatorVisibleItemCount = 5,
            withGap = true,
        ),
    ).apply { setOffscreenOffset(10f.dp) }
}
