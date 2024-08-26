package com.sdds.playground.sandbox.textfield

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.core.view.ComponentFragment
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.uikit.TextField
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.sdds.icons.R as Icons

/**
 * Фрагмент с компонентом TextField
 * @author Малышев Александр on 19.08.2024
 */
internal class TextFieldFragment : ComponentFragment() {

    private val textFieldViewModel by viewModels<TextFieldViewModel>()

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_120x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    override val componentLayout: TextField
        get() = TextField(ContextThemeWrapper(requireContext(), currentVariant.styleRes))
            .also { textField = it }

    override val propertiesOwner: PropertiesOwner
        get() = textFieldViewModel

    private var currentVariant: TextFieldVariant = TextFieldVariant.TextFieldL
    private var textField: TextField? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textFieldViewModel.textFieldUiState
            .onEach { state ->
                if (currentVariant != state.variant) {
                    currentVariant = state.variant
                    dispatchComponentStyleChanged()
                }
                textField?.apply {
                    this.state = state.state
                    labelType = state.labelType
                    label = state.labelText
                    placeholder = state.placeholderText
                    caption = state.captionText
                    if (state.icon) {
                        setIcon(Icons.drawable.ic_scribble_diagonal_24)
                    } else {
                        setIcon(null)
                    }
                    if (state.action) {
                        setAction(Icons.drawable.ic_shazam_24)
                    } else {
                        setAction(null)
                    }
                    setActionClickListener {
                        Toast.makeText(requireContext(), "action clicked", Toast.LENGTH_SHORT).show()
                    }
                    isEnabled = state.enabled
                    isReadOnly = state.readOnly
                }
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }
}
