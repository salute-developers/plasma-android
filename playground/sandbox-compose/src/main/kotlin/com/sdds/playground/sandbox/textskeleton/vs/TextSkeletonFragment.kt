package com.sdds.playground.sandbox.textskeleton.vs

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.skeleton.TextSkeletonUiState
import com.sdds.testing.vs.skeleton.applyState
import com.sdds.testing.vs.skeleton.textSkeleton
import com.sdds.uikit.TextSkeleton
import com.sdds.uikit.TextView

/**
 * Фрагмент с компонентом TextSkeleton
 */
internal class TextSkeletonFragment :
    ComponentFragment<TextSkeletonUiState, View, TextSkeletonParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        TextSkeletonParametersViewModelFactory(
            defaultState = getState { TextSkeletonUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        ).apply {
            gravity = Gravity.CENTER
        }

    override fun getComponent(contextWrapper: ContextThemeWrapper): View {
        return textSkeleton(contextWrapper)
    }

    override fun onComponentUpdate(component: View?, state: TextSkeletonUiState) {
        component?.findViewById<TextSkeleton>(com.sdds.testing.R.id.text_skeleton)?.applyState(state)
        component?.findViewById<TextView>(com.sdds.testing.R.id.text_over_skeleton)?.applyState(state)
    }
}
