package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Loader
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderType

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
