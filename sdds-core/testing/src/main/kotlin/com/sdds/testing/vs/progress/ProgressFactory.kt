package com.sdds.testing.vs.progress

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.testing.R
import com.sdds.testing.component
import com.sdds.uikit.ProgressBar

/**
 * Фабрика для создания ProgressBar
 */
fun progress(
    context: Context,
    progressId: Int = R.id.progressBar,
    progress: Float = 0f,
    maxProgress: Float = 1f,
    minProgress: Float = 0f,
    progressStyle: Int = 0,
): ProgressBar {
    return ProgressBar(ContextThemeWrapper(context, progressStyle))
        .apply {
            this.progress = progress
            this.maxProgress = maxProgress
            this.minProgress = minProgress
            id = progressId
        }
}

/**
 * Тест кейс для ProgressBar
 */
fun progressBarDefault() {
    component(com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault) { context ->
        progress(
            context = context,
            progress = 0.5f,
            maxProgress = 1f,
            minProgress = 0f,
            progressStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault,
            progressId = 1,
        )
    }
}
