package com.sdds.preview.compose

import androidx.compose.runtime.Composable
import com.sdds.preview.contract.PreviewComponent

/** Собирает UIKit style из effective component properties и подготовленной темы. */
public fun interface ComposePreviewStyleFactory<S> {
    /** Имена состояний, которые factory умеет сопоставлять; записи с другими именами пропускаются с предупреждением. */
    public val supportedStates: Set<String>
        get() = DEFAULT_SUPPORTED_STATES

    /** Неизвестные и несовместимые properties должны оставлять builder defaults. */
    @Composable
    public fun create(component: PreviewComponent, theme: PreparedComposeTheme): S
}

/** Имена интерактивных состояний UIKit по умолчанию. */
public val DEFAULT_SUPPORTED_STATES: Set<String> = setOf("pressed", "hovered", "focused", "activated", "selected")
