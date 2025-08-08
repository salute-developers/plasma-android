package com.sdds.playground.sandbox.loader.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.loader.LoaderUiState
import com.sdds.testing.vs.loader.applyState
import com.sdds.testing.vs.loader.loader
import com.sdds.uikit.Loader

internal class LoaderFragment : ComponentFragment<LoaderUiState, Loader, LoaderViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        LoaderViewModelFactory(
            defaultState = getState { LoaderUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): Loader {
        return loader(contextWrapper)
    }

    override fun onComponentUpdate(component: Loader?, state: LoaderUiState) {
        component?.applyState(state)
    }
}
