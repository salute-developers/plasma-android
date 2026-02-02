package com.sdds.compose.uikit.fixtures.samples.loader

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Loader
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderType
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Loader_Simple() {
    composableCodeSnippet {
        Loader(
            progress = 0.4f,
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
}

@Composable
@DocSample(needScreenshot = true)
fun LoaderSpinner_Simple() {
    composableCodeSnippet {
        Loader(
            progress = 0.4f,
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
}

@Composable
@DocSample(needScreenshot = false)
fun Loader_Style() {
    composableCodeSnippet {
        LoaderStyle.builder()
            .spinnerStyle(placeholder(SpinnerStyle.builder().style(), "/** Стиль комопнента */"))
            .circularProgressStyle(placeholder(CircularProgressBarStyle.builder().style(), "/** Стиль комопнента */"))
            .style()
    }
}
