package com.sdds.uikit.fixtures.stories.image

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ImageView
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.ImageUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ImageUiStateTransformer

/**
 * История компонента ImageView для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации ImageView.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Image
 */
@Story
object ImageStory : ViewBaseStory<ImageUiState, ImageView>(
    ComponentKey.Image,
    ImageUiState(),
    ImageUiStatePropertiesProducer,
    ImageUiStateTransformer,
) {
    override fun getComponent(context: Context): ImageView {
        return image(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 104.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun onComponentUpdate(component: ImageView, state: ImageUiState) = Unit
}
