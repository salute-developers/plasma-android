package com.sdds.preview.compose

import androidx.compose.runtime.Composable
import com.sdds.preview.contract.PreviewComponent

/** Собирает UIKit style из effective component properties и подготовленной темы. */
public fun interface ComposePreviewStyleFactory<S> {
    /** Неизвестные и несовместимые properties должны оставлять builder defaults. */
    @Composable
    public fun create(component: PreviewComponent, theme: PreparedComposeTheme): S
}
