package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Icon
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
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                contentDescription = "",
            )
        },
        loaderType = LoaderType.Progress,
    )
}
