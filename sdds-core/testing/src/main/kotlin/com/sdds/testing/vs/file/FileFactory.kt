package com.sdds.testing.vs.file

import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StyleRes
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.sdds.testing.databinding.LayoutComponentFileBinding
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.File
import com.sdds.uikit.dp

/**
 * Создает [File]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun file(
    context: Context,
    @StyleRes style: Int? = null,
    state: FileUiState = FileUiState(),
): File {
    return fileLayoutBinding(context.styleWrapper(style))
        .applyState(state)
        .root
}

/**
 * Фабрика для создания [LayoutComponentFileBinding]
 */
fun fileLayoutBinding(
    context: Context,
): LayoutComponentFileBinding {
    return LayoutComponentFileBinding.inflate(LayoutInflater.from(context))
}

/**
 * Применяет [FileUiState] к [LayoutComponentFileBinding]
 */
fun LayoutComponentFileBinding.applyState(state: FileUiState?): LayoutComponentFileBinding = apply {
    state ?: return this@apply

    file.apply {
        isLoading = state.isLoading
        actionPlacement = state.actionPlacement.toFileActionPlacement()
    }

    componentFileLabel.apply {
        text = state.label
        isVisible = state.label.isNotBlank()
    }

    componentFileDescription.apply {
        text = state.description
        isVisible = state.description.isNotBlank()
    }

    componentFileIcon.apply {
        isVisible = state.contentType ==
            FileContentType.Icon &&
            state.hasContentStart &&
            state.actionPlacement != ActionPlacement.Start
    }

    componentFileImage.apply {
        isVisible = state.contentType ==
            FileContentType.Image &&
            state.hasContentStart &&
            state.actionPlacement != ActionPlacement.Start
        Glide.with(this)
            .load("https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg")
            .override(36.dp)
            .transform(
                RoundedCorners(5.dp),
            )
            .into(this)
    }
}
