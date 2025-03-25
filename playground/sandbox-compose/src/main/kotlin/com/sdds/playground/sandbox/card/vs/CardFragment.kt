package com.sdds.playground.sandbox.card.vs

import android.view.ContextThemeWrapper
import android.widget.FrameLayout
import androidx.fragment.app.viewModels
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.card.CardUiState
import com.sdds.testing.vs.card.applyState
import com.sdds.testing.vs.card.card
import com.sdds.uikit.Card

/**
 * Фрагмент с компонентом Card
 * @author Малышев Александр on 14.03.2025
 */
internal class CardFragment : ComponentFragment<CardUiState, Card>() {

    override val componentViewModel by viewModels<CardViewModel> {
        CardViewModelFactory(
            defaultState = getState { CardUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        )

    override fun getComponent(contextWrapper: ContextThemeWrapper): Card {
        return card(contextWrapper)
            .apply { id = R.id.card }
    }

    override fun onComponentUpdate(component: Card?, state: CardUiState) {
        component?.applyState(state)
    }
}
