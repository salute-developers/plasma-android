package com.sdds.testing.vs.file

import android.content.Context
import android.content.res.ColorStateList
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.sdds.testing.databinding.LayoutComponentFileBinding
import com.sdds.testing.vs.getTextColorPrimary
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CircularProgressBar
import com.sdds.uikit.File
import com.sdds.uikit.ImageView
import com.sdds.uikit.ProgressBar
import com.sdds.uikit.R
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
    return LayoutComponentFileBinding.inflate(LayoutInflater.from(context)).apply {
        var hasCircularProgress = false
        val link = context.resolveStyle(R.attr.sd_fileStyle)
        context.withStyledAttributes(link, R.styleable.File) {
            val res = getResourceId(R.styleable.File_sd_circularProgressBarStyleOverlay, 0)
            if (res != 0) hasCircularProgress = true
        }
        if (hasCircularProgress) {
            root.setProgress(circularProgress(root.context))
        } else {
            root.setProgress(horizontalProgress(root.context))
        }
    }
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

private fun circularProgress(context: Context): CircularProgressBar {
    val image = ImageView(context).apply {
        imageTintList = ColorStateList.valueOf(context.getTextColorPrimary())
        setImageResource(com.sdds.icons.R.drawable.ic_close_16)
    }
    return CircularProgressBar(context).apply {
        layoutParams = File.FileLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT,
            fileContent = File.FileContent.PROGRESS,
        ).apply { gravity = Gravity.CENTER }
        progress = 0.5f
        addView(
            image,
            FrameLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
            ).apply { gravity = Gravity.CENTER },
        )
    }
}

private fun horizontalProgress(context: Context): ProgressBar {
    return ProgressBar(context).apply {
        layoutParams = File.FileLayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT,
            fileContent = File.FileContent.PROGRESS,
        )
        progress = 0.5f
    }
}

private fun Context.resolveStyle(attr: Int): Int {
    return TypedValue().run {
        theme.resolveAttribute(attr, this, true)
        data
    }
}
