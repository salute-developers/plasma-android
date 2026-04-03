package com.sdds.uikit.fixtures.stories.cell

import android.content.Context
import android.widget.FrameLayout
import androidx.core.view.setMargins
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CellLayout
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.databinding.LayoutComponentCellBinding
import com.sdds.uikit.fixtures.stories.CellUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CellUiStateTransformer

/**
 * История компонента Cell для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Cell.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Cell
 */
@Story
object CellStory : ViewBaseStory<CellUiState, CellLayout>(
    ComponentKey.Cell,
    CellUiState(),
    CellUiStatePropertiesProducer,
    CellUiStateTransformer,
) {
    private var cellLayout: LayoutComponentCellBinding? = null

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = FrameLayout.LayoutParams.MATCH_PARENT
            height = 320.dp
            setMargins(50.dp)
        }
    }

    override fun getComponent(context: Context): CellLayout {
        return cellLayoutBinding(context)
            .also { cellLayout = it }.root
            .apply { id = R.id.cell }
    }

    override fun onComponentUpdate(component: CellLayout, state: CellUiState) {
        cellLayout?.applyState(state)
    }
}
