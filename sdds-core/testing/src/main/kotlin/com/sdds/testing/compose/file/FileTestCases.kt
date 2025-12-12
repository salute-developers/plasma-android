package com.sdds.testing.compose.file

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ProgressBar
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [File]
 */

/**
 * PLASMA-T2444
 */
@Composable
fun FileCircularProgressIsLoadingStart(style: FileStyle) {
    File(
        style = style,
        isLoading = true,
        label = "image.jpg",
        description = "1.2MB",
        image = null,
        actionPlacement = FileActionPlacement.Start,
        progress = {
            CircularProgressBar(
                progress = 0.5f,
                valueContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
            )
        },
    )
}

/**
 * PLASMA-T2445
 */
@Composable
fun FileLinearProgressIsLoadingHasImageEnd(style: FileStyle) {
    File(
        style = style,
        isLoading = true,
        label = "image.jpg",
        description = "1.2MB",
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_36),
                contentDescription = "",
            )
        },
        actionPlacement = FileActionPlacement.End,
        progress = {
            ProgressBar(
                progress = 0.5f,
            )
        },
        action = {
            IconButton(
                iconRes = R.drawable.ic_close_36,
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2446
 */
@Composable
fun FileCircularProgressHasImageEnd(style: FileStyle) {
    File(
        style = style,
        isLoading = false,
        label = "",
        description = "1.2MB",
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_36),
                contentDescription = "",
            )
        },
        actionPlacement = FileActionPlacement.End,
        progress = {
            CircularProgressBar(
                progress = 0.5f,
                valueContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
            )
        },
        action = {
            IconButton(
                iconRes = R.drawable.ic_close_36,
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2447
 */
@Composable
fun FileLinearProgressIsLoadingStart(style: FileStyle) {
    File(
        style = style,
        isLoading = true,
        label = "image.jpg",
        description = "1.2MB",
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_36),
                contentDescription = "",
            )
        },
        actionPlacement = FileActionPlacement.Start,
        progress = {
            ProgressBar(
                progress = 0.5f,
            )
        },
        action = {
            IconButton(
                iconRes = R.drawable.ic_close_36,
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2448
 */
@Composable
fun FileCircularProgressIsLoadingEndLongText(style: FileStyle) {
    File(
        style = style,
        isLoading = true,
        label = "Lorem Ipsum is simply dummy text of the printing and typesetting",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting",
        image = null,
        actionPlacement = FileActionPlacement.End,
        progress = {
            CircularProgressBar(
                progress = 0.5f,
                valueContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
            )
        },
    )
}

/**
 * PLASMA-T2449
 */
@Composable
fun FileCircularProgressIsLoadingHasImageNoDesc(style: FileStyle) {
    File(
        style = style,
        isLoading = true,
        label = "image.jpg",
        description = "",
        image = {
            Icon(
                painterResource(R.drawable.ic_file_check_fill_36),
                contentDescription = "",
            )
        },
        actionPlacement = FileActionPlacement.End,
        progress = {
            CircularProgressBar(
                progress = 0.5f,
                valueContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close_16),
                        contentDescription = "",
                    )
                },
            )
        },
    )
}
