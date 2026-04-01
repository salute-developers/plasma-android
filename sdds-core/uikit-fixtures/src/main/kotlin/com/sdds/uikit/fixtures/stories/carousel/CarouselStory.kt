package com.sdds.uikit.fixtures.stories.carousel

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Carousel
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.CarouselUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CarouselUiStateTransformer

/**
 * История компонента Carousel для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Carousel.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Carousel
 */
@Story
object CarouselStory : ViewBaseStory<CarouselUiState, Carousel>(
    ComponentKey.Carousel,
    CarouselUiState(),
    CarouselUiStatePropertiesProducer,
    CarouselUiStateTransformer,
) {

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = FrameLayout.LayoutParams.MATCH_PARENT
            height = 300.dp
        }
    }

    override fun getComponent(context: Context): Carousel {
        return carousel(context)
    }

    override fun onComponentUpdate(component: Carousel, state: CarouselUiState) {
        component.applyState(state)
    }
}
