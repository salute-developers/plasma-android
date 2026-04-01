package com.sdds.playground.sandbox.rectskeleton.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.RectSkeleton
import com.sdds.uikit.fixtures.stories.skeleton.RectSkeletonUiState
import com.sdds.uikit.fixtures.stories.skeleton.rectSkeleton

/**
 * Фрагмент с компонентом RectSkeleton
 */
internal class RectSkeletonFragment :
    ComponentFragment<RectSkeletonUiState, RectSkeleton, RectSkeletonParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        RectSkeletonParametersViewModelFactory(
            defaultState = getState { RectSkeletonUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_50x),
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): RectSkeleton {
        return rectSkeleton(contextWrapper)
    }

    override fun onComponentUpdate(component: RectSkeleton?, state: RectSkeletonUiState) = Unit
}
