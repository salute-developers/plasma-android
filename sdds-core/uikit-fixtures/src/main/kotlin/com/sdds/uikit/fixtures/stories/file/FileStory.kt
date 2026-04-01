package com.sdds.uikit.fixtures.stories.file

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.File
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.databinding.LayoutComponentFileBinding
import com.sdds.uikit.fixtures.stories.FileUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.FileUiStateTransformer

/**
 * История компонента File для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации File.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.File
 */
@Story
object FileStory : ViewBaseStory<FileUiState, File>(
    ComponentKey.File,
    FileUiState(),
    FileUiStatePropertiesProducer,
    FileUiStateTransformer,
) {
    private var fileLayout: LayoutComponentFileBinding? = null

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 216.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun getComponent(context: Context): File {
        return fileLayoutBinding(context)
            .also { fileLayout = it }.root
            .apply { id = R.id.file }
    }

    override fun onComponentUpdate(component: File, state: FileUiState) {
        fileLayout?.applyState(state)
    }
}
