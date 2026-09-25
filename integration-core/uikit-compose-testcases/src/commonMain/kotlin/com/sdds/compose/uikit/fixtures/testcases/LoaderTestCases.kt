package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Loader
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderType
import com.sdds.icons.compose.Close16
import com.sdds.icons.compose.SddsIcons

/**
 * Preview для меню песочницы
 */
@Composable
fun LoaderForSandbox(style: LoaderStyle) {
    Loader(
        style = style,
        progress = 0.5f,
        trackEnabled = true,
        loaderType = LoaderType.Spinner,
    )
}

/**
 * PLASMA-T2213
 */
@Composable
fun LoaderProgress(style: LoaderStyle) {
    Loader(
        style = style,
        progress = 0.5f,
        trackEnabled = true,
        loaderType = LoaderType.Progress,
    )
}

/**
 * Loader with icon
 */
@Composable
fun LoaderProgressWithIcon(style: LoaderStyle) {
    Loader(
        style = style,
        progress = 0.5f,
        trackEnabled = true,
        valueContent = {
            Icon(
                painter = rememberVectorPainter(SddsIcons.Close16),
                contentDescription = "",
            )
        },
        loaderType = LoaderType.Progress,
    )
}
