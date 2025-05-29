package com.sdds.testing.vs.modal

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.findActivity
import com.sdds.uikit.overlays.ModalFragment
import com.sdds.uikit.overlays.ModalOptions
import com.sdds.uikit.TextView
import com.sdds.uikit.dp

/**
 * Создает [ModalFragment]
 * @param state состояние
 * @param style стиль
 */
fun modal(
    state: ModalUiState,
    style: Int? = null,
): ModalFragment {
    return SimpleModalFragment.newInstance(state, style)
}

/**
 * Создает триггер [View], который запускает отображение [ModalFragment]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun modalTrigger(
    context: Context,
    @StyleRes style: Int? = null,
    state: ModalUiState = ModalUiState(),
): View {
    return basicButton(context).apply {
        id = R.id.popover_trigger
        text = "Show Modal"
        setOnClickListener {
            val fragmentManager = context.findActivity<FragmentActivity>()?.supportFragmentManager
                ?: return@setOnClickListener
            modal(state, style).show(fragmentManager, "")
        }
    }
}

internal class SimpleModalFragment : ModalFragment() {

    private val modalStyle: Int? by lazy { arguments?.getInt(BUNDLE_MODAL_STYLE) }
    private val modalState: ModalUiState by lazy {
        val state = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable(BUNDLE_MODAL_STATE, ModalUiState::class.java)
        } else {
            arguments?.getParcelable(BUNDLE_MODAL_STATE)
        }
        state ?: throw IllegalArgumentException("ModalUiState must be provided")
    }

    override fun onCreateModalOptions(): ModalOptions {
        return ModalOptions.Builder()
            .style(modalStyle)
            .width(300.dp)
            .dimBackground(modalState.useNativeBlackout)
            .hasClose(modalState.hasClose)
            .build()
    }

    override fun getContentView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return TextView(requireContext()).apply {
            text = "Modal"
        }
    }

    internal companion object {

        const val BUNDLE_MODAL_STATE = "SimpleModalFragment_state"
        const val BUNDLE_MODAL_STYLE = "SimpleModalFragment_style"

        fun newInstance(state: ModalUiState, style: Int?): SimpleModalFragment {
            return SimpleModalFragment().apply {
                arguments = bundleOf(
                    BUNDLE_MODAL_STATE to state,
                    BUNDLE_MODAL_STYLE to style,
                )
            }
        }
    }
}
