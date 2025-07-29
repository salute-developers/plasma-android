package com.sdds.playground.sandbox.accordion.view

import android.view.ContextThemeWrapper
import android.view.Gravity
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.accordion.AccordionUiState
import com.sdds.testing.vs.accordion.accordion
import com.sdds.testing.vs.accordion.applyState
import com.sdds.uikit.Accordion

internal class AccordionFragment : ComponentFragment<AccordionUiState, Accordion, AccordionViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        AccordionViewModelFactory(
            defaultState = getState { AccordionUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = super.defaultLayoutParams.apply {
            width = resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_160x)
            height = FrameLayout.LayoutParams.MATCH_PARENT
            topMargin = resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_20x)
        }

    override val defaultGravity: Int
        get() = Gravity.TOP or Gravity.CENTER_HORIZONTAL

    override fun getComponent(contextWrapper: ContextThemeWrapper): Accordion {
        return accordion(contextWrapper)
    }

    override fun onComponentUpdate(component: Accordion?, state: AccordionUiState) {
        component?.applyState(state)
    }
}
