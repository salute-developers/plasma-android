package com.sdds.playground.sandbox.carousel.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.carousel.CarouselUiState
import com.sdds.testing.vs.carousel.applyState
import com.sdds.testing.vs.carousel.carousel
import com.sdds.uikit.Carousel
import com.sdds.uikit.dp

internal class CarouselFragment : ComponentFragment<CarouselUiState, Carousel, CarouselViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        CarouselViewModelFactory(
            defaultState = getState { CarouselUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            300.dp,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): Carousel {
        return carousel(contextWrapper)
    }

    override fun onComponentUpdate(component: Carousel?, state: CarouselUiState) {
        component?.applyState(state)
    }
}
