package com.sdds.playground.sandbox.file.vs

import android.view.ContextThemeWrapper
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.databinding.LayoutComponentFileBinding
import com.sdds.testing.vs.file.FileUiState
import com.sdds.testing.vs.file.applyState
import com.sdds.testing.vs.file.fileLayoutBinding
import com.sdds.uikit.File

/**
 * Фрагмент с компонентом File
 */
internal class FileFragment : ComponentFragment<FileUiState, File, FileParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        FileParametersViewModelFactory(
            defaultState = getState { FileUiState() },
            componentKey = componentKey,
        )
    }

    override val defaultLayoutParams: FrameLayout.LayoutParams by lazy {
        FrameLayout.LayoutParams(
            resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            LayoutParams.WRAP_CONTENT,
        )
    }

    private var fileLayout: LayoutComponentFileBinding? = null

    override fun getComponent(contextWrapper: ContextThemeWrapper): File {
        return fileLayoutBinding(contextWrapper)
            .also { fileLayout = it }.root
            .apply { id = R.id.file }
    }

    override fun onComponentUpdate(component: File?, state: FileUiState) {
        fileLayout?.applyState(state)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fileLayout = null
    }
}
