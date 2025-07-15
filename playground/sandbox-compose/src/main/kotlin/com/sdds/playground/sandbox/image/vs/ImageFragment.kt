package com.sdds.playground.sandbox.image.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.image.ImageUiState
import com.sdds.testing.vs.image.image
import com.sdds.uikit.ImageView

/**
 * Фрагмент с компонентом ImageView
 */
internal class ImageFragment : ComponentFragment<ImageUiState, ImageView, ImageParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        ImageParametersViewModelFactory(
            defaultState = getState { ImageUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_52x),
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): ImageView {
        return image(contextWrapper)
    }

    override fun onComponentUpdate(component: ImageView?, state: ImageUiState) = Unit
}
