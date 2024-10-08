package com.sdds.playground.sandbox.chip.group

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.chip.ChipParametersViewModel
import com.sdds.playground.sandbox.chip.ChipParametersViewModelFactory
import com.sdds.playground.sandbox.chip.ChipUiState
import com.sdds.playground.sandbox.chip.GapMode
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.Chip
import com.sdds.uikit.ChipGroup
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом [ChipGroup]
 * @author Малышев Александр on 30.08.2024
 */
internal class ChipGroupFragment : ComponentFragment() {

    private val chipParametersViewModel by viewModels<ChipParametersViewModel> {
        ChipParametersViewModelFactory(true, getState { ChipUiState() })
    }

    override val componentLayout: View
        get() = ChipGroup(ContextThemeWrapper(requireContext(), gapMode.styleRes))
            .apply { id = R.id.chip_group }
            .also { chipGroup = it }
            .scrollable()

    override val propertiesOwner: PropertiesOwner
        get() = chipParametersViewModel

    override val defaultLayoutParams: FrameLayout.LayoutParams
        get() = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

    private var gapMode: GapMode = GapMode.Wide
    private var isWrapped: Boolean = false
    private var chipGroup: ChipGroup? = null
    private var verticalScrollView: ScrollView? = null
    private var horizontalScrollView: HorizontalScrollView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chipParametersViewModel.chipState
            .onEach { state ->
                if (gapMode != state.gapMode || isWrapped != state.isWrapped) {
                    gapMode = state.gapMode
                    isWrapped = state.isWrapped
                    dispatchComponentStyleChanged()
                }
                chipGroup?.populate(state)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        chipGroup = null
        verticalScrollView = null
        horizontalScrollView = null
    }

    private fun ChipGroup.populate(state: ChipUiState) {
        removeAllViews()
        val theme = ContextThemeWrapper(requireContext(), state.variant.styleRes)
        gravity = state.gravityMode.gravity
        this.state = state.checkedState
        this.selectionMode = state.selectionMode
        repeat(state.quantity) {
            val chip = Chip(theme).apply {
                text = state.label
                if (state.contentLeft) {
                    setDrawableStartRes(Icons.drawable.ic_plasma_24)
                } else {
                    drawableStart = null
                }

                if (state.hasClose) {
                    setDrawableEndRes(Icons.drawable.ic_close_24)
                } else {
                    drawableEnd = null
                }
            }
            addView(chip)
        }
    }

    private fun getVerticalScrollView(): ScrollView =
        verticalScrollView ?: ScrollView(requireContext())
            .apply {
                isVerticalScrollBarEnabled = false
                clipChildren = false
            }
            .also { verticalScrollView = it }

    private fun getHorizontalScrollView(): HorizontalScrollView =
        horizontalScrollView ?: HorizontalScrollView(requireContext())
            .apply {
                isHorizontalScrollBarEnabled = false
                clipChildren = false
            }
            .also { horizontalScrollView = it }

    private fun ChipGroup.scrollable(): ScrollView {
        return getVerticalScrollView().apply {
            removeAllViews()
            if (isWrapped) {
                addView(
                    this@scrollable,
                    FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                    ).apply { gravity = Gravity.CENTER_HORIZONTAL },
                )
            } else {
                addView(
                    getHorizontalScrollView().apply {
                        removeAllViews()
                        addView(
                            this@scrollable,
                            ViewGroup.LayoutParams(
                                ViewGroup.LayoutParams.WRAP_CONTENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT,
                            ),
                        )
                    },
                )
            }
        }
    }
}
