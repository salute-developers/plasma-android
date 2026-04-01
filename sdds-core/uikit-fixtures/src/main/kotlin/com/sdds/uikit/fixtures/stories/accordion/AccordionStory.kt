package com.sdds.uikit.fixtures.stories.accordion

import android.content.Context
import android.view.Gravity
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Accordion
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.AccordionUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.AccordionUiStateTransformer

/**
 * История компонента Accordion для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Accordion.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Accordion
 */
@Story
object AccordionStory : ViewBaseStory<AccordionUiState, Accordion>(
    ComponentKey.Accordion,
    AccordionUiState(),
    AccordionUiStatePropertiesProducer,
    AccordionUiStateTransformer,
) {

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 320.dp
            height = FrameLayout.LayoutParams.MATCH_PARENT
            topMargin = 40.dp
            gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
        }
    }

    override fun getComponent(context: Context): Accordion {
        return accordion(context)
    }

    override fun onComponentUpdate(component: Accordion, state: AccordionUiState) {
        component.applyState(state)
    }
}
