package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FeedbackCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FeedbackCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.628 13.114 c 0.17 0.51 -0.283 1.01 -0.813 0.897 l -2.46 -0.526 C 9.866 14.211 8.133 14.43 6.477 14.1 c -1.656 -0.33 -3.121 -1.184 -4.124 -2.406 c -1.002 -1.222 -1.474 -2.727 -1.327 -4.236 c 0.148 -1.51 0.903 -2.919 2.127 -3.968 c 1.224 -1.048 2.833 -1.664 4.528 -1.734 c 1.695 -0.069 3.36 0.414 4.686 1.36 c 1.325 0.944 2.222 2.287 2.522 3.777 c 0.3 1.491 -0.015 3.028 -0.89 4.327 l 0.63 1.894 Z M 4.432 5.366 c 0.089 -0.058 0.192 -0.073 0.295 -0.073 c 0.207 0.0 0.413 0.103 0.531 0.308 c 0.236 0.424 0.944 0.424 1.194 -0.015 c 0.162 -0.278 0.531 -0.38 0.826 -0.22 c 0.28 0.161 0.383 0.527 0.221 0.82 C 7.16 6.77 6.541 7.123 5.848 7.123 c -0.678 0.0 -1.312 -0.366 -1.637 -0.952 C 4.05 5.893 4.152 5.527 4.432 5.366 Z m 7.136 0.012 c -0.295 -0.161 -0.664 -0.059 -0.826 0.22 c -0.25 0.438 -0.958 0.438 -1.18 0.0 C 9.444 5.392 9.238 5.29 9.032 5.29 c -0.104 0.0 -0.207 0.015 -0.295 0.073 C 8.442 5.54 8.339 5.89 8.5 6.183 c 0.324 0.585 0.958 0.951 1.636 0.951 c 0.693 0.0 1.313 -0.351 1.652 -0.937 c 0.162 -0.292 0.059 -0.658 -0.221 -0.82 Z m -6.104 5.26 c -0.044 0.235 0.148 0.454 0.398 0.454 h 4.276 c 0.25 0.0 0.442 -0.234 0.398 -0.453 C 10.315 9.453 9.268 8.546 8.0 8.546 s -2.315 0.907 -2.536 2.093 Z")
        )
    }.build()
}
